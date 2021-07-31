package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditMitigationActionExecutionMetadata extends StObject {
  
  /**
    * The unique identifier for the mitigation action being applied by the task.
    */
  var actionId: js.UndefOr[MitigationActionId] = js.undefined
  
  /**
    * The friendly name of the mitigation action being applied by the task.
    */
  var actionName: js.UndefOr[MitigationActionName] = js.undefined
  
  /**
    * The date and time when the task was completed or canceled. Blank if the task is still running.
    */
  var endTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * If an error occurred, the code that indicates which type of error occurred.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.undefined
  
  /**
    * The unique identifier for the findings to which the task and associated mitigation action are applied.
    */
  var findingId: js.UndefOr[FindingId] = js.undefined
  
  /**
    * If an error occurred, a message that describes the error.
    */
  var message: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The date and time when the task was started.
    */
  var startTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The current status of the task being executed.
    */
  var status: js.UndefOr[AuditMitigationActionsExecutionStatus] = js.undefined
  
  /**
    * The unique identifier for the task that applies the mitigation action.
    */
  var taskId: js.UndefOr[AuditMitigationActionsTaskId] = js.undefined
}
object AuditMitigationActionExecutionMetadata {
  
  @scala.inline
  def apply(): AuditMitigationActionExecutionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditMitigationActionExecutionMetadata]
  }
  
  @scala.inline
  implicit class AuditMitigationActionExecutionMetadataMutableBuilder[Self <: AuditMitigationActionExecutionMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionId(value: MitigationActionId): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    @scala.inline
    def setActionName(value: MitigationActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNameUndefined: Self = StObject.set(x, "actionName", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setFindingId(value: FindingId): Self = StObject.set(x, "findingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingIdUndefined: Self = StObject.set(x, "findingId", js.undefined)
    
    @scala.inline
    def setMessage(value: ErrorMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: AuditMitigationActionsExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTaskId(value: AuditMitigationActionsTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
