package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pageAction {
  type PageActionClickedEvent = typings.chrome.chrome.events.Event[js.Function1[/* tab */ typings.chrome.chrome.tabs.Tab, scala.Unit]]
}
