package typings
package chromeDashAppsLib.chromeNs.bluetoothLowEnergyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResponse extends js.Object {
  /** If this is an error response, this should be true. */
  var isError: scala.Boolean
  /** Id of the request this is a response to. */
  var requestId: chromeDashAppsLib.chromeNs.integer
  /** Response value. Write requests and error responses will ignore this parameter. */
  var value: js.UndefOr[stdLib.ArrayBuffer] = js.undefined
}

