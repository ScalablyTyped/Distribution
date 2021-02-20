package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowExecutionFilter extends StObject {
  
  /**
    * The workflowId to pass of match the criteria of this filter.
    */
  var workflowId: WorkflowId = js.native
}
object WorkflowExecutionFilter {
  
  @scala.inline
  def apply(workflowId: WorkflowId): WorkflowExecutionFilter = {
    val __obj = js.Dynamic.literal(workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionFilter]
  }
  
  @scala.inline
  implicit class WorkflowExecutionFilterMutableBuilder[Self <: WorkflowExecutionFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
  }
}
