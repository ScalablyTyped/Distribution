package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClassificationJobsRequest extends StObject {
  
  /**
    * The criteria to use to filter the results.
    */
  var filterCriteria: js.UndefOr[ListJobsFilterCriteria] = js.undefined
  
  /**
    * The maximum number of items to include in each page of the response.
    */
  var maxResults: js.UndefOr[integer] = js.undefined
  
  /**
    * The nextToken string that specifies which page of results to return in a paginated response.
    */
  var nextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The criteria to use to sort the results.
    */
  var sortCriteria: js.UndefOr[ListJobsSortCriteria] = js.undefined
}
object ListClassificationJobsRequest {
  
  @scala.inline
  def apply(): ListClassificationJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClassificationJobsRequest]
  }
  
  @scala.inline
  implicit class ListClassificationJobsRequestMutableBuilder[Self <: ListClassificationJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterCriteria(value: ListJobsFilterCriteria): Self = StObject.set(x, "filterCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterCriteriaUndefined: Self = StObject.set(x, "filterCriteria", js.undefined)
    
    @scala.inline
    def setMaxResults(value: integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSortCriteria(value: ListJobsSortCriteria): Self = StObject.set(x, "sortCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCriteriaUndefined: Self = StObject.set(x, "sortCriteria", js.undefined)
  }
}
