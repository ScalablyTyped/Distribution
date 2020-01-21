package typings.chromeApps.chrome.system.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.storage.getAvailableCapacity")
@js.native
object getAvailableCapacity extends js.Object {
  /**
    * Get the available capacity of a specified |id| storage device. The |id| is the transient device ID from StorageUnitInfo.
    * @since Dev channel only.
    */
  def apply(id: String, callback: js.Function1[/* info */ StorageCapacityInfo, Unit]): Unit = js.native
}

