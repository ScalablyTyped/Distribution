package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWatchlistsResponse extends StObject {
  
  /**
    * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list that contains details about each watchlist in the Amazon Web Services account. 
    */
  var WatchlistSummaries: js.UndefOr[typings.awsSdk.clientsVoiceidMod.WatchlistSummaries] = js.undefined
}
object ListWatchlistsResponse {
  
  inline def apply(): ListWatchlistsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWatchlistsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWatchlistsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWatchlistSummaries(value: WatchlistSummaries): Self = StObject.set(x, "WatchlistSummaries", value.asInstanceOf[js.Any])
    
    inline def setWatchlistSummariesUndefined: Self = StObject.set(x, "WatchlistSummaries", js.undefined)
    
    inline def setWatchlistSummariesVarargs(value: WatchlistSummary*): Self = StObject.set(x, "WatchlistSummaries", js.Array(value*))
  }
}
