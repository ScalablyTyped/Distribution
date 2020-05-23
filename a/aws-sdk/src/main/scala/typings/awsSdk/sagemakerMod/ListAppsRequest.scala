package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAppsRequest extends js.Object {
  /**
    * A parameter to search for the domain ID.
    */
  var DomainIdEquals: js.UndefOr[DomainId] = js.native
  /**
    * Returns a list up to a specified limit.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * If the previous response was truncated, you will receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * The parameter by which to sort the results. The default is CreationTime.
    */
  var SortBy: js.UndefOr[AppSortKey] = js.native
  /**
    * The sort order for the results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.native
  /**
    * A parameter to search by user profile name.
    */
  var UserProfileNameEquals: js.UndefOr[UserProfileName] = js.native
}

object ListAppsRequest {
  @scala.inline
  def apply(
    DomainIdEquals: DomainId = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    SortBy: AppSortKey = null,
    SortOrder: SortOrder = null,
    UserProfileNameEquals: UserProfileName = null
  ): ListAppsRequest = {
    val __obj = js.Dynamic.literal()
    if (DomainIdEquals != null) __obj.updateDynamic("DomainIdEquals")(DomainIdEquals.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    if (UserProfileNameEquals != null) __obj.updateDynamic("UserProfileNameEquals")(UserProfileNameEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppsRequest]
  }
}

