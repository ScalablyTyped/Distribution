package typings.chromeDashApps.chrome.system.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.storage.getInfo")
@js.native
object getInfo extends js.Object {
  /** Get the storage information from the system. The argument passed to the callback is an array of StorageUnitInfo objects. */
  def apply(callback: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit]): Unit = js.native
}

