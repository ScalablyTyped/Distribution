package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): TrainingJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingJob]
  }
  
  @scala.inline
  implicit class TrainingJobOps[Self <: TrainingJob] (val x: Self) extends AnyVal {
    
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
    def setAlgorithmSpecification(value: AlgorithmSpecification): Self = this.set("AlgorithmSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithmSpecification: Self = this.set("AlgorithmSpecification", js.undefined)
    
    @scala.inline
    def setAutoMLJobArn(value: AutoMLJobArn): Self = this.set("AutoMLJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoMLJobArn: Self = this.set("AutoMLJobArn", js.undefined)
    
    @scala.inline
    def setBillableTimeInSeconds(value: BillableTimeInSeconds): Self = this.set("BillableTimeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillableTimeInSeconds: Self = this.set("BillableTimeInSeconds", js.undefined)
    
    @scala.inline
    def setCheckpointConfig(value: CheckpointConfig): Self = this.set("CheckpointConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckpointConfig: Self = this.set("CheckpointConfig", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setDebugHookConfig(value: DebugHookConfig): Self = this.set("DebugHookConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugHookConfig: Self = this.set("DebugHookConfig", js.undefined)
    
    @scala.inline
    def setDebugRuleConfigurationsVarargs(value: DebugRuleConfiguration*): Self = this.set("DebugRuleConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setDebugRuleConfigurations(value: DebugRuleConfigurations): Self = this.set("DebugRuleConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugRuleConfigurations: Self = this.set("DebugRuleConfigurations", js.undefined)
    
    @scala.inline
    def setDebugRuleEvaluationStatusesVarargs(value: DebugRuleEvaluationStatus*): Self = this.set("DebugRuleEvaluationStatuses", js.Array(value :_*))
    
    @scala.inline
    def setDebugRuleEvaluationStatuses(value: DebugRuleEvaluationStatuses): Self = this.set("DebugRuleEvaluationStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugRuleEvaluationStatuses: Self = this.set("DebugRuleEvaluationStatuses", js.undefined)
    
    @scala.inline
    def setEnableInterContainerTrafficEncryption(value: Boolean): Self = this.set("EnableInterContainerTrafficEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableInterContainerTrafficEncryption: Self = this.set("EnableInterContainerTrafficEncryption", js.undefined)
    
    @scala.inline
    def setEnableManagedSpotTraining(value: Boolean): Self = this.set("EnableManagedSpotTraining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableManagedSpotTraining: Self = this.set("EnableManagedSpotTraining", js.undefined)
    
    @scala.inline
    def setEnableNetworkIsolation(value: Boolean): Self = this.set("EnableNetworkIsolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableNetworkIsolation: Self = this.set("EnableNetworkIsolation", js.undefined)
    
    @scala.inline
    def setExperimentConfig(value: ExperimentConfig): Self = this.set("ExperimentConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimentConfig: Self = this.set("ExperimentConfig", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    
    @scala.inline
    def setFinalMetricDataListVarargs(value: MetricData*): Self = this.set("FinalMetricDataList", js.Array(value :_*))
    
    @scala.inline
    def setFinalMetricDataList(value: FinalMetricDataList): Self = this.set("FinalMetricDataList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalMetricDataList: Self = this.set("FinalMetricDataList", js.undefined)
    
    @scala.inline
    def setHyperParameters(value: HyperParameters): Self = this.set("HyperParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyperParameters: Self = this.set("HyperParameters", js.undefined)
    
    @scala.inline
    def setInputDataConfigVarargs(value: Channel*): Self = this.set("InputDataConfig", js.Array(value :_*))
    
    @scala.inline
    def setInputDataConfig(value: InputDataConfig): Self = this.set("InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputDataConfig: Self = this.set("InputDataConfig", js.undefined)
    
    @scala.inline
    def setLabelingJobArn(value: LabelingJobArn): Self = this.set("LabelingJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelingJobArn: Self = this.set("LabelingJobArn", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    
    @scala.inline
    def setModelArtifacts(value: ModelArtifacts): Self = this.set("ModelArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelArtifacts: Self = this.set("ModelArtifacts", js.undefined)
    
    @scala.inline
    def setOutputDataConfig(value: OutputDataConfig): Self = this.set("OutputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputDataConfig: Self = this.set("OutputDataConfig", js.undefined)
    
    @scala.inline
    def setResourceConfig(value: ResourceConfig): Self = this.set("ResourceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceConfig: Self = this.set("ResourceConfig", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    
    @scala.inline
    def setSecondaryStatus(value: SecondaryStatus): Self = this.set("SecondaryStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryStatus: Self = this.set("SecondaryStatus", js.undefined)
    
    @scala.inline
    def setSecondaryStatusTransitionsVarargs(value: SecondaryStatusTransition*): Self = this.set("SecondaryStatusTransitions", js.Array(value :_*))
    
    @scala.inline
    def setSecondaryStatusTransitions(value: SecondaryStatusTransitions): Self = this.set("SecondaryStatusTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryStatusTransitions: Self = this.set("SecondaryStatusTransitions", js.undefined)
    
    @scala.inline
    def setStoppingCondition(value: StoppingCondition): Self = this.set("StoppingCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoppingCondition: Self = this.set("StoppingCondition", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setTensorBoardOutputConfig(value: TensorBoardOutputConfig): Self = this.set("TensorBoardOutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTensorBoardOutputConfig: Self = this.set("TensorBoardOutputConfig", js.undefined)
    
    @scala.inline
    def setTrainingEndTime(value: Timestamp): Self = this.set("TrainingEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingEndTime: Self = this.set("TrainingEndTime", js.undefined)
    
    @scala.inline
    def setTrainingJobArn(value: TrainingJobArn): Self = this.set("TrainingJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingJobArn: Self = this.set("TrainingJobArn", js.undefined)
    
    @scala.inline
    def setTrainingJobName(value: TrainingJobName): Self = this.set("TrainingJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingJobName: Self = this.set("TrainingJobName", js.undefined)
    
    @scala.inline
    def setTrainingJobStatus(value: TrainingJobStatus): Self = this.set("TrainingJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingJobStatus: Self = this.set("TrainingJobStatus", js.undefined)
    
    @scala.inline
    def setTrainingStartTime(value: Timestamp): Self = this.set("TrainingStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingStartTime: Self = this.set("TrainingStartTime", js.undefined)
    
    @scala.inline
    def setTrainingTimeInSeconds(value: TrainingTimeInSeconds): Self = this.set("TrainingTimeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingTimeInSeconds: Self = this.set("TrainingTimeInSeconds", js.undefined)
    
    @scala.inline
    def setTuningJobArn(value: HyperParameterTuningJobArn): Self = this.set("TuningJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTuningJobArn: Self = this.set("TuningJobArn", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = this.set("VpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConfig: Self = this.set("VpcConfig", js.undefined)
  }
}
