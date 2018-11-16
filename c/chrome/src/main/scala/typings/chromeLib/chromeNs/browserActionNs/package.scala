package typings
package chromeLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object browserActionNs {
  type BrowserClickedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* tab */ chromeLib.chromeNs.tabsNs.Tab, scala.Unit]]
  type ColorArray = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
}
