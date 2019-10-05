package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object contextMenus {
  import typings.chrome.chrome.events.Event
  import typings.chrome.chrome.tabs.Tab

  type MenuClickedEvent = Event[js.Function2[/* info */ OnClickData, /* tab */ js.UndefOr[Tab], Unit]]
}
