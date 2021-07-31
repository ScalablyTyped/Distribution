package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComplianceSummariesRequest extends StObject {
  
  /**
    * One or more compliance or inventory filters. Use a filter to return a more specific list of results.
    */
  var Filters: js.UndefOr[ComplianceStringFilterList] = js.undefined
  
  /**
    * The maximum number of items to return for this call. Currently, you can specify null or 50. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.undefined
  
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
}
object ListComplianceSummariesRequest {
  
  @scala.inline
  def apply(): ListComplianceSummariesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComplianceSummariesRequest]
  }
  
  @scala.inline
  implicit class ListComplianceSummariesRequestMutableBuilder[Self <: ListComplianceSummariesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: ComplianceStringFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: ComplianceStringFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
