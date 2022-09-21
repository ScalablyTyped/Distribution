package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransitGatewayRouteTableAttachmentRequest extends StObject {
  
  /**
    * The ID of the transit gateway route table attachment.
    */
  var AttachmentId: typings.awsSdk.networkmanagerMod.AttachmentId
}
object GetTransitGatewayRouteTableAttachmentRequest {
  
  inline def apply(AttachmentId: AttachmentId): GetTransitGatewayRouteTableAttachmentRequest = {
    val __obj = js.Dynamic.literal(AttachmentId = AttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransitGatewayRouteTableAttachmentRequest]
  }
  
  extension [Self <: GetTransitGatewayRouteTableAttachmentRequest](x: Self) {
    
    inline def setAttachmentId(value: AttachmentId): Self = StObject.set(x, "AttachmentId", value.asInstanceOf[js.Any])
  }
}
