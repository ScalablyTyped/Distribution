package typings.chromeDashApps.chrome.hid

import typings.chromeDashApps.chrome.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.hid.sendFeatureReport")
@js.native
object sendFeatureReport extends js.Object {
  /**
    * Send a feature report to the device.
    * Note: Do not include a report ID prefix in data. It will be added if necessary.
    * @param connectionId The connectionId returned by connect.
    * @param reportId The report ID to use, or 0 if none.
    * @param data The report data.
    * @param callback
    */
  def apply(connectionId: integer, reportId: integer, data: ArrayBuffer, callback: js.Function0[Unit]): Unit = js.native
}

