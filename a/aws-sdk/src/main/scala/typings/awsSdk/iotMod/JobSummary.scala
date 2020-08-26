package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobSummary extends js.Object {
  /**
    * The time, in seconds since the epoch, when the job completed.
    */
  var completedAt: js.UndefOr[DateType] = js.native
  /**
    * The time, in seconds since the epoch, when the job was created.
    */
  var createdAt: js.UndefOr[DateType] = js.native
  /**
    * The job ARN.
    */
  var jobArn: js.UndefOr[JobArn] = js.native
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.native
  /**
    * The time, in seconds since the epoch, when the job was last updated.
    */
  var lastUpdatedAt: js.UndefOr[DateType] = js.native
  /**
    * The job summary status.
    */
  var status: js.UndefOr[JobStatus] = js.native
  /**
    * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is detected in a target. For example, a job will run on a thing when the thing is added to a target group, even after the job was completed by all things originally in the group.
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.native
  /**
    * The ID of the thing group.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.native
}

object JobSummary {
  @scala.inline
  def apply(): JobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobSummary]
  }
  @scala.inline
  implicit class JobSummaryOps[Self <: JobSummary] (val x: Self) extends AnyVal {
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
    def setCompletedAt(value: DateType): Self = this.set("completedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletedAt: Self = this.set("completedAt", js.undefined)
    @scala.inline
    def setCreatedAt(value: DateType): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setJobArn(value: JobArn): Self = this.set("jobArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobArn: Self = this.set("jobArn", js.undefined)
    @scala.inline
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    @scala.inline
    def setLastUpdatedAt(value: DateType): Self = this.set("lastUpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("lastUpdatedAt", js.undefined)
    @scala.inline
    def setStatus(value: JobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTargetSelection(value: TargetSelection): Self = this.set("targetSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetSelection: Self = this.set("targetSelection", js.undefined)
    @scala.inline
    def setThingGroupId(value: ThingGroupId): Self = this.set("thingGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingGroupId: Self = this.set("thingGroupId", js.undefined)
  }
  
}

