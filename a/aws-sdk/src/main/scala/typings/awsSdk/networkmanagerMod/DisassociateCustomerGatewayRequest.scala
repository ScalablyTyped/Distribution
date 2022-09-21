package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateCustomerGatewayRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the customer gateway.
    */
  var CustomerGatewayArn: typings.awsSdk.networkmanagerMod.CustomerGatewayArn
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.networkmanagerMod.GlobalNetworkId
}
object DisassociateCustomerGatewayRequest {
  
  inline def apply(CustomerGatewayArn: CustomerGatewayArn, GlobalNetworkId: GlobalNetworkId): DisassociateCustomerGatewayRequest = {
    val __obj = js.Dynamic.literal(CustomerGatewayArn = CustomerGatewayArn.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateCustomerGatewayRequest]
  }
  
  extension [Self <: DisassociateCustomerGatewayRequest](x: Self) {
    
    inline def setCustomerGatewayArn(value: CustomerGatewayArn): Self = StObject.set(x, "CustomerGatewayArn", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
  }
}
