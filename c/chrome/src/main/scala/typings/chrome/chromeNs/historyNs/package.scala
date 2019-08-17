package typings.chrome.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object historyNs {
  import typings.chrome.chromeNs.eventsNs.Event

  type HistoryVisitRemovedEvent = Event[js.Function1[/* removed */ RemovedResult, Unit]]
  type HistoryVisitedEvent = Event[js.Function1[/* result */ HistoryItem, Unit]]
}
