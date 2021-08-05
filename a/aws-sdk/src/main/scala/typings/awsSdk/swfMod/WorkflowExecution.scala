package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowExecution extends StObject {
  
  /**
    * A system-generated unique identifier for the workflow execution.
    */
  var runId: WorkflowRunId
  
  /**
    * The user defined identifier associated with the workflow execution.
    */
  var workflowId: WorkflowId
}
object WorkflowExecution {
  
  inline def apply(runId: WorkflowRunId, workflowId: WorkflowId): WorkflowExecution = {
    val __obj = js.Dynamic.literal(runId = runId.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecution]
  }
  
  extension [Self <: WorkflowExecution](x: Self) {
    
    inline def setRunId(value: WorkflowRunId): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
  }
}
