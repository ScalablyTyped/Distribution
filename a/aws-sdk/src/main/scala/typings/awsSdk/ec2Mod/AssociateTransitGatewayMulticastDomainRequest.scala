package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateTransitGatewayMulticastDomainRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of the subnets to associate with the transit gateway multicast domain.
    */
  var SubnetIds: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The ID of the transit gateway attachment to associate with the transit gateway multicast domain.
    */
  var TransitGatewayAttachmentId: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayAttachmentId] = js.undefined
  
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayMulticastDomainId] = js.undefined
}
object AssociateTransitGatewayMulticastDomainRequest {
  
  @scala.inline
  def apply(): AssociateTransitGatewayMulticastDomainRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateTransitGatewayMulticastDomainRequest]
  }
  
  @scala.inline
  implicit class AssociateTransitGatewayMulticastDomainRequestMutableBuilder[Self <: AssociateTransitGatewayMulticastDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setSubnetIds(value: ValueStringList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "TransitGatewayAttachmentId", js.undefined)
    
    @scala.inline
    def setTransitGatewayMulticastDomainId(value: TransitGatewayMulticastDomainId): Self = StObject.set(x, "TransitGatewayMulticastDomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayMulticastDomainIdUndefined: Self = StObject.set(x, "TransitGatewayMulticastDomainId", js.undefined)
  }
}
