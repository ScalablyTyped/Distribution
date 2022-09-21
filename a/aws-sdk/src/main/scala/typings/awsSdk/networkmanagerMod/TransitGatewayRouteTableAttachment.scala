package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayRouteTableAttachment extends StObject {
  
  var Attachment: js.UndefOr[typings.awsSdk.networkmanagerMod.Attachment] = js.undefined
  
  /**
    * The ID of the peering attachment.
    */
  var PeeringId: js.UndefOr[typings.awsSdk.networkmanagerMod.PeeringId] = js.undefined
  
  /**
    * The ARN of the transit gateway attachment route table.
    */
  var TransitGatewayRouteTableArn: js.UndefOr[typings.awsSdk.networkmanagerMod.TransitGatewayRouteTableArn] = js.undefined
}
object TransitGatewayRouteTableAttachment {
  
  inline def apply(): TransitGatewayRouteTableAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayRouteTableAttachment]
  }
  
  extension [Self <: TransitGatewayRouteTableAttachment](x: Self) {
    
    inline def setAttachment(value: Attachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "Attachment", js.undefined)
    
    inline def setPeeringId(value: PeeringId): Self = StObject.set(x, "PeeringId", value.asInstanceOf[js.Any])
    
    inline def setPeeringIdUndefined: Self = StObject.set(x, "PeeringId", js.undefined)
    
    inline def setTransitGatewayRouteTableArn(value: TransitGatewayRouteTableArn): Self = StObject.set(x, "TransitGatewayRouteTableArn", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableArnUndefined: Self = StObject.set(x, "TransitGatewayRouteTableArn", js.undefined)
  }
}
