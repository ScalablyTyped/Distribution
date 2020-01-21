package typings.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConfigurationSetEventDestinationRequest extends js.Object {
  /**
    * ConfigurationSetName
    */
  var ConfigurationSetName: _String = js.native
  var EventDestination: js.UndefOr[EventDestinationDefinition] = js.native
  /**
    * EventDestinationName
    */
  var EventDestinationName: _String = js.native
}

object UpdateConfigurationSetEventDestinationRequest {
  @scala.inline
  def apply(
    ConfigurationSetName: _String,
    EventDestinationName: _String,
    EventDestination: EventDestinationDefinition = null
  ): UpdateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], EventDestinationName = EventDestinationName.asInstanceOf[js.Any])
    if (EventDestination != null) __obj.updateDynamic("EventDestination")(EventDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationSetEventDestinationRequest]
  }
}

