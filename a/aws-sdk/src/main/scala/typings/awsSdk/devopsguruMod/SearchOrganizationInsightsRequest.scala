package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchOrganizationInsightsRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account. 
    */
  var AccountIds: SearchInsightsAccountIdList
  
  /**
    *  A SearchOrganizationInsightsFilters object that is used to set the severity and status filters on your insight search. 
    */
  var Filters: js.UndefOr[SearchOrganizationInsightsFilters] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[SearchOrganizationInsightsMaxResults] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
  
  var StartTimeRange: typings.awsSdk.devopsguruMod.StartTimeRange
  
  /**
    *  The type of insights you are searching for (REACTIVE or PROACTIVE). 
    */
  var Type: InsightType
}
object SearchOrganizationInsightsRequest {
  
  inline def apply(AccountIds: SearchInsightsAccountIdList, StartTimeRange: StartTimeRange, Type: InsightType): SearchOrganizationInsightsRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], StartTimeRange = StartTimeRange.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOrganizationInsightsRequest]
  }
  
  extension [Self <: SearchOrganizationInsightsRequest](x: Self) {
    
    inline def setAccountIds(value: SearchInsightsAccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: AwsAccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
    
    inline def setFilters(value: SearchOrganizationInsightsFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setMaxResults(value: SearchOrganizationInsightsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStartTimeRange(value: StartTimeRange): Self = StObject.set(x, "StartTimeRange", value.asInstanceOf[js.Any])
    
    inline def setType(value: InsightType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
