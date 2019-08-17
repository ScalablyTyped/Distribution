package typings.chrome.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object contextMenusNs {
  import typings.chrome.chromeNs.eventsNs.Event
  import typings.chrome.chromeNs.tabsNs.Tab

  type MenuClickedEvent = Event[js.Function2[/* info */ OnClickData, /* tab */ js.UndefOr[Tab], Unit]]
}
