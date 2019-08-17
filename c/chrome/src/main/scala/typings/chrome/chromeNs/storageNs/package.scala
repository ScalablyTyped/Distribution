package typings.chrome.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storageNs {
  import org.scalablytyped.runtime.StringDictionary
  import typings.chrome.chromeNs.eventsNs.Event

  type StorageChangedEvent = Event[
    js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ String, Unit]
  ]
}
