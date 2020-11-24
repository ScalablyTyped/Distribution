package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateSoftwareTokenRequest extends js.Object {
  
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
  implicit class AssociateSoftwareTokenRequestOps[Self <: AssociateSoftwareTokenRequest] (val x: Self) extends AnyVal {
    
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
    def setAccessToken(value: TokenModelType): Self = this.set("AccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessToken: Self = this.set("AccessToken", js.undefined)
    
    @scala.inline
    def setSession(value: SessionType): Self = this.set("Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("Session", js.undefined)
  }
}
