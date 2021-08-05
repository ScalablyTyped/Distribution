package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalWorkflowExecutionInput extends StObject {
  
  /**
    * The name of the domain containing the workflow execution to signal.
    */
  var domain: DomainName
  
  /**
    * Data to attach to the WorkflowExecutionSignaled event in the target workflow execution's history.
    */
  var input: js.UndefOr[Data] = js.undefined
  
  /**
    * The runId of the workflow execution to signal.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
  
  /**
    * The name of the signal. This name must be meaningful to the target workflow.
    */
  var signalName: SignalName
  
  /**
    * The workflowId of the workflow execution to signal.
    */
  var workflowId: WorkflowId
}
object SignalWorkflowExecutionInput {
  
  inline def apply(domain: DomainName, signalName: SignalName, workflowId: WorkflowId): SignalWorkflowExecutionInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], signalName = signalName.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalWorkflowExecutionInput]
  }
  
  extension [Self <: SignalWorkflowExecutionInput](x: Self) {
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setInput(value: Data): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setRunId(value: WorkflowRunIdOptional): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
    
    inline def setRunIdUndefined: Self = StObject.set(x, "runId", js.undefined)
    
    inline def setSignalName(value: SignalName): Self = StObject.set(x, "signalName", value.asInstanceOf[js.Any])
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
  }
}
