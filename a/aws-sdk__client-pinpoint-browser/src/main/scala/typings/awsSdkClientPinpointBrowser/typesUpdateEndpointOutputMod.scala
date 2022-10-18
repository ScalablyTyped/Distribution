package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesMessageBodyMod.UnmarshalledMessageBody
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateEndpointOutputMod {
  
  trait UpdateEndpointOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Simple message object.
      */
    var MessageBody: UnmarshalledMessageBody
  }
  object UpdateEndpointOutput {
    
    inline def apply($metadata: ResponseMetadata, MessageBody: UnmarshalledMessageBody): UpdateEndpointOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], MessageBody = MessageBody.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateEndpointOutput]
    }
    
    extension [Self <: UpdateEndpointOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setMessageBody(value: UnmarshalledMessageBody): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
    }
  }
}
