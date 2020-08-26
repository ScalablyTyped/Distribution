package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelStepsInfo extends js.Object {
  /**
    * The reason for the failure if the CancelSteps request fails.
    */
  var Reason: js.UndefOr[String] = js.native
  /**
    * The status of a CancelSteps Request. The value may be SUBMITTED or FAILED.
    */
  var Status: js.UndefOr[CancelStepsRequestStatus] = js.native
  /**
    * The encrypted StepId of a step.
    */
  var StepId: js.UndefOr[typings.awsSdk.emrMod.StepId] = js.native
}

object CancelStepsInfo {
  @scala.inline
  def apply(): CancelStepsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelStepsInfo]
  }
  @scala.inline
  implicit class CancelStepsInfoOps[Self <: CancelStepsInfo] (val x: Self) extends AnyVal {
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
    def setReason(value: String): Self = this.set("Reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("Reason", js.undefined)
    @scala.inline
    def setStatus(value: CancelStepsRequestStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStepId(value: StepId): Self = this.set("StepId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepId: Self = this.set("StepId", js.undefined)
  }
  
}

