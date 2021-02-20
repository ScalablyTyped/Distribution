package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object elasticbeanstalkMod {
  
  type ARN = java.lang.String
  
  type AbortableOperationInProgress = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Unknown_
    - java.lang.String
  */
  type ActionHistoryStatus = typings.awsSdk.elasticbeanstalkMod._ActionHistoryStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Scheduled_
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.Running_
    - typings.awsSdk.awsSdkStrings.Unknown_
    - java.lang.String
  */
  type ActionStatus = typings.awsSdk.elasticbeanstalkMod._ActionStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InstanceRefresh
    - typings.awsSdk.awsSdkStrings.PlatformUpdate
    - typings.awsSdk.awsSdkStrings.Unknown_
    - java.lang.String
  */
  type ActionType = typings.awsSdk.elasticbeanstalkMod._ActionType | java.lang.String
  
  type ApplicationArn = java.lang.String
  
  type ApplicationDescriptionList = js.Array[typings.awsSdk.elasticbeanstalkMod.ApplicationDescription]
  
  type ApplicationName = java.lang.String
  
  type ApplicationNamesList = js.Array[typings.awsSdk.elasticbeanstalkMod.ApplicationName]
  
  type ApplicationVersionArn = java.lang.String
  
  type ApplicationVersionDescriptionList = js.Array[typings.awsSdk.elasticbeanstalkMod.ApplicationVersionDescription]
  
  type ApplicationVersionProccess = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Processed
    - typings.awsSdk.awsSdkStrings.Unprocessed
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Processing_
    - typings.awsSdk.awsSdkStrings.Building_
    - java.lang.String
  */
  type ApplicationVersionStatus = typings.awsSdk.elasticbeanstalkMod._ApplicationVersionStatus | java.lang.String
  
  type AutoCreateApplication = scala.Boolean
  
  type AutoScalingGroupList = js.Array[typings.awsSdk.elasticbeanstalkMod.AutoScalingGroup]
  
  type AvailableSolutionStackDetailsList = js.Array[typings.awsSdk.elasticbeanstalkMod.SolutionStackDescription]
  
  type AvailableSolutionStackNamesList = js.Array[typings.awsSdk.elasticbeanstalkMod.SolutionStackName]
  
  type BoxedBoolean = scala.Boolean
  
  type BoxedInt = scala.Double
  
  type BranchName = java.lang.String
  
  type BranchOrder = scala.Double
  
  type Cause = java.lang.String
  
  type Causes = js.Array[typings.awsSdk.elasticbeanstalkMod.Cause]
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.elasticbeanstalkMod.ClientApiVersions
  
  type CnameAvailability = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.BUILD_GENERAL1_SMALL
    - typings.awsSdk.awsSdkStrings.BUILD_GENERAL1_MEDIUM
    - typings.awsSdk.awsSdkStrings.BUILD_GENERAL1_LARGE
    - java.lang.String
  */
  type ComputeType = typings.awsSdk.elasticbeanstalkMod._ComputeType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.deployed_
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type ConfigurationDeploymentStatus = typings.awsSdk.elasticbeanstalkMod._ConfigurationDeploymentStatus | java.lang.String
  
  type ConfigurationOptionDefaultValue = java.lang.String
  
  type ConfigurationOptionDescriptionsList = js.Array[typings.awsSdk.elasticbeanstalkMod.ConfigurationOptionDescription]
  
  type ConfigurationOptionName = java.lang.String
  
  type ConfigurationOptionPossibleValue = java.lang.String
  
  type ConfigurationOptionPossibleValues = js.Array[typings.awsSdk.elasticbeanstalkMod.ConfigurationOptionPossibleValue]
  
  type ConfigurationOptionSettingsList = js.Array[typings.awsSdk.elasticbeanstalkMod.ConfigurationOptionSetting]
  
  type ConfigurationOptionSeverity = java.lang.String
  
  type ConfigurationOptionValue = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Scalar
    - typings.awsSdk.awsSdkStrings.List
    - java.lang.String
  */
  type ConfigurationOptionValueType = typings.awsSdk.elasticbeanstalkMod._ConfigurationOptionValueType | java.lang.String
  
  type ConfigurationSettingsDescriptionList = js.Array[typings.awsSdk.elasticbeanstalkMod.ConfigurationSettingsDescription]
  
  type ConfigurationTemplateName = java.lang.String
  
  type ConfigurationTemplateNamesList = js.Array[typings.awsSdk.elasticbeanstalkMod.ConfigurationTemplateName]
  
  type CreationDate = typings.std.Date
  
  type CustomAmiList = js.Array[typings.awsSdk.elasticbeanstalkMod.CustomAmi]
  
  type DNSCname = java.lang.String
  
  type DNSCnamePrefix = java.lang.String
  
  type DeleteSourceBundle = scala.Boolean
  
  type DeploymentTimestamp = typings.std.Date
  
  type Description = java.lang.String
  
  type Ec2InstanceId = java.lang.String
  
  type EndpointURL = java.lang.String
  
  type EnvironmentArn = java.lang.String
  
  type EnvironmentDescriptionsList = js.Array[typings.awsSdk.elasticbeanstalkMod.EnvironmentDescription]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Green_
    - typings.awsSdk.awsSdkStrings.Yellow_
    - typings.awsSdk.awsSdkStrings.Red_
    - typings.awsSdk.awsSdkStrings.Grey
    - java.lang.String
  */
  type EnvironmentHealth = typings.awsSdk.elasticbeanstalkMod._EnvironmentHealth | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Status_
    - typings.awsSdk.awsSdkStrings.Color_
    - typings.awsSdk.awsSdkStrings.Causes
    - typings.awsSdk.awsSdkStrings.ApplicationMetrics
    - typings.awsSdk.awsSdkStrings.InstancesHealth
    - typings.awsSdk.awsSdkStrings.All_
    - typings.awsSdk.awsSdkStrings.HealthStatus
    - typings.awsSdk.awsSdkStrings.RefreshedAt
    - java.lang.String
  */
  type EnvironmentHealthAttribute = typings.awsSdk.elasticbeanstalkMod._EnvironmentHealthAttribute | java.lang.String
  
  type EnvironmentHealthAttributes = js.Array[typings.awsSdk.elasticbeanstalkMod.EnvironmentHealthAttribute]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NoData
    - typings.awsSdk.awsSdkStrings.Unknown_
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.Ok_
    - typings.awsSdk.awsSdkStrings.Info_
    - typings.awsSdk.awsSdkStrings.Warning_
    - typings.awsSdk.awsSdkStrings.Degraded_
    - typings.awsSdk.awsSdkStrings.Severe
    - typings.awsSdk.awsSdkStrings.Suspended_
    - java.lang.String
  */
  type EnvironmentHealthStatus = typings.awsSdk.elasticbeanstalkMod._EnvironmentHealthStatus | java.lang.String
  
  type EnvironmentId = java.lang.String
  
  type EnvironmentIdList = js.Array[typings.awsSdk.elasticbeanstalkMod.EnvironmentId]
  
  type EnvironmentInfoDescriptionList = js.Array[typings.awsSdk.elasticbeanstalkMod.EnvironmentInfoDescription]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.tail_
    - typings.awsSdk.awsSdkStrings.bundle
    - java.lang.String
  */
  type EnvironmentInfoType = typings.awsSdk.elasticbeanstalkMod._EnvironmentInfoType | java.lang.String
  
  type EnvironmentLinks = js.Array[typings.awsSdk.elasticbeanstalkMod.EnvironmentLink]
  
  type EnvironmentName = java.lang.String
  
  type EnvironmentNamesList = js.Array[typings.awsSdk.elasticbeanstalkMod.EnvironmentName]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Aborting_
    - typings.awsSdk.awsSdkStrings.Launching_
    - typings.awsSdk.awsSdkStrings.Updating_
    - typings.awsSdk.awsSdkStrings.LinkingFrom
    - typings.awsSdk.awsSdkStrings.LinkingTo
    - typings.awsSdk.awsSdkStrings.Ready_
    - typings.awsSdk.awsSdkStrings.Terminating_
    - typings.awsSdk.awsSdkStrings.Terminated_
    - java.lang.String
  */
  type EnvironmentStatus = typings.awsSdk.elasticbeanstalkMod._EnvironmentStatus | java.lang.String
  
  type EventDate = typings.std.Date
  
  type EventDescriptionList = js.Array[typings.awsSdk.elasticbeanstalkMod.EventDescription]
  
  type EventMessage = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TRACE
    - typings.awsSdk.awsSdkStrings.DEBUG
    - typings.awsSdk.awsSdkStrings.INFO
    - typings.awsSdk.awsSdkStrings.WARN
    - typings.awsSdk.awsSdkStrings.ERROR
    - typings.awsSdk.awsSdkStrings.FATAL
    - java.lang.String
  */
  type EventSeverity = typings.awsSdk.elasticbeanstalkMod._EventSeverity | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.UpdateCancelled
    - typings.awsSdk.awsSdkStrings.CancellationFailed
    - typings.awsSdk.awsSdkStrings.RollbackFailed
    - typings.awsSdk.awsSdkStrings.RollbackSuccessful
    - typings.awsSdk.awsSdkStrings.InternalFailure
    - typings.awsSdk.awsSdkStrings.InvalidEnvironmentState
    - typings.awsSdk.awsSdkStrings.PermissionsError
    - java.lang.String
  */
  type FailureType = typings.awsSdk.elasticbeanstalkMod._FailureType | java.lang.String
  
  type FileTypeExtension = java.lang.String
  
  type ForceTerminate = scala.Boolean
  
  type GroupName = java.lang.String
  
  type ImageId = java.lang.String
  
  type IncludeDeleted = scala.Boolean
  
  type IncludeDeletedBackTo = typings.std.Date
  
  type InstanceHealthList = js.Array[typings.awsSdk.elasticbeanstalkMod.SingleInstanceHealth]
  
  type InstanceId = java.lang.String
  
  type InstanceList = js.Array[typings.awsSdk.elasticbeanstalkMod.Instance]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.HealthStatus
    - typings.awsSdk.awsSdkStrings.Color_
    - typings.awsSdk.awsSdkStrings.Causes
    - typings.awsSdk.awsSdkStrings.ApplicationMetrics
    - typings.awsSdk.awsSdkStrings.RefreshedAt
    - typings.awsSdk.awsSdkStrings.LaunchedAt
    - typings.awsSdk.awsSdkStrings.System_
    - typings.awsSdk.awsSdkStrings.Deployment
    - typings.awsSdk.awsSdkStrings.AvailabilityZone
    - typings.awsSdk.awsSdkStrings.InstanceType
    - typings.awsSdk.awsSdkStrings.All_
    - java.lang.String
  */
  type InstancesHealthAttribute = typings.awsSdk.elasticbeanstalkMod._InstancesHealthAttribute | java.lang.String
  
  type InstancesHealthAttributes = js.Array[typings.awsSdk.elasticbeanstalkMod.InstancesHealthAttribute]
  
  type Integer = scala.Double
  
  type LaunchConfigurationList = js.Array[typings.awsSdk.elasticbeanstalkMod.LaunchConfiguration]
  
  type LaunchTemplateList = js.Array[typings.awsSdk.elasticbeanstalkMod.LaunchTemplate]
  
  type LaunchedAt = typings.std.Date
  
  type LoadAverage = js.Array[typings.awsSdk.elasticbeanstalkMod.LoadAverageValue]
  
  type LoadAverageValue = scala.Double
  
  type LoadBalancerList = js.Array[typings.awsSdk.elasticbeanstalkMod.LoadBalancer]
  
  type LoadBalancerListenersDescription = js.Array[typings.awsSdk.elasticbeanstalkMod.Listener]
  
  type Maintainer = java.lang.String
  
  type ManagedActionHistoryItems = js.Array[typings.awsSdk.elasticbeanstalkMod.ManagedActionHistoryItem]
  
  type ManagedActions = js.Array[typings.awsSdk.elasticbeanstalkMod.ManagedAction]
  
  type MaxRecords = scala.Double
  
  type Message = java.lang.String
  
  type NextToken = java.lang.String
  
  type NonEmptyString = java.lang.String
  
  type NullableDouble = scala.Double
  
  type NullableInteger = scala.Double
  
  type NullableLong = scala.Double
  
  type OperatingSystemName = java.lang.String
  
  type OperatingSystemVersion = java.lang.String
  
  type OperationsRole = java.lang.String
  
  type OptionNamespace = java.lang.String
  
  type OptionRestrictionMaxLength = scala.Double
  
  type OptionRestrictionMaxValue = scala.Double
  
  type OptionRestrictionMinValue = scala.Double
  
  type OptionsSpecifierList = js.Array[typings.awsSdk.elasticbeanstalkMod.OptionSpecification]
  
  type PlatformArn = java.lang.String
  
  type PlatformBranchLifecycleState = java.lang.String
  
  type PlatformBranchMaxRecords = scala.Double
  
  type PlatformBranchSummaryList = js.Array[typings.awsSdk.elasticbeanstalkMod.PlatformBranchSummary]
  
  type PlatformCategory = java.lang.String
  
  type PlatformFilterOperator = java.lang.String
  
  type PlatformFilterType = java.lang.String
  
  type PlatformFilterValue = java.lang.String
  
  type PlatformFilterValueList = js.Array[typings.awsSdk.elasticbeanstalkMod.PlatformFilterValue]
  
  type PlatformFilters = js.Array[typings.awsSdk.elasticbeanstalkMod.PlatformFilter]
  
  type PlatformFrameworks = js.Array[typings.awsSdk.elasticbeanstalkMod.PlatformFramework]
  
  type PlatformLifecycleState = java.lang.String
  
  type PlatformMaxRecords = scala.Double
  
  type PlatformName = java.lang.String
  
  type PlatformOwner = java.lang.String
  
  type PlatformProgrammingLanguages = js.Array[typings.awsSdk.elasticbeanstalkMod.PlatformProgrammingLanguage]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Creating_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Ready_
    - typings.awsSdk.awsSdkStrings.Deleting_
    - typings.awsSdk.awsSdkStrings.Deleted_
    - java.lang.String
  */
  type PlatformStatus = typings.awsSdk.elasticbeanstalkMod._PlatformStatus | java.lang.String
  
  type PlatformSummaryList = js.Array[typings.awsSdk.elasticbeanstalkMod.PlatformSummary]
  
  type PlatformVersion = java.lang.String
  
  type QueueList = js.Array[typings.awsSdk.elasticbeanstalkMod.Queue]
  
  type RefreshedAt = typings.std.Date
  
  type RegexLabel = java.lang.String
  
  type RegexPattern = java.lang.String
  
  type RequestCount = scala.Double
  
  type RequestId = java.lang.String
  
  type ResourceArn = java.lang.String
  
  type ResourceId = java.lang.String
  
  type ResourceName = java.lang.String
  
  type S3Bucket = java.lang.String
  
  type S3Key = java.lang.String
  
  type SampleTimestamp = typings.std.Date
  
  type SearchFilterAttribute = java.lang.String
  
  type SearchFilterOperator = java.lang.String
  
  type SearchFilterValue = java.lang.String
  
  type SearchFilterValues = js.Array[typings.awsSdk.elasticbeanstalkMod.SearchFilterValue]
  
  type SearchFilters = js.Array[typings.awsSdk.elasticbeanstalkMod.SearchFilter]
  
  type SolutionStackFileTypeList = js.Array[typings.awsSdk.elasticbeanstalkMod.FileTypeExtension]
  
  type SolutionStackName = java.lang.String
  
  type SourceLocation = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CodeCommit_
    - typings.awsSdk.awsSdkStrings.S3
    - java.lang.String
  */
  type SourceRepository = typings.awsSdk.elasticbeanstalkMod._SourceRepository | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Git
    - typings.awsSdk.awsSdkStrings.Zip_
    - java.lang.String
  */
  type SourceType = typings.awsSdk.elasticbeanstalkMod._SourceType | java.lang.String
  
  type String = java.lang.String
  
  type SupportedAddon = java.lang.String
  
  type SupportedAddonList = js.Array[typings.awsSdk.elasticbeanstalkMod.SupportedAddon]
  
  type SupportedTier = java.lang.String
  
  type SupportedTierList = js.Array[typings.awsSdk.elasticbeanstalkMod.SupportedTier]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.elasticbeanstalkMod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.elasticbeanstalkMod.Tag]
  
  type TagValue = java.lang.String
  
  type Tags = js.Array[typings.awsSdk.elasticbeanstalkMod.Tag]
  
  type TerminateEnvForce = scala.Boolean
  
  type TerminateEnvironmentResources = scala.Boolean
  
  type TimeFilterEnd = typings.std.Date
  
  type TimeFilterStart = typings.std.Date
  
  type Timestamp = typings.std.Date
  
  type Token = java.lang.String
  
  type TriggerList = js.Array[typings.awsSdk.elasticbeanstalkMod.Trigger]
  
  type UpdateDate = typings.std.Date
  
  type UserDefinedOption = scala.Boolean
  
  type ValidationMessageString = java.lang.String
  
  type ValidationMessagesList = js.Array[typings.awsSdk.elasticbeanstalkMod.ValidationMessage]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.error__
    - typings.awsSdk.awsSdkStrings.warning__
    - java.lang.String
  */
  type ValidationSeverity = typings.awsSdk.elasticbeanstalkMod._ValidationSeverity | java.lang.String
  
  type VersionLabel = java.lang.String
  
  type VersionLabels = js.Array[typings.awsSdk.elasticbeanstalkMod.VersionLabel]
  
  type VersionLabelsList = js.Array[typings.awsSdk.elasticbeanstalkMod.VersionLabel]
  
  type VirtualizationType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2010-12-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.elasticbeanstalkMod._apiVersion | java.lang.String
}
