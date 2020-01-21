package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminEnableUserRequest extends js.Object {
  /**
    * The user pool ID for the user pool where you want to enable the user.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The user name of the user you wish to enable.
    */
  var Username: UsernameType = js.native
}

object AdminEnableUserRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminEnableUserRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdminEnableUserRequest]
  }
}

