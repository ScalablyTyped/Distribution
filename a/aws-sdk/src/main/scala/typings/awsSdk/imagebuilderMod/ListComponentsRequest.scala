package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComponentsRequest extends StObject {
  
  /**
    * The filters. 
    */
  var filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum items to return in a request. 
    */
  var maxResults: js.UndefOr[RestrictedInteger] = js.undefined
  
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The owner defines which components you want to list. By default, this request will only show components owned by your account. You can use this field to specify if you want to view components owned by yourself, by Amazon, or those components that have been shared with you by other customers. 
    */
  var owner: js.UndefOr[Ownership] = js.undefined
}
object ListComponentsRequest {
  
  @scala.inline
  def apply(): ListComponentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComponentsRequest]
  }
  
  @scala.inline
  implicit class ListComponentsRequestMutableBuilder[Self <: ListComponentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: RestrictedInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setOwner(value: Ownership): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
