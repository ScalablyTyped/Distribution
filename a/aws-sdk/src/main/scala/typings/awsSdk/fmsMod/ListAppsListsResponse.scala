package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppsListsResponse extends StObject {
  
  /**
    * An array of AppsListDataSummary objects.
    */
  var AppsLists: js.UndefOr[AppsListsData] = js.undefined
  
  /**
    * If you specify a value for MaxResults in your list request, and you have more objects than the maximum, AWS Firewall Manager returns this token in the response. You can use this token in subsequent requests to retrieve the next batch of objects.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListAppsListsResponse {
  
  @scala.inline
  def apply(): ListAppsListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppsListsResponse]
  }
  
  @scala.inline
  implicit class ListAppsListsResponseMutableBuilder[Self <: ListAppsListsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppsLists(value: AppsListsData): Self = StObject.set(x, "AppsLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsListsUndefined: Self = StObject.set(x, "AppsLists", js.undefined)
    
    @scala.inline
    def setAppsListsVarargs(value: AppsListDataSummary*): Self = StObject.set(x, "AppsLists", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
