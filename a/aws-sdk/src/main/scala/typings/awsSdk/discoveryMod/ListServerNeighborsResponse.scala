package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServerNeighborsResponse extends js.Object {
  /**
    * Count of distinct servers that are one hop away from the given server.
    */
  var knownDependencyCount: js.UndefOr[Long] = js.native
  /**
    * List of distinct servers that are one hop away from the given server.
    */
  var neighbors: NeighborDetailsList = js.native
  /**
    * Token to retrieve the next set of results. For example, if you specified 100 IDs for ListServerNeighborsRequest$neighborConfigurationIds but set ListServerNeighborsRequest$maxResults to 10, you received a set of 10 results along with this token. Use this token in the next query to retrieve the next set of 10.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListServerNeighborsResponse {
  @scala.inline
  def apply(
    neighbors: NeighborDetailsList,
    knownDependencyCount: js.UndefOr[Long] = js.undefined,
    nextToken: String = null
  ): ListServerNeighborsResponse = {
    val __obj = js.Dynamic.literal(neighbors = neighbors.asInstanceOf[js.Any])
    if (!js.isUndefined(knownDependencyCount)) __obj.updateDynamic("knownDependencyCount")(knownDependencyCount.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServerNeighborsResponse]
  }
}

