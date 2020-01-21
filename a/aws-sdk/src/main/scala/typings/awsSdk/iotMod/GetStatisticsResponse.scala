package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStatisticsResponse extends js.Object {
  /**
    * The statistics returned by the Fleet Indexing service based on the query and aggregation field.
    */
  var statistics: js.UndefOr[Statistics] = js.native
}

object GetStatisticsResponse {
  @scala.inline
  def apply(statistics: Statistics = null): GetStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    if (statistics != null) __obj.updateDynamic("statistics")(statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStatisticsResponse]
  }
}

