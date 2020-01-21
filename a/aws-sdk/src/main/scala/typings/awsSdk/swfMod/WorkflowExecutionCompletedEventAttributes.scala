package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionCompletedEventAttributes extends js.Object {
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the CompleteWorkflowExecution decision to complete this execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
  /**
    * The result produced by the workflow execution upon successful completion.
    */
  var result: js.UndefOr[Data] = js.native
}

object WorkflowExecutionCompletedEventAttributes {
  @scala.inline
  def apply(decisionTaskCompletedEventId: EventId, result: Data = null): WorkflowExecutionCompletedEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionCompletedEventAttributes]
  }
}

