package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditMitigationActionsTaskMetadata extends StObject {
  
  /**
    * The time at which the audit mitigation actions task was started.
    */
  var startTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The unique identifier for the task.
    */
  var taskId: js.UndefOr[AuditMitigationActionsTaskId] = js.undefined
  
  /**
    * The current state of the audit mitigation actions task.
    */
  var taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus] = js.undefined
}
object AuditMitigationActionsTaskMetadata {
  
  @scala.inline
  def apply(): AuditMitigationActionsTaskMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditMitigationActionsTaskMetadata]
  }
  
  @scala.inline
  implicit class AuditMitigationActionsTaskMetadataMutableBuilder[Self <: AuditMitigationActionsTaskMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setTaskId(value: AuditMitigationActionsTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
    
    @scala.inline
    def setTaskStatus(value: AuditMitigationActionsTaskStatus): Self = StObject.set(x, "taskStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskStatusUndefined: Self = StObject.set(x, "taskStatus", js.undefined)
  }
}
