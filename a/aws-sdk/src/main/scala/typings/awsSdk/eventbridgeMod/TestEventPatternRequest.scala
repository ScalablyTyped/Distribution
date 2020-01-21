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
    * The event pattern. For more information, see Event Patterns in the Amazon EventBridge User Guide.
    */
  var EventPattern: typings.awsSdk.eventbridgeMod.EventPattern = js.native
}

object TestEventPatternRequest {
  @scala.inline
  def apply(Event: String, EventPattern: EventPattern): TestEventPatternRequest = {
    val __obj = js.Dynamic.literal(Event = Event.asInstanceOf[js.Any], EventPattern = EventPattern.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestEventPatternRequest]
  }
}

