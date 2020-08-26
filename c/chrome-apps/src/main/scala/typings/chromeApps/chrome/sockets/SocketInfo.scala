package typings.chromeApps.chrome.sockets

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketInfo extends js.Object {
  /** The size of the buffer used to receive data. If no buffer size has been specified explictly, the value is not provided. */
  var bufferSize: js.UndefOr[integer] = js.native
  /** Flag indicating whether the socket is connected to a remote peer. */
  var connected: Boolean = js.native
  /** If the underlying socket is connected, contains its local IPv4/6 address. */
  var localAddress: js.UndefOr[String] = js.native
  /** If the underlying socket is connected, contains its local port. */
  var localPort: js.UndefOr[integer] = js.native
  /** Application-defined string associated with the socket. */
  var name: js.UndefOr[String] = js.native
  /** Flag indicating whether a connected socket blocks its peer from sending more data (see setPaused). */
  var paused: Boolean = js.native
  /** If the underlying socket is connected, contains the peer/ IPv4/6 address. */
  var peerAddress: js.UndefOr[String] = js.native
  /** If the underlying socket is connected, contains the peer port. */
  var peerPort: js.UndefOr[integer] = js.native
  /** Flag indicating whether the socket is left open when the application is suspended (see SocketProperties.persistent). */
  var persistent: Boolean = js.native
  /** The socket identifier. */
  var socketId: integer = js.native
}

object SocketInfo {
  @scala.inline
  def apply(connected: Boolean, paused: Boolean, persistent: Boolean, socketId: integer): SocketInfo = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
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
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersistent(value: Boolean): Self = this.set("persistent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocketId(value: integer): Self = this.set("socketId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBufferSize(value: integer): Self = this.set("bufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferSize: Self = this.set("bufferSize", js.undefined)
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    @scala.inline
    def setLocalPort(value: integer): Self = this.set("localPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalPort: Self = this.set("localPort", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPeerAddress(value: String): Self = this.set("peerAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerAddress: Self = this.set("peerAddress", js.undefined)
    @scala.inline
    def setPeerPort(value: integer): Self = this.set("peerPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerPort: Self = this.set("peerPort", js.undefined)
  }
  
}

