package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildWorkflowExecutionTerminatedEventAttributes extends StObject {
  
  /**
    * The ID of the StartChildWorkflowExecutionInitiated event corresponding to the StartChildWorkflowExecution Decision to start this child workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var initiatedEventId: EventId
  
  /**
    * The ID of the ChildWorkflowExecutionStarted event recorded when this child workflow execution was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId
  
  /**
    * The child workflow execution that was terminated.
    */
  var workflowExecution: WorkflowExecution
  
  /**
    * The type of the child workflow execution.
    */
  var workflowType: WorkflowType
}
object ChildWorkflowExecutionTerminatedEventAttributes {
  
  @scala.inline
  def apply(
    initiatedEventId: EventId,
    startedEventId: EventId,
    workflowExecution: WorkflowExecution,
    workflowType: WorkflowType
  ): ChildWorkflowExecutionTerminatedEventAttributes = {
    val __obj = js.Dynamic.literal(initiatedEventId = initiatedEventId.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any], workflowExecution = workflowExecution.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildWorkflowExecutionTerminatedEventAttributes]
  }
  
  @scala.inline
  implicit class ChildWorkflowExecutionTerminatedEventAttributesMutableBuilder[Self <: ChildWorkflowExecutionTerminatedEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitiatedEventId(value: EventId): Self = StObject.set(x, "initiatedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedEventId(value: EventId): Self = StObject.set(x, "startedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowExecution(value: WorkflowExecution): Self = StObject.set(x, "workflowExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowType(value: WorkflowType): Self = StObject.set(x, "workflowType", value.asInstanceOf[js.Any])
  }
}
