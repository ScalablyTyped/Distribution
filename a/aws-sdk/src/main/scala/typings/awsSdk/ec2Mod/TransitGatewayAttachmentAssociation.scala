package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayAttachmentAssociation extends StObject {
  
  /**
    * The state of the association.
    */
  var State: js.UndefOr[TransitGatewayAssociationState] = js.undefined
  
  /**
    * The ID of the route table for the transit gateway.
    */
  var TransitGatewayRouteTableId: js.UndefOr[String] = js.undefined
}
object TransitGatewayAttachmentAssociation {
  
  inline def apply(): TransitGatewayAttachmentAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayAttachmentAssociation]
  }
  
  extension [Self <: TransitGatewayAttachmentAssociation](x: Self) {
    
    inline def setState(value: TransitGatewayAssociationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTransitGatewayRouteTableId(value: String): Self = StObject.set(x, "TransitGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableIdUndefined: Self = StObject.set(x, "TransitGatewayRouteTableId", js.undefined)
  }
}
