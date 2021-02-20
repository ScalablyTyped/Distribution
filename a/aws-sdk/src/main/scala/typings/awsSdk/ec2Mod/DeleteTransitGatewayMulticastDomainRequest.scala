package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTransitGatewayMulticastDomainRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: typings.awsSdk.ec2Mod.TransitGatewayMulticastDomainId = js.native
}
object DeleteTransitGatewayMulticastDomainRequest {
  
  @scala.inline
  def apply(TransitGatewayMulticastDomainId: TransitGatewayMulticastDomainId): DeleteTransitGatewayMulticastDomainRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayMulticastDomainId = TransitGatewayMulticastDomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTransitGatewayMulticastDomainRequest]
  }
  
  @scala.inline
  implicit class DeleteTransitGatewayMulticastDomainRequestMutableBuilder[Self <: DeleteTransitGatewayMulticastDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setTransitGatewayMulticastDomainId(value: TransitGatewayMulticastDomainId): Self = StObject.set(x, "TransitGatewayMulticastDomainId", value.asInstanceOf[js.Any])
  }
}
