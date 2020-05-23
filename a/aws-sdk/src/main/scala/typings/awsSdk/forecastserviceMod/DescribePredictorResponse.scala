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
  def apply(
    AlgorithmArn: Arn = null,
    AutoMLAlgorithmArns: ArnList = null,
    CreationTime: Timestamp = null,
    DatasetImportJobArns: ArnList = null,
    EncryptionConfig: EncryptionConfig = null,
    EvaluationParameters: EvaluationParameters = null,
    FeaturizationConfig: FeaturizationConfig = null,
    ForecastHorizon: js.UndefOr[Integer] = js.undefined,
    HPOConfig: HyperParameterTuningJobConfig = null,
    InputDataConfig: InputDataConfig = null,
    LastModificationTime: Timestamp = null,
    Message: Message = null,
    PerformAutoML: js.UndefOr[Boolean] = js.undefined,
    PerformHPO: js.UndefOr[Boolean] = js.undefined,
    PredictorArn: Name = null,
    PredictorExecutionDetails: PredictorExecutionDetails = null,
    PredictorName: Name = null,
    Status: Status = null,
    TrainingParameters: TrainingParameters = null
  ): DescribePredictorResponse = {
    val __obj = js.Dynamic.literal()
    if (AlgorithmArn != null) __obj.updateDynamic("AlgorithmArn")(AlgorithmArn.asInstanceOf[js.Any])
    if (AutoMLAlgorithmArns != null) __obj.updateDynamic("AutoMLAlgorithmArns")(AutoMLAlgorithmArns.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DatasetImportJobArns != null) __obj.updateDynamic("DatasetImportJobArns")(DatasetImportJobArns.asInstanceOf[js.Any])
    if (EncryptionConfig != null) __obj.updateDynamic("EncryptionConfig")(EncryptionConfig.asInstanceOf[js.Any])
    if (EvaluationParameters != null) __obj.updateDynamic("EvaluationParameters")(EvaluationParameters.asInstanceOf[js.Any])
    if (FeaturizationConfig != null) __obj.updateDynamic("FeaturizationConfig")(FeaturizationConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(ForecastHorizon)) __obj.updateDynamic("ForecastHorizon")(ForecastHorizon.get.asInstanceOf[js.Any])
    if (HPOConfig != null) __obj.updateDynamic("HPOConfig")(HPOConfig.asInstanceOf[js.Any])
    if (InputDataConfig != null) __obj.updateDynamic("InputDataConfig")(InputDataConfig.asInstanceOf[js.Any])
    if (LastModificationTime != null) __obj.updateDynamic("LastModificationTime")(LastModificationTime.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (!js.isUndefined(PerformAutoML)) __obj.updateDynamic("PerformAutoML")(PerformAutoML.get.asInstanceOf[js.Any])
    if (!js.isUndefined(PerformHPO)) __obj.updateDynamic("PerformHPO")(PerformHPO.get.asInstanceOf[js.Any])
    if (PredictorArn != null) __obj.updateDynamic("PredictorArn")(PredictorArn.asInstanceOf[js.Any])
    if (PredictorExecutionDetails != null) __obj.updateDynamic("PredictorExecutionDetails")(PredictorExecutionDetails.asInstanceOf[js.Any])
    if (PredictorName != null) __obj.updateDynamic("PredictorName")(PredictorName.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TrainingParameters != null) __obj.updateDynamic("TrainingParameters")(TrainingParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePredictorResponse]
  }
}

