package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVpcAttachmentResponse extends StObject {
  
  /**
    * Returns details about a VPC attachment.
    */
  var VpcAttachment: js.UndefOr[typings.awsSdk.networkmanagerMod.VpcAttachment] = js.undefined
}
object GetVpcAttachmentResponse {
  
  inline def apply(): GetVpcAttachmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpcAttachmentResponse]
  }
  
  extension [Self <: GetVpcAttachmentResponse](x: Self) {
    
    inline def setVpcAttachment(value: VpcAttachment): Self = StObject.set(x, "VpcAttachment", value.asInstanceOf[js.Any])
    
    inline def setVpcAttachmentUndefined: Self = StObject.set(x, "VpcAttachment", js.undefined)
  }
}
