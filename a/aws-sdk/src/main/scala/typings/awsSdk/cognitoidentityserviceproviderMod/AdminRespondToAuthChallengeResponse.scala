package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminRespondToAuthChallengeResponse extends StObject {
  
  /**
    * The result returned by the server in response to the authentication request.
    */
  var AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.undefined
  
  /**
    * The name of the challenge. For more information, see AdminInitiateAuth.
    */
  var ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined
  
  /**
    * The challenge parameters. For more information, see AdminInitiateAuth.
    */
  var ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.undefined
  
  /**
    * The session that should be passed both ways in challenge-response calls to the service. If the caller must pass another challenge, they return a session with other challenge parameters. This session should be passed as it is to the next RespondToAuthChallenge API call.
    */
  var Session: js.UndefOr[SessionType] = js.undefined
}
object AdminRespondToAuthChallengeResponse {
  
  inline def apply(): AdminRespondToAuthChallengeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminRespondToAuthChallengeResponse]
  }
  
  extension [Self <: AdminRespondToAuthChallengeResponse](x: Self) {
    
    inline def setAuthenticationResult(value: AuthenticationResultType): Self = StObject.set(x, "AuthenticationResult", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationResultUndefined: Self = StObject.set(x, "AuthenticationResult", js.undefined)
    
    inline def setChallengeName(value: ChallengeNameType): Self = StObject.set(x, "ChallengeName", value.asInstanceOf[js.Any])
    
    inline def setChallengeNameUndefined: Self = StObject.set(x, "ChallengeName", js.undefined)
    
    inline def setChallengeParameters(value: ChallengeParametersType): Self = StObject.set(x, "ChallengeParameters", value.asInstanceOf[js.Any])
    
    inline def setChallengeParametersUndefined: Self = StObject.set(x, "ChallengeParameters", js.undefined)
    
    inline def setSession(value: SessionType): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
  }
}
