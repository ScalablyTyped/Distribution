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
  def apply(): Evaluation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Evaluation]
  }
  @scala.inline
  implicit class EvaluationOps[Self <: Evaluation] (val x: Self) extends AnyVal {
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
    def setEvaluationDataSourceId(value: EntityId): Self = this.set("EvaluationDataSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluationDataSourceId: Self = this.set("EvaluationDataSourceId", js.undefined)
    @scala.inline
    def setEvaluationId(value: EntityId): Self = this.set("EvaluationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluationId: Self = this.set("EvaluationId", js.undefined)
    @scala.inline
    def setFinishedAt(value: EpochTime): Self = this.set("FinishedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinishedAt: Self = this.set("FinishedAt", js.undefined)
    @scala.inline
    def setInputDataLocationS3(value: S3Url): Self = this.set("InputDataLocationS3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputDataLocationS3: Self = this.set("InputDataLocationS3", js.undefined)
    @scala.inline
    def setLastUpdatedAt(value: EpochTime): Self = this.set("LastUpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("LastUpdatedAt", js.undefined)
    @scala.inline
    def setMLModelId(value: EntityId): Self = this.set("MLModelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMLModelId: Self = this.set("MLModelId", js.undefined)
    @scala.inline
    def setMessage(value: Message): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setName(value: EntityName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setPerformanceMetrics(value: PerformanceMetrics): Self = this.set("PerformanceMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformanceMetrics: Self = this.set("PerformanceMetrics", js.undefined)
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

