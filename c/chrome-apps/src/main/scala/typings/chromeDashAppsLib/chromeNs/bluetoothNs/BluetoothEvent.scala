package typings
package chromeDashAppsLib.chromeNs.bluetoothNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothEvent[T] extends js.Object {
  def addListener(callback: js.Function1[/* event */ T, scala.Unit]): scala.Unit
}

object BluetoothEvent {
  @scala.inline
  def apply[T](addListener: js.Function1[js.Function1[/* event */ T, scala.Unit], scala.Unit]): BluetoothEvent[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(addListener)
    __obj.asInstanceOf[BluetoothEvent[T]]
  }
}

