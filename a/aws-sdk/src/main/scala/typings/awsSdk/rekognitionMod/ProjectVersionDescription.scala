package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectVersionDescription extends js.Object {
  /**
    * The duration, in seconds, that the model version has been billed for training. This value is only returned if the model version has been successfully trained.
    */
  var BillableTrainingTimeInSeconds: js.UndefOr[ULong] = js.native
  /**
    * The Unix datetime for the date and time that training started.
    */
  var CreationTimestamp: js.UndefOr[DateTime] = js.native
  /**
    * The training results. EvaluationResult is only returned if training is successful.
    */
  var EvaluationResult: js.UndefOr[typings.awsSdk.rekognitionMod.EvaluationResult] = js.native
  /**
    * The minimum number of inference units used by the model. For more information, see StartProjectVersion.
    */
  var MinInferenceUnits: js.UndefOr[InferenceUnits] = js.native
  /**
    * The location where training results are saved.
    */
  var OutputConfig: js.UndefOr[typings.awsSdk.rekognitionMod.OutputConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) of the model version. 
    */
  var ProjectVersionArn: js.UndefOr[typings.awsSdk.rekognitionMod.ProjectVersionArn] = js.native
  /**
    * The current status of the model version.
    */
  var Status: js.UndefOr[ProjectVersionStatus] = js.native
  /**
    * A descriptive message for an error or warning that occurred.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.rekognitionMod.StatusMessage] = js.native
  /**
    * The manifest file that represents the testing results.
    */
  var TestingDataResult: js.UndefOr[typings.awsSdk.rekognitionMod.TestingDataResult] = js.native
  /**
    * The manifest file that represents the training results.
    */
  var TrainingDataResult: js.UndefOr[typings.awsSdk.rekognitionMod.TrainingDataResult] = js.native
  /**
    * The Unix date and time that training of the model ended.
    */
  var TrainingEndTimestamp: js.UndefOr[DateTime] = js.native
}

object ProjectVersionDescription {
  @scala.inline
  def apply(
    BillableTrainingTimeInSeconds: Int | Double = null,
    CreationTimestamp: DateTime = null,
    EvaluationResult: EvaluationResult = null,
    MinInferenceUnits: Int | Double = null,
    OutputConfig: OutputConfig = null,
    ProjectVersionArn: ProjectVersionArn = null,
    Status: ProjectVersionStatus = null,
    StatusMessage: StatusMessage = null,
    TestingDataResult: TestingDataResult = null,
    TrainingDataResult: TrainingDataResult = null,
    TrainingEndTimestamp: DateTime = null
  ): ProjectVersionDescription = {
    val __obj = js.Dynamic.literal()
    if (BillableTrainingTimeInSeconds != null) __obj.updateDynamic("BillableTrainingTimeInSeconds")(BillableTrainingTimeInSeconds.asInstanceOf[js.Any])
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp.asInstanceOf[js.Any])
    if (EvaluationResult != null) __obj.updateDynamic("EvaluationResult")(EvaluationResult.asInstanceOf[js.Any])
    if (MinInferenceUnits != null) __obj.updateDynamic("MinInferenceUnits")(MinInferenceUnits.asInstanceOf[js.Any])
    if (OutputConfig != null) __obj.updateDynamic("OutputConfig")(OutputConfig.asInstanceOf[js.Any])
    if (ProjectVersionArn != null) __obj.updateDynamic("ProjectVersionArn")(ProjectVersionArn.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (TestingDataResult != null) __obj.updateDynamic("TestingDataResult")(TestingDataResult.asInstanceOf[js.Any])
    if (TrainingDataResult != null) __obj.updateDynamic("TrainingDataResult")(TrainingDataResult.asInstanceOf[js.Any])
    if (TrainingEndTimestamp != null) __obj.updateDynamic("TrainingEndTimestamp")(TrainingEndTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectVersionDescription]
  }
}

