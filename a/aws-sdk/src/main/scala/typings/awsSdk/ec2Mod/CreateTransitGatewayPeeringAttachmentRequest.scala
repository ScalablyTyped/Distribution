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
    * Requests a transit gateway peering attachment.
    */
  var Options: js.UndefOr[CreateTransitGatewayPeeringAttachmentRequestOptions] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the peer transit gateway.
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
  
  inline def apply(
    PeerAccountId: String,
    PeerRegion: String,
    PeerTransitGatewayId: TransitAssociationGatewayId,
    TransitGatewayId: TransitGatewayId
  ): CreateTransitGatewayPeeringAttachmentRequest = {
    val __obj = js.Dynamic.literal(PeerAccountId = PeerAccountId.asInstanceOf[js.Any], PeerRegion = PeerRegion.asInstanceOf[js.Any], PeerTransitGatewayId = PeerTransitGatewayId.asInstanceOf[js.Any], TransitGatewayId = TransitGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayPeeringAttachmentRequest]
  }
  
  extension [Self <: CreateTransitGatewayPeeringAttachmentRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setOptions(value: CreateTransitGatewayPeeringAttachmentRequestOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setPeerAccountId(value: String): Self = StObject.set(x, "PeerAccountId", value.asInstanceOf[js.Any])
    
    inline def setPeerRegion(value: String): Self = StObject.set(x, "PeerRegion", value.asInstanceOf[js.Any])
    
    inline def setPeerTransitGatewayId(value: TransitAssociationGatewayId): Self = StObject.set(x, "PeerTransitGatewayId", value.asInstanceOf[js.Any])
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
    
    inline def setTransitGatewayId(value: TransitGatewayId): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
  }
}
