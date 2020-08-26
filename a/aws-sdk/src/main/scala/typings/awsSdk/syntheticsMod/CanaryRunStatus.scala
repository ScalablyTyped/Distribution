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
  def apply(): CanaryRunStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryRunStatus]
  }
  @scala.inline
  implicit class CanaryRunStatusOps[Self <: CanaryRunStatus] (val x: Self) extends AnyVal {
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
    def setState(value: CanaryRunState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setStateReason(value: String): Self = this.set("StateReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateReason: Self = this.set("StateReason", js.undefined)
    @scala.inline
    def setStateReasonCode(value: CanaryRunStateReasonCode): Self = this.set("StateReasonCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateReasonCode: Self = this.set("StateReasonCode", js.undefined)
  }
  
}

