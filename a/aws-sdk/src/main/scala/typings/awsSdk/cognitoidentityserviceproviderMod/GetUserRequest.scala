package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserRequest extends js.Object {
  /**
    * The access token returned by the server response to get information about the user.
    */
  var AccessToken: TokenModelType = js.native
}

object GetUserRequest {
  @scala.inline
  def apply(AccessToken: TokenModelType): GetUserRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetUserRequest]
  }
}

