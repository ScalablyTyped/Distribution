package typings
package chromeDashAppsLib.chromeNs.bluetoothLowEnergyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Request extends js.Object {
  /** Device that send this request. */
  var device: RequestDevice
  /** Unique ID for this request. Use this ID when responding to this request. */
  var requestId: chromeDashAppsLib.chromeNs.integer
  /** Value to write (if this is a write request). */
  var value: js.UndefOr[stdLib.ArrayBuffer] = js.undefined
}

