package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMaintenanceWindowExecutionResult extends StObject {
  
  /**
    * The time the maintenance window finished running.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time the maintenance window started running.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the maintenance window execution.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined
  
  /**
    * The details explaining the status. Not available for all status values.
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined
  
  /**
    * The ID of the task executions from the maintenance window execution.
    */
  var TaskIds: js.UndefOr[MaintenanceWindowExecutionTaskIdList] = js.undefined
  
  /**
    * The ID of the maintenance window execution.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
}
object GetMaintenanceWindowExecutionResult {
  
  inline def apply(): GetMaintenanceWindowExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMaintenanceWindowExecutionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMaintenanceWindowExecutionResult] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatus(value: MaintenanceWindowExecutionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusDetails(value: MaintenanceWindowExecutionStatusDetails): Self = StObject.set(x, "StatusDetails", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailsUndefined: Self = StObject.set(x, "StatusDetails", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTaskIds(value: MaintenanceWindowExecutionTaskIdList): Self = StObject.set(x, "TaskIds", value.asInstanceOf[js.Any])
    
    inline def setTaskIdsUndefined: Self = StObject.set(x, "TaskIds", js.undefined)
    
    inline def setTaskIdsVarargs(value: MaintenanceWindowExecutionTaskId*): Self = StObject.set(x, "TaskIds", js.Array(value*))
    
    inline def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = StObject.set(x, "WindowExecutionId", value.asInstanceOf[js.Any])
    
    inline def setWindowExecutionIdUndefined: Self = StObject.set(x, "WindowExecutionId", js.undefined)
  }
}
