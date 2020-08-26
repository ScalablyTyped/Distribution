package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMaintenanceWindowExecutionTaskRequest extends js.Object {
  /**
    * The ID of the specific task execution in the maintenance window task that should be retrieved.
    */
  var TaskId: MaintenanceWindowExecutionTaskId = js.native
  /**
    * The ID of the maintenance window execution that includes the task.
    */
  var WindowExecutionId: MaintenanceWindowExecutionId = js.native
}

object GetMaintenanceWindowExecutionTaskRequest {
  @scala.inline
  def apply(TaskId: MaintenanceWindowExecutionTaskId, WindowExecutionId: MaintenanceWindowExecutionId): GetMaintenanceWindowExecutionTaskRequest = {
    val __obj = js.Dynamic.literal(TaskId = TaskId.asInstanceOf[js.Any], WindowExecutionId = WindowExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskRequest]
  }
  @scala.inline
  implicit class GetMaintenanceWindowExecutionTaskRequestOps[Self <: GetMaintenanceWindowExecutionTaskRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTaskId(value: MaintenanceWindowExecutionTaskId): Self = this.set("TaskId", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = this.set("WindowExecutionId", value.asInstanceOf[js.Any])
  }
  
}

