package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReviewableHITsResponse extends StObject {
  
  /**
    *  The list of HIT elements returned by the query.
    */
  var HITs: js.UndefOr[HITList] = js.undefined
  
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  The number of HITs on this page in the filtered results list, equivalent to the number of HITs being returned by this call. 
    */
  var NumResults: js.UndefOr[Integer] = js.undefined
}
object ListReviewableHITsResponse {
  
  inline def apply(): ListReviewableHITsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReviewableHITsResponse]
  }
  
  extension [Self <: ListReviewableHITsResponse](x: Self) {
    
    inline def setHITs(value: HITList): Self = StObject.set(x, "HITs", value.asInstanceOf[js.Any])
    
    inline def setHITsUndefined: Self = StObject.set(x, "HITs", js.undefined)
    
    inline def setHITsVarargs(value: HIT*): Self = StObject.set(x, "HITs", js.Array(value :_*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setNumResults(value: Integer): Self = StObject.set(x, "NumResults", value.asInstanceOf[js.Any])
    
    inline def setNumResultsUndefined: Self = StObject.set(x, "NumResults", js.undefined)
  }
}
