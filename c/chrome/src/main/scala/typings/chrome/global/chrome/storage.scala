package typings.chrome.global.chrome

import typings.chrome.chrome.storage.LocalStorageArea
import typings.chrome.chrome.storage.StorageArea
import typings.chrome.chrome.storage.StorageChangedEvent
import typings.chrome.chrome.storage.SyncStorageArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Storage
////////////////////
/**
  * Use the chrome.storage API to store, retrieve, and track changes to user data.
  * Permissions:  "storage"
  * @since Chrome 20.
  */
object storage {
  
  @JSGlobal("chrome.storage")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.storage.local")
  @js.native
  def local: LocalStorageArea = js.native
  inline def local_=(x: LocalStorageArea): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("local")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.storage.managed")
  @js.native
  def managed: StorageArea = js.native
  inline def managed_=(x: StorageArea): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("managed")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.storage.onChanged")
  @js.native
  def onChanged: StorageChangedEvent = js.native
  inline def onChanged_=(x: StorageChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.storage.sync")
  @js.native
  def sync: SyncStorageArea = js.native
  inline def sync_=(x: SyncStorageArea): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sync")(x.asInstanceOf[js.Any])
}
