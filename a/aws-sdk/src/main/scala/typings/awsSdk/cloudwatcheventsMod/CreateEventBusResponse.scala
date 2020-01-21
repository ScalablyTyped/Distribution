package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEventBusResponse extends js.Object {
  /**
    * The ARN of the new event bus.
    */
  var EventBusArn: js.UndefOr[String] = js.native
}

object CreateEventBusResponse {
  @scala.inline
  def apply(EventBusArn: String = null): CreateEventBusResponse = {
    val __obj = js.Dynamic.literal()
    if (EventBusArn != null) __obj.updateDynamic("EventBusArn")(EventBusArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventBusResponse]
  }
}

