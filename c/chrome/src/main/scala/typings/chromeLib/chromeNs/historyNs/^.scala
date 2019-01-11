package typings
package chromeLib.chromeNs.historyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.history")
@js.native
object ^ extends js.Object {
  var onVisitRemoved: chromeLib.chromeNs.historyNs.HistoryVisitRemovedEvent = js.native
  var onVisited: chromeLib.chromeNs.historyNs.HistoryVisitedEvent = js.native
  def addUrl(details: chromeLib.chromeNs.historyNs.Url): scala.Unit = js.native
  def addUrl(details: chromeLib.chromeNs.historyNs.Url, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def deleteAll(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def deleteRange(range: chromeLib.chromeNs.historyNs.Range, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def deleteUrl(details: chromeLib.chromeNs.historyNs.Url): scala.Unit = js.native
  def deleteUrl(details: chromeLib.chromeNs.historyNs.Url, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def getVisits(
    details: chromeLib.chromeNs.historyNs.Url,
    callback: js.Function1[/* results */ js.Array[chromeLib.chromeNs.historyNs.VisitItem], scala.Unit]
  ): scala.Unit = js.native
  def search(
    query: chromeLib.chromeNs.historyNs.HistoryQuery,
    callback: js.Function1[/* results */ js.Array[chromeLib.chromeNs.historyNs.HistoryItem], scala.Unit]
  ): scala.Unit = js.native
}

