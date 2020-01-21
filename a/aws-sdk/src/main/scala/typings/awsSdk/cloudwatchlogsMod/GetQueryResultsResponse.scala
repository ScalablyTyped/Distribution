package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueryResultsResponse extends js.Object {
  /**
    * The log events that matched the query criteria during the most recent time it ran. The results value is an array of arrays. Each log event is one object in the top-level array. Each of these log event objects is an array of field/value pairs.
    */
  var results: js.UndefOr[QueryResults] = js.native
  /**
    * Includes the number of log events scanned by the query, the number of log events that matched the query criteria, and the total number of bytes in the log events that were scanned.
    */
  var statistics: js.UndefOr[QueryStatistics] = js.native
  /**
    * The status of the most recent running of the query. Possible values are Cancelled, Complete, Failed, Running, Scheduled, Timeout, and Unknown. Queries time out after 15 minutes of execution. To avoid having your queries time out, reduce the time range being searched, or partition your query into a number of queries.
    */
  var status: js.UndefOr[QueryStatus] = js.native
}

object GetQueryResultsResponse {
  @scala.inline
  def apply(results: QueryResults = null, statistics: QueryStatistics = null, status: QueryStatus = null): GetQueryResultsResponse = {
    val __obj = js.Dynamic.literal()
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (statistics != null) __obj.updateDynamic("statistics")(statistics.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryResultsResponse]
  }
}

