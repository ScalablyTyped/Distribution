package typings.chromeDashApps.chrome.bluetoothSocket

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothSocket.update")
@js.native
object update extends js.Object {
  /**
    * Updates the socket properties.
    * @param socketId The socket identifier.
    * @param properties  The properties to update.
    * @param [callback] Called when the properties are updated.
    */
  def apply(socketId: integer, properties: SocketProperties): Unit = js.native
  def apply(socketId: integer, properties: SocketProperties, callback: js.Function0[Unit]): Unit = js.native
}

