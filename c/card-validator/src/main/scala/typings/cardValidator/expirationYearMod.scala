package typings.cardValidator

import typings.cardValidator.typesMod.Verification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expirationYearMod {
  
  @JSImport("card-validator/dist/expiration-year", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def expirationYear(value: String): ExpirationYearVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationYear")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationYearVerification]
  @scala.inline
  def expirationYear(value: String, maxElapsedYear: Double): ExpirationYearVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationYear")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationYearVerification]
  @scala.inline
  def expirationYear(value: js.Any): ExpirationYearVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationYear")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationYearVerification]
  @scala.inline
  def expirationYear(value: js.Any, maxElapsedYear: Double): ExpirationYearVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationYear")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationYearVerification]
  
  trait ExpirationYearVerification
    extends StObject
       with Verification {
    
    var isCurrentYear: Boolean
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
