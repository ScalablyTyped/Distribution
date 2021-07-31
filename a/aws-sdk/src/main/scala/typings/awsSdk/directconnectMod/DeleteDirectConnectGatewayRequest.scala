package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDirectConnectGatewayRequest extends StObject {
  
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: DirectConnectGatewayId
}
object DeleteDirectConnectGatewayRequest {
  
  @scala.inline
  def apply(directConnectGatewayId: DirectConnectGatewayId): DeleteDirectConnectGatewayRequest = {
    val __obj = js.Dynamic.literal(directConnectGatewayId = directConnectGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDirectConnectGatewayRequest]
  }
  
  @scala.inline
  implicit class DeleteDirectConnectGatewayRequestMutableBuilder[Self <: DeleteDirectConnectGatewayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = StObject.set(x, "directConnectGatewayId", value.asInstanceOf[js.Any])
  }
}
