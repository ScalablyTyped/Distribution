package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDetails extends js.Object {
  /**
    * Summary information about the event.
    */
  var event: js.UndefOr[Event] = js.native
  /**
    * The most recent description of the event.
    */
  var eventDescription: js.UndefOr[EventDescription_] = js.native
  /**
    * Additional metadata about the event.
    */
  var eventMetadata: js.UndefOr[typings.awsSdk.healthMod.eventMetadata] = js.native
}

object EventDetails {
  @scala.inline
  def apply(): EventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDetails]
  }
  @scala.inline
  implicit class EventDetailsOps[Self <: EventDetails] (val x: Self) extends AnyVal {
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
    def setEvent(value: Event): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setEventDescription(value: EventDescription_): Self = this.set("eventDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventDescription: Self = this.set("eventDescription", js.undefined)
    @scala.inline
    def setEventMetadata(value: eventMetadata): Self = this.set("eventMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventMetadata: Self = this.set("eventMetadata", js.undefined)
  }
  
}

