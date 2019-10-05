package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object history {
  import typings.chrome.chrome.events.Event

  type HistoryVisitRemovedEvent = Event[js.Function1[/* removed */ RemovedResult, Unit]]
  type HistoryVisitedEvent = Event[js.Function1[/* result */ HistoryItem, Unit]]
}
