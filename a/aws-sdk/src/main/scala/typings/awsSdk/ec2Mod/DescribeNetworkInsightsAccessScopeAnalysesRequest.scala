package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNetworkInsightsAccessScopeAnalysesRequest extends StObject {
  
  /**
    * Filters the results based on the start time. The analysis must have started on or after this time.
    */
  var AnalysisStartTimeBegin: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Filters the results based on the start time. The analysis must have started on or before this time.
    */
  var AnalysisStartTimeEnd: js.UndefOr[js.Date] = js.undefined
  
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
    * The IDs of the Network Access Scope analyses.
    */
  var NetworkInsightsAccessScopeAnalysisIds: js.UndefOr[NetworkInsightsAccessScopeAnalysisIdList] = js.undefined
  
  /**
    * The ID of the Network Access Scope.
    */
  var NetworkInsightsAccessScopeId: js.UndefOr[typings.awsSdk.ec2Mod.NetworkInsightsAccessScopeId] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
}
object DescribeNetworkInsightsAccessScopeAnalysesRequest {
  
  inline def apply(): DescribeNetworkInsightsAccessScopeAnalysesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNetworkInsightsAccessScopeAnalysesRequest]
  }
  
  extension [Self <: DescribeNetworkInsightsAccessScopeAnalysesRequest](x: Self) {
    
    inline def setAnalysisStartTimeBegin(value: js.Date): Self = StObject.set(x, "AnalysisStartTimeBegin", value.asInstanceOf[js.Any])
    
    inline def setAnalysisStartTimeBeginUndefined: Self = StObject.set(x, "AnalysisStartTimeBegin", js.undefined)
    
    inline def setAnalysisStartTimeEnd(value: js.Date): Self = StObject.set(x, "AnalysisStartTimeEnd", value.asInstanceOf[js.Any])
    
    inline def setAnalysisStartTimeEndUndefined: Self = StObject.set(x, "AnalysisStartTimeEnd", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: NetworkInsightsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNetworkInsightsAccessScopeAnalysisIds(value: NetworkInsightsAccessScopeAnalysisIdList): Self = StObject.set(x, "NetworkInsightsAccessScopeAnalysisIds", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAccessScopeAnalysisIdsUndefined: Self = StObject.set(x, "NetworkInsightsAccessScopeAnalysisIds", js.undefined)
    
    inline def setNetworkInsightsAccessScopeAnalysisIdsVarargs(value: NetworkInsightsAccessScopeAnalysisId*): Self = StObject.set(x, "NetworkInsightsAccessScopeAnalysisIds", js.Array(value*))
    
    inline def setNetworkInsightsAccessScopeId(value: NetworkInsightsAccessScopeId): Self = StObject.set(x, "NetworkInsightsAccessScopeId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAccessScopeIdUndefined: Self = StObject.set(x, "NetworkInsightsAccessScopeId", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
