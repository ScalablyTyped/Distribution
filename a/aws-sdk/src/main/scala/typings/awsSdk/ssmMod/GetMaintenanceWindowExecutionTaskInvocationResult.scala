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
  def apply(
    EndTime: DateTime = null,
    ExecutionId: MaintenanceWindowExecutionTaskExecutionId = null,
    InvocationId: MaintenanceWindowExecutionTaskInvocationId = null,
    OwnerInformation: OwnerInformation = null,
    Parameters: MaintenanceWindowExecutionTaskInvocationParameters = null,
    StartTime: DateTime = null,
    Status: MaintenanceWindowExecutionStatus = null,
    StatusDetails: MaintenanceWindowExecutionStatusDetails = null,
    TaskExecutionId: MaintenanceWindowExecutionTaskId = null,
    TaskType: MaintenanceWindowTaskType = null,
    WindowExecutionId: MaintenanceWindowExecutionId = null,
    WindowTargetId: MaintenanceWindowTaskTargetId = null
  ): GetMaintenanceWindowExecutionTaskInvocationResult = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (ExecutionId != null) __obj.updateDynamic("ExecutionId")(ExecutionId.asInstanceOf[js.Any])
    if (InvocationId != null) __obj.updateDynamic("InvocationId")(InvocationId.asInstanceOf[js.Any])
    if (OwnerInformation != null) __obj.updateDynamic("OwnerInformation")(OwnerInformation.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDetails != null) __obj.updateDynamic("StatusDetails")(StatusDetails.asInstanceOf[js.Any])
    if (TaskExecutionId != null) __obj.updateDynamic("TaskExecutionId")(TaskExecutionId.asInstanceOf[js.Any])
    if (TaskType != null) __obj.updateDynamic("TaskType")(TaskType.asInstanceOf[js.Any])
    if (WindowExecutionId != null) __obj.updateDynamic("WindowExecutionId")(WindowExecutionId.asInstanceOf[js.Any])
    if (WindowTargetId != null) __obj.updateDynamic("WindowTargetId")(WindowTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskInvocationResult]
  }
}

