package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMaintenanceWindowTaskRequest extends js.Object {
  /**
    * The new task description to specify.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.native
  /**
    * The new logging location in Amazon S3 to specify.   LoggingInfo has been deprecated. To specify an S3 bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var LoggingInfo: js.UndefOr[typings.awsSdk.ssmMod.LoggingInfo] = js.native
  /**
    * The new MaxConcurrency value you want to specify. MaxConcurrency is the number of targets that are allowed to run this task in parallel.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.ssmMod.MaxConcurrency] = js.native
  /**
    * The new MaxErrors value to specify. MaxErrors is the maximum number of errors that are allowed before the task stops being scheduled.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.ssmMod.MaxErrors] = js.native
  /**
    * The new task name to specify.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  /**
    * The new task priority to specify. The lower the number, the higher the priority. Tasks that have the same priority are scheduled in parallel.
    */
  var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.native
  /**
    * If True, then all fields that are required by the RegisterTaskWithMaintenanceWndow action are also required for this API request. Optional fields that are not specified are set to null.
    */
  var Replace: js.UndefOr[Boolean] = js.native
  /**
    * The ARN of the IAM service role for Systems Manager to assume when running a maintenance window task. If you do not specify a service role ARN, Systems Manager uses your account's service-linked role. If no service-linked role for Systems Manager exists in your account, it is created when you run RegisterTaskWithMaintenanceWindow. For more information, see the following topics in the in the AWS Systems Manager User Guide:    Using service-linked roles for Systems Manager     Should I use a service-linked role or a custom service role to run maintenance window tasks?    
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.native
  /**
    * The targets (either instances or tags) to modify. Instances are specified using Key=instanceids,Values=instanceID_1,instanceID_2. Tags are specified using Key=tag_name,Values=tag_value. 
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.native
  /**
    * The task ARN to modify.
    */
  var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.native
  /**
    * The parameters that the task should use during execution. Populate only the fields that match the task type. All other fields should be empty.
    */
  var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.native
  /**
    * The parameters to modify.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters.  The map has the following format: Key: string, between 1 and 255 characters Value: an array of strings, each string is between 1 and 255 characters
    */
  var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.native
  /**
    * The maintenance window ID that contains the task to modify.
    */
  var WindowId: MaintenanceWindowId = js.native
  /**
    * The task ID to modify.
    */
  var WindowTaskId: MaintenanceWindowTaskId = js.native
}

object UpdateMaintenanceWindowTaskRequest {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId, WindowTaskId: MaintenanceWindowTaskId): UpdateMaintenanceWindowTaskRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any], WindowTaskId = WindowTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMaintenanceWindowTaskRequest]
  }
  @scala.inline
  implicit class UpdateMaintenanceWindowTaskRequestOps[Self <: UpdateMaintenanceWindowTaskRequest] (val x: Self) extends AnyVal {
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
    def setWindowId(value: MaintenanceWindowId): Self = this.set("WindowId", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowTaskId(value: MaintenanceWindowTaskId): Self = this.set("WindowTaskId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: MaintenanceWindowDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setLoggingInfo(value: LoggingInfo): Self = this.set("LoggingInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingInfo: Self = this.set("LoggingInfo", js.undefined)
    @scala.inline
    def setMaxConcurrency(value: MaxConcurrency): Self = this.set("MaxConcurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConcurrency: Self = this.set("MaxConcurrency", js.undefined)
    @scala.inline
    def setMaxErrors(value: MaxErrors): Self = this.set("MaxErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxErrors: Self = this.set("MaxErrors", js.undefined)
    @scala.inline
    def setName(value: MaintenanceWindowName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setPriority(value: MaintenanceWindowTaskPriority): Self = this.set("Priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("Replace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace: Self = this.set("Replace", js.undefined)
    @scala.inline
    def setServiceRoleArn(value: ServiceRole): Self = this.set("ServiceRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceRoleArn: Self = this.set("ServiceRoleArn", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = this.set("Targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: Targets): Self = this.set("Targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("Targets", js.undefined)
    @scala.inline
    def setTaskArn(value: MaintenanceWindowTaskArn): Self = this.set("TaskArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskArn: Self = this.set("TaskArn", js.undefined)
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

