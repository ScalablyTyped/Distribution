package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowExecutionCount extends StObject {
  
  /**
    * The number of workflow executions.
    */
  var count: Count = js.native
  
  /**
    * If set to true, indicates that the actual count was more than the maximum supported by this API and the count returned is the truncated value.
    */
  var truncated: js.UndefOr[Truncated] = js.native
}
object WorkflowExecutionCount {
  
  @scala.inline
  def apply(count: Count): WorkflowExecutionCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionCount]
  }
  
  @scala.inline
  implicit class WorkflowExecutionCountMutableBuilder[Self <: WorkflowExecutionCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Count): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncated(value: Truncated): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncatedUndefined: Self = StObject.set(x, "truncated", js.undefined)
  }
}
