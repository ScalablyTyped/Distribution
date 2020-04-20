package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAgentJobStepResult extends ResultStatus {
  var step: AgentJobStepInfo
}

object UpdateAgentJobStepResult {
  @scala.inline
  def apply(errorMessage: String, step: AgentJobStepInfo, success: Boolean): UpdateAgentJobStepResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgentJobStepResult]
  }
}

