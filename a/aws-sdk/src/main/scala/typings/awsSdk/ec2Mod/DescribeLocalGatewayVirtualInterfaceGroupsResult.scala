package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocalGatewayVirtualInterfaceGroupsResult extends js.Object {
  /**
    * The virtual interface groups.
    */
  var LocalGatewayVirtualInterfaceGroups: js.UndefOr[LocalGatewayVirtualInterfaceGroupSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeLocalGatewayVirtualInterfaceGroupsResult {
  @scala.inline
  def apply(
    LocalGatewayVirtualInterfaceGroups: LocalGatewayVirtualInterfaceGroupSet = null,
    NextToken: String = null
  ): DescribeLocalGatewayVirtualInterfaceGroupsResult = {
    val __obj = js.Dynamic.literal()
    if (LocalGatewayVirtualInterfaceGroups != null) __obj.updateDynamic("LocalGatewayVirtualInterfaceGroups")(LocalGatewayVirtualInterfaceGroups.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocalGatewayVirtualInterfaceGroupsResult]
  }
}

