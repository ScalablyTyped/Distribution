package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanaryRunStatus extends js.Object {
  /**
    * The current state of the run.
    */
  var State: js.UndefOr[CanaryRunState] = js.native
  /**
    * If run of the canary failed, this field contains the reason for the error.
    */
  var StateReason: js.UndefOr[String] = js.native
  /**
    * If this value is CANARY_FAILURE, an exception occurred in the canary code. If this value is EXECUTION_FAILURE, an exception occurred in CloudWatch Synthetics.
    */
  var StateReasonCode: js.UndefOr[CanaryRunStateReasonCode] = js.native
}

object CanaryRunStatus {
  @scala.inline
  def apply(
    State: CanaryRunState = null,
    StateReason: String = null,
    StateReasonCode: CanaryRunStateReasonCode = null
  ): CanaryRunStatus = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateReason != null) __obj.updateDynamic("StateReason")(StateReason.asInstanceOf[js.Any])
    if (StateReasonCode != null) __obj.updateDynamic("StateReasonCode")(StateReasonCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanaryRunStatus]
  }
}

