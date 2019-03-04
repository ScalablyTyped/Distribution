package typings
package chromeLib.chromeNs.socketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketInfo extends js.Object {
  var connected: scala.Boolean
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  var localPort: js.UndefOr[scala.Double] = js.undefined
  var peerAddress: js.UndefOr[java.lang.String] = js.undefined
  var peerPort: js.UndefOr[scala.Double] = js.undefined
  var socketType: java.lang.String
}

object SocketInfo {
  @scala.inline
  def apply(
    connected: scala.Boolean,
    socketType: java.lang.String,
    localAddress: java.lang.String = null,
    localPort: scala.Int | scala.Double = null,
    peerAddress: java.lang.String = null,
    peerPort: scala.Int | scala.Double = null
  ): SocketInfo = {
    val __obj = js.Dynamic.literal(connected = connected, socketType = socketType)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (localPort != null) __obj.updateDynamic("localPort")(localPort.asInstanceOf[js.Any])
    if (peerAddress != null) __obj.updateDynamic("peerAddress")(peerAddress)
    if (peerPort != null) __obj.updateDynamic("peerPort")(peerPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketInfo]
  }
}

