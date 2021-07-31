package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesUnprocessedTraceSegmentMod.UnmarshalledUnprocessedTraceSegment
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutTraceSegmentsOutputMod {
  
  trait PutTraceSegmentsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Segments that failed processing.</p>
      */
    var UnprocessedTraceSegments: js.UndefOr[js.Array[UnmarshalledUnprocessedTraceSegment]] = js.undefined
  }
  object PutTraceSegmentsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): PutTraceSegmentsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutTraceSegmentsOutput]
    }
    
    @scala.inline
    implicit class PutTraceSegmentsOutputMutableBuilder[Self <: PutTraceSegmentsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnprocessedTraceSegments(value: js.Array[UnmarshalledUnprocessedTraceSegment]): Self = StObject.set(x, "UnprocessedTraceSegments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnprocessedTraceSegmentsUndefined: Self = StObject.set(x, "UnprocessedTraceSegments", js.undefined)
      
      @scala.inline
      def setUnprocessedTraceSegmentsVarargs(value: UnmarshalledUnprocessedTraceSegment*): Self = StObject.set(x, "UnprocessedTraceSegments", js.Array(value :_*))
    }
  }
}
