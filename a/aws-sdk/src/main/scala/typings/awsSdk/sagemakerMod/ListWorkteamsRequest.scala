package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkteamsRequest extends StObject {
  
  /**
    * The maximum number of work teams to return in each page of the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.undefined
  
  /**
    * A string in the work team's name. This filter returns only work teams whose name contains the specified string.
    */
  var NameContains: js.UndefOr[WorkteamName] = js.undefined
  
  /**
    * If the result of the previous ListWorkteams request was truncated, the response includes a NextToken. To retrieve the next set of labeling jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * The field to sort results by. The default is CreationTime.
    */
  var SortBy: js.UndefOr[ListWorkteamsSortByOptions] = js.undefined
  
  /**
    * The sort order for results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.undefined
}
object ListWorkteamsRequest {
  
  @scala.inline
  def apply(): ListWorkteamsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkteamsRequest]
  }
  
  @scala.inline
  implicit class ListWorkteamsRequestMutableBuilder[Self <: ListWorkteamsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNameContains(value: WorkteamName): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSortBy(value: ListWorkteamsSortByOptions): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
