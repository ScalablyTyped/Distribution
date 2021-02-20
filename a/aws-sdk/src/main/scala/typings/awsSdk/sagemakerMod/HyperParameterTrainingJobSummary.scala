package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HyperParameterTrainingJobSummary extends StObject {
  
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
  implicit class HyperParameterTrainingJobSummaryMutableBuilder[Self <: HyperParameterTrainingJobSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setFinalHyperParameterTuningJobObjectiveMetric(value: FinalHyperParameterTuningJobObjectiveMetric): Self = StObject.set(x, "FinalHyperParameterTuningJobObjectiveMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalHyperParameterTuningJobObjectiveMetricUndefined: Self = StObject.set(x, "FinalHyperParameterTuningJobObjectiveMetric", js.undefined)
    
    @scala.inline
    def setObjectiveStatus(value: ObjectiveStatus): Self = StObject.set(x, "ObjectiveStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectiveStatusUndefined: Self = StObject.set(x, "ObjectiveStatus", js.undefined)
    
    @scala.inline
    def setTrainingEndTime(value: Timestamp): Self = StObject.set(x, "TrainingEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingEndTimeUndefined: Self = StObject.set(x, "TrainingEndTime", js.undefined)
    
    @scala.inline
    def setTrainingJobArn(value: TrainingJobArn): Self = StObject.set(x, "TrainingJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingJobDefinitionName(value: HyperParameterTrainingJobDefinitionName): Self = StObject.set(x, "TrainingJobDefinitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingJobDefinitionNameUndefined: Self = StObject.set(x, "TrainingJobDefinitionName", js.undefined)
    
    @scala.inline
    def setTrainingJobName(value: TrainingJobName): Self = StObject.set(x, "TrainingJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingJobStatus(value: TrainingJobStatus): Self = StObject.set(x, "TrainingJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingStartTime(value: Timestamp): Self = StObject.set(x, "TrainingStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingStartTimeUndefined: Self = StObject.set(x, "TrainingStartTime", js.undefined)
    
    @scala.inline
    def setTunedHyperParameters(value: HyperParameters): Self = StObject.set(x, "TunedHyperParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuningJobName(value: HyperParameterTuningJobName): Self = StObject.set(x, "TuningJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuningJobNameUndefined: Self = StObject.set(x, "TuningJobName", js.undefined)
  }
}
