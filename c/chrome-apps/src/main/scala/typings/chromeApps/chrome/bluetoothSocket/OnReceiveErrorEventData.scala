package typings.chromeApps.chrome.bluetoothSocket

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnReceiveErrorEventData extends js.Object {
  /**
    * An error code indicating what went wrong.
    *
    * disconnected
    *  > The connection was disconnected.
    * system_error
    *  > A system error occurred and the connection may be unrecoverable.
    * not_connected
    *  > The socket has not been connected.
    */
  var error: OnAcceptErrorCode
  /** The error message */
  var errorMessage: String
  /** The server socket identifier. */
  var socketId: integer
}

object OnReceiveErrorEventData {
  @scala.inline
  def apply(error: OnAcceptErrorCode, errorMessage: String, socketId: integer): OnReceiveErrorEventData = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnReceiveErrorEventData]
  }
}

