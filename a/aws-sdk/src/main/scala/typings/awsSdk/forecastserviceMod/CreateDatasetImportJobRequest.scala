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
    * The format of timestamps in the dataset. The format that you specify depends on the DataFrequency specified when the dataset was created. The following formats are supported   "yyyy-MM-dd" For the following data frequencies: Y, M, W, and D   "yyyy-MM-dd HH:mm:ss" For the following data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D   If the format isn't specified, Amazon Forecast expects the format to be "yyyy-MM-dd HH:mm:ss".
    */
  var TimestampFormat: js.UndefOr[typings.awsSdk.forecastserviceMod.TimestampFormat] = js.native
}

object CreateDatasetImportJobRequest {
  @scala.inline
  def apply(
    DataSource: DataSource,
    DatasetArn: Arn,
    DatasetImportJobName: Name,
    TimestampFormat: TimestampFormat = null
  ): CreateDatasetImportJobRequest = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any], DatasetArn = DatasetArn.asInstanceOf[js.Any], DatasetImportJobName = DatasetImportJobName.asInstanceOf[js.Any])
    if (TimestampFormat != null) __obj.updateDynamic("TimestampFormat")(TimestampFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetImportJobRequest]
  }
}

