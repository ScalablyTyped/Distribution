package typings.chrome.chromeNs.systemNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.storage")
@js.native
object ^ extends js.Object {
  var onAttached: SystemStorageAttachedEvent = js.native
  var onDetached: SystemStorageDetachedEvent = js.native
  def ejectDevice(id: String, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  def getAvailableCapacity(id: String, callback: js.Function1[/* info */ StorageCapacityInfo, Unit]): Unit = js.native
  def getInfo(callback: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit]): Unit = js.native
}

