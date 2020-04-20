package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAgentAlertResult extends ResultStatus {
  var alert: AgentJobStepInfo
}

object UpdateAgentAlertResult {
  @scala.inline
  def apply(alert: AgentJobStepInfo, errorMessage: String, success: Boolean): UpdateAgentAlertResult = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgentAlertResult]
  }
}

