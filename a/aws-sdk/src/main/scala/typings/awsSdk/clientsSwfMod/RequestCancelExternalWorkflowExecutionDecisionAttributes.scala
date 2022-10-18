package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestCancelExternalWorkflowExecutionDecisionAttributes extends StObject {
  
  /**
    * The data attached to the event that can be used by the decider in subsequent workflow tasks.
    */
  var control: js.UndefOr[Data] = js.undefined
  
  /**
    * The runId of the external workflow execution to cancel.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
  
  /**
    *  The workflowId of the external workflow execution to cancel.
    */
  var workflowId: WorkflowId
}
object RequestCancelExternalWorkflowExecutionDecisionAttributes {
  
  inline def apply(workflowId: WorkflowId): RequestCancelExternalWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal(workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCancelExternalWorkflowExecutionDecisionAttributes]
  }
  
  extension [Self <: RequestCancelExternalWorkflowExecutionDecisionAttributes](x: Self) {
    
    inline def setControl(value: Data): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    inline def setRunId(value: WorkflowRunIdOptional): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
    
    inline def setRunIdUndefined: Self = StObject.set(x, "runId", js.undefined)
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
  }
}
