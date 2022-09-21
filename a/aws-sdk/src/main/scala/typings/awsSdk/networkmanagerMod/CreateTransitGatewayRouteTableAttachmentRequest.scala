package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayRouteTableAttachmentRequest extends StObject {
  
  /**
    * The client token associated with the request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.networkmanagerMod.ClientToken] = js.undefined
  
  /**
    * The ID of the peer for the 
    */
  var PeeringId: typings.awsSdk.networkmanagerMod.PeeringId
  
  /**
    * The list of key-value tags associated with the request.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ARN of the transit gateway route table for the attachment request.
    */
  var TransitGatewayRouteTableArn: typings.awsSdk.networkmanagerMod.TransitGatewayRouteTableArn
}
object CreateTransitGatewayRouteTableAttachmentRequest {
  
  inline def apply(PeeringId: PeeringId, TransitGatewayRouteTableArn: TransitGatewayRouteTableArn): CreateTransitGatewayRouteTableAttachmentRequest = {
    val __obj = js.Dynamic.literal(PeeringId = PeeringId.asInstanceOf[js.Any], TransitGatewayRouteTableArn = TransitGatewayRouteTableArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayRouteTableAttachmentRequest]
  }
  
  extension [Self <: CreateTransitGatewayRouteTableAttachmentRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setPeeringId(value: PeeringId): Self = StObject.set(x, "PeeringId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTransitGatewayRouteTableArn(value: TransitGatewayRouteTableArn): Self = StObject.set(x, "TransitGatewayRouteTableArn", value.asInstanceOf[js.Any])
  }
}
