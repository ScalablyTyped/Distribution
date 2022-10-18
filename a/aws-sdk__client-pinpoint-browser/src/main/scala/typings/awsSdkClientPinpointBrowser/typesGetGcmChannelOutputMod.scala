package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesGcmchannelresponseMod.UnmarshalledGCMChannelResponse
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetGcmChannelOutputMod {
  
  trait GetGcmChannelOutput
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
  object GetGcmChannelOutput {
    
    inline def apply($metadata: ResponseMetadata, GCMChannelResponse: UnmarshalledGCMChannelResponse): GetGcmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], GCMChannelResponse = GCMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetGcmChannelOutput]
    }
    
    extension [Self <: GetGcmChannelOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setGCMChannelResponse(value: UnmarshalledGCMChannelResponse): Self = StObject.set(x, "GCMChannelResponse", value.asInstanceOf[js.Any])
    }
  }
}
