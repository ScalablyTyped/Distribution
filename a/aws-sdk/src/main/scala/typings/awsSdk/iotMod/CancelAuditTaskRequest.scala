package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelAuditTaskRequest extends StObject {
  
  /**
    * The ID of the audit you want to cancel. You can only cancel an audit that is "IN_PROGRESS".
    */
  var taskId: AuditTaskId = js.native
}
object CancelAuditTaskRequest {
  
  @scala.inline
  def apply(taskId: AuditTaskId): CancelAuditTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelAuditTaskRequest]
  }
  
  @scala.inline
  implicit class CancelAuditTaskRequestMutableBuilder[Self <: CancelAuditTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskId(value: AuditTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
