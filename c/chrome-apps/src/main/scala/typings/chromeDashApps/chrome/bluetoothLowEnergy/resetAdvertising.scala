package typings.chromeDashApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.resetAdvertising")
@js.native
object resetAdvertising extends js.Object {
  /**
    * Resets advertising on the current device. It will unregister and stop all existing advertisements.
    * @since Chrome 61.
    * @param callback Called once the advertisements are reset.
    */
  def apply(callback: js.Function0[Unit]): Unit = js.native
}

