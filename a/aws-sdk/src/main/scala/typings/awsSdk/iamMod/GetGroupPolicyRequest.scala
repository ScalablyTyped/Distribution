package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupPolicyRequest extends js.Object {
  /**
    * The name of the group the policy is associated with. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var GroupName: groupNameType = js.native
  /**
    * The name of the policy document to get. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var PolicyName: policyNameType = js.native
}

object GetGroupPolicyRequest {
  @scala.inline
  def apply(GroupName: groupNameType, PolicyName: policyNameType): GetGroupPolicyRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetGroupPolicyRequest]
  }
}

