package typings.chromeDashApps.chrome.hid

import typings.chromeDashApps.Anon_ConnectionId
import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.hid.connect")
@js.native
object connect extends js.Object {
  /**
    * Open a connection to an HID device for communication.
    * @param deviceId The HidDeviceInfo.deviceId of the device to open.
    * @param callback The callback function returns an object, containing the connectionId.
    *                 The connectionId is the opaque ID used to identify this connection in all other functions.
    */
  def apply(deviceId: integer, callback: js.Function1[/* connection */ Anon_ConnectionId, Unit]): Unit = js.native
}

