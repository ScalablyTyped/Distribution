package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetAttributes extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) associated with the GameLift build resource that is deployed on instances in this fleet. In a GameLift build ARN, the resource ID matches the BuildId value.
    */
  var BuildArn: js.UndefOr[typings.awsSdk.gameliftMod.BuildArn] = js.undefined
  
  /**
    * A unique identifier for a build.
    */
  var BuildId: js.UndefOr[typings.awsSdk.gameliftMod.BuildId] = js.undefined
  
  /**
    * Indicates whether a TLS/SSL certificate was generated for the fleet. 
    */
  var CertificateConfiguration: js.UndefOr[typings.awsSdk.gameliftMod.CertificateConfiguration] = js.undefined
  
  /**
    * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Human-readable description of the fleet.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. In a GameLift fleet ARN, the resource ID matches the FleetId value.
    */
  var FleetArn: js.UndefOr[typings.awsSdk.gameliftMod.FleetArn] = js.undefined
  
  /**
    * A unique identifier for a fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.gameliftMod.FleetId] = js.undefined
  
  /**
    * Indicates whether the fleet uses on-demand or spot instances. A spot instance in use may be interrupted with a two-minute notification.
    */
  var FleetType: js.UndefOr[typings.awsSdk.gameliftMod.FleetType] = js.undefined
  
  /**
    * A unique identifier for an AWS IAM role that manages access to your AWS services. With an instance role ARN set, any application that runs on an instance in this fleet can assume the role, including install scripts, server processes, and daemons (background processes). Create a role or look up a role's ARN from the IAM dashboard in the AWS Management Console. Learn more about using on-box credentials for your game servers at  Access external resources from a game server.
    */
  var InstanceRoleArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * EC2 instance type indicating the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. See Amazon EC2 Instance Types for detailed descriptions.
    */
  var InstanceType: js.UndefOr[EC2InstanceType] = js.undefined
  
  /**
    * Location of default log files. When a server process is shut down, Amazon GameLift captures and stores any log files in this location. These logs are in addition to game session logs; see more on game session logs in the Amazon GameLift Developer Guide. If no default log path for a fleet is specified, Amazon GameLift automatically uploads logs that are stored on each instance at C:\game\logs (for Windows) or /local/game/logs (for Linux). Use the Amazon GameLift console to access stored logs. 
    */
  var LogPaths: js.UndefOr[StringList] = js.undefined
  
  /**
    * Names of metric groups that this fleet is included in. In Amazon CloudWatch, you can view metrics for an individual fleet or aggregated metrics for fleets that are in a fleet metric group. A fleet can be included in only one metric group at a time.
    */
  var MetricGroups: js.UndefOr[MetricGroupList] = js.undefined
  
  /**
    * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * The type of game session protection to set for all new instances started in the fleet.    NoProtection -- The game session can be terminated during a scale-down event.    FullProtection -- If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
    */
  var NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined
  
  /**
    * Operating system of the fleet's computing resources. A fleet's operating system depends on the OS specified for the build that is deployed on this fleet.
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.gameliftMod.OperatingSystem] = js.undefined
  
  /**
    * Fleet policy to limit the number of game sessions an individual player can create over a span of time.
    */
  var ResourceCreationLimitPolicy: js.UndefOr[typings.awsSdk.gameliftMod.ResourceCreationLimitPolicy] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) associated with the GameLift script resource that is deployed on instances in this fleet. In a GameLift script ARN, the resource ID matches the ScriptId value.
    */
  var ScriptArn: js.UndefOr[typings.awsSdk.gameliftMod.ScriptArn] = js.undefined
  
  /**
    * A unique identifier for a Realtime script.
    */
  var ScriptId: js.UndefOr[typings.awsSdk.gameliftMod.ScriptId] = js.undefined
  
  /**
    * Game server launch parameters specified for fleets created before 2016-08-04 (or AWS SDK v. 0.12.16). Server launch parameters for fleets created after this date are specified in the fleet's RuntimeConfiguration.
    */
  var ServerLaunchParameters: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * Path to a game server executable in the fleet's build, specified for fleets created before 2016-08-04 (or AWS SDK v. 0.12.16). Server launch paths for fleets created after this date are specified in the fleet's RuntimeConfiguration.
    */
  var ServerLaunchPath: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * Current status of the fleet. Possible fleet statuses include the following:    NEW -- A new fleet has been defined and desired instances is set to 1.     DOWNLOADING/VALIDATING/BUILDING/ACTIVATING -- Amazon GameLift is setting up the new fleet, creating new instances with the game build or Realtime script and starting server processes.    ACTIVE -- Hosts can now accept game sessions.    ERROR -- An error occurred when downloading, validating, building, or activating the fleet.    DELETING -- Hosts are responding to a delete fleet request.    TERMINATED -- The fleet no longer exists.  
    */
  var Status: js.UndefOr[FleetStatus] = js.undefined
  
  /**
    * List of fleet activity that have been suspended using StopFleetActions. This includes auto-scaling.
    */
  var StoppedActions: js.UndefOr[FleetActionList] = js.undefined
  
  /**
    * Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var TerminationTime: js.UndefOr[Timestamp] = js.undefined
}
object FleetAttributes {
  
  inline def apply(): FleetAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetAttributes]
  }
  
  extension [Self <: FleetAttributes](x: Self) {
    
    inline def setBuildArn(value: BuildArn): Self = StObject.set(x, "BuildArn", value.asInstanceOf[js.Any])
    
    inline def setBuildArnUndefined: Self = StObject.set(x, "BuildArn", js.undefined)
    
    inline def setBuildId(value: BuildId): Self = StObject.set(x, "BuildId", value.asInstanceOf[js.Any])
    
    inline def setBuildIdUndefined: Self = StObject.set(x, "BuildId", js.undefined)
    
    inline def setCertificateConfiguration(value: CertificateConfiguration): Self = StObject.set(x, "CertificateConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCertificateConfigurationUndefined: Self = StObject.set(x, "CertificateConfiguration", js.undefined)
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: NonZeroAndMaxString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    inline def setFleetArnUndefined: Self = StObject.set(x, "FleetArn", js.undefined)
    
    inline def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    inline def setFleetType(value: FleetType): Self = StObject.set(x, "FleetType", value.asInstanceOf[js.Any])
    
    inline def setFleetTypeUndefined: Self = StObject.set(x, "FleetType", js.undefined)
    
    inline def setInstanceRoleArn(value: NonEmptyString): Self = StObject.set(x, "InstanceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setInstanceRoleArnUndefined: Self = StObject.set(x, "InstanceRoleArn", js.undefined)
    
    inline def setInstanceType(value: EC2InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setLogPaths(value: StringList): Self = StObject.set(x, "LogPaths", value.asInstanceOf[js.Any])
    
    inline def setLogPathsUndefined: Self = StObject.set(x, "LogPaths", js.undefined)
    
    inline def setLogPathsVarargs(value: NonZeroAndMaxString*): Self = StObject.set(x, "LogPaths", js.Array(value :_*))
    
    inline def setMetricGroups(value: MetricGroupList): Self = StObject.set(x, "MetricGroups", value.asInstanceOf[js.Any])
    
    inline def setMetricGroupsUndefined: Self = StObject.set(x, "MetricGroups", js.undefined)
    
    inline def setMetricGroupsVarargs(value: MetricGroup*): Self = StObject.set(x, "MetricGroups", js.Array(value :_*))
    
    inline def setName(value: NonZeroAndMaxString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNewGameSessionProtectionPolicy(value: ProtectionPolicy): Self = StObject.set(x, "NewGameSessionProtectionPolicy", value.asInstanceOf[js.Any])
    
    inline def setNewGameSessionProtectionPolicyUndefined: Self = StObject.set(x, "NewGameSessionProtectionPolicy", js.undefined)
    
    inline def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
    
    inline def setResourceCreationLimitPolicy(value: ResourceCreationLimitPolicy): Self = StObject.set(x, "ResourceCreationLimitPolicy", value.asInstanceOf[js.Any])
    
    inline def setResourceCreationLimitPolicyUndefined: Self = StObject.set(x, "ResourceCreationLimitPolicy", js.undefined)
    
    inline def setScriptArn(value: ScriptArn): Self = StObject.set(x, "ScriptArn", value.asInstanceOf[js.Any])
    
    inline def setScriptArnUndefined: Self = StObject.set(x, "ScriptArn", js.undefined)
    
    inline def setScriptId(value: ScriptId): Self = StObject.set(x, "ScriptId", value.asInstanceOf[js.Any])
    
    inline def setScriptIdUndefined: Self = StObject.set(x, "ScriptId", js.undefined)
    
    inline def setServerLaunchParameters(value: NonZeroAndMaxString): Self = StObject.set(x, "ServerLaunchParameters", value.asInstanceOf[js.Any])
    
    inline def setServerLaunchParametersUndefined: Self = StObject.set(x, "ServerLaunchParameters", js.undefined)
    
    inline def setServerLaunchPath(value: NonZeroAndMaxString): Self = StObject.set(x, "ServerLaunchPath", value.asInstanceOf[js.Any])
    
    inline def setServerLaunchPathUndefined: Self = StObject.set(x, "ServerLaunchPath", js.undefined)
    
    inline def setStatus(value: FleetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStoppedActions(value: FleetActionList): Self = StObject.set(x, "StoppedActions", value.asInstanceOf[js.Any])
    
    inline def setStoppedActionsUndefined: Self = StObject.set(x, "StoppedActions", js.undefined)
    
    inline def setStoppedActionsVarargs(value: FleetAction*): Self = StObject.set(x, "StoppedActions", js.Array(value :_*))
    
    inline def setTerminationTime(value: Timestamp): Self = StObject.set(x, "TerminationTime", value.asInstanceOf[js.Any])
    
    inline def setTerminationTimeUndefined: Self = StObject.set(x, "TerminationTime", js.undefined)
  }
}
