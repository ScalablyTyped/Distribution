package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateCustomerGatewayRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the customer gateway. For more information, see Resources Defined by Amazon EC2.
    */
  var CustomerGatewayArn: String = js.native
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String = js.native
}
object DisassociateCustomerGatewayRequest {
  
  @scala.inline
  def apply(CustomerGatewayArn: String, GlobalNetworkId: String): DisassociateCustomerGatewayRequest = {
    val __obj = js.Dynamic.literal(CustomerGatewayArn = CustomerGatewayArn.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateCustomerGatewayRequest]
  }
  
  @scala.inline
  implicit class DisassociateCustomerGatewayRequestMutableBuilder[Self <: DisassociateCustomerGatewayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerGatewayArn(value: String): Self = StObject.set(x, "CustomerGatewayArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
  }
}
