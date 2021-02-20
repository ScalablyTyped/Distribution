package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartTaskResponse extends StObject {
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.native
  
  /**
    * A full description of the tasks that were started. Each task that was successfully placed on your container instances is described.
    */
  var tasks: js.UndefOr[Tasks] = js.native
}
object StartTaskResponse {
  
  @scala.inline
  def apply(): StartTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTaskResponse]
  }
  
  @scala.inline
  implicit class StartTaskResponseMutableBuilder[Self <: StartTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailures(value: Failures): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    @scala.inline
    def setFailuresVarargs(value: Failure*): Self = StObject.set(x, "failures", js.Array(value :_*))
    
    @scala.inline
    def setTasks(value: Tasks): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    @scala.inline
    def setTasksVarargs(value: Task*): Self = StObject.set(x, "tasks", js.Array(value :_*))
  }
}
