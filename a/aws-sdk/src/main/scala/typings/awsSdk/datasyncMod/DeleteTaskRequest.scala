package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTaskRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the task to delete.
    */
  var TaskArn: typings.awsSdk.datasyncMod.TaskArn
}
object DeleteTaskRequest {
  
  inline def apply(TaskArn: TaskArn): DeleteTaskRequest = {
    val __obj = js.Dynamic.literal(TaskArn = TaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTaskRequest]
  }
  
  extension [Self <: DeleteTaskRequest](x: Self) {
    
    inline def setTaskArn(value: TaskArn): Self = StObject.set(x, "TaskArn", value.asInstanceOf[js.Any])
  }
}
