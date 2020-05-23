package typings.chrome.global.chrome

import typings.chrome.chrome.storage.LocalStorageArea
import typings.chrome.chrome.storage.StorageArea
import typings.chrome.chrome.storage.StorageChangedEvent
import typings.chrome.chrome.storage.SyncStorageArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Storage
////////////////////
/**
  * Use the chrome.storage API to store, retrieve, and track changes to user data.
  * Permissions:  "storage"
  * @since Chrome 20.
  */
@JSGlobal("chrome.storage")
@js.native
object storage extends js.Object {
  var local: LocalStorageArea = js.native
  var managed: StorageArea = js.native
  var onChanged: StorageChangedEvent = js.native
  var sync: SyncStorageArea = js.native
}

