package typings
package chromeDashAppsLib.chromeNs.socketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiveErrorEventArgs extends js.Object {
  /** The result code returned from the underlying network call. */
  var resultCode: chromeDashAppsLib.chromeNs.integer
  /** The socket identifier. */
  var socketId: chromeDashAppsLib.chromeNs.integer
}

object ReceiveErrorEventArgs {
  @scala.inline
  def apply(resultCode: chromeDashAppsLib.chromeNs.integer, socketId: chromeDashAppsLib.chromeNs.integer): ReceiveErrorEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resultCode")(resultCode)
    __obj.updateDynamic("socketId")(socketId)
    __obj.asInstanceOf[ReceiveErrorEventArgs]
  }
}

