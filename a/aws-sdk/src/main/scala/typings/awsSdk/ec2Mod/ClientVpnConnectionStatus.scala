package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientVpnConnectionStatus extends js.Object {
  
  /**
    * The state of the client connection.
    */
  var Code: js.UndefOr[ClientVpnConnectionStatusCode] = js.native
  
  /**
    * A message about the status of the client connection, if applicable.
    */
  var Message: js.UndefOr[String] = js.native
}
object ClientVpnConnectionStatus {
  
  @scala.inline
  def apply(): ClientVpnConnectionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnConnectionStatus]
  }
  
  @scala.inline
  implicit class ClientVpnConnectionStatusOps[Self <: ClientVpnConnectionStatus] (val x: Self) extends AnyVal {
    
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
    def setCode(value: ClientVpnConnectionStatusCode): Self = this.set("Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
}
