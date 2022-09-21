package typings.awsSdk.voiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateSessionResponse extends StObject {
  
  /**
    * Details resulting from the authentication process, such as authentication decision and authentication score.
    */
  var AuthenticationResult: js.UndefOr[typings.awsSdk.voiceidMod.AuthenticationResult] = js.undefined
  
  /**
    * The identifier of the domain containing the session.
    */
  var DomainId: js.UndefOr[typings.awsSdk.voiceidMod.DomainId] = js.undefined
  
  /**
    * Details resulting from the fraud detection process, such as fraud detection decision and risk score.
    */
  var FraudDetectionResult: js.UndefOr[typings.awsSdk.voiceidMod.FraudDetectionResult] = js.undefined
  
  /**
    * The service-generated identifier of the session.
    */
  var SessionId: js.UndefOr[typings.awsSdk.voiceidMod.SessionId] = js.undefined
  
  /**
    * The client-provided name of the session.
    */
  var SessionName: js.UndefOr[typings.awsSdk.voiceidMod.SessionName] = js.undefined
  
  /**
    * The current status of audio streaming for this session. This field is useful to infer next steps when the Authentication or Fraud Detection results are empty or the decision is NOT_ENOUGH_SPEECH. In this situation, if the StreamingStatus is ONGOING/PENDING_CONFIGURATION, it can mean that the client should call the API again later, after Voice ID has enough audio to produce a result. If the decision remains NOT_ENOUGH_SPEECH even after StreamingStatus is ENDED, it means that the previously streamed session did not have enough speech to perform evaluation, and a new streaming session is needed to try again.
    */
  var StreamingStatus: js.UndefOr[typings.awsSdk.voiceidMod.StreamingStatus] = js.undefined
}
object EvaluateSessionResponse {
  
  inline def apply(): EvaluateSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluateSessionResponse]
  }
  
  extension [Self <: EvaluateSessionResponse](x: Self) {
    
    inline def setAuthenticationResult(value: AuthenticationResult): Self = StObject.set(x, "AuthenticationResult", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationResultUndefined: Self = StObject.set(x, "AuthenticationResult", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    inline def setFraudDetectionResult(value: FraudDetectionResult): Self = StObject.set(x, "FraudDetectionResult", value.asInstanceOf[js.Any])
    
    inline def setFraudDetectionResultUndefined: Self = StObject.set(x, "FraudDetectionResult", js.undefined)
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "SessionId", js.undefined)
    
    inline def setSessionName(value: SessionName): Self = StObject.set(x, "SessionName", value.asInstanceOf[js.Any])
    
    inline def setSessionNameUndefined: Self = StObject.set(x, "SessionName", js.undefined)
    
    inline def setStreamingStatus(value: StreamingStatus): Self = StObject.set(x, "StreamingStatus", value.asInstanceOf[js.Any])
    
    inline def setStreamingStatusUndefined: Self = StObject.set(x, "StreamingStatus", js.undefined)
  }
}
