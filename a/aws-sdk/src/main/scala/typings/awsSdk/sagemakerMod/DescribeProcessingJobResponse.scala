package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProcessingJobResponse extends StObject {
  
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
  implicit class DescribeProcessingJobResponseMutableBuilder[Self <: DescribeProcessingJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppSpecification(value: AppSpecification): Self = StObject.set(x, "AppSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLJobArn(value: AutoMLJobArn): Self = StObject.set(x, "AutoMLJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLJobArnUndefined: Self = StObject.set(x, "AutoMLJobArn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: ProcessingEnvironmentMap): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    @scala.inline
    def setExitMessage(value: ExitMessage): Self = StObject.set(x, "ExitMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitMessageUndefined: Self = StObject.set(x, "ExitMessage", js.undefined)
    
    @scala.inline
    def setExperimentConfig(value: ExperimentConfig): Self = StObject.set(x, "ExperimentConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentConfigUndefined: Self = StObject.set(x, "ExperimentConfig", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setMonitoringScheduleArn(value: MonitoringScheduleArn): Self = StObject.set(x, "MonitoringScheduleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringScheduleArnUndefined: Self = StObject.set(x, "MonitoringScheduleArn", js.undefined)
    
    @scala.inline
    def setNetworkConfig(value: NetworkConfig): Self = StObject.set(x, "NetworkConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkConfigUndefined: Self = StObject.set(x, "NetworkConfig", js.undefined)
    
    @scala.inline
    def setProcessingEndTime(value: Timestamp): Self = StObject.set(x, "ProcessingEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingEndTimeUndefined: Self = StObject.set(x, "ProcessingEndTime", js.undefined)
    
    @scala.inline
    def setProcessingInputs(value: ProcessingInputs): Self = StObject.set(x, "ProcessingInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingInputsUndefined: Self = StObject.set(x, "ProcessingInputs", js.undefined)
    
    @scala.inline
    def setProcessingInputsVarargs(value: ProcessingInput*): Self = StObject.set(x, "ProcessingInputs", js.Array(value :_*))
    
    @scala.inline
    def setProcessingJobArn(value: ProcessingJobArn): Self = StObject.set(x, "ProcessingJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingJobName(value: ProcessingJobName): Self = StObject.set(x, "ProcessingJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingJobStatus(value: ProcessingJobStatus): Self = StObject.set(x, "ProcessingJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingOutputConfig(value: ProcessingOutputConfig): Self = StObject.set(x, "ProcessingOutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingOutputConfigUndefined: Self = StObject.set(x, "ProcessingOutputConfig", js.undefined)
    
    @scala.inline
    def setProcessingResources(value: ProcessingResources): Self = StObject.set(x, "ProcessingResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingStartTime(value: Timestamp): Self = StObject.set(x, "ProcessingStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingStartTimeUndefined: Self = StObject.set(x, "ProcessingStartTime", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setStoppingCondition(value: ProcessingStoppingCondition): Self = StObject.set(x, "StoppingCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoppingConditionUndefined: Self = StObject.set(x, "StoppingCondition", js.undefined)
    
    @scala.inline
    def setTrainingJobArn(value: TrainingJobArn): Self = StObject.set(x, "TrainingJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingJobArnUndefined: Self = StObject.set(x, "TrainingJobArn", js.undefined)
  }
}
