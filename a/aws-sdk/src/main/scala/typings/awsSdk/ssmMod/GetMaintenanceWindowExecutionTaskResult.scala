package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMaintenanceWindowExecutionTaskResult extends js.Object {
  /**
    * The time the task execution completed.
    */
  var EndTime: js.UndefOr[DateTime] = js.native
  /**
    * The defined maximum number of task executions that could be run in parallel.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.ssmMod.MaxConcurrency] = js.native
  /**
    * The defined maximum number of task execution errors allowed before scheduling of the task execution would have been stopped.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.ssmMod.MaxErrors] = js.native
  /**
    * The priority of the task.
    */
  var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.native
  /**
    * The role that was assumed when running the task.
    */
  var ServiceRole: js.UndefOr[typings.awsSdk.ssmMod.ServiceRole] = js.native
  /**
    * The time the task execution started.
    */
  var StartTime: js.UndefOr[DateTime] = js.native
  /**
    * The status of the task.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.native
  /**
    * The details explaining the Status. Only available for certain status values.
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.native
  /**
    * The ARN of the task that ran.
    */
  var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.native
  /**
    * The ID of the specific task execution in the maintenance window task that was retrieved.
    */
  var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.native
  /**
    * The parameters passed to the task when it was run.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters.  The map has the following format: Key: string, between 1 and 255 characters Value: an array of strings, each string is between 1 and 255 characters
    */
  var TaskParameters: js.UndefOr[MaintenanceWindowTaskParametersList] = js.native
  /**
    * The type of task that was run.
    */
  var Type: js.UndefOr[MaintenanceWindowTaskType] = js.native
  /**
    * The ID of the maintenance window execution that includes the task.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.native
}

object GetMaintenanceWindowExecutionTaskResult {
  @scala.inline
  def apply(): GetMaintenanceWindowExecutionTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskResult]
  }
  @scala.inline
  implicit class GetMaintenanceWindowExecutionTaskResultOps[Self <: GetMaintenanceWindowExecutionTaskResult] (val x: Self) extends AnyVal {
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
    def setMaxConcurrency(value: MaxConcurrency): Self = this.set("MaxConcurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConcurrency: Self = this.set("MaxConcurrency", js.undefined)
    @scala.inline
    def setMaxErrors(value: MaxErrors): Self = this.set("MaxErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxErrors: Self = this.set("MaxErrors", js.undefined)
    @scala.inline
    def setPriority(value: MaintenanceWindowTaskPriority): Self = this.set("Priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
    @scala.inline
    def setServiceRole(value: ServiceRole): Self = this.set("ServiceRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceRole: Self = this.set("ServiceRole", js.undefined)
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
    def setTaskParametersVarargs(value: MaintenanceWindowTaskParameters*): Self = this.set("TaskParameters", js.Array(value :_*))
    @scala.inline
    def setTaskParameters(value: MaintenanceWindowTaskParametersList): Self = this.set("TaskParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskParameters: Self = this.set("TaskParameters", js.undefined)
    @scala.inline
    def setType(value: MaintenanceWindowTaskType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = this.set("WindowExecutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowExecutionId: Self = this.set("WindowExecutionId", js.undefined)
  }
  
}

