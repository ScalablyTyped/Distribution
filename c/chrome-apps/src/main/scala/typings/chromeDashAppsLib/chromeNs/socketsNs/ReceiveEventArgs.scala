package typings
package chromeDashAppsLib.chromeNs.socketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiveEventArgs extends js.Object {
  /** The data received, with a maxium size of *bufferSize*. */
  var data: stdLib.ArrayBuffer
  /** The socket identifier. */
  var socketId: chromeDashAppsLib.chromeNs.integer
}

object ReceiveEventArgs {
  @scala.inline
  def apply(data: stdLib.ArrayBuffer, socketId: chromeDashAppsLib.chromeNs.integer): ReceiveEventArgs = {
    val __obj = js.Dynamic.literal(data = data, socketId = socketId)
  
    __obj.asInstanceOf[ReceiveEventArgs]
  }
}

