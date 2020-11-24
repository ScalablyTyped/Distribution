package typings.chrome.chrome.socket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketInfo extends js.Object {
  
  var connected: Boolean = js.native
  
  var localAddress: js.UndefOr[String] = js.native
  
  var localPort: js.UndefOr[Double] = js.native
  
  var peerAddress: js.UndefOr[String] = js.native
  
  var peerPort: js.UndefOr[Double] = js.native
  
  var socketType: String = js.native
}
object SocketInfo {
  
  @scala.inline
  def apply(connected: Boolean, socketType: String): SocketInfo = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], socketType = socketType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketInfo]
  }
  
  @scala.inline
  implicit class SocketInfoOps[Self <: SocketInfo] (val x: Self) extends AnyVal {
    
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
    def setConnected(value: Boolean): Self = this.set("connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketType(value: String): Self = this.set("socketType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    
    @scala.inline
    def setLocalPort(value: Double): Self = this.set("localPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalPort: Self = this.set("localPort", js.undefined)
    
    @scala.inline
    def setPeerAddress(value: String): Self = this.set("peerAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerAddress: Self = this.set("peerAddress", js.undefined)
    
    @scala.inline
    def setPeerPort(value: Double): Self = this.set("peerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerPort: Self = this.set("peerPort", js.undefined)
  }
}
