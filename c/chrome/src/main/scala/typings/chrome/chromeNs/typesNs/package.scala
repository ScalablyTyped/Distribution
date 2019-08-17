package typings.chrome.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesNs {
  import typings.chrome.chromeNs.eventsNs.Event

  type ChromeSettingChangedEvent = Event[DetailsCallback]
  type DetailsCallback = js.Function1[/* details */ ChromeSettingGetResultDetails, Unit]
}
