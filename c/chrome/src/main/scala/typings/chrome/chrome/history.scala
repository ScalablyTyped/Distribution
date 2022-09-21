package typings.chrome.chrome

import typings.chrome.chrome.events.Event
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
  
  trait HistoryItem extends StObject {
    
    /** The unique identifier for the item. */
    var id: String
    
    /** Optional. When this page was last loaded, represented in milliseconds since the epoch. */
    var lastVisitTime: js.UndefOr[Double] = js.undefined
    
    /** Optional. The title of the page when it was last loaded. */
    var title: js.UndefOr[String] = js.undefined
    
    /** Optional. The number of times the user has navigated to this page by typing in the address. */
    var typedCount: js.UndefOr[Double] = js.undefined
    
    /** Optional. The URL navigated to by a user. */
    var url: js.UndefOr[String] = js.undefined
    
    /** Optional. The number of times the user has navigated to this page. */
    var visitCount: js.UndefOr[Double] = js.undefined
  }
  object HistoryItem {
    
    inline def apply(id: String): HistoryItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[HistoryItem]
    }
    
    extension [Self <: HistoryItem](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLastVisitTime(value: Double): Self = StObject.set(x, "lastVisitTime", value.asInstanceOf[js.Any])
      
      inline def setLastVisitTimeUndefined: Self = StObject.set(x, "lastVisitTime", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTypedCount(value: Double): Self = StObject.set(x, "typedCount", value.asInstanceOf[js.Any])
      
      inline def setTypedCountUndefined: Self = StObject.set(x, "typedCount", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVisitCount(value: Double): Self = StObject.set(x, "visitCount", value.asInstanceOf[js.Any])
      
      inline def setVisitCountUndefined: Self = StObject.set(x, "visitCount", js.undefined)
    }
  }
  
  trait HistoryQuery extends StObject {
    
    /** Optional. Limit results to those visited before this date, represented in milliseconds since the epoch. */
    var endTime: js.UndefOr[Double] = js.undefined
    
    /** Optional. The maximum number of results to retrieve. Defaults to 100. */
    var maxResults: js.UndefOr[Double] = js.undefined
    
    /** Optional. Limit results to those visited after this date, represented in milliseconds since the epoch. */
    var startTime: js.UndefOr[Double] = js.undefined
    
    /** A free-text query to the history service. Leave empty to retrieve all pages. */
    var text: String
  }
  object HistoryQuery {
    
    inline def apply(text: String): HistoryQuery = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[HistoryQuery]
    }
    
    extension [Self <: HistoryQuery](x: Self) {
      
      inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type HistoryVisitRemovedEvent = Event[js.Function1[/* removed */ RemovedResult, Unit]]
  
  type HistoryVisitedEvent = Event[js.Function1[/* result */ HistoryItem, Unit]]
  
  trait Range extends StObject {
    
    /** Items added to history before this date, represented in milliseconds since the epoch. */
    var endTime: Double
    
    /** Items added to history after this date, represented in milliseconds since the epoch. */
    var startTime: Double
  }
  object Range {
    
    inline def apply(endTime: Double, startTime: Double): Range = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    extension [Self <: Range](x: Self) {
      
      inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemovedResult extends StObject {
    
    /** True if all history was removed. If true, then urls will be empty. */
    var allHistory: Boolean
    
    /** Optional. */
    var urls: js.UndefOr[js.Array[String]] = js.undefined
  }
  object RemovedResult {
    
    inline def apply(allHistory: Boolean): RemovedResult = {
      val __obj = js.Dynamic.literal(allHistory = allHistory.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemovedResult]
    }
    
    extension [Self <: RemovedResult](x: Self) {
      
      inline def setAllHistory(value: Boolean): Self = StObject.set(x, "allHistory", value.asInstanceOf[js.Any])
      
      inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
      
      inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
    }
  }
  
  trait Url extends StObject {
    
    /** The URL for the operation. It must be in the format as returned from a call to history.search. */
    var url: String
  }
  object Url {
    
    inline def apply(url: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait VisitItem extends StObject {
    
    /** The unique identifier for the item. */
    var id: String
    
    /** The visit ID of the referrer. */
    var referringVisitId: String
    
    /** The transition type for this visit from its referrer. */
    var transition: String
    
    /** The unique identifier for this visit. */
    var visitId: String
    
    /** Optional. When this visit occurred, represented in milliseconds since the epoch. */
    var visitTime: js.UndefOr[Double] = js.undefined
  }
  object VisitItem {
    
    inline def apply(id: String, referringVisitId: String, transition: String, visitId: String): VisitItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], referringVisitId = referringVisitId.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], visitId = visitId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisitItem]
    }
    
    extension [Self <: VisitItem](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setReferringVisitId(value: String): Self = StObject.set(x, "referringVisitId", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setVisitId(value: String): Self = StObject.set(x, "visitId", value.asInstanceOf[js.Any])
      
      inline def setVisitTime(value: Double): Self = StObject.set(x, "visitTime", value.asInstanceOf[js.Any])
      
      inline def setVisitTimeUndefined: Self = StObject.set(x, "visitTime", js.undefined)
    }
  }
}
