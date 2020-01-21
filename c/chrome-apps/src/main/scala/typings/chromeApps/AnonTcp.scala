package typings.chromeApps

import typings.chromeApps.chrome.runtime.SocketTcpPermission
import typings.chromeApps.chrome.runtime.SocketTcpServerPermission
import typings.chromeApps.chrome.runtime.SocketUdpPermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTcp extends js.Object {
  /** The tcp manifest property declares which sockets.tcp operations an app can issue. */
  var tcp: js.UndefOr[SocketTcpPermission] = js.undefined
  /** The tcpServer manifest property declares which sockets.tcpServer operations an app can issue. */
  var tcpServer: js.UndefOr[SocketTcpServerPermission] = js.undefined
  /** The udp manifest property declares which sockets.udp operations an app can issue. */
  var udp: js.UndefOr[SocketUdpPermission] = js.undefined
}

object AnonTcp {
  @scala.inline
  def apply(
    tcp: SocketTcpPermission = null,
    tcpServer: SocketTcpServerPermission = null,
    udp: SocketUdpPermission = null
  ): AnonTcp = {
    val __obj = js.Dynamic.literal()
    if (tcp != null) __obj.updateDynamic("tcp")(tcp.asInstanceOf[js.Any])
    if (tcpServer != null) __obj.updateDynamic("tcpServer")(tcpServer.asInstanceOf[js.Any])
    if (udp != null) __obj.updateDynamic("udp")(udp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTcp]
  }
}

