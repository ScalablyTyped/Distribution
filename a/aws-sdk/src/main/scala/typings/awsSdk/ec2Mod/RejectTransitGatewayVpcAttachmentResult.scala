package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectTransitGatewayVpcAttachmentResult extends StObject {
  
  /**
    * Information about the attachment.
    */
  var TransitGatewayVpcAttachment: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayVpcAttachment] = js.undefined
}
object RejectTransitGatewayVpcAttachmentResult {
  
  @scala.inline
  def apply(): RejectTransitGatewayVpcAttachmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectTransitGatewayVpcAttachmentResult]
  }
  
  @scala.inline
  implicit class RejectTransitGatewayVpcAttachmentResultMutableBuilder[Self <: RejectTransitGatewayVpcAttachmentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransitGatewayVpcAttachment(value: TransitGatewayVpcAttachment): Self = StObject.set(x, "TransitGatewayVpcAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayVpcAttachmentUndefined: Self = StObject.set(x, "TransitGatewayVpcAttachment", js.undefined)
  }
}
