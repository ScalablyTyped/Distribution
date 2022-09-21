package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTaskSetResponse extends StObject {
  
  /**
    * Information about a set of Amazon ECS tasks in either an CodeDeploy or an EXTERNAL deployment. A task set includes details such as the desired number of tasks, how many tasks are running, and whether the task set serves production traffic.
    */
  var taskSet: js.UndefOr[TaskSet] = js.undefined
}
object CreateTaskSetResponse {
  
  inline def apply(): CreateTaskSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTaskSetResponse]
  }
  
  extension [Self <: CreateTaskSetResponse](x: Self) {
    
    inline def setTaskSet(value: TaskSet): Self = StObject.set(x, "taskSet", value.asInstanceOf[js.Any])
    
    inline def setTaskSetUndefined: Self = StObject.set(x, "taskSet", js.undefined)
  }
}
