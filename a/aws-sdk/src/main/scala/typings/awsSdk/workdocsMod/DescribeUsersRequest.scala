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
  def apply(
    AuthenticationToken: AuthenticationHeaderType = null,
    Fields: FieldNamesType = null,
    Include: UserFilterType = null,
    Limit: js.UndefOr[LimitType] = js.undefined,
    Marker: PageMarkerType = null,
    Order: OrderType = null,
    OrganizationId: IdType = null,
    Query: SearchQueryType = null,
    Sort: UserSortType = null,
    UserIds: UserIdsType = null
  ): DescribeUsersRequest = {
    val __obj = js.Dynamic.literal()
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    if (Fields != null) __obj.updateDynamic("Fields")(Fields.asInstanceOf[js.Any])
    if (Include != null) __obj.updateDynamic("Include")(Include.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (Order != null) __obj.updateDynamic("Order")(Order.asInstanceOf[js.Any])
    if (OrganizationId != null) __obj.updateDynamic("OrganizationId")(OrganizationId.asInstanceOf[js.Any])
    if (Query != null) __obj.updateDynamic("Query")(Query.asInstanceOf[js.Any])
    if (Sort != null) __obj.updateDynamic("Sort")(Sort.asInstanceOf[js.Any])
    if (UserIds != null) __obj.updateDynamic("UserIds")(UserIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUsersRequest]
  }
}

