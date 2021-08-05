package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateResourcePolicyResponse extends StObject {
  
  /**
    * Returns a message stating that your Reource Policy passed validation. 
    */
  var PolicyValidationPassed: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * Returns an error message if your policy doesn't pass validatation.
    */
  var ValidationErrors: js.UndefOr[ValidationErrorsType] = js.undefined
}
object ValidateResourcePolicyResponse {
  
  inline def apply(): ValidateResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateResourcePolicyResponse]
  }
  
  extension [Self <: ValidateResourcePolicyResponse](x: Self) {
    
    inline def setPolicyValidationPassed(value: BooleanType): Self = StObject.set(x, "PolicyValidationPassed", value.asInstanceOf[js.Any])
    
    inline def setPolicyValidationPassedUndefined: Self = StObject.set(x, "PolicyValidationPassed", js.undefined)
    
    inline def setValidationErrors(value: ValidationErrorsType): Self = StObject.set(x, "ValidationErrors", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorsUndefined: Self = StObject.set(x, "ValidationErrors", js.undefined)
    
    inline def setValidationErrorsVarargs(value: ValidationErrorsEntry*): Self = StObject.set(x, "ValidationErrors", js.Array(value :_*))
  }
}
