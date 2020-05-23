package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTerminologiesRequest extends js.Object {
  /**
    * The maximum number of custom terminologies returned per list request.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.native
  /**
    * If the result of the request to ListTerminologies was truncated, include the NextToken to fetch the next group of custom terminologies. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.translateMod.NextToken] = js.native
}

object ListTerminologiesRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined, NextToken: NextToken = null): ListTerminologiesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTerminologiesRequest]
  }
}

