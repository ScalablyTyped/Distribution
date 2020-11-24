package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateSoftwareTokenResponse extends js.Object {
  
  /**
    * A unique generated shared secret code that is used in the TOTP algorithm to generate a one time code.
    */
  var SecretCode: js.UndefOr[SecretCodeType] = js.native
  
  /**
    * The session which should be passed both ways in challenge-response calls to the service. This allows authentication of the user as part of the MFA setup process.
    */
  var Session: js.UndefOr[SessionType] = js.native
}
object AssociateSoftwareTokenResponse {
  
  @scala.inline
  def apply(): AssociateSoftwareTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateSoftwareTokenResponse]
  }
  
  @scala.inline
  implicit class AssociateSoftwareTokenResponseOps[Self <: AssociateSoftwareTokenResponse] (val x: Self) extends AnyVal {
    
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
    def setSecretCode(value: SecretCodeType): Self = this.set("SecretCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretCode: Self = this.set("SecretCode", js.undefined)
    
    @scala.inline
    def setSession(value: SessionType): Self = this.set("Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("Session", js.undefined)
  }
}
