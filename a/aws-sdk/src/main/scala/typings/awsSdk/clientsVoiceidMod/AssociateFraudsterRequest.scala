package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateFraudsterRequest extends StObject {
  
  /**
    * The identifier of the domain that contains the fraudster.
    */
  var DomainId: typings.awsSdk.clientsVoiceidMod.DomainId
  
  /**
    * The identifier of the fraudster to be associated with the watchlist.
    */
  var FraudsterId: typings.awsSdk.clientsVoiceidMod.FraudsterId
  
  /**
    * The identifier of the watchlist you want to associate with the fraudster.
    */
  var WatchlistId: typings.awsSdk.clientsVoiceidMod.WatchlistId
}
object AssociateFraudsterRequest {
  
  inline def apply(DomainId: DomainId, FraudsterId: FraudsterId, WatchlistId: WatchlistId): AssociateFraudsterRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], FraudsterId = FraudsterId.asInstanceOf[js.Any], WatchlistId = WatchlistId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateFraudsterRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateFraudsterRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setFraudsterId(value: FraudsterId): Self = StObject.set(x, "FraudsterId", value.asInstanceOf[js.Any])
    
    inline def setWatchlistId(value: WatchlistId): Self = StObject.set(x, "WatchlistId", value.asInstanceOf[js.Any])
  }
}
