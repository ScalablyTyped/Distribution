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
  def apply(maxJobDurationInSeconds: JobDuration): SimulationJobRequest = {
    val __obj = js.Dynamic.literal(maxJobDurationInSeconds = maxJobDurationInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulationJobRequest]
  }
  @scala.inline
  implicit class SimulationJobRequestOps[Self <: SimulationJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxJobDurationInSeconds(value: JobDuration): Self = this.set("maxJobDurationInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompute(value: Compute): Self = this.set("compute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompute: Self = this.set("compute", js.undefined)
    @scala.inline
    def setDataSourcesVarargs(value: DataSourceConfig*): Self = this.set("dataSources", js.Array(value :_*))
    @scala.inline
    def setDataSources(value: DataSourceConfigs): Self = this.set("dataSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSources: Self = this.set("dataSources", js.undefined)
    @scala.inline
    def setFailureBehavior(value: FailureBehavior): Self = this.set("failureBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureBehavior: Self = this.set("failureBehavior", js.undefined)
    @scala.inline
    def setIamRole(value: IamRole): Self = this.set("iamRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamRole: Self = this.set("iamRole", js.undefined)
    @scala.inline
    def setLoggingConfig(value: LoggingConfig): Self = this.set("loggingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingConfig: Self = this.set("loggingConfig", js.undefined)
    @scala.inline
    def setOutputLocation(value: OutputLocation): Self = this.set("outputLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputLocation: Self = this.set("outputLocation", js.undefined)
    @scala.inline
    def setRobotApplicationsVarargs(value: RobotApplicationConfig*): Self = this.set("robotApplications", js.Array(value :_*))
    @scala.inline
    def setRobotApplications(value: RobotApplicationConfigs): Self = this.set("robotApplications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRobotApplications: Self = this.set("robotApplications", js.undefined)
    @scala.inline
    def setSimulationApplicationsVarargs(value: SimulationApplicationConfig*): Self = this.set("simulationApplications", js.Array(value :_*))
    @scala.inline
    def setSimulationApplications(value: SimulationApplicationConfigs): Self = this.set("simulationApplications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimulationApplications: Self = this.set("simulationApplications", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setUseDefaultApplications(value: BoxedBoolean): Self = this.set("useDefaultApplications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseDefaultApplications: Self = this.set("useDefaultApplications", js.undefined)
    @scala.inline
    def setVpcConfig(value: VPCConfig): Self = this.set("vpcConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConfig: Self = this.set("vpcConfig", js.undefined)
  }
  
}

