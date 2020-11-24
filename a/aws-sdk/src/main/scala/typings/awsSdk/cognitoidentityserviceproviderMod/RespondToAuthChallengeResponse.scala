package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RespondToAuthChallengeResponse extends js.Object {
  
  /**
    * The result returned by the server in response to the request to respond to the authentication challenge.
    */
  var AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.native
  
  /**
    * The challenge name. For more information, see InitiateAuth.
    */
  var ChallengeName: js.UndefOr[ChallengeNameType] = js.native
  
  /**
    * The challenge parameters. For more information, see InitiateAuth.
    */
  var ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.native
  
  /**
    * The session which should be passed both ways in challenge-response calls to the service. If the caller needs to go through another challenge, they return a session with other challenge parameters. This session should be passed as it is to the next RespondToAuthChallenge API call.
    */
  var Session: js.UndefOr[SessionType] = js.native
}
object RespondToAuthChallengeResponse {
  
  @scala.inline
  def apply(): RespondToAuthChallengeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RespondToAuthChallengeResponse]
  }
  
  @scala.inline
  implicit class RespondToAuthChallengeResponseOps[Self <: RespondToAuthChallengeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthenticationResult(value: AuthenticationResultType): Self = this.set("AuthenticationResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationResult: Self = this.set("AuthenticationResult", js.undefined)
    
    @scala.inline
    def setChallengeName(value: ChallengeNameType): Self = this.set("ChallengeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChallengeName: Self = this.set("ChallengeName", js.undefined)
    
    @scala.inline
    def setChallengeParameters(value: ChallengeParametersType): Self = this.set("ChallengeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChallengeParameters: Self = this.set("ChallengeParameters", js.undefined)
    
    @scala.inline
    def setSession(value: SessionType): Self = this.set("Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("Session", js.undefined)
  }
}
