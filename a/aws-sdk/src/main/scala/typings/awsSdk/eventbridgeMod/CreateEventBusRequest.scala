package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEventBusRequest extends js.Object {
  /**
    * If you are creating a partner event bus, this specifies the partner event source that the new event bus will be matched with.
    */
  var EventSourceName: js.UndefOr[typings.awsSdk.eventbridgeMod.EventSourceName] = js.native
  /**
    * The name of the new event bus.  Event bus names cannot contain the / character. You can't use the name default for a custom event bus, as this name is already used for your account's default event bus. If this is a partner event bus, the name must exactly match the name of the partner event source that this event bus is matched to.
    */
  var Name: EventBusName = js.native
  /**
    * Tags to associate with the event bus.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateEventBusRequest {
  @scala.inline
  def apply(Name: EventBusName, EventSourceName: EventSourceName = null, Tags: TagList = null): CreateEventBusRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (EventSourceName != null) __obj.updateDynamic("EventSourceName")(EventSourceName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventBusRequest]
  }
}

