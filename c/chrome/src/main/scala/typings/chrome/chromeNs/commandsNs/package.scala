package typings.chrome.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commandsNs {
  import typings.chrome.chromeNs.eventsNs.Event

  type CommandEvent = Event[js.Function1[/* command */ String, Unit]]
}
