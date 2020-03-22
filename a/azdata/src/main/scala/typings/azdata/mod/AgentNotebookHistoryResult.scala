package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentNotebookHistoryResult extends ResultStatus {
  var histories: js.Array[AgentNotebookHistoryInfo]
  var schedules: js.Array[AgentJobScheduleInfo]
  var steps: js.Array[AgentJobStepInfo]
}

object AgentNotebookHistoryResult {
  @scala.inline
  def apply(
    errorMessage: String,
    histories: js.Array[AgentNotebookHistoryInfo],
    schedules: js.Array[AgentJobScheduleInfo],
    steps: js.Array[AgentJobStepInfo],
    success: Boolean
  ): AgentNotebookHistoryResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], histories = histories.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentNotebookHistoryResult]
  }
}

