package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperParameterTrainingJobSummary extends js.Object {
  /**
    * The date and time that the training job was created.
    */
  var CreationTime: Timestamp = js.native
  /**
    * The reason that the training job failed. 
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * The FinalHyperParameterTuningJobObjectiveMetric object that specifies the value of the objective metric of the tuning job that launched this training job.
    */
  var FinalHyperParameterTuningJobObjectiveMetric: js.UndefOr[typings.awsSdk.sagemakerMod.FinalHyperParameterTuningJobObjectiveMetric] = js.native
  /**
    * The status of the objective metric for the training job:   Succeeded: The final objective metric for the training job was evaluated by the hyperparameter tuning job and used in the hyperparameter tuning process.     Pending: The training job is in progress and evaluation of its final objective metric is pending.     Failed: The final objective metric for the training job was not evaluated, and was not used in the hyperparameter tuning process. This typically occurs when the training job failed or did not emit an objective metric.  
    */
  var ObjectiveStatus: js.UndefOr[typings.awsSdk.sagemakerMod.ObjectiveStatus] = js.native
  /**
    * Specifies the time when the training job ends on training instances. You are billed for the time interval between the value of TrainingStartTime and this time. For successful jobs and stopped jobs, this is the time after model artifacts are uploaded. For failed jobs, this is the time when Amazon SageMaker detects a job failure.
    */
  var TrainingEndTime: js.UndefOr[Timestamp] = js.native
  /**
    * The Amazon Resource Name (ARN) of the training job.
    */
  var TrainingJobArn: typings.awsSdk.sagemakerMod.TrainingJobArn = js.native
  /**
    * The training job definition name.
    */
  var TrainingJobDefinitionName: js.UndefOr[HyperParameterTrainingJobDefinitionName] = js.native
  /**
    * The name of the training job.
    */
  var TrainingJobName: typings.awsSdk.sagemakerMod.TrainingJobName = js.native
  /**
    * The status of the training job.
    */
  var TrainingJobStatus: typings.awsSdk.sagemakerMod.TrainingJobStatus = js.native
  /**
    * The date and time that the training job started.
    */
  var TrainingStartTime: js.UndefOr[Timestamp] = js.native
  /**
    * A list of the hyperparameters for which you specified ranges to search.
    */
  var TunedHyperParameters: HyperParameters = js.native
  /**
    * The HyperParameter tuning job that launched the training job.
    */
  var TuningJobName: js.UndefOr[HyperParameterTuningJobName] = js.native
}

object HyperParameterTrainingJobSummary {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    TrainingJobArn: TrainingJobArn,
    TrainingJobName: TrainingJobName,
    TrainingJobStatus: TrainingJobStatus,
    TunedHyperParameters: HyperParameters
  ): HyperParameterTrainingJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], TrainingJobArn = TrainingJobArn.asInstanceOf[js.Any], TrainingJobName = TrainingJobName.asInstanceOf[js.Any], TrainingJobStatus = TrainingJobStatus.asInstanceOf[js.Any], TunedHyperParameters = TunedHyperParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTrainingJobSummary]
  }
  @scala.inline
  implicit class HyperParameterTrainingJobSummaryOps[Self <: HyperParameterTrainingJobSummary] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrainingJobArn(value: TrainingJobArn): Self = this.set("TrainingJobArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrainingJobName(value: TrainingJobName): Self = this.set("TrainingJobName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrainingJobStatus(value: TrainingJobStatus): Self = this.set("TrainingJobStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setTunedHyperParameters(value: HyperParameters): Self = this.set("TunedHyperParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    @scala.inline
    def setFinalHyperParameterTuningJobObjectiveMetric(value: FinalHyperParameterTuningJobObjectiveMetric): Self = this.set("FinalHyperParameterTuningJobObjectiveMetric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalHyperParameterTuningJobObjectiveMetric: Self = this.set("FinalHyperParameterTuningJobObjectiveMetric", js.undefined)
    @scala.inline
    def setObjectiveStatus(value: ObjectiveStatus): Self = this.set("ObjectiveStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectiveStatus: Self = this.set("ObjectiveStatus", js.undefined)
    @scala.inline
    def setTrainingEndTime(value: Timestamp): Self = this.set("TrainingEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainingEndTime: Self = this.set("TrainingEndTime", js.undefined)
    @scala.inline
    def setTrainingJobDefinitionName(value: HyperParameterTrainingJobDefinitionName): Self = this.set("TrainingJobDefinitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainingJobDefinitionName: Self = this.set("TrainingJobDefinitionName", js.undefined)
    @scala.inline
    def setTrainingStartTime(value: Timestamp): Self = this.set("TrainingStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainingStartTime: Self = this.set("TrainingStartTime", js.undefined)
    @scala.inline
    def setTuningJobName(value: HyperParameterTuningJobName): Self = this.set("TuningJobName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTuningJobName: Self = this.set("TuningJobName", js.undefined)
  }
  
}

