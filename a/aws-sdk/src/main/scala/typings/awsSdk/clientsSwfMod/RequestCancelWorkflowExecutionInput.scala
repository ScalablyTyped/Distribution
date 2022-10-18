package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestCancelWorkflowExecutionInput extends StObject {
  
  /**
    * The name of the domain containing the workflow execution to cancel.
    */
  var domain: DomainName
  
  /**
    * The runId of the workflow execution to cancel.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
  
  /**
    * The workflowId of the workflow execution to cancel.
    */
  var workflowId: WorkflowId
}
object RequestCancelWorkflowExecutionInput {
  
  inline def apply(domain: DomainName, workflowId: WorkflowId): RequestCancelWorkflowExecutionInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCancelWorkflowExecutionInput]
  }
  
  extension [Self <: RequestCancelWorkflowExecutionInput](x: Self) {
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setRunId(value: WorkflowRunIdOptional): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
    
    inline def setRunIdUndefined: Self = StObject.set(x, "runId", js.undefined)
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
  }
}
