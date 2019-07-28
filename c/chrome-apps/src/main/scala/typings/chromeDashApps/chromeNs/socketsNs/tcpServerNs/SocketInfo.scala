package typings.chromeDashApps.chromeNs.socketsNs.tcpServerNs

import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://developer.chrome.com/apps/sockets_tcpServer#type-SocketInfo
  */
trait SocketInfo extends js.Object {
  /** If the socket is listening, contains its local IPv4/6 address. */
  var localAddress: js.UndefOr[String] = js.undefined
  /** If the socket is listening, contains its local port. */
  var localPort: js.UndefOr[integer] = js.undefined
  /** Application-defined string associated with the socket. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Flag indicating whether connection requests on a listening socket are
    * dispatched through the onAccept event or queued up in the listen
    * queue backlog. See setPaused. The default value is 'false'
    */
  var paused: Boolean
  /**
    * Flag indicating if the socket remains open when the event page of the
    * application is unloaded (see SocketProperties.persistent). The
    * default value is 'false'.
    */
  var persistent: Boolean
  /** The socket identifier. */
  var socketId: integer
}

object SocketInfo {
  @scala.inline
  def apply(
    paused: Boolean,
    persistent: Boolean,
    socketId: integer,
    localAddress: String = null,
    localPort: js.UndefOr[integer] = js.undefined,
    name: String = null
  ): SocketInfo = {
    val __obj = js.Dynamic.literal(paused = paused, persistent = persistent, socketId = socketId)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (!js.isUndefined(localPort)) __obj.updateDynamic("localPort")(localPort)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SocketInfo]
  }
}

