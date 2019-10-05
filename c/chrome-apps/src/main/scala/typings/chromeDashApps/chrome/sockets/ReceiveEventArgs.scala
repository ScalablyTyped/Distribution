package typings.chromeDashApps.chrome.sockets

import typings.chromeDashApps.chrome.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiveEventArgs extends js.Object {
  /** The data received, with a maxium size of *bufferSize*. */
  var data: ArrayBuffer
  /** The socket identifier. */
  var socketId: integer
}

object ReceiveEventArgs {
  @scala.inline
  def apply(data: ArrayBuffer, socketId: integer): ReceiveEventArgs = {
    val __obj = js.Dynamic.literal(data = data, socketId = socketId)
  
    __obj.asInstanceOf[ReceiveEventArgs]
  }
}

