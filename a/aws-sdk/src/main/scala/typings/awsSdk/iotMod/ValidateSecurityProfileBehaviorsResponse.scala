package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateSecurityProfileBehaviorsResponse extends StObject {
  
  /**
    * True if the behaviors were valid.
    */
  var valid: js.UndefOr[Valid] = js.native
  
  /**
    * The list of any errors found in the behaviors.
    */
  var validationErrors: js.UndefOr[ValidationErrors] = js.native
}
object ValidateSecurityProfileBehaviorsResponse {
  
  @scala.inline
  def apply(): ValidateSecurityProfileBehaviorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateSecurityProfileBehaviorsResponse]
  }
  
  @scala.inline
  implicit class ValidateSecurityProfileBehaviorsResponseMutableBuilder[Self <: ValidateSecurityProfileBehaviorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValid(value: Valid): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    
    @scala.inline
    def setValidationErrors(value: ValidationErrors): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
    
    @scala.inline
    def setValidationErrorsVarargs(value: ValidationError*): Self = StObject.set(x, "validationErrors", js.Array(value :_*))
  }
}
