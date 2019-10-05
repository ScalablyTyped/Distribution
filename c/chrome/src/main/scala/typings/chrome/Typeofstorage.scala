package typings.chrome

import typings.chrome.chrome.storage.LocalStorageArea
import typings.chrome.chrome.storage.StorageArea
import typings.chrome.chrome.storage.StorageChangedEvent
import typings.chrome.chrome.storage.SyncStorageArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofstorage extends js.Object {
  var local: LocalStorageArea
  var managed: StorageArea
  var onChanged: StorageChangedEvent
  var sync: SyncStorageArea
}

object Typeofstorage {
  @scala.inline
  def apply(
    local: LocalStorageArea,
    managed: StorageArea,
    onChanged: StorageChangedEvent,
    sync: SyncStorageArea
  ): Typeofstorage = {
    val __obj = js.Dynamic.literal(local = local, managed = managed, onChanged = onChanged, sync = sync)
  
    __obj.asInstanceOf[Typeofstorage]
  }
}

