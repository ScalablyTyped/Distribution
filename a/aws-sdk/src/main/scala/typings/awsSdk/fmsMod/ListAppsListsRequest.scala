package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAppsListsRequest extends StObject {
  
  /**
    * Specifies whether the lists to retrieve are default lists owned by AWS Firewall Manager.
    */
  var DefaultLists: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of objects that you want AWS Firewall Manager to return for this request. If more objects are available, in the response, AWS Firewall Manager provides a NextToken value that you can use in a subsequent call to get the next batch of objects. If you don't specify this, AWS Firewall Manager returns all available objects.
    */
  var MaxResults: PaginationMaxResults = js.native
  
  /**
    * If you specify a value for MaxResults in your list request, and you have more objects than the maximum, AWS Firewall Manager returns this token in the response. For all but the first request, you provide the token returned by the prior request in the request parameters, to retrieve the next batch of objects.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListAppsListsRequest {
  
  @scala.inline
  def apply(MaxResults: PaginationMaxResults): ListAppsListsRequest = {
    val __obj = js.Dynamic.literal(MaxResults = MaxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppsListsRequest]
  }
  
  @scala.inline
  implicit class ListAppsListsRequestMutableBuilder[Self <: ListAppsListsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultLists(value: Boolean): Self = StObject.set(x, "DefaultLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultListsUndefined: Self = StObject.set(x, "DefaultLists", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PaginationMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
