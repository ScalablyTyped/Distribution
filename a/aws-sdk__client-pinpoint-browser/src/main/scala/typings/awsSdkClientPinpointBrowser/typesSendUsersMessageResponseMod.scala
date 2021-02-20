package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEndpointMessageResultMod.EndpointMessageResult
import typings.awsSdkClientPinpointBrowser.typesEndpointMessageResultMod.UnmarshalledEndpointMessageResult
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSendUsersMessageResponseMod {
  
  @js.native
  trait SendUsersMessageResponse extends StObject {
    
    /**
      * The unique ID of the Amazon Pinpoint project used to send the message.
      */
    var ApplicationId: js.UndefOr[String] = js.native
    
    /**
      * The unique ID assigned to the users-messages request.
      */
    var RequestId: js.UndefOr[String] = js.native
    
    /**
      * An object that shows the endpoints that were messaged for each user. The object provides a list of user IDs. For each user ID, it provides the endpoint IDs that were messaged. For each endpoint ID, it provides an EndpointMessageResult object.
      */
    var Result: js.UndefOr[
        (StringDictionary[
          StringDictionary[EndpointMessageResult] | (Iterable[js.Tuple2[String, EndpointMessageResult]])
        ]) | (Iterable[
          js.Tuple2[
            String, 
            StringDictionary[EndpointMessageResult] | (Iterable[js.Tuple2[String, EndpointMessageResult]])
          ]
        ])
      ] = js.native
  }
  object SendUsersMessageResponse {
    
    @scala.inline
    def apply(): SendUsersMessageResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendUsersMessageResponse]
    }
    
    @scala.inline
    implicit class SendUsersMessageResponseMutableBuilder[Self <: SendUsersMessageResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
      
      @scala.inline
      def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
      
      @scala.inline
      def setResult(
        value: (StringDictionary[
              StringDictionary[EndpointMessageResult] | (Iterable[js.Tuple2[String, EndpointMessageResult]])
            ]) | (Iterable[
              js.Tuple2[
                String, 
                StringDictionary[EndpointMessageResult] | (Iterable[js.Tuple2[String, EndpointMessageResult]])
              ]
            ])
      ): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledSendUsersMessageResponse extends SendUsersMessageResponse {
    
    /**
      * An object that shows the endpoints that were messaged for each user. The object provides a list of user IDs. For each user ID, it provides the endpoint IDs that were messaged. For each endpoint ID, it provides an EndpointMessageResult object.
      */
    @JSName("Result")
    var Result_UnmarshalledSendUsersMessageResponse: js.UndefOr[StringDictionary[StringDictionary[UnmarshalledEndpointMessageResult]]] = js.native
  }
  object UnmarshalledSendUsersMessageResponse {
    
    @scala.inline
    def apply(): UnmarshalledSendUsersMessageResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSendUsersMessageResponse]
    }
    
    @scala.inline
    implicit class UnmarshalledSendUsersMessageResponseMutableBuilder[Self <: UnmarshalledSendUsersMessageResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResult(value: StringDictionary[StringDictionary[UnmarshalledEndpointMessageResult]]): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
    }
  }
}
