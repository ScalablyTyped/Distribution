package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpnConnectionResult extends StObject {
  
  /**
    * Information about the VPN connection.
    */
  var VpnConnection: js.UndefOr[typings.awsSdk.ec2Mod.VpnConnection] = js.undefined
}
object CreateVpnConnectionResult {
  
  @scala.inline
  def apply(): CreateVpnConnectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpnConnectionResult]
  }
  
  @scala.inline
  implicit class CreateVpnConnectionResultMutableBuilder[Self <: CreateVpnConnectionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpnConnection(value: VpnConnection): Self = StObject.set(x, "VpnConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnConnectionUndefined: Self = StObject.set(x, "VpnConnection", js.undefined)
  }
}
