package typings.chromeApps.chrome.bluetoothSocket

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnAcceptErrorEventData extends js.Object {
  /**
    * An error code indicating what went wrong.
    *
    * system_error
    *  > A system error occurred and the connection may be unrecoverable.
    * not_listening
    *  > The socket is not listening.
    */
  var error: OnAcceptErrorCode = js.native
  /** The error message */
  var errorMessage: String = js.native
  /** The server socket identifier. */
  var socketId: integer = js.native
}

object OnAcceptErrorEventData {
  @scala.inline
  def apply(error: OnAcceptErrorCode, errorMessage: String, socketId: integer): OnAcceptErrorEventData = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAcceptErrorEventData]
  }
  @scala.inline
  implicit class OnAcceptErrorEventDataOps[Self <: OnAcceptErrorEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: OnAcceptErrorCode): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocketId(value: integer): Self = this.set("socketId", value.asInstanceOf[js.Any])
  }
  
}

