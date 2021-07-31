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
  
  @scala.inline
  def apply(): BatchGetTracesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetTracesResult]
  }
  
  @scala.inline
  implicit class BatchGetTracesResultMutableBuilder[Self <: BatchGetTracesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTraces(value: TraceList): Self = StObject.set(x, "Traces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracesUndefined: Self = StObject.set(x, "Traces", js.undefined)
    
    @scala.inline
    def setTracesVarargs(value: Trace*): Self = StObject.set(x, "Traces", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedTraceIds(value: UnprocessedTraceIdList): Self = StObject.set(x, "UnprocessedTraceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedTraceIdsUndefined: Self = StObject.set(x, "UnprocessedTraceIds", js.undefined)
    
    @scala.inline
    def setUnprocessedTraceIdsVarargs(value: TraceId*): Self = StObject.set(x, "UnprocessedTraceIds", js.Array(value :_*))
  }
}
