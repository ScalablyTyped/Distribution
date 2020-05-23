package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryStatistics extends js.Object {
  /**
    * The total number of bytes in the log events scanned during the query.
    */
  var bytesScanned: js.UndefOr[StatsValue] = js.native
  /**
    * The number of log events that matched the query string.
    */
  var recordsMatched: js.UndefOr[StatsValue] = js.native
  /**
    * The total number of log events scanned during the query.
    */
  var recordsScanned: js.UndefOr[StatsValue] = js.native
}

object QueryStatistics {
  @scala.inline
  def apply(
    bytesScanned: js.UndefOr[StatsValue] = js.undefined,
    recordsMatched: js.UndefOr[StatsValue] = js.undefined,
    recordsScanned: js.UndefOr[StatsValue] = js.undefined
  ): QueryStatistics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bytesScanned)) __obj.updateDynamic("bytesScanned")(bytesScanned.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recordsMatched)) __obj.updateDynamic("recordsMatched")(recordsMatched.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recordsScanned)) __obj.updateDynamic("recordsScanned")(recordsScanned.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryStatistics]
  }
}

