package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterTaskWithMaintenanceWindowRequest extends StObject {
  
  /**
    * User-provided idempotency token.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.ssmMod.ClientToken] = js.undefined
  
  /**
    * An optional description for the task.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  
  /**
    * A structure containing information about an S3 bucket to write instance-level logs to.    LoggingInfo has been deprecated. To specify an S3 bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var LoggingInfo: js.UndefOr[typings.awsSdk.ssmMod.LoggingInfo] = js.undefined
  
  /**
    * The maximum number of targets this task can be run for in parallel.
    */
  var MaxConcurrency: typings.awsSdk.ssmMod.MaxConcurrency
  
  /**
    * The maximum number of errors allowed before this task stops being scheduled.
    */
  var MaxErrors: typings.awsSdk.ssmMod.MaxErrors
  
  /**
    * An optional name for the task.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  
  /**
    * The priority of the task in the maintenance window, the lower the number the higher the priority. Tasks in a maintenance window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
    */
  var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined
  
  /**
    * The ARN of the IAM service role for Systems Manager to assume when running a maintenance window task. If you do not specify a service role ARN, Systems Manager uses your account's service-linked role. If no service-linked role for Systems Manager exists in your account, it is created when you run RegisterTaskWithMaintenanceWindow. For more information, see the following topics in the in the AWS Systems Manager User Guide:    Using service-linked roles for Systems Manager     Should I use a service-linked role or a custom service role to run maintenance window tasks?    
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined
  
  /**
    * The targets (either instances or maintenance window targets). Specify instances using the following format:   Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;  Specify maintenance window targets using the following format:  Key=WindowTargetIds;,Values=&lt;window-target-id-1&gt;,&lt;window-target-id-2&gt; 
    */
  var Targets: typings.awsSdk.ssmMod.Targets
  
  /**
    * The ARN of the task to run.
    */
  var TaskArn: MaintenanceWindowTaskArn
  
  /**
    * The parameters that the task should use during execution. Populate only the fields that match the task type. All other fields should be empty. 
    */
  var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.undefined
  
  /**
    * The parameters that should be passed to the task when it is run.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined
  
  /**
    * The type of task being registered.
    */
  var TaskType: MaintenanceWindowTaskType
  
  /**
    * The ID of the maintenance window the task should be added to.
    */
  var WindowId: MaintenanceWindowId
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
  implicit class RegisterTaskWithMaintenanceWindowRequestMutableBuilder[Self <: RegisterTaskWithMaintenanceWindowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setDescription(value: MaintenanceWindowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setLoggingInfo(value: LoggingInfo): Self = StObject.set(x, "LoggingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingInfoUndefined: Self = StObject.set(x, "LoggingInfo", js.undefined)
    
    @scala.inline
    def setMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxErrors(value: MaxErrors): Self = StObject.set(x, "MaxErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: MaintenanceWindowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPriority(value: MaintenanceWindowTaskPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    @scala.inline
    def setServiceRoleArn(value: ServiceRole): Self = StObject.set(x, "ServiceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleArnUndefined: Self = StObject.set(x, "ServiceRoleArn", js.undefined)
    
    @scala.inline
    def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value :_*))
    
    @scala.inline
    def setTaskArn(value: MaintenanceWindowTaskArn): Self = StObject.set(x, "TaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskInvocationParameters(value: MaintenanceWindowTaskInvocationParameters): Self = StObject.set(x, "TaskInvocationParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskInvocationParametersUndefined: Self = StObject.set(x, "TaskInvocationParameters", js.undefined)
    
    @scala.inline
    def setTaskParameters(value: MaintenanceWindowTaskParameters): Self = StObject.set(x, "TaskParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskParametersUndefined: Self = StObject.set(x, "TaskParameters", js.undefined)
    
    @scala.inline
    def setTaskType(value: MaintenanceWindowTaskType): Self = StObject.set(x, "TaskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
  }
}
