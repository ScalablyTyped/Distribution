package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPermissionPolicyResponse extends js.Object {
  /**
    * The IAM policy attached to the specified RuleGroup.
    */
  var Policy: js.UndefOr[PolicyString] = js.native
}

object GetPermissionPolicyResponse {
  @scala.inline
  def apply(): GetPermissionPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPermissionPolicyResponse]
  }
  @scala.inline
  implicit class GetPermissionPolicyResponseOps[Self <: GetPermissionPolicyResponse] (val x: Self) extends AnyVal {
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
    def setPolicy(value: PolicyString): Self = this.set("Policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("Policy", js.undefined)
  }
  
}

