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
  def apply(
    batchInferenceJobArn: Arn = null,
    creationDateTime: Date = null,
    failureReason: FailureReason = null,
    jobName: Name = null,
    lastUpdatedDateTime: Date = null,
    solutionVersionArn: Arn = null,
    status: Status = null
  ): BatchInferenceJobSummary = {
    val __obj = js.Dynamic.literal()
    if (batchInferenceJobArn != null) __obj.updateDynamic("batchInferenceJobArn")(batchInferenceJobArn.asInstanceOf[js.Any])
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (jobName != null) __obj.updateDynamic("jobName")(jobName.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (solutionVersionArn != null) __obj.updateDynamic("solutionVersionArn")(solutionVersionArn.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchInferenceJobSummary]
  }
}

