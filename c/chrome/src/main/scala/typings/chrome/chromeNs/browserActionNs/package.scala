package typings.chrome.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object browserActionNs {
  import typings.chrome.chromeNs.eventsNs.Event
  import typings.chrome.chromeNs.tabsNs.Tab

  type BrowserClickedEvent = Event[js.Function1[/* tab */ Tab, Unit]]
  type ColorArray = js.Tuple4[Double, Double, Double, Double]
}
