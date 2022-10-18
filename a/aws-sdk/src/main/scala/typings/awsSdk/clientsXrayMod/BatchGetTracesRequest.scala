package typings.awsSdk.clientsXrayMod

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
  
  inline def apply(TraceIds: TraceIdList): BatchGetTracesRequest = {
    val __obj = js.Dynamic.literal(TraceIds = TraceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetTracesRequest]
  }
  
  extension [Self <: BatchGetTracesRequest](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTraceIds(value: TraceIdList): Self = StObject.set(x, "TraceIds", value.asInstanceOf[js.Any])
    
    inline def setTraceIdsVarargs(value: TraceId*): Self = StObject.set(x, "TraceIds", js.Array(value*))
  }
}
