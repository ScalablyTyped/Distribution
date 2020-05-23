package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDevicesRequest extends js.Object {
  /**
    * The access tokens for the request to list devices.
    */
  var AccessToken: TokenModelType = js.native
  /**
    * The limit of the device request.
    */
  var Limit: js.UndefOr[QueryLimitType] = js.native
  /**
    * The pagination token for the list request.
    */
  var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.native
}

object ListDevicesRequest {
  @scala.inline
  def apply(
    AccessToken: TokenModelType,
    Limit: js.UndefOr[QueryLimitType] = js.undefined,
    PaginationToken: SearchPaginationTokenType = null
  ): ListDevicesRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDevicesRequest]
  }
}

