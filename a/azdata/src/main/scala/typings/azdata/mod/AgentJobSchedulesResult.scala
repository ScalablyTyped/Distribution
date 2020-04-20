package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentJobSchedulesResult extends ResultStatus {
  var schedules: js.Array[AgentJobScheduleInfo]
}

object AgentJobSchedulesResult {
  @scala.inline
  def apply(errorMessage: String, schedules: js.Array[AgentJobScheduleInfo], success: Boolean): AgentJobSchedulesResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobSchedulesResult]
  }
}

