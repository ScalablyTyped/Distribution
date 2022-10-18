package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesTraceSummaryMod.UnmarshalledTraceSummary
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetTraceSummariesOutputMod {
  
  trait GetTraceSummariesOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The start time of this page of results.</p>
      */
    var ApproximateTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * <p>If the requested time frame contained more than one page of results, you can use this token to retrieve the next page. The first page contains the most most recent results, closest to the end of the time frame.</p>
      */
    var NextToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Trace IDs and metadata for traces that were found in the specified time frame.</p>
      */
    var TraceSummaries: js.UndefOr[js.Array[UnmarshalledTraceSummary]] = js.undefined
    
    /**
      * <p>The total number of traces processed, including traces that did not match the specified filter expression.</p>
      */
    var TracesProcessedCount: js.UndefOr[Double] = js.undefined
  }
  object GetTraceSummariesOutput {
    
    inline def apply($metadata: ResponseMetadata): GetTraceSummariesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTraceSummariesOutput]
    }
    
    extension [Self <: GetTraceSummariesOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setApproximateTime(value: js.Date): Self = StObject.set(x, "ApproximateTime", value.asInstanceOf[js.Any])
      
      inline def setApproximateTimeUndefined: Self = StObject.set(x, "ApproximateTime", js.undefined)
      
      inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      inline def setTraceSummaries(value: js.Array[UnmarshalledTraceSummary]): Self = StObject.set(x, "TraceSummaries", value.asInstanceOf[js.Any])
      
      inline def setTraceSummariesUndefined: Self = StObject.set(x, "TraceSummaries", js.undefined)
      
      inline def setTraceSummariesVarargs(value: UnmarshalledTraceSummary*): Self = StObject.set(x, "TraceSummaries", js.Array(value*))
      
      inline def setTracesProcessedCount(value: Double): Self = StObject.set(x, "TracesProcessedCount", value.asInstanceOf[js.Any])
      
      inline def setTracesProcessedCountUndefined: Self = StObject.set(x, "TracesProcessedCount", js.undefined)
    }
  }
}
