package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddJobFlowStepsOutput extends js.Object {
  /**
    * The identifiers of the list of steps added to the job flow.
    */
  var StepIds: js.UndefOr[StepIdsList] = js.native
}

object AddJobFlowStepsOutput {
  @scala.inline
  def apply(): AddJobFlowStepsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddJobFlowStepsOutput]
  }
  @scala.inline
  implicit class AddJobFlowStepsOutputOps[Self <: AddJobFlowStepsOutput] (val x: Self) extends AnyVal {
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
    def setStepIdsVarargs(value: XmlStringMaxLen256*): Self = this.set("StepIds", js.Array(value :_*))
    @scala.inline
    def setStepIds(value: StepIdsList): Self = this.set("StepIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepIds: Self = this.set("StepIds", js.undefined)
  }
  
}

