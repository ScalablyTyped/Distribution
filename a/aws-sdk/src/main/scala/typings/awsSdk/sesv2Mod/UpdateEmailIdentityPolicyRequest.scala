package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEmailIdentityPolicyRequest extends StObject {
  
  /**
    * The email identity for which you want to update policy.
    */
  var EmailIdentity: Identity = js.native
  
  /**
    * The text of the policy in JSON format. The policy cannot exceed 4 KB.  For information about the syntax of sending authorization policies, see the Amazon SES Developer Guide.
    */
  var Policy: typings.awsSdk.sesv2Mod.Policy = js.native
  
  /**
    * The name of the policy. The policy name cannot exceed 64 characters and can only include alphanumeric characters, dashes, and underscores.
    */
  var PolicyName: typings.awsSdk.sesv2Mod.PolicyName = js.native
}
object UpdateEmailIdentityPolicyRequest {
  
  @scala.inline
  def apply(EmailIdentity: Identity, Policy: Policy, PolicyName: PolicyName): UpdateEmailIdentityPolicyRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEmailIdentityPolicyRequest]
  }
  
  @scala.inline
  implicit class UpdateEmailIdentityPolicyRequestMutableBuilder[Self <: UpdateEmailIdentityPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailIdentity(value: Identity): Self = StObject.set(x, "EmailIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
  }
}
