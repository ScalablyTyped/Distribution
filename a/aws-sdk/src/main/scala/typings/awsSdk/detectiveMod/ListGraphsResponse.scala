package typings.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGraphsResponse extends js.Object {
  /**
    * A list of behavior graphs that the account is a master for.
    */
  var GraphList: js.UndefOr[typings.awsSdk.detectiveMod.GraphList] = js.native
  /**
    * If there are more behavior graphs remaining in the results, then this is the pagination token to use to request the next page of behavior graphs.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListGraphsResponse {
  @scala.inline
  def apply(GraphList: GraphList = null, NextToken: PaginationToken = null): ListGraphsResponse = {
    val __obj = js.Dynamic.literal()
    if (GraphList != null) __obj.updateDynamic("GraphList")(GraphList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGraphsResponse]
  }
}

