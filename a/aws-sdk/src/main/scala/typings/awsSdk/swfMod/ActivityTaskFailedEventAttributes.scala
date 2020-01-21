package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityTaskFailedEventAttributes extends js.Object {
  /**
    * The details of the failure.
    */
  var details: js.UndefOr[Data] = js.native
  /**
    * The reason provided for the failure.
    */
  var reason: js.UndefOr[FailureReason] = js.native
  /**
    * The ID of the ActivityTaskScheduled event that was recorded when this activity task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId = js.native
  /**
    * The ID of the ActivityTaskStarted event recorded when this activity task was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId = js.native
}

object ActivityTaskFailedEventAttributes {
  @scala.inline
  def apply(
    scheduledEventId: EventId,
    startedEventId: EventId,
    details: Data = null,
    reason: FailureReason = null
  ): ActivityTaskFailedEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTaskFailedEventAttributes]
  }
}

