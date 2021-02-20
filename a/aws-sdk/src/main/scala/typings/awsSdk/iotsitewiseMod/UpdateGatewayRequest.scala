package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGatewayRequest extends StObject {
  
  /**
    * The ID of the gateway to update.
    */
  var gatewayId: ID = js.native
  
  /**
    * A unique, friendly name for the gateway.
    */
  var gatewayName: Name = js.native
}
object UpdateGatewayRequest {
  
  @scala.inline
  def apply(gatewayId: ID, gatewayName: Name): UpdateGatewayRequest = {
    val __obj = js.Dynamic.literal(gatewayId = gatewayId.asInstanceOf[js.Any], gatewayName = gatewayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayRequest]
  }
  
  @scala.inline
  implicit class UpdateGatewayRequestMutableBuilder[Self <: UpdateGatewayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayId(value: ID): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayName(value: Name): Self = StObject.set(x, "gatewayName", value.asInstanceOf[js.Any])
  }
}
