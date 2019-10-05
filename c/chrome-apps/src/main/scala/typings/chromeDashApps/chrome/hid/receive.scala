package typings.chromeDashApps.chrome.hid

import typings.chromeDashApps.chrome.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.hid.receive")
@js.native
object receive extends js.Object {
  /**
    * Receive the next input report from the device.
    * @param connectionId The connectionId returned by connect.
    * @param callback The callback will return these parameters:
    *                      * reportId - The report ID or 0 if none.
    *                      * data - The report data, the report ID prefix (if present) is removed.
    */
  def apply(
    connectionId: integer,
    callback: js.Function2[/* reportId */ integer, /* data */ ArrayBuffer, Unit]
  ): Unit = js.native
}

