package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetImportJobRequest extends js.Object {
  /**
    * The location of the training data to import and an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the data. The training data must be stored in an Amazon S3 bucket. If encryption is used, DataSource must include an AWS Key Management Service (KMS) key and the IAM role must allow Amazon Forecast permission to access the key. The KMS key and IAM role must match those specified in the EncryptionConfig parameter of the CreateDataset operation.
    */
  var DataSource: typings.awsSdk.forecastserviceMod.DataSource = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon Forecast dataset that you want to import data to.
    */
  var DatasetArn: Arn = js.native
  /**
    * The name for the dataset import job. We recommend including the current timestamp in the name, for example, 20190721DatasetImport. This can help you avoid getting a ResourceAlreadyExistsException exception.
    */
  var DatasetImportJobName: Name = js.native
  /**
    * The optional metadata that you apply to the dataset import job to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50.   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8.   Maximum value length - 256 Unicode characters in UTF-8.   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If a tag value has aws as its prefix but the key does not, then Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit.  
    */
  var Tags: js.UndefOr[typings.awsSdk.forecastserviceMod.Tags] = js.native
  /**
    * The format of timestamps in the dataset. The format that you specify depends on the DataFrequency specified when the dataset was created. The following formats are supported   "yyyy-MM-dd" For the following data frequencies: Y, M, W, and D   "yyyy-MM-dd HH:mm:ss" For the following data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D   If the format isn't specified, Amazon Forecast expects the format to be "yyyy-MM-dd HH:mm:ss".
    */
  var TimestampFormat: js.UndefOr[typings.awsSdk.forecastserviceMod.TimestampFormat] = js.native
}

object CreateDatasetImportJobRequest {
  @scala.inline
  def apply(DataSource: DataSource, DatasetArn: Arn, DatasetImportJobName: Name): CreateDatasetImportJobRequest = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any], DatasetArn = DatasetArn.asInstanceOf[js.Any], DatasetImportJobName = DatasetImportJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetImportJobRequest]
  }
  @scala.inline
  implicit class CreateDatasetImportJobRequestOps[Self <: CreateDatasetImportJobRequest] (val x: Self) extends AnyVal {
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
    def setDataSource(value: DataSource): Self = this.set("DataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatasetArn(value: Arn): Self = this.set("DatasetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatasetImportJobName(value: Name): Self = this.set("DatasetImportJobName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setTimestampFormat(value: TimestampFormat): Self = this.set("TimestampFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestampFormat: Self = this.set("TimestampFormat", js.undefined)
  }
  
}

