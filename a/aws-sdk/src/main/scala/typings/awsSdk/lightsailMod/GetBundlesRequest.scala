package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBundlesRequest extends js.Object {
  /**
    * A Boolean value that indicates whether to include inactive bundle results in your request.
    */
  var includeInactive: js.UndefOr[Boolean] = js.native
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetBundles request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object GetBundlesRequest {
  @scala.inline
  def apply(includeInactive: js.UndefOr[Boolean] = js.undefined, pageToken: String = null): GetBundlesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeInactive)) __obj.updateDynamic("includeInactive")(includeInactive.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBundlesRequest]
  }
}

