package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalExternalWorkflowExecutionInitiatedEventAttributes extends StObject {
  
  /**
    * Data attached to the event that can be used by the decider in subsequent decision tasks.
    */
  var control: js.UndefOr[Data] = js.undefined
  
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the SignalExternalWorkflowExecution decision for this signal. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId
  
  /**
    * The input provided to the signal.
    */
  var input: js.UndefOr[Data] = js.undefined
  
  /**
    * The runId of the external workflow execution to send the signal to.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
  
  /**
    * The name of the signal.
    */
  var signalName: SignalName
  
  /**
    * The workflowId of the external workflow execution.
    */
  var workflowId: WorkflowId
}
object SignalExternalWorkflowExecutionInitiatedEventAttributes {
  
  inline def apply(decisionTaskCompletedEventId: EventId, signalName: SignalName, workflowId: WorkflowId): SignalExternalWorkflowExecutionInitiatedEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], signalName = signalName.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalExternalWorkflowExecutionInitiatedEventAttributes]
  }
  
  extension [Self <: SignalExternalWorkflowExecutionInitiatedEventAttributes](x: Self) {
    
    inline def setControl(value: Data): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    inline def setDecisionTaskCompletedEventId(value: EventId): Self = StObject.set(x, "decisionTaskCompletedEventId", value.asInstanceOf[js.Any])
    
    inline def setInput(value: Data): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setRunId(value: WorkflowRunIdOptional): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
    
    inline def setRunIdUndefined: Self = StObject.set(x, "runId", js.undefined)
    
    inline def setSignalName(value: SignalName): Self = StObject.set(x, "signalName", value.asInstanceOf[js.Any])
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
  }
}
