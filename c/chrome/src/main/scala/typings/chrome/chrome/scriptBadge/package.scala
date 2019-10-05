package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scriptBadge {
  import typings.chrome.chrome.events.Event
  import typings.chrome.chrome.tabs.Tab

  type ScriptBadgeClickedEvent = Event[js.Function1[/* tab */ Tab, Unit]]
}
