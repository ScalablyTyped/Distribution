package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobDescriptor extends js.Object {
  /**
    * Indicates whether confirmation is required before Amazon S3 begins running the specified job. Confirmation is required only for jobs created through the Amazon S3 console.
    */
  var ConfirmationRequired: js.UndefOr[typings.awsSdk.s3controlMod.ConfirmationRequired] = js.native
  /**
    * A timestamp indicating when this job was created.
    */
  var CreationTime: js.UndefOr[JobCreationTime] = js.native
  /**
    * The description for this job, if one was provided in this job's Create Job request.
    */
  var Description: js.UndefOr[NonEmptyMaxLength256String] = js.native
  /**
    * If the specified job failed, this field contains information describing the failure.
    */
  var FailureReasons: js.UndefOr[JobFailureList] = js.native
  /**
    * The Amazon Resource Name (ARN) for this job.
    */
  var JobArn: js.UndefOr[typings.awsSdk.s3controlMod.JobArn] = js.native
  /**
    * The ID for the specified job.
    */
  var JobId: js.UndefOr[typings.awsSdk.s3controlMod.JobId] = js.native
  /**
    * The configuration information for the specified job's manifest object.
    */
  var Manifest: js.UndefOr[JobManifest] = js.native
  /**
    * The operation that the specified job is configured to execute on the objects listed in the manifest.
    */
  var Operation: js.UndefOr[JobOperation] = js.native
  /**
    * The priority of the specified job.
    */
  var Priority: js.UndefOr[JobPriority] = js.native
  /**
    * Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and the number of tasks that failed.
    */
  var ProgressSummary: js.UndefOr[JobProgressSummary] = js.native
  /**
    * Contains the configuration information for the job-completion report if you requested one in the Create Job request.
    */
  var Report: js.UndefOr[JobReport] = js.native
  /**
    * The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role assigned to execute the tasks for this job.
    */
  var RoleArn: js.UndefOr[IAMRoleArn] = js.native
  /**
    * The current status of the specified job.
    */
  var Status: js.UndefOr[JobStatus] = js.native
  /**
    * 
    */
  var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason] = js.native
  /**
    * The reason why the specified job was suspended. A job is only suspended if you create it through the Amazon S3 console. When you create the job, it enters the Suspended state to await confirmation before running. After you confirm the job, it automatically exits the Suspended state.
    */
  var SuspendedCause: js.UndefOr[typings.awsSdk.s3controlMod.SuspendedCause] = js.native
  /**
    * The timestamp when this job was suspended, if it has been suspended.
    */
  var SuspendedDate: js.UndefOr[typings.awsSdk.s3controlMod.SuspendedDate] = js.native
  /**
    * A timestamp indicating when this job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.
    */
  var TerminationDate: js.UndefOr[JobTerminationDate] = js.native
}

object JobDescriptor {
  @scala.inline
  def apply(): JobDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDescriptor]
  }
  @scala.inline
  implicit class JobDescriptorOps[Self <: JobDescriptor] (val x: Self) extends AnyVal {
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
    def setConfirmationRequired(value: ConfirmationRequired): Self = this.set("ConfirmationRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmationRequired: Self = this.set("ConfirmationRequired", js.undefined)
    @scala.inline
    def setCreationTime(value: JobCreationTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setDescription(value: NonEmptyMaxLength256String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setFailureReasonsVarargs(value: JobFailure*): Self = this.set("FailureReasons", js.Array(value :_*))
    @scala.inline
    def setFailureReasons(value: JobFailureList): Self = this.set("FailureReasons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReasons: Self = this.set("FailureReasons", js.undefined)
    @scala.inline
    def setJobArn(value: JobArn): Self = this.set("JobArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobArn: Self = this.set("JobArn", js.undefined)
    @scala.inline
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
    @scala.inline
    def setManifest(value: JobManifest): Self = this.set("Manifest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifest: Self = this.set("Manifest", js.undefined)
    @scala.inline
    def setOperation(value: JobOperation): Self = this.set("Operation", value.asInstanceOf[js.Any])
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
    def setReport(value: JobReport): Self = this.set("Report", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReport: Self = this.set("Report", js.undefined)
    @scala.inline
    def setRoleArn(value: IAMRoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    @scala.inline
    def setStatus(value: JobStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStatusUpdateReason(value: JobStatusUpdateReason): Self = this.set("StatusUpdateReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusUpdateReason: Self = this.set("StatusUpdateReason", js.undefined)
    @scala.inline
    def setSuspendedCause(value: SuspendedCause): Self = this.set("SuspendedCause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuspendedCause: Self = this.set("SuspendedCause", js.undefined)
    @scala.inline
    def setSuspendedDate(value: SuspendedDate): Self = this.set("SuspendedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuspendedDate: Self = this.set("SuspendedDate", js.undefined)
    @scala.inline
    def setTerminationDate(value: JobTerminationDate): Self = this.set("TerminationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminationDate: Self = this.set("TerminationDate", js.undefined)
  }
  
}

