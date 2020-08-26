package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryRecordEntry extends js.Object {
  /**
    * Information about the event.
    */
  var EventInformation: js.UndefOr[typings.awsSdk.ec2Mod.EventInformation] = js.native
  /**
    * The event type.
    */
  var EventType: js.UndefOr[FleetEventType] = js.native
  /**
    * The date and time of the event, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var Timestamp: js.UndefOr[DateTime] = js.native
}

object HistoryRecordEntry {
  @scala.inline
  def apply(): HistoryRecordEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryRecordEntry]
  }
  @scala.inline
  implicit class HistoryRecordEntryOps[Self <: HistoryRecordEntry] (val x: Self) extends AnyVal {
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
    def setEventInformation(value: EventInformation): Self = this.set("EventInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventInformation: Self = this.set("EventInformation", js.undefined)
    @scala.inline
    def setEventType(value: FleetEventType): Self = this.set("EventType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventType: Self = this.set("EventType", js.undefined)
    @scala.inline
    def setTimestamp(value: DateTime): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
  
}

