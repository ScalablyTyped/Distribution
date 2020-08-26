package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityTaskCancelRequestedEventAttributes extends js.Object {
  /**
    * The unique ID of the task.
    */
  var activityId: ActivityId = js.native
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the RequestCancelActivityTask decision for this cancellation request. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
}

object ActivityTaskCancelRequestedEventAttributes {
  @scala.inline
  def apply(activityId: ActivityId, decisionTaskCompletedEventId: EventId): ActivityTaskCancelRequestedEventAttributes = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTaskCancelRequestedEventAttributes]
  }
  @scala.inline
  implicit class ActivityTaskCancelRequestedEventAttributesOps[Self <: ActivityTaskCancelRequestedEventAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActivityId(value: ActivityId): Self = this.set("activityId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecisionTaskCompletedEventId(value: EventId): Self = this.set("decisionTaskCompletedEventId", value.asInstanceOf[js.Any])
  }
  
}

