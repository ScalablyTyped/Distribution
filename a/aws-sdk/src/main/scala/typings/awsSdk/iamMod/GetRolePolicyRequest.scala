package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRolePolicyRequest extends js.Object {
  /**
    * The name of the policy document to get. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var PolicyName: policyNameType = js.native
  /**
    * The name of the role associated with the policy. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var RoleName: roleNameType = js.native
}

object GetRolePolicyRequest {
  @scala.inline
  def apply(PolicyName: policyNameType, RoleName: roleNameType): GetRolePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName.asInstanceOf[js.Any], RoleName = RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRolePolicyRequest]
  }
  @scala.inline
  implicit class GetRolePolicyRequestOps[Self <: GetRolePolicyRequest] (val x: Self) extends AnyVal {
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
    def setPolicyName(value: policyNameType): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleName(value: roleNameType): Self = this.set("RoleName", value.asInstanceOf[js.Any])
  }
  
}

