package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchlistSummary extends StObject {
  
  /**
    * The timestamp of when the watchlist was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Whether the specified watchlist is the default watchlist of a domain.
    */
  var DefaultWatchlist: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The description of the watchlist.
    */
  var Description: js.UndefOr[WatchlistDescription] = js.undefined
  
  /**
    * The identifier of the domain that contains the watchlist.
    */
  var DomainId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.DomainId] = js.undefined
  
  /**
    * The name for the watchlist.
    */
  var Name: js.UndefOr[WatchlistName] = js.undefined
  
  /**
    * The timestamp of when the watchlist was last updated.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the watchlist.
    */
  var WatchlistId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.WatchlistId] = js.undefined
}
object WatchlistSummary {
  
  inline def apply(): WatchlistSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchlistSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatchlistSummary] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDefaultWatchlist(value: Boolean): Self = StObject.set(x, "DefaultWatchlist", value.asInstanceOf[js.Any])
    
    inline def setDefaultWatchlistUndefined: Self = StObject.set(x, "DefaultWatchlist", js.undefined)
    
    inline def setDescription(value: WatchlistDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    inline def setName(value: WatchlistName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
    
    inline def setWatchlistId(value: WatchlistId): Self = StObject.set(x, "WatchlistId", value.asInstanceOf[js.Any])
    
    inline def setWatchlistIdUndefined: Self = StObject.set(x, "WatchlistId", js.undefined)
  }
}
