package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FleetAttributes extends js.Object {
  
  /**
    *  The Amazon Resource Name (ARN) associated with the GameLift build resource that is deployed on instances in this fleet. In a GameLift build ARN, the resource ID matches the BuildId value.
    */
  var BuildArn: js.UndefOr[typings.awsSdk.gameliftMod.BuildArn] = js.native
  
  /**
    * A unique identifier for a build.
    */
  var BuildId: js.UndefOr[typings.awsSdk.gameliftMod.BuildId] = js.native
  
  /**
    * Indicates whether a TLS/SSL certificate was generated for the fleet. 
    */
  var CertificateConfiguration: js.UndefOr[typings.awsSdk.gameliftMod.CertificateConfiguration] = js.native
  
  /**
    * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Human-readable description of the fleet.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. In a GameLift fleet ARN, the resource ID matches the FleetId value.
    */
  var FleetArn: js.UndefOr[typings.awsSdk.gameliftMod.FleetArn] = js.native
  
  /**
    * A unique identifier for a fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.gameliftMod.FleetId] = js.native
  
  /**
    * Indicates whether the fleet uses on-demand or spot instances. A spot instance in use may be interrupted with a two-minute notification.
    */
  var FleetType: js.UndefOr[typings.awsSdk.gameliftMod.FleetType] = js.native
  
  /**
    * A unique identifier for an AWS IAM role that manages access to your AWS services. With an instance role ARN set, any application that runs on an instance in this fleet can assume the role, including install scripts, server processes, and daemons (background processes). Create a role or look up a role's ARN from the IAM dashboard in the AWS Management Console. Learn more about using on-box credentials for your game servers at  Access external resources from a game server.
    */
  var InstanceRoleArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * EC2 instance type indicating the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. See Amazon EC2 Instance Types for detailed descriptions.
    */
  var InstanceType: js.UndefOr[EC2InstanceType] = js.native
  
  /**
    * Location of default log files. When a server process is shut down, Amazon GameLift captures and stores any log files in this location. These logs are in addition to game session logs; see more on game session logs in the Amazon GameLift Developer Guide. If no default log path for a fleet is specified, Amazon GameLift automatically uploads logs that are stored on each instance at C:\game\logs (for Windows) or /local/game/logs (for Linux). Use the Amazon GameLift console to access stored logs. 
    */
  var LogPaths: js.UndefOr[StringList] = js.native
  
  /**
    * Names of metric groups that this fleet is included in. In Amazon CloudWatch, you can view metrics for an individual fleet or aggregated metrics for fleets that are in a fleet metric group. A fleet can be included in only one metric group at a time.
    */
  var MetricGroups: js.UndefOr[MetricGroupList] = js.native
  
  /**
    * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * The type of game session protection to set for all new instances started in the fleet.    NoProtection -- The game session can be terminated during a scale-down event.    FullProtection -- If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
    */
  var NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.native
  
  /**
    * Operating system of the fleet's computing resources. A fleet's operating system depends on the OS specified for the build that is deployed on this fleet.
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.gameliftMod.OperatingSystem] = js.native
  
  /**
    * Fleet policy to limit the number of game sessions an individual player can create over a span of time.
    */
  var ResourceCreationLimitPolicy: js.UndefOr[typings.awsSdk.gameliftMod.ResourceCreationLimitPolicy] = js.native
  
  /**
    *  The Amazon Resource Name (ARN) associated with the GameLift script resource that is deployed on instances in this fleet. In a GameLift script ARN, the resource ID matches the ScriptId value.
    */
  var ScriptArn: js.UndefOr[typings.awsSdk.gameliftMod.ScriptArn] = js.native
  
  /**
    * A unique identifier for a Realtime script.
    */
  var ScriptId: js.UndefOr[typings.awsSdk.gameliftMod.ScriptId] = js.native
  
  /**
    * Game server launch parameters specified for fleets created before 2016-08-04 (or AWS SDK v. 0.12.16). Server launch parameters for fleets created after this date are specified in the fleet's RuntimeConfiguration.
    */
  var ServerLaunchParameters: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * Path to a game server executable in the fleet's build, specified for fleets created before 2016-08-04 (or AWS SDK v. 0.12.16). Server launch paths for fleets created after this date are specified in the fleet's RuntimeConfiguration.
    */
  var ServerLaunchPath: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * Current status of the fleet. Possible fleet statuses include the following:    NEW -- A new fleet has been defined and desired instances is set to 1.     DOWNLOADING/VALIDATING/BUILDING/ACTIVATING -- Amazon GameLift is setting up the new fleet, creating new instances with the game build or Realtime script and starting server processes.    ACTIVE -- Hosts can now accept game sessions.    ERROR -- An error occurred when downloading, validating, building, or activating the fleet.    DELETING -- Hosts are responding to a delete fleet request.    TERMINATED -- The fleet no longer exists.  
    */
  var Status: js.UndefOr[FleetStatus] = js.native
  
  /**
    * List of fleet activity that have been suspended using StopFleetActions. This includes auto-scaling.
    */
  var StoppedActions: js.UndefOr[FleetActionList] = js.native
  
  /**
    * Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var TerminationTime: js.UndefOr[Timestamp] = js.native
}
object FleetAttributes {
  
  @scala.inline
  def apply(): FleetAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetAttributes]
  }
  
  @scala.inline
  implicit class FleetAttributesOps[Self <: FleetAttributes] (val x: Self) extends AnyVal {
    
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
    def setBuildArn(value: BuildArn): Self = this.set("BuildArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildArn: Self = this.set("BuildArn", js.undefined)
    
    @scala.inline
    def setBuildId(value: BuildId): Self = this.set("BuildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildId: Self = this.set("BuildId", js.undefined)
    
    @scala.inline
    def setCertificateConfiguration(value: CertificateConfiguration): Self = this.set("CertificateConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateConfiguration: Self = this.set("CertificateConfiguration", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: NonZeroAndMaxString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setFleetArn(value: FleetArn): Self = this.set("FleetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetArn: Self = this.set("FleetArn", js.undefined)
    
    @scala.inline
    def setFleetId(value: FleetId): Self = this.set("FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetId: Self = this.set("FleetId", js.undefined)
    
    @scala.inline
    def setFleetType(value: FleetType): Self = this.set("FleetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetType: Self = this.set("FleetType", js.undefined)
    
    @scala.inline
    def setInstanceRoleArn(value: NonEmptyString): Self = this.set("InstanceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceRoleArn: Self = this.set("InstanceRoleArn", js.undefined)
    
    @scala.inline
    def setInstanceType(value: EC2InstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setLogPathsVarargs(value: NonZeroAndMaxString*): Self = this.set("LogPaths", js.Array(value :_*))
    
    @scala.inline
    def setLogPaths(value: StringList): Self = this.set("LogPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogPaths: Self = this.set("LogPaths", js.undefined)
    
    @scala.inline
    def setMetricGroupsVarargs(value: MetricGroup*): Self = this.set("MetricGroups", js.Array(value :_*))
    
    @scala.inline
    def setMetricGroups(value: MetricGroupList): Self = this.set("MetricGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricGroups: Self = this.set("MetricGroups", js.undefined)
    
    @scala.inline
    def setName(value: NonZeroAndMaxString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setNewGameSessionProtectionPolicy(value: ProtectionPolicy): Self = this.set("NewGameSessionProtectionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewGameSessionProtectionPolicy: Self = this.set("NewGameSessionProtectionPolicy", js.undefined)
    
    @scala.inline
    def setOperatingSystem(value: OperatingSystem): Self = this.set("OperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatingSystem: Self = this.set("OperatingSystem", js.undefined)
    
    @scala.inline
    def setResourceCreationLimitPolicy(value: ResourceCreationLimitPolicy): Self = this.set("ResourceCreationLimitPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceCreationLimitPolicy: Self = this.set("ResourceCreationLimitPolicy", js.undefined)
    
    @scala.inline
    def setScriptArn(value: ScriptArn): Self = this.set("ScriptArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptArn: Self = this.set("ScriptArn", js.undefined)
    
    @scala.inline
    def setScriptId(value: ScriptId): Self = this.set("ScriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptId: Self = this.set("ScriptId", js.undefined)
    
    @scala.inline
    def setServerLaunchParameters(value: NonZeroAndMaxString): Self = this.set("ServerLaunchParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerLaunchParameters: Self = this.set("ServerLaunchParameters", js.undefined)
    
    @scala.inline
    def setServerLaunchPath(value: NonZeroAndMaxString): Self = this.set("ServerLaunchPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerLaunchPath: Self = this.set("ServerLaunchPath", js.undefined)
    
    @scala.inline
    def setStatus(value: FleetStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStoppedActionsVarargs(value: FleetAction*): Self = this.set("StoppedActions", js.Array(value :_*))
    
    @scala.inline
    def setStoppedActions(value: FleetActionList): Self = this.set("StoppedActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoppedActions: Self = this.set("StoppedActions", js.undefined)
    
    @scala.inline
    def setTerminationTime(value: Timestamp): Self = this.set("TerminationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminationTime: Self = this.set("TerminationTime", js.undefined)
  }
}
