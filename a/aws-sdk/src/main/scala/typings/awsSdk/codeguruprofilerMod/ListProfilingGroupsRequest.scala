package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProfilingGroupsRequest extends js.Object {
  /**
    * If set to true, returns the full description of the profiling groups instead of the names. Defaults to false.
    */
  var includeDescription: js.UndefOr[Boolean] = js.native
  var maxResults: js.UndefOr[MaxResults] = js.native
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListProfilingGroupsRequest {
  @scala.inline
  def apply(
    includeDescription: js.UndefOr[scala.Boolean] = js.undefined,
    maxResults: Int | Double = null,
    nextToken: PaginationToken = null
  ): ListProfilingGroupsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeDescription)) __obj.updateDynamic("includeDescription")(includeDescription.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProfilingGroupsRequest]
  }
}

