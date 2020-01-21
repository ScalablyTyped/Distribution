package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMonitoringSchedulesResponse extends js.Object {
  /**
    * A JSON array in which each element is a summary for a monitoring schedule.
    */
  var MonitoringScheduleSummaries: MonitoringScheduleSummaryList = js.native
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use it in the subsequent reques
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}

object ListMonitoringSchedulesResponse {
  @scala.inline
  def apply(MonitoringScheduleSummaries: MonitoringScheduleSummaryList, NextToken: NextToken = null): ListMonitoringSchedulesResponse = {
    val __obj = js.Dynamic.literal(MonitoringScheduleSummaries = MonitoringScheduleSummaries.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMonitoringSchedulesResponse]
  }
}

