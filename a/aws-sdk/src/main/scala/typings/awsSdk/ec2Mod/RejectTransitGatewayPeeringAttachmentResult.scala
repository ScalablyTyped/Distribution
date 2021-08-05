package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectTransitGatewayPeeringAttachmentResult extends StObject {
  
  /**
    * The transit gateway peering attachment.
    */
  var TransitGatewayPeeringAttachment: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayPeeringAttachment] = js.undefined
}
object RejectTransitGatewayPeeringAttachmentResult {
  
  inline def apply(): RejectTransitGatewayPeeringAttachmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectTransitGatewayPeeringAttachmentResult]
  }
  
  extension [Self <: RejectTransitGatewayPeeringAttachmentResult](x: Self) {
    
    inline def setTransitGatewayPeeringAttachment(value: TransitGatewayPeeringAttachment): Self = StObject.set(x, "TransitGatewayPeeringAttachment", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayPeeringAttachmentUndefined: Self = StObject.set(x, "TransitGatewayPeeringAttachment", js.undefined)
  }
}
