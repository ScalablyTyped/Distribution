package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConfigurationSetEventDestinationRequest extends js.Object {
  /**
    * The name of the configuration set that the event destination should be associated with.
    */
  var ConfigurationSetName: typings.awsSdk.sesMod.ConfigurationSetName = js.native
  /**
    * An object that describes the AWS service that email sending event information will be published to.
    */
  var EventDestination: typings.awsSdk.sesMod.EventDestination = js.native
}

object CreateConfigurationSetEventDestinationRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, EventDestination: EventDestination): CreateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], EventDestination = EventDestination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateConfigurationSetEventDestinationRequest]
  }
}

