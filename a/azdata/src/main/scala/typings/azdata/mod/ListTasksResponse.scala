package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTasksResponse extends StObject {
  
  var tasks: js.Array[TaskInfo]
}
object ListTasksResponse {
  
  inline def apply(tasks: js.Array[TaskInfo]): ListTasksResponse = {
    val __obj = js.Dynamic.literal(tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTasksResponse]
  }
  
  extension [Self <: ListTasksResponse](x: Self) {
    
    inline def setTasks(value: js.Array[TaskInfo]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksVarargs(value: TaskInfo*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
