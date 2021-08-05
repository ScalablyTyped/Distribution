package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpnGatewayResult extends StObject {
  
  /**
    * Information about the virtual private gateway.
    */
  var VpnGateway: js.UndefOr[typings.awsSdk.ec2Mod.VpnGateway] = js.undefined
}
object CreateVpnGatewayResult {
  
  inline def apply(): CreateVpnGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpnGatewayResult]
  }
  
  extension [Self <: CreateVpnGatewayResult](x: Self) {
    
    inline def setVpnGateway(value: VpnGateway): Self = StObject.set(x, "VpnGateway", value.asInstanceOf[js.Any])
    
    inline def setVpnGatewayUndefined: Self = StObject.set(x, "VpnGateway", js.undefined)
  }
}
