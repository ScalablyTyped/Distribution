package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCustomerGatewayRequest extends StObject {
  
  /**
    * The ID of the customer gateway.
    */
  var CustomerGatewayId: typings.awsSdk.ec2Mod.CustomerGatewayId = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}
object DeleteCustomerGatewayRequest {
  
  @scala.inline
  def apply(CustomerGatewayId: CustomerGatewayId): DeleteCustomerGatewayRequest = {
    val __obj = js.Dynamic.literal(CustomerGatewayId = CustomerGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomerGatewayRequest]
  }
  
  @scala.inline
  implicit class DeleteCustomerGatewayRequestMutableBuilder[Self <: DeleteCustomerGatewayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerGatewayId(value: CustomerGatewayId): Self = StObject.set(x, "CustomerGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
