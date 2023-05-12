package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindowTask extends StObject {
  
  /**
    * The details for the CloudWatch alarm applied to your maintenance window task.
    */
  var AlarmConfiguration: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.AlarmConfiguration] = js.undefined
  
  /**
    * The specification for whether tasks should continue to run after the cutoff time specified in the maintenance windows is reached. 
    */
  var CutoffBehavior: js.UndefOr[MaintenanceWindowTaskCutoffBehavior] = js.undefined
  
  /**
    * A description of the task.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  
  /**
    * Information about an S3 bucket to write task-level logs to.   LoggingInfo has been deprecated. To specify an Amazon Simple Storage Service (Amazon S3) bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Amazon Web Services Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var LoggingInfo: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.LoggingInfo] = js.undefined
  
  /**
    * The maximum number of targets this task can be run for, in parallel.  Although this element is listed as "Required: No", a value can be omitted only when you are registering or updating a targetless task You must provide a value in all other cases. For maintenance window tasks without a target specified, you can't supply a value for this option. Instead, the system inserts a placeholder value of 1. This value doesn't affect the running of your task. 
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.MaxConcurrency] = js.undefined
  
  /**
    * The maximum number of errors allowed before this task stops being scheduled.  Although this element is listed as "Required: No", a value can be omitted only when you are registering or updating a targetless task You must provide a value in all other cases. For maintenance window tasks without a target specified, you can't supply a value for this option. Instead, the system inserts a placeholder value of 1. This value doesn't affect the running of your task. 
    */
  var MaxErrors: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.MaxErrors] = js.undefined
  
  /**
    * The task name.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  
  /**
    * The priority of the task in the maintenance window. The lower the number, the higher the priority. Tasks that have the same priority are scheduled in parallel.
    */
  var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance window Run Command tasks.
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined
  
  /**
    * The targets (either managed nodes or tags). Managed nodes are specified using Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag name&gt;,Values=&lt;tag value&gt;.
    */
  var Targets: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.Targets] = js.undefined
  
  /**
    * The resource that the task uses during execution. For RUN_COMMAND and AUTOMATION task types, TaskArn is the Amazon Web Services Systems Manager (SSM document) name or ARN. For LAMBDA tasks, it's the function name or ARN. For STEP_FUNCTIONS tasks, it's the state machine ARN.
    */
  var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined
  
  /**
    * The parameters that should be passed to the task when it is run.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined
  
  /**
    * The type of task.
    */
  var Type: js.UndefOr[MaintenanceWindowTaskType] = js.undefined
  
  /**
    * The ID of the maintenance window where the task is registered.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  
  /**
    * The task ID.
    */
  var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
}
object MaintenanceWindowTask {
  
  inline def apply(): MaintenanceWindowTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaintenanceWindowTask] (val x: Self) extends AnyVal {
    
    inline def setAlarmConfiguration(value: AlarmConfiguration): Self = StObject.set(x, "AlarmConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAlarmConfigurationUndefined: Self = StObject.set(x, "AlarmConfiguration", js.undefined)
    
    inline def setCutoffBehavior(value: MaintenanceWindowTaskCutoffBehavior): Self = StObject.set(x, "CutoffBehavior", value.asInstanceOf[js.Any])
    
    inline def setCutoffBehaviorUndefined: Self = StObject.set(x, "CutoffBehavior", js.undefined)
    
    inline def setDescription(value: MaintenanceWindowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLoggingInfo(value: LoggingInfo): Self = StObject.set(x, "LoggingInfo", value.asInstanceOf[js.Any])
    
    inline def setLoggingInfoUndefined: Self = StObject.set(x, "LoggingInfo", js.undefined)
    
    inline def setMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "MaxConcurrency", js.undefined)
    
    inline def setMaxErrors(value: MaxErrors): Self = StObject.set(x, "MaxErrors", value.asInstanceOf[js.Any])
    
    inline def setMaxErrorsUndefined: Self = StObject.set(x, "MaxErrors", js.undefined)
    
    inline def setName(value: MaintenanceWindowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPriority(value: MaintenanceWindowTaskPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setServiceRoleArn(value: ServiceRole): Self = StObject.set(x, "ServiceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleArnUndefined: Self = StObject.set(x, "ServiceRoleArn", js.undefined)
    
    inline def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value*))
    
    inline def setTaskArn(value: MaintenanceWindowTaskArn): Self = StObject.set(x, "TaskArn", value.asInstanceOf[js.Any])
    
    inline def setTaskArnUndefined: Self = StObject.set(x, "TaskArn", js.undefined)
    
    inline def setTaskParameters(value: MaintenanceWindowTaskParameters): Self = StObject.set(x, "TaskParameters", value.asInstanceOf[js.Any])
    
    inline def setTaskParametersUndefined: Self = StObject.set(x, "TaskParameters", js.undefined)
    
    inline def setType(value: MaintenanceWindowTaskType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "WindowId", js.undefined)
    
    inline def setWindowTaskId(value: MaintenanceWindowTaskId): Self = StObject.set(x, "WindowTaskId", value.asInstanceOf[js.Any])
    
    inline def setWindowTaskIdUndefined: Self = StObject.set(x, "WindowTaskId", js.undefined)
  }
}
