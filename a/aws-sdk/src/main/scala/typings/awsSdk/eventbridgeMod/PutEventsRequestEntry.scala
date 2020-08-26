package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEventsRequestEntry extends js.Object {
  /**
    * A valid JSON string. There is no other schema imposed. The JSON string may contain fields and nested subobjects.
    */
  var Detail: js.UndefOr[String] = js.native
  /**
    * Free-form string used to decide what fields to expect in the event detail.
    */
  var DetailType: js.UndefOr[String] = js.native
  /**
    * The event bus that will receive the event. Only the rules that are associated with this event bus will be able to match the event.
    */
  var EventBusName: js.UndefOr[NonPartnerEventBusName] = js.native
  /**
    * AWS resources, identified by Amazon Resource Name (ARN), which the event primarily concerns. Any number, including zero, may be present.
    */
  var Resources: js.UndefOr[EventResourceList] = js.native
  /**
    * The source of the event.
    */
  var Source: js.UndefOr[String] = js.native
  /**
    * The time stamp of the event, per RFC3339. If no time stamp is provided, the time stamp of the PutEvents call is used.
    */
  var Time: js.UndefOr[EventTime] = js.native
}

object PutEventsRequestEntry {
  @scala.inline
  def apply(): PutEventsRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutEventsRequestEntry]
  }
  @scala.inline
  implicit class PutEventsRequestEntryOps[Self <: PutEventsRequestEntry] (val x: Self) extends AnyVal {
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
    def setDetail(value: String): Self = this.set("Detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("Detail", js.undefined)
    @scala.inline
    def setDetailType(value: String): Self = this.set("DetailType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailType: Self = this.set("DetailType", js.undefined)
    @scala.inline
    def setEventBusName(value: NonPartnerEventBusName): Self = this.set("EventBusName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventBusName: Self = this.set("EventBusName", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: EventResource*): Self = this.set("Resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: EventResourceList): Self = this.set("Resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("Resources", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
    @scala.inline
    def setTime(value: EventTime): Self = this.set("Time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("Time", js.undefined)
  }
  
}

