package typings.chromeDashApps.chrome.system.storage

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when a new removable storage is attached to the system. */
@JSGlobal("chrome.system.storage.onAttached")
@js.native
object onAttached
  extends TopLevel[
      typings.chromeDashApps.chrome.events.Event[js.Function1[/* info */ StorageUnitInfo, Unit]]
    ]

