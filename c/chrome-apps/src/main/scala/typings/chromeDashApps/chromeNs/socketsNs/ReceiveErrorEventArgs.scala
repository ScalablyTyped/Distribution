package typings.chromeDashApps.chromeNs.socketsNs

import typings.chromeDashApps.chromeNs.integer
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
    val __obj = js.Dynamic.literal(resultCode = resultCode, socketId = socketId)
  
    __obj.asInstanceOf[ReceiveErrorEventArgs]
  }
}

