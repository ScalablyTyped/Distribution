package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object workspacesMod {
  
  type ARN = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALLOW
    - typings.awsSdk.awsSdkStrings.DENY
    - java.lang.String
  */
  type AccessPropertyValue = typings.awsSdk.workspacesMod._AccessPropertyValue | java.lang.String
  
  type AccountModificationList = js.Array[typings.awsSdk.workspacesMod.AccountModification]
  
  type Alias = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Microsoft_Office_2016
    - typings.awsSdk.awsSdkStrings.Microsoft_Office_2019
    - java.lang.String
  */
  type Application = typings.awsSdk.workspacesMod._Application | java.lang.String
  
  type ApplicationList = js.Array[typings.awsSdk.workspacesMod.Application]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NOT_ASSOCIATED
    - typings.awsSdk.awsSdkStrings.ASSOCIATED_WITH_OWNER_ACCOUNT
    - typings.awsSdk.awsSdkStrings.ASSOCIATED_WITH_SHARED_ACCOUNT
    - typings.awsSdk.awsSdkStrings.PENDING_ASSOCIATION
    - typings.awsSdk.awsSdkStrings.PENDING_DISASSOCIATION
    - java.lang.String
  */
  type AssociationStatus = typings.awsSdk.workspacesMod._AssociationStatus | java.lang.String
  
  type AwsAccount = java.lang.String
  
  type BooleanObject = scala.Boolean
  
  type BundleId = java.lang.String
  
  type BundleIdList = js.Array[typings.awsSdk.workspacesMod.BundleId]
  
  type BundleList = js.Array[typings.awsSdk.workspacesMod.WorkspaceBundle]
  
  type BundleOwner = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.workspacesMod.ClientApiVersions
  
  type ClientPropertiesList = js.Array[typings.awsSdk.workspacesMod.ClientPropertiesResult]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.VALUE
    - typings.awsSdk.awsSdkStrings.STANDARD
    - typings.awsSdk.awsSdkStrings.PERFORMANCE
    - typings.awsSdk.awsSdkStrings.POWER
    - typings.awsSdk.awsSdkStrings.GRAPHICS
    - typings.awsSdk.awsSdkStrings.POWERPRO
    - typings.awsSdk.awsSdkStrings.GRAPHICSPRO
    - java.lang.String
  */
  type Compute = typings.awsSdk.workspacesMod._Compute | java.lang.String
  
  type ComputerName = java.lang.String
  
  type ConnectionAliasAssociationList = js.Array[typings.awsSdk.workspacesMod.ConnectionAliasAssociation]
  
  type ConnectionAliasId = java.lang.String
  
  type ConnectionAliasIdList = js.Array[typings.awsSdk.workspacesMod.ConnectionAliasId]
  
  type ConnectionAliasList = js.Array[typings.awsSdk.workspacesMod.ConnectionAlias]
  
  type ConnectionAliasPermissions = js.Array[typings.awsSdk.workspacesMod.ConnectionAliasPermission]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.CREATED
    - typings.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ConnectionAliasState = typings.awsSdk.workspacesMod._ConnectionAliasState | java.lang.String
  
  type ConnectionIdentifier = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CONNECTED
    - typings.awsSdk.awsSdkStrings.DISCONNECTED
    - typings.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type ConnectionState = typings.awsSdk.workspacesMod._ConnectionState | java.lang.String
  
  type ConnectionString = java.lang.String
  
  type DedicatedTenancyCidrRangeList = js.Array[typings.awsSdk.workspacesMod.DedicatedTenancyManagementCidrRange]
  
  type DedicatedTenancyManagementCidrRange = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type DedicatedTenancyModificationStateEnum = typings.awsSdk.workspacesMod._DedicatedTenancyModificationStateEnum | java.lang.String
  
  type DedicatedTenancySupportEnum = typings.awsSdk.awsSdkStrings.ENABLED | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type DedicatedTenancySupportResultEnum = typings.awsSdk.workspacesMod._DedicatedTenancySupportResultEnum | java.lang.String
  
  type DefaultOu = java.lang.String
  
  type Description = java.lang.String
  
  type DirectoryId = java.lang.String
  
  type DirectoryIdList = js.Array[typings.awsSdk.workspacesMod.DirectoryId]
  
  type DirectoryList = js.Array[typings.awsSdk.workspacesMod.WorkspaceDirectory]
  
  type DirectoryName = java.lang.String
  
  type DnsIpAddresses = js.Array[typings.awsSdk.workspacesMod.IpAddress]
  
  type Ec2ImageId = java.lang.String
  
  type ErrorType = java.lang.String
  
  type FailedCreateWorkspaceRequests = js.Array[typings.awsSdk.workspacesMod.FailedCreateWorkspaceRequest]
  
  type FailedRebootWorkspaceRequests = js.Array[typings.awsSdk.workspacesMod.FailedWorkspaceChangeRequest]
  
  type FailedRebuildWorkspaceRequests = js.Array[typings.awsSdk.workspacesMod.FailedWorkspaceChangeRequest]
  
  type FailedStartWorkspaceRequests = js.Array[typings.awsSdk.workspacesMod.FailedWorkspaceChangeRequest]
  
  type FailedStopWorkspaceRequests = js.Array[typings.awsSdk.workspacesMod.FailedWorkspaceChangeRequest]
  
  type FailedTerminateWorkspaceRequests = js.Array[typings.awsSdk.workspacesMod.FailedWorkspaceChangeRequest]
  
  type ImagePermissions = js.Array[typings.awsSdk.workspacesMod.ImagePermission]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OWNED
    - typings.awsSdk.awsSdkStrings.SHARED
    - java.lang.String
  */
  type ImageType = typings.awsSdk.workspacesMod._ImageType | java.lang.String
  
  type IpAddress = java.lang.String
  
  type IpGroupDesc = java.lang.String
  
  type IpGroupId = java.lang.String
  
  type IpGroupIdList = js.Array[typings.awsSdk.workspacesMod.IpGroupId]
  
  type IpGroupName = java.lang.String
  
  type IpRevokedRuleList = js.Array[typings.awsSdk.workspacesMod.IpRule]
  
  type IpRule = java.lang.String
  
  type IpRuleDesc = java.lang.String
  
  type IpRuleList = js.Array[typings.awsSdk.workspacesMod.IpRuleItem]
  
  type Limit = scala.Double
  
  type ManagementCidrRangeConstraint = java.lang.String
  
  type ManagementCidrRangeMaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ROOT_VOLUME
    - typings.awsSdk.awsSdkStrings.USER_VOLUME
    - typings.awsSdk.awsSdkStrings.COMPUTE_TYPE
    - java.lang.String
  */
  type ModificationResourceEnum = typings.awsSdk.workspacesMod._ModificationResourceEnum | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.UPDATE_INITIATED
    - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - java.lang.String
  */
  type ModificationStateEnum = typings.awsSdk.workspacesMod._ModificationStateEnum | java.lang.String
  
  type ModificationStateList = js.Array[typings.awsSdk.workspacesMod.ModificationState]
  
  type NonEmptyString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.WINDOWS
    - typings.awsSdk.awsSdkStrings.LINUX
    - java.lang.String
  */
  type OperatingSystemType = typings.awsSdk.workspacesMod._OperatingSystemType | java.lang.String
  
  type PaginationToken = java.lang.String
  
  type RebootWorkspaceRequests = js.Array[typings.awsSdk.workspacesMod.RebootRequest]
  
  type RebuildWorkspaceRequests = js.Array[typings.awsSdk.workspacesMod.RebuildRequest]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type ReconnectEnum = typings.awsSdk.workspacesMod._ReconnectEnum | java.lang.String
  
  type Region = java.lang.String
  
  type RegistrationCode = java.lang.String
  
  type ResourceIdList = js.Array[typings.awsSdk.workspacesMod.NonEmptyString]
  
  type RootVolumeSizeGib = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AUTO_STOP
    - typings.awsSdk.awsSdkStrings.ALWAYS_ON
    - java.lang.String
  */
  type RunningMode = typings.awsSdk.workspacesMod._RunningMode | java.lang.String
  
  type RunningModeAutoStopTimeoutInMinutes = scala.Double
  
  type SecurityGroupId = java.lang.String
  
  type SnapshotList = js.Array[typings.awsSdk.workspacesMod.Snapshot]
  
  type StartWorkspaceRequests = js.Array[typings.awsSdk.workspacesMod.StartRequest]
  
  type StopWorkspaceRequests = js.Array[typings.awsSdk.workspacesMod.StopRequest]
  
  type SubnetId = java.lang.String
  
  type SubnetIds = js.Array[typings.awsSdk.workspacesMod.SubnetId]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.workspacesMod.NonEmptyString]
  
  type TagList = js.Array[typings.awsSdk.workspacesMod.Tag]
  
  type TagValue = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.ADMIN_MAINTENANCE
    - java.lang.String
  */
  type TargetWorkspaceState = typings.awsSdk.workspacesMod._TargetWorkspaceState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DEDICATED
    - typings.awsSdk.awsSdkStrings.SHARED
    - java.lang.String
  */
  type Tenancy = typings.awsSdk.workspacesMod._Tenancy | java.lang.String
  
  type TerminateWorkspaceRequests = js.Array[typings.awsSdk.workspacesMod.TerminateRequest]
  
  type Timestamp = typings.std.Date
  
  type UserName = java.lang.String
  
  type UserVolumeSizeGib = scala.Double
  
  type VolumeEncryptionKey = java.lang.String
  
  type WorkspaceConnectionStatusList = js.Array[typings.awsSdk.workspacesMod.WorkspaceConnectionStatus]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.REGISTERING
    - typings.awsSdk.awsSdkStrings.REGISTERED
    - typings.awsSdk.awsSdkStrings.DEREGISTERING
    - typings.awsSdk.awsSdkStrings.DEREGISTERED
    - typings.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type WorkspaceDirectoryState = typings.awsSdk.workspacesMod._WorkspaceDirectoryState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SIMPLE_AD
    - typings.awsSdk.awsSdkStrings.AD_CONNECTOR
    - java.lang.String
  */
  type WorkspaceDirectoryType = typings.awsSdk.workspacesMod._WorkspaceDirectoryType | java.lang.String
  
  type WorkspaceErrorCode = java.lang.String
  
  type WorkspaceId = java.lang.String
  
  type WorkspaceIdList = js.Array[typings.awsSdk.workspacesMod.WorkspaceId]
  
  type WorkspaceImageDescription = java.lang.String
  
  type WorkspaceImageErrorCode = java.lang.String
  
  type WorkspaceImageId = java.lang.String
  
  type WorkspaceImageIdList = js.Array[typings.awsSdk.workspacesMod.WorkspaceImageId]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.BYOL_REGULAR
    - typings.awsSdk.awsSdkStrings.BYOL_GRAPHICS
    - typings.awsSdk.awsSdkStrings.BYOL_GRAPHICSPRO
    - java.lang.String
  */
  type WorkspaceImageIngestionProcess = typings.awsSdk.workspacesMod._WorkspaceImageIngestionProcess | java.lang.String
  
  type WorkspaceImageList = js.Array[typings.awsSdk.workspacesMod.WorkspaceImage]
  
  type WorkspaceImageName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DEFAULT
    - typings.awsSdk.awsSdkStrings.DEDICATED
    - java.lang.String
  */
  type WorkspaceImageRequiredTenancy = typings.awsSdk.workspacesMod._WorkspaceImageRequiredTenancy | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type WorkspaceImageState = typings.awsSdk.workspacesMod._WorkspaceImageState | java.lang.String
  
  type WorkspaceList = js.Array[typings.awsSdk.workspacesMod.Workspace]
  
  type WorkspaceRequestList = js.Array[typings.awsSdk.workspacesMod.WorkspaceRequest]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.IMPAIRED
    - typings.awsSdk.awsSdkStrings.UNHEALTHY
    - typings.awsSdk.awsSdkStrings.REBOOTING
    - typings.awsSdk.awsSdkStrings.STARTING
    - typings.awsSdk.awsSdkStrings.REBUILDING
    - typings.awsSdk.awsSdkStrings.RESTORING
    - typings.awsSdk.awsSdkStrings.MAINTENANCE
    - typings.awsSdk.awsSdkStrings.ADMIN_MAINTENANCE
    - typings.awsSdk.awsSdkStrings.TERMINATING
    - typings.awsSdk.awsSdkStrings.TERMINATED
    - typings.awsSdk.awsSdkStrings.SUSPENDED
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.STOPPING
    - typings.awsSdk.awsSdkStrings.STOPPED
    - typings.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type WorkspaceState = typings.awsSdk.workspacesMod._WorkspaceState | java.lang.String
  
  type WorkspacesIpGroupsList = js.Array[typings.awsSdk.workspacesMod.WorkspacesIpGroup]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2015-04-08`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.workspacesMod._apiVersion | java.lang.String
}
