package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object types {
  import typings.chrome.chrome.events.Event

  type ChromeSettingChangedEvent = Event[DetailsCallback]
  type DetailsCallback = js.Function1[/* details */ ChromeSettingGetResultDetails, Unit]
}
