package typings.chrome.chromeNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesNs {
  type ChromeSettingChangedEvent = Event[DetailsCallback]
  type DetailsCallback = js.Function1[/* details */ ChromeSettingGetResultDetails, Unit]
}
