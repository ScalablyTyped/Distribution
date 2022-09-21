package typings.awsSdk.smsMod

import typings.awsSdk.awsSdkStrings.SSM
import typings.awsSdk.awsSdkStrings.USERDATA
import typings.awsSdk.awsSdkStrings.VIRTUAL_MACHINE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AmiId = String

type AppDescription = String

type AppId = String

type AppIdWithValidation = String

type AppIds = js.Array[AppId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_CONFIGURED
  - typings.awsSdk.awsSdkStrings.CONFIGURED
  - java.lang.String
*/
type AppLaunchConfigurationStatus = _AppLaunchConfigurationStatus | String

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
type AppLaunchStatus = _AppLaunchStatus | String

type AppLaunchStatusMessage = String

type AppName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_CONFIGURED
  - typings.awsSdk.awsSdkStrings.CONFIGURED
  - java.lang.String
*/
type AppReplicationConfigurationStatus = _AppReplicationConfigurationStatus | String

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
type AppReplicationStatus = _AppReplicationStatus | String

type AppReplicationStatusMessage = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type AppStatus = _AppStatus | String

type AppStatusMessage = String

type AppValidationConfigurations = js.Array[AppValidationConfiguration]

type AppValidationStrategy = SSM | String

type Apps = js.Array[AppSummary]

type AssociatePublicIpAddress = Boolean

type AutoLaunch = Boolean

type BucketName = String

type ClientToken = String

type Command = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VSPHERE
  - typings.awsSdk.awsSdkStrings.SCVMM
  - typings.awsSdk.awsSdkStrings.`HYPERV-MANAGER`
  - typings.awsSdk.awsSdkStrings.SNAPSHOT_BATCHING
  - typings.awsSdk.awsSdkStrings.SMS_OPTIMIZED
  - java.lang.String
*/
type ConnectorCapability = _ConnectorCapability | String

type ConnectorCapabilityList = js.Array[ConnectorCapability]

type ConnectorId = String

type ConnectorList = js.Array[Connector]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HEALTHY
  - typings.awsSdk.awsSdkStrings.UNHEALTHY
  - java.lang.String
*/
type ConnectorStatus = _ConnectorStatus | String

type ConnectorVersion = String

type Description = String

type EC2KeyName = String

type Encrypted = Boolean

type ExecutionTimeoutSeconds = Double

type ForceStopAppReplication = Boolean

type ForceTerminateApp = Boolean

type Frequency = Double

type ImportedAppId = String

type InstanceId = String

type InstanceType = String

type IpAddress = String

type KmsKeyId = String

type LaunchOrder = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS
  - typings.awsSdk.awsSdkStrings.BYOL
  - java.lang.String
*/
type LicenseType = _LicenseType | String

type LogicalId = String

type MacAddress = String

type MaxResults = Double

type NextToken = String

type NonEmptyStringWithMaxLen255 = String

type NumberOfRecentAmisToKeep = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.JSON
  - typings.awsSdk.awsSdkStrings.YAML
  - java.lang.String
*/
type OutputFormat = _OutputFormat | String

type ReplicationJobId = String

type ReplicationJobList = js.Array[ReplicationJob]

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
type ReplicationJobState = _ReplicationJobState | String

type ReplicationJobStatusMessage = String

type ReplicationJobTerminated = Boolean

type ReplicationRunId = String

type ReplicationRunList = js.Array[ReplicationRun]

type ReplicationRunStage = String

type ReplicationRunStageProgress = String

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
type ReplicationRunState = _ReplicationRunState | String

type ReplicationRunStatusMessage = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ON_DEMAND
  - typings.awsSdk.awsSdkStrings.AUTOMATIC
  - java.lang.String
*/
type ReplicationRunType = _ReplicationRunType | String

type RoleName = String

type RunOnce = Boolean

type S3BucketName = String

type S3KeyName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SHELL_SCRIPT
  - typings.awsSdk.awsSdkStrings.POWERSHELL_SCRIPT
  - java.lang.String
*/
type ScriptType = _ScriptType | String

type SecurityGroup = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_IMPORTED
  - typings.awsSdk.awsSdkStrings.IMPORTING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.EXPIRED
  - java.lang.String
*/
type ServerCatalogStatus = _ServerCatalogStatus | String

type ServerGroupId = String

type ServerGroupLaunchConfigurations = js.Array[ServerGroupLaunchConfiguration]

type ServerGroupName = String

type ServerGroupReplicationConfigurations = js.Array[ServerGroupReplicationConfiguration]

type ServerGroupValidationConfigurations = js.Array[ServerGroupValidationConfiguration]

type ServerGroups = js.Array[ServerGroup]

type ServerId = String

type ServerLaunchConfigurations = js.Array[ServerLaunchConfiguration]

type ServerList = js.Array[Server]

type ServerReplicationConfigurations = js.Array[ServerReplicationConfiguration]

type ServerType = VIRTUAL_MACHINE | String

type ServerValidationConfigurations = js.Array[ServerValidationConfiguration]

type ServerValidationStrategy = USERDATA | String

type StackId = String

type StackName = String

type Subnet = String

type TagKey = String

type TagValue = String

type Tags = js.Array[Tag]

type Timestamp = js.Date

type TotalServerGroups = Double

type TotalServers = Double

type VPC = String

type ValidationId = String

type ValidationOutputList = js.Array[ValidationOutput]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.READY_FOR_VALIDATION
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ValidationStatus = _ValidationStatus | String

type ValidationStatusMessage = String

type VmId = String

type VmManagerId = String

type VmManagerName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VSPHERE
  - typings.awsSdk.awsSdkStrings.SCVMM
  - typings.awsSdk.awsSdkStrings.`HYPERV-MANAGER`
  - java.lang.String
*/
type VmManagerType = _VmManagerType | String

type VmName = String

type VmPath = String

type VmServerAddressList = js.Array[VmServerAddress]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2016-10-24`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
