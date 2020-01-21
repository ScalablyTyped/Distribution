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
    bytesScanned: Int | Double = null,
    recordsMatched: Int | Double = null,
    recordsScanned: Int | Double = null
  ): QueryStatistics = {
    val __obj = js.Dynamic.literal()
    if (bytesScanned != null) __obj.updateDynamic("bytesScanned")(bytesScanned.asInstanceOf[js.Any])
    if (recordsMatched != null) __obj.updateDynamic("recordsMatched")(recordsMatched.asInstanceOf[js.Any])
    if (recordsScanned != null) __obj.updateDynamic("recordsScanned")(recordsScanned.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryStatistics]
  }
}

