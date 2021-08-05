package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateCustomerGatewayRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the customer gateway. For more information, see Resources Defined by Amazon EC2.
    */
  var CustomerGatewayArn: String
  
  /**
    * The ID of the device.
    */
  var DeviceId: String
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String
  
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[String] = js.undefined
}
object AssociateCustomerGatewayRequest {
  
  inline def apply(CustomerGatewayArn: String, DeviceId: String, GlobalNetworkId: String): AssociateCustomerGatewayRequest = {
    val __obj = js.Dynamic.literal(CustomerGatewayArn = CustomerGatewayArn.asInstanceOf[js.Any], DeviceId = DeviceId.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateCustomerGatewayRequest]
  }
  
  extension [Self <: AssociateCustomerGatewayRequest](x: Self) {
    
    inline def setCustomerGatewayArn(value: String): Self = StObject.set(x, "CustomerGatewayArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setLinkId(value: String): Self = StObject.set(x, "LinkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "LinkId", js.undefined)
  }
}
