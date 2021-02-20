package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVpnGatewayResult extends StObject {
  
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
  implicit class CreateVpnGatewayResultMutableBuilder[Self <: CreateVpnGatewayResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpnGateway(value: VpnGateway): Self = StObject.set(x, "VpnGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnGatewayUndefined: Self = StObject.set(x, "VpnGateway", js.undefined)
  }
}
