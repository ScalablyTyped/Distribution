package typings.awsSdkClientPinpointBrowser.typesSendUsersMessageRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesDirectMessageConfigurationMod.UnmarshalledDirectMessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesEndpointSendConfigurationMod.UnmarshalledEndpointSendConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSendUsersMessageRequest extends SendUsersMessageRequest {
  /**
    * A map of custom attribute-value pairs. Amazon Pinpoint adds these attributes to the data.pinpoint object in the body of the push notification payload. Amazon Pinpoint also provides these attributes in the events that it generates for users-messages deliveries.
    */
  @JSName("Context")
  var Context_UnmarshalledSendUsersMessageRequest: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Message definitions for the default message and any messages that are tailored for specific channels.
    */
  @JSName("MessageConfiguration")
  var MessageConfiguration_UnmarshalledSendUsersMessageRequest: js.UndefOr[UnmarshalledDirectMessageConfiguration] = js.native
  /**
    * A map that associates user IDs with EndpointSendConfiguration objects. Within an EndpointSendConfiguration object, you can tailor the message for a user by specifying message overrides or substitutions.
    */
  @JSName("Users")
  var Users_UnmarshalledSendUsersMessageRequest: js.UndefOr[StringDictionary[UnmarshalledEndpointSendConfiguration]] = js.native
}

object UnmarshalledSendUsersMessageRequest {
  @scala.inline
  def apply(): UnmarshalledSendUsersMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSendUsersMessageRequest]
  }
  @scala.inline
  implicit class UnmarshalledSendUsersMessageRequestOps[Self <: UnmarshalledSendUsersMessageRequest] (val x: Self) extends AnyVal {
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
    def setContext(value: StringDictionary[String]): Self = this.set("Context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("Context", js.undefined)
    @scala.inline
    def setMessageConfiguration(value: UnmarshalledDirectMessageConfiguration): Self = this.set("MessageConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageConfiguration: Self = this.set("MessageConfiguration", js.undefined)
    @scala.inline
    def setUsers(value: StringDictionary[UnmarshalledEndpointSendConfiguration]): Self = this.set("Users", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsers: Self = this.set("Users", js.undefined)
  }
  
}

