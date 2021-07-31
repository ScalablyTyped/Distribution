package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTransitGatewayPeeringAttachmentResult extends StObject {
  
  /**
    * The transit gateway peering attachment.
    */
  var TransitGatewayPeeringAttachment: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayPeeringAttachment] = js.undefined
}
object DeleteTransitGatewayPeeringAttachmentResult {
  
  @scala.inline
  def apply(): DeleteTransitGatewayPeeringAttachmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayPeeringAttachmentResult]
  }
  
  @scala.inline
  implicit class DeleteTransitGatewayPeeringAttachmentResultMutableBuilder[Self <: DeleteTransitGatewayPeeringAttachmentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransitGatewayPeeringAttachment(value: TransitGatewayPeeringAttachment): Self = StObject.set(x, "TransitGatewayPeeringAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayPeeringAttachmentUndefined: Self = StObject.set(x, "TransitGatewayPeeringAttachment", js.undefined)
  }
}
