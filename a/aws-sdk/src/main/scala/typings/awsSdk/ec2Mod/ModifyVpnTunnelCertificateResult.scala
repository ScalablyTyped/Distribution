package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyVpnTunnelCertificateResult extends js.Object {
  
  var VpnConnection: js.UndefOr[typings.awsSdk.ec2Mod.VpnConnection] = js.native
}
object ModifyVpnTunnelCertificateResult {
  
  @scala.inline
  def apply(): ModifyVpnTunnelCertificateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpnTunnelCertificateResult]
  }
  
  @scala.inline
  implicit class ModifyVpnTunnelCertificateResultOps[Self <: ModifyVpnTunnelCertificateResult] (val x: Self) extends AnyVal {
    
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
