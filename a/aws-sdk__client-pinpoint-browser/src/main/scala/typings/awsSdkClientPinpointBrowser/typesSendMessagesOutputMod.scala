package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesMessageResponseMod.UnmarshalledMessageResponse
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSendMessagesOutputMod {
  
  trait SendMessagesOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Send message response.
      */
    var MessageResponse: UnmarshalledMessageResponse
  }
  object SendMessagesOutput {
    
    inline def apply($metadata: ResponseMetadata, MessageResponse: UnmarshalledMessageResponse): SendMessagesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], MessageResponse = MessageResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendMessagesOutput]
    }
    
    extension [Self <: SendMessagesOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setMessageResponse(value: UnmarshalledMessageResponse): Self = StObject.set(x, "MessageResponse", value.asInstanceOf[js.Any])
    }
  }
}
