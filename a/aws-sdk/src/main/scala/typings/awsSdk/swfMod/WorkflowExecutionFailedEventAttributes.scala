package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionFailedEventAttributes extends js.Object {
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the FailWorkflowExecution decision to fail this execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
  /**
    * The details of the failure.
    */
  var details: js.UndefOr[Data] = js.native
  /**
    * The descriptive reason provided for the failure.
    */
  var reason: js.UndefOr[FailureReason] = js.native
}

object WorkflowExecutionFailedEventAttributes {
  @scala.inline
  def apply(decisionTaskCompletedEventId: EventId, details: Data = null, reason: FailureReason = null): WorkflowExecutionFailedEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionFailedEventAttributes]
  }
}

