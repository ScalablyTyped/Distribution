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
  def apply(): JobExecutionSummaryForThing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionSummaryForThing]
  }
  @scala.inline
  implicit class JobExecutionSummaryForThingOps[Self <: JobExecutionSummaryForThing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJobExecutionSummary(value: JobExecutionSummary): Self = this.set("jobExecutionSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobExecutionSummary: Self = this.set("jobExecutionSummary", js.undefined)
    @scala.inline
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
  }
  
}

