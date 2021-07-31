package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesApnssandboxchannelresponseMod.UnmarshalledAPNSSandboxChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetApnsSandboxChannelOutputMod {
  
  trait GetApnsSandboxChannelOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Apple Development Push Notification Service channel definition.
      */
    var APNSSandboxChannelResponse: UnmarshalledAPNSSandboxChannelResponse
  }
  object GetApnsSandboxChannelOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, APNSSandboxChannelResponse: UnmarshalledAPNSSandboxChannelResponse): GetApnsSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSSandboxChannelResponse = APNSSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetApnsSandboxChannelOutput]
    }
    
    @scala.inline
    implicit class GetApnsSandboxChannelOutputMutableBuilder[Self <: GetApnsSandboxChannelOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAPNSSandboxChannelResponse(value: UnmarshalledAPNSSandboxChannelResponse): Self = StObject.set(x, "APNSSandboxChannelResponse", value.asInstanceOf[js.Any])
    }
  }
}
