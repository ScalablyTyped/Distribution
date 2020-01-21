package typings.chromeApps.chrome.bluetoothLowEnergy

import typings.chromeApps.chrome.integer
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
  def apply(address: String, deviceClass: Int | Double = null, name: String = null): RequestDevice = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    if (deviceClass != null) __obj.updateDynamic("deviceClass")(deviceClass.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDevice]
  }
}

