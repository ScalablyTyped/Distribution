package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object robomakerMod {
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.X86_64
    - typings.awsSdk.awsSdkStrings.ARM64
    - typings.awsSdk.awsSdkStrings.ARMHF
    - java.lang.String
  */
  type Architecture = typings.awsSdk.robomakerMod._Architecture | java.lang.String
  type Arn = java.lang.String
  type Arns = js.Array[typings.awsSdk.robomakerMod.Arn]
  type Boolean = scala.Boolean
  type BoxedBoolean = scala.Boolean
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.robomakerMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type Command = java.lang.String
  type CreatedAt = typings.std.Date
  type DataSourceConfigs = js.Array[typings.awsSdk.robomakerMod.DataSourceConfig]
  type DataSourceNames = js.Array[typings.awsSdk.robomakerMod.Name]
  type DataSources = js.Array[typings.awsSdk.robomakerMod.DataSource]
  type DeploymentApplicationConfigs = js.Array[typings.awsSdk.robomakerMod.DeploymentApplicationConfig]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ResourceNotFound
    - typings.awsSdk.awsSdkStrings.EnvironmentSetupError
    - typings.awsSdk.awsSdkStrings.EtagMismatch
    - typings.awsSdk.awsSdkStrings.FailureThresholdBreached
    - typings.awsSdk.awsSdkStrings.RobotDeploymentAborted
    - typings.awsSdk.awsSdkStrings.RobotDeploymentNoResponse
    - typings.awsSdk.awsSdkStrings.RobotAgentConnectionTimeout
    - typings.awsSdk.awsSdkStrings.GreengrassDeploymentFailed
    - typings.awsSdk.awsSdkStrings.MissingRobotArchitecture
    - typings.awsSdk.awsSdkStrings.MissingRobotApplicationArchitecture
    - typings.awsSdk.awsSdkStrings.MissingRobotDeploymentResource
    - typings.awsSdk.awsSdkStrings.GreengrassGroupVersionDoesNotExist
    - typings.awsSdk.awsSdkStrings.ExtractingBundleFailure
    - typings.awsSdk.awsSdkStrings.PreLaunchFileFailure
    - typings.awsSdk.awsSdkStrings.PostLaunchFileFailure
    - typings.awsSdk.awsSdkStrings.BadPermissionError
    - typings.awsSdk.awsSdkStrings.DownloadConditionFailed
    - typings.awsSdk.awsSdkStrings.InternalServerError
    - java.lang.String
  */
  type DeploymentJobErrorCode = typings.awsSdk.robomakerMod._DeploymentJobErrorCode | java.lang.String
  type DeploymentJobs = js.Array[typings.awsSdk.robomakerMod.DeploymentJob]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.Preparing_
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Succeeded_
    - typings.awsSdk.awsSdkStrings.Canceled_
    - java.lang.String
  */
  type DeploymentStatus = typings.awsSdk.robomakerMod._DeploymentStatus | java.lang.String
  type DeploymentTimeout = scala.Double
  type DeploymentVersion = java.lang.String
  type EnvironmentVariableKey = java.lang.String
  type EnvironmentVariableMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.robomakerMod.EnvironmentVariableValue]
  type EnvironmentVariableValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Fail_
    - typings.awsSdk.awsSdkStrings.Continue_
    - java.lang.String
  */
  type FailureBehavior = typings.awsSdk.robomakerMod._FailureBehavior | java.lang.String
  type FilterValues = js.Array[typings.awsSdk.robomakerMod.Name]
  type Filters = js.Array[typings.awsSdk.robomakerMod.Filter]
  type Fleets = js.Array[typings.awsSdk.robomakerMod.Fleet]
  type GenericInteger = scala.Double
  type GenericString = java.lang.String
  type IamRole = java.lang.String
  type Id = java.lang.String
  type JobDuration = scala.Double
  type LastStartedAt = typings.std.Date
  type LastUpdatedAt = typings.std.Date
  type MaxResults = scala.Double
  type Name = java.lang.String
  type NonEmptyString = java.lang.String
  type NonSystemPort = scala.Double
  type PaginationToken = java.lang.String
  type Path = java.lang.String
  type PercentDone = scala.Double
  type Percentage = scala.Double
  type Port = scala.Double
  type PortMappingList = js.Array[typings.awsSdk.robomakerMod.PortMapping]
  type RenderingEngineType = typings.awsSdk.awsSdkStrings.OGRE | java.lang.String
  type RenderingEngineVersionType = java.lang.String
  type RevisionId = java.lang.String
  type RobotApplicationConfigs = js.Array[typings.awsSdk.robomakerMod.RobotApplicationConfig]
  type RobotApplicationNames = js.Array[typings.awsSdk.robomakerMod.Name]
  type RobotApplicationSummaries = js.Array[typings.awsSdk.robomakerMod.RobotApplicationSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Validating_
    - typings.awsSdk.awsSdkStrings.DownloadingExtracting
    - typings.awsSdk.awsSdkStrings.ExecutingDownloadCondition
    - typings.awsSdk.awsSdkStrings.ExecutingPreLaunch
    - typings.awsSdk.awsSdkStrings.Launching_
    - typings.awsSdk.awsSdkStrings.ExecutingPostLaunch
    - typings.awsSdk.awsSdkStrings.Finished_
    - java.lang.String
  */
  type RobotDeploymentStep = typings.awsSdk.robomakerMod._RobotDeploymentStep | java.lang.String
  type RobotDeploymentSummary = js.Array[typings.awsSdk.robomakerMod.RobotDeployment]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ROS
    - typings.awsSdk.awsSdkStrings.ROS2
    - java.lang.String
  */
  type RobotSoftwareSuiteType = typings.awsSdk.robomakerMod._RobotSoftwareSuiteType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Kinetic
    - typings.awsSdk.awsSdkStrings.Melodic
    - typings.awsSdk.awsSdkStrings.Dashing
    - java.lang.String
  */
  type RobotSoftwareSuiteVersionType = typings.awsSdk.robomakerMod._RobotSoftwareSuiteVersionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Available_
    - typings.awsSdk.awsSdkStrings.Registered_
    - typings.awsSdk.awsSdkStrings.PendingNewDeployment
    - typings.awsSdk.awsSdkStrings.Deploying_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.InSync_
    - typings.awsSdk.awsSdkStrings.NoResponse
    - java.lang.String
  */
  type RobotStatus = typings.awsSdk.robomakerMod._RobotStatus | java.lang.String
  type Robots = js.Array[typings.awsSdk.robomakerMod.Robot]
  type S3Bucket = java.lang.String
  type S3Etag = java.lang.String
  type S3Key = java.lang.String
  type S3KeyOutputs = js.Array[typings.awsSdk.robomakerMod.S3KeyOutput]
  type S3Keys = js.Array[typings.awsSdk.robomakerMod.S3Key]
  type SecurityGroups = js.Array[typings.awsSdk.robomakerMod.NonEmptyString]
  type SimulationApplicationConfigs = js.Array[typings.awsSdk.robomakerMod.SimulationApplicationConfig]
  type SimulationApplicationNames = js.Array[typings.awsSdk.robomakerMod.Name]
  type SimulationApplicationSummaries = js.Array[typings.awsSdk.robomakerMod.SimulationApplicationSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InternalServiceError
    - typings.awsSdk.awsSdkStrings.RobotApplicationCrash
    - typings.awsSdk.awsSdkStrings.SimulationApplicationCrash
    - typings.awsSdk.awsSdkStrings.BadPermissionsRobotApplication
    - typings.awsSdk.awsSdkStrings.BadPermissionsSimulationApplication
    - typings.awsSdk.awsSdkStrings.BadPermissionsS3Object
    - typings.awsSdk.awsSdkStrings.BadPermissionsS3Output
    - typings.awsSdk.awsSdkStrings.BadPermissionsCloudwatchLogs
    - typings.awsSdk.awsSdkStrings.SubnetIpLimitExceeded
    - typings.awsSdk.awsSdkStrings.ENILimitExceeded
    - typings.awsSdk.awsSdkStrings.BadPermissionsUserCredentials
    - typings.awsSdk.awsSdkStrings.InvalidBundleRobotApplication
    - typings.awsSdk.awsSdkStrings.InvalidBundleSimulationApplication
    - typings.awsSdk.awsSdkStrings.InvalidS3Resource
    - typings.awsSdk.awsSdkStrings.MismatchedEtag
    - typings.awsSdk.awsSdkStrings.RobotApplicationVersionMismatchedEtag
    - typings.awsSdk.awsSdkStrings.SimulationApplicationVersionMismatchedEtag
    - typings.awsSdk.awsSdkStrings.ResourceNotFound
    - typings.awsSdk.awsSdkStrings.InvalidInput
    - typings.awsSdk.awsSdkStrings.WrongRegionS3Bucket
    - typings.awsSdk.awsSdkStrings.WrongRegionS3Output
    - typings.awsSdk.awsSdkStrings.WrongRegionRobotApplication
    - typings.awsSdk.awsSdkStrings.WrongRegionSimulationApplication
    - java.lang.String
  */
  type SimulationJobErrorCode = typings.awsSdk.robomakerMod._SimulationJobErrorCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.Preparing_
    - typings.awsSdk.awsSdkStrings.Running_
    - typings.awsSdk.awsSdkStrings.Restarting
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.RunningFailed
    - typings.awsSdk.awsSdkStrings.Terminating_
    - typings.awsSdk.awsSdkStrings.Terminated_
    - typings.awsSdk.awsSdkStrings.Canceled_
    - java.lang.String
  */
  type SimulationJobStatus = typings.awsSdk.robomakerMod._SimulationJobStatus | java.lang.String
  type SimulationJobSummaries = js.Array[typings.awsSdk.robomakerMod.SimulationJobSummary]
  type SimulationJobs = js.Array[typings.awsSdk.robomakerMod.SimulationJob]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Gazebo
    - typings.awsSdk.awsSdkStrings.RosbagPlay
    - java.lang.String
  */
  type SimulationSoftwareSuiteType = typings.awsSdk.robomakerMod._SimulationSoftwareSuiteType | java.lang.String
  type SimulationSoftwareSuiteVersionType = java.lang.String
  type SimulationTimeMillis = scala.Double
  type SourceConfigs = js.Array[typings.awsSdk.robomakerMod.SourceConfig]
  type Sources = js.Array[typings.awsSdk.robomakerMod.Source]
  type Subnets = js.Array[typings.awsSdk.robomakerMod.NonEmptyString]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.robomakerMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.robomakerMod.TagValue]
  type TagValue = java.lang.String
  type Version = java.lang.String
  type VersionQualifier = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-06-29`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.robomakerMod._apiVersion | java.lang.String
}
