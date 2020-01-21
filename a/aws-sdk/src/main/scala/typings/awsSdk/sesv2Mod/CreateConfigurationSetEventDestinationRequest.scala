package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConfigurationSetEventDestinationRequest extends js.Object {
  /**
    * The name of the configuration set that you want to add an event destination to.
    */
  var ConfigurationSetName: typings.awsSdk.sesv2Mod.ConfigurationSetName = js.native
  /**
    * An object that defines the event destination.
    */
  var EventDestination: EventDestinationDefinition = js.native
  /**
    * A name that identifies the event destination within the configuration set.
    */
  var EventDestinationName: typings.awsSdk.sesv2Mod.EventDestinationName = js.native
}

object CreateConfigurationSetEventDestinationRequest {
  @scala.inline
  def apply(
    ConfigurationSetName: ConfigurationSetName,
    EventDestination: EventDestinationDefinition,
    EventDestinationName: EventDestinationName
  ): CreateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], EventDestination = EventDestination.asInstanceOf[js.Any], EventDestinationName = EventDestinationName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateConfigurationSetEventDestinationRequest]
  }
}

