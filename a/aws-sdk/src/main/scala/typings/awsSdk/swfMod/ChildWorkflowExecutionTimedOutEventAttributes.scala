package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildWorkflowExecutionTimedOutEventAttributes extends StObject {
  
  /**
    * The ID of the StartChildWorkflowExecutionInitiated event corresponding to the StartChildWorkflowExecution Decision to start this child workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var initiatedEventId: EventId
  
  /**
    * The ID of the ChildWorkflowExecutionStarted event recorded when this child workflow execution was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId
  
  /**
    * The type of the timeout that caused the child workflow execution to time out.
    */
  var timeoutType: WorkflowExecutionTimeoutType
  
  /**
    * The child workflow execution that timed out.
    */
  var workflowExecution: WorkflowExecution
  
  /**
    * The type of the child workflow execution.
    */
  var workflowType: WorkflowType
}
object ChildWorkflowExecutionTimedOutEventAttributes {
  
  @scala.inline
  def apply(
    initiatedEventId: EventId,
    startedEventId: EventId,
    timeoutType: WorkflowExecutionTimeoutType,
    workflowExecution: WorkflowExecution,
    workflowType: WorkflowType
  ): ChildWorkflowExecutionTimedOutEventAttributes = {
    val __obj = js.Dynamic.literal(initiatedEventId = initiatedEventId.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any], timeoutType = timeoutType.asInstanceOf[js.Any], workflowExecution = workflowExecution.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildWorkflowExecutionTimedOutEventAttributes]
  }
  
  @scala.inline
  implicit class ChildWorkflowExecutionTimedOutEventAttributesMutableBuilder[Self <: ChildWorkflowExecutionTimedOutEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitiatedEventId(value: EventId): Self = StObject.set(x, "initiatedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedEventId(value: EventId): Self = StObject.set(x, "startedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutType(value: WorkflowExecutionTimeoutType): Self = StObject.set(x, "timeoutType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowExecution(value: WorkflowExecution): Self = StObject.set(x, "workflowExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowType(value: WorkflowType): Self = StObject.set(x, "workflowType", value.asInstanceOf[js.Any])
  }
}
