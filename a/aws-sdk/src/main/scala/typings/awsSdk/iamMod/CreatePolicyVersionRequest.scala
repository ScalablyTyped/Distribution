package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePolicyVersionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM policy to which you want to add a new version. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PolicyArn: arnType = js.native
  /**
    * The JSON policy document that you want to use as the content for this new version of the policy. You must provide policies in JSON format in IAM. However, for AWS CloudFormation templates formatted in YAML, you can provide the policy in JSON or YAML format. AWS CloudFormation always converts a YAML policy to JSON format before submitting it to IAM. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
    */
  var PolicyDocument: policyDocumentType = js.native
  /**
    * Specifies whether to set this version as the policy's default version. When this parameter is true, the new policy version becomes the operative version. That is, it becomes the version that is in effect for the IAM users, groups, and roles that the policy is attached to. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
    */
  var SetAsDefault: js.UndefOr[booleanType] = js.native
}

object CreatePolicyVersionRequest {
  @scala.inline
  def apply(PolicyArn: arnType, PolicyDocument: policyDocumentType): CreatePolicyVersionRequest = {
    val __obj = js.Dynamic.literal(PolicyArn = PolicyArn.asInstanceOf[js.Any], PolicyDocument = PolicyDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePolicyVersionRequest]
  }
  @scala.inline
  implicit class CreatePolicyVersionRequestOps[Self <: CreatePolicyVersionRequest] (val x: Self) extends AnyVal {
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
    def setPolicyArn(value: arnType): Self = this.set("PolicyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyDocument(value: policyDocumentType): Self = this.set("PolicyDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetAsDefault(value: booleanType): Self = this.set("SetAsDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetAsDefault: Self = this.set("SetAsDefault", js.undefined)
  }
  
}

