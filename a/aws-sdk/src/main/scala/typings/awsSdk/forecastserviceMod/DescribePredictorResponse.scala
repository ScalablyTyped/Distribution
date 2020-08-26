package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePredictorResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm used for model training.
    */
  var AlgorithmArn: js.UndefOr[Arn] = js.native
  /**
    * When PerformAutoML is specified, the ARN of the chosen algorithm.
    */
  var AutoMLAlgorithmArns: js.UndefOr[ArnList] = js.native
  /**
    * When the model training task was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * An array of the ARNs of the dataset import jobs used to import training data for the predictor.
    */
  var DatasetImportJobArns: js.UndefOr[ArnList] = js.native
  /**
    * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the key.
    */
  var EncryptionConfig: js.UndefOr[typings.awsSdk.forecastserviceMod.EncryptionConfig] = js.native
  /**
    * Used to override the default evaluation parameters of the specified algorithm. Amazon Forecast evaluates a predictor by splitting a dataset into training data and testing data. The evaluation parameters define how to perform the split and the number of iterations.
    */
  var EvaluationParameters: js.UndefOr[typings.awsSdk.forecastserviceMod.EvaluationParameters] = js.native
  /**
    * The featurization configuration.
    */
  var FeaturizationConfig: js.UndefOr[typings.awsSdk.forecastserviceMod.FeaturizationConfig] = js.native
  /**
    * The number of time-steps of the forecast. The forecast horizon is also called the prediction length.
    */
  var ForecastHorizon: js.UndefOr[Integer] = js.native
  /**
    * The hyperparameter override values for the algorithm.
    */
  var HPOConfig: js.UndefOr[HyperParameterTuningJobConfig] = js.native
  /**
    * Describes the dataset group that contains the data to use to train the predictor.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.forecastserviceMod.InputDataConfig] = js.native
  /**
    * Initially, the same as CreationTime (when the status is CREATE_PENDING). This value is updated when training starts (when the status changes to CREATE_IN_PROGRESS), and when training has completed (when the status changes to ACTIVE) or fails (when the status changes to CREATE_FAILED).
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.native
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[typings.awsSdk.forecastserviceMod.Message] = js.native
  /**
    * Whether the predictor is set to perform AutoML.
    */
  var PerformAutoML: js.UndefOr[Boolean] = js.native
  /**
    * Whether the predictor is set to perform hyperparameter optimization (HPO).
    */
  var PerformHPO: js.UndefOr[Boolean] = js.native
  /**
    * The ARN of the predictor.
    */
  var PredictorArn: js.UndefOr[Name] = js.native
  /**
    * Details on the the status and results of the backtests performed to evaluate the accuracy of the predictor. You specify the number of backtests to perform when you call the operation.
    */
  var PredictorExecutionDetails: js.UndefOr[typings.awsSdk.forecastserviceMod.PredictorExecutionDetails] = js.native
  /**
    * The name of the predictor.
    */
  var PredictorName: js.UndefOr[Name] = js.native
  /**
    * The status of the predictor. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     UPDATE_PENDING, UPDATE_IN_PROGRESS, UPDATE_FAILED     The Status of the predictor must be ACTIVE before you can use the predictor to create a forecast. 
    */
  var Status: js.UndefOr[typings.awsSdk.forecastserviceMod.Status] = js.native
  /**
    * The default training parameters or overrides selected during model training. If using the AutoML algorithm or if HPO is turned on while using the DeepAR+ algorithms, the optimized values for the chosen hyperparameters are returned. For more information, see aws-forecast-choosing-recipes.
    */
  var TrainingParameters: js.UndefOr[typings.awsSdk.forecastserviceMod.TrainingParameters] = js.native
}

object DescribePredictorResponse {
  @scala.inline
  def apply(): DescribePredictorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePredictorResponse]
  }
  @scala.inline
  implicit class DescribePredictorResponseOps[Self <: DescribePredictorResponse] (val x: Self) extends AnyVal {
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
    def setAlgorithmArn(value: Arn): Self = this.set("AlgorithmArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithmArn: Self = this.set("AlgorithmArn", js.undefined)
    @scala.inline
    def setAutoMLAlgorithmArnsVarargs(value: Arn*): Self = this.set("AutoMLAlgorithmArns", js.Array(value :_*))
    @scala.inline
    def setAutoMLAlgorithmArns(value: ArnList): Self = this.set("AutoMLAlgorithmArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMLAlgorithmArns: Self = this.set("AutoMLAlgorithmArns", js.undefined)
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setDatasetImportJobArnsVarargs(value: Arn*): Self = this.set("DatasetImportJobArns", js.Array(value :_*))
    @scala.inline
    def setDatasetImportJobArns(value: ArnList): Self = this.set("DatasetImportJobArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetImportJobArns: Self = this.set("DatasetImportJobArns", js.undefined)
    @scala.inline
    def setEncryptionConfig(value: EncryptionConfig): Self = this.set("EncryptionConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionConfig: Self = this.set("EncryptionConfig", js.undefined)
    @scala.inline
    def setEvaluationParameters(value: EvaluationParameters): Self = this.set("EvaluationParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluationParameters: Self = this.set("EvaluationParameters", js.undefined)
    @scala.inline
    def setFeaturizationConfig(value: FeaturizationConfig): Self = this.set("FeaturizationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeaturizationConfig: Self = this.set("FeaturizationConfig", js.undefined)
    @scala.inline
    def setForecastHorizon(value: Integer): Self = this.set("ForecastHorizon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForecastHorizon: Self = this.set("ForecastHorizon", js.undefined)
    @scala.inline
    def setHPOConfig(value: HyperParameterTuningJobConfig): Self = this.set("HPOConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHPOConfig: Self = this.set("HPOConfig", js.undefined)
    @scala.inline
    def setInputDataConfig(value: InputDataConfig): Self = this.set("InputDataConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputDataConfig: Self = this.set("InputDataConfig", js.undefined)
    @scala.inline
    def setLastModificationTime(value: Timestamp): Self = this.set("LastModificationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModificationTime: Self = this.set("LastModificationTime", js.undefined)
    @scala.inline
    def setMessage(value: Message): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setPerformAutoML(value: Boolean): Self = this.set("PerformAutoML", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformAutoML: Self = this.set("PerformAutoML", js.undefined)
    @scala.inline
    def setPerformHPO(value: Boolean): Self = this.set("PerformHPO", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformHPO: Self = this.set("PerformHPO", js.undefined)
    @scala.inline
    def setPredictorArn(value: Name): Self = this.set("PredictorArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredictorArn: Self = this.set("PredictorArn", js.undefined)
    @scala.inline
    def setPredictorExecutionDetails(value: PredictorExecutionDetails): Self = this.set("PredictorExecutionDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredictorExecutionDetails: Self = this.set("PredictorExecutionDetails", js.undefined)
    @scala.inline
    def setPredictorName(value: Name): Self = this.set("PredictorName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredictorName: Self = this.set("PredictorName", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTrainingParameters(value: TrainingParameters): Self = this.set("TrainingParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainingParameters: Self = this.set("TrainingParameters", js.undefined)
  }
  
}

