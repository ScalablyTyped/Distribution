package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AmiId = java.lang.String

type AppDescription = java.lang.String

type AppId = java.lang.String

type AppIdWithValidation = java.lang.String

type AppIds = js.Array[typings.awsSdk.smsMod.AppId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_CONFIGURED
  - typings.awsSdk.awsSdkStrings.CONFIGURED
  - java.lang.String
*/
type AppLaunchConfigurationStatus = typings.awsSdk.smsMod._AppLaunchConfigurationStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.READY_FOR_CONFIGURATION
  - typings.awsSdk.awsSdkStrings.CONFIGURATION_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CONFIGURATION_INVALID
  - typings.awsSdk.awsSdkStrings.READY_FOR_LAUNCH
  - typings.awsSdk.awsSdkStrings.VALIDATION_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.LAUNCH_PENDING
  - typings.awsSdk.awsSdkStrings.LAUNCH_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.LAUNCHED
  - typings.awsSdk.awsSdkStrings.PARTIALLY_LAUNCHED
  - typings.awsSdk.awsSdkStrings.DELTA_LAUNCH_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELTA_LAUNCH_FAILED
  - typings.awsSdk.awsSdkStrings.LAUNCH_FAILED
  - typings.awsSdk.awsSdkStrings.TERMINATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.TERMINATE_FAILED
  - typings.awsSdk.awsSdkStrings.TERMINATED
  - java.lang.String
*/
type AppLaunchStatus = typings.awsSdk.smsMod._AppLaunchStatus | java.lang.String

type AppLaunchStatusMessage = java.lang.String

type AppName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_CONFIGURED
  - typings.awsSdk.awsSdkStrings.CONFIGURED
  - java.lang.String
*/
type AppReplicationConfigurationStatus = typings.awsSdk.smsMod._AppReplicationConfigurationStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.READY_FOR_CONFIGURATION
  - typings.awsSdk.awsSdkStrings.CONFIGURATION_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CONFIGURATION_INVALID
  - typings.awsSdk.awsSdkStrings.READY_FOR_REPLICATION
  - typings.awsSdk.awsSdkStrings.VALIDATION_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.REPLICATION_PENDING
  - typings.awsSdk.awsSdkStrings.REPLICATION_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.REPLICATED
  - typings.awsSdk.awsSdkStrings.PARTIALLY_REPLICATED
  - typings.awsSdk.awsSdkStrings.DELTA_REPLICATION_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELTA_REPLICATED
  - typings.awsSdk.awsSdkStrings.DELTA_REPLICATION_FAILED
  - typings.awsSdk.awsSdkStrings.REPLICATION_FAILED
  - typings.awsSdk.awsSdkStrings.REPLICATION_STOPPING
  - typings.awsSdk.awsSdkStrings.REPLICATION_STOP_FAILED
  - typings.awsSdk.awsSdkStrings.REPLICATION_STOPPED
  - java.lang.String
*/
type AppReplicationStatus = typings.awsSdk.smsMod._AppReplicationStatus | java.lang.String

type AppReplicationStatusMessage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type AppStatus = typings.awsSdk.smsMod._AppStatus | java.lang.String

type AppStatusMessage = java.lang.String

type AppValidationConfigurations = js.Array[typings.awsSdk.smsMod.AppValidationConfiguration]

type AppValidationStrategy = typings.awsSdk.awsSdkStrings.SSM | java.lang.String

type Apps = js.Array[typings.awsSdk.smsMod.AppSummary]

type AssociatePublicIpAddress = scala.Boolean

type AutoLaunch = scala.Boolean

type BucketName = java.lang.String

type ClientToken = java.lang.String

type Command = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VSPHERE
  - typings.awsSdk.awsSdkStrings.SCVMM
  - typings.awsSdk.awsSdkStrings.`HYPERV-MANAGER`
  - typings.awsSdk.awsSdkStrings.SNAPSHOT_BATCHING
  - typings.awsSdk.awsSdkStrings.SMS_OPTIMIZED
  - java.lang.String
*/
type ConnectorCapability = typings.awsSdk.smsMod._ConnectorCapability | java.lang.String

type ConnectorCapabilityList = js.Array[typings.awsSdk.smsMod.ConnectorCapability]

type ConnectorId = java.lang.String

type ConnectorList = js.Array[typings.awsSdk.smsMod.Connector]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HEALTHY
  - typings.awsSdk.awsSdkStrings.UNHEALTHY
  - java.lang.String
*/
type ConnectorStatus = typings.awsSdk.smsMod._ConnectorStatus | java.lang.String

type ConnectorVersion = java.lang.String

type Description = java.lang.String

type EC2KeyName = java.lang.String

type Encrypted = scala.Boolean

type ExecutionTimeoutSeconds = scala.Double

type ForceStopAppReplication = scala.Boolean

type ForceTerminateApp = scala.Boolean

type Frequency = scala.Double

type ImportedAppId = java.lang.String

type InstanceId = java.lang.String

type InstanceType = java.lang.String

type IpAddress = java.lang.String

type KmsKeyId = java.lang.String

type LaunchOrder = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS
  - typings.awsSdk.awsSdkStrings.BYOL
  - java.lang.String
*/
type LicenseType = typings.awsSdk.smsMod._LicenseType | java.lang.String

type LogicalId = java.lang.String

type MacAddress = java.lang.String

type MaxResults = scala.Double

type NextToken = java.lang.String

type NonEmptyStringWithMaxLen255 = java.lang.String

type NumberOfRecentAmisToKeep = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.JSON
  - typings.awsSdk.awsSdkStrings.YAML
  - java.lang.String
*/
type OutputFormat = typings.awsSdk.smsMod._OutputFormat | java.lang.String

type ReplicationJobId = java.lang.String

type ReplicationJobList = js.Array[typings.awsSdk.smsMod.ReplicationJob]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.PAUSED_ON_FAILURE
  - typings.awsSdk.awsSdkStrings.FAILING
  - java.lang.String
*/
type ReplicationJobState = typings.awsSdk.smsMod._ReplicationJobState | java.lang.String

type ReplicationJobStatusMessage = java.lang.String

type ReplicationJobTerminated = scala.Boolean

type ReplicationRunId = java.lang.String

type ReplicationRunList = js.Array[typings.awsSdk.smsMod.ReplicationRun]

type ReplicationRunStage = java.lang.String

type ReplicationRunStageProgress = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.MISSED
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type ReplicationRunState = typings.awsSdk.smsMod._ReplicationRunState | java.lang.String

type ReplicationRunStatusMessage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ON_DEMAND
  - typings.awsSdk.awsSdkStrings.AUTOMATIC
  - java.lang.String
*/
type ReplicationRunType = typings.awsSdk.smsMod._ReplicationRunType | java.lang.String

type RoleName = java.lang.String

type RunOnce = scala.Boolean

type S3BucketName = java.lang.String

type S3KeyName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SHELL_SCRIPT
  - typings.awsSdk.awsSdkStrings.POWERSHELL_SCRIPT
  - java.lang.String
*/
type ScriptType = typings.awsSdk.smsMod._ScriptType | java.lang.String

type SecurityGroup = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_IMPORTED
  - typings.awsSdk.awsSdkStrings.IMPORTING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.EXPIRED
  - java.lang.String
*/
type ServerCatalogStatus = typings.awsSdk.smsMod._ServerCatalogStatus | java.lang.String

type ServerGroupId = java.lang.String

type ServerGroupLaunchConfigurations = js.Array[typings.awsSdk.smsMod.ServerGroupLaunchConfiguration]

type ServerGroupName = java.lang.String

type ServerGroupReplicationConfigurations = js.Array[typings.awsSdk.smsMod.ServerGroupReplicationConfiguration]

type ServerGroupValidationConfigurations = js.Array[typings.awsSdk.smsMod.ServerGroupValidationConfiguration]

type ServerGroups = js.Array[typings.awsSdk.smsMod.ServerGroup]

type ServerId = java.lang.String

type ServerLaunchConfigurations = js.Array[typings.awsSdk.smsMod.ServerLaunchConfiguration]

type ServerList = js.Array[typings.awsSdk.smsMod.Server]

type ServerReplicationConfigurations = js.Array[typings.awsSdk.smsMod.ServerReplicationConfiguration]

type ServerType = typings.awsSdk.awsSdkStrings.VIRTUAL_MACHINE | java.lang.String

type ServerValidationConfigurations = js.Array[typings.awsSdk.smsMod.ServerValidationConfiguration]

type ServerValidationStrategy = typings.awsSdk.awsSdkStrings.USERDATA | java.lang.String

type StackId = java.lang.String

type StackName = java.lang.String

type Subnet = java.lang.String

type TagKey = java.lang.String

type TagValue = java.lang.String

type Tags = js.Array[typings.awsSdk.smsMod.Tag]

type Timestamp = typings.std.Date

type TotalServerGroups = scala.Double

type TotalServers = scala.Double

type VPC = java.lang.String

type ValidationId = java.lang.String

type ValidationOutputList = js.Array[typings.awsSdk.smsMod.ValidationOutput]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.READY_FOR_VALIDATION
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ValidationStatus = typings.awsSdk.smsMod._ValidationStatus | java.lang.String

type ValidationStatusMessage = java.lang.String

type VmId = java.lang.String

type VmManagerId = java.lang.String

type VmManagerName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VSPHERE
  - typings.awsSdk.awsSdkStrings.SCVMM
  - typings.awsSdk.awsSdkStrings.`HYPERV-MANAGER`
  - java.lang.String
*/
type VmManagerType = typings.awsSdk.smsMod._VmManagerType | java.lang.String

type VmName = java.lang.String

type VmPath = java.lang.String

type VmServerAddressList = js.Array[typings.awsSdk.smsMod.VmServerAddress]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2016-10-24`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.smsMod._apiVersion | java.lang.String
