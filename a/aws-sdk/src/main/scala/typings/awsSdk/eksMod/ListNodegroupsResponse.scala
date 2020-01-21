package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNodegroupsResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListNodegroups request. When the results of a ListNodegroups request exceed maxResults, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * A list of all of the node groups associated with the specified cluster.
    */
  var nodegroups: js.UndefOr[StringList] = js.native
}

object ListNodegroupsResponse {
  @scala.inline
  def apply(nextToken: String = null, nodegroups: StringList = null): ListNodegroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (nodegroups != null) __obj.updateDynamic("nodegroups")(nodegroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNodegroupsResponse]
  }
}

