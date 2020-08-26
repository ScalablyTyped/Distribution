package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepStatus extends js.Object {
  /**
    * The details for the step failure including reason, message, and log file path where the root cause was identified.
    */
  var FailureDetails: js.UndefOr[typings.awsSdk.emrMod.FailureDetails] = js.native
  /**
    * The execution state of the cluster step.
    */
  var State: js.UndefOr[StepState] = js.native
  /**
    * The reason for the step execution status change.
    */
  var StateChangeReason: js.UndefOr[StepStateChangeReason] = js.native
  /**
    * The timeline of the cluster step status over time.
    */
  var Timeline: js.UndefOr[StepTimeline] = js.native
}

object StepStatus {
  @scala.inline
  def apply(): StepStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepStatus]
  }
  @scala.inline
  implicit class StepStatusOps[Self <: StepStatus] (val x: Self) extends AnyVal {
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
    def setFailureDetails(value: FailureDetails): Self = this.set("FailureDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureDetails: Self = this.set("FailureDetails", js.undefined)
    @scala.inline
    def setState(value: StepState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setStateChangeReason(value: StepStateChangeReason): Self = this.set("StateChangeReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateChangeReason: Self = this.set("StateChangeReason", js.undefined)
    @scala.inline
    def setTimeline(value: StepTimeline): Self = this.set("Timeline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeline: Self = this.set("Timeline", js.undefined)
  }
  
}

