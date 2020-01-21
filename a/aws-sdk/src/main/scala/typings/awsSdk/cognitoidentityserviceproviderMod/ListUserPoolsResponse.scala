package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserPoolsResponse extends js.Object {
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.native
  /**
    * The user pools from the response to list users.
    */
  var UserPools: js.UndefOr[UserPoolListType] = js.native
}

object ListUserPoolsResponse {
  @scala.inline
  def apply(NextToken: PaginationKeyType = null, UserPools: UserPoolListType = null): ListUserPoolsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (UserPools != null) __obj.updateDynamic("UserPools")(UserPools.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserPoolsResponse]
  }
}

