package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDetectMitigationActionsTaskRequest extends StObject {
  
  /**
    *  The unique identifier of the task. 
    */
  var taskId: MitigationActionsTaskId
}
object DescribeDetectMitigationActionsTaskRequest {
  
  inline def apply(taskId: MitigationActionsTaskId): DescribeDetectMitigationActionsTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDetectMitigationActionsTaskRequest]
  }
  
  extension [Self <: DescribeDetectMitigationActionsTaskRequest](x: Self) {
    
    inline def setTaskId(value: MitigationActionsTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
