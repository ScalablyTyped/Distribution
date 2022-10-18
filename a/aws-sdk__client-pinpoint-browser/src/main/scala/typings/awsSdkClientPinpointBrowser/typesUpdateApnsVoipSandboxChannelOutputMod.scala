package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesApnsvoipsandboxchannelresponseMod.UnmarshalledAPNSVoipSandboxChannelResponse
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateApnsVoipSandboxChannelOutputMod {
  
  trait UpdateApnsVoipSandboxChannelOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Apple VoIP Developer Push Notification Service channel definition.
      */
    var APNSVoipSandboxChannelResponse: UnmarshalledAPNSVoipSandboxChannelResponse
  }
  object UpdateApnsVoipSandboxChannelOutput {
    
    inline def apply(
      $metadata: ResponseMetadata,
      APNSVoipSandboxChannelResponse: UnmarshalledAPNSVoipSandboxChannelResponse
    ): UpdateApnsVoipSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateApnsVoipSandboxChannelOutput]
    }
    
    extension [Self <: UpdateApnsVoipSandboxChannelOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setAPNSVoipSandboxChannelResponse(value: UnmarshalledAPNSVoipSandboxChannelResponse): Self = StObject.set(x, "APNSVoipSandboxChannelResponse", value.asInstanceOf[js.Any])
    }
  }
}
