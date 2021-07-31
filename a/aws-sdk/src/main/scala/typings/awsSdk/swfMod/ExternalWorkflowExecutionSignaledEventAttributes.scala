package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalWorkflowExecutionSignaledEventAttributes extends StObject {
  
  /**
    * The ID of the SignalExternalWorkflowExecutionInitiated event corresponding to the SignalExternalWorkflowExecution decision to request this signal. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var initiatedEventId: EventId
  
  /**
    * The external workflow execution that the signal was delivered to.
    */
  var workflowExecution: WorkflowExecution
}
object ExternalWorkflowExecutionSignaledEventAttributes {
  
  @scala.inline
  def apply(initiatedEventId: EventId, workflowExecution: WorkflowExecution): ExternalWorkflowExecutionSignaledEventAttributes = {
    val __obj = js.Dynamic.literal(initiatedEventId = initiatedEventId.asInstanceOf[js.Any], workflowExecution = workflowExecution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalWorkflowExecutionSignaledEventAttributes]
  }
  
  @scala.inline
  implicit class ExternalWorkflowExecutionSignaledEventAttributesMutableBuilder[Self <: ExternalWorkflowExecutionSignaledEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitiatedEventId(value: EventId): Self = StObject.set(x, "initiatedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowExecution(value: WorkflowExecution): Self = StObject.set(x, "workflowExecution", value.asInstanceOf[js.Any])
  }
}
