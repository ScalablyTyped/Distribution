package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientVpnRouteStatus extends js.Object {
  
  /**
    * The state of the Client VPN endpoint route.
    */
  var Code: js.UndefOr[ClientVpnRouteStatusCode] = js.native
  
  /**
    * A message about the status of the Client VPN endpoint route, if applicable.
    */
  var Message: js.UndefOr[String] = js.native
}
object ClientVpnRouteStatus {
  
  @scala.inline
  def apply(): ClientVpnRouteStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnRouteStatus]
  }
  
  @scala.inline
  implicit class ClientVpnRouteStatusOps[Self <: ClientVpnRouteStatus] (val x: Self) extends AnyVal {
    
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
    def setCode(value: ClientVpnRouteStatusCode): Self = this.set("Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
}
