package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPrediction extends js.Object {
  /**
    * The ID of the DataSource that points to the group of observations to predict.
    */
  var BatchPredictionDataSourceId: js.UndefOr[EntityId] = js.native
  /**
    * The ID assigned to the BatchPrediction at creation. This value should be identical to the value of the BatchPredictionID in the request. 
    */
  var BatchPredictionId: js.UndefOr[EntityId] = js.native
  var ComputeTime: js.UndefOr[LongType] = js.native
  /**
    * The time that the BatchPrediction was created. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The AWS user account that invoked the BatchPrediction. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
    */
  var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.native
  var FinishedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
    */
  var InputDataLocationS3: js.UndefOr[S3Url] = js.native
  var InvalidRecordCount: js.UndefOr[LongType] = js.native
  /**
    * The time of the most recent edit to the BatchPrediction. The time is expressed in epoch time.
    */
  var LastUpdatedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The ID of the MLModel that generated predictions for the BatchPrediction request.
    */
  var MLModelId: js.UndefOr[EntityId] = js.native
  /**
    * A description of the most recent details about processing the batch prediction request.
    */
  var Message: js.UndefOr[typings.awsSdk.machinelearningMod.Message] = js.native
  /**
    * A user-supplied name or description of the BatchPrediction.
    */
  var Name: js.UndefOr[EntityName] = js.native
  /**
    * The location of an Amazon S3 bucket or directory to receive the operation results. The following substrings are not allowed in the s3 key portion of the outputURI field: ':', '//', '/./', '/../'.
    */
  var OutputUri: js.UndefOr[S3Url] = js.native
  var StartedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The status of the BatchPrediction. This element can have one of the following values:   PENDING - Amazon Machine Learning (Amazon ML) submitted a request to generate predictions for a batch of observations.  INPROGRESS - The process is underway.  FAILED - The request to perform a batch prediction did not run to completion. It is not usable.  COMPLETED - The batch prediction process completed successfully.  DELETED - The BatchPrediction is marked as deleted. It is not usable. 
    */
  var Status: js.UndefOr[EntityStatus] = js.native
  var TotalRecordCount: js.UndefOr[LongType] = js.native
}

object BatchPrediction {
  @scala.inline
  def apply(
    BatchPredictionDataSourceId: EntityId = null,
    BatchPredictionId: EntityId = null,
    ComputeTime: js.UndefOr[LongType] = js.undefined,
    CreatedAt: EpochTime = null,
    CreatedByIamUser: AwsUserArn = null,
    FinishedAt: EpochTime = null,
    InputDataLocationS3: S3Url = null,
    InvalidRecordCount: js.UndefOr[LongType] = js.undefined,
    LastUpdatedAt: EpochTime = null,
    MLModelId: EntityId = null,
    Message: Message = null,
    Name: EntityName = null,
    OutputUri: S3Url = null,
    StartedAt: EpochTime = null,
    Status: EntityStatus = null,
    TotalRecordCount: js.UndefOr[LongType] = js.undefined
  ): BatchPrediction = {
    val __obj = js.Dynamic.literal()
    if (BatchPredictionDataSourceId != null) __obj.updateDynamic("BatchPredictionDataSourceId")(BatchPredictionDataSourceId.asInstanceOf[js.Any])
    if (BatchPredictionId != null) __obj.updateDynamic("BatchPredictionId")(BatchPredictionId.asInstanceOf[js.Any])
    if (!js.isUndefined(ComputeTime)) __obj.updateDynamic("ComputeTime")(ComputeTime.get.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (CreatedByIamUser != null) __obj.updateDynamic("CreatedByIamUser")(CreatedByIamUser.asInstanceOf[js.Any])
    if (FinishedAt != null) __obj.updateDynamic("FinishedAt")(FinishedAt.asInstanceOf[js.Any])
    if (InputDataLocationS3 != null) __obj.updateDynamic("InputDataLocationS3")(InputDataLocationS3.asInstanceOf[js.Any])
    if (!js.isUndefined(InvalidRecordCount)) __obj.updateDynamic("InvalidRecordCount")(InvalidRecordCount.get.asInstanceOf[js.Any])
    if (LastUpdatedAt != null) __obj.updateDynamic("LastUpdatedAt")(LastUpdatedAt.asInstanceOf[js.Any])
    if (MLModelId != null) __obj.updateDynamic("MLModelId")(MLModelId.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OutputUri != null) __obj.updateDynamic("OutputUri")(OutputUri.asInstanceOf[js.Any])
    if (StartedAt != null) __obj.updateDynamic("StartedAt")(StartedAt.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalRecordCount)) __obj.updateDynamic("TotalRecordCount")(TotalRecordCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPrediction]
  }
}

