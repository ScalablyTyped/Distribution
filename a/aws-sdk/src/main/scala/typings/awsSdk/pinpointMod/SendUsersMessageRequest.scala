package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendUsersMessageRequest extends js.Object {
  
  /**
    * A map of custom attribute-value pairs. For a push notification, Amazon Pinpoint adds these attributes to the data.pinpoint object in the body of the notification payload. Amazon Pinpoint also provides these attributes in the events that it generates for users-messages deliveries.
    */
  var Context: js.UndefOr[MapOfString] = js.native
  
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
  
  /**
    * A map that associates user IDs with EndpointSendConfiguration objects. You can use an EndpointSendConfiguration object to tailor the message for a user by specifying settings such as content overrides and message variables.
    */
  var Users: MapOfEndpointSendConfiguration = js.native
}
object SendUsersMessageRequest {
  
  @scala.inline
  def apply(MessageConfiguration: DirectMessageConfiguration, Users: MapOfEndpointSendConfiguration): SendUsersMessageRequest = {
    val __obj = js.Dynamic.literal(MessageConfiguration = MessageConfiguration.asInstanceOf[js.Any], Users = Users.asInstanceOf[js.Any])
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
    def setMessageConfiguration(value: DirectMessageConfiguration): Self = this.set("MessageConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: MapOfEndpointSendConfiguration): Self = this.set("Users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: MapOfString): Self = this.set("Context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("Context", js.undefined)
    
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
