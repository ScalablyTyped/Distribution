package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait History extends StObject {
  
  /**
    * The list of history events.
    */
  var events: HistoryEventList
  
  /**
    * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
    */
  var nextPageToken: js.UndefOr[PageToken] = js.undefined
}
object History {
  
  inline def apply(events: HistoryEventList): History = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[History]
  }
  
  extension [Self <: History](x: Self) {
    
    inline def setEvents(value: HistoryEventList): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: HistoryEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
