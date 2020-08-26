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
  def apply(): DescribeDirectConnectGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectConnectGatewaysResult]
  }
  @scala.inline
  implicit class DescribeDirectConnectGatewaysResultOps[Self <: DescribeDirectConnectGatewaysResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirectConnectGatewaysVarargs(value: DirectConnectGateway*): Self = this.set("directConnectGateways", js.Array(value :_*))
    @scala.inline
    def setDirectConnectGateways(value: DirectConnectGatewayList): Self = this.set("directConnectGateways", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectConnectGateways: Self = this.set("directConnectGateways", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

