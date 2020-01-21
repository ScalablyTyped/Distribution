package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobExecutionSummaryForJob extends js.Object {
  /**
    * Contains a subset of information about a job execution.
    */
  var jobExecutionSummary: js.UndefOr[JobExecutionSummary] = js.native
  /**
    * The ARN of the thing on which the job execution is running.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
}

object JobExecutionSummaryForJob {
  @scala.inline
  def apply(jobExecutionSummary: JobExecutionSummary = null, thingArn: ThingArn = null): JobExecutionSummaryForJob = {
    val __obj = js.Dynamic.literal()
    if (jobExecutionSummary != null) __obj.updateDynamic("jobExecutionSummary")(jobExecutionSummary.asInstanceOf[js.Any])
    if (thingArn != null) __obj.updateDynamic("thingArn")(thingArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobExecutionSummaryForJob]
  }
}

