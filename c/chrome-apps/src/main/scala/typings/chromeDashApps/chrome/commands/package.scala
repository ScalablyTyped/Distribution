package typings.chromeDashApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commands {
  import typings.chromeDashApps.chrome.events.Event

  type CommandEvent = Event[js.Function1[/* command */ String, Unit]]
}
