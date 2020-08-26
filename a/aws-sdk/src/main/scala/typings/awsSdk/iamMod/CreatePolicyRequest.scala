package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePolicyRequest extends js.Object {
  /**
    * A friendly description of the policy. Typically used to store information about the permissions defined in the policy. For example, "Grants access to production DynamoDB tables." The policy description is immutable. After a value is assigned, it cannot be changed.
    */
  var Description: js.UndefOr[policyDescriptionType] = js.native
  /**
    * The path for the policy. For more information about paths, see IAM Identifiers in the IAM User Guide. This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
    */
  var Path: js.UndefOr[policyPathType] = js.native
  /**
    * The JSON policy document that you want to use as the content for the new policy. You must provide policies in JSON format in IAM. However, for AWS CloudFormation templates formatted in YAML, you can provide the policy in JSON or YAML format. AWS CloudFormation always converts a YAML policy to JSON format before submitting it to IAM. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
    */
  var PolicyDocument: policyDocumentType = js.native
  /**
    * The friendly name of the policy. IAM user, group, role, and policy names must be unique within the account. Names are not distinguished by case. For example, you cannot create resources named both "MyResource" and "myresource".
    */
  var PolicyName: policyNameType = js.native
}

object CreatePolicyRequest {
  @scala.inline
  def apply(PolicyDocument: policyDocumentType, PolicyName: policyNameType): CreatePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyDocument = PolicyDocument.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePolicyRequest]
  }
  @scala.inline
  implicit class CreatePolicyRequestOps[Self <: CreatePolicyRequest] (val x: Self) extends AnyVal {
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
    def setPolicyDocument(value: policyDocumentType): Self = this.set("PolicyDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyName(value: policyNameType): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: policyDescriptionType): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setPath(value: policyPathType): Self = this.set("Path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
  }
  
}

