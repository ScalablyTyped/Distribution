package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AreaName extends js.Object {
  /** Items in the local storage area are local to each machine. */
  val local: chromeDashAppsLib.chromeNs.storageNs.LocalStorageArea
  /**
    * Items in the managed storage area are set by the domain administrator,
    * and are read-only for the extension; trying to modify this namespace
    * results in an error.
    * @since Chrome 33.
    */
  val managed: chromeDashAppsLib.chromeNs.storageNs.ManagedStorageArea
  /** Fired when one or more items change. */
  val onChanged: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* changes */ org.scalablytyped.runtime.StringDictionary[chromeDashAppsLib.chromeNs.storageNs.StorageChange], 
      /* areaName */ chromeDashAppsLib.chromeNs.storageNs.StorageAreas, 
      scala.Unit
    ]
  ]
  /** Items in the sync storage area are synced using Chrome Sync. */
  val sync: chromeDashAppsLib.chromeNs.storageNs.SyncStorageArea
}

object Anon_AreaName {
  @scala.inline
  def apply(
    local: chromeDashAppsLib.chromeNs.storageNs.LocalStorageArea,
    managed: chromeDashAppsLib.chromeNs.storageNs.ManagedStorageArea,
    onChanged: chromeDashAppsLib.chromeNs.eventsNs.Event[
      js.Function2[
        /* changes */ org.scalablytyped.runtime.StringDictionary[chromeDashAppsLib.chromeNs.storageNs.StorageChange], 
        /* areaName */ chromeDashAppsLib.chromeNs.storageNs.StorageAreas, 
        scala.Unit
      ]
    ],
    sync: chromeDashAppsLib.chromeNs.storageNs.SyncStorageArea
  ): Anon_AreaName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("local")(local)
    __obj.updateDynamic("managed")(managed)
    __obj.updateDynamic("onChanged")(onChanged)
    __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[Anon_AreaName]
  }
}

