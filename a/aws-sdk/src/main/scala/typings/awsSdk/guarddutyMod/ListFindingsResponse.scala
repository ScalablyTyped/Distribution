package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFindingsResponse extends js.Object {
  /**
    * The IDs of the findings that you're listing.
    */
  var FindingIds: typings.awsSdk.guarddutyMod.FindingIds = js.native
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListFindingsResponse {
  @scala.inline
  def apply(FindingIds: FindingIds, NextToken: String = null): ListFindingsResponse = {
    val __obj = js.Dynamic.literal(FindingIds = FindingIds.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFindingsResponse]
  }
}

