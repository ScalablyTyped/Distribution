package typings.chrome.chromeNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object historyNs {
  type HistoryVisitRemovedEvent = Event[js.Function1[/* removed */ RemovedResult, Unit]]
  type HistoryVisitedEvent = Event[js.Function1[/* result */ HistoryItem, Unit]]
}
