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
  def apply(scheduledEventId: EventId, startedEventId: EventId): LambdaFunctionTimedOutEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionTimedOutEventAttributes]
  }
  @scala.inline
  implicit class LambdaFunctionTimedOutEventAttributesOps[Self <: LambdaFunctionTimedOutEventAttributes] (val x: Self) extends AnyVal {
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
    def setScheduledEventId(value: EventId): Self = this.set("scheduledEventId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartedEventId(value: EventId): Self = this.set("startedEventId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeoutType(value: LambdaFunctionTimeoutType): Self = this.set("timeoutType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutType: Self = this.set("timeoutType", js.undefined)
  }
  
}

