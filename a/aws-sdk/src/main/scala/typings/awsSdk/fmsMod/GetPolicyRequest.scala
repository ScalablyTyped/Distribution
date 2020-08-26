package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyRequest extends js.Object {
  /**
    * The ID of the AWS Firewall Manager policy that you want the details for.
    */
  var PolicyId: typings.awsSdk.fmsMod.PolicyId = js.native
}

object GetPolicyRequest {
  @scala.inline
  def apply(PolicyId: PolicyId): GetPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyRequest]
  }
  @scala.inline
  implicit class GetPolicyRequestOps[Self <: GetPolicyRequest] (val x: Self) extends AnyVal {
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
  }
  
}

