package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTransitGatewayConnectPeerRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the Connect peer.
    */
  var TransitGatewayConnectPeerId: typings.awsSdk.ec2Mod.TransitGatewayConnectPeerId
}
object DeleteTransitGatewayConnectPeerRequest {
  
  inline def apply(TransitGatewayConnectPeerId: TransitGatewayConnectPeerId): DeleteTransitGatewayConnectPeerRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayConnectPeerId = TransitGatewayConnectPeerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTransitGatewayConnectPeerRequest]
  }
  
  extension [Self <: DeleteTransitGatewayConnectPeerRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setTransitGatewayConnectPeerId(value: TransitGatewayConnectPeerId): Self = StObject.set(x, "TransitGatewayConnectPeerId", value.asInstanceOf[js.Any])
  }
}
