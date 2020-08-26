package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingPolicyStateChangeReason extends js.Object {
  /**
    * The code indicating the reason for the change in status.USER_REQUEST indicates that the scaling policy status was changed by a user. PROVISION_FAILURE indicates that the status change was because the policy failed to provision. CLEANUP_FAILURE indicates an error.
    */
  var Code: js.UndefOr[AutoScalingPolicyStateChangeReasonCode] = js.native
  /**
    * A friendly, more verbose message that accompanies an automatic scaling policy state change.
    */
  var Message: js.UndefOr[String] = js.native
}

object AutoScalingPolicyStateChangeReason {
  @scala.inline
  def apply(): AutoScalingPolicyStateChangeReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingPolicyStateChangeReason]
  }
  @scala.inline
  implicit class AutoScalingPolicyStateChangeReasonOps[Self <: AutoScalingPolicyStateChangeReason] (val x: Self) extends AnyVal {
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
    def setCode(value: AutoScalingPolicyStateChangeReasonCode): Self = this.set("Code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
  
}

