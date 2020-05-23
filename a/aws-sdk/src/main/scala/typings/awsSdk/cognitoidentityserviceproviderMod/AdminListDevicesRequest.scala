package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminListDevicesRequest extends js.Object {
  /**
    * The limit of the devices request.
    */
  var Limit: js.UndefOr[QueryLimitType] = js.native
  /**
    * The pagination token.
    */
  var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The user name.
    */
  var Username: UsernameType = js.native
}

object AdminListDevicesRequest {
  @scala.inline
  def apply(
    UserPoolId: UserPoolIdType,
    Username: UsernameType,
    Limit: js.UndefOr[QueryLimitType] = js.undefined,
    PaginationToken: SearchPaginationTokenType = null
  ): AdminListDevicesRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminListDevicesRequest]
  }
}

