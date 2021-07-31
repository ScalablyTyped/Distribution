package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayPeeringAttachmentRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The AWS account ID of the owner of the peer transit gateway.
    */
  var PeerAccountId: String
  
  /**
    * The Region where the peer transit gateway is located.
    */
  var PeerRegion: String
  
  /**
    * The ID of the peer transit gateway with which to create the peering attachment.
    */
  var PeerTransitGatewayId: TransitAssociationGatewayId
  
  /**
    * The tags to apply to the transit gateway peering attachment.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: typings.awsSdk.ec2Mod.TransitGatewayId
}
object CreateTransitGatewayPeeringAttachmentRequest {
  
  @scala.inline
  def apply(
    PeerAccountId: String,
    PeerRegion: String,
    PeerTransitGatewayId: TransitAssociationGatewayId,
    TransitGatewayId: TransitGatewayId
  ): CreateTransitGatewayPeeringAttachmentRequest = {
    val __obj = js.Dynamic.literal(PeerAccountId = PeerAccountId.asInstanceOf[js.Any], PeerRegion = PeerRegion.asInstanceOf[js.Any], PeerTransitGatewayId = PeerTransitGatewayId.asInstanceOf[js.Any], TransitGatewayId = TransitGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayPeeringAttachmentRequest]
  }
  
  @scala.inline
  implicit class CreateTransitGatewayPeeringAttachmentRequestMutableBuilder[Self <: CreateTransitGatewayPeeringAttachmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setPeerAccountId(value: String): Self = StObject.set(x, "PeerAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerRegion(value: String): Self = StObject.set(x, "PeerRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerTransitGatewayId(value: TransitAssociationGatewayId): Self = StObject.set(x, "PeerTransitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTransitGatewayId(value: TransitGatewayId): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
  }
}
