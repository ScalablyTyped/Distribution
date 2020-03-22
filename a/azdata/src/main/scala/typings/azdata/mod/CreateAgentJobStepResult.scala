package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAgentJobStepResult extends ResultStatus {
  var step: AgentJobStepInfo
}

object CreateAgentJobStepResult {
  @scala.inline
  def apply(errorMessage: String, step: AgentJobStepInfo, success: Boolean): CreateAgentJobStepResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateAgentJobStepResult]
  }
}

