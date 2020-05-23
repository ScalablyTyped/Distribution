package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClassificationJobsRequest extends js.Object {
  /**
    * The criteria to use to filter the results.
    */
  var filterCriteria: js.UndefOr[ListJobsFilterCriteria] = js.native
  /**
    * The maximum number of items to include in each page of the response.
    */
  var maxResults: js.UndefOr[integer] = js.native
  /**
    * The nextToken string that specifies which page of results to return in a paginated response.
    */
  var nextToken: js.UndefOr[string] = js.native
  /**
    * The criteria to use to sort the results.
    */
  var sortCriteria: js.UndefOr[ListJobsSortCriteria] = js.native
}

object ListClassificationJobsRequest {
  @scala.inline
  def apply(
    filterCriteria: ListJobsFilterCriteria = null,
    maxResults: js.UndefOr[integer] = js.undefined,
    nextToken: string = null,
    sortCriteria: ListJobsSortCriteria = null
  ): ListClassificationJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (filterCriteria != null) __obj.updateDynamic("filterCriteria")(filterCriteria.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (sortCriteria != null) __obj.updateDynamic("sortCriteria")(sortCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListClassificationJobsRequest]
  }
}

