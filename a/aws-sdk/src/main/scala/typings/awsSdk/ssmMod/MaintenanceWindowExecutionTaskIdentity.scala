package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowExecutionTaskIdentity extends js.Object {
  /**
    * The time the task execution finished.
    */
  var EndTime: js.UndefOr[DateTime] = js.native
  /**
    * The time the task execution started.
    */
  var StartTime: js.UndefOr[DateTime] = js.native
  /**
    * The status of the task execution.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.native
  /**
    * The details explaining the status of the task execution. Only available for certain status values.
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.native
  /**
    * The ARN of the task that ran.
    */
  var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.native
  /**
    * The ID of the specific task execution in the maintenance window execution.
    */
  var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.native
  /**
    * The type of task that ran.
    */
  var TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.native
  /**
    * The ID of the maintenance window execution that ran the task.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.native
}

object MaintenanceWindowExecutionTaskIdentity {
  @scala.inline
  def apply(): MaintenanceWindowExecutionTaskIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowExecutionTaskIdentity]
  }
  @scala.inline
  implicit class MaintenanceWindowExecutionTaskIdentityOps[Self <: MaintenanceWindowExecutionTaskIdentity] (val x: Self) extends AnyVal {
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
    def setEndTime(value: DateTime): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setStartTime(value: DateTime): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    @scala.inline
    def setStatus(value: MaintenanceWindowExecutionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStatusDetails(value: MaintenanceWindowExecutionStatusDetails): Self = this.set("StatusDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusDetails: Self = this.set("StatusDetails", js.undefined)
    @scala.inline
    def setTaskArn(value: MaintenanceWindowTaskArn): Self = this.set("TaskArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskArn: Self = this.set("TaskArn", js.undefined)
    @scala.inline
    def setTaskExecutionId(value: MaintenanceWindowExecutionTaskId): Self = this.set("TaskExecutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskExecutionId: Self = this.set("TaskExecutionId", js.undefined)
    @scala.inline
    def setTaskType(value: MaintenanceWindowTaskType): Self = this.set("TaskType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskType: Self = this.set("TaskType", js.undefined)
    @scala.inline
    def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = this.set("WindowExecutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowExecutionId: Self = this.set("WindowExecutionId", js.undefined)
  }
  
}

