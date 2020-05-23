package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataSourceOutput extends js.Object {
  /**
    *  The parameter is true if statistics need to be generated from the observation data. 
    */
  var ComputeStatistics: js.UndefOr[typings.awsSdk.machinelearningMod.ComputeStatistics] = js.native
  /**
    * The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the DataSource, normalized and scaled on computation resources. ComputeTime is only available if the DataSource is in the COMPLETED state and the ComputeStatistics is set to true.
    */
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
    * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
    */
  var DataLocationS3: js.UndefOr[S3Url] = js.native
  /**
    * A JSON string that represents the splitting and rearrangement requirement used when this DataSource was created.
    */
  var DataRearrangement: js.UndefOr[typings.awsSdk.machinelearningMod.DataRearrangement] = js.native
  /**
    * The total size of observations in the data files.
    */
  var DataSizeInBytes: js.UndefOr[LongType] = js.native
  /**
    * The ID assigned to the DataSource at creation. This value should be identical to the value of the DataSourceId in the request.
    */
  var DataSourceId: js.UndefOr[EntityId] = js.native
  /**
    * The schema used by all of the data files of this DataSource. Note This parameter is provided as part of the verbose format.
    */
  var DataSourceSchema: js.UndefOr[DataSchema] = js.native
  /**
    * The epoch time when Amazon Machine Learning marked the DataSource as COMPLETED or FAILED. FinishedAt is only available when the DataSource is in the COMPLETED or FAILED state.
    */
  var FinishedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The time of the most recent edit to the DataSource. The time is expressed in epoch time.
    */
  var LastUpdatedAt: js.UndefOr[EpochTime] = js.native
  /**
    * A link to the file containing logs of CreateDataSourceFrom* operations.
    */
  var LogUri: js.UndefOr[PresignedS3Url] = js.native
  /**
    * The user-supplied description of the most recent details about creating the DataSource.
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
  /**
    * The epoch time when Amazon Machine Learning marked the DataSource as INPROGRESS. StartedAt isn't available if the DataSource is in the PENDING state.
    */
  var StartedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The current status of the DataSource. This element can have one of the following values:   PENDING - Amazon ML submitted a request to create a DataSource.  INPROGRESS - The creation process is underway.  FAILED - The request to create a DataSource did not run to completion. It is not usable.  COMPLETED - The creation process completed successfully.  DELETED - The DataSource is marked as deleted. It is not usable. 
    */
  var Status: js.UndefOr[EntityStatus] = js.native
}

object GetDataSourceOutput {
  @scala.inline
  def apply(
    ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined,
    ComputeTime: js.UndefOr[LongType] = js.undefined,
    CreatedAt: EpochTime = null,
    CreatedByIamUser: AwsUserArn = null,
    DataLocationS3: S3Url = null,
    DataRearrangement: DataRearrangement = null,
    DataSizeInBytes: js.UndefOr[LongType] = js.undefined,
    DataSourceId: EntityId = null,
    DataSourceSchema: DataSchema = null,
    FinishedAt: EpochTime = null,
    LastUpdatedAt: EpochTime = null,
    LogUri: PresignedS3Url = null,
    Message: Message = null,
    Name: EntityName = null,
    NumberOfFiles: js.UndefOr[LongType] = js.undefined,
    RDSMetadata: RDSMetadata = null,
    RedshiftMetadata: RedshiftMetadata = null,
    RoleARN: RoleARN = null,
    StartedAt: EpochTime = null,
    Status: EntityStatus = null
  ): GetDataSourceOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ComputeStatistics)) __obj.updateDynamic("ComputeStatistics")(ComputeStatistics.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ComputeTime)) __obj.updateDynamic("ComputeTime")(ComputeTime.get.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (CreatedByIamUser != null) __obj.updateDynamic("CreatedByIamUser")(CreatedByIamUser.asInstanceOf[js.Any])
    if (DataLocationS3 != null) __obj.updateDynamic("DataLocationS3")(DataLocationS3.asInstanceOf[js.Any])
    if (DataRearrangement != null) __obj.updateDynamic("DataRearrangement")(DataRearrangement.asInstanceOf[js.Any])
    if (!js.isUndefined(DataSizeInBytes)) __obj.updateDynamic("DataSizeInBytes")(DataSizeInBytes.get.asInstanceOf[js.Any])
    if (DataSourceId != null) __obj.updateDynamic("DataSourceId")(DataSourceId.asInstanceOf[js.Any])
    if (DataSourceSchema != null) __obj.updateDynamic("DataSourceSchema")(DataSourceSchema.asInstanceOf[js.Any])
    if (FinishedAt != null) __obj.updateDynamic("FinishedAt")(FinishedAt.asInstanceOf[js.Any])
    if (LastUpdatedAt != null) __obj.updateDynamic("LastUpdatedAt")(LastUpdatedAt.asInstanceOf[js.Any])
    if (LogUri != null) __obj.updateDynamic("LogUri")(LogUri.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (!js.isUndefined(NumberOfFiles)) __obj.updateDynamic("NumberOfFiles")(NumberOfFiles.get.asInstanceOf[js.Any])
    if (RDSMetadata != null) __obj.updateDynamic("RDSMetadata")(RDSMetadata.asInstanceOf[js.Any])
    if (RedshiftMetadata != null) __obj.updateDynamic("RedshiftMetadata")(RedshiftMetadata.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    if (StartedAt != null) __obj.updateDynamic("StartedAt")(StartedAt.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataSourceOutput]
  }
}

