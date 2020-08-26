package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMaintenanceWindowExecutionTaskInvocationResult extends js.Object {
  /**
    * The time that the task finished running on the target.
    */
  var EndTime: js.UndefOr[DateTime] = js.native
  /**
    * The execution ID.
    */
  var ExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskExecutionId] = js.native
  /**
    * The invocation ID.
    */
  var InvocationId: js.UndefOr[MaintenanceWindowExecutionTaskInvocationId] = js.native
  /**
    * User-provided value to be included in any CloudWatch events raised while running tasks for these targets in this maintenance window. 
    */
  var OwnerInformation: js.UndefOr[typings.awsSdk.ssmMod.OwnerInformation] = js.native
  /**
    * The parameters used at the time that the task ran.
    */
  var Parameters: js.UndefOr[MaintenanceWindowExecutionTaskInvocationParameters] = js.native
  /**
    * The time that the task started running on the target.
    */
  var StartTime: js.UndefOr[DateTime] = js.native
  /**
    * The task status for an invocation.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.native
  /**
    * The details explaining the status. Details are only available for certain status values.
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.native
  /**
    * The task execution ID.
    */
  var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.native
  /**
    * Retrieves the task type for a maintenance window. Task types include the following: LAMBDA, STEP_FUNCTIONS, AUTOMATION, RUN_COMMAND.
    */
  var TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.native
  /**
    * The maintenance window execution ID.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.native
  /**
    * The maintenance window target ID.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId] = js.native
}

object GetMaintenanceWindowExecutionTaskInvocationResult {
  @scala.inline
  def apply(): GetMaintenanceWindowExecutionTaskInvocationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskInvocationResult]
  }
  @scala.inline
  implicit class GetMaintenanceWindowExecutionTaskInvocationResultOps[Self <: GetMaintenanceWindowExecutionTaskInvocationResult] (val x: Self) extends AnyVal {
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
    def setExecutionId(value: MaintenanceWindowExecutionTaskExecutionId): Self = this.set("ExecutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionId: Self = this.set("ExecutionId", js.undefined)
    @scala.inline
    def setInvocationId(value: MaintenanceWindowExecutionTaskInvocationId): Self = this.set("InvocationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvocationId: Self = this.set("InvocationId", js.undefined)
    @scala.inline
    def setOwnerInformation(value: OwnerInformation): Self = this.set("OwnerInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerInformation: Self = this.set("OwnerInformation", js.undefined)
    @scala.inline
    def setParameters(value: MaintenanceWindowExecutionTaskInvocationParameters): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
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
    @scala.inline
    def setWindowTargetId(value: MaintenanceWindowTaskTargetId): Self = this.set("WindowTargetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowTargetId: Self = this.set("WindowTargetId", js.undefined)
  }
  
}

