package typings.awsSdk.mediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPlaybackConfigurationsRequest extends js.Object {
  /**
    * Maximum number of records to return. 
    */
  var MaxResults: js.UndefOr[integerMin1Max100] = js.native
  /**
    * Pagination token returned by the GET list request when results exceed the maximum allowed. Use the token to fetch the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListPlaybackConfigurationsRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[integerMin1Max100] = js.undefined, NextToken: string = null): ListPlaybackConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPlaybackConfigurationsRequest]
  }
}

