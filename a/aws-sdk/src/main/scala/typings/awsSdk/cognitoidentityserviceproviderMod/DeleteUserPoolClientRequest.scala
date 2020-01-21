package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserPoolClientRequest extends js.Object {
  /**
    * The app client ID of the app associated with the user pool.
    */
  var ClientId: ClientIdType = js.native
  /**
    * The user pool ID for the user pool where you want to delete the client.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object DeleteUserPoolClientRequest {
  @scala.inline
  def apply(ClientId: ClientIdType, UserPoolId: UserPoolIdType): DeleteUserPoolClientRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteUserPoolClientRequest]
  }
}

