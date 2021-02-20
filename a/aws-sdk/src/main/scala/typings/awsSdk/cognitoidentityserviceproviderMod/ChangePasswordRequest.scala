package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangePasswordRequest extends StObject {
  
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
  implicit class ChangePasswordRequestMutableBuilder[Self <: ChangePasswordRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousPassword(value: PasswordType): Self = StObject.set(x, "PreviousPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposedPassword(value: PasswordType): Self = StObject.set(x, "ProposedPassword", value.asInstanceOf[js.Any])
  }
}
