package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    AppSpecification: AppSpecification = null,
    AutoMLJobArn: AutoMLJobArn = null,
    CreationTime: Timestamp = null,
    Environment: ProcessingEnvironmentMap = null,
    ExitMessage: ExitMessage = null,
    ExperimentConfig: ExperimentConfig = null,
    FailureReason: FailureReason = null,
    LastModifiedTime: Timestamp = null,
    MonitoringScheduleArn: MonitoringScheduleArn = null,
    NetworkConfig: NetworkConfig = null,
    ProcessingEndTime: Timestamp = null,
    ProcessingInputs: ProcessingInputs = null,
    ProcessingJobArn: ProcessingJobArn = null,
    ProcessingJobName: ProcessingJobName = null,
    ProcessingJobStatus: ProcessingJobStatus = null,
    ProcessingOutputConfig: ProcessingOutputConfig = null,
    ProcessingResources: ProcessingResources = null,
    ProcessingStartTime: Timestamp = null,
    RoleArn: RoleArn = null,
    StoppingCondition: ProcessingStoppingCondition = null,
    Tags: TagList = null,
    TrainingJobArn: TrainingJobArn = null
  ): ProcessingJob = {
    val __obj = js.Dynamic.literal()
    if (AppSpecification != null) __obj.updateDynamic("AppSpecification")(AppSpecification.asInstanceOf[js.Any])
    if (AutoMLJobArn != null) __obj.updateDynamic("AutoMLJobArn")(AutoMLJobArn.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (Environment != null) __obj.updateDynamic("Environment")(Environment.asInstanceOf[js.Any])
    if (ExitMessage != null) __obj.updateDynamic("ExitMessage")(ExitMessage.asInstanceOf[js.Any])
    if (ExperimentConfig != null) __obj.updateDynamic("ExperimentConfig")(ExperimentConfig.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (MonitoringScheduleArn != null) __obj.updateDynamic("MonitoringScheduleArn")(MonitoringScheduleArn.asInstanceOf[js.Any])
    if (NetworkConfig != null) __obj.updateDynamic("NetworkConfig")(NetworkConfig.asInstanceOf[js.Any])
    if (ProcessingEndTime != null) __obj.updateDynamic("ProcessingEndTime")(ProcessingEndTime.asInstanceOf[js.Any])
    if (ProcessingInputs != null) __obj.updateDynamic("ProcessingInputs")(ProcessingInputs.asInstanceOf[js.Any])
    if (ProcessingJobArn != null) __obj.updateDynamic("ProcessingJobArn")(ProcessingJobArn.asInstanceOf[js.Any])
    if (ProcessingJobName != null) __obj.updateDynamic("ProcessingJobName")(ProcessingJobName.asInstanceOf[js.Any])
    if (ProcessingJobStatus != null) __obj.updateDynamic("ProcessingJobStatus")(ProcessingJobStatus.asInstanceOf[js.Any])
    if (ProcessingOutputConfig != null) __obj.updateDynamic("ProcessingOutputConfig")(ProcessingOutputConfig.asInstanceOf[js.Any])
    if (ProcessingResources != null) __obj.updateDynamic("ProcessingResources")(ProcessingResources.asInstanceOf[js.Any])
    if (ProcessingStartTime != null) __obj.updateDynamic("ProcessingStartTime")(ProcessingStartTime.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (StoppingCondition != null) __obj.updateDynamic("StoppingCondition")(StoppingCondition.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TrainingJobArn != null) __obj.updateDynamic("TrainingJobArn")(TrainingJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingJob]
  }
}

