package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourceServersRequest extends js.Object {
  /**
    * The maximum number of resource servers to return.
    */
  var MaxResults: js.UndefOr[ListResourceServersLimitType] = js.native
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.native
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object ListResourceServersRequest {
  @scala.inline
  def apply(
    UserPoolId: UserPoolIdType,
    MaxResults: js.UndefOr[ListResourceServersLimitType] = js.undefined,
    NextToken: PaginationKeyType = null
  ): ListResourceServersRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceServersRequest]
  }
}

