package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayRoute extends StObject {
  
  /**
    * The CIDR block used for destination matches.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the prefix list used for destination matches.
    */
  var PrefixListId: js.UndefOr[PrefixListResourceId] = js.undefined
  
  /**
    * The state of the route.
    */
  var State: js.UndefOr[TransitGatewayRouteState] = js.undefined
  
  /**
    * The attachments.
    */
  var TransitGatewayAttachments: js.UndefOr[TransitGatewayRouteAttachmentList] = js.undefined
  
  /**
    * The ID of the transit gateway route table announcement. 
    */
  var TransitGatewayRouteTableAnnouncementId: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayRouteTableAnnouncementId] = js.undefined
  
  /**
    * The route type.
    */
  var Type: js.UndefOr[TransitGatewayRouteType] = js.undefined
}
object TransitGatewayRoute {
  
  inline def apply(): TransitGatewayRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayRoute]
  }
  
  extension [Self <: TransitGatewayRoute](x: Self) {
    
    inline def setDestinationCidrBlock(value: String): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDestinationCidrBlockUndefined: Self = StObject.set(x, "DestinationCidrBlock", js.undefined)
    
    inline def setPrefixListId(value: PrefixListResourceId): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    inline def setPrefixListIdUndefined: Self = StObject.set(x, "PrefixListId", js.undefined)
    
    inline def setState(value: TransitGatewayRouteState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTransitGatewayAttachments(value: TransitGatewayRouteAttachmentList): Self = StObject.set(x, "TransitGatewayAttachments", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAttachmentsUndefined: Self = StObject.set(x, "TransitGatewayAttachments", js.undefined)
    
    inline def setTransitGatewayAttachmentsVarargs(value: TransitGatewayRouteAttachment*): Self = StObject.set(x, "TransitGatewayAttachments", js.Array(value*))
    
    inline def setTransitGatewayRouteTableAnnouncementId(value: TransitGatewayRouteTableAnnouncementId): Self = StObject.set(x, "TransitGatewayRouteTableAnnouncementId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableAnnouncementIdUndefined: Self = StObject.set(x, "TransitGatewayRouteTableAnnouncementId", js.undefined)
    
    inline def setType(value: TransitGatewayRouteType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
