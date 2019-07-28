package typings.chrome.chromeNs

import org.scalablytyped.runtime.StringDictionary
import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storageNs {
  type StorageChangedEvent = Event[
    js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ String, Unit]
  ]
}
