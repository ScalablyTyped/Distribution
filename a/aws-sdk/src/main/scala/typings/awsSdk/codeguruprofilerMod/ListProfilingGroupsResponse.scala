package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProfilingGroupsResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListProfilingGroups request. When the results of a ListProfilingGroups request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Information about profiling group names.
    */
  var profilingGroupNames: ProfilingGroupNames = js.native
  /**
    * Information about profiling groups.
    */
  var profilingGroups: js.UndefOr[ProfilingGroupDescriptions] = js.native
}

object ListProfilingGroupsResponse {
  @scala.inline
  def apply(
    profilingGroupNames: ProfilingGroupNames,
    nextToken: PaginationToken = null,
    profilingGroups: ProfilingGroupDescriptions = null
  ): ListProfilingGroupsResponse = {
    val __obj = js.Dynamic.literal(profilingGroupNames = profilingGroupNames.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (profilingGroups != null) __obj.updateDynamic("profilingGroups")(profilingGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProfilingGroupsResponse]
  }
}

