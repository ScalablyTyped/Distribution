package typings.chromeDashApps.chrome.bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetooth.getAdapterState")
@js.native
object getAdapterState extends js.Object {
  /** Get information about the Bluetooth adapter. */
  def apply(callback: js.Function1[/* adapterInfo */ AdapterState, Unit]): Unit = js.native
}

