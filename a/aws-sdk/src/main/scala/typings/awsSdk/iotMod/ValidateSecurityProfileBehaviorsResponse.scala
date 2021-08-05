package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateSecurityProfileBehaviorsResponse extends StObject {
  
  /**
    * True if the behaviors were valid.
    */
  var valid: js.UndefOr[Valid] = js.undefined
  
  /**
    * The list of any errors found in the behaviors.
    */
  var validationErrors: js.UndefOr[ValidationErrors] = js.undefined
}
object ValidateSecurityProfileBehaviorsResponse {
  
  inline def apply(): ValidateSecurityProfileBehaviorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateSecurityProfileBehaviorsResponse]
  }
  
  extension [Self <: ValidateSecurityProfileBehaviorsResponse](x: Self) {
    
    inline def setValid(value: Valid): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    
    inline def setValidationErrors(value: ValidationErrors): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
    
    inline def setValidationErrorsVarargs(value: ValidationError*): Self = StObject.set(x, "validationErrors", js.Array(value :_*))
  }
}
