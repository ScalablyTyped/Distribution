package typings.chrome.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fontSettingsNs {
  import typings.chrome.chromeNs.eventsNs.Event

  type DefaultFixedFontSizeChangedEvent = Event[js.Function1[/* details */ FontSizeDetails, Unit]]
  type DefaultFontSizeChangedEvent = Event[js.Function1[/* details */ FontSizeDetails, Unit]]
  type FontChangedEvent = Event[js.Function1[/* details */ FullFontDetails, Unit]]
  type MinimumFontSizeChangedEvent = Event[js.Function1[/* details */ FontSizeDetails, Unit]]
}
