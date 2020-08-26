package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpnConnectionResult extends js.Object {
  /**
    * Information about the VPN connection.
    */
  var VpnConnection: js.UndefOr[typings.awsSdk.ec2Mod.VpnConnection] = js.native
}

object CreateVpnConnectionResult {
  @scala.inline
  def apply(): CreateVpnConnectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpnConnectionResult]
  }
  @scala.inline
  implicit class CreateVpnConnectionResultOps[Self <: CreateVpnConnectionResult] (val x: Self) extends AnyVal {
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
    def setVpnConnection(value: VpnConnection): Self = this.set("VpnConnection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnConnection: Self = this.set("VpnConnection", js.undefined)
  }
  
}

