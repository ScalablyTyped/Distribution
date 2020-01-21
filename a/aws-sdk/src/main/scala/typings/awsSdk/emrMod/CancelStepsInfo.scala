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
  def apply(Reason: String = null, Status: CancelStepsRequestStatus = null, StepId: StepId = null): CancelStepsInfo = {
    val __obj = js.Dynamic.literal()
    if (Reason != null) __obj.updateDynamic("Reason")(Reason.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StepId != null) __obj.updateDynamic("StepId")(StepId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelStepsInfo]
  }
}

