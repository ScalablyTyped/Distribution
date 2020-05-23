package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrainingJob extends js.Object {
  /**
    * Information about the algorithm used for training, and algorithm metadata.
    */
  var AlgorithmSpecification: js.UndefOr[typings.awsSdk.sagemakerMod.AlgorithmSpecification] = js.native
  /**
    * The Amazon Resource Name (ARN) of the job.
    */
  var AutoMLJobArn: js.UndefOr[typings.awsSdk.sagemakerMod.AutoMLJobArn] = js.native
  /**
    * The billable time in seconds.
    */
  var BillableTimeInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.BillableTimeInSeconds] = js.native
  var CheckpointConfig: js.UndefOr[typings.awsSdk.sagemakerMod.CheckpointConfig] = js.native
  /**
    * A timestamp that indicates when the training job was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  var DebugHookConfig: js.UndefOr[typings.awsSdk.sagemakerMod.DebugHookConfig] = js.native
  /**
    * Information about the debug rule configuration.
    */
  var DebugRuleConfigurations: js.UndefOr[typings.awsSdk.sagemakerMod.DebugRuleConfigurations] = js.native
  /**
    * Information about the evaluation status of the rules for the training job.
    */
  var DebugRuleEvaluationStatuses: js.UndefOr[typings.awsSdk.sagemakerMod.DebugRuleEvaluationStatuses] = js.native
  /**
    * To encrypt all communications between ML compute instances in distributed training, choose True. Encryption provides greater security for distributed training, but training might take longer. How long it takes depends on the amount of communication between compute instances, especially if you use a deep learning algorithm in distributed training.
    */
  var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.native
  /**
    * When true, enables managed spot training using Amazon EC2 Spot instances to run training jobs instead of on-demand instances. For more information, see Managed Spot Training.
    */
  var EnableManagedSpotTraining: js.UndefOr[Boolean] = js.native
  /**
    * If the TrainingJob was created with network isolation, the value is set to true. If network isolation is enabled, nodes can't communicate beyond the VPC they run in.
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.native
  var ExperimentConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentConfig] = js.native
  /**
    * If the training job failed, the reason it failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * A list of final metric values that are set when the training job completes. Used only if the training job was configured to use metrics.
    */
  var FinalMetricDataList: js.UndefOr[typings.awsSdk.sagemakerMod.FinalMetricDataList] = js.native
  /**
    * Algorithm-specific parameters.
    */
  var HyperParameters: js.UndefOr[typings.awsSdk.sagemakerMod.HyperParameters] = js.native
  /**
    * An array of Channel objects that describes each data input channel.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.sagemakerMod.InputDataConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) of the labeling job.
    */
  var LabelingJobArn: js.UndefOr[typings.awsSdk.sagemakerMod.LabelingJobArn] = js.native
  /**
    * A timestamp that indicates when the status of the training job was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
  /**
    * Information about the Amazon S3 location that is configured for storing model artifacts.
    */
  var ModelArtifacts: js.UndefOr[typings.awsSdk.sagemakerMod.ModelArtifacts] = js.native
  /**
    * The S3 path where model artifacts that you configured when creating the job are stored. Amazon SageMaker creates subfolders for model artifacts.
    */
  var OutputDataConfig: js.UndefOr[typings.awsSdk.sagemakerMod.OutputDataConfig] = js.native
  /**
    * Resources, including ML compute instances and ML storage volumes, that are configured for model training.
    */
  var ResourceConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ResourceConfig] = js.native
  /**
    * The AWS Identity and Access Management (IAM) role configured for the training job.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.sagemakerMod.RoleArn] = js.native
  /**
    *  Provides detailed information about the state of the training job. For detailed information about the secondary status of the training job, see StatusMessage under SecondaryStatusTransition. Amazon SageMaker provides primary statuses and secondary statuses that apply to each of them:  InProgress     Starting - Starting the training job.    Downloading - An optional stage for algorithms that support File training input mode. It indicates that data is being downloaded to the ML storage volumes.    Training - Training is in progress.    Uploading - Training is complete and the model artifacts are being uploaded to the S3 location.    Completed     Completed - The training job has completed.    Failed     Failed - The training job has failed. The reason for the failure is returned in the FailureReason field of DescribeTrainingJobResponse.    Stopped     MaxRuntimeExceeded - The job stopped because it exceeded the maximum allowed runtime.    Stopped - The training job has stopped.    Stopping     Stopping - Stopping the training job.      Valid values for SecondaryStatus are subject to change.   We no longer support the following secondary statuses:    LaunchingMLInstances     PreparingTrainingStack     DownloadingTrainingImage   
    */
  var SecondaryStatus: js.UndefOr[typings.awsSdk.sagemakerMod.SecondaryStatus] = js.native
  /**
    * A history of all of the secondary statuses that the training job has transitioned through.
    */
  var SecondaryStatusTransitions: js.UndefOr[typings.awsSdk.sagemakerMod.SecondaryStatusTransitions] = js.native
  /**
    * Specifies a limit to how long a model training job can run. When the job reaches the time limit, Amazon SageMaker ends the training job. Use this API to cap model training costs. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms can use this 120-second window to save the model artifacts, so the results of training are not lost. 
    */
  var StoppingCondition: js.UndefOr[typings.awsSdk.sagemakerMod.StoppingCondition] = js.native
  /**
    * An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.native
  var TensorBoardOutputConfig: js.UndefOr[typings.awsSdk.sagemakerMod.TensorBoardOutputConfig] = js.native
  /**
    * Indicates the time when the training job ends on training instances. You are billed for the time interval between the value of TrainingStartTime and this time. For successful jobs and stopped jobs, this is the time after model artifacts are uploaded. For failed jobs, this is the time when Amazon SageMaker detects a job failure.
    */
  var TrainingEndTime: js.UndefOr[Timestamp] = js.native
  /**
    * The Amazon Resource Name (ARN) of the training job.
    */
  var TrainingJobArn: js.UndefOr[typings.awsSdk.sagemakerMod.TrainingJobArn] = js.native
  /**
    * The name of the training job.
    */
  var TrainingJobName: js.UndefOr[typings.awsSdk.sagemakerMod.TrainingJobName] = js.native
  /**
    * The status of the training job. Training job statuses are:    InProgress - The training is in progress.    Completed - The training job has completed.    Failed - The training job has failed. To see the reason for the failure, see the FailureReason field in the response to a DescribeTrainingJobResponse call.    Stopping - The training job is stopping.    Stopped - The training job has stopped.   For more detailed information, see SecondaryStatus. 
    */
  var TrainingJobStatus: js.UndefOr[typings.awsSdk.sagemakerMod.TrainingJobStatus] = js.native
  /**
    * Indicates the time when the training job starts on training instances. You are billed for the time interval between this time and the value of TrainingEndTime. The start time in CloudWatch Logs might be later than this time. The difference is due to the time it takes to download the training data and to the size of the training container.
    */
  var TrainingStartTime: js.UndefOr[Timestamp] = js.native
  /**
    * The training time in seconds.
    */
  var TrainingTimeInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.TrainingTimeInSeconds] = js.native
  /**
    * The Amazon Resource Name (ARN) of the associated hyperparameter tuning job if the training job was launched by a hyperparameter tuning job.
    */
  var TuningJobArn: js.UndefOr[HyperParameterTuningJobArn] = js.native
  /**
    * A VpcConfig object that specifies the VPC that this training job has access to. For more information, see Protect Training Jobs by Using an Amazon Virtual Private Cloud.
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.sagemakerMod.VpcConfig] = js.native
}

object TrainingJob {
  @scala.inline
  def apply(
    AlgorithmSpecification: AlgorithmSpecification = null,
    AutoMLJobArn: AutoMLJobArn = null,
    BillableTimeInSeconds: js.UndefOr[BillableTimeInSeconds] = js.undefined,
    CheckpointConfig: CheckpointConfig = null,
    CreationTime: Timestamp = null,
    DebugHookConfig: DebugHookConfig = null,
    DebugRuleConfigurations: DebugRuleConfigurations = null,
    DebugRuleEvaluationStatuses: DebugRuleEvaluationStatuses = null,
    EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined,
    EnableManagedSpotTraining: js.UndefOr[Boolean] = js.undefined,
    EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
    ExperimentConfig: ExperimentConfig = null,
    FailureReason: FailureReason = null,
    FinalMetricDataList: FinalMetricDataList = null,
    HyperParameters: HyperParameters = null,
    InputDataConfig: InputDataConfig = null,
    LabelingJobArn: LabelingJobArn = null,
    LastModifiedTime: Timestamp = null,
    ModelArtifacts: ModelArtifacts = null,
    OutputDataConfig: OutputDataConfig = null,
    ResourceConfig: ResourceConfig = null,
    RoleArn: RoleArn = null,
    SecondaryStatus: SecondaryStatus = null,
    SecondaryStatusTransitions: SecondaryStatusTransitions = null,
    StoppingCondition: StoppingCondition = null,
    Tags: TagList = null,
    TensorBoardOutputConfig: TensorBoardOutputConfig = null,
    TrainingEndTime: Timestamp = null,
    TrainingJobArn: TrainingJobArn = null,
    TrainingJobName: TrainingJobName = null,
    TrainingJobStatus: TrainingJobStatus = null,
    TrainingStartTime: Timestamp = null,
    TrainingTimeInSeconds: js.UndefOr[TrainingTimeInSeconds] = js.undefined,
    TuningJobArn: HyperParameterTuningJobArn = null,
    VpcConfig: VpcConfig = null
  ): TrainingJob = {
    val __obj = js.Dynamic.literal()
    if (AlgorithmSpecification != null) __obj.updateDynamic("AlgorithmSpecification")(AlgorithmSpecification.asInstanceOf[js.Any])
    if (AutoMLJobArn != null) __obj.updateDynamic("AutoMLJobArn")(AutoMLJobArn.asInstanceOf[js.Any])
    if (!js.isUndefined(BillableTimeInSeconds)) __obj.updateDynamic("BillableTimeInSeconds")(BillableTimeInSeconds.get.asInstanceOf[js.Any])
    if (CheckpointConfig != null) __obj.updateDynamic("CheckpointConfig")(CheckpointConfig.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DebugHookConfig != null) __obj.updateDynamic("DebugHookConfig")(DebugHookConfig.asInstanceOf[js.Any])
    if (DebugRuleConfigurations != null) __obj.updateDynamic("DebugRuleConfigurations")(DebugRuleConfigurations.asInstanceOf[js.Any])
    if (DebugRuleEvaluationStatuses != null) __obj.updateDynamic("DebugRuleEvaluationStatuses")(DebugRuleEvaluationStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableInterContainerTrafficEncryption)) __obj.updateDynamic("EnableInterContainerTrafficEncryption")(EnableInterContainerTrafficEncryption.get.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableManagedSpotTraining)) __obj.updateDynamic("EnableManagedSpotTraining")(EnableManagedSpotTraining.get.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableNetworkIsolation)) __obj.updateDynamic("EnableNetworkIsolation")(EnableNetworkIsolation.get.asInstanceOf[js.Any])
    if (ExperimentConfig != null) __obj.updateDynamic("ExperimentConfig")(ExperimentConfig.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (FinalMetricDataList != null) __obj.updateDynamic("FinalMetricDataList")(FinalMetricDataList.asInstanceOf[js.Any])
    if (HyperParameters != null) __obj.updateDynamic("HyperParameters")(HyperParameters.asInstanceOf[js.Any])
    if (InputDataConfig != null) __obj.updateDynamic("InputDataConfig")(InputDataConfig.asInstanceOf[js.Any])
    if (LabelingJobArn != null) __obj.updateDynamic("LabelingJobArn")(LabelingJobArn.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (ModelArtifacts != null) __obj.updateDynamic("ModelArtifacts")(ModelArtifacts.asInstanceOf[js.Any])
    if (OutputDataConfig != null) __obj.updateDynamic("OutputDataConfig")(OutputDataConfig.asInstanceOf[js.Any])
    if (ResourceConfig != null) __obj.updateDynamic("ResourceConfig")(ResourceConfig.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (SecondaryStatus != null) __obj.updateDynamic("SecondaryStatus")(SecondaryStatus.asInstanceOf[js.Any])
    if (SecondaryStatusTransitions != null) __obj.updateDynamic("SecondaryStatusTransitions")(SecondaryStatusTransitions.asInstanceOf[js.Any])
    if (StoppingCondition != null) __obj.updateDynamic("StoppingCondition")(StoppingCondition.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TensorBoardOutputConfig != null) __obj.updateDynamic("TensorBoardOutputConfig")(TensorBoardOutputConfig.asInstanceOf[js.Any])
    if (TrainingEndTime != null) __obj.updateDynamic("TrainingEndTime")(TrainingEndTime.asInstanceOf[js.Any])
    if (TrainingJobArn != null) __obj.updateDynamic("TrainingJobArn")(TrainingJobArn.asInstanceOf[js.Any])
    if (TrainingJobName != null) __obj.updateDynamic("TrainingJobName")(TrainingJobName.asInstanceOf[js.Any])
    if (TrainingJobStatus != null) __obj.updateDynamic("TrainingJobStatus")(TrainingJobStatus.asInstanceOf[js.Any])
    if (TrainingStartTime != null) __obj.updateDynamic("TrainingStartTime")(TrainingStartTime.asInstanceOf[js.Any])
    if (!js.isUndefined(TrainingTimeInSeconds)) __obj.updateDynamic("TrainingTimeInSeconds")(TrainingTimeInSeconds.get.asInstanceOf[js.Any])
    if (TuningJobArn != null) __obj.updateDynamic("TuningJobArn")(TuningJobArn.asInstanceOf[js.Any])
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingJob]
  }
}

