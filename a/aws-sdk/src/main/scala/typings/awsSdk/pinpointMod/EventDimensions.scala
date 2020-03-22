package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDimensions extends js.Object {
  /**
    * One or more custom attributes that your application reports to Amazon Pinpoint. You can use these attributes as selection criteria when you create an event filter.
    */
  var Attributes: js.UndefOr[MapOfAttributeDimension] = js.native
  /**
    * The name of the event that causes the campaign to be sent or the journey activity to be performed. This can be a standard event that Amazon Pinpoint generates, such as _email.delivered. For campaigns, this can also be a custom event that's specific to your application. For information about standard events, see Streaming Amazon Pinpoint Events in the Amazon Pinpoint Developer Guide.
    */
  var EventType: js.UndefOr[SetDimension] = js.native
  /**
    * One or more custom metrics that your application reports to Amazon Pinpoint. You can use these metrics as selection criteria when you create an event filter.
    */
  var Metrics: js.UndefOr[MapOfMetricDimension] = js.native
}

object EventDimensions {
  @scala.inline
  def apply(
    Attributes: MapOfAttributeDimension = null,
    EventType: SetDimension = null,
    Metrics: MapOfMetricDimension = null
  ): EventDimensions = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (EventType != null) __obj.updateDynamic("EventType")(EventType.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDimensions]
  }
}

