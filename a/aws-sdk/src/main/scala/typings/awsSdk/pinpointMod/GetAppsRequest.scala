package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppsRequest extends js.Object {
  /**
    * The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics.
    */
  var PageSize: js.UndefOr[string] = js.native
  /**
    * The NextToken string that specifies which page of results to return in a paginated response.
    */
  var Token: js.UndefOr[string] = js.native
}

object GetAppsRequest {
  @scala.inline
  def apply(PageSize: string = null, Token: string = null): GetAppsRequest = {
    val __obj = js.Dynamic.literal()
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    if (Token != null) __obj.updateDynamic("Token")(Token.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppsRequest]
  }
}

