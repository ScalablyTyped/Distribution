package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNetworkInsightsAccessScopesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * There are no supported filters.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[NetworkInsightsMaxResults] = js.undefined
  
  /**
    * The IDs of the Network Access Scopes.
    */
  var NetworkInsightsAccessScopeIds: js.UndefOr[NetworkInsightsAccessScopeIdList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
}
object DescribeNetworkInsightsAccessScopesRequest {
  
  inline def apply(): DescribeNetworkInsightsAccessScopesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNetworkInsightsAccessScopesRequest]
  }
  
  extension [Self <: DescribeNetworkInsightsAccessScopesRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: NetworkInsightsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNetworkInsightsAccessScopeIds(value: NetworkInsightsAccessScopeIdList): Self = StObject.set(x, "NetworkInsightsAccessScopeIds", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAccessScopeIdsUndefined: Self = StObject.set(x, "NetworkInsightsAccessScopeIds", js.undefined)
    
    inline def setNetworkInsightsAccessScopeIdsVarargs(value: NetworkInsightsAccessScopeId*): Self = StObject.set(x, "NetworkInsightsAccessScopeIds", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
