package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpnConnectionOptionsResult extends StObject {
  
  var VpnConnection: js.UndefOr[typings.awsSdk.ec2Mod.VpnConnection] = js.undefined
}
object ModifyVpnConnectionOptionsResult {
  
  inline def apply(): ModifyVpnConnectionOptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpnConnectionOptionsResult]
  }
  
  extension [Self <: ModifyVpnConnectionOptionsResult](x: Self) {
    
    inline def setVpnConnection(value: VpnConnection): Self = StObject.set(x, "VpnConnection", value.asInstanceOf[js.Any])
    
    inline def setVpnConnectionUndefined: Self = StObject.set(x, "VpnConnection", js.undefined)
  }
}
