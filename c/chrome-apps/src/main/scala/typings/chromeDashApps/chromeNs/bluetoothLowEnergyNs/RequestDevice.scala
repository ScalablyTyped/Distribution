package typings.chromeDashApps.chromeNs.bluetoothLowEnergyNs

import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestDevice extends js.Object {
  /** The address of the device, in the format 'XX:XX:XX:XX:XX:XX'. */
  var address: String
  /** The class of the device, a bit - field defined by:
    * @see [Specs]{@link http://www.bluetooth.org/en-us/specification/assigned-numbers/baseband}
    **/
  var deviceClass: js.UndefOr[integer] = js.undefined
  /** The human-readable name of the device. */
  var name: js.UndefOr[String] = js.undefined
}

object RequestDevice {
  @scala.inline
  def apply(address: String, deviceClass: js.UndefOr[integer] = js.undefined, name: String = null): RequestDevice = {
    val __obj = js.Dynamic.literal(address = address)
    if (!js.isUndefined(deviceClass)) __obj.updateDynamic("deviceClass")(deviceClass)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[RequestDevice]
  }
}

