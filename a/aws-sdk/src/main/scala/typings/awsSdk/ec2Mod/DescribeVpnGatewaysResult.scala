package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpnGatewaysResult extends js.Object {
  /**
    * Information about one or more virtual private gateways.
    */
  var VpnGateways: js.UndefOr[VpnGatewayList] = js.native
}

object DescribeVpnGatewaysResult {
  @scala.inline
  def apply(): DescribeVpnGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpnGatewaysResult]
  }
  @scala.inline
  implicit class DescribeVpnGatewaysResultOps[Self <: DescribeVpnGatewaysResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVpnGatewaysVarargs(value: VpnGateway*): Self = this.set("VpnGateways", js.Array(value :_*))
    @scala.inline
    def setVpnGateways(value: VpnGatewayList): Self = this.set("VpnGateways", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnGateways: Self = this.set("VpnGateways", js.undefined)
  }
  
}

