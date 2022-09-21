package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AdditionalDeploymentStatusInfo = String

type AlarmList = js.Array[Alarm]

type AlarmName = String

type ApplicationId = String

type ApplicationName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.registerTime
  - typings.awsSdk.awsSdkStrings.firstUsedTime
  - typings.awsSdk.awsSdkStrings.lastUsedTime
  - java.lang.String
*/
type ApplicationRevisionSortBy = _ApplicationRevisionSortBy | String

type ApplicationsInfoList = js.Array[ApplicationInfo]

type ApplicationsList = js.Array[ApplicationName]

type Arn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEPLOYMENT_FAILURE
  - typings.awsSdk.awsSdkStrings.DEPLOYMENT_STOP_ON_ALARM
  - typings.awsSdk.awsSdkStrings.DEPLOYMENT_STOP_ON_REQUEST
  - java.lang.String
*/
type AutoRollbackEvent = _AutoRollbackEvent | String

type AutoRollbackEventsList = js.Array[AutoRollbackEvent]

type AutoScalingGroupHook = String

type AutoScalingGroupList = js.Array[AutoScalingGroup]

type AutoScalingGroupName = String

type AutoScalingGroupNameList = js.Array[AutoScalingGroupName]

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.tar
  - typings.awsSdk.awsSdkStrings.tgz
  - typings.awsSdk.awsSdkStrings.zip__
  - typings.awsSdk.awsSdkStrings.YAML
  - typings.awsSdk.awsSdkStrings.JSON
  - java.lang.String
*/
type BundleType = _BundleType | String

type CloudFormationResourceType = String

type CommitId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Server_
  - typings.awsSdk.awsSdkStrings.Lambda_
  - typings.awsSdk.awsSdkStrings.ECS
  - java.lang.String
*/
type ComputePlatform = _ComputePlatform | String

type DeploymentConfigId = String

type DeploymentConfigName = String

type DeploymentConfigsList = js.Array[DeploymentConfigName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.user__
  - typings.awsSdk.awsSdkStrings.autoscaling_
  - typings.awsSdk.awsSdkStrings.codeDeployRollback
  - typings.awsSdk.awsSdkStrings.CodeDeploy
  - typings.awsSdk.awsSdkStrings.CodeDeployAutoUpdate
  - typings.awsSdk.awsSdkStrings.CloudFormation_
  - typings.awsSdk.awsSdkStrings.CloudFormationRollback
  - java.lang.String
*/
type DeploymentCreator = _DeploymentCreator | String

type DeploymentGroupId = String

type DeploymentGroupInfoList = js.Array[DeploymentGroupInfo]

type DeploymentGroupName = String

type DeploymentGroupsList = js.Array[DeploymentGroupName]

type DeploymentId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WITH_TRAFFIC_CONTROL
  - typings.awsSdk.awsSdkStrings.WITHOUT_TRAFFIC_CONTROL
  - java.lang.String
*/
type DeploymentOption = _DeploymentOption | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONTINUE_DEPLOYMENT
  - typings.awsSdk.awsSdkStrings.STOP_DEPLOYMENT
  - java.lang.String
*/
type DeploymentReadyAction = _DeploymentReadyAction | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Created_
  - typings.awsSdk.awsSdkStrings.Queued_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Baking_
  - typings.awsSdk.awsSdkStrings.Succeeded_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Stopped_
  - typings.awsSdk.awsSdkStrings.Ready_
  - java.lang.String
*/
type DeploymentStatus = _DeploymentStatus | String

type DeploymentStatusList = js.Array[DeploymentStatus]

type DeploymentStatusMessageList = js.Array[ErrorMessage]

type DeploymentTargetList = js.Array[DeploymentTarget]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InstanceTarget
  - typings.awsSdk.awsSdkStrings.LambdaTarget
  - typings.awsSdk.awsSdkStrings.ECSTarget
  - typings.awsSdk.awsSdkStrings.CloudFormationTarget
  - java.lang.String
*/
type DeploymentTargetType = _DeploymentTargetType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PLACE
  - typings.awsSdk.awsSdkStrings.BLUE_GREEN
  - java.lang.String
*/
type DeploymentType = _DeploymentType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.READY_WAIT
  - typings.awsSdk.awsSdkStrings.TERMINATION_WAIT
  - java.lang.String
*/
type DeploymentWaitType = _DeploymentWaitType | String

type DeploymentsInfoList = js.Array[DeploymentInfo]

type DeploymentsList = js.Array[DeploymentId]

type Description = String

type Duration = Double

type EC2TagFilterList = js.Array[EC2TagFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.KEY_ONLY
  - typings.awsSdk.awsSdkStrings.VALUE_ONLY
  - typings.awsSdk.awsSdkStrings.KEY_AND_VALUE
  - java.lang.String
*/
type EC2TagFilterType = _EC2TagFilterType | String

type EC2TagSetList = js.Array[EC2TagFilterList]

type ECSClusterName = String

type ECSServiceList = js.Array[ECSService]

type ECSServiceName = String

type ECSTaskSetCount = Double

type ECSTaskSetIdentifier = String

type ECSTaskSetList = js.Array[ECSTaskSet]

type ECSTaskSetStatus = String

type ELBInfoList = js.Array[ELBInfo]

type ELBName = String

type ETag = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AGENT_ISSUE
  - typings.awsSdk.awsSdkStrings.ALARM_ACTIVE
  - typings.awsSdk.awsSdkStrings.APPLICATION_MISSING
  - typings.awsSdk.awsSdkStrings.AUTOSCALING_VALIDATION_ERROR
  - typings.awsSdk.awsSdkStrings.AUTO_SCALING_CONFIGURATION
  - typings.awsSdk.awsSdkStrings.AUTO_SCALING_IAM_ROLE_PERMISSIONS
  - typings.awsSdk.awsSdkStrings.CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND
  - typings.awsSdk.awsSdkStrings.CUSTOMER_APPLICATION_UNHEALTHY
  - typings.awsSdk.awsSdkStrings.DEPLOYMENT_GROUP_MISSING
  - typings.awsSdk.awsSdkStrings.ECS_UPDATE_ERROR
  - typings.awsSdk.awsSdkStrings.ELASTIC_LOAD_BALANCING_INVALID
  - typings.awsSdk.awsSdkStrings.ELB_INVALID_INSTANCE
  - typings.awsSdk.awsSdkStrings.HEALTH_CONSTRAINTS
  - typings.awsSdk.awsSdkStrings.HEALTH_CONSTRAINTS_INVALID
  - typings.awsSdk.awsSdkStrings.HOOK_EXECUTION_FAILURE
  - typings.awsSdk.awsSdkStrings.IAM_ROLE_MISSING
  - typings.awsSdk.awsSdkStrings.IAM_ROLE_PERMISSIONS
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typings.awsSdk.awsSdkStrings.INVALID_ECS_SERVICE
  - typings.awsSdk.awsSdkStrings.INVALID_LAMBDA_CONFIGURATION
  - typings.awsSdk.awsSdkStrings.INVALID_LAMBDA_FUNCTION
  - typings.awsSdk.awsSdkStrings.INVALID_REVISION
  - typings.awsSdk.awsSdkStrings.MANUAL_STOP
  - typings.awsSdk.awsSdkStrings.MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION
  - typings.awsSdk.awsSdkStrings.MISSING_ELB_INFORMATION
  - typings.awsSdk.awsSdkStrings.MISSING_GITHUB_TOKEN
  - typings.awsSdk.awsSdkStrings.NO_EC2_SUBSCRIPTION
  - typings.awsSdk.awsSdkStrings.NO_INSTANCES
  - typings.awsSdk.awsSdkStrings.OVER_MAX_INSTANCES
  - typings.awsSdk.awsSdkStrings.RESOURCE_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.REVISION_MISSING
  - typings.awsSdk.awsSdkStrings.THROTTLED
  - typings.awsSdk.awsSdkStrings.TIMEOUT
  - typings.awsSdk.awsSdkStrings.CLOUDFORMATION_STACK_FAILURE
  - java.lang.String
*/
type ErrorCode = _ErrorCode | String

type ErrorMessage = String

type ExternalId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DISALLOW
  - typings.awsSdk.awsSdkStrings.OVERWRITE
  - typings.awsSdk.awsSdkStrings.RETAIN
  - java.lang.String
*/
type FileExistsBehavior = _FileExistsBehavior | String

type FilterValue = String

type FilterValueList = js.Array[FilterValue]

type GitHubAccountTokenName = String

type GitHubAccountTokenNameList = js.Array[GitHubAccountTokenName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DISCOVER_EXISTING
  - typings.awsSdk.awsSdkStrings.COPY_AUTO_SCALING_GROUP
  - java.lang.String
*/
type GreenFleetProvisioningAction = _GreenFleetProvisioningAction | String

type IamSessionArn = String

type IamUserArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TERMINATE
  - typings.awsSdk.awsSdkStrings.KEEP_ALIVE
  - java.lang.String
*/
type InstanceAction = _InstanceAction | String

type InstanceArn = String

type InstanceCount = Double

type InstanceId = String

type InstanceInfoList = js.Array[InstanceInfo]

type InstanceName = String

type InstanceNameList = js.Array[InstanceName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Succeeded_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Skipped_
  - typings.awsSdk.awsSdkStrings.Unknown_
  - typings.awsSdk.awsSdkStrings.Ready_
  - java.lang.String
*/
type InstanceStatus = _InstanceStatus | String

type InstanceStatusList = js.Array[InstanceStatus]

type InstanceSummaryList = js.Array[InstanceSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Blue_
  - typings.awsSdk.awsSdkStrings.Green_
  - java.lang.String
*/
type InstanceType = _InstanceType | String

type InstanceTypeList = js.Array[InstanceType]

type InstancesList = js.Array[InstanceId]

type Key = String

type LambdaFunctionAlias = String

type LambdaFunctionName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Success_
  - typings.awsSdk.awsSdkStrings.ScriptMissing
  - typings.awsSdk.awsSdkStrings.ScriptNotExecutable
  - typings.awsSdk.awsSdkStrings.ScriptTimedOut
  - typings.awsSdk.awsSdkStrings.ScriptFailed
  - typings.awsSdk.awsSdkStrings.UnknownError
  - java.lang.String
*/
type LifecycleErrorCode = _LifecycleErrorCode | String

type LifecycleEventHookExecutionId = String

type LifecycleEventList = js.Array[LifecycleEvent]

type LifecycleEventName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Succeeded_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Skipped_
  - typings.awsSdk.awsSdkStrings.Unknown_
  - java.lang.String
*/
type LifecycleEventStatus = _LifecycleEventStatus | String

type LifecycleMessage = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.include_
  - typings.awsSdk.awsSdkStrings.exclude_
  - typings.awsSdk.awsSdkStrings.ignore__
  - java.lang.String
*/
type ListStateFilterAction = _ListStateFilterAction | String

type ListenerArn = String

type ListenerArnList = js.Array[ListenerArn]

type LogTail = String

type Message = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HOST_COUNT
  - typings.awsSdk.awsSdkStrings.FLEET_PERCENT
  - java.lang.String
*/
type MinimumHealthyHostsType = _MinimumHealthyHostsType | String

type MinimumHealthyHostsValue = Double

type NextToken = String

type NullableBoolean = scala.Boolean

type OnPremisesTagSetList = js.Array[TagFilterList]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UPDATE
  - typings.awsSdk.awsSdkStrings.IGNORE
  - java.lang.String
*/
type OutdatedInstancesStrategy = _OutdatedInstancesStrategy | String

type Percentage = Double

type RawStringContent = String

type RawStringSha256 = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Registered_
  - typings.awsSdk.awsSdkStrings.Deregistered_
  - java.lang.String
*/
type RegistrationStatus = _RegistrationStatus | String

type Repository = String

type RevisionInfoList = js.Array[RevisionInfo]

type RevisionLocationList = js.Array[RevisionLocation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.S3
  - typings.awsSdk.awsSdkStrings.GitHub_
  - typings.awsSdk.awsSdkStrings.String_
  - typings.awsSdk.awsSdkStrings.AppSpecContent
  - java.lang.String
*/
type RevisionLocationType = _RevisionLocationType | String

type Role = String

type S3Bucket = String

type S3Key = String

type ScriptName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ascending__
  - typings.awsSdk.awsSdkStrings.descending__
  - java.lang.String
*/
type SortOrder = _SortOrder | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.Succeeded_
  - java.lang.String
*/
type StopStatus = _StopStatus | String

type TagFilterList = js.Array[TagFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.KEY_ONLY
  - typings.awsSdk.awsSdkStrings.VALUE_ONLY
  - typings.awsSdk.awsSdkStrings.KEY_AND_VALUE
  - java.lang.String
*/
type TagFilterType = _TagFilterType | String

type TagKeyList = js.Array[Key]

type TagList = js.Array[Tag]

type TargetArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TargetStatus
  - typings.awsSdk.awsSdkStrings.ServerInstanceLabel
  - java.lang.String
*/
type TargetFilterName = _TargetFilterName | String

type TargetFilters = StringDictionary[FilterValueList]

type TargetGroupInfoList = js.Array[TargetGroupInfo]

type TargetGroupName = String

type TargetGroupPairInfoList = js.Array[TargetGroupPairInfo]

type TargetId = String

type TargetIdList = js.Array[TargetId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Blue_
  - typings.awsSdk.awsSdkStrings.Green_
  - java.lang.String
*/
type TargetLabel = _TargetLabel | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Succeeded_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Skipped_
  - typings.awsSdk.awsSdkStrings.Unknown_
  - typings.awsSdk.awsSdkStrings.Ready_
  - java.lang.String
*/
type TargetStatus = _TargetStatus | String

type Time = js.Date

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TimeBasedCanary
  - typings.awsSdk.awsSdkStrings.TimeBasedLinear
  - typings.awsSdk.awsSdkStrings.AllAtOnce
  - java.lang.String
*/
type TrafficRoutingType = _TrafficRoutingType | String

type TrafficWeight = Double

type TriggerConfigList = js.Array[TriggerConfig]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DeploymentStart
  - typings.awsSdk.awsSdkStrings.DeploymentSuccess
  - typings.awsSdk.awsSdkStrings.DeploymentFailure
  - typings.awsSdk.awsSdkStrings.DeploymentStop
  - typings.awsSdk.awsSdkStrings.DeploymentRollback
  - typings.awsSdk.awsSdkStrings.DeploymentReady
  - typings.awsSdk.awsSdkStrings.InstanceStart
  - typings.awsSdk.awsSdkStrings.InstanceSuccess
  - typings.awsSdk.awsSdkStrings.InstanceFailure
  - typings.awsSdk.awsSdkStrings.InstanceReady
  - java.lang.String
*/
type TriggerEventType = _TriggerEventType | String

type TriggerEventTypeList = js.Array[TriggerEventType]

type TriggerName = String

type TriggerTargetArn = String

type Value = String

type Version = String

type VersionId = String

type WaitTimeInMins = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2014-10-06`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
