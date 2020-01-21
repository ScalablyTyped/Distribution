package typings.chromeApps.chrome.hid

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.hid.disconnect")
@js.native
object disconnect extends js.Object {
  /**
    * Disconnect from a device.
    * Invoking operations on a device after calling this is safe but has no effect.
    * @param connectionId The connectionId returned by connect.
    * @param [callback]
    */
  def apply(connectionId: integer): Unit = js.native
  def apply(connectionId: integer, callback: js.Function0[Unit]): Unit = js.native
}

