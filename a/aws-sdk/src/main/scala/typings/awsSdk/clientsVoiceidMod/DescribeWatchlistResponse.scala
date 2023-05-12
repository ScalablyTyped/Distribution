package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWatchlistResponse extends StObject {
  
  /**
    * Information about the specified watchlist.
    */
  var Watchlist: js.UndefOr[typings.awsSdk.clientsVoiceidMod.Watchlist] = js.undefined
}
object DescribeWatchlistResponse {
  
  inline def apply(): DescribeWatchlistResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWatchlistResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeWatchlistResponse] (val x: Self) extends AnyVal {
    
    inline def setWatchlist(value: Watchlist): Self = StObject.set(x, "Watchlist", value.asInstanceOf[js.Any])
    
    inline def setWatchlistUndefined: Self = StObject.set(x, "Watchlist", js.undefined)
  }
}
