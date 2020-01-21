package typings.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConfigurationSetEventDestinationRequest extends js.Object {
  /**
    * ConfigurationSetName
    */
  var ConfigurationSetName: _String = js.native
  var EventDestination: js.UndefOr[EventDestinationDefinition] = js.native
  /**
    * A name that identifies the event destination.
    */
  var EventDestinationName: js.UndefOr[NonEmptyString] = js.native
}

object CreateConfigurationSetEventDestinationRequest {
  @scala.inline
  def apply(
    ConfigurationSetName: _String,
    EventDestination: EventDestinationDefinition = null,
    EventDestinationName: NonEmptyString = null
  ): CreateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    if (EventDestination != null) __obj.updateDynamic("EventDestination")(EventDestination.asInstanceOf[js.Any])
    if (EventDestinationName != null) __obj.updateDynamic("EventDestinationName")(EventDestinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationSetEventDestinationRequest]
  }
}

