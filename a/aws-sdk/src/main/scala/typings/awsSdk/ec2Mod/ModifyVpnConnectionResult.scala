package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpnConnectionResult extends StObject {
  
  var VpnConnection: js.UndefOr[typings.awsSdk.ec2Mod.VpnConnection] = js.undefined
}
object ModifyVpnConnectionResult {
  
  @scala.inline
  def apply(): ModifyVpnConnectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpnConnectionResult]
  }
  
  @scala.inline
  implicit class ModifyVpnConnectionResultMutableBuilder[Self <: ModifyVpnConnectionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpnConnection(value: VpnConnection): Self = StObject.set(x, "VpnConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnConnectionUndefined: Self = StObject.set(x, "VpnConnection", js.undefined)
  }
}
