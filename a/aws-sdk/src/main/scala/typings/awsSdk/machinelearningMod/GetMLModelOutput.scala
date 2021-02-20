package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMLModelOutput extends StObject {
  
  /**
    * The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the MLModel, normalized and scaled on computation resources. ComputeTime is only available if the MLModel is in the COMPLETED state.
    */
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
    * The current endpoint of the MLModel
    */
  var EndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.native
  
  /**
    * The epoch time when Amazon Machine Learning marked the MLModel as COMPLETED or FAILED. FinishedAt is only available when the MLModel is in the COMPLETED or FAILED state.
    */
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
    * A link to the file that contains logs of the CreateMLModel operation.
    */
  var LogUri: js.UndefOr[PresignedS3Url] = js.native
  
  /**
    * The MLModel ID, which is same as the MLModelId in the request.
    */
  var MLModelId: js.UndefOr[EntityId] = js.native
  
  /**
    * Identifies the MLModel category. The following are the available types:   REGRESSION -- Produces a numeric result. For example, "What price should a house be listed at?" BINARY -- Produces one of two possible results. For example, "Is this an e-commerce website?" MULTICLASS -- Produces one of several possible results. For example, "Is this a HIGH, LOW or MEDIUM risk trade?" 
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
  
  /**
    * The recipe to use when training the MLModel. The Recipe provides detailed information about the observation data to use during training, and manipulations to perform on the observation data during training. Note This parameter is provided as part of the verbose format.
    */
  var Recipe: js.UndefOr[typings.awsSdk.machinelearningMod.Recipe] = js.native
  
  /**
    * The schema used by all of the data files referenced by the DataSource. Note This parameter is provided as part of the verbose format.
    */
  var Schema: js.UndefOr[DataSchema] = js.native
  
  /**
    * The scoring threshold is used in binary classification MLModel models. It marks the boundary between a positive prediction and a negative prediction. Output values greater than or equal to the threshold receive a positive result from the MLModel, such as true. Output values less than the threshold receive a negative response from the MLModel, such as false.
    */
  var ScoreThreshold: js.UndefOr[typings.awsSdk.machinelearningMod.ScoreThreshold] = js.native
  
  /**
    * The time of the most recent edit to the ScoreThreshold. The time is expressed in epoch time.
    */
  var ScoreThresholdLastUpdatedAt: js.UndefOr[EpochTime] = js.native
  
  var SizeInBytes: js.UndefOr[LongType] = js.native
  
  /**
    * The epoch time when Amazon Machine Learning marked the MLModel as INPROGRESS. StartedAt isn't available if the MLModel is in the PENDING state.
    */
  var StartedAt: js.UndefOr[EpochTime] = js.native
  
  /**
    * The current status of the MLModel. This element can have one of the following values:   PENDING - Amazon Machine Learning (Amazon ML) submitted a request to describe a MLModel.  INPROGRESS - The request is processing.  FAILED - The request did not run to completion. The ML model isn't usable.  COMPLETED - The request completed successfully.  DELETED - The MLModel is marked as deleted. It isn't usable. 
    */
  var Status: js.UndefOr[EntityStatus] = js.native
  
  /**
    * The ID of the training DataSource.
    */
  var TrainingDataSourceId: js.UndefOr[EntityId] = js.native
  
  /**
    * A list of the training parameters in the MLModel. The list is implemented as a map of key-value pairs. The following is the current set of training parameters:    sgd.maxMLModelSizeInBytes - The maximum allowed size of the model. Depending on the input data, the size of the model might affect its performance.  The value is an integer that ranges from 100000 to 2147483648. The default value is 33554432.  sgd.maxPasses - The number of times that the training process traverses the observations to build the MLModel. The value is an integer that ranges from 1 to 10000. The default value is 10. sgd.shuffleType - Whether Amazon ML shuffles the training data. Shuffling data improves a model's ability to find the optimal solution for a variety of data types. The valid values are auto and none. The default value is none. We strongly recommend that you shuffle your data.  sgd.l1RegularizationAmount - The coefficient regularization L1 norm. It controls overfitting the data by penalizing large coefficients. This tends to drive coefficients to zero, resulting in a sparse feature set. If you use this parameter, start by specifying a small value, such as 1.0E-08. The value is a double that ranges from 0 to MAX_DOUBLE. The default is to not use L1 normalization. This parameter can't be used when L2 is specified. Use this parameter sparingly.   sgd.l2RegularizationAmount - The coefficient regularization L2 norm. It controls overfitting the data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If you use this parameter, start by specifying a small value, such as 1.0E-08. The value is a double that ranges from 0 to MAX_DOUBLE. The default is to not use L2 normalization. This parameter can't be used when L1 is specified. Use this parameter sparingly.  
    */
  var TrainingParameters: js.UndefOr[typings.awsSdk.machinelearningMod.TrainingParameters] = js.native
}
object GetMLModelOutput {
  
  @scala.inline
  def apply(): GetMLModelOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMLModelOutput]
  }
  
  @scala.inline
  implicit class GetMLModelOutputMutableBuilder[Self <: GetMLModelOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputeTime(value: LongType): Self = StObject.set(x, "ComputeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeTimeUndefined: Self = StObject.set(x, "ComputeTime", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: EpochTime): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setCreatedByIamUser(value: AwsUserArn): Self = StObject.set(x, "CreatedByIamUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByIamUserUndefined: Self = StObject.set(x, "CreatedByIamUser", js.undefined)
    
    @scala.inline
    def setEndpointInfo(value: RealtimeEndpointInfo): Self = StObject.set(x, "EndpointInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointInfoUndefined: Self = StObject.set(x, "EndpointInfo", js.undefined)
    
    @scala.inline
    def setFinishedAt(value: EpochTime): Self = StObject.set(x, "FinishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishedAtUndefined: Self = StObject.set(x, "FinishedAt", js.undefined)
    
    @scala.inline
    def setInputDataLocationS3(value: S3Url): Self = StObject.set(x, "InputDataLocationS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDataLocationS3Undefined: Self = StObject.set(x, "InputDataLocationS3", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: EpochTime): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    @scala.inline
    def setLogUri(value: PresignedS3Url): Self = StObject.set(x, "LogUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUriUndefined: Self = StObject.set(x, "LogUri", js.undefined)
    
    @scala.inline
    def setMLModelId(value: EntityId): Self = StObject.set(x, "MLModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMLModelIdUndefined: Self = StObject.set(x, "MLModelId", js.undefined)
    
    @scala.inline
    def setMLModelType(value: MLModelType): Self = StObject.set(x, "MLModelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMLModelTypeUndefined: Self = StObject.set(x, "MLModelType", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setName(value: MLModelName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRecipe(value: Recipe): Self = StObject.set(x, "Recipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeUndefined: Self = StObject.set(x, "Recipe", js.undefined)
    
    @scala.inline
    def setSchema(value: DataSchema): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "Schema", js.undefined)
    
    @scala.inline
    def setScoreThreshold(value: ScoreThreshold): Self = StObject.set(x, "ScoreThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreThresholdLastUpdatedAt(value: EpochTime): Self = StObject.set(x, "ScoreThresholdLastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreThresholdLastUpdatedAtUndefined: Self = StObject.set(x, "ScoreThresholdLastUpdatedAt", js.undefined)
    
    @scala.inline
    def setScoreThresholdUndefined: Self = StObject.set(x, "ScoreThreshold", js.undefined)
    
    @scala.inline
    def setSizeInBytes(value: LongType): Self = StObject.set(x, "SizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInBytesUndefined: Self = StObject.set(x, "SizeInBytes", js.undefined)
    
    @scala.inline
    def setStartedAt(value: EpochTime): Self = StObject.set(x, "StartedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAtUndefined: Self = StObject.set(x, "StartedAt", js.undefined)
    
    @scala.inline
    def setStatus(value: EntityStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTrainingDataSourceId(value: EntityId): Self = StObject.set(x, "TrainingDataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingDataSourceIdUndefined: Self = StObject.set(x, "TrainingDataSourceId", js.undefined)
    
    @scala.inline
    def setTrainingParameters(value: TrainingParameters): Self = StObject.set(x, "TrainingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingParametersUndefined: Self = StObject.set(x, "TrainingParameters", js.undefined)
  }
}
