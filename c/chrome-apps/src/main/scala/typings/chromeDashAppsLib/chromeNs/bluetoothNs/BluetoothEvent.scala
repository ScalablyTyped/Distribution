package typings
package chromeDashAppsLib.chromeNs.bluetoothNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BluetoothEvent[T] extends js.Object {
  def addListener(callback: js.Function1[/* event */ T, scala.Unit]): scala.Unit
}

