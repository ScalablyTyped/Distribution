package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindowExecutionTaskInvocationIdentity extends StObject {
  
  /**
    * The time the invocation finished.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the action performed in the service that actually handled the task invocation. If the task type is RUN_COMMAND, this value is the command ID.
    */
  var ExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskExecutionId] = js.undefined
  
  /**
    * The ID of the task invocation.
    */
  var InvocationId: js.UndefOr[MaintenanceWindowExecutionTaskInvocationId] = js.undefined
  
  /**
    * User-provided value that was specified when the target was registered with the maintenance window. This was also included in any Amazon CloudWatch Events events raised during the task invocation.
    */
  var OwnerInformation: js.UndefOr[typings.awsSdk.ssmMod.OwnerInformation] = js.undefined
  
  /**
    * The parameters that were provided for the invocation when it was run.
    */
  var Parameters: js.UndefOr[MaintenanceWindowExecutionTaskInvocationParameters] = js.undefined
  
  /**
    * The time the invocation started.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the task invocation.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined
  
  /**
    * The details explaining the status of the task invocation. Not available for all status values. 
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined
  
  /**
    * The ID of the specific task execution in the maintenance window execution.
    */
  var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined
  
  /**
    * The task type.
    */
  var TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.undefined
  
  /**
    * The ID of the maintenance window execution that ran the task.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
  
  /**
    * The ID of the target definition in this maintenance window the invocation was performed for.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId] = js.undefined
}
object MaintenanceWindowExecutionTaskInvocationIdentity {
  
  inline def apply(): MaintenanceWindowExecutionTaskInvocationIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowExecutionTaskInvocationIdentity]
  }
  
  extension [Self <: MaintenanceWindowExecutionTaskInvocationIdentity](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setExecutionId(value: MaintenanceWindowExecutionTaskExecutionId): Self = StObject.set(x, "ExecutionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "ExecutionId", js.undefined)
    
    inline def setInvocationId(value: MaintenanceWindowExecutionTaskInvocationId): Self = StObject.set(x, "InvocationId", value.asInstanceOf[js.Any])
    
    inline def setInvocationIdUndefined: Self = StObject.set(x, "InvocationId", js.undefined)
    
    inline def setOwnerInformation(value: OwnerInformation): Self = StObject.set(x, "OwnerInformation", value.asInstanceOf[js.Any])
    
    inline def setOwnerInformationUndefined: Self = StObject.set(x, "OwnerInformation", js.undefined)
    
    inline def setParameters(value: MaintenanceWindowExecutionTaskInvocationParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatus(value: MaintenanceWindowExecutionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusDetails(value: MaintenanceWindowExecutionStatusDetails): Self = StObject.set(x, "StatusDetails", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailsUndefined: Self = StObject.set(x, "StatusDetails", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTaskExecutionId(value: MaintenanceWindowExecutionTaskId): Self = StObject.set(x, "TaskExecutionId", value.asInstanceOf[js.Any])
    
    inline def setTaskExecutionIdUndefined: Self = StObject.set(x, "TaskExecutionId", js.undefined)
    
    inline def setTaskType(value: MaintenanceWindowTaskType): Self = StObject.set(x, "TaskType", value.asInstanceOf[js.Any])
    
    inline def setTaskTypeUndefined: Self = StObject.set(x, "TaskType", js.undefined)
    
    inline def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = StObject.set(x, "WindowExecutionId", value.asInstanceOf[js.Any])
    
    inline def setWindowExecutionIdUndefined: Self = StObject.set(x, "WindowExecutionId", js.undefined)
    
    inline def setWindowTargetId(value: MaintenanceWindowTaskTargetId): Self = StObject.set(x, "WindowTargetId", value.asInstanceOf[js.Any])
    
    inline def setWindowTargetIdUndefined: Self = StObject.set(x, "WindowTargetId", js.undefined)
  }
}
