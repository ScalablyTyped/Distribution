package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSource extends js.Object {
  /**
    *  The parameter is true if statistics need to be generated from the observation data. 
    */
  var ComputeStatistics: js.UndefOr[typings.awsSdk.machinelearningMod.ComputeStatistics] = js.native
  var ComputeTime: js.UndefOr[LongType] = js.native
  /**
    * The time that the DataSource was created. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The AWS user account from which the DataSource was created. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
    */
  var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.native
  /**
    * The location and name of the data in Amazon Simple Storage Service (Amazon S3) that is used by a DataSource.
    */
  var DataLocationS3: js.UndefOr[S3Url] = js.native
  /**
    * A JSON string that represents the splitting and rearrangement requirement used when this DataSource was created.
    */
  var DataRearrangement: js.UndefOr[typings.awsSdk.machinelearningMod.DataRearrangement] = js.native
  /**
    * The total number of observations contained in the data files that the DataSource references.
    */
  var DataSizeInBytes: js.UndefOr[LongType] = js.native
  /**
    * The ID that is assigned to the DataSource during creation.
    */
  var DataSourceId: js.UndefOr[EntityId] = js.native
  var FinishedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The time of the most recent edit to the BatchPrediction. The time is expressed in epoch time.
    */
  var LastUpdatedAt: js.UndefOr[EpochTime] = js.native
  /**
    * A description of the most recent details about creating the DataSource.
    */
  var Message: js.UndefOr[typings.awsSdk.machinelearningMod.Message] = js.native
  /**
    * A user-supplied name or description of the DataSource.
    */
  var Name: js.UndefOr[EntityName] = js.native
  /**
    * The number of data files referenced by the DataSource.
    */
  var NumberOfFiles: js.UndefOr[LongType] = js.native
  var RDSMetadata: js.UndefOr[typings.awsSdk.machinelearningMod.RDSMetadata] = js.native
  var RedshiftMetadata: js.UndefOr[typings.awsSdk.machinelearningMod.RedshiftMetadata] = js.native
  var RoleARN: js.UndefOr[typings.awsSdk.machinelearningMod.RoleARN] = js.native
  var StartedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The current status of the DataSource. This element can have one of the following values:   PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create a DataSource. INPROGRESS - The creation process is underway. FAILED - The request to create a DataSource did not run to completion. It is not usable. COMPLETED - The creation process completed successfully. DELETED - The DataSource is marked as deleted. It is not usable. 
    */
  var Status: js.UndefOr[EntityStatus] = js.native
}

object DataSource {
  @scala.inline
  def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  @scala.inline
  implicit class DataSourceOps[Self <: DataSource] (val x: Self) extends AnyVal {
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
    def setComputeStatistics(value: ComputeStatistics): Self = this.set("ComputeStatistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputeStatistics: Self = this.set("ComputeStatistics", js.undefined)
    @scala.inline
    def setComputeTime(value: LongType): Self = this.set("ComputeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputeTime: Self = this.set("ComputeTime", js.undefined)
    @scala.inline
    def setCreatedAt(value: EpochTime): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    @scala.inline
    def setCreatedByIamUser(value: AwsUserArn): Self = this.set("CreatedByIamUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedByIamUser: Self = this.set("CreatedByIamUser", js.undefined)
    @scala.inline
    def setDataLocationS3(value: S3Url): Self = this.set("DataLocationS3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLocationS3: Self = this.set("DataLocationS3", js.undefined)
    @scala.inline
    def setDataRearrangement(value: DataRearrangement): Self = this.set("DataRearrangement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataRearrangement: Self = this.set("DataRearrangement", js.undefined)
    @scala.inline
    def setDataSizeInBytes(value: LongType): Self = this.set("DataSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSizeInBytes: Self = this.set("DataSizeInBytes", js.undefined)
    @scala.inline
    def setDataSourceId(value: EntityId): Self = this.set("DataSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceId: Self = this.set("DataSourceId", js.undefined)
    @scala.inline
    def setFinishedAt(value: EpochTime): Self = this.set("FinishedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinishedAt: Self = this.set("FinishedAt", js.undefined)
    @scala.inline
    def setLastUpdatedAt(value: EpochTime): Self = this.set("LastUpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("LastUpdatedAt", js.undefined)
    @scala.inline
    def setMessage(value: Message): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setName(value: EntityName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setNumberOfFiles(value: LongType): Self = this.set("NumberOfFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfFiles: Self = this.set("NumberOfFiles", js.undefined)
    @scala.inline
    def setRDSMetadata(value: RDSMetadata): Self = this.set("RDSMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRDSMetadata: Self = this.set("RDSMetadata", js.undefined)
    @scala.inline
    def setRedshiftMetadata(value: RedshiftMetadata): Self = this.set("RedshiftMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedshiftMetadata: Self = this.set("RedshiftMetadata", js.undefined)
    @scala.inline
    def setRoleARN(value: RoleARN): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleARN: Self = this.set("RoleARN", js.undefined)
    @scala.inline
    def setStartedAt(value: EpochTime): Self = this.set("StartedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartedAt: Self = this.set("StartedAt", js.undefined)
    @scala.inline
    def setStatus(value: EntityStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

