package typings.awsSdk.cloudwatcheventsMod

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
  def apply(
    Detail: String = null,
    DetailType: String = null,
    EventBusName: NonPartnerEventBusName = null,
    Resources: EventResourceList = null,
    Source: String = null,
    Time: EventTime = null
  ): PutEventsRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (Detail != null) __obj.updateDynamic("Detail")(Detail.asInstanceOf[js.Any])
    if (DetailType != null) __obj.updateDynamic("DetailType")(DetailType.asInstanceOf[js.Any])
    if (EventBusName != null) __obj.updateDynamic("EventBusName")(EventBusName.asInstanceOf[js.Any])
    if (Resources != null) __obj.updateDynamic("Resources")(Resources.asInstanceOf[js.Any])
    if (Source != null) __obj.updateDynamic("Source")(Source.asInstanceOf[js.Any])
    if (Time != null) __obj.updateDynamic("Time")(Time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventsRequestEntry]
  }
}

