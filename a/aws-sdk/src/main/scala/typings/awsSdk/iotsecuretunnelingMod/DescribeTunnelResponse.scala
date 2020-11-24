package typings.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTunnelResponse extends js.Object {
  
  /**
    * The tunnel being described.
    */
  var tunnel: js.UndefOr[Tunnel] = js.native
}
object DescribeTunnelResponse {
  
  @scala.inline
  def apply(): DescribeTunnelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTunnelResponse]
  }
  
  @scala.inline
  implicit class DescribeTunnelResponseOps[Self <: DescribeTunnelResponse] (val x: Self) extends AnyVal {
    
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
    def setTunnel(value: Tunnel): Self = this.set("tunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunnel: Self = this.set("tunnel", js.undefined)
  }
}
