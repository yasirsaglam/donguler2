import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int t = 0, i = 0;
        Scanner input = new Scanner(System.in);

        while (i % 2 == 0) {
            System.out.print("Sayı giriniz : ");
            i = input.nextInt();
            if (i % 4 == 0) {
                t += i;
            }
        }
        System.out.print("Girilen sayılardan 4'ün katı olan sayıların toplamı : " + t);
    }
}
