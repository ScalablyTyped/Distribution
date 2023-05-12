package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FraudsterSummary extends StObject {
  
  /**
    * The timestamp of when the fraudster summary was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the domain that contains the fraudster summary.
    */
  var DomainId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.DomainId] = js.undefined
  
  /**
    * The service-generated identifier for the fraudster.
    */
  var GeneratedFraudsterId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.GeneratedFraudsterId] = js.undefined
  
  /**
    * The identifier of the watchlists the fraudster is a part of.
    */
  var WatchlistIds: js.UndefOr[ResponseWatchlistIds] = js.undefined
}
object FraudsterSummary {
  
  inline def apply(): FraudsterSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FraudsterSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FraudsterSummary] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    inline def setGeneratedFraudsterId(value: GeneratedFraudsterId): Self = StObject.set(x, "GeneratedFraudsterId", value.asInstanceOf[js.Any])
    
    inline def setGeneratedFraudsterIdUndefined: Self = StObject.set(x, "GeneratedFraudsterId", js.undefined)
    
    inline def setWatchlistIds(value: ResponseWatchlistIds): Self = StObject.set(x, "WatchlistIds", value.asInstanceOf[js.Any])
    
    inline def setWatchlistIdsUndefined: Self = StObject.set(x, "WatchlistIds", js.undefined)
    
    inline def setWatchlistIdsVarargs(value: WatchlistId*): Self = StObject.set(x, "WatchlistIds", js.Array(value*))
  }
}
