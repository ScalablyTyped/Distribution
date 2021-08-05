package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesApnsvoipchannelresponseMod.UnmarshalledAPNSVoipChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateApnsVoipChannelOutputMod {
  
  trait UpdateApnsVoipChannelOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Apple VoIP Push Notification Service channel definition.
      */
    var APNSVoipChannelResponse: UnmarshalledAPNSVoipChannelResponse
  }
  object UpdateApnsVoipChannelOutput {
    
    inline def apply($metadata: ResponseMetadata, APNSVoipChannelResponse: UnmarshalledAPNSVoipChannelResponse): UpdateApnsVoipChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipChannelResponse = APNSVoipChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateApnsVoipChannelOutput]
    }
    
    extension [Self <: UpdateApnsVoipChannelOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setAPNSVoipChannelResponse(value: UnmarshalledAPNSVoipChannelResponse): Self = StObject.set(x, "APNSVoipChannelResponse", value.asInstanceOf[js.Any])
    }
  }
}
