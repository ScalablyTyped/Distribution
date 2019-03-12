package typings
package chromeLib.chromeNs.systemNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.storage")
@js.native
object ^ extends js.Object {
  var onAttached: SystemStorageAttachedEvent = js.native
  var onDetached: SystemStorageDetachedEvent = js.native
  def ejectDevice(id: java.lang.String, callback: js.Function1[/* result */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getAvailableCapacity(id: java.lang.String, callback: js.Function1[/* info */ StorageCapacityInfo, scala.Unit]): scala.Unit = js.native
  def getInfo(callback: js.Function1[/* info */ js.Array[StorageUnitInfo], scala.Unit]): scala.Unit = js.native
}

