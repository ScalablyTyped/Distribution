package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobListDescriptor extends js.Object {
  /**
    * A timestamp indicating when the specified job was created.
    */
  var CreationTime: js.UndefOr[JobCreationTime] = js.native
  /**
    * The user-specified description that was included in the specified job's Create Job request.
    */
  var Description: js.UndefOr[NonEmptyMaxLength256String] = js.native
  /**
    * The ID for the specified job.
    */
  var JobId: js.UndefOr[typings.awsSdk.s3controlMod.JobId] = js.native
  /**
    * The operation that the specified job is configured to run on each object listed in the manifest.
    */
  var Operation: js.UndefOr[OperationName] = js.native
  /**
    * The current priority for the specified job.
    */
  var Priority: js.UndefOr[JobPriority] = js.native
  /**
    * Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and the number of tasks that failed.
    */
  var ProgressSummary: js.UndefOr[JobProgressSummary] = js.native
  /**
    * The specified job's current status.
    */
  var Status: js.UndefOr[JobStatus] = js.native
  /**
    * A timestamp indicating when the specified job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.
    */
  var TerminationDate: js.UndefOr[JobTerminationDate] = js.native
}

object JobListDescriptor {
  @scala.inline
  def apply(): JobListDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobListDescriptor]
  }
  @scala.inline
  implicit class JobListDescriptorOps[Self <: JobListDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreationTime(value: JobCreationTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setDescription(value: NonEmptyMaxLength256String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
    @scala.inline
    def setOperation(value: OperationName): Self = this.set("Operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("Operation", js.undefined)
    @scala.inline
    def setPriority(value: JobPriority): Self = this.set("Priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
    @scala.inline
    def setProgressSummary(value: JobProgressSummary): Self = this.set("ProgressSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressSummary: Self = this.set("ProgressSummary", js.undefined)
    @scala.inline
    def setStatus(value: JobStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTerminationDate(value: JobTerminationDate): Self = this.set("TerminationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminationDate: Self = this.set("TerminationDate", js.undefined)
  }
  
}

