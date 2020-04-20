package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentJobStep extends js.Object {
  var jobId: String
  var message: String
  var runDate: String
  var runStatus: Double
  var stepDetails: AgentJobStepInfo
  var stepId: String
  var stepName: String
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
}

