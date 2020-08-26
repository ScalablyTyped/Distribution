package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDatasetImportJobResponse extends js.Object {
  /**
    * When the dataset import job was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The size of the dataset in gigabytes (GB) after the import job has finished.
    */
  var DataSize: js.UndefOr[Double] = js.native
  /**
    * The location of the training data to import and an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the data. If encryption is used, DataSource includes an AWS Key Management Service (KMS) key.
    */
  var DataSource: js.UndefOr[typings.awsSdk.forecastserviceMod.DataSource] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset that the training data was imported to.
    */
  var DatasetArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the dataset import job.
    */
  var DatasetImportJobArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the dataset import job.
    */
  var DatasetImportJobName: js.UndefOr[Name] = js.native
  /**
    * Statistical information about each field in the input data.
    */
  var FieldStatistics: js.UndefOr[typings.awsSdk.forecastserviceMod.FieldStatistics] = js.native
  /**
    * The last time that the dataset was modified. The time depends on the status of the job, as follows:    CREATE_PENDING - The same time as CreationTime.    CREATE_IN_PROGRESS - The current timestamp.    ACTIVE or CREATE_FAILED - When the job finished or failed.  
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.native
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[typings.awsSdk.forecastserviceMod.Message] = js.native
  /**
    * The status of the dataset import job. The status is reflected in the status of the dataset. For example, when the import job status is CREATE_IN_PROGRESS, the status of the dataset is UPDATE_IN_PROGRESS. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED   
    */
  var Status: js.UndefOr[typings.awsSdk.forecastserviceMod.Status] = js.native
  /**
    * The format of timestamps in the dataset. The format that you specify depends on the DataFrequency specified when the dataset was created. The following formats are supported   "yyyy-MM-dd" For the following data frequencies: Y, M, W, and D   "yyyy-MM-dd HH:mm:ss" For the following data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D  
    */
  var TimestampFormat: js.UndefOr[typings.awsSdk.forecastserviceMod.TimestampFormat] = js.native
}

object DescribeDatasetImportJobResponse {
  @scala.inline
  def apply(): DescribeDatasetImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatasetImportJobResponse]
  }
  @scala.inline
  implicit class DescribeDatasetImportJobResponseOps[Self <: DescribeDatasetImportJobResponse] (val x: Self) extends AnyVal {
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
    def setDataSize(value: Double): Self = this.set("DataSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSize: Self = this.set("DataSize", js.undefined)
    @scala.inline
    def setDataSource(value: DataSource): Self = this.set("DataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("DataSource", js.undefined)
    @scala.inline
    def setDatasetArn(value: Arn): Self = this.set("DatasetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetArn: Self = this.set("DatasetArn", js.undefined)
    @scala.inline
    def setDatasetImportJobArn(value: Arn): Self = this.set("DatasetImportJobArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetImportJobArn: Self = this.set("DatasetImportJobArn", js.undefined)
    @scala.inline
    def setDatasetImportJobName(value: Name): Self = this.set("DatasetImportJobName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetImportJobName: Self = this.set("DatasetImportJobName", js.undefined)
    @scala.inline
    def setFieldStatistics(value: FieldStatistics): Self = this.set("FieldStatistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldStatistics: Self = this.set("FieldStatistics", js.undefined)
    @scala.inline
    def setLastModificationTime(value: Timestamp): Self = this.set("LastModificationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModificationTime: Self = this.set("LastModificationTime", js.undefined)
    @scala.inline
    def setMessage(value: Message): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTimestampFormat(value: TimestampFormat): Self = this.set("TimestampFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestampFormat: Self = this.set("TimestampFormat", js.undefined)
  }
  
}

