package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEventBusRequest extends js.Object {
  /**
    * If you are creating a partner event bus, this specifies the partner event source that the new event bus will be matched with.
    */
  var EventSourceName: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.EventSourceName] = js.native
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
  def apply(Name: EventBusName): CreateEventBusRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventBusRequest]
  }
  @scala.inline
  implicit class CreateEventBusRequestOps[Self <: CreateEventBusRequest] (val x: Self) extends AnyVal {
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
    def setName(value: EventBusName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventSourceName(value: EventSourceName): Self = this.set("EventSourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventSourceName: Self = this.set("EventSourceName", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

