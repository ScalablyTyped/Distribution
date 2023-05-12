package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWatchlistRequest extends StObject {
  
  /**
    * The identifier of the domain that contains the watchlist.
    */
  var DomainId: typings.awsSdk.clientsVoiceidMod.DomainId
  
  /**
    * The identifier of the watchlist to be deleted.
    */
  var WatchlistId: typings.awsSdk.clientsVoiceidMod.WatchlistId
}
object DeleteWatchlistRequest {
  
  inline def apply(DomainId: DomainId, WatchlistId: WatchlistId): DeleteWatchlistRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], WatchlistId = WatchlistId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWatchlistRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteWatchlistRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setWatchlistId(value: WatchlistId): Self = StObject.set(x, "WatchlistId", value.asInstanceOf[js.Any])
  }
}
