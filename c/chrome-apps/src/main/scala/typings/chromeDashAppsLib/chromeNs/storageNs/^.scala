package typings
package chromeDashAppsLib.chromeNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.storage")
@js.native
object ^ extends js.Object {
  /** Items in the local storage area are local to each machine. */
  val local: chromeDashAppsLib.chromeNs.storageNs.LocalStorageArea = js.native
  /**
    * Items in the managed storage area are set by the domain administrator,
    * and are read-only for the extension; trying to modify this namespace
    * results in an error.
    * @since Chrome 33.
    */
  val managed: chromeDashAppsLib.chromeNs.storageNs.ManagedStorageArea = js.native
  /** Fired when one or more items change. */
  val onChanged: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* changes */ org.scalablytyped.runtime.StringDictionary[chromeDashAppsLib.chromeNs.storageNs.StorageChange], 
      /* areaName */ chromeDashAppsLib.chromeNs.storageNs.StorageAreas, 
      scala.Unit
    ]
  ] = js.native
  /** Items in the sync storage area are synced using Chrome Sync. */
  val sync: chromeDashAppsLib.chromeNs.storageNs.SyncStorageArea = js.native
}

