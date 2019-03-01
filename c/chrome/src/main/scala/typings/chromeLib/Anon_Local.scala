package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Local extends js.Object {
  var local: chromeLib.chromeNs.storageNs.LocalStorageArea
  var managed: chromeLib.chromeNs.storageNs.StorageArea
  var onChanged: chromeLib.chromeNs.storageNs.StorageChangedEvent
  var sync: chromeLib.chromeNs.storageNs.SyncStorageArea
}

object Anon_Local {
  @scala.inline
  def apply(
    local: chromeLib.chromeNs.storageNs.LocalStorageArea,
    managed: chromeLib.chromeNs.storageNs.StorageArea,
    onChanged: chromeLib.chromeNs.storageNs.StorageChangedEvent,
    sync: chromeLib.chromeNs.storageNs.SyncStorageArea
  ): Anon_Local = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("local")(local)
    __obj.updateDynamic("managed")(managed)
    __obj.updateDynamic("onChanged")(onChanged)
    __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[Anon_Local]
  }
}

