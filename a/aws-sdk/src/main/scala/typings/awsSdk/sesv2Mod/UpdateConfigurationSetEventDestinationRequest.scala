package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConfigurationSetEventDestinationRequest extends js.Object {
  /**
    * The name of the configuration set that contains the event destination that you want to modify.
    */
  var ConfigurationSetName: typings.awsSdk.sesv2Mod.ConfigurationSetName = js.native
  /**
    * An object that defines the event destination.
    */
  var EventDestination: EventDestinationDefinition = js.native
  /**
    * The name of the event destination that you want to modify.
    */
  var EventDestinationName: typings.awsSdk.sesv2Mod.EventDestinationName = js.native
}

object UpdateConfigurationSetEventDestinationRequest {
  @scala.inline
  def apply(
    ConfigurationSetName: ConfigurationSetName,
    EventDestination: EventDestinationDefinition,
    EventDestinationName: EventDestinationName
  ): UpdateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], EventDestination = EventDestination.asInstanceOf[js.Any], EventDestinationName = EventDestinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationSetEventDestinationRequest]
  }
  @scala.inline
  implicit class UpdateConfigurationSetEventDestinationRequestOps[Self <: UpdateConfigurationSetEventDestinationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = this.set("ConfigurationSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventDestination(value: EventDestinationDefinition): Self = this.set("EventDestination", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventDestinationName(value: EventDestinationName): Self = this.set("EventDestinationName", value.asInstanceOf[js.Any])
  }
  
}

