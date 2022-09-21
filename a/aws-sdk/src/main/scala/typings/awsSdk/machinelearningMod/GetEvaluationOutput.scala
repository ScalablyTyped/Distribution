package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEvaluationOutput extends StObject {
  
  /**
    * The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the Evaluation, normalized and scaled on computation resources. ComputeTime is only available if the Evaluation is in the COMPLETED state.
    */
  var ComputeTime: js.UndefOr[LongType] = js.undefined
  
  /**
    * The time that the Evaluation was created. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The AWS user account that invoked the evaluation. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
    */
  var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined
  
  /**
    * The DataSource used for this evaluation.
    */
  var EvaluationDataSourceId: js.UndefOr[EntityId] = js.undefined
  
  /**
    * The evaluation ID which is same as the EvaluationId in the request.
    */
  var EvaluationId: js.UndefOr[EntityId] = js.undefined
  
  /**
    * The epoch time when Amazon Machine Learning marked the Evaluation as COMPLETED or FAILED. FinishedAt is only available when the Evaluation is in the COMPLETED or FAILED state.
    */
  var FinishedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
    */
  var InputDataLocationS3: js.UndefOr[S3Url] = js.undefined
  
  /**
    * The time of the most recent edit to the Evaluation. The time is expressed in epoch time.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A link to the file that contains logs of the CreateEvaluation operation.
    */
  var LogUri: js.UndefOr[PresignedS3Url] = js.undefined
  
  /**
    * The ID of the MLModel that was the focus of the evaluation.
    */
  var MLModelId: js.UndefOr[EntityId] = js.undefined
  
  /**
    * A description of the most recent details about evaluating the MLModel.
    */
  var Message: js.UndefOr[typings.awsSdk.machinelearningMod.Message] = js.undefined
  
  /**
    * A user-supplied name or description of the Evaluation. 
    */
  var Name: js.UndefOr[EntityName] = js.undefined
  
  /**
    * Measurements of how well the MLModel performed using observations referenced by the DataSource. One of the following metric is returned based on the type of the MLModel:    BinaryAUC: A binary MLModel uses the Area Under the Curve (AUC) technique to measure performance.    RegressionRMSE: A regression MLModel uses the Root Mean Square Error (RMSE) technique to measure performance. RMSE measures the difference between predicted and actual values for a single variable.   MulticlassAvgFScore: A multiclass MLModel uses the F1 score technique to measure performance.     For more information about performance metrics, please see the Amazon Machine Learning Developer Guide. 
    */
  var PerformanceMetrics: js.UndefOr[typings.awsSdk.machinelearningMod.PerformanceMetrics] = js.undefined
  
  /**
    * The epoch time when Amazon Machine Learning marked the Evaluation as INPROGRESS. StartedAt isn't available if the Evaluation is in the PENDING state.
    */
  var StartedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the evaluation. This element can have one of the following values:    PENDING - Amazon Machine Language (Amazon ML) submitted a request to evaluate an MLModel.    INPROGRESS - The evaluation is underway.    FAILED - The request to evaluate an MLModel did not run to completion. It is not usable.    COMPLETED - The evaluation process completed successfully.    DELETED - The Evaluation is marked as deleted. It is not usable.  
    */
  var Status: js.UndefOr[EntityStatus] = js.undefined
}
object GetEvaluationOutput {
  
  inline def apply(): GetEvaluationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEvaluationOutput]
  }
  
  extension [Self <: GetEvaluationOutput](x: Self) {
    
    inline def setComputeTime(value: LongType): Self = StObject.set(x, "ComputeTime", value.asInstanceOf[js.Any])
    
    inline def setComputeTimeUndefined: Self = StObject.set(x, "ComputeTime", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setCreatedByIamUser(value: AwsUserArn): Self = StObject.set(x, "CreatedByIamUser", value.asInstanceOf[js.Any])
    
    inline def setCreatedByIamUserUndefined: Self = StObject.set(x, "CreatedByIamUser", js.undefined)
    
    inline def setEvaluationDataSourceId(value: EntityId): Self = StObject.set(x, "EvaluationDataSourceId", value.asInstanceOf[js.Any])
    
    inline def setEvaluationDataSourceIdUndefined: Self = StObject.set(x, "EvaluationDataSourceId", js.undefined)
    
    inline def setEvaluationId(value: EntityId): Self = StObject.set(x, "EvaluationId", value.asInstanceOf[js.Any])
    
    inline def setEvaluationIdUndefined: Self = StObject.set(x, "EvaluationId", js.undefined)
    
    inline def setFinishedAt(value: js.Date): Self = StObject.set(x, "FinishedAt", value.asInstanceOf[js.Any])
    
    inline def setFinishedAtUndefined: Self = StObject.set(x, "FinishedAt", js.undefined)
    
    inline def setInputDataLocationS3(value: S3Url): Self = StObject.set(x, "InputDataLocationS3", value.asInstanceOf[js.Any])
    
    inline def setInputDataLocationS3Undefined: Self = StObject.set(x, "InputDataLocationS3", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    inline def setLogUri(value: PresignedS3Url): Self = StObject.set(x, "LogUri", value.asInstanceOf[js.Any])
    
    inline def setLogUriUndefined: Self = StObject.set(x, "LogUri", js.undefined)
    
    inline def setMLModelId(value: EntityId): Self = StObject.set(x, "MLModelId", value.asInstanceOf[js.Any])
    
    inline def setMLModelIdUndefined: Self = StObject.set(x, "MLModelId", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPerformanceMetrics(value: PerformanceMetrics): Self = StObject.set(x, "PerformanceMetrics", value.asInstanceOf[js.Any])
    
    inline def setPerformanceMetricsUndefined: Self = StObject.set(x, "PerformanceMetrics", js.undefined)
    
    inline def setStartedAt(value: js.Date): Self = StObject.set(x, "StartedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "StartedAt", js.undefined)
    
    inline def setStatus(value: EntityStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
