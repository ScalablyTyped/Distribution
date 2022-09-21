package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDirectConnectGatewayRequest extends StObject {
  
  /**
    * The ID of the Direct Connect gateway to update.
    */
  var directConnectGatewayId: DirectConnectGatewayId
  
  /**
    * The new name for the Direct Connect gateway.
    */
  var newDirectConnectGatewayName: DirectConnectGatewayName
}
object UpdateDirectConnectGatewayRequest {
  
  inline def apply(
    directConnectGatewayId: DirectConnectGatewayId,
    newDirectConnectGatewayName: DirectConnectGatewayName
  ): UpdateDirectConnectGatewayRequest = {
    val __obj = js.Dynamic.literal(directConnectGatewayId = directConnectGatewayId.asInstanceOf[js.Any], newDirectConnectGatewayName = newDirectConnectGatewayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDirectConnectGatewayRequest]
  }
  
  extension [Self <: UpdateDirectConnectGatewayRequest](x: Self) {
    
    inline def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = StObject.set(x, "directConnectGatewayId", value.asInstanceOf[js.Any])
    
    inline def setNewDirectConnectGatewayName(value: DirectConnectGatewayName): Self = StObject.set(x, "newDirectConnectGatewayName", value.asInstanceOf[js.Any])
  }
}
