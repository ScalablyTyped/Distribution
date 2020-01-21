package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildWorkflowExecutionTimedOutEventAttributes extends js.Object {
  /**
    * The ID of the StartChildWorkflowExecutionInitiated event corresponding to the StartChildWorkflowExecution Decision to start this child workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var initiatedEventId: EventId = js.native
  /**
    * The ID of the ChildWorkflowExecutionStarted event recorded when this child workflow execution was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId = js.native
  /**
    * The type of the timeout that caused the child workflow execution to time out.
    */
  var timeoutType: WorkflowExecutionTimeoutType = js.native
  /**
    * The child workflow execution that timed out.
    */
  var workflowExecution: WorkflowExecution = js.native
  /**
    * The type of the child workflow execution.
    */
  var workflowType: WorkflowType = js.native
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
}

