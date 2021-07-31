package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesSegmentResponseMod.UnmarshalledSegmentResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetSegmentVersionOutputMod {
  
  trait GetSegmentVersionOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Segment definition.
      */
    var SegmentResponse: UnmarshalledSegmentResponse
  }
  object GetSegmentVersionOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, SegmentResponse: UnmarshalledSegmentResponse): GetSegmentVersionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSegmentVersionOutput]
    }
    
    @scala.inline
    implicit class GetSegmentVersionOutputMutableBuilder[Self <: GetSegmentVersionOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentResponse(value: UnmarshalledSegmentResponse): Self = StObject.set(x, "SegmentResponse", value.asInstanceOf[js.Any])
    }
  }
}
