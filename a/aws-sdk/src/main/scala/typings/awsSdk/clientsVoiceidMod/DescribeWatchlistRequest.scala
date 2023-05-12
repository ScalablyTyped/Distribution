package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWatchlistRequest extends StObject {
  
  /**
    * The identifier of the domain that contains the watchlist.
    */
  var DomainId: typings.awsSdk.clientsVoiceidMod.DomainId
  
  /**
    * The identifier of the watchlist that you are describing.
    */
  var WatchlistId: typings.awsSdk.clientsVoiceidMod.WatchlistId
}
object DescribeWatchlistRequest {
  
  inline def apply(DomainId: DomainId, WatchlistId: WatchlistId): DescribeWatchlistRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], WatchlistId = WatchlistId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWatchlistRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeWatchlistRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setWatchlistId(value: WatchlistId): Self = StObject.set(x, "WatchlistId", value.asInstanceOf[js.Any])
  }
}
