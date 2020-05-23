package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingsRequest extends js.Object {
  /**
    * An array of strings that lists the unique identifiers for the findings to retrieve information about.
    */
  var findingIds: listOfString = js.native
  /**
    * The criteria for sorting the results of the request.
    */
  var sortCriteria: js.UndefOr[SortCriteria] = js.native
}

object GetFindingsRequest {
  @scala.inline
  def apply(findingIds: listOfString, sortCriteria: SortCriteria = null): GetFindingsRequest = {
    val __obj = js.Dynamic.literal(findingIds = findingIds.asInstanceOf[js.Any])
    if (sortCriteria != null) __obj.updateDynamic("sortCriteria")(sortCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsRequest]
  }
}

