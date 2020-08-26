package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageRequest extends js.Object {
  /**
    * A map of key-value pairs, where each key is an address and each value is an AddressConfiguration object. An address can be a push notification token, a phone number, or an email address. You can use an AddressConfiguration object to tailor the message for an address by specifying settings such as content overrides and message variables.
    */
  var Addresses: js.UndefOr[MapOfAddressConfiguration] = js.native
  /**
    * A map of custom attributes to attach to the message. For a push notification, this payload is added to the data.pinpoint object. For an email or text message, this payload is added to email/SMS delivery receipt event attributes.
    */
  var Context: js.UndefOr[MapOfString] = js.native
  /**
    * A map of key-value pairs, where each key is an endpoint ID and each value is an EndpointSendConfiguration object. You can use an EndpointSendConfiguration object to tailor the message for an endpoint by specifying settings such as content overrides and message variables.
    */
  var Endpoints: js.UndefOr[MapOfEndpointSendConfiguration] = js.native
  /**
    * The settings and content for the default message and any default messages that you defined for specific channels.
    */
  var MessageConfiguration: DirectMessageConfiguration = js.native
  /**
    * The message template to use for the message.
    */
  var TemplateConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.TemplateConfiguration] = js.native
  /**
    * The unique identifier for tracing the message. This identifier is visible to message recipients.
    */
  var TraceId: js.UndefOr[string] = js.native
}

object MessageRequest {
  @scala.inline
  def apply(MessageConfiguration: DirectMessageConfiguration): MessageRequest = {
    val __obj = js.Dynamic.literal(MessageConfiguration = MessageConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageRequest]
  }
  @scala.inline
  implicit class MessageRequestOps[Self <: MessageRequest] (val x: Self) extends AnyVal {
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
    def setMessageConfiguration(value: DirectMessageConfiguration): Self = this.set("MessageConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddresses(value: MapOfAddressConfiguration): Self = this.set("Addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddresses: Self = this.set("Addresses", js.undefined)
    @scala.inline
    def setContext(value: MapOfString): Self = this.set("Context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("Context", js.undefined)
    @scala.inline
    def setEndpoints(value: MapOfEndpointSendConfiguration): Self = this.set("Endpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoints: Self = this.set("Endpoints", js.undefined)
    @scala.inline
    def setTemplateConfiguration(value: TemplateConfiguration): Self = this.set("TemplateConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateConfiguration: Self = this.set("TemplateConfiguration", js.undefined)
    @scala.inline
    def setTraceId(value: string): Self = this.set("TraceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraceId: Self = this.set("TraceId", js.undefined)
  }
  
}

