package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FraudDetectionResult extends StObject {
  
  /**
    * A timestamp indicating when audio aggregation ended for this fraud detection result.
    */
  var AudioAggregationEndedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A timestamp indicating when audio aggregation started for this fraud detection result.
    */
  var AudioAggregationStartedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The FraudDetectionConfiguration used to generate this fraud detection result.
    */
  var Configuration: js.UndefOr[FraudDetectionConfiguration] = js.undefined
  
  /**
    * The fraud detection decision produced by Voice ID, processed against the current session state and streamed audio of the speaker.
    */
  var Decision: js.UndefOr[FraudDetectionDecision] = js.undefined
  
  /**
    * The unique identifier for this fraud detection result. Given there can be multiple fraud detections for a given session, this field helps in identifying if the returned result is from previous streaming activity or a new result. Note that in the absence of any new streaming activity or risk threshold changes, Voice ID always returns cached Fraud Detection result for this API.
    */
  var FraudDetectionResultId: js.UndefOr[UniqueIdLarge] = js.undefined
  
  /**
    * The reason speaker was flagged by the fraud detection system. This is only be populated if fraud detection Decision is HIGH_RISK, and the following possible values: KNOWN_FRAUDSTER and VOICE_SPOOFING.
    */
  var Reasons: js.UndefOr[FraudDetectionReasons] = js.undefined
  
  /**
    * Details about each risk analyzed for this speaker. Currently, this contains KnownFraudsterRisk and VoiceSpoofingRisk details.
    */
  var RiskDetails: js.UndefOr[FraudRiskDetails] = js.undefined
}
object FraudDetectionResult {
  
  inline def apply(): FraudDetectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FraudDetectionResult]
  }
  
  extension [Self <: FraudDetectionResult](x: Self) {
    
    inline def setAudioAggregationEndedAt(value: js.Date): Self = StObject.set(x, "AudioAggregationEndedAt", value.asInstanceOf[js.Any])
    
    inline def setAudioAggregationEndedAtUndefined: Self = StObject.set(x, "AudioAggregationEndedAt", js.undefined)
    
    inline def setAudioAggregationStartedAt(value: js.Date): Self = StObject.set(x, "AudioAggregationStartedAt", value.asInstanceOf[js.Any])
    
    inline def setAudioAggregationStartedAtUndefined: Self = StObject.set(x, "AudioAggregationStartedAt", js.undefined)
    
    inline def setConfiguration(value: FraudDetectionConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setDecision(value: FraudDetectionDecision): Self = StObject.set(x, "Decision", value.asInstanceOf[js.Any])
    
    inline def setDecisionUndefined: Self = StObject.set(x, "Decision", js.undefined)
    
    inline def setFraudDetectionResultId(value: UniqueIdLarge): Self = StObject.set(x, "FraudDetectionResultId", value.asInstanceOf[js.Any])
    
    inline def setFraudDetectionResultIdUndefined: Self = StObject.set(x, "FraudDetectionResultId", js.undefined)
    
    inline def setReasons(value: FraudDetectionReasons): Self = StObject.set(x, "Reasons", value.asInstanceOf[js.Any])
    
    inline def setReasonsUndefined: Self = StObject.set(x, "Reasons", js.undefined)
    
    inline def setReasonsVarargs(value: FraudDetectionReason*): Self = StObject.set(x, "Reasons", js.Array(value*))
    
    inline def setRiskDetails(value: FraudRiskDetails): Self = StObject.set(x, "RiskDetails", value.asInstanceOf[js.Any])
    
    inline def setRiskDetailsUndefined: Self = StObject.set(x, "RiskDetails", js.undefined)
  }
}
