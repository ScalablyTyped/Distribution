package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMaintenanceWindowExecutionTaskInvocationRequest extends js.Object {
  /**
    * The invocation ID to retrieve.
    */
  var InvocationId: MaintenanceWindowExecutionTaskInvocationId = js.native
  /**
    * The ID of the specific task in the maintenance window task that should be retrieved. 
    */
  var TaskId: MaintenanceWindowExecutionTaskId = js.native
  /**
    * The ID of the maintenance window execution for which the task is a part.
    */
  var WindowExecutionId: MaintenanceWindowExecutionId = js.native
}

object GetMaintenanceWindowExecutionTaskInvocationRequest {
  @scala.inline
  def apply(
    InvocationId: MaintenanceWindowExecutionTaskInvocationId,
    TaskId: MaintenanceWindowExecutionTaskId,
    WindowExecutionId: MaintenanceWindowExecutionId
  ): GetMaintenanceWindowExecutionTaskInvocationRequest = {
    val __obj = js.Dynamic.literal(InvocationId = InvocationId.asInstanceOf[js.Any], TaskId = TaskId.asInstanceOf[js.Any], WindowExecutionId = WindowExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskInvocationRequest]
  }
  @scala.inline
  implicit class GetMaintenanceWindowExecutionTaskInvocationRequestOps[Self <: GetMaintenanceWindowExecutionTaskInvocationRequest] (val x: Self) extends AnyVal {
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
    def setInvocationId(value: MaintenanceWindowExecutionTaskInvocationId): Self = this.set("InvocationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskId(value: MaintenanceWindowExecutionTaskId): Self = this.set("TaskId", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = this.set("WindowExecutionId", value.asInstanceOf[js.Any])
  }
  
}

