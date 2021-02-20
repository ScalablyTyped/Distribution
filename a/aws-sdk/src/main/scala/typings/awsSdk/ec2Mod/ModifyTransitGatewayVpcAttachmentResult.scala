package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyTransitGatewayVpcAttachmentResult extends StObject {
  
  /**
    * Information about the modified attachment.
    */
  var TransitGatewayVpcAttachment: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayVpcAttachment] = js.native
}
object ModifyTransitGatewayVpcAttachmentResult {
  
  @scala.inline
  def apply(): ModifyTransitGatewayVpcAttachmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTransitGatewayVpcAttachmentResult]
  }
  
  @scala.inline
  implicit class ModifyTransitGatewayVpcAttachmentResultMutableBuilder[Self <: ModifyTransitGatewayVpcAttachmentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransitGatewayVpcAttachment(value: TransitGatewayVpcAttachment): Self = StObject.set(x, "TransitGatewayVpcAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayVpcAttachmentUndefined: Self = StObject.set(x, "TransitGatewayVpcAttachment", js.undefined)
  }
}
