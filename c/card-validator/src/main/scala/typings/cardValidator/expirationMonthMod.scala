package typings.cardValidator

import typings.cardValidator.typesMod.Verification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expirationMonthMod {
  
  @JSImport("card-validator/dist/expiration-month", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def expirationMonth(value: String): ExpirationMonthVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationMonth")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationMonthVerification]
  @scala.inline
  def expirationMonth(value: js.Any): ExpirationMonthVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationMonth")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationMonthVerification]
  
  trait ExpirationMonthVerification
    extends StObject
       with Verification {
    
    var isValidForThisYear: Boolean
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
