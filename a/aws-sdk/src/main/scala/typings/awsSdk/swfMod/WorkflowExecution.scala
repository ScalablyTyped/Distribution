package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowExecution extends StObject {
  
  /**
    * A system-generated unique identifier for the workflow execution.
    */
  var runId: WorkflowRunId = js.native
  
  /**
    * The user defined identifier associated with the workflow execution.
    */
  var workflowId: WorkflowId = js.native
}
object WorkflowExecution {
  
  @scala.inline
  def apply(runId: WorkflowRunId, workflowId: WorkflowId): WorkflowExecution = {
    val __obj = js.Dynamic.literal(runId = runId.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecution]
  }
  
  @scala.inline
  implicit class WorkflowExecutionMutableBuilder[Self <: WorkflowExecution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRunId(value: WorkflowRunId): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
  }
}
