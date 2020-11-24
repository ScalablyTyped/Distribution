package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEmailIdentityPolicyRequest extends js.Object {
  
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
  implicit class UpdateEmailIdentityPolicyRequestOps[Self <: UpdateEmailIdentityPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEmailIdentity(value: Identity): Self = this.set("EmailIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: Policy): Self = this.set("Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
  }
}
