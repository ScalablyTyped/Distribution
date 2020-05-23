package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAvailableManagementCidrRangesRequest extends js.Object {
  /**
    * The IP address range to search. Specify an IP address range that is compatible with your network and in CIDR notation (that is, specify the range as an IPv4 CIDR block).
    */
  var ManagementCidrRangeConstraint: typings.awsSdk.workspacesMod.ManagementCidrRangeConstraint = js.native
  /**
    * The maximum number of items to return.
    */
  var MaxResults: js.UndefOr[ManagementCidrRangeMaxResults] = js.native
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListAvailableManagementCidrRangesRequest {
  @scala.inline
  def apply(
    ManagementCidrRangeConstraint: ManagementCidrRangeConstraint,
    MaxResults: js.UndefOr[ManagementCidrRangeMaxResults] = js.undefined,
    NextToken: PaginationToken = null
  ): ListAvailableManagementCidrRangesRequest = {
    val __obj = js.Dynamic.literal(ManagementCidrRangeConstraint = ManagementCidrRangeConstraint.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAvailableManagementCidrRangesRequest]
  }
}

