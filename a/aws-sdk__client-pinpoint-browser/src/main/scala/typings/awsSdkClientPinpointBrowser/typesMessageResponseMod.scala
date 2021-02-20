package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEndpointMessageResultMod.EndpointMessageResult
import typings.awsSdkClientPinpointBrowser.typesEndpointMessageResultMod.UnmarshalledEndpointMessageResult
import typings.awsSdkClientPinpointBrowser.typesMessageResultMod.MessageResult
import typings.awsSdkClientPinpointBrowser.typesMessageResultMod.UnmarshalledMessageResult
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMessageResponseMod {
  
  @js.native
  trait MessageResponse extends StObject {
    
    /**
      * Application id of the message.
      */
    var ApplicationId: js.UndefOr[String] = js.native
    
    /**
      * A map containing a multi part response for each address, with the endpointId as the key and the result as the value.
      */
    var EndpointResult: js.UndefOr[
        StringDictionary[EndpointMessageResult] | (Iterable[js.Tuple2[String, EndpointMessageResult]])
      ] = js.native
    
    /**
      * Original request Id for which this message was delivered.
      */
    var RequestId: js.UndefOr[String] = js.native
    
    /**
      * A map containing a multi part response for each address, with the address as the key(Email address, phone number or push token) and the result as the value.
      */
    var Result: js.UndefOr[StringDictionary[MessageResult] | (Iterable[js.Tuple2[String, MessageResult]])] = js.native
  }
  object MessageResponse {
    
    @scala.inline
    def apply(): MessageResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageResponse]
    }
    
    @scala.inline
    implicit class MessageResponseMutableBuilder[Self <: MessageResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
      
      @scala.inline
      def setEndpointResult(
        value: StringDictionary[EndpointMessageResult] | (Iterable[js.Tuple2[String, EndpointMessageResult]])
      ): Self = StObject.set(x, "EndpointResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointResultUndefined: Self = StObject.set(x, "EndpointResult", js.undefined)
      
      @scala.inline
      def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
      
      @scala.inline
      def setResult(value: StringDictionary[MessageResult] | (Iterable[js.Tuple2[String, MessageResult]])): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledMessageResponse extends MessageResponse {
    
    /**
      * A map containing a multi part response for each address, with the endpointId as the key and the result as the value.
      */
    @JSName("EndpointResult")
    var EndpointResult_UnmarshalledMessageResponse: js.UndefOr[StringDictionary[UnmarshalledEndpointMessageResult]] = js.native
    
    /**
      * A map containing a multi part response for each address, with the address as the key(Email address, phone number or push token) and the result as the value.
      */
    @JSName("Result")
    var Result_UnmarshalledMessageResponse: js.UndefOr[StringDictionary[UnmarshalledMessageResult]] = js.native
  }
  object UnmarshalledMessageResponse {
    
    @scala.inline
    def apply(): UnmarshalledMessageResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledMessageResponse]
    }
    
    @scala.inline
    implicit class UnmarshalledMessageResponseMutableBuilder[Self <: UnmarshalledMessageResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpointResult(value: StringDictionary[UnmarshalledEndpointMessageResult]): Self = StObject.set(x, "EndpointResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointResultUndefined: Self = StObject.set(x, "EndpointResult", js.undefined)
      
      @scala.inline
      def setResult(value: StringDictionary[UnmarshalledMessageResult]): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
    }
  }
}
