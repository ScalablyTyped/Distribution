package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalExternalWorkflowExecutionDecisionAttributes extends StObject {
  
  /**
    * The data attached to the event that can be used by the decider in subsequent decision tasks.
    */
  var control: js.UndefOr[Data] = js.undefined
  
  /**
    *  The input data to be provided with the signal. The target workflow execution uses the signal name and input data to process the signal.
    */
  var input: js.UndefOr[Data] = js.undefined
  
  /**
    * The runId of the workflow execution to be signaled.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
  
  /**
    *  The name of the signal.The target workflow execution uses the signal name and input to process the signal.
    */
  var signalName: SignalName
  
  /**
    *  The workflowId of the workflow execution to be signaled.
    */
  var workflowId: WorkflowId
}
object SignalExternalWorkflowExecutionDecisionAttributes {
  
  inline def apply(signalName: SignalName, workflowId: WorkflowId): SignalExternalWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal(signalName = signalName.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalExternalWorkflowExecutionDecisionAttributes]
  }
  
  extension [Self <: SignalExternalWorkflowExecutionDecisionAttributes](x: Self) {
    
    inline def setControl(value: Data): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    inline def setInput(value: Data): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setRunId(value: WorkflowRunIdOptional): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
    
    inline def setRunIdUndefined: Self = StObject.set(x, "runId", js.undefined)
    
    inline def setSignalName(value: SignalName): Self = StObject.set(x, "signalName", value.asInstanceOf[js.Any])
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
  }
}
