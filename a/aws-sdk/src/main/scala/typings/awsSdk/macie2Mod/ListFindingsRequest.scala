package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFindingsRequest extends StObject {
  
  /**
    * The criteria to use to filter the results.
    */
  var findingCriteria: js.UndefOr[FindingCriteria] = js.native
  
  /**
    * The maximum number of items to include in each page of the response.
    */
  var maxResults: js.UndefOr[integer] = js.native
  
  /**
    * The nextToken string that specifies which page of results to return in a paginated response.
    */
  var nextToken: js.UndefOr[string] = js.native
  
  /**
    * The criteria to use to sort the results.
    */
  var sortCriteria: js.UndefOr[SortCriteria] = js.native
}
object ListFindingsRequest {
  
  @scala.inline
  def apply(): ListFindingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFindingsRequest]
  }
  
  @scala.inline
  implicit class ListFindingsRequestMutableBuilder[Self <: ListFindingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindingCriteria(value: FindingCriteria): Self = StObject.set(x, "findingCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingCriteriaUndefined: Self = StObject.set(x, "findingCriteria", js.undefined)
    
    @scala.inline
    def setMaxResults(value: integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSortCriteria(value: SortCriteria): Self = StObject.set(x, "sortCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCriteriaUndefined: Self = StObject.set(x, "sortCriteria", js.undefined)
  }
}
