package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanaryStatus extends js.Object {
  /**
    * The current state of the canary.
    */
  var State: js.UndefOr[CanaryState] = js.native
  /**
    * If the canary has insufficient permissions to run, this field provides more details.
    */
  var StateReason: js.UndefOr[String] = js.native
  /**
    * If the canary cannot run or has failed, this field displays the reason.
    */
  var StateReasonCode: js.UndefOr[CanaryStateReasonCode] = js.native
}

object CanaryStatus {
  @scala.inline
  def apply(
    State: CanaryState = null,
    StateReason: String = null,
    StateReasonCode: CanaryStateReasonCode = null
  ): CanaryStatus = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateReason != null) __obj.updateDynamic("StateReason")(StateReason.asInstanceOf[js.Any])
    if (StateReasonCode != null) __obj.updateDynamic("StateReasonCode")(StateReasonCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanaryStatus]
  }
}

