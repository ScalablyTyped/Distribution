package typings.chromeDashApps.chromeNs.bluetoothLowEnergyNs

import typings.chromeDashApps.chromeNs.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  /** Device that send this request. */
  var device: RequestDevice
  /** Unique ID for this request. Use this ID when responding to this request. */
  var requestId: integer
  /** Value to write (if this is a write request). */
  var value: js.UndefOr[ArrayBuffer] = js.undefined
}

object Request {
  @scala.inline
  def apply(device: RequestDevice, requestId: integer, value: ArrayBuffer = null): Request = {
    val __obj = js.Dynamic.literal(device = device, requestId = requestId)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Request]
  }
}

