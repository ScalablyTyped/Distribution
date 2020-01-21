package typings.chromeApps.chrome.bluetoothSocket

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothSocket.setPaused")
@js.native
object setPaused extends js.Object {
  /**
    * Enables or disables a connected socket from
    * receiving messages from its peer, or a listening
    * socket from accepting new connections. The default
    * value is 'false'. Pausing a connected socket is
    * typically used by an application to throttle data
    * sent by its peer. When a connected socket is paused,
    * no onReceiveevent is raised. When a socket is connected
    * and un-paused, onReceive events are raised again when
    * messages are received. When a listening socket is paused,
    * new connections are accepted until its backlog is full
    * then additional connection requests are refused.
    * onAccept events are raised only when the socket is un-paused.
    *
    * @param socketId The socket identifier.
    * @param paused Flag indicating whether a connected socket
    * blocks its peer from sending more data, or
    * whether connection requests on a listening
    * socket are dispatched through the onAccept
    * event or queued up in the listen queue backlog.
    * See setPaused. The default value is 'false'.
    * @param [callback] Callback from the setPaused method.
    */
  def apply(socketId: integer, paused: Boolean): Unit = js.native
  def apply(socketId: integer, paused: Boolean, callback: js.Function0[Unit]): Unit = js.native
}

