package typings.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseTunnelRequest extends js.Object {
  
  /**
    * When set to true, AWS IoT Secure Tunneling deletes the tunnel data immediately.
    */
  var delete: js.UndefOr[DeleteFlag] = js.native
  
  /**
    * The ID of the tunnel to close.
    */
  var tunnelId: TunnelId = js.native
}
object CloseTunnelRequest {
  
  @scala.inline
  def apply(tunnelId: TunnelId): CloseTunnelRequest = {
    val __obj = js.Dynamic.literal(tunnelId = tunnelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseTunnelRequest]
  }
  
  @scala.inline
  implicit class CloseTunnelRequestOps[Self <: CloseTunnelRequest] (val x: Self) extends AnyVal {
    
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
    def setTunnelId(value: TunnelId): Self = this.set("tunnelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: DeleteFlag): Self = this.set("delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
  }
}
