package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateClientVpnTargetNetworkRequest extends StObject {
  
  /**
    * The ID of the target network association.
    */
  var AssociationId: ClientVpnAssociationId
  
  /**
    * The ID of the Client VPN endpoint from which to disassociate the target network.
    */
  var ClientVpnEndpointId: typings.awsSdk.ec2Mod.ClientVpnEndpointId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}
object DisassociateClientVpnTargetNetworkRequest {
  
  inline def apply(AssociationId: ClientVpnAssociationId, ClientVpnEndpointId: ClientVpnEndpointId): DisassociateClientVpnTargetNetworkRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateClientVpnTargetNetworkRequest]
  }
  
  extension [Self <: DisassociateClientVpnTargetNetworkRequest](x: Self) {
    
    inline def setAssociationId(value: ClientVpnAssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setClientVpnEndpointId(value: ClientVpnEndpointId): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
