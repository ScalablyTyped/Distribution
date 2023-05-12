package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrollmentJobFraudDetectionConfig extends StObject {
  
  /**
    * The action to take when the given speaker is flagged by the fraud detection system. The default value is FAIL, which fails the speaker enrollment. Changing this value to IGNORE results in the speaker being enrolled even if they are flagged by the fraud detection system.
    */
  var FraudDetectionAction: js.UndefOr[typings.awsSdk.clientsVoiceidMod.FraudDetectionAction] = js.undefined
  
  /**
    * Threshold value for determining whether the speaker is a high risk to be fraudulent. If the detected risk score calculated by Voice ID is greater than or equal to the threshold, the speaker is considered a fraudster.
    */
  var RiskThreshold: js.UndefOr[Score] = js.undefined
  
  /**
    * The identifier of watchlists against which fraud detection is performed. 
    */
  var WatchlistIds: js.UndefOr[EnrollmentJobFraudDetectionConfigWatchlistIds] = js.undefined
}
object EnrollmentJobFraudDetectionConfig {
  
  inline def apply(): EnrollmentJobFraudDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnrollmentJobFraudDetectionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnrollmentJobFraudDetectionConfig] (val x: Self) extends AnyVal {
    
    inline def setFraudDetectionAction(value: FraudDetectionAction): Self = StObject.set(x, "FraudDetectionAction", value.asInstanceOf[js.Any])
    
    inline def setFraudDetectionActionUndefined: Self = StObject.set(x, "FraudDetectionAction", js.undefined)
    
    inline def setRiskThreshold(value: Score): Self = StObject.set(x, "RiskThreshold", value.asInstanceOf[js.Any])
    
    inline def setRiskThresholdUndefined: Self = StObject.set(x, "RiskThreshold", js.undefined)
    
    inline def setWatchlistIds(value: EnrollmentJobFraudDetectionConfigWatchlistIds): Self = StObject.set(x, "WatchlistIds", value.asInstanceOf[js.Any])
    
    inline def setWatchlistIdsUndefined: Self = StObject.set(x, "WatchlistIds", js.undefined)
    
    inline def setWatchlistIdsVarargs(value: WatchlistId*): Self = StObject.set(x, "WatchlistIds", js.Array(value*))
  }
}
