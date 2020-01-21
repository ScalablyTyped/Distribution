package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaFunctionTimedOutEventAttributes extends js.Object {
  /**
    * The ID of the LambdaFunctionScheduled event that was recorded when this activity task was scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId = js.native
  /**
    * The ID of the ActivityTaskStarted event that was recorded when this activity task started. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var startedEventId: EventId = js.native
  /**
    * The type of the timeout that caused this event.
    */
  var timeoutType: js.UndefOr[LambdaFunctionTimeoutType] = js.native
}

object LambdaFunctionTimedOutEventAttributes {
  @scala.inline
  def apply(scheduledEventId: EventId, startedEventId: EventId, timeoutType: LambdaFunctionTimeoutType = null): LambdaFunctionTimedOutEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any])
    if (timeoutType != null) __obj.updateDynamic("timeoutType")(timeoutType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionTimedOutEventAttributes]
  }
}

