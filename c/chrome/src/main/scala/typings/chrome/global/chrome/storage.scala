package typings.chrome.global.chrome

import typings.chrome.chrome.storage.LocalStorageArea
import typings.chrome.chrome.storage.SessionStorageArea
import typings.chrome.chrome.storage.StorageArea
import typings.chrome.chrome.storage.StorageChangedEvent
import typings.chrome.chrome.storage.SyncStorageArea
import typings.chrome.chromeStrings.TRUSTED_AND_UNTRUSTED_CONTEXTS
import typings.chrome.chromeStrings.TRUSTED_CONTEXTS
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
  
  object AccessLevel {
    
    @JSGlobal("chrome.storage.AccessLevel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.storage.AccessLevel.TRUSTED_AND_UNTRUSTED_CONTEXTS")
    @js.native
    def TRUSTED_AND_UNTRUSTED_CONTEXTS: typings.chrome.chromeStrings.TRUSTED_AND_UNTRUSTED_CONTEXTS = js.native
    inline def TRUSTED_AND_UNTRUSTED_CONTEXTS_=(x: TRUSTED_AND_UNTRUSTED_CONTEXTS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRUSTED_AND_UNTRUSTED_CONTEXTS")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.storage.AccessLevel.TRUSTED_CONTEXTS")
    @js.native
    def TRUSTED_CONTEXTS: typings.chrome.chromeStrings.TRUSTED_CONTEXTS = js.native
    inline def TRUSTED_CONTEXTS_=(x: TRUSTED_CONTEXTS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRUSTED_CONTEXTS")(x.asInstanceOf[js.Any])
  }
  
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
  
  @JSGlobal("chrome.storage.session")
  @js.native
  def session: SessionStorageArea = js.native
  inline def session_=(x: SessionStorageArea): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("session")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.storage.sync")
  @js.native
  def sync: SyncStorageArea = js.native
  inline def sync_=(x: SyncStorageArea): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sync")(x.asInstanceOf[js.Any])
}
