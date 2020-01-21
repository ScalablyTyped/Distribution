package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

