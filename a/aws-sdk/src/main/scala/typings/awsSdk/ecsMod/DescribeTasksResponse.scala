package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTasksResponse extends StObject {
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.undefined
  
  /**
    * The list of tasks.
    */
  var tasks: js.UndefOr[Tasks] = js.undefined
}
object DescribeTasksResponse {
  
  @scala.inline
  def apply(): DescribeTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTasksResponse]
  }
  
  @scala.inline
  implicit class DescribeTasksResponseMutableBuilder[Self <: DescribeTasksResponse] (val x: Self) extends AnyVal {
    
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
