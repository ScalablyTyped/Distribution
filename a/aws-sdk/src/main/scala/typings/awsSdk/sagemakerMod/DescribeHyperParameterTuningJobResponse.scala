package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * 
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
    TrainingJobStatusCounters: TrainingJobStatusCounters,
    BestTrainingJob: HyperParameterTrainingJobSummary = null,
    FailureReason: FailureReason = null,
    HyperParameterTuningEndTime: Timestamp = null,
    LastModifiedTime: Timestamp = null,
    OverallBestTrainingJob: HyperParameterTrainingJobSummary = null,
    TrainingJobDefinition: HyperParameterTrainingJobDefinition = null,
    TrainingJobDefinitions: HyperParameterTrainingJobDefinitions = null,
    WarmStartConfig: HyperParameterTuningJobWarmStartConfig = null
  ): DescribeHyperParameterTuningJobResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], HyperParameterTuningJobArn = HyperParameterTuningJobArn.asInstanceOf[js.Any], HyperParameterTuningJobConfig = HyperParameterTuningJobConfig.asInstanceOf[js.Any], HyperParameterTuningJobName = HyperParameterTuningJobName.asInstanceOf[js.Any], HyperParameterTuningJobStatus = HyperParameterTuningJobStatus.asInstanceOf[js.Any], ObjectiveStatusCounters = ObjectiveStatusCounters.asInstanceOf[js.Any], TrainingJobStatusCounters = TrainingJobStatusCounters.asInstanceOf[js.Any])
    if (BestTrainingJob != null) __obj.updateDynamic("BestTrainingJob")(BestTrainingJob.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (HyperParameterTuningEndTime != null) __obj.updateDynamic("HyperParameterTuningEndTime")(HyperParameterTuningEndTime.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (OverallBestTrainingJob != null) __obj.updateDynamic("OverallBestTrainingJob")(OverallBestTrainingJob.asInstanceOf[js.Any])
    if (TrainingJobDefinition != null) __obj.updateDynamic("TrainingJobDefinition")(TrainingJobDefinition.asInstanceOf[js.Any])
    if (TrainingJobDefinitions != null) __obj.updateDynamic("TrainingJobDefinitions")(TrainingJobDefinitions.asInstanceOf[js.Any])
    if (WarmStartConfig != null) __obj.updateDynamic("WarmStartConfig")(WarmStartConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHyperParameterTuningJobResponse]
  }
}

