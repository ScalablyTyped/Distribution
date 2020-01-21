package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetImportJobSummary extends js.Object {
  /**
    * The date and time (in Unix time) that the dataset import job was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset import job.
    */
  var datasetImportJobArn: js.UndefOr[Arn] = js.native
  /**
    * If a dataset import job fails, the reason behind the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.native
  /**
    * The name of the dataset import job.
    */
  var jobName: js.UndefOr[Name] = js.native
  /**
    * The date and time (in Unix time) that the dataset was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.native
  /**
    * The status of the dataset import job. A dataset import job can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED  
    */
  var status: js.UndefOr[Status] = js.native
}

object DatasetImportJobSummary {
  @scala.inline
  def apply(
    creationDateTime: Date = null,
    datasetImportJobArn: Arn = null,
    failureReason: FailureReason = null,
    jobName: Name = null,
    lastUpdatedDateTime: Date = null,
    status: Status = null
  ): DatasetImportJobSummary = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime.asInstanceOf[js.Any])
    if (datasetImportJobArn != null) __obj.updateDynamic("datasetImportJobArn")(datasetImportJobArn.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (jobName != null) __obj.updateDynamic("jobName")(jobName.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetImportJobSummary]
  }
}

