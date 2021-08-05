package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterTransitGatewayRequest extends StObject {
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String
  
  /**
    * The Amazon Resource Name (ARN) of the transit gateway. For more information, see Resources Defined by Amazon EC2.
    */
  var TransitGatewayArn: String
}
object RegisterTransitGatewayRequest {
  
  inline def apply(GlobalNetworkId: String, TransitGatewayArn: String): RegisterTransitGatewayRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], TransitGatewayArn = TransitGatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTransitGatewayRequest]
  }
  
  extension [Self <: RegisterTransitGatewayRequest](x: Self) {
    
    inline def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayArn(value: String): Self = StObject.set(x, "TransitGatewayArn", value.asInstanceOf[js.Any])
  }
}
