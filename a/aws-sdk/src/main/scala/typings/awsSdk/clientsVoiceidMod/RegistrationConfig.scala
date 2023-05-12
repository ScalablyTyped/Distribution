package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegistrationConfig extends StObject {
  
  /**
    * The action to take when a fraudster is identified as a duplicate. The default action is SKIP, which skips registering the duplicate fraudster. Setting the value to REGISTER_AS_NEW always registers a new fraudster into the specified domain.
    */
  var DuplicateRegistrationAction: js.UndefOr[typings.awsSdk.clientsVoiceidMod.DuplicateRegistrationAction] = js.undefined
  
  /**
    * The minimum similarity score between the new and old fraudsters in order to consider the new fraudster a duplicate.
    */
  var FraudsterSimilarityThreshold: js.UndefOr[Score] = js.undefined
  
  /**
    * The identifiers of watchlists that a fraudster is registered to. If a watchlist isn't provided, the fraudsters are registered to the default watchlist. 
    */
  var WatchlistIds: js.UndefOr[RegistrationConfigWatchlistIds] = js.undefined
}
object RegistrationConfig {
  
  inline def apply(): RegistrationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistrationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegistrationConfig] (val x: Self) extends AnyVal {
    
    inline def setDuplicateRegistrationAction(value: DuplicateRegistrationAction): Self = StObject.set(x, "DuplicateRegistrationAction", value.asInstanceOf[js.Any])
    
    inline def setDuplicateRegistrationActionUndefined: Self = StObject.set(x, "DuplicateRegistrationAction", js.undefined)
    
    inline def setFraudsterSimilarityThreshold(value: Score): Self = StObject.set(x, "FraudsterSimilarityThreshold", value.asInstanceOf[js.Any])
    
    inline def setFraudsterSimilarityThresholdUndefined: Self = StObject.set(x, "FraudsterSimilarityThreshold", js.undefined)
    
    inline def setWatchlistIds(value: RegistrationConfigWatchlistIds): Self = StObject.set(x, "WatchlistIds", value.asInstanceOf[js.Any])
    
    inline def setWatchlistIdsUndefined: Self = StObject.set(x, "WatchlistIds", js.undefined)
    
    inline def setWatchlistIdsVarargs(value: WatchlistId*): Self = StObject.set(x, "WatchlistIds", js.Array(value*))
  }
}
