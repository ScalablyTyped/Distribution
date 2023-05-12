package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWatchlistResponse extends StObject {
  
  /**
    * Details about the updated watchlist.
    */
  var Watchlist: js.UndefOr[typings.awsSdk.clientsVoiceidMod.Watchlist] = js.undefined
}
object UpdateWatchlistResponse {
  
  inline def apply(): UpdateWatchlistResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWatchlistResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWatchlistResponse] (val x: Self) extends AnyVal {
    
    inline def setWatchlist(value: Watchlist): Self = StObject.set(x, "Watchlist", value.asInstanceOf[js.Any])
    
    inline def setWatchlistUndefined: Self = StObject.set(x, "Watchlist", js.undefined)
  }
}
