package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchlistDetails extends StObject {
  
  /**
    * The identifier of the default watchlist.
    */
  var DefaultWatchlistId: WatchlistId
}
object WatchlistDetails {
  
  inline def apply(DefaultWatchlistId: WatchlistId): WatchlistDetails = {
    val __obj = js.Dynamic.literal(DefaultWatchlistId = DefaultWatchlistId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchlistDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatchlistDetails] (val x: Self) extends AnyVal {
    
    inline def setDefaultWatchlistId(value: WatchlistId): Self = StObject.set(x, "DefaultWatchlistId", value.asInstanceOf[js.Any])
  }
}
