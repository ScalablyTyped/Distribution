package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectMitigationActionExecution extends StObject {
  
  /**
    *  The friendly name that uniquely identifies the mitigation action. 
    */
  var actionName: js.UndefOr[MitigationActionName] = js.undefined
  
  /**
    *  The error code of a mitigation action. 
    */
  var errorCode: js.UndefOr[DetectMitigationActionExecutionErrorCode] = js.undefined
  
  /**
    *  The date a mitigation action ended. 
    */
  var executionEndDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The date a mitigation action was started. 
    */
  var executionStartDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The message of a mitigation action. 
    */
  var message: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    *  The status of a mitigation action. 
    */
  var status: js.UndefOr[DetectMitigationActionExecutionStatus] = js.undefined
  
  /**
    *  The unique identifier of the task. 
    */
  var taskId: js.UndefOr[MitigationActionsTaskId] = js.undefined
  
  /**
    *  The name of the thing. 
    */
  var thingName: js.UndefOr[DeviceDefenderThingName] = js.undefined
  
  /**
    *  The unique identifier of the violation. 
    */
  var violationId: js.UndefOr[ViolationId] = js.undefined
}
object DetectMitigationActionExecution {
  
  inline def apply(): DetectMitigationActionExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectMitigationActionExecution]
  }
  
  extension [Self <: DetectMitigationActionExecution](x: Self) {
    
    inline def setActionName(value: MitigationActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    inline def setActionNameUndefined: Self = StObject.set(x, "actionName", js.undefined)
    
    inline def setErrorCode(value: DetectMitigationActionExecutionErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setExecutionEndDate(value: js.Date): Self = StObject.set(x, "executionEndDate", value.asInstanceOf[js.Any])
    
    inline def setExecutionEndDateUndefined: Self = StObject.set(x, "executionEndDate", js.undefined)
    
    inline def setExecutionStartDate(value: js.Date): Self = StObject.set(x, "executionStartDate", value.asInstanceOf[js.Any])
    
    inline def setExecutionStartDateUndefined: Self = StObject.set(x, "executionStartDate", js.undefined)
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setStatus(value: DetectMitigationActionExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTaskId(value: MitigationActionsTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
    
    inline def setThingName(value: DeviceDefenderThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    inline def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
    
    inline def setViolationId(value: ViolationId): Self = StObject.set(x, "violationId", value.asInstanceOf[js.Any])
    
    inline def setViolationIdUndefined: Self = StObject.set(x, "violationId", js.undefined)
  }
}
