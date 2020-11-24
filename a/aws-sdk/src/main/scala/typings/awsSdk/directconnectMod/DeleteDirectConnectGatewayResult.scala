package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDirectConnectGatewayResult extends js.Object {
  
  /**
    * The Direct Connect gateway.
    */
  var directConnectGateway: js.UndefOr[DirectConnectGateway] = js.native
}
object DeleteDirectConnectGatewayResult {
  
  @scala.inline
  def apply(): DeleteDirectConnectGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDirectConnectGatewayResult]
  }
  
  @scala.inline
  implicit class DeleteDirectConnectGatewayResultOps[Self <: DeleteDirectConnectGatewayResult] (val x: Self) extends AnyVal {
    
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
    def setDirectConnectGateway(value: DirectConnectGateway): Self = this.set("directConnectGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectConnectGateway: Self = this.set("directConnectGateway", js.undefined)
  }
}
