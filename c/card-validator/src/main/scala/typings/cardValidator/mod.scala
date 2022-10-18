package typings.cardValidator

import typings.cardValidator.distExpirationDateMod.ExpirationDateVerification
import typings.cardValidator.distExpirationMonthMod.ExpirationMonthVerification
import typings.cardValidator.distExpirationYearMod.ExpirationYearVerification
import typings.cardValidator.distPostalCodeMod.PostalCodeOptions
import typings.cardValidator.distTypesMod.Verification
import typings.creditCardType.distTypesMod.CreditCardType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("card-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("card-validator", "cardholderName")
  @js.native
  def cardholderName: js.Function1[/* value */ String | Any, Verification] = js.native
  inline def cardholderName(value: String): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("cardholderName")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
  inline def cardholderName(value: Any): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("cardholderName")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
  inline def cardholderName_=(x: js.Function1[/* value */ String | Any, Verification]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardholderName")(x.asInstanceOf[js.Any])
  
  @JSImport("card-validator", "creditCardType")
  @js.native
  def creditCardType: js.Function1[/* cardNumber */ String, js.Array[CreditCardType]] = js.native
  inline def creditCardType(cardNumber: String): js.Array[CreditCardType] = ^.asInstanceOf[js.Dynamic].applyDynamic("creditCardType")(cardNumber.asInstanceOf[js.Any]).asInstanceOf[js.Array[CreditCardType]]
  inline def creditCardType_=(x: js.Function1[/* cardNumber */ String, js.Array[CreditCardType]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("creditCardType")(x.asInstanceOf[js.Any])
  
  @JSImport("card-validator", "cvv")
  @js.native
  def cvv: js.Function2[
    /* value */ String | Any, 
    /* maxLength */ js.UndefOr[Double | js.Array[Double]], 
    Verification
  ] = js.native
  inline def cvv(value: String): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
  inline def cvv(value: String, maxLength: js.Array[Double]): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Verification]
  inline def cvv(value: String, maxLength: Double): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Verification]
  inline def cvv(value: Any): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
  inline def cvv(value: Any, maxLength: js.Array[Double]): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Verification]
  inline def cvv(value: Any, maxLength: Double): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Verification]
  inline def cvv_=(
    x: js.Function2[
      /* value */ String | Any, 
      /* maxLength */ js.UndefOr[Double | js.Array[Double]], 
      Verification
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cvv")(x.asInstanceOf[js.Any])
  
  @JSImport("card-validator", "expirationDate")
  @js.native
  def expirationDate: js.Function2[
    /* value */ String | (Record[String, String | Double]) | Any, 
    /* maxElapsedYear */ js.UndefOr[Double], 
    ExpirationDateVerification
  ] = js.native
  inline def expirationDate(value: String): ExpirationDateVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationDateVerification]
  inline def expirationDate(value: String, maxElapsedYear: Double): ExpirationDateVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationDateVerification]
  inline def expirationDate(value: Any): ExpirationDateVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationDateVerification]
  inline def expirationDate(value: Any, maxElapsedYear: Double): ExpirationDateVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationDateVerification]
  inline def expirationDate(value: Record[String, String | Double]): ExpirationDateVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationDateVerification]
  inline def expirationDate(value: Record[String, String | Double], maxElapsedYear: Double): ExpirationDateVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationDateVerification]
  inline def expirationDate_=(
    x: js.Function2[
      /* value */ String | (Record[String, String | Double]) | Any, 
      /* maxElapsedYear */ js.UndefOr[Double], 
      ExpirationDateVerification
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(x.asInstanceOf[js.Any])
  
  @JSImport("card-validator", "expirationMonth")
  @js.native
  def expirationMonth: js.Function1[/* value */ String | Any, ExpirationMonthVerification] = js.native
  inline def expirationMonth(value: String): ExpirationMonthVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationMonth")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationMonthVerification]
  inline def expirationMonth(value: Any): ExpirationMonthVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationMonth")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationMonthVerification]
  inline def expirationMonth_=(x: js.Function1[/* value */ String | Any, ExpirationMonthVerification]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expirationMonth")(x.asInstanceOf[js.Any])
  
  @JSImport("card-validator", "expirationYear")
  @js.native
  def expirationYear: js.Function2[
    /* value */ String | Any, 
    /* maxElapsedYear */ js.UndefOr[Double], 
    ExpirationYearVerification
  ] = js.native
  inline def expirationYear(value: String): ExpirationYearVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationYear")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationYearVerification]
  inline def expirationYear(value: String, maxElapsedYear: Double): ExpirationYearVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationYear")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationYearVerification]
  inline def expirationYear(value: Any): ExpirationYearVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationYear")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationYearVerification]
  inline def expirationYear(value: Any, maxElapsedYear: Double): ExpirationYearVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationYear")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationYearVerification]
  inline def expirationYear_=(
    x: js.Function2[
      /* value */ String | Any, 
      /* maxElapsedYear */ js.UndefOr[Double], 
      ExpirationYearVerification
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expirationYear")(x.asInstanceOf[js.Any])
  
  @JSImport("card-validator", "number")
  @js.native
  def number: Double = js.native
  inline def number_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
  
  @JSImport("card-validator", "postalCode")
  @js.native
  def postalCode: js.Function2[/* value */ String | Any, /* options */ js.UndefOr[PostalCodeOptions], Verification] = js.native
  inline def postalCode(value: String): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("postalCode")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
  inline def postalCode(value: String, options: PostalCodeOptions): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("postalCode")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Verification]
  inline def postalCode(value: Any): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("postalCode")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
  inline def postalCode(value: Any, options: PostalCodeOptions): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("postalCode")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Verification]
  inline def postalCode_=(
    x: js.Function2[/* value */ String | Any, /* options */ js.UndefOr[PostalCodeOptions], Verification]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(x.asInstanceOf[js.Any])
}
