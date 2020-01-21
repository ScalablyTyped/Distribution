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
  def apply(Code: AutoScalingPolicyStateChangeReasonCode = null, Message: String = null): AutoScalingPolicyStateChangeReason = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingPolicyStateChangeReason]
  }
}

