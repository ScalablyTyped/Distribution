package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object gameliftMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACCEPT
    - typings.awsSdk.awsSdkStrings.REJECT
    - java.lang.String
  */
  type AcceptanceType = typings.awsSdk.gameliftMod._AcceptanceType | java.lang.String
  
  type AliasArn = java.lang.String
  
  type AliasId = java.lang.String
  
  type AliasIdOrArn = java.lang.String
  
  type AliasList = js.Array[typings.awsSdk.gameliftMod.Alias]
  
  type AmazonResourceName = java.lang.String
  
  type ArnStringModel = java.lang.String
  
  type AutoScalingGroupArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AUTOMATIC
    - typings.awsSdk.awsSdkStrings.MANUAL
    - java.lang.String
  */
  type BackfillMode = typings.awsSdk.gameliftMod._BackfillMode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SPOT_ONLY
    - typings.awsSdk.awsSdkStrings.SPOT_PREFERRED
    - typings.awsSdk.awsSdkStrings.ON_DEMAND_ONLY
    - java.lang.String
  */
  type BalancingStrategy = typings.awsSdk.gameliftMod._BalancingStrategy | java.lang.String
  
  type BooleanModel = scala.Boolean
  
  type BuildArn = java.lang.String
  
  type BuildId = java.lang.String
  
  type BuildIdOrArn = java.lang.String
  
  type BuildList = js.Array[typings.awsSdk.gameliftMod.Build]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INITIALIZED
    - typings.awsSdk.awsSdkStrings.READY
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type BuildStatus = typings.awsSdk.gameliftMod._BuildStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DISABLED
    - typings.awsSdk.awsSdkStrings.GENERATED
    - java.lang.String
  */
  type CertificateType = typings.awsSdk.gameliftMod._CertificateType | java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.gameliftMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GreaterThanOrEqualToThreshold
    - typings.awsSdk.awsSdkStrings.GreaterThanThreshold
    - typings.awsSdk.awsSdkStrings.LessThanThreshold
    - typings.awsSdk.awsSdkStrings.LessThanOrEqualToThreshold
    - java.lang.String
  */
  type ComparisonOperatorType = typings.awsSdk.gameliftMod._ComparisonOperatorType | java.lang.String
  
  type CustomEventData = java.lang.String
  
  type DesiredPlayerSessionList = js.Array[typings.awsSdk.gameliftMod.DesiredPlayerSession]
  
  type DnsName = java.lang.String
  
  type Double = scala.Double
  
  type DoubleObject = scala.Double
  
  type EC2InstanceLimitList = js.Array[typings.awsSdk.gameliftMod.EC2InstanceLimit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.t2Dotmicro
    - typings.awsSdk.awsSdkStrings.t2Dotsmall
    - typings.awsSdk.awsSdkStrings.t2Dotmedium
    - typings.awsSdk.awsSdkStrings.t2Dotlarge
    - typings.awsSdk.awsSdkStrings.c3Dotlarge
    - typings.awsSdk.awsSdkStrings.c3Dotxlarge
    - typings.awsSdk.awsSdkStrings.c3Dot2xlarge
    - typings.awsSdk.awsSdkStrings.c3Dot4xlarge
    - typings.awsSdk.awsSdkStrings.c3Dot8xlarge
    - typings.awsSdk.awsSdkStrings.c4Dotlarge
    - typings.awsSdk.awsSdkStrings.c4Dotxlarge
    - typings.awsSdk.awsSdkStrings.c4Dot2xlarge
    - typings.awsSdk.awsSdkStrings.c4Dot4xlarge
    - typings.awsSdk.awsSdkStrings.c4Dot8xlarge
    - typings.awsSdk.awsSdkStrings.c5Dotlarge
    - typings.awsSdk.awsSdkStrings.c5Dotxlarge
    - typings.awsSdk.awsSdkStrings.c5Dot2xlarge
    - typings.awsSdk.awsSdkStrings.c5Dot4xlarge
    - typings.awsSdk.awsSdkStrings.c5Dot9xlarge
    - typings.awsSdk.awsSdkStrings.c5Dot12xlarge
    - typings.awsSdk.awsSdkStrings.c5Dot18xlarge
    - typings.awsSdk.awsSdkStrings.c5Dot24xlarge
    - typings.awsSdk.awsSdkStrings.r3Dotlarge
    - typings.awsSdk.awsSdkStrings.r3Dotxlarge
    - typings.awsSdk.awsSdkStrings.r3Dot2xlarge
    - typings.awsSdk.awsSdkStrings.r3Dot4xlarge
    - typings.awsSdk.awsSdkStrings.r3Dot8xlarge
    - typings.awsSdk.awsSdkStrings.r4Dotlarge
    - typings.awsSdk.awsSdkStrings.r4Dotxlarge
    - typings.awsSdk.awsSdkStrings.r4Dot2xlarge
    - typings.awsSdk.awsSdkStrings.r4Dot4xlarge
    - typings.awsSdk.awsSdkStrings.r4Dot8xlarge
    - typings.awsSdk.awsSdkStrings.r4Dot16xlarge
    - typings.awsSdk.awsSdkStrings.r5Dotlarge
    - typings.awsSdk.awsSdkStrings.r5Dotxlarge
    - typings.awsSdk.awsSdkStrings.r5Dot2xlarge
    - typings.awsSdk.awsSdkStrings.r5Dot4xlarge
    - typings.awsSdk.awsSdkStrings.r5Dot8xlarge
    - typings.awsSdk.awsSdkStrings.r5Dot12xlarge
    - typings.awsSdk.awsSdkStrings.r5Dot16xlarge
    - typings.awsSdk.awsSdkStrings.r5Dot24xlarge
    - typings.awsSdk.awsSdkStrings.m3Dotmedium
    - typings.awsSdk.awsSdkStrings.m3Dotlarge
    - typings.awsSdk.awsSdkStrings.m3Dotxlarge
    - typings.awsSdk.awsSdkStrings.m3Dot2xlarge
    - typings.awsSdk.awsSdkStrings.m4Dotlarge
    - typings.awsSdk.awsSdkStrings.m4Dotxlarge
    - typings.awsSdk.awsSdkStrings.m4Dot2xlarge
    - typings.awsSdk.awsSdkStrings.m4Dot4xlarge
    - typings.awsSdk.awsSdkStrings.m4Dot10xlarge
    - typings.awsSdk.awsSdkStrings.m5Dotlarge
    - typings.awsSdk.awsSdkStrings.m5Dotxlarge
    - typings.awsSdk.awsSdkStrings.m5Dot2xlarge
    - typings.awsSdk.awsSdkStrings.m5Dot4xlarge
    - typings.awsSdk.awsSdkStrings.m5Dot8xlarge
    - typings.awsSdk.awsSdkStrings.m5Dot12xlarge
    - typings.awsSdk.awsSdkStrings.m5Dot16xlarge
    - typings.awsSdk.awsSdkStrings.m5Dot24xlarge
    - java.lang.String
  */
  type EC2InstanceType = typings.awsSdk.gameliftMod._EC2InstanceType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GENERIC_EVENT
    - typings.awsSdk.awsSdkStrings.FLEET_CREATED
    - typings.awsSdk.awsSdkStrings.FLEET_DELETED
    - typings.awsSdk.awsSdkStrings.FLEET_SCALING_EVENT
    - typings.awsSdk.awsSdkStrings.FLEET_STATE_DOWNLOADING
    - typings.awsSdk.awsSdkStrings.FLEET_STATE_VALIDATING
    - typings.awsSdk.awsSdkStrings.FLEET_STATE_BUILDING
    - typings.awsSdk.awsSdkStrings.FLEET_STATE_ACTIVATING
    - typings.awsSdk.awsSdkStrings.FLEET_STATE_ACTIVE
    - typings.awsSdk.awsSdkStrings.FLEET_STATE_ERROR
    - typings.awsSdk.awsSdkStrings.FLEET_INITIALIZATION_FAILED
    - typings.awsSdk.awsSdkStrings.FLEET_BINARY_DOWNLOAD_FAILED
    - typings.awsSdk.awsSdkStrings.FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND
    - typings.awsSdk.awsSdkStrings.FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE
    - typings.awsSdk.awsSdkStrings.FLEET_VALIDATION_TIMED_OUT
    - typings.awsSdk.awsSdkStrings.FLEET_ACTIVATION_FAILED
    - typings.awsSdk.awsSdkStrings.FLEET_ACTIVATION_FAILED_NO_INSTANCES
    - typings.awsSdk.awsSdkStrings.FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED
    - typings.awsSdk.awsSdkStrings.SERVER_PROCESS_INVALID_PATH
    - typings.awsSdk.awsSdkStrings.SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT
    - typings.awsSdk.awsSdkStrings.SERVER_PROCESS_PROCESS_READY_TIMEOUT
    - typings.awsSdk.awsSdkStrings.SERVER_PROCESS_CRASHED
    - typings.awsSdk.awsSdkStrings.SERVER_PROCESS_TERMINATED_UNHEALTHY
    - typings.awsSdk.awsSdkStrings.SERVER_PROCESS_FORCE_TERMINATED
    - typings.awsSdk.awsSdkStrings.SERVER_PROCESS_PROCESS_EXIT_TIMEOUT
    - typings.awsSdk.awsSdkStrings.GAME_SESSION_ACTIVATION_TIMEOUT
    - typings.awsSdk.awsSdkStrings.FLEET_CREATION_EXTRACTING_BUILD
    - typings.awsSdk.awsSdkStrings.FLEET_CREATION_RUNNING_INSTALLER
    - typings.awsSdk.awsSdkStrings.FLEET_CREATION_VALIDATING_RUNTIME_CONFIG
    - typings.awsSdk.awsSdkStrings.FLEET_VPC_PEERING_SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FLEET_VPC_PEERING_FAILED
    - typings.awsSdk.awsSdkStrings.FLEET_VPC_PEERING_DELETED
    - typings.awsSdk.awsSdkStrings.INSTANCE_INTERRUPTED
    - java.lang.String
  */
  type EventCode = typings.awsSdk.gameliftMod._EventCode | java.lang.String
  
  type EventList = js.Array[typings.awsSdk.gameliftMod.Event]
  
  type FleetAction = typings.awsSdk.awsSdkStrings.AUTO_SCALING | java.lang.String
  
  type FleetActionList = js.Array[typings.awsSdk.gameliftMod.FleetAction]
  
  type FleetArn = java.lang.String
  
  type FleetAttributesList = js.Array[typings.awsSdk.gameliftMod.FleetAttributes]
  
  type FleetCapacityList = js.Array[typings.awsSdk.gameliftMod.FleetCapacity]
  
  type FleetId = java.lang.String
  
  type FleetIdList = js.Array[typings.awsSdk.gameliftMod.FleetId]
  
  type FleetIdOrArn = java.lang.String
  
  type FleetIdOrArnList = js.Array[typings.awsSdk.gameliftMod.FleetIdOrArn]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NEW
    - typings.awsSdk.awsSdkStrings.DOWNLOADING
    - typings.awsSdk.awsSdkStrings.VALIDATING
    - typings.awsSdk.awsSdkStrings.BUILDING
    - typings.awsSdk.awsSdkStrings.ACTIVATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.ERROR
    - typings.awsSdk.awsSdkStrings.TERMINATED
    - java.lang.String
  */
  type FleetStatus = typings.awsSdk.gameliftMod._FleetStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ON_DEMAND
    - typings.awsSdk.awsSdkStrings.SPOT
    - java.lang.String
  */
  type FleetType = typings.awsSdk.gameliftMod._FleetType | java.lang.String
  
  type FleetUtilizationList = js.Array[typings.awsSdk.gameliftMod.FleetUtilization]
  
  type Float = scala.Double
  
  type FreeText = java.lang.String
  
  type GamePropertyKey = java.lang.String
  
  type GamePropertyList = js.Array[typings.awsSdk.gameliftMod.GameProperty]
  
  type GamePropertyValue = java.lang.String
  
  type GameServerClaimStatus = typings.awsSdk.awsSdkStrings.CLAIMED | java.lang.String
  
  type GameServerConnectionInfo = java.lang.String
  
  type GameServerData = java.lang.String
  
  type GameServerGroupAction = typings.awsSdk.awsSdkStrings.REPLACE_INSTANCE_TYPES | java.lang.String
  
  type GameServerGroupActions = js.Array[typings.awsSdk.gameliftMod.GameServerGroupAction]
  
  type GameServerGroupArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SAFE_DELETE
    - typings.awsSdk.awsSdkStrings.FORCE_DELETE
    - typings.awsSdk.awsSdkStrings.RETAIN
    - java.lang.String
  */
  type GameServerGroupDeleteOption = typings.awsSdk.gameliftMod._GameServerGroupDeleteOption | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.c4Dotlarge
    - typings.awsSdk.awsSdkStrings.c4Dotxlarge
    - typings.awsSdk.awsSdkStrings.c4Dot2xlarge
    - typings.awsSdk.awsSdkStrings.c4Dot4xlarge
    - typings.awsSdk.awsSdkStrings.c4Dot8xlarge
    - typings.awsSdk.awsSdkStrings.c5Dotlarge
    - typings.awsSdk.awsSdkStrings.c5Dotxlarge
    - typings.awsSdk.awsSdkStrings.c5Dot2xlarge
    - typings.awsSdk.awsSdkStrings.c5Dot4xlarge
    - typings.awsSdk.awsSdkStrings.c5Dot9xlarge
    - typings.awsSdk.awsSdkStrings.c5Dot12xlarge
    - typings.awsSdk.awsSdkStrings.c5Dot18xlarge
    - typings.awsSdk.awsSdkStrings.c5Dot24xlarge
    - typings.awsSdk.awsSdkStrings.r4Dotlarge
    - typings.awsSdk.awsSdkStrings.r4Dotxlarge
    - typings.awsSdk.awsSdkStrings.r4Dot2xlarge
    - typings.awsSdk.awsSdkStrings.r4Dot4xlarge
    - typings.awsSdk.awsSdkStrings.r4Dot8xlarge
    - typings.awsSdk.awsSdkStrings.r4Dot16xlarge
    - typings.awsSdk.awsSdkStrings.r5Dotlarge
    - typings.awsSdk.awsSdkStrings.r5Dotxlarge
    - typings.awsSdk.awsSdkStrings.r5Dot2xlarge
    - typings.awsSdk.awsSdkStrings.r5Dot4xlarge
    - typings.awsSdk.awsSdkStrings.r5Dot8xlarge
    - typings.awsSdk.awsSdkStrings.r5Dot12xlarge
    - typings.awsSdk.awsSdkStrings.r5Dot16xlarge
    - typings.awsSdk.awsSdkStrings.r5Dot24xlarge
    - typings.awsSdk.awsSdkStrings.m4Dotlarge
    - typings.awsSdk.awsSdkStrings.m4Dotxlarge
    - typings.awsSdk.awsSdkStrings.m4Dot2xlarge
    - typings.awsSdk.awsSdkStrings.m4Dot4xlarge
    - typings.awsSdk.awsSdkStrings.m4Dot10xlarge
    - typings.awsSdk.awsSdkStrings.m5Dotlarge
    - typings.awsSdk.awsSdkStrings.m5Dotxlarge
    - typings.awsSdk.awsSdkStrings.m5Dot2xlarge
    - typings.awsSdk.awsSdkStrings.m5Dot4xlarge
    - typings.awsSdk.awsSdkStrings.m5Dot8xlarge
    - typings.awsSdk.awsSdkStrings.m5Dot12xlarge
    - typings.awsSdk.awsSdkStrings.m5Dot16xlarge
    - typings.awsSdk.awsSdkStrings.m5Dot24xlarge
    - java.lang.String
  */
  type GameServerGroupInstanceType = typings.awsSdk.gameliftMod._GameServerGroupInstanceType | java.lang.String
  
  type GameServerGroupName = java.lang.String
  
  type GameServerGroupNameOrArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NEW
    - typings.awsSdk.awsSdkStrings.ACTIVATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETE_SCHEDULED
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.DELETED
    - typings.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type GameServerGroupStatus = typings.awsSdk.gameliftMod._GameServerGroupStatus | java.lang.String
  
  type GameServerGroups = js.Array[typings.awsSdk.gameliftMod.GameServerGroup]
  
  type GameServerHealthCheck = typings.awsSdk.awsSdkStrings.HEALTHY | java.lang.String
  
  type GameServerId = java.lang.String
  
  type GameServerInstanceId = java.lang.String
  
  type GameServerInstanceIds = js.Array[typings.awsSdk.gameliftMod.GameServerInstanceId]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DRAINING
    - typings.awsSdk.awsSdkStrings.SPOT_TERMINATING
    - java.lang.String
  */
  type GameServerInstanceStatus = typings.awsSdk.gameliftMod._GameServerInstanceStatus | java.lang.String
  
  type GameServerInstances = js.Array[typings.awsSdk.gameliftMod.GameServerInstance]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NO_PROTECTION
    - typings.awsSdk.awsSdkStrings.FULL_PROTECTION
    - java.lang.String
  */
  type GameServerProtectionPolicy = typings.awsSdk.gameliftMod._GameServerProtectionPolicy | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.UTILIZED
    - java.lang.String
  */
  type GameServerUtilizationStatus = typings.awsSdk.gameliftMod._GameServerUtilizationStatus | java.lang.String
  
  type GameServers = js.Array[typings.awsSdk.gameliftMod.GameServer]
  
  type GameSessionActivationTimeoutSeconds = scala.Double
  
  type GameSessionData = java.lang.String
  
  type GameSessionDetailList = js.Array[typings.awsSdk.gameliftMod.GameSessionDetail]
  
  type GameSessionList = js.Array[typings.awsSdk.gameliftMod.GameSession]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.FULFILLED
    - typings.awsSdk.awsSdkStrings.CANCELLED
    - typings.awsSdk.awsSdkStrings.TIMED_OUT
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type GameSessionPlacementState = typings.awsSdk.gameliftMod._GameSessionPlacementState | java.lang.String
  
  type GameSessionQueueArn = java.lang.String
  
  type GameSessionQueueDestinationList = js.Array[typings.awsSdk.gameliftMod.GameSessionQueueDestination]
  
  type GameSessionQueueList = js.Array[typings.awsSdk.gameliftMod.GameSessionQueue]
  
  type GameSessionQueueName = java.lang.String
  
  type GameSessionQueueNameOrArn = java.lang.String
  
  type GameSessionQueueNameOrArnList = js.Array[typings.awsSdk.gameliftMod.GameSessionQueueNameOrArn]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.ACTIVATING
    - typings.awsSdk.awsSdkStrings.TERMINATED
    - typings.awsSdk.awsSdkStrings.TERMINATING
    - typings.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type GameSessionStatus = typings.awsSdk.gameliftMod._GameSessionStatus | java.lang.String
  
  type GameSessionStatusReason = typings.awsSdk.awsSdkStrings.INTERRUPTED | java.lang.String
  
  type IamRoleArn = java.lang.String
  
  type IdStringModel = java.lang.String
  
  type InstanceDefinitions = js.Array[typings.awsSdk.gameliftMod.InstanceDefinition]
  
  type InstanceId = java.lang.String
  
  type InstanceList = js.Array[typings.awsSdk.gameliftMod.Instance]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.TERMINATING
    - java.lang.String
  */
  type InstanceStatus = typings.awsSdk.gameliftMod._InstanceStatus | java.lang.String
  
  type Integer = scala.Double
  
  type IpAddress = java.lang.String
  
  type IpPermissionsList = js.Array[typings.awsSdk.gameliftMod.IpPermission]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TCP
    - typings.awsSdk.awsSdkStrings.UDP
    - java.lang.String
  */
  type IpProtocol = typings.awsSdk.gameliftMod._IpProtocol | java.lang.String
  
  type LatencyMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.gameliftMod.PositiveInteger]
  
  type LaunchTemplateId = java.lang.String
  
  type LaunchTemplateName = java.lang.String
  
  type LaunchTemplateVersion = java.lang.String
  
  type MatchedPlayerSessionList = js.Array[typings.awsSdk.gameliftMod.MatchedPlayerSession]
  
  type MatchmakerData = java.lang.String
  
  type MatchmakingAcceptanceTimeoutInteger = scala.Double
  
  type MatchmakingConfigurationArn = java.lang.String
  
  type MatchmakingConfigurationList = js.Array[typings.awsSdk.gameliftMod.MatchmakingConfiguration]
  
  type MatchmakingConfigurationName = java.lang.String
  
  type MatchmakingConfigurationNameList = js.Array[typings.awsSdk.gameliftMod.MatchmakingConfigurationName]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CANCELLED
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.PLACING
    - typings.awsSdk.awsSdkStrings.QUEUED
    - typings.awsSdk.awsSdkStrings.REQUIRES_ACCEPTANCE
    - typings.awsSdk.awsSdkStrings.SEARCHING
    - typings.awsSdk.awsSdkStrings.TIMED_OUT
    - java.lang.String
  */
  type MatchmakingConfigurationStatus = typings.awsSdk.gameliftMod._MatchmakingConfigurationStatus | java.lang.String
  
  type MatchmakingIdList = js.Array[typings.awsSdk.gameliftMod.MatchmakingIdStringModel]
  
  type MatchmakingIdStringModel = java.lang.String
  
  type MatchmakingRequestTimeoutInteger = scala.Double
  
  type MatchmakingRuleSetArn = java.lang.String
  
  type MatchmakingRuleSetList = js.Array[typings.awsSdk.gameliftMod.MatchmakingRuleSet]
  
  type MatchmakingRuleSetName = java.lang.String
  
  type MatchmakingRuleSetNameList = js.Array[typings.awsSdk.gameliftMod.MatchmakingRuleSetName]
  
  type MatchmakingTicketList = js.Array[typings.awsSdk.gameliftMod.MatchmakingTicket]
  
  type MaxConcurrentGameSessionActivations = scala.Double
  
  type MetricGroup = java.lang.String
  
  type MetricGroupList = js.Array[typings.awsSdk.gameliftMod.MetricGroup]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ActivatingGameSessions
    - typings.awsSdk.awsSdkStrings.ActiveGameSessions
    - typings.awsSdk.awsSdkStrings.ActiveInstances
    - typings.awsSdk.awsSdkStrings.AvailableGameSessions
    - typings.awsSdk.awsSdkStrings.AvailablePlayerSessions
    - typings.awsSdk.awsSdkStrings.CurrentPlayerSessions
    - typings.awsSdk.awsSdkStrings.IdleInstances
    - typings.awsSdk.awsSdkStrings.PercentAvailableGameSessions
    - typings.awsSdk.awsSdkStrings.PercentIdleInstances
    - typings.awsSdk.awsSdkStrings.QueueDepth
    - typings.awsSdk.awsSdkStrings.WaitTime
    - java.lang.String
  */
  type MetricName = typings.awsSdk.gameliftMod._MetricName | java.lang.String
  
  type NonBlankAndLengthConstraintString = java.lang.String
  
  type NonBlankString = java.lang.String
  
  type NonEmptyString = java.lang.String
  
  type NonNegativeDouble = scala.Double
  
  type NonZeroAndMaxString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.WINDOWS_2012
    - typings.awsSdk.awsSdkStrings.AMAZON_LINUX
    - typings.awsSdk.awsSdkStrings.AMAZON_LINUX_2
    - java.lang.String
  */
  type OperatingSystem = typings.awsSdk.gameliftMod._OperatingSystem | java.lang.String
  
  type PlacedPlayerSessionList = js.Array[typings.awsSdk.gameliftMod.PlacedPlayerSession]
  
  type PlayerAttributeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.gameliftMod.AttributeValue]
  
  type PlayerData = java.lang.String
  
  type PlayerDataMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.gameliftMod.PlayerData]
  
  type PlayerIdList = js.Array[typings.awsSdk.gameliftMod.NonZeroAndMaxString]
  
  type PlayerLatencyList = js.Array[typings.awsSdk.gameliftMod.PlayerLatency]
  
  type PlayerLatencyPolicyList = js.Array[typings.awsSdk.gameliftMod.PlayerLatencyPolicy]
  
  type PlayerList = js.Array[typings.awsSdk.gameliftMod.Player]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACCEPT_ALL
    - typings.awsSdk.awsSdkStrings.DENY_ALL
    - java.lang.String
  */
  type PlayerSessionCreationPolicy = typings.awsSdk.gameliftMod._PlayerSessionCreationPolicy | java.lang.String
  
  type PlayerSessionId = java.lang.String
  
  type PlayerSessionList = js.Array[typings.awsSdk.gameliftMod.PlayerSession]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RESERVED
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.TIMEDOUT
    - java.lang.String
  */
  type PlayerSessionStatus = typings.awsSdk.gameliftMod._PlayerSessionStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RuleBased
    - typings.awsSdk.awsSdkStrings.TargetBased
    - java.lang.String
  */
  type PolicyType = typings.awsSdk.gameliftMod._PolicyType | java.lang.String
  
  type PortNumber = scala.Double
  
  type PositiveInteger = scala.Double
  
  type PositiveLong = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NoProtection
    - typings.awsSdk.awsSdkStrings.FullProtection
    - java.lang.String
  */
  type ProtectionPolicy = typings.awsSdk.gameliftMod._ProtectionPolicy | java.lang.String
  
  type QueueArnsList = js.Array[typings.awsSdk.gameliftMod.ArnStringModel]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SIMPLE
    - typings.awsSdk.awsSdkStrings.TERMINAL
    - java.lang.String
  */
  type RoutingStrategyType = typings.awsSdk.gameliftMod._RoutingStrategyType | java.lang.String
  
  type RuleSetBody = java.lang.String
  
  type RuleSetLimit = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ChangeInCapacity
    - typings.awsSdk.awsSdkStrings.ExactCapacity
    - typings.awsSdk.awsSdkStrings.PercentChangeInCapacity
    - java.lang.String
  */
  type ScalingAdjustmentType = typings.awsSdk.gameliftMod._ScalingAdjustmentType | java.lang.String
  
  type ScalingPolicyList = js.Array[typings.awsSdk.gameliftMod.ScalingPolicy]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.UPDATE_REQUESTED
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.DELETE_REQUESTED
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.DELETED
    - typings.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type ScalingStatusType = typings.awsSdk.gameliftMod._ScalingStatusType | java.lang.String
  
  type ScriptArn = java.lang.String
  
  type ScriptId = java.lang.String
  
  type ScriptIdOrArn = java.lang.String
  
  type ScriptList = js.Array[typings.awsSdk.gameliftMod.Script]
  
  type ServerProcessList = js.Array[typings.awsSdk.gameliftMod.ServerProcess]
  
  type SnsArnStringModel = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ASCENDING
    - typings.awsSdk.awsSdkStrings.DESCENDING
    - java.lang.String
  */
  type SortOrder = typings.awsSdk.gameliftMod._SortOrder | java.lang.String
  
  type StringDoubleMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.gameliftMod.DoubleObject]
  
  type StringList = js.Array[typings.awsSdk.gameliftMod.NonZeroAndMaxString]
  
  type StringModel = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.gameliftMod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.gameliftMod.Tag]
  
  type TagValue = java.lang.String
  
  type Timestamp = typings.std.Date
  
  type VpcPeeringAuthorizationList = js.Array[typings.awsSdk.gameliftMod.VpcPeeringAuthorization]
  
  type VpcPeeringConnectionList = js.Array[typings.awsSdk.gameliftMod.VpcPeeringConnection]
  
  type VpcSubnet = java.lang.String
  
  type VpcSubnets = js.Array[typings.awsSdk.gameliftMod.VpcSubnet]
  
  type WeightedCapacity = java.lang.String
  
  type WholeNumber = scala.Double
  
  type ZipBlob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.gameliftMod.Blob | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2015-10-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.gameliftMod._apiVersion | java.lang.String
}
