package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSigningPlatformsRequest extends js.Object {
  /**
    * The category type of a signing platform.
    */
  var category: js.UndefOr[String] = js.native
  /**
    * The maximum number of results to be returned by this operation.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * Value for specifying the next set of paginated results to return. After you receive a response with truncated results, use this parameter in a subsequent request. Set it to the value of nextToken from the response that you just received.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * Any partner entities connected to a signing platform.
    */
  var partner: js.UndefOr[String] = js.native
  /**
    * The validation template that is used by the target signing platform.
    */
  var target: js.UndefOr[String] = js.native
}

object ListSigningPlatformsRequest {
  @scala.inline
  def apply(
    category: String = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: String = null,
    partner: String = null,
    target: String = null
  ): ListSigningPlatformsRequest = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (partner != null) __obj.updateDynamic("partner")(partner.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSigningPlatformsRequest]
  }
}

