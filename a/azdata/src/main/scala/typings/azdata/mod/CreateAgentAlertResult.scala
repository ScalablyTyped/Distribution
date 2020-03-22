package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAgentAlertResult extends ResultStatus {
  var alert: AgentJobStepInfo
}

object CreateAgentAlertResult {
  @scala.inline
  def apply(alert: AgentJobStepInfo, errorMessage: String, success: Boolean): CreateAgentAlertResult = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateAgentAlertResult]
  }
}

