package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserPoolClientsRequest extends js.Object {
  /**
    * The maximum number of results you want the request to return when listing the user pool clients.
    */
  var MaxResults: js.UndefOr[QueryLimit] = js.native
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
  /**
    * The user pool ID for the user pool where you want to list user pool clients.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object ListUserPoolClientsRequest {
  @scala.inline
  def apply(
    UserPoolId: UserPoolIdType,
    MaxResults: js.UndefOr[QueryLimit] = js.undefined,
    NextToken: PaginationKey = null
  ): ListUserPoolClientsRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserPoolClientsRequest]
  }
}

