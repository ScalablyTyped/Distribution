package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUsersRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * A comma-separated list of values. Specify "STORAGE_METADATA" to include the user storage quota and utilization information.
    */
  var Fields: js.UndefOr[FieldNamesType] = js.undefined
  
  /**
    * The state of the users. Specify "ALL" to include inactive users.
    */
  var Include: js.UndefOr[UserFilterType] = js.undefined
  
  /**
    * The maximum number of items to return.
    */
  var Limit: js.UndefOr[LimitType] = js.undefined
  
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
  
  /**
    * The order for the results.
    */
  var Order: js.UndefOr[OrderType] = js.undefined
  
  /**
    * The ID of the organization.
    */
  var OrganizationId: js.UndefOr[IdType] = js.undefined
  
  /**
    * A query to filter users by user name.
    */
  var Query: js.UndefOr[SearchQueryType] = js.undefined
  
  /**
    * The sorting criteria.
    */
  var Sort: js.UndefOr[UserSortType] = js.undefined
  
  /**
    * The IDs of the users.
    */
  var UserIds: js.UndefOr[UserIdsType] = js.undefined
}
object DescribeUsersRequest {
  
  @scala.inline
  def apply(): DescribeUsersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUsersRequest]
  }
  
  @scala.inline
  implicit class DescribeUsersRequestMutableBuilder[Self <: DescribeUsersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setFields(value: FieldNamesType): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "Fields", js.undefined)
    
    @scala.inline
    def setInclude(value: UserFilterType): Self = StObject.set(x, "Include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "Include", js.undefined)
    
    @scala.inline
    def setLimit(value: LimitType): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setMarker(value: PageMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setOrder(value: OrderType): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "Order", js.undefined)
    
    @scala.inline
    def setOrganizationId(value: IdType): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationIdUndefined: Self = StObject.set(x, "OrganizationId", js.undefined)
    
    @scala.inline
    def setQuery(value: SearchQueryType): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "Query", js.undefined)
    
    @scala.inline
    def setSort(value: UserSortType): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "Sort", js.undefined)
    
    @scala.inline
    def setUserIds(value: UserIdsType): Self = StObject.set(x, "UserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdsUndefined: Self = StObject.set(x, "UserIds", js.undefined)
  }
}
