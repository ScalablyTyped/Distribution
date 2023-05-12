package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindowExecutionTaskIdentity extends StObject {
  
  /**
    * The details for the CloudWatch alarm applied to your maintenance window task.
    */
  var AlarmConfiguration: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.AlarmConfiguration] = js.undefined
  
  /**
    * The time the task execution finished.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time the task execution started.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the task execution.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined
  
  /**
    * The details explaining the status of the task execution. Not available for all status values.
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the task that ran.
    */
  var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined
  
  /**
    * The ID of the specific task execution in the maintenance window execution.
    */
  var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined
  
  /**
    * The type of task that ran.
    */
  var TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.undefined
  
  /**
    * The CloudWatch alarm that was invoked by the maintenance window task.
    */
  var TriggeredAlarms: js.UndefOr[AlarmStateInformationList] = js.undefined
  
  /**
    * The ID of the maintenance window execution that ran the task.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
}
object MaintenanceWindowExecutionTaskIdentity {
  
  inline def apply(): MaintenanceWindowExecutionTaskIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowExecutionTaskIdentity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaintenanceWindowExecutionTaskIdentity] (val x: Self) extends AnyVal {
    
    inline def setAlarmConfiguration(value: AlarmConfiguration): Self = StObject.set(x, "AlarmConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAlarmConfigurationUndefined: Self = StObject.set(x, "AlarmConfiguration", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatus(value: MaintenanceWindowExecutionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusDetails(value: MaintenanceWindowExecutionStatusDetails): Self = StObject.set(x, "StatusDetails", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailsUndefined: Self = StObject.set(x, "StatusDetails", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTaskArn(value: MaintenanceWindowTaskArn): Self = StObject.set(x, "TaskArn", value.asInstanceOf[js.Any])
    
    inline def setTaskArnUndefined: Self = StObject.set(x, "TaskArn", js.undefined)
    
    inline def setTaskExecutionId(value: MaintenanceWindowExecutionTaskId): Self = StObject.set(x, "TaskExecutionId", value.asInstanceOf[js.Any])
    
    inline def setTaskExecutionIdUndefined: Self = StObject.set(x, "TaskExecutionId", js.undefined)
    
    inline def setTaskType(value: MaintenanceWindowTaskType): Self = StObject.set(x, "TaskType", value.asInstanceOf[js.Any])
    
    inline def setTaskTypeUndefined: Self = StObject.set(x, "TaskType", js.undefined)
    
    inline def setTriggeredAlarms(value: AlarmStateInformationList): Self = StObject.set(x, "TriggeredAlarms", value.asInstanceOf[js.Any])
    
    inline def setTriggeredAlarmsUndefined: Self = StObject.set(x, "TriggeredAlarms", js.undefined)
    
    inline def setTriggeredAlarmsVarargs(value: AlarmStateInformation*): Self = StObject.set(x, "TriggeredAlarms", js.Array(value*))
    
    inline def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = StObject.set(x, "WindowExecutionId", value.asInstanceOf[js.Any])
    
    inline def setWindowExecutionIdUndefined: Self = StObject.set(x, "WindowExecutionId", js.undefined)
  }
}
