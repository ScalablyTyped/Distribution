package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendUsersMessageRequest extends StObject {
  
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
  implicit class SendUsersMessageRequestMutableBuilder[Self <: SendUsersMessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: MapOfString): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "Context", js.undefined)
    
    @scala.inline
    def setMessageConfiguration(value: DirectMessageConfiguration): Self = StObject.set(x, "MessageConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateConfiguration(value: TemplateConfiguration): Self = StObject.set(x, "TemplateConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateConfigurationUndefined: Self = StObject.set(x, "TemplateConfiguration", js.undefined)
    
    @scala.inline
    def setTraceId(value: string): Self = StObject.set(x, "TraceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceIdUndefined: Self = StObject.set(x, "TraceId", js.undefined)
    
    @scala.inline
    def setUsers(value: MapOfEndpointSendConfiguration): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
  }
}
