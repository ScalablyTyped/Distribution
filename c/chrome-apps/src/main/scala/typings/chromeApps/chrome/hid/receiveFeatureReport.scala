package typings.chromeApps.chrome.hid

import typings.chromeApps.chrome.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.hid.receiveFeatureReport")
@js.native
object receiveFeatureReport extends js.Object {
  /**
    * Request a feature report from the device.
    * @param connectionId The connectionId returned by connect.
    * @param reportId The report ID, or 0 if none.
    * @param callback Will provide `data` which contain the report data, including a report ID prefix if one is sent by the device.
    */
  def apply(connectionId: integer, reportId: integer, callback: js.Function1[/* data */ ArrayBuffer, Unit]): Unit = js.native
}

