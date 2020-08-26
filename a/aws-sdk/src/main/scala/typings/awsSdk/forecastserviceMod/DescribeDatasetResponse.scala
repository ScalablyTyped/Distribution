package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDatasetResponse extends js.Object {
  /**
    * When the dataset was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The frequency of data collection. Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "M" indicates every month and "30min" indicates every 30 minutes.
    */
  var DataFrequency: js.UndefOr[Frequency] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var DatasetArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the dataset.
    */
  var DatasetName: js.UndefOr[Name] = js.native
  /**
    * The dataset type.
    */
  var DatasetType: js.UndefOr[typings.awsSdk.forecastserviceMod.DatasetType] = js.native
  /**
    * The domain associated with the dataset.
    */
  var Domain: js.UndefOr[typings.awsSdk.forecastserviceMod.Domain] = js.native
  /**
    * The AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the key.
    */
  var EncryptionConfig: js.UndefOr[typings.awsSdk.forecastserviceMod.EncryptionConfig] = js.native
  /**
    * When you create a dataset, LastModificationTime is the same as CreationTime. While data is being imported to the dataset, LastModificationTime is the current time of the DescribeDataset call. After a CreateDatasetImportJob operation has finished, LastModificationTime is when the import job completed or failed.
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.native
  /**
    * An array of SchemaAttribute objects that specify the dataset fields. Each SchemaAttribute specifies the name and data type of a field.
    */
  var Schema: js.UndefOr[typings.awsSdk.forecastserviceMod.Schema] = js.native
  /**
    * The status of the dataset. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     UPDATE_PENDING, UPDATE_IN_PROGRESS, UPDATE_FAILED    The UPDATE states apply while data is imported to the dataset from a call to the CreateDatasetImportJob operation and reflect the status of the dataset import job. For example, when the import job status is CREATE_IN_PROGRESS, the status of the dataset is UPDATE_IN_PROGRESS.  The Status of the dataset must be ACTIVE before you can import training data. 
    */
  var Status: js.UndefOr[typings.awsSdk.forecastserviceMod.Status] = js.native
}

object DescribeDatasetResponse {
  @scala.inline
  def apply(): DescribeDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatasetResponse]
  }
  @scala.inline
  implicit class DescribeDatasetResponseOps[Self <: DescribeDatasetResponse] (val x: Self) extends AnyVal {
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
    def setDataFrequency(value: Frequency): Self = this.set("DataFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataFrequency: Self = this.set("DataFrequency", js.undefined)
    @scala.inline
    def setDatasetArn(value: Arn): Self = this.set("DatasetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetArn: Self = this.set("DatasetArn", js.undefined)
    @scala.inline
    def setDatasetName(value: Name): Self = this.set("DatasetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetName: Self = this.set("DatasetName", js.undefined)
    @scala.inline
    def setDatasetType(value: DatasetType): Self = this.set("DatasetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetType: Self = this.set("DatasetType", js.undefined)
    @scala.inline
    def setDomain(value: Domain): Self = this.set("Domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("Domain", js.undefined)
    @scala.inline
    def setEncryptionConfig(value: EncryptionConfig): Self = this.set("EncryptionConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionConfig: Self = this.set("EncryptionConfig", js.undefined)
    @scala.inline
    def setLastModificationTime(value: Timestamp): Self = this.set("LastModificationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModificationTime: Self = this.set("LastModificationTime", js.undefined)
    @scala.inline
    def setSchema(value: Schema): Self = this.set("Schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("Schema", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

