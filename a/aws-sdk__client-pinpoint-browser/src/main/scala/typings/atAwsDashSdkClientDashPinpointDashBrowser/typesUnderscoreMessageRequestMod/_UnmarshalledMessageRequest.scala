package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMessageRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAddressConfigurationMod._UnmarshalledAddressConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreDirectMessageConfigurationMod._UnmarshalledDirectMessageConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointSendConfigurationMod._UnmarshalledEndpointSendConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledMessageRequest extends _MessageRequest {
  /**
    * A map of key-value pairs, where each key is an address and each value is an AddressConfiguration object. An address can be a push notification token, a phone number, or an email address.
    */
  @JSName("Addresses")
  var Addresses__UnmarshalledMessageRequest: js.UndefOr[StringDictionary[_UnmarshalledAddressConfiguration]] = js.undefined
  /**
    * A map of custom attributes to attributes to be attached to the message. This payload is added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
    */
  @JSName("Context")
  var Context__UnmarshalledMessageRequest: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * A map of key-value pairs, where each key is an endpoint ID and each value is an EndpointSendConfiguration object. Within an EndpointSendConfiguration object, you can tailor the message for an endpoint by specifying message overrides or substitutions.
    */
  @JSName("Endpoints")
  var Endpoints__UnmarshalledMessageRequest: js.UndefOr[StringDictionary[_UnmarshalledEndpointSendConfiguration]] = js.undefined
  /**
    * Message configuration.
    */
  @JSName("MessageConfiguration")
  var MessageConfiguration__UnmarshalledMessageRequest: js.UndefOr[_UnmarshalledDirectMessageConfiguration] = js.undefined
}

object _UnmarshalledMessageRequest {
  @scala.inline
  def apply(
    Addresses: StringDictionary[_UnmarshalledAddressConfiguration] = null,
    Context: StringDictionary[String] = null,
    Endpoints: StringDictionary[_UnmarshalledEndpointSendConfiguration] = null,
    MessageConfiguration: _UnmarshalledDirectMessageConfiguration = null,
    TraceId: String = null
  ): _UnmarshalledMessageRequest = {
    val __obj = js.Dynamic.literal()
    if (Addresses != null) __obj.updateDynamic("Addresses")(Addresses.asInstanceOf[js.Any])
    if (Context != null) __obj.updateDynamic("Context")(Context.asInstanceOf[js.Any])
    if (Endpoints != null) __obj.updateDynamic("Endpoints")(Endpoints.asInstanceOf[js.Any])
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration.asInstanceOf[js.Any])
    if (TraceId != null) __obj.updateDynamic("TraceId")(TraceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledMessageRequest]
  }
}

