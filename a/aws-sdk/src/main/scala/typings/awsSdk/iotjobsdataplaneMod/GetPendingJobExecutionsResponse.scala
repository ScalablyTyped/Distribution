package typings.awsSdk.iotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPendingJobExecutionsResponse extends js.Object {
  /**
    * A list of JobExecutionSummary objects with status IN_PROGRESS.
    */
  var inProgressJobs: js.UndefOr[JobExecutionSummaryList] = js.native
  /**
    * A list of JobExecutionSummary objects with status QUEUED.
    */
  var queuedJobs: js.UndefOr[JobExecutionSummaryList] = js.native
}

object GetPendingJobExecutionsResponse {
  @scala.inline
  def apply(inProgressJobs: JobExecutionSummaryList = null, queuedJobs: JobExecutionSummaryList = null): GetPendingJobExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    if (inProgressJobs != null) __obj.updateDynamic("inProgressJobs")(inProgressJobs.asInstanceOf[js.Any])
    if (queuedJobs != null) __obj.updateDynamic("queuedJobs")(queuedJobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPendingJobExecutionsResponse]
  }
}

