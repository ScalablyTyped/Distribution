package typings.chromeDashApps.chrome.bluetoothSocket

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketInfo extends js.Object {
  /**
    * If the underlying socket is connected,
    * contains the Bluetooth address of the device it is connected to.
    */
  var address: js.UndefOr[String] = js.undefined
  /**
    * The size of the buffer used to receive data.
    * If no buffer size has been specified explictly,
    * the value is not provided.
    */
  var bufferSize: js.UndefOr[integer] = js.undefined
  /**
    * Flag indicating whether the socket is connected to a remote peer.
    */
  var connected: Boolean
  /**
    * Application-defined string associated with the socket.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Flag indicating whether a connected socket
    * blocks its peer from sending more data, or
    * whether connection requests on a listening
    * socket are dispatched through the onAccept
    * event or queued up in the listen queue backlog.
    * See setPaused. The default value is 'false'.
    */
  var paused: Boolean
  /**
    * Flag indicating if the socket remains
    * open when the event page of the application
    * is unloaded (see SocketProperties.persistent).
    * The default value is 'false'.
    */
  var persistent: Boolean
  /**
    * The socket identifier.
    * */
  var socketId: integer
  /**
    * If the underlying socket is connected,
    * contains information about the service
    * UUID it is connected to, otherwise if
    * the underlying socket is listening,
    * contains information about the service
    * UUID it is listening on.
    */
  var uuid: js.UndefOr[String] = js.undefined
}

object SocketInfo {
  @scala.inline
  def apply(
    connected: Boolean,
    paused: Boolean,
    persistent: Boolean,
    socketId: integer,
    address: String = null,
    bufferSize: Int | Double = null,
    name: String = null,
    uuid: String = null
  ): SocketInfo = {
    val __obj = js.Dynamic.literal(connected = connected, paused = paused, persistent = persistent, socketId = socketId)
    if (address != null) __obj.updateDynamic("address")(address)
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (uuid != null) __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[SocketInfo]
  }
}

