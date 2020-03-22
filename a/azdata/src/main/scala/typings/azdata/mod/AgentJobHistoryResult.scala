package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentJobHistoryResult extends ResultStatus {
  var alerts: js.Array[AgentAlertInfo]
  var histories: js.Array[AgentJobHistoryInfo]
  var schedules: js.Array[AgentJobScheduleInfo]
  var steps: js.Array[AgentJobStepInfo]
}

object AgentJobHistoryResult {
  @scala.inline
  def apply(
    alerts: js.Array[AgentAlertInfo],
    errorMessage: String,
    histories: js.Array[AgentJobHistoryInfo],
    schedules: js.Array[AgentJobScheduleInfo],
    steps: js.Array[AgentJobStepInfo],
    success: Boolean
  ): AgentJobHistoryResult = {
    val __obj = js.Dynamic.literal(alerts = alerts.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], histories = histories.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentJobHistoryResult]
  }
}

