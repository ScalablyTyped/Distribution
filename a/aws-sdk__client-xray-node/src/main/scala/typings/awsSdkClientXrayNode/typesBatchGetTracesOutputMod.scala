package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesTraceMod.UnmarshalledTrace
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBatchGetTracesOutputMod {
  
  trait BatchGetTracesOutput
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
      * <p>Full traces for the specified requests.</p>
      */
    var Traces: js.UndefOr[js.Array[UnmarshalledTrace]] = js.undefined
    
    /**
      * <p>Trace IDs of requests that haven't been processed.</p>
      */
    var UnprocessedTraceIds: js.UndefOr[js.Array[String]] = js.undefined
  }
  object BatchGetTracesOutput {
    
    inline def apply($metadata: ResponseMetadata): BatchGetTracesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchGetTracesOutput]
    }
    
    extension [Self <: BatchGetTracesOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      inline def setTraces(value: js.Array[UnmarshalledTrace]): Self = StObject.set(x, "Traces", value.asInstanceOf[js.Any])
      
      inline def setTracesUndefined: Self = StObject.set(x, "Traces", js.undefined)
      
      inline def setTracesVarargs(value: UnmarshalledTrace*): Self = StObject.set(x, "Traces", js.Array(value :_*))
      
      inline def setUnprocessedTraceIds(value: js.Array[String]): Self = StObject.set(x, "UnprocessedTraceIds", value.asInstanceOf[js.Any])
      
      inline def setUnprocessedTraceIdsUndefined: Self = StObject.set(x, "UnprocessedTraceIds", js.undefined)
      
      inline def setUnprocessedTraceIdsVarargs(value: String*): Self = StObject.set(x, "UnprocessedTraceIds", js.Array(value :_*))
    }
  }
}
