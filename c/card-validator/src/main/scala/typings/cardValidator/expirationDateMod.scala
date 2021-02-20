package typings.cardValidator

import typings.cardValidator.typesMod.Verification
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expirationDateMod {
  
  @JSImport("card-validator/dist/expiration-date", "expirationDate")
  @js.native
  def expirationDate(value: String): ExpirationDateVerification = js.native
  @JSImport("card-validator/dist/expiration-date", "expirationDate")
  @js.native
  def expirationDate(value: String, maxElapsedYear: Double): ExpirationDateVerification = js.native
  @JSImport("card-validator/dist/expiration-date", "expirationDate")
  @js.native
  def expirationDate(value: js.Any): ExpirationDateVerification = js.native
  @JSImport("card-validator/dist/expiration-date", "expirationDate")
  @js.native
  def expirationDate(value: js.Any, maxElapsedYear: Double): ExpirationDateVerification = js.native
  @JSImport("card-validator/dist/expiration-date", "expirationDate")
  @js.native
  def expirationDate(value: Record[String, String | Double]): ExpirationDateVerification = js.native
  @JSImport("card-validator/dist/expiration-date", "expirationDate")
  @js.native
  def expirationDate(value: Record[String, String | Double], maxElapsedYear: Double): ExpirationDateVerification = js.native
  
  @js.native
  trait ExpirationDateVerification extends Verification {
    
    var month: String | Null = js.native
    
    var year: String | Null = js.native
  }
  object ExpirationDateVerification {
    
    @scala.inline
    def apply(isPotentiallyValid: Boolean, isValid: Boolean): ExpirationDateVerification = {
      val __obj = js.Dynamic.literal(isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpirationDateVerification]
    }
    
    @scala.inline
    implicit class ExpirationDateVerificationMutableBuilder[Self <: ExpirationDateVerification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthNull: Self = StObject.set(x, "month", null)
      
      @scala.inline
      def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearNull: Self = StObject.set(x, "year", null)
    }
  }
}
