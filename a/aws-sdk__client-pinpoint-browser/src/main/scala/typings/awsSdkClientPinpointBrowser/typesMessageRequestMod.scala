package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesAddressConfigurationMod.AddressConfiguration
import typings.awsSdkClientPinpointBrowser.typesAddressConfigurationMod.UnmarshalledAddressConfiguration
import typings.awsSdkClientPinpointBrowser.typesDirectMessageConfigurationMod.DirectMessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesDirectMessageConfigurationMod.UnmarshalledDirectMessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesEndpointSendConfigurationMod.EndpointSendConfiguration
import typings.awsSdkClientPinpointBrowser.typesEndpointSendConfigurationMod.UnmarshalledEndpointSendConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMessageRequestMod {
  
  trait MessageRequest extends StObject {
    
    /**
      * A map of key-value pairs, where each key is an address and each value is an AddressConfiguration object. An address can be a push notification token, a phone number, or an email address.
      */
    var Addresses: js.UndefOr[
        StringDictionary[AddressConfiguration] | (js.Iterable[js.Tuple2[String, AddressConfiguration]])
      ] = js.undefined
    
    /**
      * A map of custom attributes to attributes to be attached to the message. This payload is added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
      */
    var Context: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.undefined
    
    /**
      * A map of key-value pairs, where each key is an endpoint ID and each value is an EndpointSendConfiguration object. Within an EndpointSendConfiguration object, you can tailor the message for an endpoint by specifying message overrides or substitutions.
      */
    var Endpoints: js.UndefOr[
        StringDictionary[EndpointSendConfiguration] | (js.Iterable[js.Tuple2[String, EndpointSendConfiguration]])
      ] = js.undefined
    
    /**
      * Message configuration.
      */
    var MessageConfiguration: js.UndefOr[DirectMessageConfiguration] = js.undefined
    
    /**
      * A unique ID that you can use to trace a message. This ID is visible to recipients.
      */
    var TraceId: js.UndefOr[String] = js.undefined
  }
  object MessageRequest {
    
    inline def apply(): MessageRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageRequest] (val x: Self) extends AnyVal {
      
      inline def setAddresses(
        value: StringDictionary[AddressConfiguration] | (js.Iterable[js.Tuple2[String, AddressConfiguration]])
      ): Self = StObject.set(x, "Addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesUndefined: Self = StObject.set(x, "Addresses", js.undefined)
      
      inline def setContext(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "Context", js.undefined)
      
      inline def setEndpoints(
        value: StringDictionary[EndpointSendConfiguration] | (js.Iterable[js.Tuple2[String, EndpointSendConfiguration]])
      ): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
      
      inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
      
      inline def setMessageConfiguration(value: DirectMessageConfiguration): Self = StObject.set(x, "MessageConfiguration", value.asInstanceOf[js.Any])
      
      inline def setMessageConfigurationUndefined: Self = StObject.set(x, "MessageConfiguration", js.undefined)
      
      inline def setTraceId(value: String): Self = StObject.set(x, "TraceId", value.asInstanceOf[js.Any])
      
      inline def setTraceIdUndefined: Self = StObject.set(x, "TraceId", js.undefined)
    }
  }
  
  trait UnmarshalledMessageRequest
    extends StObject
       with MessageRequest {
    
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
    
    inline def apply(): UnmarshalledMessageRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledMessageRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledMessageRequest] (val x: Self) extends AnyVal {
      
      inline def setAddresses(value: StringDictionary[UnmarshalledAddressConfiguration]): Self = StObject.set(x, "Addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesUndefined: Self = StObject.set(x, "Addresses", js.undefined)
      
      inline def setContext(value: StringDictionary[String]): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "Context", js.undefined)
      
      inline def setEndpoints(value: StringDictionary[UnmarshalledEndpointSendConfiguration]): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
      
      inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
      
      inline def setMessageConfiguration(value: UnmarshalledDirectMessageConfiguration): Self = StObject.set(x, "MessageConfiguration", value.asInstanceOf[js.Any])
      
      inline def setMessageConfigurationUndefined: Self = StObject.set(x, "MessageConfiguration", js.undefined)
    }
  }
}
