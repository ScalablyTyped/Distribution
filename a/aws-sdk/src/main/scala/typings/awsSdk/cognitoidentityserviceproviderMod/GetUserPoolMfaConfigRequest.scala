package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserPoolMfaConfigRequest extends js.Object {
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object GetUserPoolMfaConfigRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): GetUserPoolMfaConfigRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserPoolMfaConfigRequest]
  }
}

