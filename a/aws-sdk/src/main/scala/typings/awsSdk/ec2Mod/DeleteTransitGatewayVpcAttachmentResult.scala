package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTransitGatewayVpcAttachmentResult extends StObject {
  
  /**
    * Information about the deleted VPC attachment.
    */
  var TransitGatewayVpcAttachment: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayVpcAttachment] = js.undefined
}
object DeleteTransitGatewayVpcAttachmentResult {
  
  @scala.inline
  def apply(): DeleteTransitGatewayVpcAttachmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayVpcAttachmentResult]
  }
  
  @scala.inline
  implicit class DeleteTransitGatewayVpcAttachmentResultMutableBuilder[Self <: DeleteTransitGatewayVpcAttachmentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransitGatewayVpcAttachment(value: TransitGatewayVpcAttachment): Self = StObject.set(x, "TransitGatewayVpcAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayVpcAttachmentUndefined: Self = StObject.set(x, "TransitGatewayVpcAttachment", js.undefined)
  }
}
