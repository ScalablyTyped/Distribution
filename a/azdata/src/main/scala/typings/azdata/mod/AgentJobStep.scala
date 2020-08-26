package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentJobStep extends js.Object {
  var jobId: String = js.native
  var message: String = js.native
  var runDate: String = js.native
  var runStatus: Double = js.native
  var stepDetails: AgentJobStepInfo = js.native
  var stepId: String = js.native
  var stepName: String = js.native
}

object AgentJobStep {
  @scala.inline
  def apply(
    jobId: String,
    message: String,
    runDate: String,
    runStatus: Double,
    stepDetails: AgentJobStepInfo,
    stepId: String,
    stepName: String
  ): AgentJobStep = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], runDate = runDate.asInstanceOf[js.Any], runStatus = runStatus.asInstanceOf[js.Any], stepDetails = stepDetails.asInstanceOf[js.Any], stepId = stepId.asInstanceOf[js.Any], stepName = stepName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobStep]
  }
  @scala.inline
  implicit class AgentJobStepOps[Self <: AgentJobStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunDate(value: String): Self = this.set("runDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunStatus(value: Double): Self = this.set("runStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepDetails(value: AgentJobStepInfo): Self = this.set("stepDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepId(value: String): Self = this.set("stepId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepName(value: String): Self = this.set("stepName", value.asInstanceOf[js.Any])
  }
  
}

