package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var FleetArn: js.UndefOr[ArnStringModel] = js.native
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
    * List of fleet actions that have been suspended using StopFleetActions. This includes auto-scaling.
    */
  var StoppedActions: js.UndefOr[FleetActionList] = js.native
  /**
    * Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var TerminationTime: js.UndefOr[Timestamp] = js.native
}

object FleetAttributes {
  @scala.inline
  def apply(
    BuildArn: BuildArn = null,
    BuildId: BuildId = null,
    CertificateConfiguration: CertificateConfiguration = null,
    CreationTime: Timestamp = null,
    Description: NonZeroAndMaxString = null,
    FleetArn: ArnStringModel = null,
    FleetId: FleetId = null,
    FleetType: FleetType = null,
    InstanceRoleArn: NonEmptyString = null,
    InstanceType: EC2InstanceType = null,
    LogPaths: StringList = null,
    MetricGroups: MetricGroupList = null,
    Name: NonZeroAndMaxString = null,
    NewGameSessionProtectionPolicy: ProtectionPolicy = null,
    OperatingSystem: OperatingSystem = null,
    ResourceCreationLimitPolicy: ResourceCreationLimitPolicy = null,
    ScriptArn: ScriptArn = null,
    ScriptId: ScriptId = null,
    ServerLaunchParameters: NonZeroAndMaxString = null,
    ServerLaunchPath: NonZeroAndMaxString = null,
    Status: FleetStatus = null,
    StoppedActions: FleetActionList = null,
    TerminationTime: Timestamp = null
  ): FleetAttributes = {
    val __obj = js.Dynamic.literal()
    if (BuildArn != null) __obj.updateDynamic("BuildArn")(BuildArn.asInstanceOf[js.Any])
    if (BuildId != null) __obj.updateDynamic("BuildId")(BuildId.asInstanceOf[js.Any])
    if (CertificateConfiguration != null) __obj.updateDynamic("CertificateConfiguration")(CertificateConfiguration.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (FleetArn != null) __obj.updateDynamic("FleetArn")(FleetArn.asInstanceOf[js.Any])
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId.asInstanceOf[js.Any])
    if (FleetType != null) __obj.updateDynamic("FleetType")(FleetType.asInstanceOf[js.Any])
    if (InstanceRoleArn != null) __obj.updateDynamic("InstanceRoleArn")(InstanceRoleArn.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (LogPaths != null) __obj.updateDynamic("LogPaths")(LogPaths.asInstanceOf[js.Any])
    if (MetricGroups != null) __obj.updateDynamic("MetricGroups")(MetricGroups.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NewGameSessionProtectionPolicy != null) __obj.updateDynamic("NewGameSessionProtectionPolicy")(NewGameSessionProtectionPolicy.asInstanceOf[js.Any])
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    if (ResourceCreationLimitPolicy != null) __obj.updateDynamic("ResourceCreationLimitPolicy")(ResourceCreationLimitPolicy.asInstanceOf[js.Any])
    if (ScriptArn != null) __obj.updateDynamic("ScriptArn")(ScriptArn.asInstanceOf[js.Any])
    if (ScriptId != null) __obj.updateDynamic("ScriptId")(ScriptId.asInstanceOf[js.Any])
    if (ServerLaunchParameters != null) __obj.updateDynamic("ServerLaunchParameters")(ServerLaunchParameters.asInstanceOf[js.Any])
    if (ServerLaunchPath != null) __obj.updateDynamic("ServerLaunchPath")(ServerLaunchPath.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StoppedActions != null) __obj.updateDynamic("StoppedActions")(StoppedActions.asInstanceOf[js.Any])
    if (TerminationTime != null) __obj.updateDynamic("TerminationTime")(TerminationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetAttributes]
  }
}

