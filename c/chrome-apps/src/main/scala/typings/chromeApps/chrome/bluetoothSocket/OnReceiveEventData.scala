package typings.chromeApps.chrome.bluetoothSocket

import typings.chromeApps.chrome.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnReceiveEventData extends js.Object {
  /** The data received, with a maxium size of bufferSize. */
  var data: ArrayBuffer
  /** The socket identifier. */
  var socketId: integer
}

object OnReceiveEventData {
  @scala.inline
  def apply(data: ArrayBuffer, socketId: integer): OnReceiveEventData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnReceiveEventData]
  }
}

