package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProcessingJobRequest extends js.Object {
  /**
    * Configures the processing job to run a specified Docker container image.
    */
  var AppSpecification: typings.awsSdk.sagemakerMod.AppSpecification = js.native
  /**
    * Sets the environment variables in the Docker container.
    */
  var Environment: js.UndefOr[ProcessingEnvironmentMap] = js.native
  var ExperimentConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentConfig] = js.native
  /**
    * Networking options for a processing job.
    */
  var NetworkConfig: js.UndefOr[typings.awsSdk.sagemakerMod.NetworkConfig] = js.native
  /**
    * For each input, data is downloaded from S3 into the processing container before the processing job begins running if "S3InputMode" is set to File.
    */
  var ProcessingInputs: js.UndefOr[typings.awsSdk.sagemakerMod.ProcessingInputs] = js.native
  /**
    *  The name of the processing job. The name must be unique within an AWS Region in the AWS account.
    */
  var ProcessingJobName: typings.awsSdk.sagemakerMod.ProcessingJobName = js.native
  /**
    * Output configuration for the processing job.
    */
  var ProcessingOutputConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ProcessingOutputConfig] = js.native
  /**
    * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In distributed training, you specify more than one instance.
    */
  var ProcessingResources: typings.awsSdk.sagemakerMod.ProcessingResources = js.native
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn = js.native
  /**
    * The time limit for how long the processing job is allowed to run.
    */
  var StoppingCondition: js.UndefOr[ProcessingStoppingCondition] = js.native
  /**
    * (Optional) An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateProcessingJobRequest {
  @scala.inline
  def apply(
    AppSpecification: AppSpecification,
    ProcessingJobName: ProcessingJobName,
    ProcessingResources: ProcessingResources,
    RoleArn: RoleArn,
    Environment: ProcessingEnvironmentMap = null,
    ExperimentConfig: ExperimentConfig = null,
    NetworkConfig: NetworkConfig = null,
    ProcessingInputs: ProcessingInputs = null,
    ProcessingOutputConfig: ProcessingOutputConfig = null,
    StoppingCondition: ProcessingStoppingCondition = null,
    Tags: TagList = null
  ): CreateProcessingJobRequest = {
    val __obj = js.Dynamic.literal(AppSpecification = AppSpecification.asInstanceOf[js.Any], ProcessingJobName = ProcessingJobName.asInstanceOf[js.Any], ProcessingResources = ProcessingResources.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    if (Environment != null) __obj.updateDynamic("Environment")(Environment.asInstanceOf[js.Any])
    if (ExperimentConfig != null) __obj.updateDynamic("ExperimentConfig")(ExperimentConfig.asInstanceOf[js.Any])
    if (NetworkConfig != null) __obj.updateDynamic("NetworkConfig")(NetworkConfig.asInstanceOf[js.Any])
    if (ProcessingInputs != null) __obj.updateDynamic("ProcessingInputs")(ProcessingInputs.asInstanceOf[js.Any])
    if (ProcessingOutputConfig != null) __obj.updateDynamic("ProcessingOutputConfig")(ProcessingOutputConfig.asInstanceOf[js.Any])
    if (StoppingCondition != null) __obj.updateDynamic("StoppingCondition")(StoppingCondition.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProcessingJobRequest]
  }
}

