package typings.awsSdk.cloudwatcheventsMod

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
  def apply(
    Detail: String = null,
    DetailType: String = null,
    Resources: EventResourceList = null,
    Source: EventSourceName = null,
    Time: EventTime = null
  ): PutPartnerEventsRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (Detail != null) __obj.updateDynamic("Detail")(Detail.asInstanceOf[js.Any])
    if (DetailType != null) __obj.updateDynamic("DetailType")(DetailType.asInstanceOf[js.Any])
    if (Resources != null) __obj.updateDynamic("Resources")(Resources.asInstanceOf[js.Any])
    if (Source != null) __obj.updateDynamic("Source")(Source.asInstanceOf[js.Any])
    if (Time != null) __obj.updateDynamic("Time")(Time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPartnerEventsRequestEntry]
  }
}

