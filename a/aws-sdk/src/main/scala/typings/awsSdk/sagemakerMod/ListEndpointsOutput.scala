package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEndpointsOutput extends StObject {
  
  /**
    *  An array or endpoint objects. 
    */
  var Endpoints: EndpointSummaryList
  
  /**
    *  If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training jobs, use it in the subsequent request. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListEndpointsOutput {
  
  inline def apply(Endpoints: EndpointSummaryList): ListEndpointsOutput = {
    val __obj = js.Dynamic.literal(Endpoints = Endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEndpointsOutput]
  }
  
  extension [Self <: ListEndpointsOutput](x: Self) {
    
    inline def setEndpoints(value: EndpointSummaryList): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsVarargs(value: EndpointSummary*): Self = StObject.set(x, "Endpoints", js.Array(value :_*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
