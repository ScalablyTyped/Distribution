package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RespondToAuthChallengeResponse extends StObject {
  
  /**
    * The result returned by the server in response to the request to respond to the authentication challenge.
    */
  var AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.undefined
  
  /**
    * The challenge name. For more information, see InitiateAuth.
    */
  var ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined
  
  /**
    * The challenge parameters. For more information, see InitiateAuth.
    */
  var ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.undefined
  
  /**
    * The session which should be passed both ways in challenge-response calls to the service. If the caller needs to go through another challenge, they return a session with other challenge parameters. This session should be passed as it is to the next RespondToAuthChallenge API call.
    */
  var Session: js.UndefOr[SessionType] = js.undefined
}
object RespondToAuthChallengeResponse {
  
  @scala.inline
  def apply(): RespondToAuthChallengeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RespondToAuthChallengeResponse]
  }
  
  @scala.inline
  implicit class RespondToAuthChallengeResponseMutableBuilder[Self <: RespondToAuthChallengeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationResult(value: AuthenticationResultType): Self = StObject.set(x, "AuthenticationResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationResultUndefined: Self = StObject.set(x, "AuthenticationResult", js.undefined)
    
    @scala.inline
    def setChallengeName(value: ChallengeNameType): Self = StObject.set(x, "ChallengeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChallengeNameUndefined: Self = StObject.set(x, "ChallengeName", js.undefined)
    
    @scala.inline
    def setChallengeParameters(value: ChallengeParametersType): Self = StObject.set(x, "ChallengeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChallengeParametersUndefined: Self = StObject.set(x, "ChallengeParameters", js.undefined)
    
    @scala.inline
    def setSession(value: SessionType): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
  }
}
