package typings
package chromeLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object historyNs {
  type HistoryVisitRemovedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* removed */ RemovedResult, scala.Unit]]
  type HistoryVisitedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* result */ HistoryItem, scala.Unit]]
}
