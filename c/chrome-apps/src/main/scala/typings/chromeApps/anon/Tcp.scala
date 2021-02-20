package typings.chromeApps.anon

import typings.chromeApps.chrome.runtime.SocketTcpPermission
import typings.chromeApps.chrome.runtime.SocketTcpServerPermission
import typings.chromeApps.chrome.runtime.SocketUdpPermission
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tcp extends StObject {
  
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
  implicit class TcpMutableBuilder[Self <: Tcp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTcp(value: SocketTcpPermission): Self = StObject.set(x, "tcp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpServer(value: SocketTcpServerPermission): Self = StObject.set(x, "tcpServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpServerUndefined: Self = StObject.set(x, "tcpServer", js.undefined)
    
    @scala.inline
    def setTcpUndefined: Self = StObject.set(x, "tcp", js.undefined)
    
    @scala.inline
    def setUdp(value: SocketUdpPermission): Self = StObject.set(x, "udp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUdpUndefined: Self = StObject.set(x, "udp", js.undefined)
  }
}
