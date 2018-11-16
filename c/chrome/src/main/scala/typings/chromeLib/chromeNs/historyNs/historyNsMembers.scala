package typings
package chromeLib.chromeNs.historyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.history")
@js.native
object historyNsMembers extends js.Object {
  var onVisitRemoved: HistoryVisitRemovedEvent = js.native
  var onVisited: HistoryVisitedEvent = js.native
  def addUrl(details: Url): scala.Unit = js.native
  def addUrl(details: Url, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def deleteAll(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def deleteRange(range: Range, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def deleteUrl(details: Url): scala.Unit = js.native
  def deleteUrl(details: Url, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def getVisits(details: Url, callback: js.Function1[/* results */ js.Array[VisitItem], scala.Unit]): scala.Unit = js.native
  def search(query: HistoryQuery, callback: js.Function1[/* results */ js.Array[HistoryItem], scala.Unit]): scala.Unit = js.native
}

