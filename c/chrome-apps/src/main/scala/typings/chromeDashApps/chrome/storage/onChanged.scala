package typings.chromeDashApps.chrome.storage

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when one or more items change. */
@JSGlobal("chrome.storage.onChanged")
@js.native
object onChanged
  extends TopLevel[
      typings.chromeDashApps.chrome.events.Event[
        js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ StorageAreas, Unit]
      ]
    ]

