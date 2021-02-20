package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateResourcePolicyResponse extends StObject {
  
  /**
    * Returns a message stating that your Reource Policy passed validation. 
    */
  var PolicyValidationPassed: js.UndefOr[BooleanType] = js.native
  
  /**
    * Returns an error message if your policy doesn't pass validatation.
    */
  var ValidationErrors: js.UndefOr[ValidationErrorsType] = js.native
}
object ValidateResourcePolicyResponse {
  
  @scala.inline
  def apply(): ValidateResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateResourcePolicyResponse]
  }
  
  @scala.inline
  implicit class ValidateResourcePolicyResponseMutableBuilder[Self <: ValidateResourcePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyValidationPassed(value: BooleanType): Self = StObject.set(x, "PolicyValidationPassed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyValidationPassedUndefined: Self = StObject.set(x, "PolicyValidationPassed", js.undefined)
    
    @scala.inline
    def setValidationErrors(value: ValidationErrorsType): Self = StObject.set(x, "ValidationErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationErrorsUndefined: Self = StObject.set(x, "ValidationErrors", js.undefined)
    
    @scala.inline
    def setValidationErrorsVarargs(value: ValidationErrorsEntry*): Self = StObject.set(x, "ValidationErrors", js.Array(value :_*))
  }
}
