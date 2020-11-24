package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGatewayRequest extends js.Object {
  
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
  implicit class UpdateGatewayRequestOps[Self <: UpdateGatewayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGatewayId(value: ID): Self = this.set("gatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayName(value: Name): Self = this.set("gatewayName", value.asInstanceOf[js.Any])
  }
}
