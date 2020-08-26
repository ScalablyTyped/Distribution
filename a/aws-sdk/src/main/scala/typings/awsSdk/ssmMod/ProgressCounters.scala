package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressCounters extends js.Object {
  /**
    * The total number of steps that the system cancelled in all specified AWS Regions and accounts for the current Automation execution.
    */
  var CancelledSteps: js.UndefOr[Integer] = js.native
  /**
    * The total number of steps that failed to run in all specified AWS Regions and accounts for the current Automation execution.
    */
  var FailedSteps: js.UndefOr[Integer] = js.native
  /**
    * The total number of steps that successfully completed in all specified AWS Regions and accounts for the current Automation execution.
    */
  var SuccessSteps: js.UndefOr[Integer] = js.native
  /**
    * The total number of steps that timed out in all specified AWS Regions and accounts for the current Automation execution.
    */
  var TimedOutSteps: js.UndefOr[Integer] = js.native
  /**
    * The total number of steps run in all specified AWS Regions and accounts for the current Automation execution.
    */
  var TotalSteps: js.UndefOr[Integer] = js.native
}

object ProgressCounters {
  @scala.inline
  def apply(): ProgressCounters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressCounters]
  }
  @scala.inline
  implicit class ProgressCountersOps[Self <: ProgressCounters] (val x: Self) extends AnyVal {
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
    def setCancelledSteps(value: Integer): Self = this.set("CancelledSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelledSteps: Self = this.set("CancelledSteps", js.undefined)
    @scala.inline
    def setFailedSteps(value: Integer): Self = this.set("FailedSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedSteps: Self = this.set("FailedSteps", js.undefined)
    @scala.inline
    def setSuccessSteps(value: Integer): Self = this.set("SuccessSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessSteps: Self = this.set("SuccessSteps", js.undefined)
    @scala.inline
    def setTimedOutSteps(value: Integer): Self = this.set("TimedOutSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimedOutSteps: Self = this.set("TimedOutSteps", js.undefined)
    @scala.inline
    def setTotalSteps(value: Integer): Self = this.set("TotalSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalSteps: Self = this.set("TotalSteps", js.undefined)
  }
  
}

