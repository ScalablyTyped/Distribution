package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTransitGatewayMulticastDomainRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: typings.awsSdk.ec2Mod.TransitGatewayMulticastDomainId
}
object DeleteTransitGatewayMulticastDomainRequest {
  
  inline def apply(TransitGatewayMulticastDomainId: TransitGatewayMulticastDomainId): DeleteTransitGatewayMulticastDomainRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayMulticastDomainId = TransitGatewayMulticastDomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTransitGatewayMulticastDomainRequest]
  }
  
  extension [Self <: DeleteTransitGatewayMulticastDomainRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setTransitGatewayMulticastDomainId(value: TransitGatewayMulticastDomainId): Self = StObject.set(x, "TransitGatewayMulticastDomainId", value.asInstanceOf[js.Any])
  }
}
