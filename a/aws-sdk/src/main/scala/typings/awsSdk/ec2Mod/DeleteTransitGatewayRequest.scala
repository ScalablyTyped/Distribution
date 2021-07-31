package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTransitGatewayRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: typings.awsSdk.ec2Mod.TransitGatewayId
}
object DeleteTransitGatewayRequest {
  
  @scala.inline
  def apply(TransitGatewayId: TransitGatewayId): DeleteTransitGatewayRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayId = TransitGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTransitGatewayRequest]
  }
  
  @scala.inline
  implicit class DeleteTransitGatewayRequestMutableBuilder[Self <: DeleteTransitGatewayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setTransitGatewayId(value: TransitGatewayId): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
  }
}
