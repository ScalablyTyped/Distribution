package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterTransitGatewayResponse extends js.Object {
  
  /**
    * Information about the transit gateway registration.
    */
  var TransitGatewayRegistration: js.UndefOr[typings.awsSdk.networkmanagerMod.TransitGatewayRegistration] = js.native
}
object RegisterTransitGatewayResponse {
  
  @scala.inline
  def apply(): RegisterTransitGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTransitGatewayResponse]
  }
  
  @scala.inline
  implicit class RegisterTransitGatewayResponseOps[Self <: RegisterTransitGatewayResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTransitGatewayRegistration(value: TransitGatewayRegistration): Self = this.set("TransitGatewayRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayRegistration: Self = this.set("TransitGatewayRegistration", js.undefined)
  }
}
