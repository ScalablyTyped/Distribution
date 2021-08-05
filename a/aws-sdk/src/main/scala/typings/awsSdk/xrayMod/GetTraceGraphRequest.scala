package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTraceGraphRequest extends StObject {
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Trace IDs of requests for which to generate a service graph.
    */
  var TraceIds: TraceIdList
}
object GetTraceGraphRequest {
  
  inline def apply(TraceIds: TraceIdList): GetTraceGraphRequest = {
    val __obj = js.Dynamic.literal(TraceIds = TraceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTraceGraphRequest]
  }
  
  extension [Self <: GetTraceGraphRequest](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTraceIds(value: TraceIdList): Self = StObject.set(x, "TraceIds", value.asInstanceOf[js.Any])
    
    inline def setTraceIdsVarargs(value: TraceId*): Self = StObject.set(x, "TraceIds", js.Array(value :_*))
  }
}
