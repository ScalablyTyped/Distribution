package typings.awsSdkClientPinpointBrowser.typesMessageRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesAddressConfigurationMod.UnmarshalledAddressConfiguration
import typings.awsSdkClientPinpointBrowser.typesDirectMessageConfigurationMod.UnmarshalledDirectMessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesEndpointSendConfigurationMod.UnmarshalledEndpointSendConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledMessageRequest extends MessageRequest {
  /**
    * A map of key-value pairs, where each key is an address and each value is an AddressConfiguration object. An address can be a push notification token, a phone number, or an email address.
    */
  @JSName("Addresses")
  var Addresses_UnmarshalledMessageRequest: js.UndefOr[StringDictionary[UnmarshalledAddressConfiguration]] = js.undefined
  /**
    * A map of custom attributes to attributes to be attached to the message. This payload is added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
    */
  @JSName("Context")
  var Context_UnmarshalledMessageRequest: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * A map of key-value pairs, where each key is an endpoint ID and each value is an EndpointSendConfiguration object. Within an EndpointSendConfiguration object, you can tailor the message for an endpoint by specifying message overrides or substitutions.
    */
  @JSName("Endpoints")
  var Endpoints_UnmarshalledMessageRequest: js.UndefOr[StringDictionary[UnmarshalledEndpointSendConfiguration]] = js.undefined
  /**
    * Message configuration.
    */
  @JSName("MessageConfiguration")
  var MessageConfiguration_UnmarshalledMessageRequest: js.UndefOr[UnmarshalledDirectMessageConfiguration] = js.undefined
}

object UnmarshalledMessageRequest {
  @scala.inline
  def apply(
    Addresses: StringDictionary[UnmarshalledAddressConfiguration] = null,
    Context: StringDictionary[String] = null,
    Endpoints: StringDictionary[UnmarshalledEndpointSendConfiguration] = null,
    MessageConfiguration: UnmarshalledDirectMessageConfiguration = null,
    TraceId: String = null
  ): UnmarshalledMessageRequest = {
    val __obj = js.Dynamic.literal()
    if (Addresses != null) __obj.updateDynamic("Addresses")(Addresses.asInstanceOf[js.Any])
    if (Context != null) __obj.updateDynamic("Context")(Context.asInstanceOf[js.Any])
    if (Endpoints != null) __obj.updateDynamic("Endpoints")(Endpoints.asInstanceOf[js.Any])
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration.asInstanceOf[js.Any])
    if (TraceId != null) __obj.updateDynamic("TraceId")(TraceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledMessageRequest]
  }
}

