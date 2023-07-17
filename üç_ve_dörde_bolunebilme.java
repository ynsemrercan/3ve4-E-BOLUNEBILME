import java.util.Scanner;

public class üç_ve_dörde_bolunebilme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = input.nextInt();

        int count = 0;
        int sum = 0;


        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        if (count > 0) {
             int average = sum / count;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + average);
        } else {
            System.out.println("3 ve 4'e tam bölünen bir sayı bulunamadı.");
        }
    }
}
















