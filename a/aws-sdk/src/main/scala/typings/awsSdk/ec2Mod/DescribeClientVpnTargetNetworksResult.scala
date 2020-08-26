package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClientVpnTargetNetworksResult extends js.Object {
  /**
    * Information about the associated target networks.
    */
  var ClientVpnTargetNetworks: js.UndefOr[TargetNetworkSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
}

object DescribeClientVpnTargetNetworksResult {
  @scala.inline
  def apply(): DescribeClientVpnTargetNetworksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClientVpnTargetNetworksResult]
  }
  @scala.inline
  implicit class DescribeClientVpnTargetNetworksResultOps[Self <: DescribeClientVpnTargetNetworksResult] (val x: Self) extends AnyVal {
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
    def setClientVpnTargetNetworksVarargs(value: TargetNetwork*): Self = this.set("ClientVpnTargetNetworks", js.Array(value :_*))
    @scala.inline
    def setClientVpnTargetNetworks(value: TargetNetworkSet): Self = this.set("ClientVpnTargetNetworks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientVpnTargetNetworks: Self = this.set("ClientVpnTargetNetworks", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

