package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimulationJobRequest extends StObject {
  
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
  implicit class SimulationJobRequestMutableBuilder[Self <: SimulationJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompute(value: Compute): Self = StObject.set(x, "compute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeUndefined: Self = StObject.set(x, "compute", js.undefined)
    
    @scala.inline
    def setDataSources(value: DataSourceConfigs): Self = StObject.set(x, "dataSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourcesUndefined: Self = StObject.set(x, "dataSources", js.undefined)
    
    @scala.inline
    def setDataSourcesVarargs(value: DataSourceConfig*): Self = StObject.set(x, "dataSources", js.Array(value :_*))
    
    @scala.inline
    def setFailureBehavior(value: FailureBehavior): Self = StObject.set(x, "failureBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureBehaviorUndefined: Self = StObject.set(x, "failureBehavior", js.undefined)
    
    @scala.inline
    def setIamRole(value: IamRole): Self = StObject.set(x, "iamRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRoleUndefined: Self = StObject.set(x, "iamRole", js.undefined)
    
    @scala.inline
    def setLoggingConfig(value: LoggingConfig): Self = StObject.set(x, "loggingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingConfigUndefined: Self = StObject.set(x, "loggingConfig", js.undefined)
    
    @scala.inline
    def setMaxJobDurationInSeconds(value: JobDuration): Self = StObject.set(x, "maxJobDurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputLocation(value: OutputLocation): Self = StObject.set(x, "outputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputLocationUndefined: Self = StObject.set(x, "outputLocation", js.undefined)
    
    @scala.inline
    def setRobotApplications(value: RobotApplicationConfigs): Self = StObject.set(x, "robotApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRobotApplicationsUndefined: Self = StObject.set(x, "robotApplications", js.undefined)
    
    @scala.inline
    def setRobotApplicationsVarargs(value: RobotApplicationConfig*): Self = StObject.set(x, "robotApplications", js.Array(value :_*))
    
    @scala.inline
    def setSimulationApplications(value: SimulationApplicationConfigs): Self = StObject.set(x, "simulationApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulationApplicationsUndefined: Self = StObject.set(x, "simulationApplications", js.undefined)
    
    @scala.inline
    def setSimulationApplicationsVarargs(value: SimulationApplicationConfig*): Self = StObject.set(x, "simulationApplications", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setUseDefaultApplications(value: BoxedBoolean): Self = StObject.set(x, "useDefaultApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDefaultApplicationsUndefined: Self = StObject.set(x, "useDefaultApplications", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VPCConfig): Self = StObject.set(x, "vpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigUndefined: Self = StObject.set(x, "vpcConfig", js.undefined)
  }
}
