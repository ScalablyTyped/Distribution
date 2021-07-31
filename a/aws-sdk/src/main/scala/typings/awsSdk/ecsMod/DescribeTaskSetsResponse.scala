package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTaskSetsResponse extends StObject {
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.undefined
  
  /**
    * The list of task sets described.
    */
  var taskSets: js.UndefOr[TaskSets] = js.undefined
}
object DescribeTaskSetsResponse {
  
  @scala.inline
  def apply(): DescribeTaskSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTaskSetsResponse]
  }
  
  @scala.inline
  implicit class DescribeTaskSetsResponseMutableBuilder[Self <: DescribeTaskSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailures(value: Failures): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    @scala.inline
    def setFailuresVarargs(value: Failure*): Self = StObject.set(x, "failures", js.Array(value :_*))
    
    @scala.inline
    def setTaskSets(value: TaskSets): Self = StObject.set(x, "taskSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskSetsUndefined: Self = StObject.set(x, "taskSets", js.undefined)
    
    @scala.inline
    def setTaskSetsVarargs(value: TaskSet*): Self = StObject.set(x, "taskSets", js.Array(value :_*))
  }
}
