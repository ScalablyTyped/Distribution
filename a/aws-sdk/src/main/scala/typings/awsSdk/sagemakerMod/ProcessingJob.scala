package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessingJob extends js.Object {
  
  var AppSpecification: js.UndefOr[typings.awsSdk.sagemakerMod.AppSpecification] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AutoML job associated with this processing job.
    */
  var AutoMLJobArn: js.UndefOr[typings.awsSdk.sagemakerMod.AutoMLJobArn] = js.native
  
  /**
    * The time the processing job was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Sets the environment variables in the Docker container.
    */
  var Environment: js.UndefOr[ProcessingEnvironmentMap] = js.native
  
  /**
    * A string, up to one KB in size, that contains metadata from the processing container when the processing job exits.
    */
  var ExitMessage: js.UndefOr[typings.awsSdk.sagemakerMod.ExitMessage] = js.native
  
  var ExperimentConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentConfig] = js.native
  
  /**
    * A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.native
  
  /**
    * The time the processing job was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ARN of a monitoring schedule for an endpoint associated with this processing job.
    */
  var MonitoringScheduleArn: js.UndefOr[typings.awsSdk.sagemakerMod.MonitoringScheduleArn] = js.native
  
  var NetworkConfig: js.UndefOr[typings.awsSdk.sagemakerMod.NetworkConfig] = js.native
  
  /**
    * The time that the processing job ended.
    */
  var ProcessingEndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * For each input, data is downloaded from S3 into the processing container before the processing job begins running if "S3InputMode" is set to File.
    */
  var ProcessingInputs: js.UndefOr[typings.awsSdk.sagemakerMod.ProcessingInputs] = js.native
  
  /**
    * The ARN of the processing job.
    */
  var ProcessingJobArn: js.UndefOr[typings.awsSdk.sagemakerMod.ProcessingJobArn] = js.native
  
  /**
    * The name of the processing job.
    */
  var ProcessingJobName: js.UndefOr[typings.awsSdk.sagemakerMod.ProcessingJobName] = js.native
  
  /**
    * The status of the processing job.
    */
  var ProcessingJobStatus: js.UndefOr[typings.awsSdk.sagemakerMod.ProcessingJobStatus] = js.native
  
  var ProcessingOutputConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ProcessingOutputConfig] = js.native
  
  var ProcessingResources: js.UndefOr[typings.awsSdk.sagemakerMod.ProcessingResources] = js.native
  
  /**
    * The time that the processing job started.
    */
  var ProcessingStartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ARN of the role used to create the processing job.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.sagemakerMod.RoleArn] = js.native
  
  var StoppingCondition: js.UndefOr[ProcessingStoppingCondition] = js.native
  
  /**
    * An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ARN of the training job associated with this processing job.
    */
  var TrainingJobArn: js.UndefOr[typings.awsSdk.sagemakerMod.TrainingJobArn] = js.native
}
object ProcessingJob {
  
  @scala.inline
  def apply(): ProcessingJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessingJob]
  }
  
  @scala.inline
  implicit class ProcessingJobOps[Self <: ProcessingJob] (val x: Self) extends AnyVal {
    
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
    def deleteAppSpecification: Self = this.set("AppSpecification", js.undefined)
    
    @scala.inline
    def setAutoMLJobArn(value: AutoMLJobArn): Self = this.set("AutoMLJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoMLJobArn: Self = this.set("AutoMLJobArn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
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
    def setProcessingJobArn(value: ProcessingJobArn): Self = this.set("ProcessingJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingJobArn: Self = this.set("ProcessingJobArn", js.undefined)
    
    @scala.inline
    def setProcessingJobName(value: ProcessingJobName): Self = this.set("ProcessingJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingJobName: Self = this.set("ProcessingJobName", js.undefined)
    
    @scala.inline
    def setProcessingJobStatus(value: ProcessingJobStatus): Self = this.set("ProcessingJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingJobStatus: Self = this.set("ProcessingJobStatus", js.undefined)
    
    @scala.inline
    def setProcessingOutputConfig(value: ProcessingOutputConfig): Self = this.set("ProcessingOutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingOutputConfig: Self = this.set("ProcessingOutputConfig", js.undefined)
    
    @scala.inline
    def setProcessingResources(value: ProcessingResources): Self = this.set("ProcessingResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingResources: Self = this.set("ProcessingResources", js.undefined)
    
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
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setTrainingJobArn(value: TrainingJobArn): Self = this.set("TrainingJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingJobArn: Self = this.set("TrainingJobArn", js.undefined)
  }
}
