package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachPolicyRequest extends js.Object {
  /**
    * The name of the policy to attach.
    */
  var policyName: PolicyName = js.native
  /**
    * The identity to which the policy is attached.
    */
  var target: PolicyTarget = js.native
}

object AttachPolicyRequest {
  @scala.inline
  def apply(policyName: PolicyName, target: PolicyTarget): AttachPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachPolicyRequest]
  }
  @scala.inline
  implicit class AttachPolicyRequestOps[Self <: AttachPolicyRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setTarget(value: PolicyTarget): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

