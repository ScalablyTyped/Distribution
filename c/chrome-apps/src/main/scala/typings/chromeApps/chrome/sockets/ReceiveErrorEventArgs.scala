package typings.chromeApps.chrome.sockets

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiveErrorEventArgs extends js.Object {
  /** The result code returned from the underlying network call. */
  var resultCode: integer
  /** The socket identifier. */
  var socketId: integer
}

object ReceiveErrorEventArgs {
  @scala.inline
  def apply(resultCode: integer, socketId: integer): ReceiveErrorEventArgs = {
    val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReceiveErrorEventArgs]
  }
}

