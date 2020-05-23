package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimulationJobRequest extends js.Object {
  /**
    * Compute information for the simulation job
    */
  var compute: js.UndefOr[Compute] = js.native
  /**
    * Specify data sources to mount read-only files from S3 into your simulation. These files are available under /opt/robomaker/datasources/data_source_name.   There is a limit of 100 files and a combined size of 25GB for all DataSourceConfig objects.  
    */
  var dataSources: js.UndefOr[DataSourceConfigs] = js.native
  /**
    * The failure behavior the simulation job.  Continue  Restart the simulation job in the same host instance.  Fail  Stop the simulation job and terminate the instance.  
    */
  var failureBehavior: js.UndefOr[FailureBehavior] = js.native
  /**
    * The IAM role name that allows the simulation instance to call the AWS APIs that are specified in its associated policies on your behalf. This is how credentials are passed in to your simulation job. 
    */
  var iamRole: js.UndefOr[IamRole] = js.native
  var loggingConfig: js.UndefOr[LoggingConfig] = js.native
  /**
    * The maximum simulation job duration in seconds. The value must be 8 days (691,200 seconds) or less.
    */
  var maxJobDurationInSeconds: JobDuration = js.native
  var outputLocation: js.UndefOr[OutputLocation] = js.native
  /**
    * The robot applications to use in the simulation job.
    */
  var robotApplications: js.UndefOr[RobotApplicationConfigs] = js.native
  /**
    * The simulation applications to use in the simulation job.
    */
  var simulationApplications: js.UndefOr[SimulationApplicationConfigs] = js.native
  /**
    * A map that contains tag keys and tag values that are attached to the simulation job request.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * Boolean indicating whether to use default simulation tool applications.
    */
  var useDefaultApplications: js.UndefOr[BoxedBoolean] = js.native
  var vpcConfig: js.UndefOr[VPCConfig] = js.native
}

object SimulationJobRequest {
  @scala.inline
  def apply(
    maxJobDurationInSeconds: JobDuration,
    compute: Compute = null,
    dataSources: DataSourceConfigs = null,
    failureBehavior: FailureBehavior = null,
    iamRole: IamRole = null,
    loggingConfig: LoggingConfig = null,
    outputLocation: OutputLocation = null,
    robotApplications: RobotApplicationConfigs = null,
    simulationApplications: SimulationApplicationConfigs = null,
    tags: TagMap = null,
    useDefaultApplications: js.UndefOr[BoxedBoolean] = js.undefined,
    vpcConfig: VPCConfig = null
  ): SimulationJobRequest = {
    val __obj = js.Dynamic.literal(maxJobDurationInSeconds = maxJobDurationInSeconds.asInstanceOf[js.Any])
    if (compute != null) __obj.updateDynamic("compute")(compute.asInstanceOf[js.Any])
    if (dataSources != null) __obj.updateDynamic("dataSources")(dataSources.asInstanceOf[js.Any])
    if (failureBehavior != null) __obj.updateDynamic("failureBehavior")(failureBehavior.asInstanceOf[js.Any])
    if (iamRole != null) __obj.updateDynamic("iamRole")(iamRole.asInstanceOf[js.Any])
    if (loggingConfig != null) __obj.updateDynamic("loggingConfig")(loggingConfig.asInstanceOf[js.Any])
    if (outputLocation != null) __obj.updateDynamic("outputLocation")(outputLocation.asInstanceOf[js.Any])
    if (robotApplications != null) __obj.updateDynamic("robotApplications")(robotApplications.asInstanceOf[js.Any])
    if (simulationApplications != null) __obj.updateDynamic("simulationApplications")(simulationApplications.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(useDefaultApplications)) __obj.updateDynamic("useDefaultApplications")(useDefaultApplications.get.asInstanceOf[js.Any])
    if (vpcConfig != null) __obj.updateDynamic("vpcConfig")(vpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulationJobRequest]
  }
}

