package typings.chrome.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scriptBadgeNs {
  import typings.chrome.chromeNs.eventsNs.Event
  import typings.chrome.chromeNs.tabsNs.Tab

  type ScriptBadgeClickedEvent = Event[js.Function1[/* tab */ Tab, Unit]]
}
