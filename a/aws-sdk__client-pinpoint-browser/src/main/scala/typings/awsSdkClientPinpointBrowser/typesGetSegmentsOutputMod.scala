package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesSegmentsResponseMod.UnmarshalledSegmentsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetSegmentsOutputMod {
  
  trait GetSegmentsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Segments in your account.
      */
    var SegmentsResponse: UnmarshalledSegmentsResponse
  }
  object GetSegmentsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, SegmentsResponse: UnmarshalledSegmentsResponse): GetSegmentsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentsResponse = SegmentsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSegmentsOutput]
    }
    
    @scala.inline
    implicit class GetSegmentsOutputMutableBuilder[Self <: GetSegmentsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsResponse(value: UnmarshalledSegmentsResponse): Self = StObject.set(x, "SegmentsResponse", value.asInstanceOf[js.Any])
    }
  }
}
