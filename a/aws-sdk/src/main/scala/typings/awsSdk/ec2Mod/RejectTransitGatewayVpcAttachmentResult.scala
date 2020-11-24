package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectTransitGatewayVpcAttachmentResult extends js.Object {
  
  /**
    * Information about the attachment.
    */
  var TransitGatewayVpcAttachment: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayVpcAttachment] = js.native
}
object RejectTransitGatewayVpcAttachmentResult {
  
  @scala.inline
  def apply(): RejectTransitGatewayVpcAttachmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectTransitGatewayVpcAttachmentResult]
  }
  
  @scala.inline
  implicit class RejectTransitGatewayVpcAttachmentResultOps[Self <: RejectTransitGatewayVpcAttachmentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTransitGatewayVpcAttachment(value: TransitGatewayVpcAttachment): Self = this.set("TransitGatewayVpcAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayVpcAttachment: Self = this.set("TransitGatewayVpcAttachment", js.undefined)
  }
}
