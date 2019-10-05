package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sessions {
  import typings.chrome.chrome.events.Event

  type SessionChangedEvent = Event[js.Function0[Unit]]
}
