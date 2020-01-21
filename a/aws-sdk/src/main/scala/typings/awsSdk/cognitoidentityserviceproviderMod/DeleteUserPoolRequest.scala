package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserPoolRequest extends js.Object {
  /**
    * The user pool ID for the user pool you want to delete.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object DeleteUserPoolRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): DeleteUserPoolRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteUserPoolRequest]
  }
}

