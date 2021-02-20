package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesDirectMessageConfigurationMod.DirectMessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesDirectMessageConfigurationMod.UnmarshalledDirectMessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesEndpointSendConfigurationMod.EndpointSendConfiguration
import typings.awsSdkClientPinpointBrowser.typesEndpointSendConfigurationMod.UnmarshalledEndpointSendConfiguration
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSendUsersMessageRequestMod {
  
  @js.native
  trait SendUsersMessageRequest extends StObject {
    
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
    implicit class SendUsersMessageRequestMutableBuilder[Self <: SendUsersMessageRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "Context", js.undefined)
      
      @scala.inline
      def setMessageConfiguration(value: DirectMessageConfiguration): Self = StObject.set(x, "MessageConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageConfigurationUndefined: Self = StObject.set(x, "MessageConfiguration", js.undefined)
      
      @scala.inline
      def setTraceId(value: String): Self = StObject.set(x, "TraceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceIdUndefined: Self = StObject.set(x, "TraceId", js.undefined)
      
      @scala.inline
      def setUsers(
        value: StringDictionary[EndpointSendConfiguration] | (Iterable[js.Tuple2[String, EndpointSendConfiguration]])
      ): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersUndefined: Self = StObject.set(x, "Users", js.undefined)
    }
  }
  
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
    implicit class UnmarshalledSendUsersMessageRequestMutableBuilder[Self <: UnmarshalledSendUsersMessageRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: StringDictionary[String]): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "Context", js.undefined)
      
      @scala.inline
      def setMessageConfiguration(value: UnmarshalledDirectMessageConfiguration): Self = StObject.set(x, "MessageConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageConfigurationUndefined: Self = StObject.set(x, "MessageConfiguration", js.undefined)
      
      @scala.inline
      def setUsers(value: StringDictionary[UnmarshalledEndpointSendConfiguration]): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersUndefined: Self = StObject.set(x, "Users", js.undefined)
    }
  }
}
