package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpnGatewayResult extends js.Object {
  /**
    * Information about the virtual private gateway.
    */
  var VpnGateway: js.UndefOr[typings.awsSdk.ec2Mod.VpnGateway] = js.native
}

object CreateVpnGatewayResult {
  @scala.inline
  def apply(): CreateVpnGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpnGatewayResult]
  }
  @scala.inline
  implicit class CreateVpnGatewayResultOps[Self <: CreateVpnGatewayResult] (val x: Self) extends AnyVal {
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
    def setVpnGateway(value: VpnGateway): Self = this.set("VpnGateway", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnGateway: Self = this.set("VpnGateway", js.undefined)
  }
  
}

