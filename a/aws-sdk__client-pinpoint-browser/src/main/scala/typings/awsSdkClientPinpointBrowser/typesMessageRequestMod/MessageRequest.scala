package typings.awsSdkClientPinpointBrowser.typesMessageRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesAddressConfigurationMod.AddressConfiguration
import typings.awsSdkClientPinpointBrowser.typesDirectMessageConfigurationMod.DirectMessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesEndpointSendConfigurationMod.EndpointSendConfiguration
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageRequest extends js.Object {
  /**
    * A map of key-value pairs, where each key is an address and each value is an AddressConfiguration object. An address can be a push notification token, a phone number, or an email address.
    */
  var Addresses: js.UndefOr[
    StringDictionary[AddressConfiguration] | (Iterable[js.Tuple2[String, AddressConfiguration]])
  ] = js.native
  /**
    * A map of custom attributes to attributes to be attached to the message. This payload is added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
    */
  var Context: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
  /**
    * A map of key-value pairs, where each key is an endpoint ID and each value is an EndpointSendConfiguration object. Within an EndpointSendConfiguration object, you can tailor the message for an endpoint by specifying message overrides or substitutions.
    */
  var Endpoints: js.UndefOr[
    StringDictionary[EndpointSendConfiguration] | (Iterable[js.Tuple2[String, EndpointSendConfiguration]])
  ] = js.native
  /**
    * Message configuration.
    */
  var MessageConfiguration: js.UndefOr[DirectMessageConfiguration] = js.native
  /**
    * A unique ID that you can use to trace a message. This ID is visible to recipients.
    */
  var TraceId: js.UndefOr[String] = js.native
}

object MessageRequest {
  @scala.inline
  def apply(): MessageRequest = {
    val __obj = js.Dynamic.literal()
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
    def setAddresses(
      value: StringDictionary[AddressConfiguration] | (Iterable[js.Tuple2[String, AddressConfiguration]])
    ): Self = this.set("Addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddresses: Self = this.set("Addresses", js.undefined)
    @scala.inline
    def setContext(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = this.set("Context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("Context", js.undefined)
    @scala.inline
    def setEndpoints(
      value: StringDictionary[EndpointSendConfiguration] | (Iterable[js.Tuple2[String, EndpointSendConfiguration]])
    ): Self = this.set("Endpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoints: Self = this.set("Endpoints", js.undefined)
    @scala.inline
    def setMessageConfiguration(value: DirectMessageConfiguration): Self = this.set("MessageConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageConfiguration: Self = this.set("MessageConfiguration", js.undefined)
    @scala.inline
    def setTraceId(value: String): Self = this.set("TraceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraceId: Self = this.set("TraceId", js.undefined)
  }
  
}

