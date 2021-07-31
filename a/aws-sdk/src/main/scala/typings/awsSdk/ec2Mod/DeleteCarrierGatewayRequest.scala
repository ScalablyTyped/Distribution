package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCarrierGatewayRequest extends StObject {
  
  /**
    * The ID of the carrier gateway.
    */
  var CarrierGatewayId: typings.awsSdk.ec2Mod.CarrierGatewayId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}
object DeleteCarrierGatewayRequest {
  
  @scala.inline
  def apply(CarrierGatewayId: CarrierGatewayId): DeleteCarrierGatewayRequest = {
    val __obj = js.Dynamic.literal(CarrierGatewayId = CarrierGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCarrierGatewayRequest]
  }
  
  @scala.inline
  implicit class DeleteCarrierGatewayRequestMutableBuilder[Self <: DeleteCarrierGatewayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCarrierGatewayId(value: CarrierGatewayId): Self = StObject.set(x, "CarrierGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
