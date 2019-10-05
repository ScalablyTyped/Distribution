package typings.chromeDashApps.chrome.sockets.tcpServer

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sockets.tcpServer.setPaused")
@js.native
object setPaused extends js.Object {
  /**
    * Enables or disables a listening socket from accepting new connections.
    * When paused, a listening socket accepts new connections until its backlog
    * (see listen function) is full then refuses additional connection
    * requests. onAccept events are raised only when the socket is un-paused.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-setPaused
    * @param callback Callback from the setPaused method.
    */
  def apply(socketId: integer, paused: Boolean): Unit = js.native
  def apply(socketId: integer, paused: Boolean, callback: js.Function0[Unit]): Unit = js.native
}

