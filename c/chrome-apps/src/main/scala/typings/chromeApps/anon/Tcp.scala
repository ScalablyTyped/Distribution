package typings.chromeApps.anon

import typings.chromeApps.chrome.runtime.SocketTcpPermission
import typings.chromeApps.chrome.runtime.SocketTcpServerPermission
import typings.chromeApps.chrome.runtime.SocketUdpPermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tcp extends js.Object {
  
  /** The tcp manifest property declares which sockets.tcp operations an app can issue. */
  var tcp: js.UndefOr[SocketTcpPermission] = js.native
  
  /** The tcpServer manifest property declares which sockets.tcpServer operations an app can issue. */
  var tcpServer: js.UndefOr[SocketTcpServerPermission] = js.native
  
  /** The udp manifest property declares which sockets.udp operations an app can issue. */
  var udp: js.UndefOr[SocketUdpPermission] = js.native
}
object Tcp {
  
  @scala.inline
  def apply(): Tcp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tcp]
  }
  
  @scala.inline
  implicit class TcpOps[Self <: Tcp] (val x: Self) extends AnyVal {
    
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
    def setTcp(value: SocketTcpPermission): Self = this.set("tcp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTcp: Self = this.set("tcp", js.undefined)
    
    @scala.inline
    def setTcpServer(value: SocketTcpServerPermission): Self = this.set("tcpServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTcpServer: Self = this.set("tcpServer", js.undefined)
    
    @scala.inline
    def setUdp(value: SocketUdpPermission): Self = this.set("udp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUdp: Self = this.set("udp", js.undefined)
  }
}
