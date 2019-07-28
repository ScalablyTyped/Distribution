package typings.chrome

import typings.chrome.chromeNs.historyNs.HistoryItem
import typings.chrome.chromeNs.historyNs.HistoryQuery
import typings.chrome.chromeNs.historyNs.HistoryVisitRemovedEvent
import typings.chrome.chromeNs.historyNs.HistoryVisitedEvent
import typings.chrome.chromeNs.historyNs.Range
import typings.chrome.chromeNs.historyNs.Url
import typings.chrome.chromeNs.historyNs.VisitItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofhistory extends js.Object {
  var onVisitRemoved: HistoryVisitRemovedEvent = js.native
  var onVisited: HistoryVisitedEvent = js.native
  def addUrl(details: Url): Unit = js.native
  def addUrl(details: Url, callback: js.Function0[Unit]): Unit = js.native
  def deleteAll(callback: js.Function0[Unit]): Unit = js.native
  def deleteRange(range: Range, callback: js.Function0[Unit]): Unit = js.native
  def deleteUrl(details: Url): Unit = js.native
  def deleteUrl(details: Url, callback: js.Function0[Unit]): Unit = js.native
  def getVisits(details: Url, callback: js.Function1[/* results */ js.Array[VisitItem], Unit]): Unit = js.native
  def search(query: HistoryQuery, callback: js.Function1[/* results */ js.Array[HistoryItem], Unit]): Unit = js.native
}

