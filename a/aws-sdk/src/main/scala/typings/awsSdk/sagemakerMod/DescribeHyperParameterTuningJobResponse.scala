package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeHyperParameterTuningJobResponse extends js.Object {
  
  /**
    * A TrainingJobSummary object that describes the training job that completed with the best current HyperParameterTuningJobObjective.
    */
  var BestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary] = js.native
  
  /**
    * The date and time that the tuning job started.
    */
  var CreationTime: Timestamp = js.native
  
  /**
    * If the tuning job failed, the reason it failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.native
  
  /**
    * The date and time that the tuning job ended.
    */
  var HyperParameterTuningEndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the tuning job.
    */
  var HyperParameterTuningJobArn: typings.awsSdk.sagemakerMod.HyperParameterTuningJobArn = js.native
  
  /**
    * The HyperParameterTuningJobConfig object that specifies the configuration of the tuning job.
    */
  var HyperParameterTuningJobConfig: typings.awsSdk.sagemakerMod.HyperParameterTuningJobConfig = js.native
  
  /**
    * The name of the tuning job.
    */
  var HyperParameterTuningJobName: typings.awsSdk.sagemakerMod.HyperParameterTuningJobName = js.native
  
  /**
    * The status of the tuning job: InProgress, Completed, Failed, Stopping, or Stopped.
    */
  var HyperParameterTuningJobStatus: typings.awsSdk.sagemakerMod.HyperParameterTuningJobStatus = js.native
  
  /**
    * The date and time that the status of the tuning job was modified. 
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ObjectiveStatusCounters object that specifies the number of training jobs, categorized by the status of their final objective metric, that this tuning job launched.
    */
  var ObjectiveStatusCounters: typings.awsSdk.sagemakerMod.ObjectiveStatusCounters = js.native
  
  /**
    * If the hyperparameter tuning job is an warm start tuning job with a WarmStartType of IDENTICAL_DATA_AND_ALGORITHM, this is the TrainingJobSummary for the training job with the best objective metric value of all training jobs launched by this tuning job and all parent jobs specified for the warm start tuning job.
    */
  var OverallBestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary] = js.native
  
  /**
    * The HyperParameterTrainingJobDefinition object that specifies the definition of the training jobs that this tuning job launches.
    */
  var TrainingJobDefinition: js.UndefOr[HyperParameterTrainingJobDefinition] = js.native
  
  /**
    * A list of the HyperParameterTrainingJobDefinition objects launched for this tuning job.
    */
  var TrainingJobDefinitions: js.UndefOr[HyperParameterTrainingJobDefinitions] = js.native
  
  /**
    * The TrainingJobStatusCounters object that specifies the number of training jobs, categorized by status, that this tuning job launched.
    */
  var TrainingJobStatusCounters: typings.awsSdk.sagemakerMod.TrainingJobStatusCounters = js.native
  
  /**
    * The configuration for starting the hyperparameter parameter tuning job using one or more previous tuning jobs as a starting point. The results of previous tuning jobs are used to inform which combinations of hyperparameters to search over in the new tuning job.
    */
  var WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig] = js.native
}
object DescribeHyperParameterTuningJobResponse {
  
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    HyperParameterTuningJobArn: HyperParameterTuningJobArn,
    HyperParameterTuningJobConfig: HyperParameterTuningJobConfig,
    HyperParameterTuningJobName: HyperParameterTuningJobName,
    HyperParameterTuningJobStatus: HyperParameterTuningJobStatus,
    ObjectiveStatusCounters: ObjectiveStatusCounters,
    TrainingJobStatusCounters: TrainingJobStatusCounters
  ): DescribeHyperParameterTuningJobResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], HyperParameterTuningJobArn = HyperParameterTuningJobArn.asInstanceOf[js.Any], HyperParameterTuningJobConfig = HyperParameterTuningJobConfig.asInstanceOf[js.Any], HyperParameterTuningJobName = HyperParameterTuningJobName.asInstanceOf[js.Any], HyperParameterTuningJobStatus = HyperParameterTuningJobStatus.asInstanceOf[js.Any], ObjectiveStatusCounters = ObjectiveStatusCounters.asInstanceOf[js.Any], TrainingJobStatusCounters = TrainingJobStatusCounters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHyperParameterTuningJobResponse]
  }
  
  @scala.inline
  implicit class DescribeHyperParameterTuningJobResponseOps[Self <: DescribeHyperParameterTuningJobResponse] (val x: Self) extends AnyVal {
    
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
    def setHyperParameterTuningJobArn(value: HyperParameterTuningJobArn): Self = this.set("HyperParameterTuningJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperParameterTuningJobConfig(value: HyperParameterTuningJobConfig): Self = this.set("HyperParameterTuningJobConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperParameterTuningJobName(value: HyperParameterTuningJobName): Self = this.set("HyperParameterTuningJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperParameterTuningJobStatus(value: HyperParameterTuningJobStatus): Self = this.set("HyperParameterTuningJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectiveStatusCounters(value: ObjectiveStatusCounters): Self = this.set("ObjectiveStatusCounters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingJobStatusCounters(value: TrainingJobStatusCounters): Self = this.set("TrainingJobStatusCounters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBestTrainingJob(value: HyperParameterTrainingJobSummary): Self = this.set("BestTrainingJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBestTrainingJob: Self = this.set("BestTrainingJob", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    
    @scala.inline
    def setHyperParameterTuningEndTime(value: Timestamp): Self = this.set("HyperParameterTuningEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyperParameterTuningEndTime: Self = this.set("HyperParameterTuningEndTime", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    
    @scala.inline
    def setOverallBestTrainingJob(value: HyperParameterTrainingJobSummary): Self = this.set("OverallBestTrainingJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverallBestTrainingJob: Self = this.set("OverallBestTrainingJob", js.undefined)
    
    @scala.inline
    def setTrainingJobDefinition(value: HyperParameterTrainingJobDefinition): Self = this.set("TrainingJobDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingJobDefinition: Self = this.set("TrainingJobDefinition", js.undefined)
    
    @scala.inline
    def setTrainingJobDefinitionsVarargs(value: HyperParameterTrainingJobDefinition*): Self = this.set("TrainingJobDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setTrainingJobDefinitions(value: HyperParameterTrainingJobDefinitions): Self = this.set("TrainingJobDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingJobDefinitions: Self = this.set("TrainingJobDefinitions", js.undefined)
    
    @scala.inline
    def setWarmStartConfig(value: HyperParameterTuningJobWarmStartConfig): Self = this.set("WarmStartConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarmStartConfig: Self = this.set("WarmStartConfig", js.undefined)
  }
}
