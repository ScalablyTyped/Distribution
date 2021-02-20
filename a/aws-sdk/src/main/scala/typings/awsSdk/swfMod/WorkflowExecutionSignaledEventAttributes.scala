package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowExecutionSignaledEventAttributes extends StObject {
  
  /**
    * The ID of the SignalExternalWorkflowExecutionInitiated event corresponding to the SignalExternalWorkflow decision to signal this workflow execution.The source event with this ID can be found in the history of the source workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event. This field is set only if the signal was initiated by another workflow execution.
    */
  var externalInitiatedEventId: js.UndefOr[EventId] = js.native
  
  /**
    * The workflow execution that sent the signal. This is set only of the signal was sent by another workflow execution.
    */
  var externalWorkflowExecution: js.UndefOr[WorkflowExecution] = js.native
  
  /**
    * The inputs provided with the signal. The decider can use the signal name and inputs to determine how to process the signal.
    */
  var input: js.UndefOr[Data] = js.native
  
  /**
    * The name of the signal received. The decider can use the signal name and inputs to determine how to the process the signal.
    */
  var signalName: SignalName = js.native
}
object WorkflowExecutionSignaledEventAttributes {
  
  @scala.inline
  def apply(signalName: SignalName): WorkflowExecutionSignaledEventAttributes = {
    val __obj = js.Dynamic.literal(signalName = signalName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionSignaledEventAttributes]
  }
  
  @scala.inline
  implicit class WorkflowExecutionSignaledEventAttributesMutableBuilder[Self <: WorkflowExecutionSignaledEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalInitiatedEventId(value: EventId): Self = StObject.set(x, "externalInitiatedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalInitiatedEventIdUndefined: Self = StObject.set(x, "externalInitiatedEventId", js.undefined)
    
    @scala.inline
    def setExternalWorkflowExecution(value: WorkflowExecution): Self = StObject.set(x, "externalWorkflowExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalWorkflowExecutionUndefined: Self = StObject.set(x, "externalWorkflowExecution", js.undefined)
    
    @scala.inline
    def setInput(value: Data): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setSignalName(value: SignalName): Self = StObject.set(x, "signalName", value.asInstanceOf[js.Any])
  }
}
