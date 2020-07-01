package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePolicyRequest extends js.Object {
  /**
    * The policy text content to add to the new policy. The text that you supply must adhere to the rules of the policy type you specify in the Type parameter.
    */
  var Content: PolicyContent = js.native
  /**
    * An optional description to assign to the policy.
    */
  var Description: PolicyDescription = js.native
  /**
    * The friendly name to assign to the policy. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: PolicyName = js.native
  /**
    * The type of policy to create. You can specify one of the following values:    BACKUP_POLICY     SERVICE_CONTROL_POLICY     TAG_POLICY   
    */
  var Type: PolicyType = js.native
}

object CreatePolicyRequest {
  @scala.inline
  def apply(Content: PolicyContent, Description: PolicyDescription, Name: PolicyName, Type: PolicyType): CreatePolicyRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePolicyRequest]
  }
}

