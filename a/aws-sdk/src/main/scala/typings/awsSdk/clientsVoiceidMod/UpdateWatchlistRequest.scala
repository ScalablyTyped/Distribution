package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWatchlistRequest extends StObject {
  
  /**
    * A brief description about this watchlist.
    */
  var Description: js.UndefOr[WatchlistDescription] = js.undefined
  
  /**
    * The identifier of the domain that contains the watchlist.
    */
  var DomainId: typings.awsSdk.clientsVoiceidMod.DomainId
  
  /**
    * The name of the watchlist.
    */
  var Name: js.UndefOr[WatchlistName] = js.undefined
  
  /**
    * The identifier of the watchlist to be updated.
    */
  var WatchlistId: typings.awsSdk.clientsVoiceidMod.WatchlistId
}
object UpdateWatchlistRequest {
  
  inline def apply(DomainId: DomainId, WatchlistId: WatchlistId): UpdateWatchlistRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], WatchlistId = WatchlistId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWatchlistRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWatchlistRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: WatchlistDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setName(value: WatchlistName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setWatchlistId(value: WatchlistId): Self = StObject.set(x, "WatchlistId", value.asInstanceOf[js.Any])
  }
}
