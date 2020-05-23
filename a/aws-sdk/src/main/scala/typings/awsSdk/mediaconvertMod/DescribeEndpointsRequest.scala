package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointsRequest extends js.Object {
  /**
    * Optional. Max number of endpoints, up to twenty, that will be returned at one time.
    */
  var MaxResults: js.UndefOr[integer] = js.native
  /**
    * Optional field, defaults to DEFAULT. Specify DEFAULT for this operation to return your endpoints if any exist, or to create an endpoint for you and return it if one doesn't already exist. Specify GET_ONLY to return your endpoints if any exist, or an empty list if none exist.
    */
  var Mode: js.UndefOr[DescribeEndpointsMode] = js.native
  /**
    * Use this string, provided with the response to a previous request, to request the next batch of endpoints.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object DescribeEndpointsRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[integer] = js.undefined,
    Mode: DescribeEndpointsMode = null,
    NextToken: string = null
  ): DescribeEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointsRequest]
  }
}

