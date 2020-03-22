package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProfilingGroupsRequest extends js.Object {
  /**
    * A Boolean value indicating whether to include a description.
    */
  var includeDescription: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of profiling groups results returned by ListProfilingGroups in paginated output. When this parameter is used, ListProfilingGroups only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListProfilingGroups request with the returned nextToken value. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The nextToken value returned from a previous paginated ListProfilingGroups request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.   This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
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

