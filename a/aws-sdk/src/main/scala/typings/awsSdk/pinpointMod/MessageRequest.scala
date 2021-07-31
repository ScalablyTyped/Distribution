package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageRequest extends StObject {
  
  /**
    * A map of key-value pairs, where each key is an address and each value is an AddressConfiguration object. An address can be a push notification token, a phone number, or an email address. You can use an AddressConfiguration object to tailor the message for an address by specifying settings such as content overrides and message variables.
    */
  var Addresses: js.UndefOr[MapOfAddressConfiguration] = js.undefined
  
  /**
    * A map of custom attributes to attach to the message. For a push notification, this payload is added to the data.pinpoint object. For an email or text message, this payload is added to email/SMS delivery receipt event attributes.
    */
  var Context: js.UndefOr[MapOfString] = js.undefined
  
  /**
    * A map of key-value pairs, where each key is an endpoint ID and each value is an EndpointSendConfiguration object. You can use an EndpointSendConfiguration object to tailor the message for an endpoint by specifying settings such as content overrides and message variables.
    */
  var Endpoints: js.UndefOr[MapOfEndpointSendConfiguration] = js.undefined
  
  /**
    * The settings and content for the default message and any default messages that you defined for specific channels.
    */
  var MessageConfiguration: DirectMessageConfiguration
  
  /**
    * The message template to use for the message.
    */
  var TemplateConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.TemplateConfiguration] = js.undefined
  
  /**
    * The unique identifier for tracing the message. This identifier is visible to message recipients.
    */
  var TraceId: js.UndefOr[string] = js.undefined
}
object MessageRequest {
  
  @scala.inline
  def apply(MessageConfiguration: DirectMessageConfiguration): MessageRequest = {
    val __obj = js.Dynamic.literal(MessageConfiguration = MessageConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageRequest]
  }
  
  @scala.inline
  implicit class MessageRequestMutableBuilder[Self <: MessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: MapOfAddressConfiguration): Self = StObject.set(x, "Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "Addresses", js.undefined)
    
    @scala.inline
    def setContext(value: MapOfString): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "Context", js.undefined)
    
    @scala.inline
    def setEndpoints(value: MapOfEndpointSendConfiguration): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
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
  }
}
