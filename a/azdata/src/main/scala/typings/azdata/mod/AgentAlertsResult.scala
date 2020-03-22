package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentAlertsResult extends ResultStatus {
  var alerts: js.Array[AgentAlertInfo]
}

object AgentAlertsResult {
  @scala.inline
  def apply(alerts: js.Array[AgentAlertInfo], errorMessage: String, success: Boolean): AgentAlertsResult = {
    val __obj = js.Dynamic.literal(alerts = alerts.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentAlertsResult]
  }
}

