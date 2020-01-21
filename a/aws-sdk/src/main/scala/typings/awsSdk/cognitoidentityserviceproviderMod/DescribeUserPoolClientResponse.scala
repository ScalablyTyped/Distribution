package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserPoolClientResponse extends js.Object {
  /**
    * The user pool client from a server response to describe the user pool client.
    */
  var UserPoolClient: js.UndefOr[UserPoolClientType] = js.native
}

object DescribeUserPoolClientResponse {
  @scala.inline
  def apply(UserPoolClient: UserPoolClientType = null): DescribeUserPoolClientResponse = {
    val __obj = js.Dynamic.literal()
    if (UserPoolClient != null) __obj.updateDynamic("UserPoolClient")(UserPoolClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserPoolClientResponse]
  }
}

