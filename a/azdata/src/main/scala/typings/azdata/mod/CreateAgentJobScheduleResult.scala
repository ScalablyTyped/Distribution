package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAgentJobScheduleResult extends ResultStatus {
  var schedule: AgentJobScheduleInfo
}

object CreateAgentJobScheduleResult {
  @scala.inline
  def apply(errorMessage: String, schedule: AgentJobScheduleInfo, success: Boolean): CreateAgentJobScheduleResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateAgentJobScheduleResult]
  }
}

