package typings.chromeDashApps

import typings.chromeDashApps.chromeNs.runtimeNs.SocketTcpPermission
import typings.chromeDashApps.chromeNs.runtimeNs.SocketTcpServerPermission
import typings.chromeDashApps.chromeNs.runtimeNs.SocketUdpPermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Tcp extends js.Object {
  /** The tcp manifest property declares which sockets.tcp operations an app can issue. */
  var tcp: js.UndefOr[SocketTcpPermission] = js.undefined
  /** The tcpServer manifest property declares which sockets.tcpServer operations an app can issue. */
  var tcpServer: js.UndefOr[SocketTcpServerPermission] = js.undefined
  /** The udp manifest property declares which sockets.udp operations an app can issue. */
  var udp: js.UndefOr[SocketUdpPermission] = js.undefined
}

object Anon_Tcp {
  @scala.inline
  def apply(
    tcp: SocketTcpPermission = null,
    tcpServer: SocketTcpServerPermission = null,
    udp: SocketUdpPermission = null
  ): Anon_Tcp = {
    val __obj = js.Dynamic.literal()
    if (tcp != null) __obj.updateDynamic("tcp")(tcp)
    if (tcpServer != null) __obj.updateDynamic("tcpServer")(tcpServer)
    if (udp != null) __obj.updateDynamic("udp")(udp)
    __obj.asInstanceOf[Anon_Tcp]
  }
}

