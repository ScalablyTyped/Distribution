package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationResult extends StObject {
  
  /**
    * A timestamp indicating when audio aggregation ended for this authentication result.
    */
  var AudioAggregationEndedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A timestamp indicating when audio aggregation started for this authentication result.
    */
  var AudioAggregationStartedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique identifier for this authentication result. Because there can be multiple authentications for a given session, this field helps to identify if the returned result is from a previous streaming activity or a new result. Note that in absence of any new streaming activity, AcceptanceThreshold changes, or SpeakerId changes, Voice ID always returns cached Authentication Result for this API.
    */
  var AuthenticationResultId: js.UndefOr[UniqueIdLarge] = js.undefined
  
  /**
    * The AuthenticationConfiguration used to generate this authentication result.
    */
  var Configuration: js.UndefOr[AuthenticationConfiguration] = js.undefined
  
  /**
    * The client-provided identifier for the speaker whose authentication result is produced. Only present if a SpeakerId is provided for the session.
    */
  var CustomerSpeakerId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.CustomerSpeakerId] = js.undefined
  
  /**
    * The authentication decision produced by Voice ID, processed against the current session state and streamed audio of the speaker.
    */
  var Decision: js.UndefOr[AuthenticationDecision] = js.undefined
  
  /**
    * The service-generated identifier for the speaker whose authentication result is produced.
    */
  var GeneratedSpeakerId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.GeneratedSpeakerId] = js.undefined
  
  /**
    * The authentication score for the speaker whose authentication result is produced. This value is only present if the authentication decision is either ACCEPT or REJECT.
    */
  var Score: js.UndefOr[typings.awsSdk.clientsVoiceidMod.Score] = js.undefined
}
object AuthenticationResult {
  
  inline def apply(): AuthenticationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationResult]
  }
  
  extension [Self <: AuthenticationResult](x: Self) {
    
    inline def setAudioAggregationEndedAt(value: js.Date): Self = StObject.set(x, "AudioAggregationEndedAt", value.asInstanceOf[js.Any])
    
    inline def setAudioAggregationEndedAtUndefined: Self = StObject.set(x, "AudioAggregationEndedAt", js.undefined)
    
    inline def setAudioAggregationStartedAt(value: js.Date): Self = StObject.set(x, "AudioAggregationStartedAt", value.asInstanceOf[js.Any])
    
    inline def setAudioAggregationStartedAtUndefined: Self = StObject.set(x, "AudioAggregationStartedAt", js.undefined)
    
    inline def setAuthenticationResultId(value: UniqueIdLarge): Self = StObject.set(x, "AuthenticationResultId", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationResultIdUndefined: Self = StObject.set(x, "AuthenticationResultId", js.undefined)
    
    inline def setConfiguration(value: AuthenticationConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setCustomerSpeakerId(value: CustomerSpeakerId): Self = StObject.set(x, "CustomerSpeakerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerSpeakerIdUndefined: Self = StObject.set(x, "CustomerSpeakerId", js.undefined)
    
    inline def setDecision(value: AuthenticationDecision): Self = StObject.set(x, "Decision", value.asInstanceOf[js.Any])
    
    inline def setDecisionUndefined: Self = StObject.set(x, "Decision", js.undefined)
    
    inline def setGeneratedSpeakerId(value: GeneratedSpeakerId): Self = StObject.set(x, "GeneratedSpeakerId", value.asInstanceOf[js.Any])
    
    inline def setGeneratedSpeakerIdUndefined: Self = StObject.set(x, "GeneratedSpeakerId", js.undefined)
    
    inline def setScore(value: Score): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
  }
}
