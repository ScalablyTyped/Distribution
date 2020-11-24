package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProcessingJobResponse extends js.Object {
  
  /**
    * Configures the processing job to run a specified container image.
    */
  var AppSpecification: typings.awsSdk.sagemakerMod.AppSpecification = js.native
  
  /**
    * The ARN of an AutoML job associated with this processing job.
    */
  var AutoMLJobArn: js.UndefOr[typings.awsSdk.sagemakerMod.AutoMLJobArn] = js.native
  
  /**
    * The time at which the processing job was created.
    */
  var CreationTime: Timestamp = js.native
  
  /**
    * The environment variables set in the Docker container.
    */
  var Environment: js.UndefOr[ProcessingEnvironmentMap] = js.native
  
  /**
    * An optional string, up to one KB in size, that contains metadata from the processing container when the processing job exits.
    */
  var ExitMessage: js.UndefOr[typings.awsSdk.sagemakerMod.ExitMessage] = js.native
  
  /**
    * The configuration information used to create an experiment.
    */
  var ExperimentConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentConfig] = js.native
  
  /**
    * A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.native
  
  /**
    * The time at which the processing job was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ARN of a monitoring schedule for an endpoint associated with this processing job.
    */
  var MonitoringScheduleArn: js.UndefOr[typings.awsSdk.sagemakerMod.MonitoringScheduleArn] = js.native
  
  /**
    * Networking options for a processing job.
    */
  var NetworkConfig: js.UndefOr[typings.awsSdk.sagemakerMod.NetworkConfig] = js.native
  
  /**
    * The time at which the processing job completed.
    */
  var ProcessingEndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The inputs for a processing job.
    */
  var ProcessingInputs: js.UndefOr[typings.awsSdk.sagemakerMod.ProcessingInputs] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the processing job.
    */
  var ProcessingJobArn: typings.awsSdk.sagemakerMod.ProcessingJobArn = js.native
  
  /**
    * The name of the processing job. The name must be unique within an AWS Region in the AWS account.
    */
  var ProcessingJobName: typings.awsSdk.sagemakerMod.ProcessingJobName = js.native
  
  /**
    * Provides the status of a processing job.
    */
  var ProcessingJobStatus: typings.awsSdk.sagemakerMod.ProcessingJobStatus = js.native
  
  /**
    * Output configuration for the processing job.
    */
  var ProcessingOutputConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ProcessingOutputConfig] = js.native
  
  /**
    * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In distributed training, you specify more than one instance.
    */
  var ProcessingResources: typings.awsSdk.sagemakerMod.ProcessingResources = js.native
  
  /**
    * The time at which the processing job started.
    */
  var ProcessingStartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.sagemakerMod.RoleArn] = js.native
  
  /**
    * The time limit for how long the processing job is allowed to run.
    */
  var StoppingCondition: js.UndefOr[ProcessingStoppingCondition] = js.native
  
  /**
    * The ARN of a training job associated with this processing job.
    */
  var TrainingJobArn: js.UndefOr[typings.awsSdk.sagemakerMod.TrainingJobArn] = js.native
}
object DescribeProcessingJobResponse {
  
  @scala.inline
  def apply(
    AppSpecification: AppSpecification,
    CreationTime: Timestamp,
    ProcessingJobArn: ProcessingJobArn,
    ProcessingJobName: ProcessingJobName,
    ProcessingJobStatus: ProcessingJobStatus,
    ProcessingResources: ProcessingResources
  ): DescribeProcessingJobResponse = {
    val __obj = js.Dynamic.literal(AppSpecification = AppSpecification.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], ProcessingJobArn = ProcessingJobArn.asInstanceOf[js.Any], ProcessingJobName = ProcessingJobName.asInstanceOf[js.Any], ProcessingJobStatus = ProcessingJobStatus.asInstanceOf[js.Any], ProcessingResources = ProcessingResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProcessingJobResponse]
  }
  
  @scala.inline
  implicit class DescribeProcessingJobResponseOps[Self <: DescribeProcessingJobResponse] (val x: Self) extends AnyVal {
    
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
    def setAppSpecification(value: AppSpecification): Self = this.set("AppSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingJobArn(value: ProcessingJobArn): Self = this.set("ProcessingJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingJobName(value: ProcessingJobName): Self = this.set("ProcessingJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingJobStatus(value: ProcessingJobStatus): Self = this.set("ProcessingJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingResources(value: ProcessingResources): Self = this.set("ProcessingResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLJobArn(value: AutoMLJobArn): Self = this.set("AutoMLJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoMLJobArn: Self = this.set("AutoMLJobArn", js.undefined)
    
    @scala.inline
    def setEnvironment(value: ProcessingEnvironmentMap): Self = this.set("Environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("Environment", js.undefined)
    
    @scala.inline
    def setExitMessage(value: ExitMessage): Self = this.set("ExitMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitMessage: Self = this.set("ExitMessage", js.undefined)
    
    @scala.inline
    def setExperimentConfig(value: ExperimentConfig): Self = this.set("ExperimentConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimentConfig: Self = this.set("ExperimentConfig", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    
    @scala.inline
    def setMonitoringScheduleArn(value: MonitoringScheduleArn): Self = this.set("MonitoringScheduleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoringScheduleArn: Self = this.set("MonitoringScheduleArn", js.undefined)
    
    @scala.inline
    def setNetworkConfig(value: NetworkConfig): Self = this.set("NetworkConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkConfig: Self = this.set("NetworkConfig", js.undefined)
    
    @scala.inline
    def setProcessingEndTime(value: Timestamp): Self = this.set("ProcessingEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingEndTime: Self = this.set("ProcessingEndTime", js.undefined)
    
    @scala.inline
    def setProcessingInputsVarargs(value: ProcessingInput*): Self = this.set("ProcessingInputs", js.Array(value :_*))
    
    @scala.inline
    def setProcessingInputs(value: ProcessingInputs): Self = this.set("ProcessingInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingInputs: Self = this.set("ProcessingInputs", js.undefined)
    
    @scala.inline
    def setProcessingOutputConfig(value: ProcessingOutputConfig): Self = this.set("ProcessingOutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingOutputConfig: Self = this.set("ProcessingOutputConfig", js.undefined)
    
    @scala.inline
    def setProcessingStartTime(value: Timestamp): Self = this.set("ProcessingStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingStartTime: Self = this.set("ProcessingStartTime", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    
    @scala.inline
    def setStoppingCondition(value: ProcessingStoppingCondition): Self = this.set("StoppingCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoppingCondition: Self = this.set("StoppingCondition", js.undefined)
    
    @scala.inline
    def setTrainingJobArn(value: TrainingJobArn): Self = this.set("TrainingJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingJobArn: Self = this.set("TrainingJobArn", js.undefined)
  }
}
