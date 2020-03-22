package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBlueprintsRequest extends js.Object {
  /**
    * A Boolean value indicating whether to include inactive results in your request.
    */
  var includeInactive: js.UndefOr[Boolean] = js.native
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetBlueprints request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object GetBlueprintsRequest {
  @scala.inline
  def apply(includeInactive: js.UndefOr[Boolean] = js.undefined, pageToken: String = null): GetBlueprintsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeInactive)) __obj.updateDynamic("includeInactive")(includeInactive.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlueprintsRequest]
  }
}

