package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesChannelsResponseMod.UnmarshalledChannelsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetChannelsOutputMod {
  
  trait GetChannelsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Get channels definition
      */
    var ChannelsResponse: UnmarshalledChannelsResponse
  }
  object GetChannelsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, ChannelsResponse: UnmarshalledChannelsResponse): GetChannelsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ChannelsResponse = ChannelsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetChannelsOutput]
    }
    
    @scala.inline
    implicit class GetChannelsOutputMutableBuilder[Self <: GetChannelsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelsResponse(value: UnmarshalledChannelsResponse): Self = StObject.set(x, "ChannelsResponse", value.asInstanceOf[js.Any])
    }
  }
}
