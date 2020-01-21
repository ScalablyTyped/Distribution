package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigurationSetEventDestinationsResponse extends js.Object {
  /**
    * An array that includes all of the events destinations that have been configured for the configuration set.
    */
  var EventDestinations: js.UndefOr[typings.awsSdk.sesv2Mod.EventDestinations] = js.native
}

object GetConfigurationSetEventDestinationsResponse {
  @scala.inline
  def apply(EventDestinations: EventDestinations = null): GetConfigurationSetEventDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    if (EventDestinations != null) __obj.updateDynamic("EventDestinations")(EventDestinations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigurationSetEventDestinationsResponse]
  }
}

