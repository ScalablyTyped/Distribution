package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringJobDefinition extends js.Object {
  /**
    * Baseline configuration used to validate that the data conforms to the specified constraints and statistics
    */
  var BaselineConfig: js.UndefOr[MonitoringBaselineConfig] = js.native
  /**
    * Sets the environment variables in the Docker container.
    */
  var Environment: js.UndefOr[MonitoringEnvironmentMap] = js.native
  /**
    * Configures the monitoring job to run a specified Docker container image.
    */
  var MonitoringAppSpecification: typings.awsSdk.sagemakerMod.MonitoringAppSpecification = js.native
  /**
    * The array of inputs for the monitoring job. Currently we support monitoring an Amazon SageMaker Endpoint.
    */
  var MonitoringInputs: typings.awsSdk.sagemakerMod.MonitoringInputs = js.native
  /**
    * The array of outputs from the monitoring job to be uploaded to Amazon Simple Storage Service (Amazon S3).
    */
  var MonitoringOutputConfig: typings.awsSdk.sagemakerMod.MonitoringOutputConfig = js.native
  /**
    * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a monitoring job. In distributed processing, you specify more than one instance.
    */
  var MonitoringResources: typings.awsSdk.sagemakerMod.MonitoringResources = js.native
  /**
    * Specifies networking options for an monitoring job.
    */
  var NetworkConfig: js.UndefOr[typings.awsSdk.sagemakerMod.NetworkConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn = js.native
  /**
    * Specifies a time limit for how long the monitoring job is allowed to run.
    */
  var StoppingCondition: js.UndefOr[MonitoringStoppingCondition] = js.native
}

object MonitoringJobDefinition {
  @scala.inline
  def apply(
    MonitoringAppSpecification: MonitoringAppSpecification,
    MonitoringInputs: MonitoringInputs,
    MonitoringOutputConfig: MonitoringOutputConfig,
    MonitoringResources: MonitoringResources,
    RoleArn: RoleArn,
    BaselineConfig: MonitoringBaselineConfig = null,
    Environment: MonitoringEnvironmentMap = null,
    NetworkConfig: NetworkConfig = null,
    StoppingCondition: MonitoringStoppingCondition = null
  ): MonitoringJobDefinition = {
    val __obj = js.Dynamic.literal(MonitoringAppSpecification = MonitoringAppSpecification.asInstanceOf[js.Any], MonitoringInputs = MonitoringInputs.asInstanceOf[js.Any], MonitoringOutputConfig = MonitoringOutputConfig.asInstanceOf[js.Any], MonitoringResources = MonitoringResources.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    if (BaselineConfig != null) __obj.updateDynamic("BaselineConfig")(BaselineConfig.asInstanceOf[js.Any])
    if (Environment != null) __obj.updateDynamic("Environment")(Environment.asInstanceOf[js.Any])
    if (NetworkConfig != null) __obj.updateDynamic("NetworkConfig")(NetworkConfig.asInstanceOf[js.Any])
    if (StoppingCondition != null) __obj.updateDynamic("StoppingCondition")(StoppingCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringJobDefinition]
  }
}

