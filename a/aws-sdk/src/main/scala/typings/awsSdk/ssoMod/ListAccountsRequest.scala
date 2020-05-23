package typings.awsSdk.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccountsRequest extends js.Object {
  /**
    * The token issued by the CreateToken API call. For more information, see CreateToken in the AWS SSO OIDC API Reference Guide.
    */
  var accessToken: AccessTokenType = js.native
  /**
    * This is the number of items clients can request per page.
    */
  var maxResults: js.UndefOr[MaxResultType] = js.native
  /**
    * (Optional) When requesting subsequent pages, this is the page token from the previous response output.
    */
  var nextToken: js.UndefOr[NextTokenType] = js.native
}

object ListAccountsRequest {
  @scala.inline
  def apply(
    accessToken: AccessTokenType,
    maxResults: js.UndefOr[MaxResultType] = js.undefined,
    nextToken: NextTokenType = null
  ): ListAccountsRequest = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccountsRequest]
  }
}

