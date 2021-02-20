package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteGatewayRequest extends StObject {
  
  /**
    * The ID of the gateway to delete.
    */
  var gatewayId: ID = js.native
}
object DeleteGatewayRequest {
  
  @scala.inline
  def apply(gatewayId: ID): DeleteGatewayRequest = {
    val __obj = js.Dynamic.literal(gatewayId = gatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGatewayRequest]
  }
  
  @scala.inline
  implicit class DeleteGatewayRequestMutableBuilder[Self <: DeleteGatewayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayId(value: ID): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
  }
}
