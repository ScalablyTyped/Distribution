package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminSetUserPasswordRequest extends js.Object {
  
  /**
    * The password for the user.
    */
  var Password: PasswordType = js.native
  
  /**
    *  True if the password is permanent, False if it is temporary.
    */
  var Permanent: js.UndefOr[BooleanType] = js.native
  
  /**
    * The user pool ID for the user pool where you want to set the user's password.
    */
  var UserPoolId: UserPoolIdType = js.native
  
  /**
    * The user name of the user whose password you wish to set.
    */
  var Username: UsernameType = js.native
}
object AdminSetUserPasswordRequest {
  
  @scala.inline
  def apply(Password: PasswordType, UserPoolId: UserPoolIdType, Username: UsernameType): AdminSetUserPasswordRequest = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminSetUserPasswordRequest]
  }
  
  @scala.inline
  implicit class AdminSetUserPasswordRequestOps[Self <: AdminSetUserPasswordRequest] (val x: Self) extends AnyVal {
    
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
    def setPassword(value: PasswordType): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: UsernameType): Self = this.set("Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermanent(value: BooleanType): Self = this.set("Permanent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermanent: Self = this.set("Permanent", js.undefined)
  }
}
