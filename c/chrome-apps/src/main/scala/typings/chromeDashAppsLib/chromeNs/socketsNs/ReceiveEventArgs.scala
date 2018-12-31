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

