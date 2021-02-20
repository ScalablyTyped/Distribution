package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object directoryserviceMod {
  
  type AccessUrl = java.lang.String
  
  type AddedDateTime = typings.std.Date
  
  type AdditionalRegions = js.Array[typings.awsSdk.directoryserviceMod.RegionName]
  
  type AliasName = java.lang.String
  
  type AttributeName = java.lang.String
  
  type AttributeValue = java.lang.String
  
  type Attributes = js.Array[typings.awsSdk.directoryserviceMod.Attribute]
  
  type AvailabilityZone = java.lang.String
  
  type AvailabilityZones = js.Array[typings.awsSdk.directoryserviceMod.AvailabilityZone]
  
  type CertificateCN = java.lang.String
  
  type CertificateData = java.lang.String
  
  type CertificateExpiryDateTime = typings.std.Date
  
  type CertificateId = java.lang.String
  
  type CertificateRegisteredDateTime = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Registering_
    - typings.awsSdk.awsSdkStrings.Registered_
    - typings.awsSdk.awsSdkStrings.RegisterFailed
    - typings.awsSdk.awsSdkStrings.Deregistering_
    - typings.awsSdk.awsSdkStrings.Deregistered_
    - typings.awsSdk.awsSdkStrings.DeregisterFailed
    - java.lang.String
  */
  type CertificateState = typings.awsSdk.directoryserviceMod._CertificateState | java.lang.String
  
  type CertificateStateReason = java.lang.String
  
  type CertificatesInfo = js.Array[typings.awsSdk.directoryserviceMod.CertificateInfo]
  
  type CidrIp = java.lang.String
  
  type CidrIps = js.Array[typings.awsSdk.directoryserviceMod.CidrIp]
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.directoryserviceMod.ClientApiVersions
  
  type CloudOnlyDirectoriesLimitReached = scala.Boolean
  
  type ComputerName = java.lang.String
  
  type ComputerPassword = java.lang.String
  
  type ConditionalForwarders = js.Array[typings.awsSdk.directoryserviceMod.ConditionalForwarder]
  
  type ConnectPassword = java.lang.String
  
  type ConnectedDirectoriesLimitReached = scala.Boolean
  
  type CreateSnapshotBeforeSchemaExtension = scala.Boolean
  
  type CreatedDateTime = typings.std.Date
  
  type CustomerId = java.lang.String
  
  type CustomerUserName = java.lang.String
  
  type DeleteAssociatedConditionalForwarder = scala.Boolean
  
  type Description = java.lang.String
  
  type DesiredNumberOfDomainControllers = scala.Double
  
  type DirectoryDescriptions = js.Array[typings.awsSdk.directoryserviceMod.DirectoryDescription]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Enterprise_
    - typings.awsSdk.awsSdkStrings.Standard_
    - java.lang.String
  */
  type DirectoryEdition = typings.awsSdk.directoryserviceMod._DirectoryEdition | java.lang.String
  
  type DirectoryId = java.lang.String
  
  type DirectoryIds = js.Array[typings.awsSdk.directoryserviceMod.DirectoryId]
  
  type DirectoryName = java.lang.String
  
  type DirectoryShortName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Small_
    - typings.awsSdk.awsSdkStrings.Large_
    - java.lang.String
  */
  type DirectorySize = typings.awsSdk.directoryserviceMod._DirectorySize | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Requested_
    - typings.awsSdk.awsSdkStrings.Creating_
    - typings.awsSdk.awsSdkStrings.Created_
    - typings.awsSdk.awsSdkStrings.Active_
    - typings.awsSdk.awsSdkStrings.Inoperable_
    - typings.awsSdk.awsSdkStrings.Impaired_
    - typings.awsSdk.awsSdkStrings.Restoring_
    - typings.awsSdk.awsSdkStrings.RestoreFailed
    - typings.awsSdk.awsSdkStrings.Deleting_
    - typings.awsSdk.awsSdkStrings.Deleted_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type DirectoryStage = typings.awsSdk.directoryserviceMod._DirectoryStage | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SimpleAD
    - typings.awsSdk.awsSdkStrings.ADConnector
    - typings.awsSdk.awsSdkStrings.MicrosoftAD
    - typings.awsSdk.awsSdkStrings.SharedMicrosoftAD
    - java.lang.String
  */
  type DirectoryType = typings.awsSdk.directoryserviceMod._DirectoryType | java.lang.String
  
  type DnsIpAddrs = js.Array[typings.awsSdk.directoryserviceMod.IpAddr]
  
  type DomainControllerId = java.lang.String
  
  type DomainControllerIds = js.Array[typings.awsSdk.directoryserviceMod.DomainControllerId]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Creating_
    - typings.awsSdk.awsSdkStrings.Active_
    - typings.awsSdk.awsSdkStrings.Impaired_
    - typings.awsSdk.awsSdkStrings.Restoring_
    - typings.awsSdk.awsSdkStrings.Deleting_
    - typings.awsSdk.awsSdkStrings.Deleted_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type DomainControllerStatus = typings.awsSdk.directoryserviceMod._DomainControllerStatus | java.lang.String
  
  type DomainControllerStatusReason = java.lang.String
  
  type DomainControllers = js.Array[typings.awsSdk.directoryserviceMod.DomainController]
  
  type EndDateTime = typings.std.Date
  
  type EventTopics = js.Array[typings.awsSdk.directoryserviceMod.EventTopic]
  
  type IpAddr = java.lang.String
  
  type IpAddrs = js.Array[typings.awsSdk.directoryserviceMod.IpAddr]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Adding
    - typings.awsSdk.awsSdkStrings.Added
    - typings.awsSdk.awsSdkStrings.Removing
    - typings.awsSdk.awsSdkStrings.Removed_
    - typings.awsSdk.awsSdkStrings.AddFailed
    - typings.awsSdk.awsSdkStrings.RemoveFailed
    - java.lang.String
  */
  type IpRouteStatusMsg = typings.awsSdk.directoryserviceMod._IpRouteStatusMsg | java.lang.String
  
  type IpRouteStatusReason = java.lang.String
  
  type IpRoutes = js.Array[typings.awsSdk.directoryserviceMod.IpRoute]
  
  type IpRoutesInfo = js.Array[typings.awsSdk.directoryserviceMod.IpRouteInfo]
  
  type LDAPSSettingsInfo = js.Array[typings.awsSdk.directoryserviceMod.LDAPSSettingInfo]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Enabling_
    - typings.awsSdk.awsSdkStrings.Enabled_
    - typings.awsSdk.awsSdkStrings.EnableFailed
    - typings.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type LDAPSStatus = typings.awsSdk.directoryserviceMod._LDAPSStatus | java.lang.String
  
  type LDAPSStatusReason = java.lang.String
  
  type LDAPSType = typings.awsSdk.awsSdkStrings.Client | java.lang.String
  
  type LastUpdatedDateTime = typings.std.Date
  
  type LaunchTime = typings.std.Date
  
  type LdifContent = java.lang.String
  
  type Limit = scala.Double
  
  type LogGroupName = java.lang.String
  
  type LogSubscriptions = js.Array[typings.awsSdk.directoryserviceMod.LogSubscription]
  
  type ManualSnapshotsLimitReached = scala.Boolean
  
  type NextToken = java.lang.String
  
  type Notes = java.lang.String
  
  type OrganizationalUnitDN = java.lang.String
  
  type PageLimit = scala.Double
  
  type Password = java.lang.String
  
  type PortNumber = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PAP
    - typings.awsSdk.awsSdkStrings.CHAP
    - typings.awsSdk.awsSdkStrings.`MS-CHAPv1`
    - typings.awsSdk.awsSdkStrings.`MS-CHAPv2`
    - java.lang.String
  */
  type RadiusAuthenticationProtocol = typings.awsSdk.directoryserviceMod._RadiusAuthenticationProtocol | java.lang.String
  
  type RadiusDisplayLabel = java.lang.String
  
  type RadiusRetries = scala.Double
  
  type RadiusSharedSecret = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Creating_
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type RadiusStatus = typings.awsSdk.directoryserviceMod._RadiusStatus | java.lang.String
  
  type RadiusTimeout = scala.Double
  
  type RegionName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Primary_
    - typings.awsSdk.awsSdkStrings.Additional
    - java.lang.String
  */
  type RegionType = typings.awsSdk.directoryserviceMod._RegionType | java.lang.String
  
  type RegionsDescription = js.Array[typings.awsSdk.directoryserviceMod.RegionDescription]
  
  type RemoteDomainName = java.lang.String
  
  type RemoteDomainNames = js.Array[typings.awsSdk.directoryserviceMod.RemoteDomainName]
  
  type ReplicationScope = typings.awsSdk.awsSdkStrings.Domain_ | java.lang.String
  
  type RequestId = java.lang.String
  
  type ResourceId = java.lang.String
  
  type SID = java.lang.String
  
  type SchemaExtensionId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Initializing_
    - typings.awsSdk.awsSdkStrings.CreatingSnapshot
    - typings.awsSdk.awsSdkStrings.UpdatingSchema
    - typings.awsSdk.awsSdkStrings.Replicating
    - typings.awsSdk.awsSdkStrings.CancelInProgress
    - typings.awsSdk.awsSdkStrings.RollbackInProgress
    - typings.awsSdk.awsSdkStrings.Cancelled_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Completed_
    - java.lang.String
  */
  type SchemaExtensionStatus = typings.awsSdk.directoryserviceMod._SchemaExtensionStatus | java.lang.String
  
  type SchemaExtensionStatusReason = java.lang.String
  
  type SchemaExtensionsInfo = js.Array[typings.awsSdk.directoryserviceMod.SchemaExtensionInfo]
  
  type SecurityGroupId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Enabled_
    - typings.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type SelectiveAuth = typings.awsSdk.directoryserviceMod._SelectiveAuth | java.lang.String
  
  type Server = java.lang.String
  
  type Servers = js.Array[typings.awsSdk.directoryserviceMod.Server]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ORGANIZATIONS
    - typings.awsSdk.awsSdkStrings.HANDSHAKE
    - java.lang.String
  */
  type ShareMethod = typings.awsSdk.directoryserviceMod._ShareMethod | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Shared_
    - typings.awsSdk.awsSdkStrings.PendingAcceptance
    - typings.awsSdk.awsSdkStrings.Rejected_
    - typings.awsSdk.awsSdkStrings.Rejecting_
    - typings.awsSdk.awsSdkStrings.RejectFailed
    - typings.awsSdk.awsSdkStrings.Sharing
    - typings.awsSdk.awsSdkStrings.ShareFailed
    - typings.awsSdk.awsSdkStrings.Deleted_
    - typings.awsSdk.awsSdkStrings.Deleting_
    - java.lang.String
  */
  type ShareStatus = typings.awsSdk.directoryserviceMod._ShareStatus | java.lang.String
  
  type SharedDirectories = js.Array[typings.awsSdk.directoryserviceMod.SharedDirectory]
  
  type SnapshotId = java.lang.String
  
  type SnapshotIds = js.Array[typings.awsSdk.directoryserviceMod.SnapshotId]
  
  type SnapshotName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Creating_
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type SnapshotStatus = typings.awsSdk.directoryserviceMod._SnapshotStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Auto_
    - typings.awsSdk.awsSdkStrings.Manual_
    - java.lang.String
  */
  type SnapshotType = typings.awsSdk.directoryserviceMod._SnapshotType | java.lang.String
  
  type Snapshots = js.Array[typings.awsSdk.directoryserviceMod.Snapshot]
  
  type SsoEnabled = scala.Boolean
  
  type StageReason = java.lang.String
  
  type StartDateTime = typings.std.Date
  
  type StartTime = typings.std.Date
  
  type StateLastUpdatedDateTime = typings.std.Date
  
  type SubnetId = java.lang.String
  
  type SubnetIds = js.Array[typings.awsSdk.directoryserviceMod.SubnetId]
  
  type SubscriptionCreatedDateTime = typings.std.Date
  
  type TagKey = java.lang.String
  
  type TagKeys = js.Array[typings.awsSdk.directoryserviceMod.TagKey]
  
  type TagValue = java.lang.String
  
  type Tags = js.Array[typings.awsSdk.directoryserviceMod.Tag]
  
  type TargetId = java.lang.String
  
  type TargetType = typings.awsSdk.awsSdkStrings.ACCOUNT | java.lang.String
  
  type TopicArn = java.lang.String
  
  type TopicName = java.lang.String
  
  type TopicNames = js.Array[typings.awsSdk.directoryserviceMod.TopicName]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Registered_
    - typings.awsSdk.awsSdkStrings.`Topic not found`
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Deleted_
    - java.lang.String
  */
  type TopicStatus = typings.awsSdk.directoryserviceMod._TopicStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`One-WayColon Outgoing`
    - typings.awsSdk.awsSdkStrings.`One-WayColon Incoming`
    - typings.awsSdk.awsSdkStrings.`Two-Way`
    - java.lang.String
  */
  type TrustDirection = typings.awsSdk.directoryserviceMod._TrustDirection | java.lang.String
  
  type TrustId = java.lang.String
  
  type TrustIds = js.Array[typings.awsSdk.directoryserviceMod.TrustId]
  
  type TrustPassword = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Creating_
    - typings.awsSdk.awsSdkStrings.Created_
    - typings.awsSdk.awsSdkStrings.Verifying_
    - typings.awsSdk.awsSdkStrings.VerifyFailed
    - typings.awsSdk.awsSdkStrings.Verified
    - typings.awsSdk.awsSdkStrings.Updating_
    - typings.awsSdk.awsSdkStrings.UpdateFailed
    - typings.awsSdk.awsSdkStrings.Updated_
    - typings.awsSdk.awsSdkStrings.Deleting_
    - typings.awsSdk.awsSdkStrings.Deleted_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type TrustState = typings.awsSdk.directoryserviceMod._TrustState | java.lang.String
  
  type TrustStateReason = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Forest
    - typings.awsSdk.awsSdkStrings.External_
    - java.lang.String
  */
  type TrustType = typings.awsSdk.directoryserviceMod._TrustType | java.lang.String
  
  type Trusts = js.Array[typings.awsSdk.directoryserviceMod.Trust]
  
  type UpdateSecurityGroupForDirectoryControllers = scala.Boolean
  
  type UseSameUsername = scala.Boolean
  
  type UserName = java.lang.String
  
  type UserPassword = java.lang.String
  
  type VpcId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2015-04-16`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.directoryserviceMod._apiVersion | java.lang.String
}
