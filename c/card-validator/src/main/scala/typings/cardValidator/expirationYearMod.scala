package typings.cardValidator

import typings.cardValidator.typesMod.Verification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expirationYearMod {
  
  @JSImport("card-validator/dist/expiration-year", "expirationYear")
  @js.native
  def expirationYear(value: String): ExpirationYearVerification = js.native
  @JSImport("card-validator/dist/expiration-year", "expirationYear")
  @js.native
  def expirationYear(value: String, maxElapsedYear: Double): ExpirationYearVerification = js.native
  @JSImport("card-validator/dist/expiration-year", "expirationYear")
  @js.native
  def expirationYear(value: js.Any): ExpirationYearVerification = js.native
  @JSImport("card-validator/dist/expiration-year", "expirationYear")
  @js.native
  def expirationYear(value: js.Any, maxElapsedYear: Double): ExpirationYearVerification = js.native
  
  @js.native
  trait ExpirationYearVerification extends Verification {
    
    var isCurrentYear: Boolean = js.native
  }
  object ExpirationYearVerification {
    
    @scala.inline
    def apply(isCurrentYear: Boolean, isPotentiallyValid: Boolean, isValid: Boolean): ExpirationYearVerification = {
      val __obj = js.Dynamic.literal(isCurrentYear = isCurrentYear.asInstanceOf[js.Any], isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpirationYearVerification]
    }
    
    @scala.inline
    implicit class ExpirationYearVerificationMutableBuilder[Self <: ExpirationYearVerification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsCurrentYear(value: Boolean): Self = StObject.set(x, "isCurrentYear", value.asInstanceOf[js.Any])
    }
  }
}
