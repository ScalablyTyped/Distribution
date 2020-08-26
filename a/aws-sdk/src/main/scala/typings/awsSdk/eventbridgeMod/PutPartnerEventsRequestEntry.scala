package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPartnerEventsRequestEntry extends js.Object {
  /**
    * A valid JSON string. There is no other schema imposed. The JSON string may contain fields and nested subobjects.
    */
  var Detail: js.UndefOr[String] = js.native
  /**
    * A free-form string used to decide what fields to expect in the event detail.
    */
  var DetailType: js.UndefOr[String] = js.native
  /**
    * AWS resources, identified by Amazon Resource Name (ARN), which the event primarily concerns. Any number, including zero, may be present.
    */
  var Resources: js.UndefOr[EventResourceList] = js.native
  /**
    * The event source that is generating the evntry.
    */
  var Source: js.UndefOr[EventSourceName] = js.native
  /**
    * The date and time of the event.
    */
  var Time: js.UndefOr[EventTime] = js.native
}

object PutPartnerEventsRequestEntry {
  @scala.inline
  def apply(): PutPartnerEventsRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutPartnerEventsRequestEntry]
  }
  @scala.inline
  implicit class PutPartnerEventsRequestEntryOps[Self <: PutPartnerEventsRequestEntry] (val x: Self) extends AnyVal {
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
    def setResourcesVarargs(value: EventResource*): Self = this.set("Resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: EventResourceList): Self = this.set("Resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("Resources", js.undefined)
    @scala.inline
    def setSource(value: EventSourceName): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
    @scala.inline
    def setTime(value: EventTime): Self = this.set("Time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("Time", js.undefined)
  }
  
}

