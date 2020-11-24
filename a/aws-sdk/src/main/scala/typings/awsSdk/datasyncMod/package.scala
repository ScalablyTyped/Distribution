package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object datasyncMod {
  
  type ActivationKey = java.lang.String
  
  type AgentArn = java.lang.String
  
  type AgentArnList = js.Array[typings.awsSdk.datasyncMod.AgentArn]
  
  type AgentList = js.Array[typings.awsSdk.datasyncMod.AgentListEntry]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ONLINE
    - typings.awsSdk.awsSdkStrings.OFFLINE
    - java.lang.String
  */
  type AgentStatus = typings.awsSdk.datasyncMod._AgentStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.BEST_EFFORT
    - java.lang.String
  */
  type Atime = typings.awsSdk.datasyncMod._Atime | java.lang.String
  
  type BytesPerSecond = scala.Double
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.datasyncMod.ClientApiVersions
  
  type DestinationNetworkInterfaceArns = js.Array[typings.awsSdk.datasyncMod.NetworkInterfaceArn]
  
  type Duration = scala.Double
  
  type Ec2SecurityGroupArn = java.lang.String
  
  type Ec2SecurityGroupArnList = js.Array[typings.awsSdk.datasyncMod.Ec2SecurityGroupArn]
  
  type Ec2SubnetArn = java.lang.String
  
  type EfsFilesystemArn = java.lang.String
  
  type EfsSubdirectory = java.lang.String
  
  type Endpoint = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PUBLIC
    - typings.awsSdk.awsSdkStrings.PRIVATE_LINK
    - typings.awsSdk.awsSdkStrings.FIPS
    - java.lang.String
  */
  type EndpointType = typings.awsSdk.datasyncMod._EndpointType | java.lang.String
  
  type FilterAttributeValue = java.lang.String
  
  type FilterList = js.Array[typings.awsSdk.datasyncMod.FilterRule]
  
  type FilterType = typings.awsSdk.awsSdkStrings.SIMPLE_PATTERN | java.lang.String
  
  type FilterValue = java.lang.String
  
  type FilterValues = js.Array[typings.awsSdk.datasyncMod.FilterAttributeValue]
  
  type FsxFilesystemArn = java.lang.String
  
  type FsxWindowsSubdirectory = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.INT_VALUE
    - typings.awsSdk.awsSdkStrings.NAME
    - typings.awsSdk.awsSdkStrings.BOTH
    - java.lang.String
  */
  type Gid = typings.awsSdk.datasyncMod._Gid | java.lang.String
  
  type IamRoleArn = java.lang.String
  
  type InputTagList = js.Array[typings.awsSdk.datasyncMod.TagListEntry]
  
  type LocationArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.LocationUri
    - typings.awsSdk.awsSdkStrings.LocationType
    - typings.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type LocationFilterName = typings.awsSdk.datasyncMod._LocationFilterName | java.lang.String
  
  type LocationFilters = js.Array[typings.awsSdk.datasyncMod.LocationFilter]
  
  type LocationList = js.Array[typings.awsSdk.datasyncMod.LocationListEntry]
  
  type LocationUri = java.lang.String
  
  type LogGroupArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OFF
    - typings.awsSdk.awsSdkStrings.BASIC
    - typings.awsSdk.awsSdkStrings.TRANSFER
    - java.lang.String
  */
  type LogLevel = typings.awsSdk.datasyncMod._LogLevel | java.lang.String
  
  type MaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.PRESERVE
    - java.lang.String
  */
  type Mtime = typings.awsSdk.datasyncMod._Mtime | java.lang.String
  
  type NetworkInterfaceArn = java.lang.String
  
  type NextToken = java.lang.String
  
  type NfsSubdirectory = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AUTOMATIC
    - typings.awsSdk.awsSdkStrings.NFS3
    - typings.awsSdk.awsSdkStrings.NFS4_0
    - typings.awsSdk.awsSdkStrings.NFS4_1
    - java.lang.String
  */
  type NfsVersion = typings.awsSdk.datasyncMod._NfsVersion | java.lang.String
  
  type ObjectStorageAccessKey = java.lang.String
  
  type ObjectStorageBucketName = java.lang.String
  
  type ObjectStorageSecretKey = java.lang.String
  
  type ObjectStorageServerPort = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.HTTPS
    - typings.awsSdk.awsSdkStrings.HTTP
    - java.lang.String
  */
  type ObjectStorageServerProtocol = typings.awsSdk.datasyncMod._ObjectStorageServerProtocol | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Equals_
    - typings.awsSdk.awsSdkStrings.NotEquals
    - typings.awsSdk.awsSdkStrings.In_
    - typings.awsSdk.awsSdkStrings.LessThanOrEqual
    - typings.awsSdk.awsSdkStrings.LessThan
    - typings.awsSdk.awsSdkStrings.GreaterThanOrEqual
    - typings.awsSdk.awsSdkStrings.GreaterThan
    - typings.awsSdk.awsSdkStrings.Contains_
    - typings.awsSdk.awsSdkStrings.NotContains
    - typings.awsSdk.awsSdkStrings.BeginsWith
    - java.lang.String
  */
  type Operator = typings.awsSdk.datasyncMod._Operator | java.lang.String
  
  type OutputTagList = js.Array[typings.awsSdk.datasyncMod.TagListEntry]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALWAYS
    - typings.awsSdk.awsSdkStrings.NEVER
    - java.lang.String
  */
  type OverwriteMode = typings.awsSdk.datasyncMod._OverwriteMode | java.lang.String
  
  type PLSecurityGroupArnList = js.Array[typings.awsSdk.datasyncMod.Ec2SecurityGroupArn]
  
  type PLSubnetArnList = js.Array[typings.awsSdk.datasyncMod.Ec2SubnetArn]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.SUCCESS
    - typings.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type PhaseStatus = typings.awsSdk.datasyncMod._PhaseStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.PRESERVE
    - java.lang.String
  */
  type PosixPermissions = typings.awsSdk.datasyncMod._PosixPermissions | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PRESERVE
    - typings.awsSdk.awsSdkStrings.REMOVE
    - java.lang.String
  */
  type PreserveDeletedFiles = typings.awsSdk.datasyncMod._PreserveDeletedFiles | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.PRESERVE
    - java.lang.String
  */
  type PreserveDevices = typings.awsSdk.datasyncMod._PreserveDevices | java.lang.String
  
  type S3BucketArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STANDARD
    - typings.awsSdk.awsSdkStrings.STANDARD_IA
    - typings.awsSdk.awsSdkStrings.ONEZONE_IA
    - typings.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
    - typings.awsSdk.awsSdkStrings.GLACIER
    - typings.awsSdk.awsSdkStrings.DEEP_ARCHIVE
    - typings.awsSdk.awsSdkStrings.OUTPOSTS
    - java.lang.String
  */
  type S3StorageClass = typings.awsSdk.datasyncMod._S3StorageClass | java.lang.String
  
  type S3Subdirectory = java.lang.String
  
  type ScheduleExpressionCron = java.lang.String
  
  type ServerHostname = java.lang.String
  
  type SmbDomain = java.lang.String
  
  type SmbPassword = java.lang.String
  
  type SmbSubdirectory = java.lang.String
  
  type SmbUser = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AUTOMATIC
    - typings.awsSdk.awsSdkStrings.SMB2
    - typings.awsSdk.awsSdkStrings.SMB3
    - java.lang.String
  */
  type SmbVersion = typings.awsSdk.datasyncMod._SmbVersion | java.lang.String
  
  type SourceNetworkInterfaceArns = js.Array[typings.awsSdk.datasyncMod.NetworkInterfaceArn]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.datasyncMod.TagKey]
  
  type TagValue = java.lang.String
  
  type TaggableResourceArn = java.lang.String
  
  type TaskArn = java.lang.String
  
  type TaskExecutionArn = java.lang.String
  
  type TaskExecutionList = js.Array[typings.awsSdk.datasyncMod.TaskExecutionListEntry]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.QUEUED
    - typings.awsSdk.awsSdkStrings.LAUNCHING
    - typings.awsSdk.awsSdkStrings.PREPARING
    - typings.awsSdk.awsSdkStrings.TRANSFERRING
    - typings.awsSdk.awsSdkStrings.VERIFYING
    - typings.awsSdk.awsSdkStrings.SUCCESS
    - typings.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type TaskExecutionStatus = typings.awsSdk.datasyncMod._TaskExecutionStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.LocationId
    - typings.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type TaskFilterName = typings.awsSdk.datasyncMod._TaskFilterName | java.lang.String
  
  type TaskFilters = js.Array[typings.awsSdk.datasyncMod.TaskFilter]
  
  type TaskList = js.Array[typings.awsSdk.datasyncMod.TaskListEntry]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type TaskQueueing = typings.awsSdk.datasyncMod._TaskQueueing | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.QUEUED
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.UNAVAILABLE
    - java.lang.String
  */
  type TaskStatus = typings.awsSdk.datasyncMod._TaskStatus | java.lang.String
  
  type Time = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CHANGED
    - typings.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type TransferMode = typings.awsSdk.datasyncMod._TransferMode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.INT_VALUE
    - typings.awsSdk.awsSdkStrings.NAME
    - typings.awsSdk.awsSdkStrings.BOTH
    - java.lang.String
  */
  type Uid = typings.awsSdk.datasyncMod._Uid | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.POINT_IN_TIME_CONSISTENT
    - typings.awsSdk.awsSdkStrings.ONLY_FILES_TRANSFERRED
    - typings.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type VerifyMode = typings.awsSdk.datasyncMod._VerifyMode | java.lang.String
  
  type VpcEndpointId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-11-09`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.datasyncMod._apiVersion | java.lang.String
  
  type long = scala.Double
}
