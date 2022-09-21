package typings.awsSdk.snowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTasksOutput extends StObject {
  
  /**
    * A pagination token to continue to the next page of tasks.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of task structures containing details about each task.
    */
  var tasks: js.UndefOr[TaskSummaryList] = js.undefined
}
object ListTasksOutput {
  
  inline def apply(): ListTasksOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTasksOutput]
  }
  
  extension [Self <: ListTasksOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTasks(value: TaskSummaryList): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    inline def setTasksVarargs(value: TaskSummary*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
