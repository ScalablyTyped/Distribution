package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestEventPatternRequest extends js.Object {
  /**
    * The event, in JSON format, to test against the event pattern.
    */
  var Event: String = js.native
  /**
    * The event pattern. For more information, see Events and Event Patterns in the Amazon EventBridge User Guide.
    */
  var EventPattern: typings.awsSdk.eventbridgeMod.EventPattern = js.native
}

object TestEventPatternRequest {
  @scala.inline
  def apply(Event: String, EventPattern: EventPattern): TestEventPatternRequest = {
    val __obj = js.Dynamic.literal(Event = Event.asInstanceOf[js.Any], EventPattern = EventPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestEventPatternRequest]
  }
  @scala.inline
  implicit class TestEventPatternRequestOps[Self <: TestEventPatternRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEvent(value: String): Self = this.set("Event", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventPattern(value: EventPattern): Self = this.set("EventPattern", value.asInstanceOf[js.Any])
  }
  
}

