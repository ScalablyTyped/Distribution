package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUsersRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * A comma-separated list of values. Specify "STORAGE_METADATA" to include the user storage quota and utilization information.
    */
  var Fields: js.UndefOr[FieldNamesType] = js.native
  /**
    * The state of the users. Specify "ALL" to include inactive users.
    */
  var Include: js.UndefOr[UserFilterType] = js.native
  /**
    * The maximum number of items to return.
    */
  var Limit: js.UndefOr[LimitType] = js.native
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
  /**
    * The order for the results.
    */
  var Order: js.UndefOr[OrderType] = js.native
  /**
    * The ID of the organization.
    */
  var OrganizationId: js.UndefOr[IdType] = js.native
  /**
    * A query to filter users by user name.
    */
  var Query: js.UndefOr[SearchQueryType] = js.native
  /**
    * The sorting criteria.
    */
  var Sort: js.UndefOr[UserSortType] = js.native
  /**
    * The IDs of the users.
    */
  var UserIds: js.UndefOr[UserIdsType] = js.native
}

object DescribeUsersRequest {
  @scala.inline
  def apply(): DescribeUsersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUsersRequest]
  }
  @scala.inline
  implicit class DescribeUsersRequestOps[Self <: DescribeUsersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = this.set("AuthenticationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationToken: Self = this.set("AuthenticationToken", js.undefined)
    @scala.inline
    def setFields(value: FieldNamesType): Self = this.set("Fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("Fields", js.undefined)
    @scala.inline
    def setInclude(value: UserFilterType): Self = this.set("Include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("Include", js.undefined)
    @scala.inline
    def setLimit(value: LimitType): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setMarker(value: PageMarkerType): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setOrder(value: OrderType): Self = this.set("Order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("Order", js.undefined)
    @scala.inline
    def setOrganizationId(value: IdType): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationId: Self = this.set("OrganizationId", js.undefined)
    @scala.inline
    def setQuery(value: SearchQueryType): Self = this.set("Query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("Query", js.undefined)
    @scala.inline
    def setSort(value: UserSortType): Self = this.set("Sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("Sort", js.undefined)
    @scala.inline
    def setUserIds(value: UserIdsType): Self = this.set("UserIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIds: Self = this.set("UserIds", js.undefined)
  }
  
}

