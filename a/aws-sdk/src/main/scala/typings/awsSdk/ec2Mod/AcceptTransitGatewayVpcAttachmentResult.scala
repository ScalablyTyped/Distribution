package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptTransitGatewayVpcAttachmentResult extends StObject {
  
  /**
    * The VPC attachment.
    */
  var TransitGatewayVpcAttachment: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayVpcAttachment] = js.undefined
}
object AcceptTransitGatewayVpcAttachmentResult {
  
  @scala.inline
  def apply(): AcceptTransitGatewayVpcAttachmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptTransitGatewayVpcAttachmentResult]
  }
  
  @scala.inline
  implicit class AcceptTransitGatewayVpcAttachmentResultMutableBuilder[Self <: AcceptTransitGatewayVpcAttachmentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransitGatewayVpcAttachment(value: TransitGatewayVpcAttachment): Self = StObject.set(x, "TransitGatewayVpcAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayVpcAttachmentUndefined: Self = StObject.set(x, "TransitGatewayVpcAttachment", js.undefined)
  }
}
