package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobExecutionSummaryForThing extends js.Object {
  /**
    * Contains a subset of information about a job execution.
    */
  var jobExecutionSummary: js.UndefOr[JobExecutionSummary] = js.native
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.native
}

object JobExecutionSummaryForThing {
  @scala.inline
  def apply(jobExecutionSummary: JobExecutionSummary = null, jobId: JobId = null): JobExecutionSummaryForThing = {
    val __obj = js.Dynamic.literal()
    if (jobExecutionSummary != null) __obj.updateDynamic("jobExecutionSummary")(jobExecutionSummary.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobExecutionSummaryForThing]
  }
}

