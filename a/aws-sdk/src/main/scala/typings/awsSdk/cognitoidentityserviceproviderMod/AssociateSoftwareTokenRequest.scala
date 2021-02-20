package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateSoftwareTokenRequest extends StObject {
  
  /**
    * The access token.
    */
  var AccessToken: js.UndefOr[TokenModelType] = js.native
  
  /**
    * The session which should be passed both ways in challenge-response calls to the service. This allows authentication of the user as part of the MFA setup process.
    */
  var Session: js.UndefOr[SessionType] = js.native
}
object AssociateSoftwareTokenRequest {
  
  @scala.inline
  def apply(): AssociateSoftwareTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateSoftwareTokenRequest]
  }
  
  @scala.inline
  implicit class AssociateSoftwareTokenRequestMutableBuilder[Self <: AssociateSoftwareTokenRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "AccessToken", js.undefined)
    
    @scala.inline
    def setSession(value: SessionType): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
  }
}
