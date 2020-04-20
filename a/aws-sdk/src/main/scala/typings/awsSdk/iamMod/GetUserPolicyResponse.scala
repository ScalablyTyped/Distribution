package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserPolicyResponse extends js.Object {
  /**
    * The policy document. IAM stores policies in JSON format. However, resources that were created using AWS CloudFormation templates can be formatted in YAML. AWS CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.
    */
  var PolicyDocument: policyDocumentType = js.native
  /**
    * The name of the policy.
    */
  var PolicyName: policyNameType = js.native
  /**
    * The user the policy is associated with.
    */
  var UserName: existingUserNameType = js.native
}

object GetUserPolicyResponse {
  @scala.inline
  def apply(PolicyDocument: policyDocumentType, PolicyName: policyNameType, UserName: existingUserNameType): GetUserPolicyResponse = {
    val __obj = js.Dynamic.literal(PolicyDocument = PolicyDocument.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserPolicyResponse]
  }
}

