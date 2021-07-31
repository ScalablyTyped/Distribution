package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAutoMLJobsRequest extends StObject {
  
  /**
    * Request a list of jobs, using a filter for time.
    */
  var CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Request a list of jobs, using a filter for time.
    */
  var CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Request a list of jobs, using a filter for time.
    */
  var LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Request a list of jobs, using a filter for time.
    */
  var LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Request a list of jobs up to a specified limit.
    */
  var MaxResults: js.UndefOr[AutoMLMaxResults] = js.undefined
  
  /**
    * Request a list of jobs, using a search filter for name.
    */
  var NameContains: js.UndefOr[AutoMLNameContains] = js.undefined
  
  /**
    * If the previous response was truncated, you receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * The parameter by which to sort the results. The default is AutoMLJobName.
    */
  var SortBy: js.UndefOr[AutoMLSortBy] = js.undefined
  
  /**
    * The sort order for the results. The default is Descending.
    */
  var SortOrder: js.UndefOr[AutoMLSortOrder] = js.undefined
  
  /**
    * Request a list of jobs, using a filter for status.
    */
  var StatusEquals: js.UndefOr[AutoMLJobStatus] = js.undefined
}
object ListAutoMLJobsRequest {
  
  @scala.inline
  def apply(): ListAutoMLJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAutoMLJobsRequest]
  }
  
  @scala.inline
  implicit class ListAutoMLJobsRequestMutableBuilder[Self <: ListAutoMLJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimeAfter(value: Timestamp): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    @scala.inline
    def setCreationTimeBefore(value: Timestamp): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    @scala.inline
    def setLastModifiedTimeAfter(value: Timestamp): Self = StObject.set(x, "LastModifiedTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeAfterUndefined: Self = StObject.set(x, "LastModifiedTimeAfter", js.undefined)
    
    @scala.inline
    def setLastModifiedTimeBefore(value: Timestamp): Self = StObject.set(x, "LastModifiedTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeBeforeUndefined: Self = StObject.set(x, "LastModifiedTimeBefore", js.undefined)
    
    @scala.inline
    def setMaxResults(value: AutoMLMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNameContains(value: AutoMLNameContains): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSortBy(value: AutoMLSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: AutoMLSortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    @scala.inline
    def setStatusEquals(value: AutoMLJobStatus): Self = StObject.set(x, "StatusEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusEqualsUndefined: Self = StObject.set(x, "StatusEquals", js.undefined)
  }
}
