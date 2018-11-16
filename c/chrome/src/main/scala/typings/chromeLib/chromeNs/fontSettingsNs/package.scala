package typings
package chromeLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fontSettingsNs {
  type DefaultFixedFontSizeChangedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* details */ FontSizeDetails, scala.Unit]]
  type DefaultFontSizeChangedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* details */ FontSizeDetails, scala.Unit]]
  type FontChangedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* details */ FullFontDetails, scala.Unit]]
  type MinimumFontSizeChangedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* details */ FontSizeDetails, scala.Unit]]
}
