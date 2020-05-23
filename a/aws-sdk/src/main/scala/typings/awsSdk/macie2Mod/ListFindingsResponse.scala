package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFindingsResponse extends js.Object {
  /**
    * An array of strings, where each string is the unique identifier for a finding that meets the filter criteria specified in the request.
    */
  var findingIds: js.UndefOr[listOfString] = js.native
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.native
}

object ListFindingsResponse {
  @scala.inline
  def apply(findingIds: listOfString = null, nextToken: string = null): ListFindingsResponse = {
    val __obj = js.Dynamic.literal()
    if (findingIds != null) __obj.updateDynamic("findingIds")(findingIds.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFindingsResponse]
  }
}

