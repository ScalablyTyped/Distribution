package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Tcp extends js.Object {
  /** The tcp manifest property declares which sockets.tcp operations an app can issue. */
  var tcp: js.UndefOr[chromeDashAppsLib.chromeNs.runtimeNs.SocketTcpPermission] = js.undefined
  /** The tcpServer manifest property declares which sockets.tcpServer operations an app can issue. */
  var tcpServer: js.UndefOr[chromeDashAppsLib.chromeNs.runtimeNs.SocketTcpServerPermission] = js.undefined
  /** The udp manifest property declares which sockets.udp operations an app can issue. */
  var udp: js.UndefOr[chromeDashAppsLib.chromeNs.runtimeNs.SocketUdpPermission] = js.undefined
}

object Anon_Tcp {
  @scala.inline
  def apply(
    tcp: chromeDashAppsLib.chromeNs.runtimeNs.SocketTcpPermission = null,
    tcpServer: chromeDashAppsLib.chromeNs.runtimeNs.SocketTcpServerPermission = null,
    udp: chromeDashAppsLib.chromeNs.runtimeNs.SocketUdpPermission = null
  ): Anon_Tcp = {
    val __obj = js.Dynamic.literal()
    if (tcp != null) __obj.updateDynamic("tcp")(tcp)
    if (tcpServer != null) __obj.updateDynamic("tcpServer")(tcpServer)
    if (udp != null) __obj.updateDynamic("udp")(udp)
    __obj.asInstanceOf[Anon_Tcp]
  }
}

