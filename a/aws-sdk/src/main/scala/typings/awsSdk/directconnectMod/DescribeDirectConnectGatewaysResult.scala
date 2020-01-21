package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDirectConnectGatewaysResult extends js.Object {
  /**
    * The Direct Connect gateways.
    */
  var directConnectGateways: js.UndefOr[DirectConnectGatewayList] = js.native
  /**
    * The token to retrieve the next page.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object DescribeDirectConnectGatewaysResult {
  @scala.inline
  def apply(directConnectGateways: DirectConnectGatewayList = null, nextToken: PaginationToken = null): DescribeDirectConnectGatewaysResult = {
    val __obj = js.Dynamic.literal()
    if (directConnectGateways != null) __obj.updateDynamic("directConnectGateways")(directConnectGateways.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDirectConnectGatewaysResult]
  }
}

