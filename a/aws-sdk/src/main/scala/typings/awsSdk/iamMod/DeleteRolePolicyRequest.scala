package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRolePolicyRequest extends StObject {
  
  /**
    * The name of the inline policy to delete from the specified IAM role. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var PolicyName: policyNameType = js.native
  
  /**
    * The name (friendly name, not ARN) identifying the role that the policy is embedded in. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var RoleName: roleNameType = js.native
}
object DeleteRolePolicyRequest {
  
  @scala.inline
  def apply(PolicyName: policyNameType, RoleName: roleNameType): DeleteRolePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName.asInstanceOf[js.Any], RoleName = RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRolePolicyRequest]
  }
  
  @scala.inline
  implicit class DeleteRolePolicyRequestMutableBuilder[Self <: DeleteRolePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyName(value: policyNameType): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleName(value: roleNameType): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
  }
}
