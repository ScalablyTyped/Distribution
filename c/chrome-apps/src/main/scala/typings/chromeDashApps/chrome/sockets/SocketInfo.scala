package typings.chromeDashApps.chrome.sockets

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketInfo extends js.Object {
  /** The size of the buffer used to receive data. If no buffer size has been specified explictly, the value is not provided. */
  var bufferSize: js.UndefOr[integer] = js.undefined
  /** Flag indicating whether the socket is connected to a remote peer. */
  var connected: Boolean
  /** If the underlying socket is connected, contains its local IPv4/6 address. */
  var localAddress: js.UndefOr[String] = js.undefined
  /** If the underlying socket is connected, contains its local port. */
  var localPort: js.UndefOr[integer] = js.undefined
  /** Application-defined string associated with the socket. */
  var name: js.UndefOr[String] = js.undefined
  /** Flag indicating whether a connected socket blocks its peer from sending more data (see setPaused). */
  var paused: Boolean
  /** If the underlying socket is connected, contains the peer/ IPv4/6 address. */
  var peerAddress: js.UndefOr[String] = js.undefined
  /** If the underlying socket is connected, contains the peer port. */
  var peerPort: js.UndefOr[integer] = js.undefined
  /** Flag indicating whether the socket is left open when the application is suspended (see SocketProperties.persistent). */
  var persistent: Boolean
  /** The socket identifier. */
  var socketId: integer
}

object SocketInfo {
  @scala.inline
  def apply(
    connected: Boolean,
    paused: Boolean,
    persistent: Boolean,
    socketId: integer,
    bufferSize: Int | Double = null,
    localAddress: String = null,
    localPort: Int | Double = null,
    name: String = null,
    peerAddress: String = null,
    peerPort: Int | Double = null
  ): SocketInfo = {
    val __obj = js.Dynamic.literal(connected = connected, paused = paused, persistent = persistent, socketId = socketId)
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (localPort != null) __obj.updateDynamic("localPort")(localPort.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (peerAddress != null) __obj.updateDynamic("peerAddress")(peerAddress)
    if (peerPort != null) __obj.updateDynamic("peerPort")(peerPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketInfo]
  }
}

