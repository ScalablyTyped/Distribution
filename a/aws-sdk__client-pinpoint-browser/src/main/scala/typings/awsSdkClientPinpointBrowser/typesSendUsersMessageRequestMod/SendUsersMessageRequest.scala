package typings.awsSdkClientPinpointBrowser.typesSendUsersMessageRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesDirectMessageConfigurationMod.DirectMessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesEndpointSendConfigurationMod.EndpointSendConfiguration
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendUsersMessageRequest extends js.Object {
  
  /**
    * A map of custom attribute-value pairs. Amazon Pinpoint adds these attributes to the data.pinpoint object in the body of the push notification payload. Amazon Pinpoint also provides these attributes in the events that it generates for users-messages deliveries.
    */
  var Context: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
  
  /**
    * Message definitions for the default message and any messages that are tailored for specific channels.
    */
  var MessageConfiguration: js.UndefOr[DirectMessageConfiguration] = js.native
  
  /**
    * A unique ID that you can use to trace a message. This ID is visible to recipients.
    */
  var TraceId: js.UndefOr[String] = js.native
  
  /**
    * A map that associates user IDs with EndpointSendConfiguration objects. Within an EndpointSendConfiguration object, you can tailor the message for a user by specifying message overrides or substitutions.
    */
  var Users: js.UndefOr[
    StringDictionary[EndpointSendConfiguration] | (Iterable[js.Tuple2[String, EndpointSendConfiguration]])
  ] = js.native
}
object SendUsersMessageRequest {
  
  @scala.inline
  def apply(): SendUsersMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendUsersMessageRequest]
  }
  
  @scala.inline
  implicit class SendUsersMessageRequestOps[Self <: SendUsersMessageRequest] (val x: Self) extends AnyVal {
    
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
    def setContext(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = this.set("Context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("Context", js.undefined)
    
    @scala.inline
    def setMessageConfiguration(value: DirectMessageConfiguration): Self = this.set("MessageConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageConfiguration: Self = this.set("MessageConfiguration", js.undefined)
    
    @scala.inline
    def setTraceId(value: String): Self = this.set("TraceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraceId: Self = this.set("TraceId", js.undefined)
    
    @scala.inline
    def setUsers(
      value: StringDictionary[EndpointSendConfiguration] | (Iterable[js.Tuple2[String, EndpointSendConfiguration]])
    ): Self = this.set("Users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("Users", js.undefined)
  }
}
