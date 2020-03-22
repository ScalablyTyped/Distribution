package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object idle {
  type IdleStateChangedEvent = typings.chrome.chrome.events.Event[js.Function1[/* newState */ typings.chrome.chrome.idle.IdleState, scala.Unit]]
}
