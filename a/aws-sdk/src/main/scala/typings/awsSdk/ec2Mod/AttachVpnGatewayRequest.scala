package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachVpnGatewayRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: typings.awsSdk.ec2Mod.VpcId
  
  /**
    * The ID of the virtual private gateway.
    */
  var VpnGatewayId: typings.awsSdk.ec2Mod.VpnGatewayId
}
object AttachVpnGatewayRequest {
  
  inline def apply(VpcId: VpcId, VpnGatewayId: VpnGatewayId): AttachVpnGatewayRequest = {
    val __obj = js.Dynamic.literal(VpcId = VpcId.asInstanceOf[js.Any], VpnGatewayId = VpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachVpnGatewayRequest]
  }
  
  extension [Self <: AttachVpnGatewayRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpnGatewayId(value: VpnGatewayId): Self = StObject.set(x, "VpnGatewayId", value.asInstanceOf[js.Any])
  }
}
