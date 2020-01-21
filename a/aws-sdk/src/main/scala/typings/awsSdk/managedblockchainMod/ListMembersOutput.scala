package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMembersOutput extends js.Object {
  /**
    * An array of MemberSummary objects. Each object contains details about a network member.
    */
  var Members: js.UndefOr[MemberSummaryList] = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListMembersOutput {
  @scala.inline
  def apply(Members: MemberSummaryList = null, NextToken: PaginationToken = null): ListMembersOutput = {
    val __obj = js.Dynamic.literal()
    if (Members != null) __obj.updateDynamic("Members")(Members.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMembersOutput]
  }
}

