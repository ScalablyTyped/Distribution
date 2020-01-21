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
}

