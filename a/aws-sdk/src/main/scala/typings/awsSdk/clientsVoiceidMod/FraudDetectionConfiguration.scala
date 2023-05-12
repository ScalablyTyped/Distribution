package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FraudDetectionConfiguration extends StObject {
  
  /**
    * Threshold value for determining whether the speaker is a fraudster. If the detected risk score calculated by Voice ID is higher than the threshold, the speaker is considered a fraudster.
    */
  var RiskThreshold: js.UndefOr[Score] = js.undefined
  
  /**
    * The identifier of the watchlist against which fraud detection is performed. 
    */
  var WatchlistId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.WatchlistId] = js.undefined
}
object FraudDetectionConfiguration {
  
  inline def apply(): FraudDetectionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FraudDetectionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FraudDetectionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setRiskThreshold(value: Score): Self = StObject.set(x, "RiskThreshold", value.asInstanceOf[js.Any])
    
    inline def setRiskThresholdUndefined: Self = StObject.set(x, "RiskThreshold", js.undefined)
    
    inline def setWatchlistId(value: WatchlistId): Self = StObject.set(x, "WatchlistId", value.asInstanceOf[js.Any])
    
    inline def setWatchlistIdUndefined: Self = StObject.set(x, "WatchlistId", js.undefined)
  }
}
