package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesAdmchannelresponseMod.UnmarshalledADMChannelResponse
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateAdmChannelOutputMod {
  
  trait UpdateAdmChannelOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Amazon Device Messaging channel definition.
      */
    var ADMChannelResponse: UnmarshalledADMChannelResponse
  }
  object UpdateAdmChannelOutput {
    
    inline def apply($metadata: ResponseMetadata, ADMChannelResponse: UnmarshalledADMChannelResponse): UpdateAdmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateAdmChannelOutput]
    }
    
    extension [Self <: UpdateAdmChannelOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setADMChannelResponse(value: UnmarshalledADMChannelResponse): Self = StObject.set(x, "ADMChannelResponse", value.asInstanceOf[js.Any])
    }
  }
}
