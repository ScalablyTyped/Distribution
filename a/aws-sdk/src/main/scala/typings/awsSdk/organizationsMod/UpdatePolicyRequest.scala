package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePolicyRequest extends js.Object {
  /**
    * If provided, the new content for the policy. The text must be correctly formatted JSON that complies with the syntax for the policy's type. For more information, see Service Control Policy Syntax in the AWS Organizations User Guide. 
    */
  var Content: js.UndefOr[PolicyContent] = js.native
  /**
    * If provided, the new description for the policy.
    */
  var Description: js.UndefOr[PolicyDescription] = js.native
  /**
    * If provided, the new name for the policy. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: js.UndefOr[PolicyName] = js.native
  /**
    * The unique identifier (ID) of the policy that you want to update. The regex pattern for a policy ID string requires "p-" followed by from 8 to 128 lowercase or uppercase letters, digits, or the underscore character (_).
    */
  var PolicyId: typings.awsSdk.organizationsMod.PolicyId = js.native
}

object UpdatePolicyRequest {
  @scala.inline
  def apply(PolicyId: PolicyId): UpdatePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePolicyRequest]
  }
  @scala.inline
  implicit class UpdatePolicyRequestOps[Self <: UpdatePolicyRequest] (val x: Self) extends AnyVal {
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
    def setPolicyId(value: PolicyId): Self = this.set("PolicyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: PolicyContent): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("Content", js.undefined)
    @scala.inline
    def setDescription(value: PolicyDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setName(value: PolicyName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

