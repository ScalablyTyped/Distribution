package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofstorage extends js.Object {
  var local: chromeLib.chromeNs.storageNs.LocalStorageArea
  var managed: chromeLib.chromeNs.storageNs.StorageArea
  var onChanged: chromeLib.chromeNs.storageNs.StorageChangedEvent
  var sync: chromeLib.chromeNs.storageNs.SyncStorageArea
}

object Typeofstorage {
  @scala.inline
  def apply(
    local: chromeLib.chromeNs.storageNs.LocalStorageArea,
    managed: chromeLib.chromeNs.storageNs.StorageArea,
    onChanged: chromeLib.chromeNs.storageNs.StorageChangedEvent,
    sync: chromeLib.chromeNs.storageNs.SyncStorageArea
  ): Typeofstorage = {
    val __obj = js.Dynamic.literal(local = local, managed = managed, onChanged = onChanged, sync = sync)
  
    __obj.asInstanceOf[Typeofstorage]
  }
}

