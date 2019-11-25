package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMessageRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAddressConfigurationMod._AddressConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreDirectMessageConfigurationMod._DirectMessageConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointSendConfigurationMod._EndpointSendConfiguration
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _MessageRequest extends js.Object {
  /**
    * A map of key-value pairs, where each key is an address and each value is an AddressConfiguration object. An address can be a push notification token, a phone number, or an email address.
    */
  var Addresses: js.UndefOr[
    StringDictionary[_AddressConfiguration] | (Iterable[js.Tuple2[String, _AddressConfiguration]])
  ] = js.undefined
  /**
    * A map of custom attributes to attributes to be attached to the message. This payload is added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
    */
  var Context: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
  /**
    * A map of key-value pairs, where each key is an endpoint ID and each value is an EndpointSendConfiguration object. Within an EndpointSendConfiguration object, you can tailor the message for an endpoint by specifying message overrides or substitutions.
    */
  var Endpoints: js.UndefOr[
    StringDictionary[_EndpointSendConfiguration] | (Iterable[js.Tuple2[String, _EndpointSendConfiguration]])
  ] = js.undefined
  /**
    * Message configuration.
    */
  var MessageConfiguration: js.UndefOr[_DirectMessageConfiguration] = js.undefined
  /**
    * A unique ID that you can use to trace a message. This ID is visible to recipients.
    */
  var TraceId: js.UndefOr[String] = js.undefined
}

object _MessageRequest {
  @scala.inline
  def apply(
    Addresses: StringDictionary[_AddressConfiguration] | (Iterable[js.Tuple2[String, _AddressConfiguration]]) = null,
    Context: StringDictionary[String] | (Iterable[js.Tuple2[String, String]]) = null,
    Endpoints: StringDictionary[_EndpointSendConfiguration] | (Iterable[js.Tuple2[String, _EndpointSendConfiguration]]) = null,
    MessageConfiguration: _DirectMessageConfiguration = null,
    TraceId: String = null
  ): _MessageRequest = {
    val __obj = js.Dynamic.literal()
    if (Addresses != null) __obj.updateDynamic("Addresses")(Addresses.asInstanceOf[js.Any])
    if (Context != null) __obj.updateDynamic("Context")(Context.asInstanceOf[js.Any])
    if (Endpoints != null) __obj.updateDynamic("Endpoints")(Endpoints.asInstanceOf[js.Any])
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration.asInstanceOf[js.Any])
    if (TraceId != null) __obj.updateDynamic("TraceId")(TraceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[_MessageRequest]
  }
}

