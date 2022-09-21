package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterTransitGatewayRequest extends StObject {
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.networkmanagerMod.GlobalNetworkId
  
  /**
    * The Amazon Resource Name (ARN) of the transit gateway.
    */
  var TransitGatewayArn: typings.awsSdk.networkmanagerMod.TransitGatewayArn
}
object DeregisterTransitGatewayRequest {
  
  inline def apply(GlobalNetworkId: GlobalNetworkId, TransitGatewayArn: TransitGatewayArn): DeregisterTransitGatewayRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], TransitGatewayArn = TransitGatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterTransitGatewayRequest]
  }
  
  extension [Self <: DeregisterTransitGatewayRequest](x: Self) {
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayArn(value: TransitGatewayArn): Self = StObject.set(x, "TransitGatewayArn", value.asInstanceOf[js.Any])
  }
}
