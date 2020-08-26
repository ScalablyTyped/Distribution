package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessingJobSummary extends js.Object {
  /**
    * The time at which the processing job was created.
    */
  var CreationTime: Timestamp = js.native
  /**
    * An optional string, up to one KB in size, that contains metadata from the processing container when the processing job exits.
    */
  var ExitMessage: js.UndefOr[typings.awsSdk.sagemakerMod.ExitMessage] = js.native
  /**
    * A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * A timestamp that indicates the last time the processing job was modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The time at which the processing job completed.
    */
  var ProcessingEndTime: js.UndefOr[Timestamp] = js.native
  /**
    * The Amazon Resource Name (ARN) of the processing job..
    */
  var ProcessingJobArn: typings.awsSdk.sagemakerMod.ProcessingJobArn = js.native
  /**
    * The name of the processing job.
    */
  var ProcessingJobName: typings.awsSdk.sagemakerMod.ProcessingJobName = js.native
  /**
    * The status of the processing job.
    */
  var ProcessingJobStatus: typings.awsSdk.sagemakerMod.ProcessingJobStatus = js.native
}

object ProcessingJobSummary {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    ProcessingJobArn: ProcessingJobArn,
    ProcessingJobName: ProcessingJobName,
    ProcessingJobStatus: ProcessingJobStatus
  ): ProcessingJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ProcessingJobArn = ProcessingJobArn.asInstanceOf[js.Any], ProcessingJobName = ProcessingJobName.asInstanceOf[js.Any], ProcessingJobStatus = ProcessingJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingJobSummary]
  }
  @scala.inline
  implicit class ProcessingJobSummaryOps[Self <: ProcessingJobSummary] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessingJobArn(value: ProcessingJobArn): Self = this.set("ProcessingJobArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessingJobName(value: ProcessingJobName): Self = this.set("ProcessingJobName", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessingJobStatus(value: ProcessingJobStatus): Self = this.set("ProcessingJobStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setExitMessage(value: ExitMessage): Self = this.set("ExitMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExitMessage: Self = this.set("ExitMessage", js.undefined)
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    @scala.inline
    def setProcessingEndTime(value: Timestamp): Self = this.set("ProcessingEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessingEndTime: Self = this.set("ProcessingEndTime", js.undefined)
  }
  
}

