package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesEmailChannelResponseMod.UnmarshalledEmailChannelResponse
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateEmailChannelOutputMod {
  
  trait UpdateEmailChannelOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Email Channel Response.
      */
    var EmailChannelResponse: UnmarshalledEmailChannelResponse
  }
  object UpdateEmailChannelOutput {
    
    inline def apply($metadata: ResponseMetadata, EmailChannelResponse: UnmarshalledEmailChannelResponse): UpdateEmailChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateEmailChannelOutput]
    }
    
    extension [Self <: UpdateEmailChannelOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setEmailChannelResponse(value: UnmarshalledEmailChannelResponse): Self = StObject.set(x, "EmailChannelResponse", value.asInstanceOf[js.Any])
    }
  }
}
