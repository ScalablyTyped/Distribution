package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Evaluation extends js.Object {
  var ComputeTime: js.UndefOr[LongType] = js.native
  /**
    * The time that the Evaluation was created. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The AWS user account that invoked the evaluation. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
    */
  var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.native
  /**
    * The ID of the DataSource that is used to evaluate the MLModel.
    */
  var EvaluationDataSourceId: js.UndefOr[EntityId] = js.native
  /**
    * The ID that is assigned to the Evaluation at creation.
    */
  var EvaluationId: js.UndefOr[EntityId] = js.native
  var FinishedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The location and name of the data in Amazon Simple Storage Server (Amazon S3) that is used in the evaluation.
    */
  var InputDataLocationS3: js.UndefOr[S3Url] = js.native
  /**
    * The time of the most recent edit to the Evaluation. The time is expressed in epoch time.
    */
  var LastUpdatedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The ID of the MLModel that is the focus of the evaluation.
    */
  var MLModelId: js.UndefOr[EntityId] = js.native
  /**
    * A description of the most recent details about evaluating the MLModel.
    */
  var Message: js.UndefOr[typings.awsSdk.machinelearningMod.Message] = js.native
  /**
    * A user-supplied name or description of the Evaluation. 
    */
  var Name: js.UndefOr[EntityName] = js.native
  /**
    * Measurements of how well the MLModel performed, using observations referenced by the DataSource. One of the following metrics is returned, based on the type of the MLModel:    BinaryAUC: A binary MLModel uses the Area Under the Curve (AUC) technique to measure performance.    RegressionRMSE: A regression MLModel uses the Root Mean Square Error (RMSE) technique to measure performance. RMSE measures the difference between predicted and actual values for a single variable.   MulticlassAvgFScore: A multiclass MLModel uses the F1 score technique to measure performance.     For more information about performance metrics, please see the Amazon Machine Learning Developer Guide. 
    */
  var PerformanceMetrics: js.UndefOr[typings.awsSdk.machinelearningMod.PerformanceMetrics] = js.native
  var StartedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The status of the evaluation. This element can have one of the following values:   PENDING - Amazon Machine Learning (Amazon ML) submitted a request to evaluate an MLModel.  INPROGRESS - The evaluation is underway.  FAILED - The request to evaluate an MLModel did not run to completion. It is not usable.  COMPLETED - The evaluation process completed successfully.  DELETED - The Evaluation is marked as deleted. It is not usable. 
    */
  var Status: js.UndefOr[EntityStatus] = js.native
}

object Evaluation {
  @scala.inline
  def apply(
    ComputeTime: js.UndefOr[LongType] = js.undefined,
    CreatedAt: EpochTime = null,
    CreatedByIamUser: AwsUserArn = null,
    EvaluationDataSourceId: EntityId = null,
    EvaluationId: EntityId = null,
    FinishedAt: EpochTime = null,
    InputDataLocationS3: S3Url = null,
    LastUpdatedAt: EpochTime = null,
    MLModelId: EntityId = null,
    Message: Message = null,
    Name: EntityName = null,
    PerformanceMetrics: PerformanceMetrics = null,
    StartedAt: EpochTime = null,
    Status: EntityStatus = null
  ): Evaluation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ComputeTime)) __obj.updateDynamic("ComputeTime")(ComputeTime.get.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (CreatedByIamUser != null) __obj.updateDynamic("CreatedByIamUser")(CreatedByIamUser.asInstanceOf[js.Any])
    if (EvaluationDataSourceId != null) __obj.updateDynamic("EvaluationDataSourceId")(EvaluationDataSourceId.asInstanceOf[js.Any])
    if (EvaluationId != null) __obj.updateDynamic("EvaluationId")(EvaluationId.asInstanceOf[js.Any])
    if (FinishedAt != null) __obj.updateDynamic("FinishedAt")(FinishedAt.asInstanceOf[js.Any])
    if (InputDataLocationS3 != null) __obj.updateDynamic("InputDataLocationS3")(InputDataLocationS3.asInstanceOf[js.Any])
    if (LastUpdatedAt != null) __obj.updateDynamic("LastUpdatedAt")(LastUpdatedAt.asInstanceOf[js.Any])
    if (MLModelId != null) __obj.updateDynamic("MLModelId")(MLModelId.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (PerformanceMetrics != null) __obj.updateDynamic("PerformanceMetrics")(PerformanceMetrics.asInstanceOf[js.Any])
    if (StartedAt != null) __obj.updateDynamic("StartedAt")(StartedAt.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Evaluation]
  }
}

