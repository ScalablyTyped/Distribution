package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterTaskWithMaintenanceWindowRequest extends js.Object {
  /**
    * User-provided idempotency token.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.ssmMod.ClientToken] = js.native
  /**
    * An optional description for the task.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.native
  /**
    * A structure containing information about an S3 bucket to write instance-level logs to.    LoggingInfo has been deprecated. To specify an S3 bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var LoggingInfo: js.UndefOr[typings.awsSdk.ssmMod.LoggingInfo] = js.native
  /**
    * The maximum number of targets this task can be run for in parallel.
    */
  var MaxConcurrency: typings.awsSdk.ssmMod.MaxConcurrency = js.native
  /**
    * The maximum number of errors allowed before this task stops being scheduled.
    */
  var MaxErrors: typings.awsSdk.ssmMod.MaxErrors = js.native
  /**
    * An optional name for the task.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  /**
    * The priority of the task in the maintenance window, the lower the number the higher the priority. Tasks in a maintenance window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
    */
  var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.native
  /**
    * The ARN of the IAM service role for Systems Manager to assume when running a maintenance window task. If you do not specify a service role ARN, Systems Manager uses your account's service-linked role. If no service-linked role for Systems Manager exists in your account, it is created when you run RegisterTaskWithMaintenanceWindow. For more information, see the following topics in the in the AWS Systems Manager User Guide:    Using service-linked roles for Systems Manager     Should I use a service-linked role or a custom service role to run maintenance window tasks?    
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.native
  /**
    * The targets (either instances or maintenance window targets). Specify instances using the following format:   Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;  Specify maintenance window targets using the following format:  Key=WindowTargetIds;,Values=&lt;window-target-id-1&gt;,&lt;window-target-id-2&gt; 
    */
  var Targets: typings.awsSdk.ssmMod.Targets = js.native
  /**
    * The ARN of the task to run.
    */
  var TaskArn: MaintenanceWindowTaskArn = js.native
  /**
    * The parameters that the task should use during execution. Populate only the fields that match the task type. All other fields should be empty. 
    */
  var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.native
  /**
    * The parameters that should be passed to the task when it is run.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.native
  /**
    * The type of task being registered.
    */
  var TaskType: MaintenanceWindowTaskType = js.native
  /**
    * The ID of the maintenance window the task should be added to.
    */
  var WindowId: MaintenanceWindowId = js.native
}

object RegisterTaskWithMaintenanceWindowRequest {
  @scala.inline
  def apply(
    MaxConcurrency: MaxConcurrency,
    MaxErrors: MaxErrors,
    Targets: Targets,
    TaskArn: MaintenanceWindowTaskArn,
    TaskType: MaintenanceWindowTaskType,
    WindowId: MaintenanceWindowId
  ): RegisterTaskWithMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(MaxConcurrency = MaxConcurrency.asInstanceOf[js.Any], MaxErrors = MaxErrors.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any], TaskArn = TaskArn.asInstanceOf[js.Any], TaskType = TaskType.asInstanceOf[js.Any], WindowId = WindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTaskWithMaintenanceWindowRequest]
  }
  @scala.inline
  implicit class RegisterTaskWithMaintenanceWindowRequestOps[Self <: RegisterTaskWithMaintenanceWindowRequest] (val x: Self) extends AnyVal {
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
    def setMaxConcurrency(value: MaxConcurrency): Self = this.set("MaxConcurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxErrors(value: MaxErrors): Self = this.set("MaxErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = this.set("Targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: Targets): Self = this.set("Targets", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskArn(value: MaintenanceWindowTaskArn): Self = this.set("TaskArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskType(value: MaintenanceWindowTaskType): Self = this.set("TaskType", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = this.set("WindowId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setDescription(value: MaintenanceWindowDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setLoggingInfo(value: LoggingInfo): Self = this.set("LoggingInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingInfo: Self = this.set("LoggingInfo", js.undefined)
    @scala.inline
    def setName(value: MaintenanceWindowName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setPriority(value: MaintenanceWindowTaskPriority): Self = this.set("Priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
    @scala.inline
    def setServiceRoleArn(value: ServiceRole): Self = this.set("ServiceRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceRoleArn: Self = this.set("ServiceRoleArn", js.undefined)
    @scala.inline
    def setTaskInvocationParameters(value: MaintenanceWindowTaskInvocationParameters): Self = this.set("TaskInvocationParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskInvocationParameters: Self = this.set("TaskInvocationParameters", js.undefined)
    @scala.inline
    def setTaskParameters(value: MaintenanceWindowTaskParameters): Self = this.set("TaskParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskParameters: Self = this.set("TaskParameters", js.undefined)
  }
  
}

