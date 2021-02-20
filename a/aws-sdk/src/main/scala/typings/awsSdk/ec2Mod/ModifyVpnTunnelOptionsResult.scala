package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyVpnTunnelOptionsResult extends StObject {
  
  var VpnConnection: js.UndefOr[typings.awsSdk.ec2Mod.VpnConnection] = js.native
}
object ModifyVpnTunnelOptionsResult {
  
  @scala.inline
  def apply(): ModifyVpnTunnelOptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpnTunnelOptionsResult]
  }
  
  @scala.inline
  implicit class ModifyVpnTunnelOptionsResultMutableBuilder[Self <: ModifyVpnTunnelOptionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpnConnection(value: VpnConnection): Self = StObject.set(x, "VpnConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnConnectionUndefined: Self = StObject.set(x, "VpnConnection", js.undefined)
  }
}
