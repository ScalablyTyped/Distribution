package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetTracesRequest extends StObject {
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the trace IDs of requests for which to retrieve segments.
    */
  var TraceIds: TraceIdList
}
object BatchGetTracesRequest {
  
  @scala.inline
  def apply(TraceIds: TraceIdList): BatchGetTracesRequest = {
    val __obj = js.Dynamic.literal(TraceIds = TraceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetTracesRequest]
  }
  
  @scala.inline
  implicit class BatchGetTracesRequestMutableBuilder[Self <: BatchGetTracesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTraceIds(value: TraceIdList): Self = StObject.set(x, "TraceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceIdsVarargs(value: TraceId*): Self = StObject.set(x, "TraceIds", js.Array(value :_*))
  }
}
