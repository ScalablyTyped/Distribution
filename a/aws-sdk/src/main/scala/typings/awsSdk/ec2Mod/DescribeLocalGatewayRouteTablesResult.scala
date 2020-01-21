package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocalGatewayRouteTablesResult extends js.Object {
  /**
    * Information about the local gateway route tables.
    */
  var LocalGatewayRouteTables: js.UndefOr[LocalGatewayRouteTableSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeLocalGatewayRouteTablesResult {
  @scala.inline
  def apply(LocalGatewayRouteTables: LocalGatewayRouteTableSet = null, NextToken: String = null): DescribeLocalGatewayRouteTablesResult = {
    val __obj = js.Dynamic.literal()
    if (LocalGatewayRouteTables != null) __obj.updateDynamic("LocalGatewayRouteTables")(LocalGatewayRouteTables.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocalGatewayRouteTablesResult]
  }
}

