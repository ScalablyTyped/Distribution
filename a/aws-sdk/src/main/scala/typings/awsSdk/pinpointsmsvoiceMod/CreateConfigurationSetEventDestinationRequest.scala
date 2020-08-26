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
  def apply(ConfigurationSetName: _String): CreateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationSetEventDestinationRequest]
  }
  @scala.inline
  implicit class CreateConfigurationSetEventDestinationRequestOps[Self <: CreateConfigurationSetEventDestinationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigurationSetName(value: _String): Self = this.set("ConfigurationSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventDestination(value: EventDestinationDefinition): Self = this.set("EventDestination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventDestination: Self = this.set("EventDestination", js.undefined)
    @scala.inline
    def setEventDestinationName(value: NonEmptyString): Self = this.set("EventDestinationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventDestinationName: Self = this.set("EventDestinationName", js.undefined)
  }
  
}

