package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGroupsRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  
  /**
    * The maximum number of items to return with this call.
    */
  var Limit: js.UndefOr[PositiveIntegerType] = js.native
  
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[MarkerType] = js.native
  
  /**
    * The ID of the organization.
    */
  var OrganizationId: js.UndefOr[IdType] = js.native
  
  /**
    * A query to describe groups by group name.
    */
  var SearchQuery: SearchQueryType = js.native
}
object DescribeGroupsRequest {
  
  @scala.inline
  def apply(SearchQuery: SearchQueryType): DescribeGroupsRequest = {
    val __obj = js.Dynamic.literal(SearchQuery = SearchQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGroupsRequest]
  }
  
  @scala.inline
  implicit class DescribeGroupsRequestMutableBuilder[Self <: DescribeGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setLimit(value: PositiveIntegerType): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setMarker(value: MarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setOrganizationId(value: IdType): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationIdUndefined: Self = StObject.set(x, "OrganizationId", js.undefined)
    
    @scala.inline
    def setSearchQuery(value: SearchQueryType): Self = StObject.set(x, "SearchQuery", value.asInstanceOf[js.Any])
  }
}
