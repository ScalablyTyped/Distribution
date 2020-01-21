package typings.chromeApps.chrome.storage

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.chromeApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when one or more items change. */
@JSGlobal("chrome.storage.onChanged")
@js.native
object onChanged
  extends TopLevel[
      Event[
        js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ StorageAreas, Unit]
      ]
    ]

