package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesAdmchannelresponseMod.UnmarshalledADMChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
    
    @scala.inline
    def apply($metadata: ResponseMetadata, ADMChannelResponse: UnmarshalledADMChannelResponse): UpdateAdmChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateAdmChannelOutput]
    }
    
    @scala.inline
    implicit class UpdateAdmChannelOutputMutableBuilder[Self <: UpdateAdmChannelOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setADMChannelResponse(value: UnmarshalledADMChannelResponse): Self = StObject.set(x, "ADMChannelResponse", value.asInstanceOf[js.Any])
    }
  }
}
