package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelAuditMitigationActionsTaskRequest extends StObject {
  
  /**
    * The unique identifier for the task that you want to cancel. 
    */
  var taskId: AuditMitigationActionsTaskId = js.native
}
object CancelAuditMitigationActionsTaskRequest {
  
  @scala.inline
  def apply(taskId: AuditMitigationActionsTaskId): CancelAuditMitigationActionsTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelAuditMitigationActionsTaskRequest]
  }
  
  @scala.inline
  implicit class CancelAuditMitigationActionsTaskRequestMutableBuilder[Self <: CancelAuditMitigationActionsTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskId(value: AuditMitigationActionsTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
