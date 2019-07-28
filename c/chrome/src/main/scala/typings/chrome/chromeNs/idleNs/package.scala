package typings.chrome.chromeNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object idleNs {
  type IdleStateChangedEvent = Event[js.Function1[/* newState */ String, Unit]]
}
