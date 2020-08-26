package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelStepsInput extends js.Object {
  /**
    * The ClusterID for which specified steps will be canceled. Use RunJobFlow and ListClusters to get ClusterIDs. 
    */
  var ClusterId: XmlStringMaxLen256 = js.native
  /**
    * The option to choose for cancelling RUNNING steps. By default, the value is SEND_INTERRUPT.
    */
  var StepCancellationOption: js.UndefOr[typings.awsSdk.emrMod.StepCancellationOption] = js.native
  /**
    * The list of StepIDs to cancel. Use ListSteps to get steps and their states for the specified cluster.
    */
  var StepIds: StepIdsList = js.native
}

object CancelStepsInput {
  @scala.inline
  def apply(ClusterId: XmlStringMaxLen256, StepIds: StepIdsList): CancelStepsInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any], StepIds = StepIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelStepsInput]
  }
  @scala.inline
  implicit class CancelStepsInputOps[Self <: CancelStepsInput] (val x: Self) extends AnyVal {
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
    def setClusterId(value: XmlStringMaxLen256): Self = this.set("ClusterId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepIdsVarargs(value: XmlStringMaxLen256*): Self = this.set("StepIds", js.Array(value :_*))
    @scala.inline
    def setStepIds(value: StepIdsList): Self = this.set("StepIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepCancellationOption(value: StepCancellationOption): Self = this.set("StepCancellationOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepCancellationOption: Self = this.set("StepCancellationOption", js.undefined)
  }
  
}

