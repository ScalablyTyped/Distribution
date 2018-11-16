package typings
package chromeDashAppsLib.chromeNs.socketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SocketInfo extends js.Object {
  /** The size of the buffer used to receive data. If no buffer size has been specified explictly, the value is not provided. */
  var bufferSize: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** Flag indicating whether the socket is connected to a remote peer. */
  var connected: scala.Boolean
  /** If the underlying socket is connected, contains its local IPv4/6 address. */
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  /** If the underlying socket is connected, contains its local port. */
  var localPort: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** Application-defined string associated with the socket. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Flag indicating whether a connected socket blocks its peer from sending more data (see setPaused). */
  var paused: scala.Boolean
  /** If the underlying socket is connected, contains the peer/ IPv4/6 address. */
  var peerAddress: js.UndefOr[java.lang.String] = js.undefined
  /** If the underlying socket is connected, contains the peer port. */
  var peerPort: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** Flag indicating whether the socket is left open when the application is suspended (see SocketProperties.persistent). */
  var persistent: scala.Boolean
  /** The socket identifier. */
  var socketId: chromeDashAppsLib.chromeNs.integer
}

