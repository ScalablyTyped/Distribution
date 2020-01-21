package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserPoolClientResponse extends js.Object {
  /**
    * The user pool client that was just created.
    */
  var UserPoolClient: js.UndefOr[UserPoolClientType] = js.native
}

object CreateUserPoolClientResponse {
  @scala.inline
  def apply(UserPoolClient: UserPoolClientType = null): CreateUserPoolClientResponse = {
    val __obj = js.Dynamic.literal()
    if (UserPoolClient != null) __obj.updateDynamic("UserPoolClient")(UserPoolClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserPoolClientResponse]
  }
}

