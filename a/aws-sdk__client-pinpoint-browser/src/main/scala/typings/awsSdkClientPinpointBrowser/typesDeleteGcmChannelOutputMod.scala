package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesGcmchannelresponseMod.UnmarshalledGCMChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteGcmChannelOutputMod {
  
  trait DeleteGcmChannelOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Google Cloud Messaging channel definition
      */
    var GCMChannelResponse: UnmarshalledGCMChannelResponse
  }
  object DeleteGcmChannelOutput {
    
    inline def apply($metadata: ResponseMetadata, GCMChannelResponse: UnmarshalledGCMChannelResponse): DeleteGcmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], GCMChannelResponse = GCMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteGcmChannelOutput]
    }
    
    extension [Self <: DeleteGcmChannelOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setGCMChannelResponse(value: UnmarshalledGCMChannelResponse): Self = StObject.set(x, "GCMChannelResponse", value.asInstanceOf[js.Any])
    }
  }
}
