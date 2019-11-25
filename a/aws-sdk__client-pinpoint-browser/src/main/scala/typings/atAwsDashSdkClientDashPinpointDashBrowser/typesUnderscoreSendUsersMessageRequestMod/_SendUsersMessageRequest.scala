package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSendUsersMessageRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreDirectMessageConfigurationMod._DirectMessageConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointSendConfigurationMod._EndpointSendConfiguration
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SendUsersMessageRequest extends js.Object {
  /**
    * A map of custom attribute-value pairs. Amazon Pinpoint adds these attributes to the data.pinpoint object in the body of the push notification payload. Amazon Pinpoint also provides these attributes in the events that it generates for users-messages deliveries.
    */
  var Context: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
  /**
    * Message definitions for the default message and any messages that are tailored for specific channels.
    */
  var MessageConfiguration: js.UndefOr[_DirectMessageConfiguration] = js.undefined
  /**
    * A unique ID that you can use to trace a message. This ID is visible to recipients.
    */
  var TraceId: js.UndefOr[String] = js.undefined
  /**
    * A map that associates user IDs with EndpointSendConfiguration objects. Within an EndpointSendConfiguration object, you can tailor the message for a user by specifying message overrides or substitutions.
    */
  var Users: js.UndefOr[
    StringDictionary[_EndpointSendConfiguration] | (Iterable[js.Tuple2[String, _EndpointSendConfiguration]])
  ] = js.undefined
}

object _SendUsersMessageRequest {
  @scala.inline
  def apply(
    Context: StringDictionary[String] | (Iterable[js.Tuple2[String, String]]) = null,
    MessageConfiguration: _DirectMessageConfiguration = null,
    TraceId: String = null,
    Users: StringDictionary[_EndpointSendConfiguration] | (Iterable[js.Tuple2[String, _EndpointSendConfiguration]]) = null
  ): _SendUsersMessageRequest = {
    val __obj = js.Dynamic.literal()
    if (Context != null) __obj.updateDynamic("Context")(Context.asInstanceOf[js.Any])
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration.asInstanceOf[js.Any])
    if (TraceId != null) __obj.updateDynamic("TraceId")(TraceId.asInstanceOf[js.Any])
    if (Users != null) __obj.updateDynamic("Users")(Users.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SendUsersMessageRequest]
  }
}

