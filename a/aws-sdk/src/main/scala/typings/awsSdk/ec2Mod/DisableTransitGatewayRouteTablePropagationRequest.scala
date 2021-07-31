package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableTransitGatewayRouteTablePropagationRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: typings.awsSdk.ec2Mod.TransitGatewayAttachmentId
  
  /**
    * The ID of the propagation route table.
    */
  var TransitGatewayRouteTableId: typings.awsSdk.ec2Mod.TransitGatewayRouteTableId
}
object DisableTransitGatewayRouteTablePropagationRequest {
  
  @scala.inline
  def apply(
    TransitGatewayAttachmentId: TransitGatewayAttachmentId,
    TransitGatewayRouteTableId: TransitGatewayRouteTableId
  ): DisableTransitGatewayRouteTablePropagationRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayAttachmentId = TransitGatewayAttachmentId.asInstanceOf[js.Any], TransitGatewayRouteTableId = TransitGatewayRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableTransitGatewayRouteTablePropagationRequest]
  }
  
  @scala.inline
  implicit class DisableTransitGatewayRouteTablePropagationRequestMutableBuilder[Self <: DisableTransitGatewayRouteTablePropagationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayRouteTableId(value: TransitGatewayRouteTableId): Self = StObject.set(x, "TransitGatewayRouteTableId", value.asInstanceOf[js.Any])
  }
}
