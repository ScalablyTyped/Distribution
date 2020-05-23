package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFindingsFiltersResponse extends js.Object {
  /**
    * An array of objects, one for each filter that's associated with the account.
    */
  var findingsFilterListItems: js.UndefOr[listOfFindingsFilterListItem] = js.native
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.native
}

object ListFindingsFiltersResponse {
  @scala.inline
  def apply(findingsFilterListItems: listOfFindingsFilterListItem = null, nextToken: string = null): ListFindingsFiltersResponse = {
    val __obj = js.Dynamic.literal()
    if (findingsFilterListItems != null) __obj.updateDynamic("findingsFilterListItems")(findingsFilterListItems.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFindingsFiltersResponse]
  }
}

