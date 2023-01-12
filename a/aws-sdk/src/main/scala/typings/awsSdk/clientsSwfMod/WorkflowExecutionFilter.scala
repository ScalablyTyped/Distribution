package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowExecutionFilter extends StObject {
  
  /**
    * The workflowId to pass of match the criteria of this filter.
    */
  var workflowId: WorkflowId
}
object WorkflowExecutionFilter {
  
  inline def apply(workflowId: WorkflowId): WorkflowExecutionFilter = {
    val __obj = js.Dynamic.literal(workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkflowExecutionFilter] (val x: Self) extends AnyVal {
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
  }
}
