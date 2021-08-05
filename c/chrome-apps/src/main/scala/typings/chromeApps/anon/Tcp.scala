package typings.chromeApps.anon

import typings.chromeApps.chrome.runtime.SocketTcpPermission
import typings.chromeApps.chrome.runtime.SocketTcpServerPermission
import typings.chromeApps.chrome.runtime.SocketUdpPermission
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tcp extends StObject {
  
  /** The tcp manifest property declares which sockets.tcp operations an app can issue. */
  var tcp: js.UndefOr[SocketTcpPermission] = js.undefined
  
  /** The tcpServer manifest property declares which sockets.tcpServer operations an app can issue. */
  var tcpServer: js.UndefOr[SocketTcpServerPermission] = js.undefined
  
  /** The udp manifest property declares which sockets.udp operations an app can issue. */
  var udp: js.UndefOr[SocketUdpPermission] = js.undefined
}
object Tcp {
  
  inline def apply(): Tcp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tcp]
  }
  
  extension [Self <: Tcp](x: Self) {
    
    inline def setTcp(value: SocketTcpPermission): Self = StObject.set(x, "tcp", value.asInstanceOf[js.Any])
    
    inline def setTcpServer(value: SocketTcpServerPermission): Self = StObject.set(x, "tcpServer", value.asInstanceOf[js.Any])
    
    inline def setTcpServerUndefined: Self = StObject.set(x, "tcpServer", js.undefined)
    
    inline def setTcpUndefined: Self = StObject.set(x, "tcp", js.undefined)
    
    inline def setUdp(value: SocketUdpPermission): Self = StObject.set(x, "udp", value.asInstanceOf[js.Any])
    
    inline def setUdpUndefined: Self = StObject.set(x, "udp", js.undefined)
  }
}
