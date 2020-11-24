package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The location of the summary manifest. The summary manifest provides aggregate data validation results for the training and test datasets.
    */
  var ManifestSummary: js.UndefOr[GroundTruthManifest] = js.native
  
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
    * Contains information about the testing results.
    */
  var TestingDataResult: js.UndefOr[typings.awsSdk.rekognitionMod.TestingDataResult] = js.native
  
  /**
    * Contains information about the training results.
    */
  var TrainingDataResult: js.UndefOr[typings.awsSdk.rekognitionMod.TrainingDataResult] = js.native
  
  /**
    * The Unix date and time that training of the model ended.
    */
  var TrainingEndTimestamp: js.UndefOr[DateTime] = js.native
}
object ProjectVersionDescription {
  
  @scala.inline
  def apply(): ProjectVersionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectVersionDescription]
  }
  
  @scala.inline
  implicit class ProjectVersionDescriptionOps[Self <: ProjectVersionDescription] (val x: Self) extends AnyVal {
    
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
    def setBillableTrainingTimeInSeconds(value: ULong): Self = this.set("BillableTrainingTimeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillableTrainingTimeInSeconds: Self = this.set("BillableTrainingTimeInSeconds", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: DateTime): Self = this.set("CreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("CreationTimestamp", js.undefined)
    
    @scala.inline
    def setEvaluationResult(value: EvaluationResult): Self = this.set("EvaluationResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationResult: Self = this.set("EvaluationResult", js.undefined)
    
    @scala.inline
    def setManifestSummary(value: GroundTruthManifest): Self = this.set("ManifestSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifestSummary: Self = this.set("ManifestSummary", js.undefined)
    
    @scala.inline
    def setMinInferenceUnits(value: InferenceUnits): Self = this.set("MinInferenceUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinInferenceUnits: Self = this.set("MinInferenceUnits", js.undefined)
    
    @scala.inline
    def setOutputConfig(value: OutputConfig): Self = this.set("OutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputConfig: Self = this.set("OutputConfig", js.undefined)
    
    @scala.inline
    def setProjectVersionArn(value: ProjectVersionArn): Self = this.set("ProjectVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectVersionArn: Self = this.set("ProjectVersionArn", js.undefined)
    
    @scala.inline
    def setStatus(value: ProjectVersionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    
    @scala.inline
    def setTestingDataResult(value: TestingDataResult): Self = this.set("TestingDataResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestingDataResult: Self = this.set("TestingDataResult", js.undefined)
    
    @scala.inline
    def setTrainingDataResult(value: TrainingDataResult): Self = this.set("TrainingDataResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingDataResult: Self = this.set("TrainingDataResult", js.undefined)
    
    @scala.inline
    def setTrainingEndTimestamp(value: DateTime): Self = this.set("TrainingEndTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingEndTimestamp: Self = this.set("TrainingEndTimestamp", js.undefined)
  }
}
