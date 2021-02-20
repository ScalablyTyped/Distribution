package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object codedeployMod {
  
  type AdditionalDeploymentStatusInfo = java.lang.String
  
  type AlarmList = js.Array[typings.awsSdk.codedeployMod.Alarm]
  
  type AlarmName = java.lang.String
  
  type ApplicationId = java.lang.String
  
  type ApplicationName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.registerTime
    - typings.awsSdk.awsSdkStrings.firstUsedTime
    - typings.awsSdk.awsSdkStrings.lastUsedTime
    - java.lang.String
  */
  type ApplicationRevisionSortBy = typings.awsSdk.codedeployMod._ApplicationRevisionSortBy | java.lang.String
  
  type ApplicationsInfoList = js.Array[typings.awsSdk.codedeployMod.ApplicationInfo]
  
  type ApplicationsList = js.Array[typings.awsSdk.codedeployMod.ApplicationName]
  
  type Arn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DEPLOYMENT_FAILURE
    - typings.awsSdk.awsSdkStrings.DEPLOYMENT_STOP_ON_ALARM
    - typings.awsSdk.awsSdkStrings.DEPLOYMENT_STOP_ON_REQUEST
    - java.lang.String
  */
  type AutoRollbackEvent = typings.awsSdk.codedeployMod._AutoRollbackEvent | java.lang.String
  
  type AutoRollbackEventsList = js.Array[typings.awsSdk.codedeployMod.AutoRollbackEvent]
  
  type AutoScalingGroupHook = java.lang.String
  
  type AutoScalingGroupList = js.Array[typings.awsSdk.codedeployMod.AutoScalingGroup]
  
  type AutoScalingGroupName = java.lang.String
  
  type AutoScalingGroupNameList = js.Array[typings.awsSdk.codedeployMod.AutoScalingGroupName]
  
  type Boolean = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.tar
    - typings.awsSdk.awsSdkStrings.tgz
    - typings.awsSdk.awsSdkStrings.zip__
    - typings.awsSdk.awsSdkStrings.YAML
    - typings.awsSdk.awsSdkStrings.JSON
    - java.lang.String
  */
  type BundleType = typings.awsSdk.codedeployMod._BundleType | java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.codedeployMod.ClientApiVersions
  
  type CloudFormationResourceType = java.lang.String
  
  type CommitId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Server_
    - typings.awsSdk.awsSdkStrings.Lambda_
    - typings.awsSdk.awsSdkStrings.ECS
    - java.lang.String
  */
  type ComputePlatform = typings.awsSdk.codedeployMod._ComputePlatform | java.lang.String
  
  type DeploymentConfigId = java.lang.String
  
  type DeploymentConfigName = java.lang.String
  
  type DeploymentConfigsList = js.Array[typings.awsSdk.codedeployMod.DeploymentConfigName]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.user__
    - typings.awsSdk.awsSdkStrings.autoscaling_
    - typings.awsSdk.awsSdkStrings.codeDeployRollback
    - typings.awsSdk.awsSdkStrings.CodeDeploy
    - typings.awsSdk.awsSdkStrings.CloudFormation_
    - typings.awsSdk.awsSdkStrings.CloudFormationRollback
    - java.lang.String
  */
  type DeploymentCreator = typings.awsSdk.codedeployMod._DeploymentCreator | java.lang.String
  
  type DeploymentGroupId = java.lang.String
  
  type DeploymentGroupInfoList = js.Array[typings.awsSdk.codedeployMod.DeploymentGroupInfo]
  
  type DeploymentGroupName = java.lang.String
  
  type DeploymentGroupsList = js.Array[typings.awsSdk.codedeployMod.DeploymentGroupName]
  
  type DeploymentId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.WITH_TRAFFIC_CONTROL
    - typings.awsSdk.awsSdkStrings.WITHOUT_TRAFFIC_CONTROL
    - java.lang.String
  */
  type DeploymentOption = typings.awsSdk.codedeployMod._DeploymentOption | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CONTINUE_DEPLOYMENT
    - typings.awsSdk.awsSdkStrings.STOP_DEPLOYMENT
    - java.lang.String
  */
  type DeploymentReadyAction = typings.awsSdk.codedeployMod._DeploymentReadyAction | java.lang.String
  
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
  type DeploymentStatus = typings.awsSdk.codedeployMod._DeploymentStatus | java.lang.String
  
  type DeploymentStatusList = js.Array[typings.awsSdk.codedeployMod.DeploymentStatus]
  
  type DeploymentStatusMessageList = js.Array[typings.awsSdk.codedeployMod.ErrorMessage]
  
  type DeploymentTargetList = js.Array[typings.awsSdk.codedeployMod.DeploymentTarget]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InstanceTarget
    - typings.awsSdk.awsSdkStrings.LambdaTarget
    - typings.awsSdk.awsSdkStrings.ECSTarget
    - typings.awsSdk.awsSdkStrings.CloudFormationTarget
    - java.lang.String
  */
  type DeploymentTargetType = typings.awsSdk.codedeployMod._DeploymentTargetType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PLACE
    - typings.awsSdk.awsSdkStrings.BLUE_GREEN
    - java.lang.String
  */
  type DeploymentType = typings.awsSdk.codedeployMod._DeploymentType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.READY_WAIT
    - typings.awsSdk.awsSdkStrings.TERMINATION_WAIT
    - java.lang.String
  */
  type DeploymentWaitType = typings.awsSdk.codedeployMod._DeploymentWaitType | java.lang.String
  
  type DeploymentsInfoList = js.Array[typings.awsSdk.codedeployMod.DeploymentInfo]
  
  type DeploymentsList = js.Array[typings.awsSdk.codedeployMod.DeploymentId]
  
  type Description = java.lang.String
  
  type Duration = scala.Double
  
  type EC2TagFilterList = js.Array[typings.awsSdk.codedeployMod.EC2TagFilter]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.KEY_ONLY
    - typings.awsSdk.awsSdkStrings.VALUE_ONLY
    - typings.awsSdk.awsSdkStrings.KEY_AND_VALUE
    - java.lang.String
  */
  type EC2TagFilterType = typings.awsSdk.codedeployMod._EC2TagFilterType | java.lang.String
  
  type EC2TagSetList = js.Array[typings.awsSdk.codedeployMod.EC2TagFilterList]
  
  type ECSClusterName = java.lang.String
  
  type ECSServiceList = js.Array[typings.awsSdk.codedeployMod.ECSService]
  
  type ECSServiceName = java.lang.String
  
  type ECSTaskSetCount = scala.Double
  
  type ECSTaskSetIdentifier = java.lang.String
  
  type ECSTaskSetList = js.Array[typings.awsSdk.codedeployMod.ECSTaskSet]
  
  type ECSTaskSetStatus = java.lang.String
  
  type ELBInfoList = js.Array[typings.awsSdk.codedeployMod.ELBInfo]
  
  type ELBName = java.lang.String
  
  type ETag = java.lang.String
  
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
  type ErrorCode = typings.awsSdk.codedeployMod._ErrorCode | java.lang.String
  
  type ErrorMessage = java.lang.String
  
  type ExternalId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DISALLOW
    - typings.awsSdk.awsSdkStrings.OVERWRITE
    - typings.awsSdk.awsSdkStrings.RETAIN
    - java.lang.String
  */
  type FileExistsBehavior = typings.awsSdk.codedeployMod._FileExistsBehavior | java.lang.String
  
  type FilterValue = java.lang.String
  
  type FilterValueList = js.Array[typings.awsSdk.codedeployMod.FilterValue]
  
  type GitHubAccountTokenName = java.lang.String
  
  type GitHubAccountTokenNameList = js.Array[typings.awsSdk.codedeployMod.GitHubAccountTokenName]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DISCOVER_EXISTING
    - typings.awsSdk.awsSdkStrings.COPY_AUTO_SCALING_GROUP
    - java.lang.String
  */
  type GreenFleetProvisioningAction = typings.awsSdk.codedeployMod._GreenFleetProvisioningAction | java.lang.String
  
  type IamSessionArn = java.lang.String
  
  type IamUserArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TERMINATE
    - typings.awsSdk.awsSdkStrings.KEEP_ALIVE
    - java.lang.String
  */
  type InstanceAction = typings.awsSdk.codedeployMod._InstanceAction | java.lang.String
  
  type InstanceArn = java.lang.String
  
  type InstanceCount = scala.Double
  
  type InstanceId = java.lang.String
  
  type InstanceInfoList = js.Array[typings.awsSdk.codedeployMod.InstanceInfo]
  
  type InstanceName = java.lang.String
  
  type InstanceNameList = js.Array[typings.awsSdk.codedeployMod.InstanceName]
  
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
  type InstanceStatus = typings.awsSdk.codedeployMod._InstanceStatus | java.lang.String
  
  type InstanceStatusList = js.Array[typings.awsSdk.codedeployMod.InstanceStatus]
  
  type InstanceSummaryList = js.Array[typings.awsSdk.codedeployMod.InstanceSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Blue_
    - typings.awsSdk.awsSdkStrings.Green_
    - java.lang.String
  */
  type InstanceType = typings.awsSdk.codedeployMod._InstanceType | java.lang.String
  
  type InstanceTypeList = js.Array[typings.awsSdk.codedeployMod.InstanceType]
  
  type InstancesList = js.Array[typings.awsSdk.codedeployMod.InstanceId]
  
  type Key = java.lang.String
  
  type LambdaFunctionAlias = java.lang.String
  
  type LambdaFunctionName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Success_
    - typings.awsSdk.awsSdkStrings.ScriptMissing
    - typings.awsSdk.awsSdkStrings.ScriptNotExecutable
    - typings.awsSdk.awsSdkStrings.ScriptTimedOut
    - typings.awsSdk.awsSdkStrings.ScriptFailed
    - typings.awsSdk.awsSdkStrings.UnknownError
    - java.lang.String
  */
  type LifecycleErrorCode = typings.awsSdk.codedeployMod._LifecycleErrorCode | java.lang.String
  
  type LifecycleEventHookExecutionId = java.lang.String
  
  type LifecycleEventList = js.Array[typings.awsSdk.codedeployMod.LifecycleEvent]
  
  type LifecycleEventName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Succeeded_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Skipped_
    - typings.awsSdk.awsSdkStrings.Unknown_
    - java.lang.String
  */
  type LifecycleEventStatus = typings.awsSdk.codedeployMod._LifecycleEventStatus | java.lang.String
  
  type LifecycleMessage = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.include_
    - typings.awsSdk.awsSdkStrings.exclude_
    - typings.awsSdk.awsSdkStrings.ignore__
    - java.lang.String
  */
  type ListStateFilterAction = typings.awsSdk.codedeployMod._ListStateFilterAction | java.lang.String
  
  type ListenerArn = java.lang.String
  
  type ListenerArnList = js.Array[typings.awsSdk.codedeployMod.ListenerArn]
  
  type LogTail = java.lang.String
  
  type Message = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.HOST_COUNT
    - typings.awsSdk.awsSdkStrings.FLEET_PERCENT
    - java.lang.String
  */
  type MinimumHealthyHostsType = typings.awsSdk.codedeployMod._MinimumHealthyHostsType | java.lang.String
  
  type MinimumHealthyHostsValue = scala.Double
  
  type NextToken = java.lang.String
  
  type NullableBoolean = scala.Boolean
  
  type OnPremisesTagSetList = js.Array[typings.awsSdk.codedeployMod.TagFilterList]
  
  type Percentage = scala.Double
  
  type RawStringContent = java.lang.String
  
  type RawStringSha256 = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Registered_
    - typings.awsSdk.awsSdkStrings.Deregistered_
    - java.lang.String
  */
  type RegistrationStatus = typings.awsSdk.codedeployMod._RegistrationStatus | java.lang.String
  
  type Repository = java.lang.String
  
  type RevisionInfoList = js.Array[typings.awsSdk.codedeployMod.RevisionInfo]
  
  type RevisionLocationList = js.Array[typings.awsSdk.codedeployMod.RevisionLocation]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.S3
    - typings.awsSdk.awsSdkStrings.GitHub_
    - typings.awsSdk.awsSdkStrings.String_
    - typings.awsSdk.awsSdkStrings.AppSpecContent
    - java.lang.String
  */
  type RevisionLocationType = typings.awsSdk.codedeployMod._RevisionLocationType | java.lang.String
  
  type Role = java.lang.String
  
  type S3Bucket = java.lang.String
  
  type S3Key = java.lang.String
  
  type ScriptName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ascending__
    - typings.awsSdk.awsSdkStrings.descending__
    - java.lang.String
  */
  type SortOrder = typings.awsSdk.codedeployMod._SortOrder | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.Succeeded_
    - java.lang.String
  */
  type StopStatus = typings.awsSdk.codedeployMod._StopStatus | java.lang.String
  
  type TagFilterList = js.Array[typings.awsSdk.codedeployMod.TagFilter]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.KEY_ONLY
    - typings.awsSdk.awsSdkStrings.VALUE_ONLY
    - typings.awsSdk.awsSdkStrings.KEY_AND_VALUE
    - java.lang.String
  */
  type TagFilterType = typings.awsSdk.codedeployMod._TagFilterType | java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.codedeployMod.Key]
  
  type TagList = js.Array[typings.awsSdk.codedeployMod.Tag]
  
  type TargetArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TargetStatus
    - typings.awsSdk.awsSdkStrings.ServerInstanceLabel
    - java.lang.String
  */
  type TargetFilterName = typings.awsSdk.codedeployMod._TargetFilterName | java.lang.String
  
  type TargetFilters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.codedeployMod.FilterValueList]
  
  type TargetGroupInfoList = js.Array[typings.awsSdk.codedeployMod.TargetGroupInfo]
  
  type TargetGroupName = java.lang.String
  
  type TargetGroupPairInfoList = js.Array[typings.awsSdk.codedeployMod.TargetGroupPairInfo]
  
  type TargetId = java.lang.String
  
  type TargetIdList = js.Array[typings.awsSdk.codedeployMod.TargetId]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Blue_
    - typings.awsSdk.awsSdkStrings.Green_
    - java.lang.String
  */
  type TargetLabel = typings.awsSdk.codedeployMod._TargetLabel | java.lang.String
  
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
  type TargetStatus = typings.awsSdk.codedeployMod._TargetStatus | java.lang.String
  
  type Time = typings.std.Date
  
  type Timestamp = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TimeBasedCanary
    - typings.awsSdk.awsSdkStrings.TimeBasedLinear
    - typings.awsSdk.awsSdkStrings.AllAtOnce
    - java.lang.String
  */
  type TrafficRoutingType = typings.awsSdk.codedeployMod._TrafficRoutingType | java.lang.String
  
  type TrafficWeight = scala.Double
  
  type TriggerConfigList = js.Array[typings.awsSdk.codedeployMod.TriggerConfig]
  
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
  type TriggerEventType = typings.awsSdk.codedeployMod._TriggerEventType | java.lang.String
  
  type TriggerEventTypeList = js.Array[typings.awsSdk.codedeployMod.TriggerEventType]
  
  type TriggerName = java.lang.String
  
  type TriggerTargetArn = java.lang.String
  
  type Value = java.lang.String
  
  type Version = java.lang.String
  
  type VersionId = java.lang.String
  
  type WaitTimeInMins = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2014-10-06`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.codedeployMod._apiVersion | java.lang.String
}
