package typings.chromeApps

import org.scalablytyped.runtime.StringDictionary
import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chrome.storage.LocalStorageArea
import typings.chromeApps.chrome.storage.ManagedStorageArea
import typings.chromeApps.chrome.storage.StorageAreas
import typings.chromeApps.chrome.storage.StorageChange
import typings.chromeApps.chrome.storage.SyncStorageArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofstorage extends js.Object {
  /** Items in the local storage area are local to each machine. */
  val local: LocalStorageArea
  /**
    * Items in the managed storage area are set by the domain administrator,
    * and are read-only for the extension; trying to modify this namespace
    * results in an error.
    * @since Chrome 33.
    */
  val managed: ManagedStorageArea
  /** Fired when one or more items change. */
  val onChanged: Event[
    js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ StorageAreas, Unit]
  ]
  /** Items in the sync storage area are synced using Chrome Sync. */
  val sync: SyncStorageArea
}

object Typeofstorage {
  @scala.inline
  def apply(
    local: LocalStorageArea,
    managed: ManagedStorageArea,
    onChanged: Event[
      js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ StorageAreas, Unit]
    ],
    sync: SyncStorageArea
  ): Typeofstorage = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], managed = managed.asInstanceOf[js.Any], onChanged = onChanged.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeofstorage]
  }
}

