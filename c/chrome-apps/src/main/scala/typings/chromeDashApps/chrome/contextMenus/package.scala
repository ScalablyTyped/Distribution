package typings.chromeDashApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object contextMenus {
  import typings.chromeDashApps.chrome.events.Event

  type MenuClickedEvent = Event[js.Function1[/* info */ OnClickData, Unit]]
}
