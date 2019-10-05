package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fontSettings {
  import typings.chrome.chrome.events.Event

  type DefaultFixedFontSizeChangedEvent = Event[js.Function1[/* details */ FontSizeDetails, Unit]]
  type DefaultFontSizeChangedEvent = Event[js.Function1[/* details */ FontSizeDetails, Unit]]
  type FontChangedEvent = Event[js.Function1[/* details */ FullFontDetails, Unit]]
  type MinimumFontSizeChangedEvent = Event[js.Function1[/* details */ FontSizeDetails, Unit]]
}
