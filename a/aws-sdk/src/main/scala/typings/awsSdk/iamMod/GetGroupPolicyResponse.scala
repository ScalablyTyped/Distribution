package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupPolicyResponse extends js.Object {
  /**
    * The group the policy is associated with.
    */
  var GroupName: groupNameType = js.native
  /**
    * The policy document. IAM stores policies in JSON format. However, resources that were created using AWS CloudFormation templates can be formatted in YAML. AWS CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.
    */
  var PolicyDocument: policyDocumentType = js.native
  /**
    * The name of the policy.
    */
  var PolicyName: policyNameType = js.native
}

object GetGroupPolicyResponse {
  @scala.inline
  def apply(GroupName: groupNameType, PolicyDocument: policyDocumentType, PolicyName: policyNameType): GetGroupPolicyResponse = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], PolicyDocument = PolicyDocument.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupPolicyResponse]
  }
  @scala.inline
  implicit class GetGroupPolicyResponseOps[Self <: GetGroupPolicyResponse] (val x: Self) extends AnyVal {
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
    def setGroupName(value: groupNameType): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyDocument(value: policyDocumentType): Self = this.set("PolicyDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyName(value: policyNameType): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
  }
  
}

