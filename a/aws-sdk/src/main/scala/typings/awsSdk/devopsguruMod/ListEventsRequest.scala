package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventsRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account. 
    */
  var AccountId: js.UndefOr[AwsAccountId] = js.undefined
  
  /**
    *  A ListEventsFilters object used to specify which events to return. 
    */
  var Filters: ListEventsFilters
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[ListEventsMaxResults] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
}
object ListEventsRequest {
  
  inline def apply(Filters: ListEventsFilters): ListEventsRequest = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventsRequest]
  }
  
  extension [Self <: ListEventsRequest](x: Self) {
    
    inline def setAccountId(value: AwsAccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setFilters(value: ListEventsFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: ListEventsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
