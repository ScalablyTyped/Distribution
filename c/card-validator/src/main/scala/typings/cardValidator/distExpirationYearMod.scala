package typings.cardValidator

import typings.cardValidator.distTypesMod.Verification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExpirationYearMod {
  
  @JSImport("card-validator/dist/expiration-year", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expirationYear(value: String): ExpirationYearVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationYear")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationYearVerification]
  inline def expirationYear(value: String, maxElapsedYear: Double): ExpirationYearVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationYear")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationYearVerification]
  inline def expirationYear(value: Any): ExpirationYearVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationYear")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationYearVerification]
  inline def expirationYear(value: Any, maxElapsedYear: Double): ExpirationYearVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationYear")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationYearVerification]
  
  trait ExpirationYearVerification
    extends StObject
       with Verification {
    
    var isCurrentYear: Boolean
  }
  object ExpirationYearVerification {
    
    inline def apply(isCurrentYear: Boolean, isPotentiallyValid: Boolean, isValid: Boolean): ExpirationYearVerification = {
      val __obj = js.Dynamic.literal(isCurrentYear = isCurrentYear.asInstanceOf[js.Any], isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpirationYearVerification]
    }
    
    extension [Self <: ExpirationYearVerification](x: Self) {
      
      inline def setIsCurrentYear(value: Boolean): Self = StObject.set(x, "isCurrentYear", value.asInstanceOf[js.Any])
    }
  }
}
