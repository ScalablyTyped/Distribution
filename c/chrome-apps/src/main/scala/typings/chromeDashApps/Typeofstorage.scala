package typings.chromeDashApps

import org.scalablytyped.runtime.StringDictionary
import typings.chromeDashApps.chromeNs.eventsNs.Event
import typings.chromeDashApps.chromeNs.storageNs.LocalStorageArea
import typings.chromeDashApps.chromeNs.storageNs.ManagedStorageArea
import typings.chromeDashApps.chromeNs.storageNs.StorageAreas
import typings.chromeDashApps.chromeNs.storageNs.StorageChange
import typings.chromeDashApps.chromeNs.storageNs.SyncStorageArea
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
    val __obj = js.Dynamic.literal(local = local, managed = managed, onChanged = onChanged, sync = sync)
  
    __obj.asInstanceOf[Typeofstorage]
  }
}

