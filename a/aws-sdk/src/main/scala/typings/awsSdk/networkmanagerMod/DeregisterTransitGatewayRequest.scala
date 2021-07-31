package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterTransitGatewayRequest extends StObject {
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String
  
  /**
    * The Amazon Resource Name (ARN) of the transit gateway.
    */
  var TransitGatewayArn: String
}
object DeregisterTransitGatewayRequest {
  
  @scala.inline
  def apply(GlobalNetworkId: String, TransitGatewayArn: String): DeregisterTransitGatewayRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], TransitGatewayArn = TransitGatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterTransitGatewayRequest]
  }
  
  @scala.inline
  implicit class DeregisterTransitGatewayRequestMutableBuilder[Self <: DeregisterTransitGatewayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayArn(value: String): Self = StObject.set(x, "TransitGatewayArn", value.asInstanceOf[js.Any])
  }
}
