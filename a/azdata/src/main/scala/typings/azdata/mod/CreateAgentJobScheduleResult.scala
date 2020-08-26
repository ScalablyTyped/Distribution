package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAgentJobScheduleResult extends ResultStatus {
  var schedule: AgentJobScheduleInfo = js.native
}

object CreateAgentJobScheduleResult {
  @scala.inline
  def apply(errorMessage: String, schedule: AgentJobScheduleInfo, success: Boolean): CreateAgentJobScheduleResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAgentJobScheduleResult]
  }
  @scala.inline
  implicit class CreateAgentJobScheduleResultOps[Self <: CreateAgentJobScheduleResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSchedule(value: AgentJobScheduleInfo): Self = this.set("schedule", value.asInstanceOf[js.Any])
  }
  
}

