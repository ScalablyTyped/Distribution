package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachVpnGatewayResult extends StObject {
  
  /**
    * Information about the attachment.
    */
  var VpcAttachment: js.UndefOr[typings.awsSdk.ec2Mod.VpcAttachment] = js.undefined
}
object AttachVpnGatewayResult {
  
  @scala.inline
  def apply(): AttachVpnGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachVpnGatewayResult]
  }
  
  @scala.inline
  implicit class AttachVpnGatewayResultMutableBuilder[Self <: AttachVpnGatewayResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpcAttachment(value: VpcAttachment): Self = StObject.set(x, "VpcAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcAttachmentUndefined: Self = StObject.set(x, "VpcAttachment", js.undefined)
  }
}
