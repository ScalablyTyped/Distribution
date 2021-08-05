package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelAuditTaskRequest extends StObject {
  
  /**
    * The ID of the audit you want to cancel. You can only cancel an audit that is "IN_PROGRESS".
    */
  var taskId: AuditTaskId
}
object CancelAuditTaskRequest {
  
  inline def apply(taskId: AuditTaskId): CancelAuditTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelAuditTaskRequest]
  }
  
  extension [Self <: CancelAuditTaskRequest](x: Self) {
    
    inline def setTaskId(value: AuditTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
