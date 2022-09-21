package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelDetectMitigationActionsTaskRequest extends StObject {
  
  /**
    *  The unique identifier of the task. 
    */
  var taskId: MitigationActionsTaskId
}
object CancelDetectMitigationActionsTaskRequest {
  
  inline def apply(taskId: MitigationActionsTaskId): CancelDetectMitigationActionsTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelDetectMitigationActionsTaskRequest]
  }
  
  extension [Self <: CancelDetectMitigationActionsTaskRequest](x: Self) {
    
    inline def setTaskId(value: MitigationActionsTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
