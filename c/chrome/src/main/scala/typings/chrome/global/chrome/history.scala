package typings.chrome.global.chrome

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

////////////////////
// History
////////////////////
/**
  * Use the chrome.history API to interact with the browser's record of visited pages. You can add, remove, and query for URLs in the browser's history. To override the history page with your own version, see Override Pages.
  * Availability: Since Chrome 5.
  * Permissions:  "history"
  */
object history {
  
  @JSGlobal("chrome.history")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addUrl(details: Url): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addUrl")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def addUrl(details: Url, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addUrl")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deleteAll(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAll")().asInstanceOf[js.Promise[Unit]]
  inline def deleteAll(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAll")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def deleteRange(range: Range): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteRange")(range.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def deleteRange(range: Range, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteRange")(range.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deleteUrl(details: Url): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteUrl")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def deleteUrl(details: Url, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteUrl")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getVisits(details: Url): js.Promise[js.Array[VisitItem]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisits")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[VisitItem]]]
  inline def getVisits(details: Url, callback: js.Function1[/* results */ js.Array[VisitItem], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getVisits")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("chrome.history.onVisitRemoved")
  @js.native
  def onVisitRemoved: HistoryVisitRemovedEvent = js.native
  inline def onVisitRemoved_=(x: HistoryVisitRemovedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onVisitRemoved")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.history.onVisited")
  @js.native
  def onVisited: HistoryVisitedEvent = js.native
  inline def onVisited_=(x: HistoryVisitedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onVisited")(x.asInstanceOf[js.Any])
  
  inline def search(query: HistoryQuery): js.Promise[js.Array[HistoryItem]] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[HistoryItem]]]
  inline def search(query: HistoryQuery, callback: js.Function1[/* results */ js.Array[HistoryItem], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
