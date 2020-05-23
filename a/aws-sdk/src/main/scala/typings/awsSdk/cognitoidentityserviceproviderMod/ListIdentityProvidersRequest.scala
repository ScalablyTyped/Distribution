package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIdentityProvidersRequest extends js.Object {
  /**
    * The maximum number of identity providers to return.
    */
  var MaxResults: js.UndefOr[ListProvidersLimitType] = js.native
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object ListIdentityProvidersRequest {
  @scala.inline
  def apply(
    UserPoolId: UserPoolIdType,
    MaxResults: js.UndefOr[ListProvidersLimitType] = js.undefined,
    NextToken: PaginationKeyType = null
  ): ListIdentityProvidersRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityProvidersRequest]
  }
}

