package typings.awsSdkClientPinpointBrowser.typesSendUsersMessageRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesDirectMessageConfigurationMod.UnmarshalledDirectMessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesEndpointSendConfigurationMod.UnmarshalledEndpointSendConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSendUsersMessageRequest extends SendUsersMessageRequest {
  /**
    * A map of custom attribute-value pairs. Amazon Pinpoint adds these attributes to the data.pinpoint object in the body of the push notification payload. Amazon Pinpoint also provides these attributes in the events that it generates for users-messages deliveries.
    */
  @JSName("Context")
  var Context_UnmarshalledSendUsersMessageRequest: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Message definitions for the default message and any messages that are tailored for specific channels.
    */
  @JSName("MessageConfiguration")
  var MessageConfiguration_UnmarshalledSendUsersMessageRequest: js.UndefOr[UnmarshalledDirectMessageConfiguration] = js.undefined
  /**
    * A map that associates user IDs with EndpointSendConfiguration objects. Within an EndpointSendConfiguration object, you can tailor the message for a user by specifying message overrides or substitutions.
    */
  @JSName("Users")
  var Users_UnmarshalledSendUsersMessageRequest: js.UndefOr[StringDictionary[UnmarshalledEndpointSendConfiguration]] = js.undefined
}

object UnmarshalledSendUsersMessageRequest {
  @scala.inline
  def apply(
    Context: StringDictionary[String] = null,
    MessageConfiguration: UnmarshalledDirectMessageConfiguration = null,
    TraceId: String = null,
    Users: StringDictionary[UnmarshalledEndpointSendConfiguration] = null
  ): UnmarshalledSendUsersMessageRequest = {
    val __obj = js.Dynamic.literal()
    if (Context != null) __obj.updateDynamic("Context")(Context.asInstanceOf[js.Any])
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration.asInstanceOf[js.Any])
    if (TraceId != null) __obj.updateDynamic("TraceId")(TraceId.asInstanceOf[js.Any])
    if (Users != null) __obj.updateDynamic("Users")(Users.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSendUsersMessageRequest]
  }
}

