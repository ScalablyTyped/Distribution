package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteVpnGatewayRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the virtual private gateway.
    */
  var VpnGatewayId: typings.awsSdk.ec2Mod.VpnGatewayId = js.native
}
object DeleteVpnGatewayRequest {
  
  @scala.inline
  def apply(VpnGatewayId: VpnGatewayId): DeleteVpnGatewayRequest = {
    val __obj = js.Dynamic.literal(VpnGatewayId = VpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpnGatewayRequest]
  }
  
  @scala.inline
  implicit class DeleteVpnGatewayRequestMutableBuilder[Self <: DeleteVpnGatewayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setVpnGatewayId(value: VpnGatewayId): Self = StObject.set(x, "VpnGatewayId", value.asInstanceOf[js.Any])
  }
}
