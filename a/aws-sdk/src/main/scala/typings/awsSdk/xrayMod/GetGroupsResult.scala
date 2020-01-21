package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupsResult extends js.Object {
  /**
    * The collection of all active groups.
    */
  var Groups: js.UndefOr[GroupSummaryList] = js.native
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object GetGroupsResult {
  @scala.inline
  def apply(Groups: GroupSummaryList = null, NextToken: String = null): GetGroupsResult = {
    val __obj = js.Dynamic.literal()
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupsResult]
  }
}

