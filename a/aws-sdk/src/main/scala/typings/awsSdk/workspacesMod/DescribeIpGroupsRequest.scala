package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIpGroupsRequest extends js.Object {
  /**
    * The identifiers of one or more IP access control groups.
    */
  var GroupIds: js.UndefOr[IpGroupIdList] = js.native
  /**
    * The maximum number of items to return.
    */
  var MaxResults: js.UndefOr[Limit] = js.native
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object DescribeIpGroupsRequest {
  @scala.inline
  def apply(GroupIds: IpGroupIdList = null, MaxResults: Int | Double = null, NextToken: PaginationToken = null): DescribeIpGroupsRequest = {
    val __obj = js.Dynamic.literal()
    if (GroupIds != null) __obj.updateDynamic("GroupIds")(GroupIds.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIpGroupsRequest]
  }
}

