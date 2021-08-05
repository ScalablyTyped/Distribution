package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetTracesResult extends StObject {
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Full traces for the specified requests.
    */
  var Traces: js.UndefOr[TraceList] = js.undefined
  
  /**
    * Trace IDs of requests that haven't been processed.
    */
  var UnprocessedTraceIds: js.UndefOr[UnprocessedTraceIdList] = js.undefined
}
object BatchGetTracesResult {
  
  inline def apply(): BatchGetTracesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetTracesResult]
  }
  
  extension [Self <: BatchGetTracesResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTraces(value: TraceList): Self = StObject.set(x, "Traces", value.asInstanceOf[js.Any])
    
    inline def setTracesUndefined: Self = StObject.set(x, "Traces", js.undefined)
    
    inline def setTracesVarargs(value: Trace*): Self = StObject.set(x, "Traces", js.Array(value :_*))
    
    inline def setUnprocessedTraceIds(value: UnprocessedTraceIdList): Self = StObject.set(x, "UnprocessedTraceIds", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedTraceIdsUndefined: Self = StObject.set(x, "UnprocessedTraceIds", js.undefined)
    
    inline def setUnprocessedTraceIdsVarargs(value: TraceId*): Self = StObject.set(x, "UnprocessedTraceIds", js.Array(value :_*))
  }
}
