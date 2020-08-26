package typings.chrome.anon

import typings.chrome.chrome.storage.LocalStorageArea
import typings.chrome.chrome.storage.StorageArea
import typings.chrome.chrome.storage.StorageChangedEvent
import typings.chrome.chrome.storage.SyncStorageArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofstorage extends js.Object {
  var local: LocalStorageArea = js.native
  var managed: StorageArea = js.native
  var onChanged: StorageChangedEvent = js.native
  var sync: SyncStorageArea = js.native
}

object Typeofstorage {
  @scala.inline
  def apply(
    local: LocalStorageArea,
    managed: StorageArea,
    onChanged: StorageChangedEvent,
    sync: SyncStorageArea
  ): Typeofstorage = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], managed = managed.asInstanceOf[js.Any], onChanged = onChanged.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofstorage]
  }
  @scala.inline
  implicit class TypeofstorageOps[Self <: Typeofstorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLocal(value: LocalStorageArea): Self = this.set("local", value.asInstanceOf[js.Any])
    @scala.inline
    def setManaged(value: StorageArea): Self = this.set("managed", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChanged(value: StorageChangedEvent): Self = this.set("onChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSync(value: SyncStorageArea): Self = this.set("sync", value.asInstanceOf[js.Any])
  }
  
}

