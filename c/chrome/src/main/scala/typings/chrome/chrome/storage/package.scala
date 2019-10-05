package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storage {
  import org.scalablytyped.runtime.StringDictionary
  import typings.chrome.chrome.events.Event

  type StorageChangedEvent = Event[
    js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ String, Unit]
  ]
}
