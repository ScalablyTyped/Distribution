package typings.cardValidator

import typings.cardValidator.typesMod.Verification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expirationMonthMod {
  
  @JSImport("card-validator/dist/expiration-month", "expirationMonth")
  @js.native
  def expirationMonth(value: String): ExpirationMonthVerification = js.native
  @JSImport("card-validator/dist/expiration-month", "expirationMonth")
  @js.native
  def expirationMonth(value: js.Any): ExpirationMonthVerification = js.native
  
  @js.native
  trait ExpirationMonthVerification extends Verification {
    
    var isValidForThisYear: Boolean = js.native
  }
  object ExpirationMonthVerification {
    
    @scala.inline
    def apply(isPotentiallyValid: Boolean, isValid: Boolean, isValidForThisYear: Boolean): ExpirationMonthVerification = {
      val __obj = js.Dynamic.literal(isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], isValidForThisYear = isValidForThisYear.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpirationMonthVerification]
    }
    
    @scala.inline
    implicit class ExpirationMonthVerificationMutableBuilder[Self <: ExpirationMonthVerification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsValidForThisYear(value: Boolean): Self = StObject.set(x, "isValidForThisYear", value.asInstanceOf[js.Any])
    }
  }
}
