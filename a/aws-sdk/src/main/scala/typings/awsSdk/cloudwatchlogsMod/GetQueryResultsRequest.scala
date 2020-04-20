package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueryResultsRequest extends js.Object {
  /**
    * The ID number of the query.
    */
  var queryId: QueryId = js.native
}

object GetQueryResultsRequest {
  @scala.inline
  def apply(queryId: QueryId): GetQueryResultsRequest = {
    val __obj = js.Dynamic.literal(queryId = queryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryResultsRequest]
  }
}

