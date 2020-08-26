package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetImportJobSummary extends js.Object {
  /**
    * When the dataset import job was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The location of the training data to import and an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the data. The training data must be stored in an Amazon S3 bucket. If encryption is used, DataSource includes an AWS Key Management Service (KMS) key.
    */
  var DataSource: js.UndefOr[typings.awsSdk.forecastserviceMod.DataSource] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset import job.
    */
  var DatasetImportJobArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the dataset import job.
    */
  var DatasetImportJobName: js.UndefOr[Name] = js.native
  /**
    * The last time that the dataset was modified. The time depends on the status of the job, as follows:    CREATE_PENDING - The same time as CreationTime.    CREATE_IN_PROGRESS - The current timestamp.    ACTIVE or CREATE_FAILED - When the job finished or failed.  
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.native
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[ErrorMessage] = js.native
  /**
    * The status of the dataset import job. The status is reflected in the status of the dataset. For example, when the import job status is CREATE_IN_PROGRESS, the status of the dataset is UPDATE_IN_PROGRESS. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED   
    */
  var Status: js.UndefOr[typings.awsSdk.forecastserviceMod.Status] = js.native
}

object DatasetImportJobSummary {
  @scala.inline
  def apply(): DatasetImportJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetImportJobSummary]
  }
  @scala.inline
  implicit class DatasetImportJobSummaryOps[Self <: DatasetImportJobSummary] (val x: Self) extends AnyVal {
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
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setDataSource(value: DataSource): Self = this.set("DataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("DataSource", js.undefined)
    @scala.inline
    def setDatasetImportJobArn(value: Arn): Self = this.set("DatasetImportJobArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetImportJobArn: Self = this.set("DatasetImportJobArn", js.undefined)
    @scala.inline
    def setDatasetImportJobName(value: Name): Self = this.set("DatasetImportJobName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetImportJobName: Self = this.set("DatasetImportJobName", js.undefined)
    @scala.inline
    def setLastModificationTime(value: Timestamp): Self = this.set("LastModificationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModificationTime: Self = this.set("LastModificationTime", js.undefined)
    @scala.inline
    def setMessage(value: ErrorMessage): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

