package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFindingsRequest extends js.Object {
  /**
    * The criteria to use to filter the results.
    */
  var findingCriteria: js.UndefOr[FindingCriteria] = js.native
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
  var sortCriteria: js.UndefOr[SortCriteria] = js.native
}

object ListFindingsRequest {
  @scala.inline
  def apply(
    findingCriteria: FindingCriteria = null,
    maxResults: js.UndefOr[integer] = js.undefined,
    nextToken: string = null,
    sortCriteria: SortCriteria = null
  ): ListFindingsRequest = {
    val __obj = js.Dynamic.literal()
    if (findingCriteria != null) __obj.updateDynamic("findingCriteria")(findingCriteria.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (sortCriteria != null) __obj.updateDynamic("sortCriteria")(sortCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFindingsRequest]
  }
}

