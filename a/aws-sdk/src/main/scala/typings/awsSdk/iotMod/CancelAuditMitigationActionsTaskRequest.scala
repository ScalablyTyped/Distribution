package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelAuditMitigationActionsTaskRequest extends StObject {
  
  /**
    * The unique identifier for the task that you want to cancel. 
    */
  var taskId: MitigationActionsTaskId
}
object CancelAuditMitigationActionsTaskRequest {
  
  inline def apply(taskId: MitigationActionsTaskId): CancelAuditMitigationActionsTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelAuditMitigationActionsTaskRequest]
  }
  
  extension [Self <: CancelAuditMitigationActionsTaskRequest](x: Self) {
    
    inline def setTaskId(value: MitigationActionsTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
