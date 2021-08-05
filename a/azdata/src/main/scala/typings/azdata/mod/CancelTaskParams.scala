package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelTaskParams extends StObject {
  
  var taskId: String
}
object CancelTaskParams {
  
  inline def apply(taskId: String): CancelTaskParams = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelTaskParams]
  }
  
  extension [Self <: CancelTaskParams](x: Self) {
    
    inline def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
