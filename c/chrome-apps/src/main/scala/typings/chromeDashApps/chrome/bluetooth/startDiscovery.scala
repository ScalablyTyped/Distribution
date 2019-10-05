package typings.chromeDashApps.chrome.bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetooth.startDiscovery")
@js.native
object startDiscovery extends js.Object {
  /**
    * Start discovery. Newly discovered devices will be returned via the onDeviceAdded event. Previously discovered devices already known to the adapter must be obtained using getDevices and will only be updated using the |onDeviceChanged| event if information about them changes.
    * Discovery will fail to start if this application has already called startDiscovery. Discovery can be resource intensive: stopDiscovery should be called as soon as possible.
    */
  def apply(callback: js.Function0[Unit]): Unit = js.native
}

