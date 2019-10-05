package typings.chromeDashApps.chrome.usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.usb.getConfigurations")
@js.native
object getConfigurations extends js.Object {
  /**
    * Returns the full set of device configuration descriptors.
    * @since Chrome 47.
    * @param device The Device to fetch descriptors from.
    * @param callback
    */
  def apply(device: Device, callback: js.Function1[/* configs */ js.Array[ConfigDescriptor], Unit]): Unit = js.native
}

