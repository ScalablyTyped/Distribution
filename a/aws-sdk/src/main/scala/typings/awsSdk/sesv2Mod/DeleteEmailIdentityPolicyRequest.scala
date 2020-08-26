package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEmailIdentityPolicyRequest extends js.Object {
  /**
    * The email identity for which you want to delete a policy.
    */
  var EmailIdentity: Identity = js.native
  /**
    * The name of the policy. The policy name cannot exceed 64 characters and can only include alphanumeric characters, dashes, and underscores.
    */
  var PolicyName: typings.awsSdk.sesv2Mod.PolicyName = js.native
}

object DeleteEmailIdentityPolicyRequest {
  @scala.inline
  def apply(EmailIdentity: Identity, PolicyName: PolicyName): DeleteEmailIdentityPolicyRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEmailIdentityPolicyRequest]
  }
  @scala.inline
  implicit class DeleteEmailIdentityPolicyRequestOps[Self <: DeleteEmailIdentityPolicyRequest] (val x: Self) extends AnyVal {
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
    def setPolicyName(value: PolicyName): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
  }
  
}

