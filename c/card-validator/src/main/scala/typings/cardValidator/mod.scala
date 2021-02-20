package typings.cardValidator

import typings.cardValidator.expirationDateMod.ExpirationDateVerification
import typings.cardValidator.expirationMonthMod.ExpirationMonthVerification
import typings.cardValidator.expirationYearMod.ExpirationYearVerification
import typings.cardValidator.postalCodeMod.PostalCodeOptions
import typings.cardValidator.typesMod.Verification
import typings.creditCardType.typesMod.CreditCardType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("card-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("card-validator", "cardholderName")
  @js.native
  def cardholderName: js.Function1[/* value */ String | js.Any, Verification] = js.native
  @JSImport("card-validator", "cardholderName")
  @js.native
  def cardholderName(value: String): Verification = js.native
  @JSImport("card-validator", "cardholderName")
  @js.native
  def cardholderName(value: js.Any): Verification = js.native
  @scala.inline
  def cardholderName_=(x: js.Function1[/* value */ String | js.Any, Verification]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardholderName")(x.asInstanceOf[js.Any])
  
  @JSImport("card-validator", "creditCardType")
  @js.native
  def creditCardType: js.Function1[/* cardNumber */ String, js.Array[CreditCardType]] = js.native
  @JSImport("card-validator", "creditCardType")
  @js.native
  def creditCardType(cardNumber: String): js.Array[CreditCardType] = js.native
  @scala.inline
  def creditCardType_=(x: js.Function1[/* cardNumber */ String, js.Array[CreditCardType]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("creditCardType")(x.asInstanceOf[js.Any])
  
  @JSImport("card-validator", "cvv")
  @js.native
  def cvv: js.Function2[
    /* value */ String | js.Any, 
    /* maxLength */ js.UndefOr[Double | js.Array[Double]], 
    Verification
  ] = js.native
  @JSImport("card-validator", "cvv")
  @js.native
  def cvv(value: String): Verification = js.native
  @JSImport("card-validator", "cvv")
  @js.native
  def cvv(value: String, maxLength: js.Array[Double]): Verification = js.native
  @JSImport("card-validator", "cvv")
  @js.native
  def cvv(value: String, maxLength: Double): Verification = js.native
  @JSImport("card-validator", "cvv")
  @js.native
  def cvv(value: js.Any): Verification = js.native
  @JSImport("card-validator", "cvv")
  @js.native
  def cvv(value: js.Any, maxLength: js.Array[Double]): Verification = js.native
  @JSImport("card-validator", "cvv")
  @js.native
  def cvv(value: js.Any, maxLength: Double): Verification = js.native
  @scala.inline
  def cvv_=(
    x: js.Function2[
      /* value */ String | js.Any, 
      /* maxLength */ js.UndefOr[Double | js.Array[Double]], 
      Verification
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cvv")(x.asInstanceOf[js.Any])
  
  @JSImport("card-validator", "expirationDate")
  @js.native
  def expirationDate: js.Function2[
    /* value */ String | (Record[String, String | Double]) | js.Any, 
    /* maxElapsedYear */ js.UndefOr[Double], 
    ExpirationDateVerification
  ] = js.native
  @JSImport("card-validator", "expirationDate")
  @js.native
  def expirationDate(value: String): ExpirationDateVerification = js.native
  @JSImport("card-validator", "expirationDate")
  @js.native
  def expirationDate(value: String, maxElapsedYear: Double): ExpirationDateVerification = js.native
  @JSImport("card-validator", "expirationDate")
  @js.native
  def expirationDate(value: js.Any): ExpirationDateVerification = js.native
  @JSImport("card-validator", "expirationDate")
  @js.native
  def expirationDate(value: js.Any, maxElapsedYear: Double): ExpirationDateVerification = js.native
  @JSImport("card-validator", "expirationDate")
  @js.native
  def expirationDate(value: Record[String, String | Double]): ExpirationDateVerification = js.native
  @JSImport("card-validator", "expirationDate")
  @js.native
  def expirationDate(value: Record[String, String | Double], maxElapsedYear: Double): ExpirationDateVerification = js.native
  @scala.inline
  def expirationDate_=(
    x: js.Function2[
      /* value */ String | (Record[String, String | Double]) | js.Any, 
      /* maxElapsedYear */ js.UndefOr[Double], 
      ExpirationDateVerification
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(x.asInstanceOf[js.Any])
  
  @JSImport("card-validator", "expirationMonth")
  @js.native
  def expirationMonth: js.Function1[/* value */ String | js.Any, ExpirationMonthVerification] = js.native
  @JSImport("card-validator", "expirationMonth")
  @js.native
  def expirationMonth(value: String): ExpirationMonthVerification = js.native
  @JSImport("card-validator", "expirationMonth")
  @js.native
  def expirationMonth(value: js.Any): ExpirationMonthVerification = js.native
  @scala.inline
  def expirationMonth_=(x: js.Function1[/* value */ String | js.Any, ExpirationMonthVerification]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expirationMonth")(x.asInstanceOf[js.Any])
  
  @JSImport("card-validator", "expirationYear")
  @js.native
  def expirationYear: js.Function2[
    /* value */ String | js.Any, 
    /* maxElapsedYear */ js.UndefOr[Double], 
    ExpirationYearVerification
  ] = js.native
  @JSImport("card-validator", "expirationYear")
  @js.native
  def expirationYear(value: String): ExpirationYearVerification = js.native
  @JSImport("card-validator", "expirationYear")
  @js.native
  def expirationYear(value: String, maxElapsedYear: Double): ExpirationYearVerification = js.native
  @JSImport("card-validator", "expirationYear")
  @js.native
  def expirationYear(value: js.Any): ExpirationYearVerification = js.native
  @JSImport("card-validator", "expirationYear")
  @js.native
  def expirationYear(value: js.Any, maxElapsedYear: Double): ExpirationYearVerification = js.native
  @scala.inline
  def expirationYear_=(
    x: js.Function2[
      /* value */ String | js.Any, 
      /* maxElapsedYear */ js.UndefOr[Double], 
      ExpirationYearVerification
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expirationYear")(x.asInstanceOf[js.Any])
  
  @JSImport("card-validator", "number")
  @js.native
  def number: Double = js.native
  @scala.inline
  def number_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
  
  @JSImport("card-validator", "postalCode")
  @js.native
  def postalCode: js.Function2[
    /* value */ String | js.Any, 
    /* options */ js.UndefOr[PostalCodeOptions], 
    Verification
  ] = js.native
  @JSImport("card-validator", "postalCode")
  @js.native
  def postalCode(value: String): Verification = js.native
  @JSImport("card-validator", "postalCode")
  @js.native
  def postalCode(value: String, options: PostalCodeOptions): Verification = js.native
  @JSImport("card-validator", "postalCode")
  @js.native
  def postalCode(value: js.Any): Verification = js.native
  @JSImport("card-validator", "postalCode")
  @js.native
  def postalCode(value: js.Any, options: PostalCodeOptions): Verification = js.native
  @scala.inline
  def postalCode_=(
    x: js.Function2[
      /* value */ String | js.Any, 
      /* options */ js.UndefOr[PostalCodeOptions], 
      Verification
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(x.asInstanceOf[js.Any])
}
