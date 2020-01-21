package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartQueryResponse extends js.Object {
  /**
    * The unique ID of the query. 
    */
  var queryId: js.UndefOr[QueryId] = js.native
}

object StartQueryResponse {
  @scala.inline
  def apply(queryId: QueryId = null): StartQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (queryId != null) __obj.updateDynamic("queryId")(queryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartQueryResponse]
  }
}

