package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchInferenceJobSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the batch inference job.
    */
  var batchInferenceJobArn: js.UndefOr[Arn] = js.native
  /**
    * The time at which the batch inference job was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  /**
    * If the batch inference job failed, the reason for the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.native
  /**
    * The name of the batch inference job.
    */
  var jobName: js.UndefOr[Name] = js.native
  /**
    * The time at which the batch inference job was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.native
  /**
    * The ARN of the solution version used by the batch inference job.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.native
  /**
    * The status of the batch inference job. The status is one of the following values:   PENDING   IN PROGRESS   ACTIVE   CREATE FAILED  
    */
  var status: js.UndefOr[Status] = js.native
}

object BatchInferenceJobSummary {
  @scala.inline
  def apply(): BatchInferenceJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchInferenceJobSummary]
  }
  @scala.inline
  implicit class BatchInferenceJobSummaryOps[Self <: BatchInferenceJobSummary] (val x: Self) extends AnyVal {
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
    def setBatchInferenceJobArn(value: Arn): Self = this.set("batchInferenceJobArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchInferenceJobArn: Self = this.set("batchInferenceJobArn", js.undefined)
    @scala.inline
    def setCreationDateTime(value: Date): Self = this.set("creationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDateTime: Self = this.set("creationDateTime", js.undefined)
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    @scala.inline
    def setJobName(value: Name): Self = this.set("jobName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobName: Self = this.set("jobName", js.undefined)
    @scala.inline
    def setLastUpdatedDateTime(value: Date): Self = this.set("lastUpdatedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedDateTime: Self = this.set("lastUpdatedDateTime", js.undefined)
    @scala.inline
    def setSolutionVersionArn(value: Arn): Self = this.set("solutionVersionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSolutionVersionArn: Self = this.set("solutionVersionArn", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

