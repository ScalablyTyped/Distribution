package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangePasswordRequest extends js.Object {
  
  /**
    * The access token.
    */
  var AccessToken: TokenModelType = js.native
  
  /**
    * The old password.
    */
  var PreviousPassword: PasswordType = js.native
  
  /**
    * The new password.
    */
  var ProposedPassword: PasswordType = js.native
}
object ChangePasswordRequest {
  
  @scala.inline
  def apply(AccessToken: TokenModelType, PreviousPassword: PasswordType, ProposedPassword: PasswordType): ChangePasswordRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], PreviousPassword = PreviousPassword.asInstanceOf[js.Any], ProposedPassword = ProposedPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangePasswordRequest]
  }
  
  @scala.inline
  implicit class ChangePasswordRequestOps[Self <: ChangePasswordRequest] (val x: Self) extends AnyVal {
    
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
    def setPreviousPassword(value: PasswordType): Self = this.set("PreviousPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposedPassword(value: PasswordType): Self = this.set("ProposedPassword", value.asInstanceOf[js.Any])
  }
}
