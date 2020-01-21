package typings.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigurationSetEventDestinationsResponse extends js.Object {
  var EventDestinations: js.UndefOr[typings.awsSdk.pinpointsmsvoiceMod.EventDestinations] = js.native
}

object GetConfigurationSetEventDestinationsResponse {
  @scala.inline
  def apply(EventDestinations: EventDestinations = null): GetConfigurationSetEventDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    if (EventDestinations != null) __obj.updateDynamic("EventDestinations")(EventDestinations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigurationSetEventDestinationsResponse]
  }
}

