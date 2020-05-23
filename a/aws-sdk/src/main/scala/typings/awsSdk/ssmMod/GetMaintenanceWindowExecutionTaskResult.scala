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
  def apply(
    EndTime: DateTime = null,
    MaxConcurrency: MaxConcurrency = null,
    MaxErrors: MaxErrors = null,
    Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined,
    ServiceRole: ServiceRole = null,
    StartTime: DateTime = null,
    Status: MaintenanceWindowExecutionStatus = null,
    StatusDetails: MaintenanceWindowExecutionStatusDetails = null,
    TaskArn: MaintenanceWindowTaskArn = null,
    TaskExecutionId: MaintenanceWindowExecutionTaskId = null,
    TaskParameters: MaintenanceWindowTaskParametersList = null,
    Type: MaintenanceWindowTaskType = null,
    WindowExecutionId: MaintenanceWindowExecutionId = null
  ): GetMaintenanceWindowExecutionTaskResult = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (MaxConcurrency != null) __obj.updateDynamic("MaxConcurrency")(MaxConcurrency.asInstanceOf[js.Any])
    if (MaxErrors != null) __obj.updateDynamic("MaxErrors")(MaxErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(Priority)) __obj.updateDynamic("Priority")(Priority.get.asInstanceOf[js.Any])
    if (ServiceRole != null) __obj.updateDynamic("ServiceRole")(ServiceRole.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDetails != null) __obj.updateDynamic("StatusDetails")(StatusDetails.asInstanceOf[js.Any])
    if (TaskArn != null) __obj.updateDynamic("TaskArn")(TaskArn.asInstanceOf[js.Any])
    if (TaskExecutionId != null) __obj.updateDynamic("TaskExecutionId")(TaskExecutionId.asInstanceOf[js.Any])
    if (TaskParameters != null) __obj.updateDynamic("TaskParameters")(TaskParameters.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (WindowExecutionId != null) __obj.updateDynamic("WindowExecutionId")(WindowExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskResult]
  }
}

