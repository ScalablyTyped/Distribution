package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAnalysesRequest extends StObject {
  
  /**
    * The ID of the AWS account that contains the analyses that you're searching for.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * The structure for the search filters that you want to apply to your search. 
    */
  var Filters: AnalysisSearchFilterList
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.quicksightMod.MaxResults] = js.undefined
  
  /**
    * A pagination token that can be used in a subsequent request.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object SearchAnalysesRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, Filters: AnalysisSearchFilterList): SearchAnalysesRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAnalysesRequest]
  }
  
  @scala.inline
  implicit class SearchAnalysesRequestMutableBuilder[Self <: SearchAnalysesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: AnalysisSearchFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: AnalysisSearchFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
