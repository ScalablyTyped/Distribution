package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGroupsRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * The maximum number of items to return with this call.
    */
  var Limit: js.UndefOr[PositiveIntegerType] = js.undefined
  
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[MarkerType] = js.undefined
  
  /**
    * The ID of the organization.
    */
  var OrganizationId: js.UndefOr[IdType] = js.undefined
  
  /**
    * A query to describe groups by group name.
    */
  var SearchQuery: SearchQueryType
}
object DescribeGroupsRequest {
  
  inline def apply(SearchQuery: SearchQueryType): DescribeGroupsRequest = {
    val __obj = js.Dynamic.literal(SearchQuery = SearchQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGroupsRequest]
  }
  
  extension [Self <: DescribeGroupsRequest](x: Self) {
    
    inline def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    inline def setLimit(value: PositiveIntegerType): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setMarker(value: MarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setOrganizationId(value: IdType): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationIdUndefined: Self = StObject.set(x, "OrganizationId", js.undefined)
    
    inline def setSearchQuery(value: SearchQueryType): Self = StObject.set(x, "SearchQuery", value.asInstanceOf[js.Any])
  }
}
