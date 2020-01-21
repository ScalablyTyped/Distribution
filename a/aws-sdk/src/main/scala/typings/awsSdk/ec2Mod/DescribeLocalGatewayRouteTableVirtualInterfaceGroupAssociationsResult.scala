package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult extends js.Object {
  /**
    * Information about the associations.
    */
  var LocalGatewayRouteTableVirtualInterfaceGroupAssociations: js.UndefOr[LocalGatewayRouteTableVirtualInterfaceGroupAssociationSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult {
  @scala.inline
  def apply(
    LocalGatewayRouteTableVirtualInterfaceGroupAssociations: LocalGatewayRouteTableVirtualInterfaceGroupAssociationSet = null,
    NextToken: String = null
  ): DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult = {
    val __obj = js.Dynamic.literal()
    if (LocalGatewayRouteTableVirtualInterfaceGroupAssociations != null) __obj.updateDynamic("LocalGatewayRouteTableVirtualInterfaceGroupAssociations")(LocalGatewayRouteTableVirtualInterfaceGroupAssociations.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult]
  }
}

