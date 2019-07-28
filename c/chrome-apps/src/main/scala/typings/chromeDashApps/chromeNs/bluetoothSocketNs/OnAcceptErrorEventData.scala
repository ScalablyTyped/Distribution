package typings.chromeDashApps.chromeNs.bluetoothSocketNs

import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnAcceptErrorEventData extends js.Object {
  /**
    * An error code indicating what went wrong.
    *
    * system_error
    *  > A system error occurred and the connection may be unrecoverable.
    * not_listening
    *  > The socket is not listening.
    */
  var error: OnAcceptErrorCode
  /** The error message */
  var errorMessage: String
  /** The server socket identifier. */
  var socketId: integer
}

object OnAcceptErrorEventData {
  @scala.inline
  def apply(error: OnAcceptErrorCode, errorMessage: String, socketId: integer): OnAcceptErrorEventData = {
    val __obj = js.Dynamic.literal(error = error, errorMessage = errorMessage, socketId = socketId)
  
    __obj.asInstanceOf[OnAcceptErrorEventData]
  }
}

