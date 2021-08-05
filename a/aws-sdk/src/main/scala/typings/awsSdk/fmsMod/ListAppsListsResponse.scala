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
  
  inline def apply(): ListAppsListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppsListsResponse]
  }
  
  extension [Self <: ListAppsListsResponse](x: Self) {
    
    inline def setAppsLists(value: AppsListsData): Self = StObject.set(x, "AppsLists", value.asInstanceOf[js.Any])
    
    inline def setAppsListsUndefined: Self = StObject.set(x, "AppsLists", js.undefined)
    
    inline def setAppsListsVarargs(value: AppsListDataSummary*): Self = StObject.set(x, "AppsLists", js.Array(value :_*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
