package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignalExternalWorkflowExecutionInitiatedEventAttributes extends StObject {
  
  /**
    * Data attached to the event that can be used by the decider in subsequent decision tasks.
    */
  var control: js.UndefOr[Data] = js.native
  
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the SignalExternalWorkflowExecution decision for this signal. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
  
  /**
    * The input provided to the signal.
    */
  var input: js.UndefOr[Data] = js.native
  
  /**
    * The runId of the external workflow execution to send the signal to.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.native
  
  /**
    * The name of the signal.
    */
  var signalName: SignalName = js.native
  
  /**
    * The workflowId of the external workflow execution.
    */
  var workflowId: WorkflowId = js.native
}
object SignalExternalWorkflowExecutionInitiatedEventAttributes {
  
  @scala.inline
  def apply(decisionTaskCompletedEventId: EventId, signalName: SignalName, workflowId: WorkflowId): SignalExternalWorkflowExecutionInitiatedEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], signalName = signalName.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalExternalWorkflowExecutionInitiatedEventAttributes]
  }
  
  @scala.inline
  implicit class SignalExternalWorkflowExecutionInitiatedEventAttributesMutableBuilder[Self <: SignalExternalWorkflowExecutionInitiatedEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControl(value: Data): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    @scala.inline
    def setDecisionTaskCompletedEventId(value: EventId): Self = StObject.set(x, "decisionTaskCompletedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: Data): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setRunId(value: WorkflowRunIdOptional): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunIdUndefined: Self = StObject.set(x, "runId", js.undefined)
    
    @scala.inline
    def setSignalName(value: SignalName): Self = StObject.set(x, "signalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
  }
}
