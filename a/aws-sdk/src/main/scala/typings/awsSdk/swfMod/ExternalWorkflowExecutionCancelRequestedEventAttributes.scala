package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalWorkflowExecutionCancelRequestedEventAttributes extends StObject {
  
  /**
    * The ID of the RequestCancelExternalWorkflowExecutionInitiated event corresponding to the RequestCancelExternalWorkflowExecution decision to cancel this external workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var initiatedEventId: EventId
  
  /**
    * The external workflow execution to which the cancellation request was delivered.
    */
  var workflowExecution: WorkflowExecution
}
object ExternalWorkflowExecutionCancelRequestedEventAttributes {
  
  @scala.inline
  def apply(initiatedEventId: EventId, workflowExecution: WorkflowExecution): ExternalWorkflowExecutionCancelRequestedEventAttributes = {
    val __obj = js.Dynamic.literal(initiatedEventId = initiatedEventId.asInstanceOf[js.Any], workflowExecution = workflowExecution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalWorkflowExecutionCancelRequestedEventAttributes]
  }
  
  @scala.inline
  implicit class ExternalWorkflowExecutionCancelRequestedEventAttributesMutableBuilder[Self <: ExternalWorkflowExecutionCancelRequestedEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitiatedEventId(value: EventId): Self = StObject.set(x, "initiatedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowExecution(value: WorkflowExecution): Self = StObject.set(x, "workflowExecution", value.asInstanceOf[js.Any])
  }
}
