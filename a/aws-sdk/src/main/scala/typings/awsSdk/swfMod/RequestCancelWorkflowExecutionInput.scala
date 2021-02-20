package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestCancelWorkflowExecutionInput extends StObject {
  
  /**
    * The name of the domain containing the workflow execution to cancel.
    */
  var domain: DomainName = js.native
  
  /**
    * The runId of the workflow execution to cancel.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.native
  
  /**
    * The workflowId of the workflow execution to cancel.
    */
  var workflowId: WorkflowId = js.native
}
object RequestCancelWorkflowExecutionInput {
  
  @scala.inline
  def apply(domain: DomainName, workflowId: WorkflowId): RequestCancelWorkflowExecutionInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCancelWorkflowExecutionInput]
  }
  
  @scala.inline
  implicit class RequestCancelWorkflowExecutionInputMutableBuilder[Self <: RequestCancelWorkflowExecutionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunId(value: WorkflowRunIdOptional): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunIdUndefined: Self = StObject.set(x, "runId", js.undefined)
    
    @scala.inline
    def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
  }
}
