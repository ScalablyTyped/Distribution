package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetImportJob extends js.Object {
  /**
    * The creation date and time (in Unix time) of the dataset import job.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  /**
    * The Amazon S3 bucket that contains the training data to import.
    */
  var dataSource: js.UndefOr[DataSource] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset that receives the imported data.
    */
  var datasetArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the dataset import job.
    */
  var datasetImportJobArn: js.UndefOr[Arn] = js.native
  /**
    * If a dataset import job fails, provides the reason why.
    */
  var failureReason: js.UndefOr[FailureReason] = js.native
  /**
    * The name of the import job.
    */
  var jobName: js.UndefOr[Name] = js.native
  /**
    * The date and time (in Unix time) the dataset was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.native
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that has permissions to read from the Amazon S3 data source.
    */
  var roleArn: js.UndefOr[Arn] = js.native
  /**
    * The status of the dataset import job. A dataset import job can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED  
    */
  var status: js.UndefOr[Status] = js.native
}

object DatasetImportJob {
  @scala.inline
  def apply(
    creationDateTime: Date = null,
    dataSource: DataSource = null,
    datasetArn: Arn = null,
    datasetImportJobArn: Arn = null,
    failureReason: FailureReason = null,
    jobName: Name = null,
    lastUpdatedDateTime: Date = null,
    roleArn: Arn = null,
    status: Status = null
  ): DatasetImportJob = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (datasetArn != null) __obj.updateDynamic("datasetArn")(datasetArn.asInstanceOf[js.Any])
    if (datasetImportJobArn != null) __obj.updateDynamic("datasetImportJobArn")(datasetImportJobArn.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (jobName != null) __obj.updateDynamic("jobName")(jobName.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetImportJob]
  }
}

