package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUsageStatisticsRequest extends js.Object {
  /**
    * The criteria to use to filter the query results.
    */
  var filterBy: js.UndefOr[listOfUsageStatisticsFilter] = js.native
  /**
    * The maximum number of items to include in each page of the response.
    */
  var maxResults: js.UndefOr[integer] = js.native
  /**
    * The nextToken string that specifies which page of results to return in a paginated response.
    */
  var nextToken: js.UndefOr[string] = js.native
  /**
    * The criteria to use to sort the query results.
    */
  var sortBy: js.UndefOr[UsageStatisticsSortBy] = js.native
}

object GetUsageStatisticsRequest {
  @scala.inline
  def apply(
    filterBy: listOfUsageStatisticsFilter = null,
    maxResults: js.UndefOr[integer] = js.undefined,
    nextToken: string = null,
    sortBy: UsageStatisticsSortBy = null
  ): GetUsageStatisticsRequest = {
    val __obj = js.Dynamic.literal()
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsageStatisticsRequest]
  }
}

