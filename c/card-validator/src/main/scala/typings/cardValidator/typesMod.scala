package typings.cardValidator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait Verification extends StObject {
    
    var isPotentiallyValid: Boolean
    
    var isValid: Boolean
  }
  object Verification {
    
    @scala.inline
    def apply(isPotentiallyValid: Boolean, isValid: Boolean): Verification = {
      val __obj = js.Dynamic.literal(isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Verification]
    }
    
    @scala.inline
    implicit class VerificationMutableBuilder[Self <: Verification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsPotentiallyValid(value: Boolean): Self = StObject.set(x, "isPotentiallyValid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    }
  }
}
