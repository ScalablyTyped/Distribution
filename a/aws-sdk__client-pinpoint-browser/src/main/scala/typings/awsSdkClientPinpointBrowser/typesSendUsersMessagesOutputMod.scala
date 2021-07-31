package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesSendUsersMessageResponseMod.UnmarshalledSendUsersMessageResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSendUsersMessagesOutputMod {
  
  trait SendUsersMessagesOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * User send message response.
      */
    var SendUsersMessageResponse: UnmarshalledSendUsersMessageResponse
  }
  object SendUsersMessagesOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, SendUsersMessageResponse: UnmarshalledSendUsersMessageResponse): SendUsersMessagesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SendUsersMessageResponse = SendUsersMessageResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendUsersMessagesOutput]
    }
    
    @scala.inline
    implicit class SendUsersMessagesOutputMutableBuilder[Self <: SendUsersMessagesOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendUsersMessageResponse(value: UnmarshalledSendUsersMessageResponse): Self = StObject.set(x, "SendUsersMessageResponse", value.asInstanceOf[js.Any])
    }
  }
}
