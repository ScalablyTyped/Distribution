package typings.chromeApps.chrome.sockets.tcpServer

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://developer.chrome.com/apps/sockets_tcpServer#type-SocketInfo
  */
@js.native
trait SocketInfo extends js.Object {
  /** If the socket is listening, contains its local IPv4/6 address. */
  var localAddress: js.UndefOr[String] = js.native
  /** If the socket is listening, contains its local port. */
  var localPort: js.UndefOr[integer] = js.native
  /** Application-defined string associated with the socket. */
  var name: js.UndefOr[String] = js.native
  /**
    * Flag indicating whether connection requests on a listening socket are
    * dispatched through the onAccept event or queued up in the listen
    * queue backlog. See setPaused. The default value is 'false'
    */
  var paused: Boolean = js.native
  /**
    * Flag indicating if the socket remains open when the event page of the
    * application is unloaded (see SocketProperties.persistent). The
    * default value is 'false'.
    */
  var persistent: Boolean = js.native
  /** The socket identifier. */
  var socketId: integer = js.native
}

object SocketInfo {
  @scala.inline
  def apply(paused: Boolean, persistent: Boolean, socketId: integer): SocketInfo = {
    val __obj = js.Dynamic.literal(paused = paused.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
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
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersistent(value: Boolean): Self = this.set("persistent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocketId(value: integer): Self = this.set("socketId", value.asInstanceOf[js.Any])
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
  }
  
}

