package typings.chromeApps.global.chrome

import org.scalablytyped.runtime.StringDictionary
import typings.chromeApps.chrome.storage.LocalStorageArea
import typings.chromeApps.chrome.storage.ManagedStorageArea
import typings.chromeApps.chrome.storage.StorageAreas
import typings.chromeApps.chrome.storage.StorageChange
import typings.chromeApps.chrome.storage.SyncStorageArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion chrome.sockets.*
// #region chrome.storage
/////////////
// Storage //
/////////////
/**
  * Use the chrome.storage API to store, retrieve, and track changes to user data.
  * Permissions:  'storage'
  * @since Chrome 20.
  */
object storage {
  
  /** Items in the local storage area are local to each machine. */
  @JSGlobal("chrome.storage.local")
  @js.native
  val local: LocalStorageArea = js.native
  
  /**
    * Items in the managed storage area are set by the domain administrator,
    * and are read-only for the extension; trying to modify this namespace
    * results in an error.
    * @since Chrome 33.
    */
  @JSGlobal("chrome.storage.managed")
  @js.native
  val managed: ManagedStorageArea = js.native
  
  /** Fired when one or more items change. */
  @JSGlobal("chrome.storage.onChanged")
  @js.native
  val onChanged: typings.chromeApps.chrome.events.Event[
    js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ StorageAreas, Unit]
  ] = js.native
  
  /** Items in the sync storage area are synced using Chrome Sync. */
  @JSGlobal("chrome.storage.sync")
  @js.native
  val sync: SyncStorageArea = js.native
}
