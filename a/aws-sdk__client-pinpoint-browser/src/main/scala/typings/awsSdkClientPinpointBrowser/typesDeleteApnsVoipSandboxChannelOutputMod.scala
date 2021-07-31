package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesApnsvoipsandboxchannelresponseMod.UnmarshalledAPNSVoipSandboxChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteApnsVoipSandboxChannelOutputMod {
  
  trait DeleteApnsVoipSandboxChannelOutput
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
  object DeleteApnsVoipSandboxChannelOutput {
    
    @scala.inline
    def apply(
      $metadata: ResponseMetadata,
      APNSVoipSandboxChannelResponse: UnmarshalledAPNSVoipSandboxChannelResponse
    ): DeleteApnsVoipSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteApnsVoipSandboxChannelOutput]
    }
    
    @scala.inline
    implicit class DeleteApnsVoipSandboxChannelOutputMutableBuilder[Self <: DeleteApnsVoipSandboxChannelOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAPNSVoipSandboxChannelResponse(value: UnmarshalledAPNSVoipSandboxChannelResponse): Self = StObject.set(x, "APNSVoipSandboxChannelResponse", value.asInstanceOf[js.Any])
    }
  }
}
