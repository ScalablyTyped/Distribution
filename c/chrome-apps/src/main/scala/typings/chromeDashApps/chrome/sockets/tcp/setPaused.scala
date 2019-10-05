package typings.chromeDashApps.chrome.sockets.tcp

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sockets.tcp.setPaused")
@js.native
object setPaused extends js.Object {
  /**
    * Enables or disables the application from receiving messages from its peer.
    * The default value is 'false'. Pausing a socket is typically used by an
    * application to throttle data sent by its peer. When a socket is paused,
    * no onReceive event is raised. When a socket is connected and un-paused,
    * onReceive events are raised again when messages are received.
    */
  def apply(socketId: integer, paused: Boolean): Unit = js.native
  def apply(socketId: integer, paused: Boolean, callback: js.Function0[Unit]): Unit = js.native
}

