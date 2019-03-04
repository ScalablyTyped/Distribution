package typings
package chromeDashAppsLib.chromeNs.bluetoothLowEnergyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestDevice extends js.Object {
  /** The address of the device, in the format 'XX:XX:XX:XX:XX:XX'. */
  var address: java.lang.String
  /** The class of the device, a bit - field defined by:
    * @see [Specs]{@link http://www.bluetooth.org/en-us/specification/assigned-numbers/baseband}
    **/
  var deviceClass: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** The human-readable name of the device. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object RequestDevice {
  @scala.inline
  def apply(
    address: java.lang.String,
    deviceClass: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    name: java.lang.String = null
  ): RequestDevice = {
    val __obj = js.Dynamic.literal(address = address)
    if (!js.isUndefined(deviceClass)) __obj.updateDynamic("deviceClass")(deviceClass)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[RequestDevice]
  }
}

