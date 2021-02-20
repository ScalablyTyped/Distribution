package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingJob extends StObject {
  
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
  def apply(): TrainingJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingJob]
  }
  
  @scala.inline
  implicit class TrainingJobMutableBuilder[Self <: TrainingJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmSpecification(value: AlgorithmSpecification): Self = StObject.set(x, "AlgorithmSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmSpecificationUndefined: Self = StObject.set(x, "AlgorithmSpecification", js.undefined)
    
    @scala.inline
    def setAutoMLJobArn(value: AutoMLJobArn): Self = StObject.set(x, "AutoMLJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLJobArnUndefined: Self = StObject.set(x, "AutoMLJobArn", js.undefined)
    
    @scala.inline
    def setBillableTimeInSeconds(value: BillableTimeInSeconds): Self = StObject.set(x, "BillableTimeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillableTimeInSecondsUndefined: Self = StObject.set(x, "BillableTimeInSeconds", js.undefined)
    
    @scala.inline
    def setCheckpointConfig(value: CheckpointConfig): Self = StObject.set(x, "CheckpointConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckpointConfigUndefined: Self = StObject.set(x, "CheckpointConfig", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDebugHookConfig(value: DebugHookConfig): Self = StObject.set(x, "DebugHookConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugHookConfigUndefined: Self = StObject.set(x, "DebugHookConfig", js.undefined)
    
    @scala.inline
    def setDebugRuleConfigurations(value: DebugRuleConfigurations): Self = StObject.set(x, "DebugRuleConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugRuleConfigurationsUndefined: Self = StObject.set(x, "DebugRuleConfigurations", js.undefined)
    
    @scala.inline
    def setDebugRuleConfigurationsVarargs(value: DebugRuleConfiguration*): Self = StObject.set(x, "DebugRuleConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setDebugRuleEvaluationStatuses(value: DebugRuleEvaluationStatuses): Self = StObject.set(x, "DebugRuleEvaluationStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugRuleEvaluationStatusesUndefined: Self = StObject.set(x, "DebugRuleEvaluationStatuses", js.undefined)
    
    @scala.inline
    def setDebugRuleEvaluationStatusesVarargs(value: DebugRuleEvaluationStatus*): Self = StObject.set(x, "DebugRuleEvaluationStatuses", js.Array(value :_*))
    
    @scala.inline
    def setEnableInterContainerTrafficEncryption(value: Boolean): Self = StObject.set(x, "EnableInterContainerTrafficEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableInterContainerTrafficEncryptionUndefined: Self = StObject.set(x, "EnableInterContainerTrafficEncryption", js.undefined)
    
    @scala.inline
    def setEnableManagedSpotTraining(value: Boolean): Self = StObject.set(x, "EnableManagedSpotTraining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableManagedSpotTrainingUndefined: Self = StObject.set(x, "EnableManagedSpotTraining", js.undefined)
    
    @scala.inline
    def setEnableNetworkIsolation(value: Boolean): Self = StObject.set(x, "EnableNetworkIsolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableNetworkIsolationUndefined: Self = StObject.set(x, "EnableNetworkIsolation", js.undefined)
    
    @scala.inline
    def setExperimentConfig(value: ExperimentConfig): Self = StObject.set(x, "ExperimentConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentConfigUndefined: Self = StObject.set(x, "ExperimentConfig", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setFinalMetricDataList(value: FinalMetricDataList): Self = StObject.set(x, "FinalMetricDataList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalMetricDataListUndefined: Self = StObject.set(x, "FinalMetricDataList", js.undefined)
    
    @scala.inline
    def setFinalMetricDataListVarargs(value: MetricData*): Self = StObject.set(x, "FinalMetricDataList", js.Array(value :_*))
    
    @scala.inline
    def setHyperParameters(value: HyperParameters): Self = StObject.set(x, "HyperParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperParametersUndefined: Self = StObject.set(x, "HyperParameters", js.undefined)
    
    @scala.inline
    def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    @scala.inline
    def setInputDataConfigVarargs(value: Channel*): Self = StObject.set(x, "InputDataConfig", js.Array(value :_*))
    
    @scala.inline
    def setLabelingJobArn(value: LabelingJobArn): Self = StObject.set(x, "LabelingJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelingJobArnUndefined: Self = StObject.set(x, "LabelingJobArn", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setModelArtifacts(value: ModelArtifacts): Self = StObject.set(x, "ModelArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelArtifactsUndefined: Self = StObject.set(x, "ModelArtifacts", js.undefined)
    
    @scala.inline
    def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDataConfigUndefined: Self = StObject.set(x, "OutputDataConfig", js.undefined)
    
    @scala.inline
    def setResourceConfig(value: ResourceConfig): Self = StObject.set(x, "ResourceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceConfigUndefined: Self = StObject.set(x, "ResourceConfig", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setSecondaryStatus(value: SecondaryStatus): Self = StObject.set(x, "SecondaryStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryStatusTransitions(value: SecondaryStatusTransitions): Self = StObject.set(x, "SecondaryStatusTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryStatusTransitionsUndefined: Self = StObject.set(x, "SecondaryStatusTransitions", js.undefined)
    
    @scala.inline
    def setSecondaryStatusTransitionsVarargs(value: SecondaryStatusTransition*): Self = StObject.set(x, "SecondaryStatusTransitions", js.Array(value :_*))
    
    @scala.inline
    def setSecondaryStatusUndefined: Self = StObject.set(x, "SecondaryStatus", js.undefined)
    
    @scala.inline
    def setStoppingCondition(value: StoppingCondition): Self = StObject.set(x, "StoppingCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoppingConditionUndefined: Self = StObject.set(x, "StoppingCondition", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTensorBoardOutputConfig(value: TensorBoardOutputConfig): Self = StObject.set(x, "TensorBoardOutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTensorBoardOutputConfigUndefined: Self = StObject.set(x, "TensorBoardOutputConfig", js.undefined)
    
    @scala.inline
    def setTrainingEndTime(value: Timestamp): Self = StObject.set(x, "TrainingEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingEndTimeUndefined: Self = StObject.set(x, "TrainingEndTime", js.undefined)
    
    @scala.inline
    def setTrainingJobArn(value: TrainingJobArn): Self = StObject.set(x, "TrainingJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingJobArnUndefined: Self = StObject.set(x, "TrainingJobArn", js.undefined)
    
    @scala.inline
    def setTrainingJobName(value: TrainingJobName): Self = StObject.set(x, "TrainingJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingJobNameUndefined: Self = StObject.set(x, "TrainingJobName", js.undefined)
    
    @scala.inline
    def setTrainingJobStatus(value: TrainingJobStatus): Self = StObject.set(x, "TrainingJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingJobStatusUndefined: Self = StObject.set(x, "TrainingJobStatus", js.undefined)
    
    @scala.inline
    def setTrainingStartTime(value: Timestamp): Self = StObject.set(x, "TrainingStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingStartTimeUndefined: Self = StObject.set(x, "TrainingStartTime", js.undefined)
    
    @scala.inline
    def setTrainingTimeInSeconds(value: TrainingTimeInSeconds): Self = StObject.set(x, "TrainingTimeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingTimeInSecondsUndefined: Self = StObject.set(x, "TrainingTimeInSeconds", js.undefined)
    
    @scala.inline
    def setTuningJobArn(value: HyperParameterTuningJobArn): Self = StObject.set(x, "TuningJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuningJobArnUndefined: Self = StObject.set(x, "TuningJobArn", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
