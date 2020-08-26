package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MLModel extends js.Object {
  /**
    * The algorithm used to train the MLModel. The following algorithm is supported:   SGD -- Stochastic gradient descent. The goal of SGD is to minimize the gradient of the loss function.  
    */
  var Algorithm: js.UndefOr[typings.awsSdk.machinelearningMod.Algorithm] = js.native
  var ComputeTime: js.UndefOr[LongType] = js.native
  /**
    * The time that the MLModel was created. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The AWS user account from which the MLModel was created. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
    */
  var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.native
  /**
    * The current endpoint of the MLModel.
    */
  var EndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.native
  var FinishedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
    */
  var InputDataLocationS3: js.UndefOr[S3Url] = js.native
  /**
    * The time of the most recent edit to the MLModel. The time is expressed in epoch time.
    */
  var LastUpdatedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The ID assigned to the MLModel at creation.
    */
  var MLModelId: js.UndefOr[EntityId] = js.native
  /**
    * Identifies the MLModel category. The following are the available types:   REGRESSION - Produces a numeric result. For example, "What price should a house be listed at?"  BINARY - Produces one of two possible results. For example, "Is this a child-friendly web site?".  MULTICLASS - Produces one of several possible results. For example, "Is this a HIGH-, LOW-, or MEDIUM-risk trade?". 
    */
  var MLModelType: js.UndefOr[typings.awsSdk.machinelearningMod.MLModelType] = js.native
  /**
    * A description of the most recent details about accessing the MLModel.
    */
  var Message: js.UndefOr[typings.awsSdk.machinelearningMod.Message] = js.native
  /**
    * A user-supplied name or description of the MLModel.
    */
  var Name: js.UndefOr[MLModelName] = js.native
  var ScoreThreshold: js.UndefOr[typings.awsSdk.machinelearningMod.ScoreThreshold] = js.native
  /**
    * The time of the most recent edit to the ScoreThreshold. The time is expressed in epoch time.
    */
  var ScoreThresholdLastUpdatedAt: js.UndefOr[EpochTime] = js.native
  var SizeInBytes: js.UndefOr[LongType] = js.native
  var StartedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The current status of an MLModel. This element can have one of the following values:    PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create an MLModel.  INPROGRESS - The creation process is underway.  FAILED - The request to create an MLModel didn't run to completion. The model isn't usable.  COMPLETED - The creation process completed successfully.  DELETED - The MLModel is marked as deleted. It isn't usable. 
    */
  var Status: js.UndefOr[EntityStatus] = js.native
  /**
    * The ID of the training DataSource. The CreateMLModel operation uses the TrainingDataSourceId.
    */
  var TrainingDataSourceId: js.UndefOr[EntityId] = js.native
  /**
    * A list of the training parameters in the MLModel. The list is implemented as a map of key-value pairs. The following is the current set of training parameters:    sgd.maxMLModelSizeInBytes - The maximum allowed size of the model. Depending on the input data, the size of the model might affect its performance.  The value is an integer that ranges from 100000 to 2147483648. The default value is 33554432.  sgd.maxPasses - The number of times that the training process traverses the observations to build the MLModel. The value is an integer that ranges from 1 to 10000. The default value is 10. sgd.shuffleType - Whether Amazon ML shuffles the training data. Shuffling the data improves a model's ability to find the optimal solution for a variety of data types. The valid values are auto and none. The default value is none.  sgd.l1RegularizationAmount - The coefficient regularization L1 norm, which controls overfitting the data by penalizing large coefficients. This parameter tends to drive coefficients to zero, resulting in sparse feature set. If you use this parameter, start by specifying a small value, such as 1.0E-08. The value is a double that ranges from 0 to MAX_DOUBLE. The default is to not use L1 normalization. This parameter can't be used when L2 is specified. Use this parameter sparingly.   sgd.l2RegularizationAmount - The coefficient regularization L2 norm, which controls overfitting the data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If you use this parameter, start by specifying a small value, such as 1.0E-08. The value is a double that ranges from 0 to MAX_DOUBLE. The default is to not use L2 normalization. This parameter can't be used when L1 is specified. Use this parameter sparingly.  
    */
  var TrainingParameters: js.UndefOr[typings.awsSdk.machinelearningMod.TrainingParameters] = js.native
}

object MLModel {
  @scala.inline
  def apply(): MLModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MLModel]
  }
  @scala.inline
  implicit class MLModelOps[Self <: MLModel] (val x: Self) extends AnyVal {
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
    def setAlgorithm(value: Algorithm): Self = this.set("Algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithm: Self = this.set("Algorithm", js.undefined)
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
    def setEndpointInfo(value: RealtimeEndpointInfo): Self = this.set("EndpointInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointInfo: Self = this.set("EndpointInfo", js.undefined)
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
    def setMLModelType(value: MLModelType): Self = this.set("MLModelType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMLModelType: Self = this.set("MLModelType", js.undefined)
    @scala.inline
    def setMessage(value: Message): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setName(value: MLModelName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setScoreThreshold(value: ScoreThreshold): Self = this.set("ScoreThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoreThreshold: Self = this.set("ScoreThreshold", js.undefined)
    @scala.inline
    def setScoreThresholdLastUpdatedAt(value: EpochTime): Self = this.set("ScoreThresholdLastUpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoreThresholdLastUpdatedAt: Self = this.set("ScoreThresholdLastUpdatedAt", js.undefined)
    @scala.inline
    def setSizeInBytes(value: LongType): Self = this.set("SizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeInBytes: Self = this.set("SizeInBytes", js.undefined)
    @scala.inline
    def setStartedAt(value: EpochTime): Self = this.set("StartedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartedAt: Self = this.set("StartedAt", js.undefined)
    @scala.inline
    def setStatus(value: EntityStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTrainingDataSourceId(value: EntityId): Self = this.set("TrainingDataSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainingDataSourceId: Self = this.set("TrainingDataSourceId", js.undefined)
    @scala.inline
    def setTrainingParameters(value: TrainingParameters): Self = this.set("TrainingParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainingParameters: Self = this.set("TrainingParameters", js.undefined)
  }
  
}

