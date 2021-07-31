package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTasksResponse extends StObject {
  
  /**
    * An opaque string that indicates the position at which to begin returning the next list of tasks.
    */
  var NextToken: js.UndefOr[typings.awsSdk.datasyncMod.NextToken] = js.undefined
  
  /**
    * A list of all the tasks that are returned.
    */
  var Tasks: js.UndefOr[TaskList] = js.undefined
}
object ListTasksResponse {
  
  @scala.inline
  def apply(): ListTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTasksResponse]
  }
  
  @scala.inline
  implicit class ListTasksResponseMutableBuilder[Self <: ListTasksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTasks(value: TaskList): Self = StObject.set(x, "Tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksUndefined: Self = StObject.set(x, "Tasks", js.undefined)
    
    @scala.inline
    def setTasksVarargs(value: TaskListEntry*): Self = StObject.set(x, "Tasks", js.Array(value :_*))
  }
}
