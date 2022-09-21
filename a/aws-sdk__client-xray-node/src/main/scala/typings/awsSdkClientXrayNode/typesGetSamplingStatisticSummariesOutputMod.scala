package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesSamplingStatisticSummaryMod.UnmarshalledSamplingStatisticSummary
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetSamplingStatisticSummariesOutputMod {
  
  trait GetSamplingStatisticSummariesOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Pagination token. Not used.</p>
      */
    var NextToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Information about the number of requests instrumented for each sampling rule.</p>
      */
    var SamplingStatisticSummaries: js.UndefOr[js.Array[UnmarshalledSamplingStatisticSummary]] = js.undefined
  }
  object GetSamplingStatisticSummariesOutput {
    
    inline def apply($metadata: ResponseMetadata): GetSamplingStatisticSummariesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSamplingStatisticSummariesOutput]
    }
    
    extension [Self <: GetSamplingStatisticSummariesOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      inline def setSamplingStatisticSummaries(value: js.Array[UnmarshalledSamplingStatisticSummary]): Self = StObject.set(x, "SamplingStatisticSummaries", value.asInstanceOf[js.Any])
      
      inline def setSamplingStatisticSummariesUndefined: Self = StObject.set(x, "SamplingStatisticSummaries", js.undefined)
      
      inline def setSamplingStatisticSummariesVarargs(value: UnmarshalledSamplingStatisticSummary*): Self = StObject.set(x, "SamplingStatisticSummaries", js.Array(value*))
    }
  }
}
