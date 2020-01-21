package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIpGroupsResult extends js.Object {
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Information about the IP access control groups.
    */
  var Result: js.UndefOr[WorkspacesIpGroupsList] = js.native
}

object DescribeIpGroupsResult {
  @scala.inline
  def apply(NextToken: PaginationToken = null, Result: WorkspacesIpGroupsList = null): DescribeIpGroupsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Result != null) __obj.updateDynamic("Result")(Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIpGroupsResult]
  }
}

