package typings.chrome.anon

import typings.chrome.chrome.history.HistoryItem
import typings.chrome.chrome.history.HistoryQuery
import typings.chrome.chrome.history.HistoryVisitRemovedEvent
import typings.chrome.chrome.history.HistoryVisitedEvent
import typings.chrome.chrome.history.Range
import typings.chrome.chrome.history.Url
import typings.chrome.chrome.history.VisitItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofhistory extends StObject {
  
  def addUrl(details: Url): Unit = js.native
  def addUrl(details: Url, callback: js.Function0[Unit]): Unit = js.native
  @JSName("addUrl")
  def addUrl_Promise(details: Url): js.Promise[Unit] = js.native
  
  def deleteAll(): js.Promise[Unit] = js.native
  def deleteAll(callback: js.Function0[Unit]): Unit = js.native
  
  def deleteRange(range: Range): Unit = js.native
  def deleteRange(range: Range, callback: js.Function0[Unit]): Unit = js.native
  @JSName("deleteRange")
  def deleteRange_Promise(range: Range): js.Promise[Unit] = js.native
  
  def deleteUrl(details: Url): Unit = js.native
  def deleteUrl(details: Url, callback: js.Function0[Unit]): Unit = js.native
  @JSName("deleteUrl")
  def deleteUrl_Promise(details: Url): js.Promise[Unit] = js.native
  
  def getVisits(details: Url): js.Promise[js.Array[VisitItem]] = js.native
  def getVisits(details: Url, callback: js.Function1[/* results */ js.Array[VisitItem], Unit]): Unit = js.native
  
  var onVisitRemoved: HistoryVisitRemovedEvent = js.native
  
  var onVisited: HistoryVisitedEvent = js.native
  
  def search(query: HistoryQuery): Unit = js.native
  def search(query: HistoryQuery, callback: js.Function1[/* results */ js.Array[HistoryItem], Unit]): Unit = js.native
  @JSName("search")
  def search_Promise(query: HistoryQuery): js.Promise[js.Array[HistoryItem]] = js.native
}
