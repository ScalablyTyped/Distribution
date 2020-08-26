package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePolicyRequest extends js.Object {
  /**
    * The name of the policy to delete.
    */
  var policyName: PolicyName = js.native
}

object DeletePolicyRequest {
  @scala.inline
  def apply(policyName: PolicyName): DeletePolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePolicyRequest]
  }
  @scala.inline
  implicit class DeletePolicyRequestOps[Self <: DeletePolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPolicyName(value: PolicyName): Self = this.set("policyName", value.asInstanceOf[js.Any])
  }
  
}

