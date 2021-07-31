package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpnTunnelCertificateResult extends StObject {
  
  var VpnConnection: js.UndefOr[typings.awsSdk.ec2Mod.VpnConnection] = js.undefined
}
object ModifyVpnTunnelCertificateResult {
  
  @scala.inline
  def apply(): ModifyVpnTunnelCertificateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpnTunnelCertificateResult]
  }
  
  @scala.inline
  implicit class ModifyVpnTunnelCertificateResultMutableBuilder[Self <: ModifyVpnTunnelCertificateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpnConnection(value: VpnConnection): Self = StObject.set(x, "VpnConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnConnectionUndefined: Self = StObject.set(x, "VpnConnection", js.undefined)
  }
}
