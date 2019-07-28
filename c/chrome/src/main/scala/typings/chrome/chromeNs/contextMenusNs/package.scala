package typings.chrome.chromeNs

import typings.chrome.chromeNs.eventsNs.Event
import typings.chrome.chromeNs.tabsNs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object contextMenusNs {
  type MenuClickedEvent = Event[js.Function2[/* info */ OnClickData, /* tab */ js.UndefOr[Tab], Unit]]
}
