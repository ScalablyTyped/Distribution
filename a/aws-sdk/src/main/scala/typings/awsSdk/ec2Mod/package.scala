package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ec2Mod {
  type AccountAttributeList = js.Array[typings.awsSdk.ec2Mod.AccountAttribute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`supported-platforms`
    - typings.awsSdk.awsSdkStrings.`default-vpc`
    - java.lang.String
  */
  type AccountAttributeName = typings.awsSdk.ec2Mod._AccountAttributeName | java.lang.String
  type AccountAttributeNameStringList = js.Array[typings.awsSdk.ec2Mod.AccountAttributeName]
  type AccountAttributeValueList = js.Array[typings.awsSdk.ec2Mod.AccountAttributeValue]
  type ActiveInstanceSet = js.Array[typings.awsSdk.ec2Mod.ActiveInstance]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.error__
    - typings.awsSdk.awsSdkStrings.pending_fulfillment
    - typings.awsSdk.awsSdkStrings.pending_termination
    - typings.awsSdk.awsSdkStrings.fulfilled__
    - java.lang.String
  */
  type ActivityStatus = typings.awsSdk.ec2Mod._ActivityStatus | java.lang.String
  type AddPrefixListEntries = js.Array[typings.awsSdk.ec2Mod.AddPrefixListEntry]
  type AddressList = js.Array[typings.awsSdk.ec2Mod.Address]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.default__
    - typings.awsSdk.awsSdkStrings.host_
    - java.lang.String
  */
  type Affinity = typings.awsSdk.ec2Mod._Affinity | java.lang.String
  type AllocationId = java.lang.String
  type AllocationIdList = js.Array[typings.awsSdk.ec2Mod.AllocationId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.`under-assessment`
    - typings.awsSdk.awsSdkStrings.`permanent-failure`
    - typings.awsSdk.awsSdkStrings.released
    - typings.awsSdk.awsSdkStrings.`released-permanent-failure`
    - typings.awsSdk.awsSdkStrings.pending__
    - java.lang.String
  */
  type AllocationState = typings.awsSdk.ec2Mod._AllocationState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.lowestPrice
    - typings.awsSdk.awsSdkStrings.diversified
    - typings.awsSdk.awsSdkStrings.capacityOptimized
    - java.lang.String
  */
  type AllocationStrategy = typings.awsSdk.ec2Mod._AllocationStrategy | java.lang.String
  type AllowedPrincipalSet = js.Array[typings.awsSdk.ec2Mod.AllowedPrincipal]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.on_
    - typings.awsSdk.awsSdkStrings.off__
    - java.lang.String
  */
  type AllowsMultipleInstanceTypes = typings.awsSdk.ec2Mod._AllowsMultipleInstanceTypes | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.i386
    - typings.awsSdk.awsSdkStrings.x86_64_
    - typings.awsSdk.awsSdkStrings.arm64_
    - java.lang.String
  */
  type ArchitectureType = typings.awsSdk.ec2Mod._ArchitectureType | java.lang.String
  type ArchitectureTypeList = js.Array[typings.awsSdk.ec2Mod.ArchitectureType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.i386
    - typings.awsSdk.awsSdkStrings.x86_64_
    - typings.awsSdk.awsSdkStrings.arm64_
    - java.lang.String
  */
  type ArchitectureValues = typings.awsSdk.ec2Mod._ArchitectureValues | java.lang.String
  type AssignedPrivateIpAddressList = js.Array[typings.awsSdk.ec2Mod.AssignedPrivateIpAddress]
  type AssociatedNetworkType = typings.awsSdk.awsSdkStrings.vpc_ | java.lang.String
  type AssociatedTargetNetworkSet = js.Array[typings.awsSdk.ec2Mod.AssociatedTargetNetwork]
  type AssociationIdList = js.Array[typings.awsSdk.ec2Mod.IamInstanceProfileAssociationId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.associating__
    - typings.awsSdk.awsSdkStrings.associated__
    - typings.awsSdk.awsSdkStrings.`association-failed`
    - typings.awsSdk.awsSdkStrings.disassociating__
    - typings.awsSdk.awsSdkStrings.disassociated_
    - java.lang.String
  */
  type AssociationStatusCode = typings.awsSdk.ec2Mod._AssociationStatusCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.attaching_
    - typings.awsSdk.awsSdkStrings.attached_
    - typings.awsSdk.awsSdkStrings.detaching__
    - typings.awsSdk.awsSdkStrings.detached__
    - java.lang.String
  */
  type AttachmentStatus = typings.awsSdk.ec2Mod._AttachmentStatus | java.lang.String
  type AuthorizationRuleSet = js.Array[typings.awsSdk.ec2Mod.AuthorizationRule]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.enable_
    - typings.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type AutoAcceptSharedAttachmentsValue = typings.awsSdk.ec2Mod._AutoAcceptSharedAttachmentsValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.on_
    - typings.awsSdk.awsSdkStrings.off__
    - java.lang.String
  */
  type AutoPlacement = typings.awsSdk.ec2Mod._AutoPlacement | java.lang.String
  type AutoRecoveryFlag = scala.Boolean
  type AvailabilityZoneList = js.Array[typings.awsSdk.ec2Mod.AvailabilityZone]
  type AvailabilityZoneMessageList = js.Array[typings.awsSdk.ec2Mod.AvailabilityZoneMessage]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`opt-in-not-required`
    - typings.awsSdk.awsSdkStrings.`opted-in`
    - typings.awsSdk.awsSdkStrings.`not-opted-in`
    - java.lang.String
  */
  type AvailabilityZoneOptInStatus = typings.awsSdk.ec2Mod._AvailabilityZoneOptInStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.information
    - typings.awsSdk.awsSdkStrings.impaired__
    - typings.awsSdk.awsSdkStrings.unavailable__
    - java.lang.String
  */
  type AvailabilityZoneState = typings.awsSdk.ec2Mod._AvailabilityZoneState | java.lang.String
  type AvailabilityZoneStringList = js.Array[typings.awsSdk.ec2Mod.String]
  type AvailableInstanceCapacityList = js.Array[typings.awsSdk.ec2Mod.InstanceCapacity]
  type BareMetalFlag = scala.Boolean
  type BaselineBandwidthInMbps = scala.Double
  type BaselineIops = scala.Double
  type BaselineThroughputInMBps = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.submitted__
    - typings.awsSdk.awsSdkStrings.active__
    - typings.awsSdk.awsSdkStrings.cancelled__
    - typings.awsSdk.awsSdkStrings.failed__
    - typings.awsSdk.awsSdkStrings.cancelled_running
    - typings.awsSdk.awsSdkStrings.cancelled_terminating
    - typings.awsSdk.awsSdkStrings.modifying_
    - java.lang.String
  */
  type BatchState = typings.awsSdk.ec2Mod._BatchState | java.lang.String
  type BillingProductList = js.Array[typings.awsSdk.ec2Mod.String]
  type BlockDeviceMappingList = js.Array[typings.awsSdk.ec2Mod.BlockDeviceMapping]
  type BlockDeviceMappingRequestList = js.Array[typings.awsSdk.ec2Mod.BlockDeviceMapping]
  type Boolean = scala.Boolean
  type BundleId = java.lang.String
  type BundleIdStringList = js.Array[typings.awsSdk.ec2Mod.BundleId]
  type BundleTaskList = js.Array[typings.awsSdk.ec2Mod.BundleTask]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.`waiting-for-shutdown`
    - typings.awsSdk.awsSdkStrings.bundling
    - typings.awsSdk.awsSdkStrings.storing
    - typings.awsSdk.awsSdkStrings.cancelling__
    - typings.awsSdk.awsSdkStrings.complete__
    - typings.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type BundleTaskState = typings.awsSdk.ec2Mod._BundleTaskState | java.lang.String
  type BurstablePerformanceFlag = scala.Boolean
  type ByoipCidrSet = js.Array[typings.awsSdk.ec2Mod.ByoipCidr]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.advertised
    - typings.awsSdk.awsSdkStrings.deprovisioned_
    - typings.awsSdk.awsSdkStrings.`failed-deprovision`
    - typings.awsSdk.awsSdkStrings.`failed-provision`
    - typings.awsSdk.awsSdkStrings.`pending-deprovision`
    - typings.awsSdk.awsSdkStrings.`pending-provision`
    - typings.awsSdk.awsSdkStrings.provisioned_
    - typings.awsSdk.awsSdkStrings.`provisioned-not-publicly-advertisable`
    - java.lang.String
  */
  type ByoipCidrState = typings.awsSdk.ec2Mod._ByoipCidrState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.fleetRequestIdDoesNotExist
    - typings.awsSdk.awsSdkStrings.fleetRequestIdMalformed
    - typings.awsSdk.awsSdkStrings.fleetRequestNotInCancellableState
    - typings.awsSdk.awsSdkStrings.unexpectedError
    - java.lang.String
  */
  type CancelBatchErrorCode = typings.awsSdk.ec2Mod._CancelBatchErrorCode | java.lang.String
  type CancelSpotFleetRequestsErrorSet = js.Array[typings.awsSdk.ec2Mod.CancelSpotFleetRequestsErrorItem]
  type CancelSpotFleetRequestsSuccessSet = js.Array[typings.awsSdk.ec2Mod.CancelSpotFleetRequestsSuccessItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.active__
    - typings.awsSdk.awsSdkStrings.open__
    - typings.awsSdk.awsSdkStrings.closed__
    - typings.awsSdk.awsSdkStrings.cancelled__
    - typings.awsSdk.awsSdkStrings.completed__
    - java.lang.String
  */
  type CancelSpotInstanceRequestState = typings.awsSdk.ec2Mod._CancelSpotInstanceRequestState | java.lang.String
  type CancelledSpotInstanceRequestList = js.Array[typings.awsSdk.ec2Mod.CancelledSpotInstanceRequest]
  type CapacityReservationId = java.lang.String
  type CapacityReservationIdSet = js.Array[typings.awsSdk.ec2Mod.CapacityReservationId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.LinuxSlashUNIX
    - typings.awsSdk.awsSdkStrings.`Red Hat Enterprise Linux`
    - typings.awsSdk.awsSdkStrings.`SUSE Linux`
    - typings.awsSdk.awsSdkStrings.Windows_
    - typings.awsSdk.awsSdkStrings.`Windows with SQL Server`
    - typings.awsSdk.awsSdkStrings.`Windows with SQL Server Enterprise`
    - typings.awsSdk.awsSdkStrings.`Windows with SQL Server Standard`
    - typings.awsSdk.awsSdkStrings.`Windows with SQL Server Web`
    - typings.awsSdk.awsSdkStrings.`Linux with SQL Server Standard`
    - typings.awsSdk.awsSdkStrings.`Linux with SQL Server Web`
    - typings.awsSdk.awsSdkStrings.`Linux with SQL Server Enterprise`
    - java.lang.String
  */
  type CapacityReservationInstancePlatform = typings.awsSdk.ec2Mod._CapacityReservationInstancePlatform | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.open__
    - typings.awsSdk.awsSdkStrings.none__
    - java.lang.String
  */
  type CapacityReservationPreference = typings.awsSdk.ec2Mod._CapacityReservationPreference | java.lang.String
  type CapacityReservationSet = js.Array[typings.awsSdk.ec2Mod.CapacityReservation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.active__
    - typings.awsSdk.awsSdkStrings.expired__
    - typings.awsSdk.awsSdkStrings.cancelled__
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type CapacityReservationState = typings.awsSdk.ec2Mod._CapacityReservationState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.default__
    - typings.awsSdk.awsSdkStrings.dedicated_
    - java.lang.String
  */
  type CapacityReservationTenancy = typings.awsSdk.ec2Mod._CapacityReservationTenancy | java.lang.String
  type CidrBlockSet = js.Array[typings.awsSdk.ec2Mod.CidrBlock]
  type ClassicLinkDnsSupportList = js.Array[typings.awsSdk.ec2Mod.ClassicLinkDnsSupport]
  type ClassicLinkInstanceList = js.Array[typings.awsSdk.ec2Mod.ClassicLinkInstance]
  type ClassicLoadBalancers = js.Array[typings.awsSdk.ec2Mod.ClassicLoadBalancer]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.active__
    - java.lang.String
  */
  type ClientCertificateRevocationListStatusCode = typings.awsSdk.ec2Mod._ClientCertificateRevocationListStatusCode | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.ec2Mod.ClientApiVersions
  type ClientVpnAssociationId = java.lang.String
  type ClientVpnAuthenticationList = js.Array[typings.awsSdk.ec2Mod.ClientVpnAuthentication]
  type ClientVpnAuthenticationRequestList = js.Array[typings.awsSdk.ec2Mod.ClientVpnAuthenticationRequest]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`certificate-authentication`
    - typings.awsSdk.awsSdkStrings.`directory-service-authentication`
    - typings.awsSdk.awsSdkStrings.`federated-authentication`
    - java.lang.String
  */
  type ClientVpnAuthenticationType = typings.awsSdk.ec2Mod._ClientVpnAuthenticationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.authorizing
    - typings.awsSdk.awsSdkStrings.active__
    - typings.awsSdk.awsSdkStrings.failed__
    - typings.awsSdk.awsSdkStrings.revoking
    - java.lang.String
  */
  type ClientVpnAuthorizationRuleStatusCode = typings.awsSdk.ec2Mod._ClientVpnAuthorizationRuleStatusCode | java.lang.String
  type ClientVpnConnectionSet = js.Array[typings.awsSdk.ec2Mod.ClientVpnConnection]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.active__
    - typings.awsSdk.awsSdkStrings.`failed-to-terminate`
    - typings.awsSdk.awsSdkStrings.terminating__
    - typings.awsSdk.awsSdkStrings.terminated__
    - java.lang.String
  */
  type ClientVpnConnectionStatusCode = typings.awsSdk.ec2Mod._ClientVpnConnectionStatusCode | java.lang.String
  type ClientVpnEndpointId = java.lang.String
  type ClientVpnEndpointIdList = js.Array[typings.awsSdk.ec2Mod.ClientVpnEndpointId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`pending-associate`
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.deleting__
    - typings.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type ClientVpnEndpointStatusCode = typings.awsSdk.ec2Mod._ClientVpnEndpointStatusCode | java.lang.String
  type ClientVpnRouteSet = js.Array[typings.awsSdk.ec2Mod.ClientVpnRoute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.creating__
    - typings.awsSdk.awsSdkStrings.active__
    - typings.awsSdk.awsSdkStrings.failed__
    - typings.awsSdk.awsSdkStrings.deleting__
    - java.lang.String
  */
  type ClientVpnRouteStatusCode = typings.awsSdk.ec2Mod._ClientVpnRouteStatusCode | java.lang.String
  type ClientVpnSecurityGroupIdSet = js.Array[typings.awsSdk.ec2Mod.SecurityGroupId]
  type CoipAddressUsageSet = js.Array[typings.awsSdk.ec2Mod.CoipAddressUsage]
  type CoipPoolId = java.lang.String
  type CoipPoolIdSet = js.Array[typings.awsSdk.ec2Mod.CoipPoolId]
  type CoipPoolMaxResults = scala.Double
  type CoipPoolSet = js.Array[typings.awsSdk.ec2Mod.CoipPool]
  type ConnectionNotificationId = java.lang.String
  type ConnectionNotificationSet = js.Array[typings.awsSdk.ec2Mod.ConnectionNotification]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Enabled_
    - typings.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type ConnectionNotificationState = typings.awsSdk.ec2Mod._ConnectionNotificationState | java.lang.String
  type ConnectionNotificationType = typings.awsSdk.awsSdkStrings.Topic | java.lang.String
  type ContainerFormat = typings.awsSdk.awsSdkStrings.ova | java.lang.String
  type ConversionIdStringList = js.Array[typings.awsSdk.ec2Mod.ConversionTaskId]
  type ConversionTaskId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.active__
    - typings.awsSdk.awsSdkStrings.cancelling__
    - typings.awsSdk.awsSdkStrings.cancelled__
    - typings.awsSdk.awsSdkStrings.completed__
    - java.lang.String
  */
  type ConversionTaskState = typings.awsSdk.ec2Mod._ConversionTaskState | java.lang.String
  type CopyTagsFromSource = typings.awsSdk.awsSdkStrings.volume_ | java.lang.String
  type CoreCount = scala.Double
  type CoreCountList = js.Array[typings.awsSdk.ec2Mod.CoreCount]
  type CreateFleetErrorsSet = js.Array[typings.awsSdk.ec2Mod.CreateFleetError]
  type CreateFleetInstancesSet = js.Array[typings.awsSdk.ec2Mod.CreateFleetInstance]
  type CreateVolumePermissionList = js.Array[typings.awsSdk.ec2Mod.CreateVolumePermission]
  type CurrencyCodeValues = typings.awsSdk.awsSdkStrings.USD | java.lang.String
  type CurrentGenerationFlag = scala.Boolean
  type CustomerGatewayId = java.lang.String
  type CustomerGatewayIdStringList = js.Array[typings.awsSdk.ec2Mod.CustomerGatewayId]
  type CustomerGatewayList = js.Array[typings.awsSdk.ec2Mod.CustomerGateway]
  type DITMaxResults = scala.Double
  type DITOMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Active_
    - typings.awsSdk.awsSdkStrings.Inactive_
    - java.lang.String
  */
  type DatafeedSubscriptionState = typings.awsSdk.ec2Mod._DatafeedSubscriptionState | java.lang.String
  type DateTime = typings.std.Date
  type DedicatedHostFlag = scala.Boolean
  type DedicatedHostId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.enable_
    - typings.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type DefaultRouteTableAssociationValue = typings.awsSdk.ec2Mod._DefaultRouteTableAssociationValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.enable_
    - typings.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type DefaultRouteTablePropagationValue = typings.awsSdk.ec2Mod._DefaultRouteTablePropagationValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.spot_
    - typings.awsSdk.awsSdkStrings.`on-demand`
    - java.lang.String
  */
  type DefaultTargetCapacityType = typings.awsSdk.ec2Mod._DefaultTargetCapacityType | java.lang.String
  type DefaultingDhcpOptionsId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.fleetIdDoesNotExist
    - typings.awsSdk.awsSdkStrings.fleetIdMalformed
    - typings.awsSdk.awsSdkStrings.fleetNotInDeletableState
    - typings.awsSdk.awsSdkStrings.unexpectedError
    - java.lang.String
  */
  type DeleteFleetErrorCode = typings.awsSdk.ec2Mod._DeleteFleetErrorCode | java.lang.String
  type DeleteFleetErrorSet = js.Array[typings.awsSdk.ec2Mod.DeleteFleetErrorItem]
  type DeleteFleetSuccessSet = js.Array[typings.awsSdk.ec2Mod.DeleteFleetSuccessItem]
  type DeleteLaunchTemplateVersionsResponseErrorSet = js.Array[typings.awsSdk.ec2Mod.DeleteLaunchTemplateVersionsResponseErrorItem]
  type DeleteLaunchTemplateVersionsResponseSuccessSet = js.Array[typings.awsSdk.ec2Mod.DeleteLaunchTemplateVersionsResponseSuccessItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`reserved-instances-id-invalid`
    - typings.awsSdk.awsSdkStrings.`reserved-instances-not-in-queued-state`
    - typings.awsSdk.awsSdkStrings.`unexpected-error`
    - java.lang.String
  */
  type DeleteQueuedReservedInstancesErrorCode = typings.awsSdk.ec2Mod._DeleteQueuedReservedInstancesErrorCode | java.lang.String
  type DeleteQueuedReservedInstancesIdList = js.Array[typings.awsSdk.ec2Mod.ReservationId]
  type DescribeByoipCidrsMaxResults = scala.Double
  type DescribeCapacityReservationsMaxResults = scala.Double
  type DescribeClassicLinkInstancesMaxResults = scala.Double
  type DescribeClientVpnAuthorizationRulesMaxResults = scala.Double
  type DescribeClientVpnConnectionsMaxResults = scala.Double
  type DescribeClientVpnEndpointMaxResults = scala.Double
  type DescribeClientVpnRoutesMaxResults = scala.Double
  type DescribeClientVpnTargetNetworksMaxResults = scala.Double
  type DescribeConversionTaskList = js.Array[typings.awsSdk.ec2Mod.ConversionTask]
  type DescribeDhcpOptionsMaxResults = scala.Double
  type DescribeEgressOnlyInternetGatewaysMaxResults = scala.Double
  type DescribeElasticGpusMaxResults = scala.Double
  type DescribeExportImageTasksMaxResults = scala.Double
  type DescribeFastSnapshotRestoreSuccessSet = js.Array[typings.awsSdk.ec2Mod.DescribeFastSnapshotRestoreSuccessItem]
  type DescribeFastSnapshotRestoresMaxResults = scala.Double
  type DescribeFleetsErrorSet = js.Array[typings.awsSdk.ec2Mod.DescribeFleetError]
  type DescribeFleetsInstancesSet = js.Array[typings.awsSdk.ec2Mod.DescribeFleetsInstances]
  type DescribeFpgaImagesMaxResults = scala.Double
  type DescribeHostReservationsMaxResults = scala.Double
  type DescribeIamInstanceProfileAssociationsMaxResults = scala.Double
  type DescribeInstanceCreditSpecificationsMaxResults = scala.Double
  type DescribeInternetGatewaysMaxResults = scala.Double
  type DescribeLaunchTemplatesMaxResults = scala.Double
  type DescribeMovingAddressesMaxResults = scala.Double
  type DescribeNatGatewaysMaxResults = scala.Double
  type DescribeNetworkAclsMaxResults = scala.Double
  type DescribeNetworkInterfacePermissionsMaxResults = scala.Double
  type DescribeNetworkInterfacesMaxResults = scala.Double
  type DescribePrincipalIdFormatMaxResults = scala.Double
  type DescribeRouteTablesMaxResults = scala.Double
  type DescribeScheduledInstanceAvailabilityMaxResults = scala.Double
  type DescribeSecurityGroupsMaxResults = scala.Double
  type DescribeSpotFleetInstancesMaxResults = scala.Double
  type DescribeSpotFleetRequestHistoryMaxResults = scala.Double
  type DescribeStaleSecurityGroupsMaxResults = scala.Double
  type DescribeStaleSecurityGroupsNextToken = java.lang.String
  type DescribeSubnetsMaxResults = scala.Double
  type DescribeVpcClassicLinkDnsSupportMaxResults = scala.Double
  type DescribeVpcClassicLinkDnsSupportNextToken = java.lang.String
  type DescribeVpcPeeringConnectionsMaxResults = scala.Double
  type DescribeVpcsMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ebs_
    - typings.awsSdk.awsSdkStrings.`instance-store`
    - java.lang.String
  */
  type DeviceType = typings.awsSdk.ec2Mod._DeviceType | java.lang.String
  type DhcpConfigurationList = js.Array[typings.awsSdk.ec2Mod.DhcpConfiguration]
  type DhcpConfigurationValueList = js.Array[typings.awsSdk.ec2Mod.AttributeValue]
  type DhcpOptionsId = java.lang.String
  type DhcpOptionsIdStringList = js.Array[typings.awsSdk.ec2Mod.DhcpOptionsId]
  type DhcpOptionsList = js.Array[typings.awsSdk.ec2Mod.DhcpOptions]
  type DisableFastSnapshotRestoreErrorSet = js.Array[typings.awsSdk.ec2Mod.DisableFastSnapshotRestoreErrorItem]
  type DisableFastSnapshotRestoreStateErrorSet = js.Array[typings.awsSdk.ec2Mod.DisableFastSnapshotRestoreStateErrorItem]
  type DisableFastSnapshotRestoreSuccessSet = js.Array[typings.awsSdk.ec2Mod.DisableFastSnapshotRestoreSuccessItem]
  type DiskCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.VMDK
    - typings.awsSdk.awsSdkStrings.RAW
    - typings.awsSdk.awsSdkStrings.VHD
    - java.lang.String
  */
  type DiskImageFormat = typings.awsSdk.ec2Mod._DiskImageFormat | java.lang.String
  type DiskImageList = js.Array[typings.awsSdk.ec2Mod.DiskImage]
  type DiskInfoList = js.Array[typings.awsSdk.ec2Mod.DiskInfo]
  type DiskSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.hdd_
    - typings.awsSdk.awsSdkStrings.ssd_
    - java.lang.String
  */
  type DiskType = typings.awsSdk.ec2Mod._DiskType | java.lang.String
  type DnsEntrySet = js.Array[typings.awsSdk.ec2Mod.DnsEntry]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pendingVerification_
    - typings.awsSdk.awsSdkStrings.verified_
    - typings.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type DnsNameState = typings.awsSdk.ec2Mod._DnsNameState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.enable_
    - typings.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type DnsSupportValue = typings.awsSdk.ec2Mod._DnsSupportValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.vpc_
    - typings.awsSdk.awsSdkStrings.standard__
    - java.lang.String
  */
  type DomainType = typings.awsSdk.ec2Mod._DomainType | java.lang.String
  type Double = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.unsupported
    - typings.awsSdk.awsSdkStrings.supported
    - java.lang.String
  */
  type EbsEncryptionSupport = typings.awsSdk.ec2Mod._EbsEncryptionSupport | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.unsupported
    - typings.awsSdk.awsSdkStrings.supported
    - typings.awsSdk.awsSdkStrings.required__
    - java.lang.String
  */
  type EbsNvmeSupport = typings.awsSdk.ec2Mod._EbsNvmeSupport | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.unsupported
    - typings.awsSdk.awsSdkStrings.supported
    - typings.awsSdk.awsSdkStrings.default__
    - java.lang.String
  */
  type EbsOptimizedSupport = typings.awsSdk.ec2Mod._EbsOptimizedSupport | java.lang.String
  type EfaSupportedFlag = scala.Boolean
  type EgressOnlyInternetGatewayId = java.lang.String
  type EgressOnlyInternetGatewayIdList = js.Array[typings.awsSdk.ec2Mod.EgressOnlyInternetGatewayId]
  type EgressOnlyInternetGatewayList = js.Array[typings.awsSdk.ec2Mod.EgressOnlyInternetGateway]
  type ElasticGpuAssociationList = js.Array[typings.awsSdk.ec2Mod.ElasticGpuAssociation]
  type ElasticGpuId = java.lang.String
  type ElasticGpuIdSet = js.Array[typings.awsSdk.ec2Mod.ElasticGpuId]
  type ElasticGpuSet = js.Array[typings.awsSdk.ec2Mod.ElasticGpus]
  type ElasticGpuSpecificationList = js.Array[typings.awsSdk.ec2Mod.ElasticGpuSpecification]
  type ElasticGpuSpecificationResponseList = js.Array[typings.awsSdk.ec2Mod.ElasticGpuSpecificationResponse]
  type ElasticGpuSpecifications = js.Array[typings.awsSdk.ec2Mod.ElasticGpuSpecification]
  type ElasticGpuState = typings.awsSdk.awsSdkStrings.ATTACHED | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OK
    - typings.awsSdk.awsSdkStrings.IMPAIRED
    - java.lang.String
  */
  type ElasticGpuStatus = typings.awsSdk.ec2Mod._ElasticGpuStatus | java.lang.String
  type ElasticInferenceAcceleratorAssociationList = js.Array[typings.awsSdk.ec2Mod.ElasticInferenceAcceleratorAssociation]
  type ElasticInferenceAcceleratorCount = scala.Double
  type ElasticInferenceAccelerators = js.Array[typings.awsSdk.ec2Mod.ElasticInferenceAccelerator]
  type ElasticIpAssociationId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.unsupported
    - typings.awsSdk.awsSdkStrings.supported
    - typings.awsSdk.awsSdkStrings.required__
    - java.lang.String
  */
  type EnaSupport = typings.awsSdk.ec2Mod._EnaSupport | java.lang.String
  type EnableFastSnapshotRestoreErrorSet = js.Array[typings.awsSdk.ec2Mod.EnableFastSnapshotRestoreErrorItem]
  type EnableFastSnapshotRestoreStateErrorSet = js.Array[typings.awsSdk.ec2Mod.EnableFastSnapshotRestoreStateErrorItem]
  type EnableFastSnapshotRestoreSuccessSet = js.Array[typings.awsSdk.ec2Mod.EnableFastSnapshotRestoreSuccessItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.unlimited_
    - typings.awsSdk.awsSdkStrings.limited
    - java.lang.String
  */
  type EndDateType = typings.awsSdk.ec2Mod._EndDateType | java.lang.String
  type EndpointSet = js.Array[typings.awsSdk.ec2Mod.ClientVpnEndpoint]
  type ErrorSet = js.Array[typings.awsSdk.ec2Mod.ValidationError]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`instance-reboot`
    - typings.awsSdk.awsSdkStrings.`system-reboot`
    - typings.awsSdk.awsSdkStrings.`system-maintenance`
    - typings.awsSdk.awsSdkStrings.`instance-retirement`
    - typings.awsSdk.awsSdkStrings.`instance-stop`
    - java.lang.String
  */
  type EventCode = typings.awsSdk.ec2Mod._EventCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.instanceChange
    - typings.awsSdk.awsSdkStrings.fleetRequestChange
    - typings.awsSdk.awsSdkStrings.error__
    - typings.awsSdk.awsSdkStrings.information
    - java.lang.String
  */
  type EventType = typings.awsSdk.ec2Mod._EventType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.noTermination
    - typings.awsSdk.awsSdkStrings.default__
    - java.lang.String
  */
  type ExcessCapacityTerminationPolicy = typings.awsSdk.ec2Mod._ExcessCapacityTerminationPolicy | java.lang.String
  type ExecutableByStringList = js.Array[typings.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.citrix
    - typings.awsSdk.awsSdkStrings.vmware_
    - typings.awsSdk.awsSdkStrings.microsoft
    - java.lang.String
  */
  type ExportEnvironment = typings.awsSdk.ec2Mod._ExportEnvironment | java.lang.String
  type ExportImageTaskId = java.lang.String
  type ExportImageTaskIdList = js.Array[typings.awsSdk.ec2Mod.ExportImageTaskId]
  type ExportImageTaskList = js.Array[typings.awsSdk.ec2Mod.ExportImageTask]
  type ExportTaskId = java.lang.String
  type ExportTaskIdStringList = js.Array[typings.awsSdk.ec2Mod.ExportTaskId]
  type ExportTaskList = js.Array[typings.awsSdk.ec2Mod.ExportTask]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.active__
    - typings.awsSdk.awsSdkStrings.cancelling__
    - typings.awsSdk.awsSdkStrings.cancelled__
    - typings.awsSdk.awsSdkStrings.completed__
    - java.lang.String
  */
  type ExportTaskState = typings.awsSdk.ec2Mod._ExportTaskState | java.lang.String
  type ExportVmTaskId = java.lang.String
  type FailedQueuedPurchaseDeletionSet = js.Array[typings.awsSdk.ec2Mod.FailedQueuedPurchaseDeletion]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.enabling__
    - typings.awsSdk.awsSdkStrings.optimizing
    - typings.awsSdk.awsSdkStrings.enabled__
    - typings.awsSdk.awsSdkStrings.disabling_
    - typings.awsSdk.awsSdkStrings.disabled__
    - java.lang.String
  */
  type FastSnapshotRestoreStateCode = typings.awsSdk.ec2Mod._FastSnapshotRestoreStateCode | java.lang.String
  type FilterList = js.Array[typings.awsSdk.ec2Mod.Filter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.error__
    - typings.awsSdk.awsSdkStrings.pending_fulfillment
    - typings.awsSdk.awsSdkStrings.pending_termination
    - typings.awsSdk.awsSdkStrings.fulfilled__
    - java.lang.String
  */
  type FleetActivityStatus = typings.awsSdk.ec2Mod._FleetActivityStatus | java.lang.String
  type FleetCapacityReservationUsageStrategy = typings.awsSdk.awsSdkStrings.`use-capacity-reservations-first` | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`instance-change`
    - typings.awsSdk.awsSdkStrings.`fleet-change`
    - typings.awsSdk.awsSdkStrings.`service-error`
    - java.lang.String
  */
  type FleetEventType = typings.awsSdk.ec2Mod._FleetEventType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`no-termination`
    - typings.awsSdk.awsSdkStrings.termination
    - java.lang.String
  */
  type FleetExcessCapacityTerminationPolicy = typings.awsSdk.ec2Mod._FleetExcessCapacityTerminationPolicy | java.lang.String
  type FleetId = java.lang.String
  type FleetIdSet = js.Array[typings.awsSdk.ec2Mod.FleetId]
  type FleetLaunchTemplateConfigList = js.Array[typings.awsSdk.ec2Mod.FleetLaunchTemplateConfig]
  type FleetLaunchTemplateConfigListRequest = js.Array[typings.awsSdk.ec2Mod.FleetLaunchTemplateConfigRequest]
  type FleetLaunchTemplateOverridesList = js.Array[typings.awsSdk.ec2Mod.FleetLaunchTemplateOverrides]
  type FleetLaunchTemplateOverridesListRequest = js.Array[typings.awsSdk.ec2Mod.FleetLaunchTemplateOverridesRequest]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`lowest-price`
    - typings.awsSdk.awsSdkStrings.prioritized
    - java.lang.String
  */
  type FleetOnDemandAllocationStrategy = typings.awsSdk.ec2Mod._FleetOnDemandAllocationStrategy | java.lang.String
  type FleetSet = js.Array[typings.awsSdk.ec2Mod.FleetData]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.submitted__
    - typings.awsSdk.awsSdkStrings.active__
    - typings.awsSdk.awsSdkStrings.deleted__
    - typings.awsSdk.awsSdkStrings.failed__
    - typings.awsSdk.awsSdkStrings.deleted_running
    - typings.awsSdk.awsSdkStrings.deleted_terminating
    - typings.awsSdk.awsSdkStrings.modifying_
    - java.lang.String
  */
  type FleetStateCode = typings.awsSdk.ec2Mod._FleetStateCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.request__
    - typings.awsSdk.awsSdkStrings.maintain
    - typings.awsSdk.awsSdkStrings.instant
    - java.lang.String
  */
  type FleetType = typings.awsSdk.ec2Mod._FleetType | java.lang.String
  type Float = scala.Double
  type FlowLogIdList = js.Array[typings.awsSdk.ec2Mod.VpcFlowLogId]
  type FlowLogResourceId = java.lang.String
  type FlowLogResourceIds = js.Array[typings.awsSdk.ec2Mod.FlowLogResourceId]
  type FlowLogSet = js.Array[typings.awsSdk.ec2Mod.FlowLog]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.VPC
    - typings.awsSdk.awsSdkStrings.Subnet
    - typings.awsSdk.awsSdkStrings.NetworkInterface
    - java.lang.String
  */
  type FlowLogsResourceType = typings.awsSdk.ec2Mod._FlowLogsResourceType | java.lang.String
  type FpgaDeviceCount = scala.Double
  type FpgaDeviceInfoList = js.Array[typings.awsSdk.ec2Mod.FpgaDeviceInfo]
  type FpgaDeviceManufacturerName = java.lang.String
  type FpgaDeviceMemorySize = scala.Double
  type FpgaDeviceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.description
    - typings.awsSdk.awsSdkStrings.name__
    - typings.awsSdk.awsSdkStrings.loadPermission
    - typings.awsSdk.awsSdkStrings.productCodes
    - java.lang.String
  */
  type FpgaImageAttributeName = typings.awsSdk.ec2Mod._FpgaImageAttributeName | java.lang.String
  type FpgaImageId = java.lang.String
  type FpgaImageIdList = js.Array[typings.awsSdk.ec2Mod.FpgaImageId]
  type FpgaImageList = js.Array[typings.awsSdk.ec2Mod.FpgaImage]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.failed__
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.unavailable__
    - java.lang.String
  */
  type FpgaImageStateCode = typings.awsSdk.ec2Mod._FpgaImageStateCode | java.lang.String
  type FreeTierEligibleFlag = scala.Boolean
  type GatewayType = typings.awsSdk.awsSdkStrings.ipsecDot1 | java.lang.String
  type GetCapacityReservationUsageRequestMaxResults = scala.Double
  type GetManagedPrefixListAssociationsMaxResults = scala.Double
  type GpuDeviceCount = scala.Double
  type GpuDeviceInfoList = js.Array[typings.awsSdk.ec2Mod.GpuDeviceInfo]
  type GpuDeviceManufacturerName = java.lang.String
  type GpuDeviceMemorySize = scala.Double
  type GpuDeviceName = java.lang.String
  type GroupIdStringList = js.Array[typings.awsSdk.ec2Mod.String]
  type GroupIdentifierList = js.Array[typings.awsSdk.ec2Mod.GroupIdentifier]
  type GroupIdentifierSet = js.Array[typings.awsSdk.ec2Mod.SecurityGroupIdentifier]
  type GroupIds = js.Array[typings.awsSdk.ec2Mod.SecurityGroupId]
  type GroupNameStringList = js.Array[typings.awsSdk.ec2Mod.SecurityGroupName]
  type HibernationFlag = scala.Boolean
  type HistoryRecordSet = js.Array[typings.awsSdk.ec2Mod.HistoryRecordEntry]
  type HistoryRecords = js.Array[typings.awsSdk.ec2Mod.HistoryRecord]
  type HostInstanceList = js.Array[typings.awsSdk.ec2Mod.HostInstance]
  type HostList = js.Array[typings.awsSdk.ec2Mod.Host]
  type HostOfferingSet = js.Array[typings.awsSdk.ec2Mod.HostOffering]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.on_
    - typings.awsSdk.awsSdkStrings.off__
    - java.lang.String
  */
  type HostRecovery = typings.awsSdk.ec2Mod._HostRecovery | java.lang.String
  type HostReservationId = java.lang.String
  type HostReservationIdSet = js.Array[typings.awsSdk.ec2Mod.HostReservationId]
  type HostReservationSet = js.Array[typings.awsSdk.ec2Mod.HostReservation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.dedicated_
    - typings.awsSdk.awsSdkStrings.host_
    - java.lang.String
  */
  type HostTenancy = typings.awsSdk.ec2Mod._HostTenancy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.optional__
    - typings.awsSdk.awsSdkStrings.required__
    - java.lang.String
  */
  type HttpTokensState = typings.awsSdk.ec2Mod._HttpTokensState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ovm
    - typings.awsSdk.awsSdkStrings.xen
    - java.lang.String
  */
  type HypervisorType = typings.awsSdk.ec2Mod._HypervisorType | java.lang.String
  type IKEVersionsList = js.Array[typings.awsSdk.ec2Mod.IKEVersionsListValue]
  type IKEVersionsRequestList = js.Array[typings.awsSdk.ec2Mod.IKEVersionsRequestListValue]
  type IamInstanceProfileAssociationId = java.lang.String
  type IamInstanceProfileAssociationSet = js.Array[typings.awsSdk.ec2Mod.IamInstanceProfileAssociation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.associating__
    - typings.awsSdk.awsSdkStrings.associated__
    - typings.awsSdk.awsSdkStrings.disassociating__
    - typings.awsSdk.awsSdkStrings.disassociated_
    - java.lang.String
  */
  type IamInstanceProfileAssociationState = typings.awsSdk.ec2Mod._IamInstanceProfileAssociationState | java.lang.String
  type IdFormatList = js.Array[typings.awsSdk.ec2Mod.IdFormat]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.description
    - typings.awsSdk.awsSdkStrings.kernel
    - typings.awsSdk.awsSdkStrings.ramdisk
    - typings.awsSdk.awsSdkStrings.launchPermission
    - typings.awsSdk.awsSdkStrings.productCodes
    - typings.awsSdk.awsSdkStrings.blockDeviceMapping
    - typings.awsSdk.awsSdkStrings.sriovNetSupport
    - java.lang.String
  */
  type ImageAttributeName = typings.awsSdk.ec2Mod._ImageAttributeName | java.lang.String
  type ImageDiskContainerList = js.Array[typings.awsSdk.ec2Mod.ImageDiskContainer]
  type ImageId = java.lang.String
  type ImageIdStringList = js.Array[typings.awsSdk.ec2Mod.ImageId]
  type ImageList = js.Array[typings.awsSdk.ec2Mod.Image]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.invalid__
    - typings.awsSdk.awsSdkStrings.deregistered__
    - typings.awsSdk.awsSdkStrings.transient
    - typings.awsSdk.awsSdkStrings.failed__
    - typings.awsSdk.awsSdkStrings.error__
    - java.lang.String
  */
  type ImageState = typings.awsSdk.ec2Mod._ImageState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.machine
    - typings.awsSdk.awsSdkStrings.kernel
    - typings.awsSdk.awsSdkStrings.ramdisk
    - java.lang.String
  */
  type ImageTypeValues = typings.awsSdk.ec2Mod._ImageTypeValues | java.lang.String
  type ImportImageLicenseSpecificationListRequest = js.Array[typings.awsSdk.ec2Mod.ImportImageLicenseConfigurationRequest]
  type ImportImageLicenseSpecificationListResponse = js.Array[typings.awsSdk.ec2Mod.ImportImageLicenseConfigurationResponse]
  type ImportImageTaskId = java.lang.String
  type ImportImageTaskList = js.Array[typings.awsSdk.ec2Mod.ImportImageTask]
  type ImportInstanceVolumeDetailSet = js.Array[typings.awsSdk.ec2Mod.ImportInstanceVolumeDetailItem]
  type ImportSnapshotTaskId = java.lang.String
  type ImportSnapshotTaskIdList = js.Array[typings.awsSdk.ec2Mod.ImportSnapshotTaskId]
  type ImportSnapshotTaskList = js.Array[typings.awsSdk.ec2Mod.ImportSnapshotTask]
  type ImportTaskId = java.lang.String
  type ImportTaskIdList = js.Array[typings.awsSdk.ec2Mod.ImportImageTaskId]
  type InferenceDeviceCount = scala.Double
  type InferenceDeviceInfoList = js.Array[typings.awsSdk.ec2Mod.InferenceDeviceInfo]
  type InferenceDeviceManufacturerName = java.lang.String
  type InferenceDeviceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.instanceType_
    - typings.awsSdk.awsSdkStrings.kernel
    - typings.awsSdk.awsSdkStrings.ramdisk
    - typings.awsSdk.awsSdkStrings.userData
    - typings.awsSdk.awsSdkStrings.disableApiTermination
    - typings.awsSdk.awsSdkStrings.instanceInitiatedShutdownBehavior
    - typings.awsSdk.awsSdkStrings.rootDeviceName
    - typings.awsSdk.awsSdkStrings.blockDeviceMapping
    - typings.awsSdk.awsSdkStrings.productCodes
    - typings.awsSdk.awsSdkStrings.sourceDestCheck
    - typings.awsSdk.awsSdkStrings.groupSet
    - typings.awsSdk.awsSdkStrings.ebsOptimized
    - typings.awsSdk.awsSdkStrings.sriovNetSupport
    - typings.awsSdk.awsSdkStrings.enaSupport
    - java.lang.String
  */
  type InstanceAttributeName = typings.awsSdk.ec2Mod._InstanceAttributeName | java.lang.String
  type InstanceBlockDeviceMappingList = js.Array[typings.awsSdk.ec2Mod.InstanceBlockDeviceMapping]
  type InstanceBlockDeviceMappingSpecificationList = js.Array[typings.awsSdk.ec2Mod.InstanceBlockDeviceMappingSpecification]
  type InstanceCountList = js.Array[typings.awsSdk.ec2Mod.InstanceCount]
  type InstanceCreditSpecificationList = js.Array[typings.awsSdk.ec2Mod.InstanceCreditSpecification]
  type InstanceCreditSpecificationListRequest = js.Array[typings.awsSdk.ec2Mod.InstanceCreditSpecificationRequest]
  type InstanceEventId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.healthy__
    - typings.awsSdk.awsSdkStrings.unhealthy__
    - java.lang.String
  */
  type InstanceHealthStatus = typings.awsSdk.ec2Mod._InstanceHealthStatus | java.lang.String
  type InstanceId = java.lang.String
  type InstanceIdSet = js.Array[typings.awsSdk.ec2Mod.String]
  type InstanceIdStringList = js.Array[typings.awsSdk.ec2Mod.InstanceId]
  type InstanceIdsSet = js.Array[typings.awsSdk.ec2Mod.InstanceId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.hibernate
    - typings.awsSdk.awsSdkStrings.stop
    - typings.awsSdk.awsSdkStrings.terminate_
    - java.lang.String
  */
  type InstanceInterruptionBehavior = typings.awsSdk.ec2Mod._InstanceInterruptionBehavior | java.lang.String
  type InstanceIpv6AddressList = js.Array[typings.awsSdk.ec2Mod.InstanceIpv6Address]
  type InstanceIpv6AddressListRequest = js.Array[typings.awsSdk.ec2Mod.InstanceIpv6AddressRequest]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.spot_
    - typings.awsSdk.awsSdkStrings.`on-demand`
    - java.lang.String
  */
  type InstanceLifecycle = typings.awsSdk.ec2Mod._InstanceLifecycle | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.spot_
    - typings.awsSdk.awsSdkStrings.scheduled__
    - java.lang.String
  */
  type InstanceLifecycleType = typings.awsSdk.ec2Mod._InstanceLifecycleType | java.lang.String
  type InstanceList = js.Array[typings.awsSdk.ec2Mod.Instance]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.open__
    - typings.awsSdk.awsSdkStrings.targeted
    - java.lang.String
  */
  type InstanceMatchCriteria = typings.awsSdk.ec2Mod._InstanceMatchCriteria | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.disabled__
    - typings.awsSdk.awsSdkStrings.enabled__
    - java.lang.String
  */
  type InstanceMetadataEndpointState = typings.awsSdk.ec2Mod._InstanceMetadataEndpointState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.applied
    - java.lang.String
  */
  type InstanceMetadataOptionsState = typings.awsSdk.ec2Mod._InstanceMetadataOptionsState | java.lang.String
  type InstanceMonitoringList = js.Array[typings.awsSdk.ec2Mod.InstanceMonitoring]
  type InstanceNetworkInterfaceList = js.Array[typings.awsSdk.ec2Mod.InstanceNetworkInterface]
  type InstanceNetworkInterfaceSpecificationList = js.Array[typings.awsSdk.ec2Mod.InstanceNetworkInterfaceSpecification]
  type InstancePrivateIpAddressList = js.Array[typings.awsSdk.ec2Mod.InstancePrivateIpAddress]
  type InstanceStateChangeList = js.Array[typings.awsSdk.ec2Mod.InstanceStateChange]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.running__
    - typings.awsSdk.awsSdkStrings.`shutting-down`
    - typings.awsSdk.awsSdkStrings.terminated__
    - typings.awsSdk.awsSdkStrings.stopping__
    - typings.awsSdk.awsSdkStrings.stopped__
    - java.lang.String
  */
  type InstanceStateName = typings.awsSdk.ec2Mod._InstanceStateName | java.lang.String
  type InstanceStatusDetailsList = js.Array[typings.awsSdk.ec2Mod.InstanceStatusDetails]
  type InstanceStatusEventList = js.Array[typings.awsSdk.ec2Mod.InstanceStatusEvent]
  type InstanceStatusList = js.Array[typings.awsSdk.ec2Mod.InstanceStatus]
  type InstanceStorageFlag = scala.Boolean
  type InstanceTagKeySet = js.Array[typings.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.t1Dotmicro
    - typings.awsSdk.awsSdkStrings.t2Dotnano
    - typings.awsSdk.awsSdkStrings.t2Dotmicro
    - typings.awsSdk.awsSdkStrings.t2Dotsmall
    - typings.awsSdk.awsSdkStrings.t2Dotmedium
    - typings.awsSdk.awsSdkStrings.t2Dotlarge
    - typings.awsSdk.awsSdkStrings.t2Dotxlarge
    - typings.awsSdk.awsSdkStrings.t2Dot2xlarge
    - typings.awsSdk.awsSdkStrings.t3Dotnano
    - typings.awsSdk.awsSdkStrings.t3Dotmicro
    - typings.awsSdk.awsSdkStrings.t3Dotsmall
    - typings.awsSdk.awsSdkStrings.t3Dotmedium
    - typings.awsSdk.awsSdkStrings.t3Dotlarge
    - typings.awsSdk.awsSdkStrings.t3Dotxlarge
    - typings.awsSdk.awsSdkStrings.t3Dot2xlarge
    - typings.awsSdk.awsSdkStrings.t3aDotnano
    - typings.awsSdk.awsSdkStrings.t3aDotmicro
    - typings.awsSdk.awsSdkStrings.t3aDotsmall
    - typings.awsSdk.awsSdkStrings.t3aDotmedium
    - typings.awsSdk.awsSdkStrings.t3aDotlarge
    - typings.awsSdk.awsSdkStrings.t3aDotxlarge
    - typings.awsSdk.awsSdkStrings.t3aDot2xlarge
    - typings.awsSdk.awsSdkStrings.m1Dotsmall
    - typings.awsSdk.awsSdkStrings.m1Dotmedium
    - typings.awsSdk.awsSdkStrings.m1Dotlarge
    - typings.awsSdk.awsSdkStrings.m1Dotxlarge
    - typings.awsSdk.awsSdkStrings.m3Dotmedium
    - typings.awsSdk.awsSdkStrings.m3Dotlarge
    - typings.awsSdk.awsSdkStrings.m3Dotxlarge
    - typings.awsSdk.awsSdkStrings.m3Dot2xlarge
    - typings.awsSdk.awsSdkStrings.m4Dotlarge
    - typings.awsSdk.awsSdkStrings.m4Dotxlarge
    - typings.awsSdk.awsSdkStrings.m4Dot2xlarge
    - typings.awsSdk.awsSdkStrings.m4Dot4xlarge
    - typings.awsSdk.awsSdkStrings.m4Dot10xlarge
    - typings.awsSdk.awsSdkStrings.m4Dot16xlarge
    - typings.awsSdk.awsSdkStrings.m2Dotxlarge
    - typings.awsSdk.awsSdkStrings.m2Dot2xlarge
    - typings.awsSdk.awsSdkStrings.m2Dot4xlarge
    - typings.awsSdk.awsSdkStrings.cr1Dot8xlarge
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
    - typings.awsSdk.awsSdkStrings.r5Dotmetal
    - typings.awsSdk.awsSdkStrings.r5aDotlarge
    - typings.awsSdk.awsSdkStrings.r5aDotxlarge
    - typings.awsSdk.awsSdkStrings.r5aDot2xlarge
    - typings.awsSdk.awsSdkStrings.r5aDot4xlarge
    - typings.awsSdk.awsSdkStrings.r5aDot8xlarge
    - typings.awsSdk.awsSdkStrings.r5aDot12xlarge
    - typings.awsSdk.awsSdkStrings.r5aDot16xlarge
    - typings.awsSdk.awsSdkStrings.r5aDot24xlarge
    - typings.awsSdk.awsSdkStrings.r5dDotlarge
    - typings.awsSdk.awsSdkStrings.r5dDotxlarge
    - typings.awsSdk.awsSdkStrings.r5dDot2xlarge
    - typings.awsSdk.awsSdkStrings.r5dDot4xlarge
    - typings.awsSdk.awsSdkStrings.r5dDot8xlarge
    - typings.awsSdk.awsSdkStrings.r5dDot12xlarge
    - typings.awsSdk.awsSdkStrings.r5dDot16xlarge
    - typings.awsSdk.awsSdkStrings.r5dDot24xlarge
    - typings.awsSdk.awsSdkStrings.r5dDotmetal
    - typings.awsSdk.awsSdkStrings.r5adDotlarge
    - typings.awsSdk.awsSdkStrings.r5adDotxlarge
    - typings.awsSdk.awsSdkStrings.r5adDot2xlarge
    - typings.awsSdk.awsSdkStrings.r5adDot4xlarge
    - typings.awsSdk.awsSdkStrings.r5adDot8xlarge
    - typings.awsSdk.awsSdkStrings.r5adDot12xlarge
    - typings.awsSdk.awsSdkStrings.r5adDot16xlarge
    - typings.awsSdk.awsSdkStrings.r5adDot24xlarge
    - typings.awsSdk.awsSdkStrings.r6gDotmetal
    - typings.awsSdk.awsSdkStrings.r6gDotmedium
    - typings.awsSdk.awsSdkStrings.r6gDotlarge
    - typings.awsSdk.awsSdkStrings.r6gDotxlarge
    - typings.awsSdk.awsSdkStrings.r6gDot2xlarge
    - typings.awsSdk.awsSdkStrings.r6gDot4xlarge
    - typings.awsSdk.awsSdkStrings.r6gDot8xlarge
    - typings.awsSdk.awsSdkStrings.r6gDot12xlarge
    - typings.awsSdk.awsSdkStrings.r6gDot16xlarge
    - typings.awsSdk.awsSdkStrings.x1Dot16xlarge
    - typings.awsSdk.awsSdkStrings.x1Dot32xlarge
    - typings.awsSdk.awsSdkStrings.x1eDotxlarge
    - typings.awsSdk.awsSdkStrings.x1eDot2xlarge
    - typings.awsSdk.awsSdkStrings.x1eDot4xlarge
    - typings.awsSdk.awsSdkStrings.x1eDot8xlarge
    - typings.awsSdk.awsSdkStrings.x1eDot16xlarge
    - typings.awsSdk.awsSdkStrings.x1eDot32xlarge
    - typings.awsSdk.awsSdkStrings.i2Dotxlarge
    - typings.awsSdk.awsSdkStrings.i2Dot2xlarge
    - typings.awsSdk.awsSdkStrings.i2Dot4xlarge
    - typings.awsSdk.awsSdkStrings.i2Dot8xlarge
    - typings.awsSdk.awsSdkStrings.i3Dotlarge
    - typings.awsSdk.awsSdkStrings.i3Dotxlarge
    - typings.awsSdk.awsSdkStrings.i3Dot2xlarge
    - typings.awsSdk.awsSdkStrings.i3Dot4xlarge
    - typings.awsSdk.awsSdkStrings.i3Dot8xlarge
    - typings.awsSdk.awsSdkStrings.i3Dot16xlarge
    - typings.awsSdk.awsSdkStrings.i3Dotmetal
    - typings.awsSdk.awsSdkStrings.i3enDotlarge
    - typings.awsSdk.awsSdkStrings.i3enDotxlarge
    - typings.awsSdk.awsSdkStrings.i3enDot2xlarge
    - typings.awsSdk.awsSdkStrings.i3enDot3xlarge
    - typings.awsSdk.awsSdkStrings.i3enDot6xlarge
    - typings.awsSdk.awsSdkStrings.i3enDot12xlarge
    - typings.awsSdk.awsSdkStrings.i3enDot24xlarge
    - typings.awsSdk.awsSdkStrings.i3enDotmetal
    - typings.awsSdk.awsSdkStrings.hi1Dot4xlarge
    - typings.awsSdk.awsSdkStrings.hs1Dot8xlarge
    - typings.awsSdk.awsSdkStrings.c1Dotmedium
    - typings.awsSdk.awsSdkStrings.c1Dotxlarge
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
    - typings.awsSdk.awsSdkStrings.c5Dotmetal
    - typings.awsSdk.awsSdkStrings.c5aDotlarge
    - typings.awsSdk.awsSdkStrings.c5aDotxlarge
    - typings.awsSdk.awsSdkStrings.c5aDot2xlarge
    - typings.awsSdk.awsSdkStrings.c5aDot4xlarge
    - typings.awsSdk.awsSdkStrings.c5aDot8xlarge
    - typings.awsSdk.awsSdkStrings.c5aDot12xlarge
    - typings.awsSdk.awsSdkStrings.c5aDot16xlarge
    - typings.awsSdk.awsSdkStrings.c5aDot24xlarge
    - typings.awsSdk.awsSdkStrings.c5dDotlarge
    - typings.awsSdk.awsSdkStrings.c5dDotxlarge
    - typings.awsSdk.awsSdkStrings.c5dDot2xlarge
    - typings.awsSdk.awsSdkStrings.c5dDot4xlarge
    - typings.awsSdk.awsSdkStrings.c5dDot9xlarge
    - typings.awsSdk.awsSdkStrings.c5dDot12xlarge
    - typings.awsSdk.awsSdkStrings.c5dDot18xlarge
    - typings.awsSdk.awsSdkStrings.c5dDot24xlarge
    - typings.awsSdk.awsSdkStrings.c5dDotmetal
    - typings.awsSdk.awsSdkStrings.c5nDotlarge
    - typings.awsSdk.awsSdkStrings.c5nDotxlarge
    - typings.awsSdk.awsSdkStrings.c5nDot2xlarge
    - typings.awsSdk.awsSdkStrings.c5nDot4xlarge
    - typings.awsSdk.awsSdkStrings.c5nDot9xlarge
    - typings.awsSdk.awsSdkStrings.c5nDot18xlarge
    - typings.awsSdk.awsSdkStrings.c6gDotmetal
    - typings.awsSdk.awsSdkStrings.c6gDotmedium
    - typings.awsSdk.awsSdkStrings.c6gDotlarge
    - typings.awsSdk.awsSdkStrings.c6gDotxlarge
    - typings.awsSdk.awsSdkStrings.c6gDot2xlarge
    - typings.awsSdk.awsSdkStrings.c6gDot4xlarge
    - typings.awsSdk.awsSdkStrings.c6gDot8xlarge
    - typings.awsSdk.awsSdkStrings.c6gDot12xlarge
    - typings.awsSdk.awsSdkStrings.c6gDot16xlarge
    - typings.awsSdk.awsSdkStrings.cc1Dot4xlarge
    - typings.awsSdk.awsSdkStrings.cc2Dot8xlarge
    - typings.awsSdk.awsSdkStrings.g2Dot2xlarge
    - typings.awsSdk.awsSdkStrings.g2Dot8xlarge
    - typings.awsSdk.awsSdkStrings.g3Dot4xlarge
    - typings.awsSdk.awsSdkStrings.g3Dot8xlarge
    - typings.awsSdk.awsSdkStrings.g3Dot16xlarge
    - typings.awsSdk.awsSdkStrings.g3sDotxlarge
    - typings.awsSdk.awsSdkStrings.g4dnDotxlarge
    - typings.awsSdk.awsSdkStrings.g4dnDot2xlarge
    - typings.awsSdk.awsSdkStrings.g4dnDot4xlarge
    - typings.awsSdk.awsSdkStrings.g4dnDot8xlarge
    - typings.awsSdk.awsSdkStrings.g4dnDot12xlarge
    - typings.awsSdk.awsSdkStrings.g4dnDot16xlarge
    - typings.awsSdk.awsSdkStrings.g4dnDotmetal
    - typings.awsSdk.awsSdkStrings.cg1Dot4xlarge
    - typings.awsSdk.awsSdkStrings.p2Dotxlarge
    - typings.awsSdk.awsSdkStrings.p2Dot8xlarge
    - typings.awsSdk.awsSdkStrings.p2Dot16xlarge
    - typings.awsSdk.awsSdkStrings.p3Dot2xlarge
    - typings.awsSdk.awsSdkStrings.p3Dot8xlarge
    - typings.awsSdk.awsSdkStrings.p3Dot16xlarge
    - typings.awsSdk.awsSdkStrings.p3dnDot24xlarge
    - typings.awsSdk.awsSdkStrings.d2Dotxlarge
    - typings.awsSdk.awsSdkStrings.d2Dot2xlarge
    - typings.awsSdk.awsSdkStrings.d2Dot4xlarge
    - typings.awsSdk.awsSdkStrings.d2Dot8xlarge
    - typings.awsSdk.awsSdkStrings.f1Dot2xlarge
    - typings.awsSdk.awsSdkStrings.f1Dot4xlarge
    - typings.awsSdk.awsSdkStrings.f1Dot16xlarge
    - typings.awsSdk.awsSdkStrings.m5Dotlarge
    - typings.awsSdk.awsSdkStrings.m5Dotxlarge
    - typings.awsSdk.awsSdkStrings.m5Dot2xlarge
    - typings.awsSdk.awsSdkStrings.m5Dot4xlarge
    - typings.awsSdk.awsSdkStrings.m5Dot8xlarge
    - typings.awsSdk.awsSdkStrings.m5Dot12xlarge
    - typings.awsSdk.awsSdkStrings.m5Dot16xlarge
    - typings.awsSdk.awsSdkStrings.m5Dot24xlarge
    - typings.awsSdk.awsSdkStrings.m5Dotmetal
    - typings.awsSdk.awsSdkStrings.m5aDotlarge
    - typings.awsSdk.awsSdkStrings.m5aDotxlarge
    - typings.awsSdk.awsSdkStrings.m5aDot2xlarge
    - typings.awsSdk.awsSdkStrings.m5aDot4xlarge
    - typings.awsSdk.awsSdkStrings.m5aDot8xlarge
    - typings.awsSdk.awsSdkStrings.m5aDot12xlarge
    - typings.awsSdk.awsSdkStrings.m5aDot16xlarge
    - typings.awsSdk.awsSdkStrings.m5aDot24xlarge
    - typings.awsSdk.awsSdkStrings.m5dDotlarge
    - typings.awsSdk.awsSdkStrings.m5dDotxlarge
    - typings.awsSdk.awsSdkStrings.m5dDot2xlarge
    - typings.awsSdk.awsSdkStrings.m5dDot4xlarge
    - typings.awsSdk.awsSdkStrings.m5dDot8xlarge
    - typings.awsSdk.awsSdkStrings.m5dDot12xlarge
    - typings.awsSdk.awsSdkStrings.m5dDot16xlarge
    - typings.awsSdk.awsSdkStrings.m5dDot24xlarge
    - typings.awsSdk.awsSdkStrings.m5dDotmetal
    - typings.awsSdk.awsSdkStrings.m5adDotlarge
    - typings.awsSdk.awsSdkStrings.m5adDotxlarge
    - typings.awsSdk.awsSdkStrings.m5adDot2xlarge
    - typings.awsSdk.awsSdkStrings.m5adDot4xlarge
    - typings.awsSdk.awsSdkStrings.m5adDot8xlarge
    - typings.awsSdk.awsSdkStrings.m5adDot12xlarge
    - typings.awsSdk.awsSdkStrings.m5adDot16xlarge
    - typings.awsSdk.awsSdkStrings.m5adDot24xlarge
    - typings.awsSdk.awsSdkStrings.h1Dot2xlarge
    - typings.awsSdk.awsSdkStrings.h1Dot4xlarge
    - typings.awsSdk.awsSdkStrings.h1Dot8xlarge
    - typings.awsSdk.awsSdkStrings.h1Dot16xlarge
    - typings.awsSdk.awsSdkStrings.z1dDotlarge
    - typings.awsSdk.awsSdkStrings.z1dDotxlarge
    - typings.awsSdk.awsSdkStrings.z1dDot2xlarge
    - typings.awsSdk.awsSdkStrings.z1dDot3xlarge
    - typings.awsSdk.awsSdkStrings.z1dDot6xlarge
    - typings.awsSdk.awsSdkStrings.z1dDot12xlarge
    - typings.awsSdk.awsSdkStrings.z1dDotmetal
    - typings.awsSdk.awsSdkStrings.`u-6tb1Dotmetal`
    - typings.awsSdk.awsSdkStrings.`u-9tb1Dotmetal`
    - typings.awsSdk.awsSdkStrings.`u-12tb1Dotmetal`
    - typings.awsSdk.awsSdkStrings.`u-18tb1Dotmetal`
    - typings.awsSdk.awsSdkStrings.`u-24tb1Dotmetal`
    - typings.awsSdk.awsSdkStrings.a1Dotmedium
    - typings.awsSdk.awsSdkStrings.a1Dotlarge
    - typings.awsSdk.awsSdkStrings.a1Dotxlarge
    - typings.awsSdk.awsSdkStrings.a1Dot2xlarge
    - typings.awsSdk.awsSdkStrings.a1Dot4xlarge
    - typings.awsSdk.awsSdkStrings.a1Dotmetal
    - typings.awsSdk.awsSdkStrings.m5dnDotlarge
    - typings.awsSdk.awsSdkStrings.m5dnDotxlarge
    - typings.awsSdk.awsSdkStrings.m5dnDot2xlarge
    - typings.awsSdk.awsSdkStrings.m5dnDot4xlarge
    - typings.awsSdk.awsSdkStrings.m5dnDot8xlarge
    - typings.awsSdk.awsSdkStrings.m5dnDot12xlarge
    - typings.awsSdk.awsSdkStrings.m5dnDot16xlarge
    - typings.awsSdk.awsSdkStrings.m5dnDot24xlarge
    - typings.awsSdk.awsSdkStrings.m5nDotlarge
    - typings.awsSdk.awsSdkStrings.m5nDotxlarge
    - typings.awsSdk.awsSdkStrings.m5nDot2xlarge
    - typings.awsSdk.awsSdkStrings.m5nDot4xlarge
    - typings.awsSdk.awsSdkStrings.m5nDot8xlarge
    - typings.awsSdk.awsSdkStrings.m5nDot12xlarge
    - typings.awsSdk.awsSdkStrings.m5nDot16xlarge
    - typings.awsSdk.awsSdkStrings.m5nDot24xlarge
    - typings.awsSdk.awsSdkStrings.r5dnDotlarge
    - typings.awsSdk.awsSdkStrings.r5dnDotxlarge
    - typings.awsSdk.awsSdkStrings.r5dnDot2xlarge
    - typings.awsSdk.awsSdkStrings.r5dnDot4xlarge
    - typings.awsSdk.awsSdkStrings.r5dnDot8xlarge
    - typings.awsSdk.awsSdkStrings.r5dnDot12xlarge
    - typings.awsSdk.awsSdkStrings.r5dnDot16xlarge
    - typings.awsSdk.awsSdkStrings.r5dnDot24xlarge
    - typings.awsSdk.awsSdkStrings.r5nDotlarge
    - typings.awsSdk.awsSdkStrings.r5nDotxlarge
    - typings.awsSdk.awsSdkStrings.r5nDot2xlarge
    - typings.awsSdk.awsSdkStrings.r5nDot4xlarge
    - typings.awsSdk.awsSdkStrings.r5nDot8xlarge
    - typings.awsSdk.awsSdkStrings.r5nDot12xlarge
    - typings.awsSdk.awsSdkStrings.r5nDot16xlarge
    - typings.awsSdk.awsSdkStrings.r5nDot24xlarge
    - typings.awsSdk.awsSdkStrings.inf1Dotxlarge
    - typings.awsSdk.awsSdkStrings.inf1Dot2xlarge
    - typings.awsSdk.awsSdkStrings.inf1Dot6xlarge
    - typings.awsSdk.awsSdkStrings.inf1Dot24xlarge
    - typings.awsSdk.awsSdkStrings.m6gDotmetal
    - typings.awsSdk.awsSdkStrings.m6gDotmedium
    - typings.awsSdk.awsSdkStrings.m6gDotlarge
    - typings.awsSdk.awsSdkStrings.m6gDotxlarge
    - typings.awsSdk.awsSdkStrings.m6gDot2xlarge
    - typings.awsSdk.awsSdkStrings.m6gDot4xlarge
    - typings.awsSdk.awsSdkStrings.m6gDot8xlarge
    - typings.awsSdk.awsSdkStrings.m6gDot12xlarge
    - typings.awsSdk.awsSdkStrings.m6gDot16xlarge
    - java.lang.String
  */
  type InstanceType = typings.awsSdk.ec2Mod._InstanceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.nitro
    - typings.awsSdk.awsSdkStrings.xen
    - java.lang.String
  */
  type InstanceTypeHypervisor = typings.awsSdk.ec2Mod._InstanceTypeHypervisor | java.lang.String
  type InstanceTypeInfoList = js.Array[typings.awsSdk.ec2Mod.InstanceTypeInfo]
  type InstanceTypeList = js.Array[typings.awsSdk.ec2Mod.InstanceType]
  type InstanceTypeOfferingsList = js.Array[typings.awsSdk.ec2Mod.InstanceTypeOffering]
  type InstanceUsageSet = js.Array[typings.awsSdk.ec2Mod.InstanceUsage]
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`INSTANCE-ATTACH`
    - typings.awsSdk.awsSdkStrings.`EIP-ASSOCIATE`
    - java.lang.String
  */
  type InterfacePermissionType = typings.awsSdk.ec2Mod._InterfacePermissionType | java.lang.String
  type InternetGatewayAttachmentList = js.Array[typings.awsSdk.ec2Mod.InternetGatewayAttachment]
  type InternetGatewayId = java.lang.String
  type InternetGatewayIdList = js.Array[typings.awsSdk.ec2Mod.InternetGatewayId]
  type InternetGatewayList = js.Array[typings.awsSdk.ec2Mod.InternetGateway]
  type IpPermissionList = js.Array[typings.awsSdk.ec2Mod.IpPermission]
  type IpRangeList = js.Array[typings.awsSdk.ec2Mod.IpRange]
  type IpRanges = js.Array[typings.awsSdk.ec2Mod.String]
  type Ipv4PoolEc2Id = java.lang.String
  type Ipv6Address = java.lang.String
  type Ipv6AddressList = js.Array[typings.awsSdk.ec2Mod.String]
  type Ipv6CidrAssociationSet = js.Array[typings.awsSdk.ec2Mod.Ipv6CidrAssociation]
  type Ipv6CidrBlockSet = js.Array[typings.awsSdk.ec2Mod.Ipv6CidrBlock]
  type Ipv6Flag = scala.Boolean
  type Ipv6PoolEc2Id = java.lang.String
  type Ipv6PoolIdList = js.Array[typings.awsSdk.ec2Mod.Ipv6PoolEc2Id]
  type Ipv6PoolMaxResults = scala.Double
  type Ipv6PoolSet = js.Array[typings.awsSdk.ec2Mod.Ipv6Pool]
  type Ipv6RangeList = js.Array[typings.awsSdk.ec2Mod.Ipv6Range]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.enable_
    - typings.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type Ipv6SupportValue = typings.awsSdk.ec2Mod._Ipv6SupportValue | java.lang.String
  type KernelId = java.lang.String
  type KeyNameStringList = js.Array[typings.awsSdk.ec2Mod.KeyPairName]
  type KeyPairId = java.lang.String
  type KeyPairIdStringList = js.Array[typings.awsSdk.ec2Mod.KeyPairId]
  type KeyPairList = js.Array[typings.awsSdk.ec2Mod.KeyPairInfo]
  type KeyPairName = java.lang.String
  type KmsKeyId = java.lang.String
  type LaunchPermissionList = js.Array[typings.awsSdk.ec2Mod.LaunchPermission]
  type LaunchSpecsList = js.Array[typings.awsSdk.ec2Mod.SpotFleetLaunchSpecification]
  type LaunchTemplateBlockDeviceMappingList = js.Array[typings.awsSdk.ec2Mod.LaunchTemplateBlockDeviceMapping]
  type LaunchTemplateBlockDeviceMappingRequestList = js.Array[typings.awsSdk.ec2Mod.LaunchTemplateBlockDeviceMappingRequest]
  type LaunchTemplateConfigList = js.Array[typings.awsSdk.ec2Mod.LaunchTemplateConfig]
  type LaunchTemplateElasticInferenceAcceleratorCount = scala.Double
  type LaunchTemplateElasticInferenceAcceleratorList = js.Array[typings.awsSdk.ec2Mod.LaunchTemplateElasticInferenceAccelerator]
  type LaunchTemplateElasticInferenceAcceleratorResponseList = js.Array[typings.awsSdk.ec2Mod.LaunchTemplateElasticInferenceAcceleratorResponse]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.launchTemplateIdDoesNotExist
    - typings.awsSdk.awsSdkStrings.launchTemplateIdMalformed
    - typings.awsSdk.awsSdkStrings.launchTemplateNameDoesNotExist
    - typings.awsSdk.awsSdkStrings.launchTemplateNameMalformed
    - typings.awsSdk.awsSdkStrings.launchTemplateVersionDoesNotExist
    - typings.awsSdk.awsSdkStrings.unexpectedError
    - java.lang.String
  */
  type LaunchTemplateErrorCode = typings.awsSdk.ec2Mod._LaunchTemplateErrorCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.optional__
    - typings.awsSdk.awsSdkStrings.required__
    - java.lang.String
  */
  type LaunchTemplateHttpTokensState = typings.awsSdk.ec2Mod._LaunchTemplateHttpTokensState | java.lang.String
  type LaunchTemplateId = java.lang.String
  type LaunchTemplateIdStringList = js.Array[typings.awsSdk.ec2Mod.LaunchTemplateId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.disabled__
    - typings.awsSdk.awsSdkStrings.enabled__
    - java.lang.String
  */
  type LaunchTemplateInstanceMetadataEndpointState = typings.awsSdk.ec2Mod._LaunchTemplateInstanceMetadataEndpointState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.applied
    - java.lang.String
  */
  type LaunchTemplateInstanceMetadataOptionsState = typings.awsSdk.ec2Mod._LaunchTemplateInstanceMetadataOptionsState | java.lang.String
  type LaunchTemplateInstanceNetworkInterfaceSpecificationList = js.Array[typings.awsSdk.ec2Mod.LaunchTemplateInstanceNetworkInterfaceSpecification]
  type LaunchTemplateInstanceNetworkInterfaceSpecificationRequestList = js.Array[typings.awsSdk.ec2Mod.LaunchTemplateInstanceNetworkInterfaceSpecificationRequest]
  type LaunchTemplateLicenseList = js.Array[typings.awsSdk.ec2Mod.LaunchTemplateLicenseConfiguration]
  type LaunchTemplateLicenseSpecificationListRequest = js.Array[typings.awsSdk.ec2Mod.LaunchTemplateLicenseConfigurationRequest]
  type LaunchTemplateName = java.lang.String
  type LaunchTemplateNameStringList = js.Array[typings.awsSdk.ec2Mod.LaunchTemplateName]
  type LaunchTemplateOverridesList = js.Array[typings.awsSdk.ec2Mod.LaunchTemplateOverrides]
  type LaunchTemplateSet = js.Array[typings.awsSdk.ec2Mod.LaunchTemplate]
  type LaunchTemplateTagSpecificationList = js.Array[typings.awsSdk.ec2Mod.LaunchTemplateTagSpecification]
  type LaunchTemplateTagSpecificationRequestList = js.Array[typings.awsSdk.ec2Mod.LaunchTemplateTagSpecificationRequest]
  type LaunchTemplateVersionSet = js.Array[typings.awsSdk.ec2Mod.LaunchTemplateVersion]
  type LicenseList = js.Array[typings.awsSdk.ec2Mod.LicenseConfiguration]
  type LicenseSpecificationListRequest = js.Array[typings.awsSdk.ec2Mod.LicenseConfigurationRequest]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.sold
    - typings.awsSdk.awsSdkStrings.cancelled__
    - typings.awsSdk.awsSdkStrings.pending__
    - java.lang.String
  */
  type ListingState = typings.awsSdk.ec2Mod._ListingState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.active__
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.cancelled__
    - typings.awsSdk.awsSdkStrings.closed__
    - java.lang.String
  */
  type ListingStatus = typings.awsSdk.ec2Mod._ListingStatus | java.lang.String
  type LoadPermissionList = js.Array[typings.awsSdk.ec2Mod.LoadPermission]
  type LoadPermissionListRequest = js.Array[typings.awsSdk.ec2Mod.LoadPermissionRequest]
  type LocalGatewayId = java.lang.String
  type LocalGatewayIdSet = js.Array[typings.awsSdk.ec2Mod.LocalGatewayId]
  type LocalGatewayMaxResults = scala.Double
  type LocalGatewayRouteList = js.Array[typings.awsSdk.ec2Mod.LocalGatewayRoute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.active__
    - typings.awsSdk.awsSdkStrings.blackhole
    - typings.awsSdk.awsSdkStrings.deleting__
    - typings.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type LocalGatewayRouteState = typings.awsSdk.ec2Mod._LocalGatewayRouteState | java.lang.String
  type LocalGatewayRouteTableIdSet = js.Array[typings.awsSdk.ec2Mod.LocalGatewayRoutetableId]
  type LocalGatewayRouteTableSet = js.Array[typings.awsSdk.ec2Mod.LocalGatewayRouteTable]
  type LocalGatewayRouteTableVirtualInterfaceGroupAssociationId = java.lang.String
  type LocalGatewayRouteTableVirtualInterfaceGroupAssociationIdSet = js.Array[typings.awsSdk.ec2Mod.LocalGatewayRouteTableVirtualInterfaceGroupAssociationId]
  type LocalGatewayRouteTableVirtualInterfaceGroupAssociationSet = js.Array[typings.awsSdk.ec2Mod.LocalGatewayRouteTableVirtualInterfaceGroupAssociation]
  type LocalGatewayRouteTableVpcAssociationId = java.lang.String
  type LocalGatewayRouteTableVpcAssociationIdSet = js.Array[typings.awsSdk.ec2Mod.LocalGatewayRouteTableVpcAssociationId]
  type LocalGatewayRouteTableVpcAssociationSet = js.Array[typings.awsSdk.ec2Mod.LocalGatewayRouteTableVpcAssociation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.static__
    - typings.awsSdk.awsSdkStrings.propagated
    - java.lang.String
  */
  type LocalGatewayRouteType = typings.awsSdk.ec2Mod._LocalGatewayRouteType | java.lang.String
  type LocalGatewayRoutetableId = java.lang.String
  type LocalGatewaySet = js.Array[typings.awsSdk.ec2Mod.LocalGateway]
  type LocalGatewayVirtualInterfaceGroupId = java.lang.String
  type LocalGatewayVirtualInterfaceGroupIdSet = js.Array[typings.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceGroupId]
  type LocalGatewayVirtualInterfaceGroupSet = js.Array[typings.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceGroup]
  type LocalGatewayVirtualInterfaceId = java.lang.String
  type LocalGatewayVirtualInterfaceIdSet = js.Array[typings.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceId]
  type LocalGatewayVirtualInterfaceSet = js.Array[typings.awsSdk.ec2Mod.LocalGatewayVirtualInterface]
  type Location = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.region__
    - typings.awsSdk.awsSdkStrings.`availability-zone`
    - typings.awsSdk.awsSdkStrings.`availability-zone-id`
    - java.lang.String
  */
  type LocationType = typings.awsSdk.ec2Mod._LocationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`cloud-watch-logs`
    - typings.awsSdk.awsSdkStrings.s3_
    - java.lang.String
  */
  type LogDestinationType = typings.awsSdk.ec2Mod._LogDestinationType | java.lang.String
  type Long = scala.Double
  type ManagedPrefixListSet = js.Array[typings.awsSdk.ec2Mod.ManagedPrefixList]
  type MarketType = typings.awsSdk.awsSdkStrings.spot_ | java.lang.String
  type MaxIpv4AddrPerInterface = scala.Double
  type MaxIpv6AddrPerInterface = scala.Double
  type MaxNetworkInterfaces = scala.Double
  type MaxResults = scala.Double
  type MaximumBandwidthInMbps = scala.Double
  type MaximumIops = scala.Double
  type MaximumThroughputInMBps = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.static__
    - typings.awsSdk.awsSdkStrings.igmp
    - java.lang.String
  */
  type MembershipType = typings.awsSdk.ec2Mod._MembershipType | java.lang.String
  type MemorySize = scala.Double
  type MillisecondDateTime = typings.std.Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`opted-in`
    - typings.awsSdk.awsSdkStrings.`not-opted-in`
    - java.lang.String
  */
  type ModifyAvailabilityZoneOptInStatus = typings.awsSdk.ec2Mod._ModifyAvailabilityZoneOptInStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.disabled__
    - typings.awsSdk.awsSdkStrings.disabling_
    - typings.awsSdk.awsSdkStrings.enabled__
    - typings.awsSdk.awsSdkStrings.pending__
    - java.lang.String
  */
  type MonitoringState = typings.awsSdk.ec2Mod._MonitoringState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.movingToVpc
    - typings.awsSdk.awsSdkStrings.restoringToClassic
    - java.lang.String
  */
  type MoveStatus = typings.awsSdk.ec2Mod._MoveStatus | java.lang.String
  type MovingAddressStatusSet = js.Array[typings.awsSdk.ec2Mod.MovingAddressStatus]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.enable_
    - typings.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type MulticastSupportValue = typings.awsSdk.ec2Mod._MulticastSupportValue | java.lang.String
  type NatGatewayAddressList = js.Array[typings.awsSdk.ec2Mod.NatGatewayAddress]
  type NatGatewayId = java.lang.String
  type NatGatewayIdStringList = js.Array[typings.awsSdk.ec2Mod.NatGatewayId]
  type NatGatewayList = js.Array[typings.awsSdk.ec2Mod.NatGateway]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.failed__
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.deleting__
    - typings.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type NatGatewayState = typings.awsSdk.ec2Mod._NatGatewayState | java.lang.String
  type NetworkAclAssociationId = java.lang.String
  type NetworkAclAssociationList = js.Array[typings.awsSdk.ec2Mod.NetworkAclAssociation]
  type NetworkAclEntryList = js.Array[typings.awsSdk.ec2Mod.NetworkAclEntry]
  type NetworkAclId = java.lang.String
  type NetworkAclIdStringList = js.Array[typings.awsSdk.ec2Mod.NetworkAclId]
  type NetworkAclList = js.Array[typings.awsSdk.ec2Mod.NetworkAcl]
  type NetworkInterfaceAttachmentId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.description
    - typings.awsSdk.awsSdkStrings.groupSet
    - typings.awsSdk.awsSdkStrings.sourceDestCheck
    - typings.awsSdk.awsSdkStrings.attachment
    - java.lang.String
  */
  type NetworkInterfaceAttribute = typings.awsSdk.ec2Mod._NetworkInterfaceAttribute | java.lang.String
  type NetworkInterfaceCreationType = typings.awsSdk.awsSdkStrings.efa | java.lang.String
  type NetworkInterfaceId = java.lang.String
  type NetworkInterfaceIdList = js.Array[typings.awsSdk.ec2Mod.NetworkInterfaceId]
  type NetworkInterfaceIpv6AddressesList = js.Array[typings.awsSdk.ec2Mod.NetworkInterfaceIpv6Address]
  type NetworkInterfaceList = js.Array[typings.awsSdk.ec2Mod.NetworkInterface]
  type NetworkInterfacePermissionId = java.lang.String
  type NetworkInterfacePermissionIdList = js.Array[typings.awsSdk.ec2Mod.NetworkInterfacePermissionId]
  type NetworkInterfacePermissionList = js.Array[typings.awsSdk.ec2Mod.NetworkInterfacePermission]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.granted_
    - typings.awsSdk.awsSdkStrings.revoking
    - typings.awsSdk.awsSdkStrings.revoked__
    - java.lang.String
  */
  type NetworkInterfacePermissionStateCode = typings.awsSdk.ec2Mod._NetworkInterfacePermissionStateCode | java.lang.String
  type NetworkInterfacePrivateIpAddressList = js.Array[typings.awsSdk.ec2Mod.NetworkInterfacePrivateIpAddress]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.associated__
    - typings.awsSdk.awsSdkStrings.attaching_
    - typings.awsSdk.awsSdkStrings.`in-use`
    - typings.awsSdk.awsSdkStrings.detaching__
    - java.lang.String
  */
  type NetworkInterfaceStatus = typings.awsSdk.ec2Mod._NetworkInterfaceStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.interface_
    - typings.awsSdk.awsSdkStrings.natGateway
    - typings.awsSdk.awsSdkStrings.efa
    - java.lang.String
  */
  type NetworkInterfaceType = typings.awsSdk.ec2Mod._NetworkInterfaceType | java.lang.String
  type NetworkPerformance = java.lang.String
  type NewDhcpConfigurationList = js.Array[typings.awsSdk.ec2Mod.NewDhcpConfiguration]
  type NextToken = java.lang.String
  type OccurrenceDayRequestSet = js.Array[typings.awsSdk.ec2Mod.Integer]
  type OccurrenceDaySet = js.Array[typings.awsSdk.ec2Mod.Integer]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.standard__
    - typings.awsSdk.awsSdkStrings.convertible_
    - java.lang.String
  */
  type OfferingClassType = typings.awsSdk.ec2Mod._OfferingClassType | java.lang.String
  type OfferingId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`Heavy Utilization`
    - typings.awsSdk.awsSdkStrings.`Medium Utilization`
    - typings.awsSdk.awsSdkStrings.`Light Utilization`
    - typings.awsSdk.awsSdkStrings.`No Upfront`
    - typings.awsSdk.awsSdkStrings.`Partial Upfront`
    - typings.awsSdk.awsSdkStrings.`All Upfront`
    - java.lang.String
  */
  type OfferingTypeValues = typings.awsSdk.ec2Mod._OfferingTypeValues | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.lowestPrice
    - typings.awsSdk.awsSdkStrings.prioritized
    - java.lang.String
  */
  type OnDemandAllocationStrategy = typings.awsSdk.ec2Mod._OnDemandAllocationStrategy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.add__
    - typings.awsSdk.awsSdkStrings.remove__
    - java.lang.String
  */
  type OperationType = typings.awsSdk.ec2Mod._OperationType | java.lang.String
  type OwnerStringList = js.Array[typings.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AllUpfront
    - typings.awsSdk.awsSdkStrings.PartialUpfront
    - typings.awsSdk.awsSdkStrings.NoUpfront
    - java.lang.String
  */
  type PaymentOption = typings.awsSdk.ec2Mod._PaymentOption | java.lang.String
  type PermissionGroup = typings.awsSdk.awsSdkStrings.all__ | java.lang.String
  type Phase1DHGroupNumbersList = js.Array[typings.awsSdk.ec2Mod.Phase1DHGroupNumbersListValue]
  type Phase1DHGroupNumbersRequestList = js.Array[typings.awsSdk.ec2Mod.Phase1DHGroupNumbersRequestListValue]
  type Phase1EncryptionAlgorithmsList = js.Array[typings.awsSdk.ec2Mod.Phase1EncryptionAlgorithmsListValue]
  type Phase1EncryptionAlgorithmsRequestList = js.Array[typings.awsSdk.ec2Mod.Phase1EncryptionAlgorithmsRequestListValue]
  type Phase1IntegrityAlgorithmsList = js.Array[typings.awsSdk.ec2Mod.Phase1IntegrityAlgorithmsListValue]
  type Phase1IntegrityAlgorithmsRequestList = js.Array[typings.awsSdk.ec2Mod.Phase1IntegrityAlgorithmsRequestListValue]
  type Phase2DHGroupNumbersList = js.Array[typings.awsSdk.ec2Mod.Phase2DHGroupNumbersListValue]
  type Phase2DHGroupNumbersRequestList = js.Array[typings.awsSdk.ec2Mod.Phase2DHGroupNumbersRequestListValue]
  type Phase2EncryptionAlgorithmsList = js.Array[typings.awsSdk.ec2Mod.Phase2EncryptionAlgorithmsListValue]
  type Phase2EncryptionAlgorithmsRequestList = js.Array[typings.awsSdk.ec2Mod.Phase2EncryptionAlgorithmsRequestListValue]
  type Phase2IntegrityAlgorithmsList = js.Array[typings.awsSdk.ec2Mod.Phase2IntegrityAlgorithmsListValue]
  type Phase2IntegrityAlgorithmsRequestList = js.Array[typings.awsSdk.ec2Mod.Phase2IntegrityAlgorithmsRequestListValue]
  type PlacementGroupId = java.lang.String
  type PlacementGroupIdStringList = js.Array[typings.awsSdk.ec2Mod.PlacementGroupId]
  type PlacementGroupList = js.Array[typings.awsSdk.ec2Mod.PlacementGroup]
  type PlacementGroupName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.deleting__
    - typings.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type PlacementGroupState = typings.awsSdk.ec2Mod._PlacementGroupState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.cluster_
    - typings.awsSdk.awsSdkStrings.partition
    - typings.awsSdk.awsSdkStrings.spread
    - java.lang.String
  */
  type PlacementGroupStrategy = typings.awsSdk.ec2Mod._PlacementGroupStrategy | java.lang.String
  type PlacementGroupStrategyList = js.Array[typings.awsSdk.ec2Mod.PlacementGroupStrategy]
  type PlacementGroupStringList = js.Array[typings.awsSdk.ec2Mod.PlacementGroupName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.cluster_
    - typings.awsSdk.awsSdkStrings.spread
    - typings.awsSdk.awsSdkStrings.partition
    - java.lang.String
  */
  type PlacementStrategy = typings.awsSdk.ec2Mod._PlacementStrategy | java.lang.String
  type PlatformValues = typings.awsSdk.awsSdkStrings.Windows_ | java.lang.String
  type PoolCidrBlocksSet = js.Array[typings.awsSdk.ec2Mod.PoolCidrBlock]
  type PoolMaxResults = scala.Double
  type PrefixListAssociationSet = js.Array[typings.awsSdk.ec2Mod.PrefixListAssociation]
  type PrefixListEntrySet = js.Array[typings.awsSdk.ec2Mod.PrefixListEntry]
  type PrefixListIdList = js.Array[typings.awsSdk.ec2Mod.PrefixListId]
  type PrefixListIdSet = js.Array[typings.awsSdk.ec2Mod.String]
  type PrefixListMaxResults = scala.Double
  type PrefixListResourceId = java.lang.String
  type PrefixListResourceIdStringList = js.Array[typings.awsSdk.ec2Mod.PrefixListResourceId]
  type PrefixListSet = js.Array[typings.awsSdk.ec2Mod.PrefixList]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`create-in-progress`
    - typings.awsSdk.awsSdkStrings.`create-complete`
    - typings.awsSdk.awsSdkStrings.`create-failed`
    - typings.awsSdk.awsSdkStrings.`modify-in-progress`
    - typings.awsSdk.awsSdkStrings.`modify-complete`
    - typings.awsSdk.awsSdkStrings.`modify-failed`
    - typings.awsSdk.awsSdkStrings.`restore-in-progress`
    - typings.awsSdk.awsSdkStrings.`restore-complete`
    - typings.awsSdk.awsSdkStrings.`restore-failed`
    - typings.awsSdk.awsSdkStrings.`delete-in-progress`
    - typings.awsSdk.awsSdkStrings.`delete-complete`
    - typings.awsSdk.awsSdkStrings.`delete-failed`
    - java.lang.String
  */
  type PrefixListState = typings.awsSdk.ec2Mod._PrefixListState | java.lang.String
  type PriceScheduleList = js.Array[typings.awsSdk.ec2Mod.PriceSchedule]
  type PriceScheduleSpecificationList = js.Array[typings.awsSdk.ec2Mod.PriceScheduleSpecification]
  type PricingDetailsList = js.Array[typings.awsSdk.ec2Mod.PricingDetail]
  type PrincipalIdFormatList = js.Array[typings.awsSdk.ec2Mod.PrincipalIdFormat]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.All_
    - typings.awsSdk.awsSdkStrings.Service_
    - typings.awsSdk.awsSdkStrings.OrganizationUnit
    - typings.awsSdk.awsSdkStrings.Account_
    - typings.awsSdk.awsSdkStrings.User_
    - typings.awsSdk.awsSdkStrings.Role_
    - java.lang.String
  */
  type PrincipalType = typings.awsSdk.ec2Mod._PrincipalType | java.lang.String
  type PrivateIpAddressConfigSet = js.Array[typings.awsSdk.ec2Mod.ScheduledInstancesPrivateIpAddressConfig]
  type PrivateIpAddressSpecificationList = js.Array[typings.awsSdk.ec2Mod.PrivateIpAddressSpecification]
  type PrivateIpAddressStringList = js.Array[typings.awsSdk.ec2Mod.String]
  type ProcessorSustainedClockSpeed = scala.Double
  type ProductCodeList = js.Array[typings.awsSdk.ec2Mod.ProductCode]
  type ProductCodeStringList = js.Array[typings.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.devpay
    - typings.awsSdk.awsSdkStrings.marketplace_
    - java.lang.String
  */
  type ProductCodeValues = typings.awsSdk.ec2Mod._ProductCodeValues | java.lang.String
  type ProductDescriptionList = js.Array[typings.awsSdk.ec2Mod.String]
  type PropagatingVgwList = js.Array[typings.awsSdk.ec2Mod.PropagatingVgw]
  type PublicIpStringList = js.Array[typings.awsSdk.ec2Mod.String]
  type PublicIpv4PoolIdStringList = js.Array[typings.awsSdk.ec2Mod.Ipv4PoolEc2Id]
  type PublicIpv4PoolRangeSet = js.Array[typings.awsSdk.ec2Mod.PublicIpv4PoolRange]
  type PublicIpv4PoolSet = js.Array[typings.awsSdk.ec2Mod.PublicIpv4Pool]
  type PurchaseRequestSet = js.Array[typings.awsSdk.ec2Mod.PurchaseRequest]
  type PurchaseSet = js.Array[typings.awsSdk.ec2Mod.Purchase]
  type PurchasedScheduledInstanceSet = js.Array[typings.awsSdk.ec2Mod.ScheduledInstance]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.LinuxSlashUNIX
    - typings.awsSdk.awsSdkStrings.`LinuxSlashUNIX LeftparenthesisAmazon VPCRightparenthesis`
    - typings.awsSdk.awsSdkStrings.Windows_
    - typings.awsSdk.awsSdkStrings.`Windows LeftparenthesisAmazon VPCRightparenthesis`
    - java.lang.String
  */
  type RIProductDescription = typings.awsSdk.ec2Mod._RIProductDescription | java.lang.String
  type RamdiskId = java.lang.String
  type ReasonCodesList = js.Array[typings.awsSdk.ec2Mod.ReportInstanceReasonCodes]
  type RecurringChargeFrequency = typings.awsSdk.awsSdkStrings.Hourly_ | java.lang.String
  type RecurringChargesList = js.Array[typings.awsSdk.ec2Mod.RecurringCharge]
  type RegionList = js.Array[typings.awsSdk.ec2Mod.Region]
  type RegionNameStringList = js.Array[typings.awsSdk.ec2Mod.String]
  type RemovePrefixListEntries = js.Array[typings.awsSdk.ec2Mod.RemovePrefixListEntry]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`instance-stuck-in-state`
    - typings.awsSdk.awsSdkStrings.unresponsive
    - typings.awsSdk.awsSdkStrings.`not-accepting-credentials`
    - typings.awsSdk.awsSdkStrings.`password-not-available`
    - typings.awsSdk.awsSdkStrings.`performance-network`
    - typings.awsSdk.awsSdkStrings.`performance-instance-store`
    - typings.awsSdk.awsSdkStrings.`performance-ebs-volume`
    - typings.awsSdk.awsSdkStrings.`performance-other`
    - typings.awsSdk.awsSdkStrings.other_
    - java.lang.String
  */
  type ReportInstanceReasonCodes = typings.awsSdk.ec2Mod._ReportInstanceReasonCodes | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ok__
    - typings.awsSdk.awsSdkStrings.impaired__
    - java.lang.String
  */
  type ReportStatusType = typings.awsSdk.ec2Mod._ReportStatusType | java.lang.String
  type RequestHostIdList = js.Array[typings.awsSdk.ec2Mod.DedicatedHostId]
  type RequestHostIdSet = js.Array[typings.awsSdk.ec2Mod.DedicatedHostId]
  type RequestInstanceTypeList = js.Array[typings.awsSdk.ec2Mod.InstanceType]
  type RequestSpotLaunchSpecificationSecurityGroupIdList = js.Array[typings.awsSdk.ec2Mod.SecurityGroupId]
  type RequestSpotLaunchSpecificationSecurityGroupList = js.Array[typings.awsSdk.ec2Mod.SecurityGroupName]
  type ReservationId = java.lang.String
  type ReservationList = js.Array[typings.awsSdk.ec2Mod.Reservation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`payment-pending`
    - typings.awsSdk.awsSdkStrings.`payment-failed`
    - typings.awsSdk.awsSdkStrings.active__
    - typings.awsSdk.awsSdkStrings.retired
    - java.lang.String
  */
  type ReservationState = typings.awsSdk.ec2Mod._ReservationState | java.lang.String
  type ReservedInstanceIdSet = js.Array[typings.awsSdk.ec2Mod.ReservationId]
  type ReservedInstanceReservationValueSet = js.Array[typings.awsSdk.ec2Mod.ReservedInstanceReservationValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`payment-pending`
    - typings.awsSdk.awsSdkStrings.active__
    - typings.awsSdk.awsSdkStrings.`payment-failed`
    - typings.awsSdk.awsSdkStrings.retired
    - typings.awsSdk.awsSdkStrings.queued__
    - typings.awsSdk.awsSdkStrings.`queued-deleted`
    - java.lang.String
  */
  type ReservedInstanceState = typings.awsSdk.ec2Mod._ReservedInstanceState | java.lang.String
  type ReservedInstancesConfigurationList = js.Array[typings.awsSdk.ec2Mod.ReservedInstancesConfiguration]
  type ReservedInstancesIdStringList = js.Array[typings.awsSdk.ec2Mod.ReservationId]
  type ReservedInstancesList = js.Array[typings.awsSdk.ec2Mod.ReservedInstances]
  type ReservedInstancesListingId = java.lang.String
  type ReservedInstancesListingList = js.Array[typings.awsSdk.ec2Mod.ReservedInstancesListing]
  type ReservedInstancesModificationId = java.lang.String
  type ReservedInstancesModificationIdStringList = js.Array[typings.awsSdk.ec2Mod.ReservedInstancesModificationId]
  type ReservedInstancesModificationList = js.Array[typings.awsSdk.ec2Mod.ReservedInstancesModification]
  type ReservedInstancesModificationResultList = js.Array[typings.awsSdk.ec2Mod.ReservedInstancesModificationResult]
  type ReservedInstancesOfferingId = java.lang.String
  type ReservedInstancesOfferingIdStringList = js.Array[typings.awsSdk.ec2Mod.ReservedInstancesOfferingId]
  type ReservedInstancesOfferingList = js.Array[typings.awsSdk.ec2Mod.ReservedInstancesOffering]
  type ReservedIntancesIds = js.Array[typings.awsSdk.ec2Mod.ReservedInstancesId]
  type ResetFpgaImageAttributeName = typings.awsSdk.awsSdkStrings.loadPermission | java.lang.String
  type ResetImageAttributeName = typings.awsSdk.awsSdkStrings.launchPermission | java.lang.String
  type ResourceArn = java.lang.String
  type ResourceIdList = js.Array[typings.awsSdk.ec2Mod.TaggableResourceId]
  type ResourceList = js.Array[typings.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`client-vpn-endpoint`
    - typings.awsSdk.awsSdkStrings.`customer-gateway`
    - typings.awsSdk.awsSdkStrings.`dedicated-host`
    - typings.awsSdk.awsSdkStrings.`dhcp-options`
    - typings.awsSdk.awsSdkStrings.`elastic-ip`
    - typings.awsSdk.awsSdkStrings.`elastic-gpu`
    - typings.awsSdk.awsSdkStrings.`export-image-task`
    - typings.awsSdk.awsSdkStrings.`export-instance-task`
    - typings.awsSdk.awsSdkStrings.fleet
    - typings.awsSdk.awsSdkStrings.`fpga-image`
    - typings.awsSdk.awsSdkStrings.`host-reservation`
    - typings.awsSdk.awsSdkStrings.image
    - typings.awsSdk.awsSdkStrings.`import-image-task`
    - typings.awsSdk.awsSdkStrings.`import-snapshot-task`
    - typings.awsSdk.awsSdkStrings.instance__
    - typings.awsSdk.awsSdkStrings.`internet-gateway`
    - typings.awsSdk.awsSdkStrings.`key-pair`
    - typings.awsSdk.awsSdkStrings.`launch-template`
    - typings.awsSdk.awsSdkStrings.`local-gateway-route-table-vpc-association`
    - typings.awsSdk.awsSdkStrings.natgateway_
    - typings.awsSdk.awsSdkStrings.`network-acl`
    - typings.awsSdk.awsSdkStrings.`network-interface`
    - typings.awsSdk.awsSdkStrings.`placement-group`
    - typings.awsSdk.awsSdkStrings.`reserved-instances`
    - typings.awsSdk.awsSdkStrings.`route-table`
    - typings.awsSdk.awsSdkStrings.`security-group`
    - typings.awsSdk.awsSdkStrings.snapshot_
    - typings.awsSdk.awsSdkStrings.`spot-fleet-request`
    - typings.awsSdk.awsSdkStrings.`spot-instances-request`
    - typings.awsSdk.awsSdkStrings.subnet_
    - typings.awsSdk.awsSdkStrings.`traffic-mirror-filter`
    - typings.awsSdk.awsSdkStrings.`traffic-mirror-session`
    - typings.awsSdk.awsSdkStrings.`traffic-mirror-target`
    - typings.awsSdk.awsSdkStrings.`transit-gateway`
    - typings.awsSdk.awsSdkStrings.`transit-gateway-attachment`
    - typings.awsSdk.awsSdkStrings.`transit-gateway-multicast-domain`
    - typings.awsSdk.awsSdkStrings.`transit-gateway-route-table`
    - typings.awsSdk.awsSdkStrings.volume_
    - typings.awsSdk.awsSdkStrings.vpc_
    - typings.awsSdk.awsSdkStrings.`vpc-peering-connection`
    - typings.awsSdk.awsSdkStrings.`vpn-connection`
    - typings.awsSdk.awsSdkStrings.`vpn-gateway`
    - typings.awsSdk.awsSdkStrings.`vpc-flow-log`
    - java.lang.String
  */
  type ResourceType = typings.awsSdk.ec2Mod._ResourceType | java.lang.String
  type ResponseHostIdList = js.Array[typings.awsSdk.ec2Mod.String]
  type ResponseHostIdSet = js.Array[typings.awsSdk.ec2Mod.String]
  type RestorableByStringList = js.Array[typings.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ebs_
    - typings.awsSdk.awsSdkStrings.`instance-store`
    - java.lang.String
  */
  type RootDeviceType = typings.awsSdk.ec2Mod._RootDeviceType | java.lang.String
  type RootDeviceTypeList = js.Array[typings.awsSdk.ec2Mod.RootDeviceType]
  type RouteGatewayId = java.lang.String
  type RouteList = js.Array[typings.awsSdk.ec2Mod.Route]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CreateRouteTable
    - typings.awsSdk.awsSdkStrings.CreateRoute
    - typings.awsSdk.awsSdkStrings.EnableVgwRoutePropagation
    - java.lang.String
  */
  type RouteOrigin = typings.awsSdk.ec2Mod._RouteOrigin | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.active__
    - typings.awsSdk.awsSdkStrings.blackhole
    - java.lang.String
  */
  type RouteState = typings.awsSdk.ec2Mod._RouteState | java.lang.String
  type RouteTableAssociationId = java.lang.String
  type RouteTableAssociationList = js.Array[typings.awsSdk.ec2Mod.RouteTableAssociation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.associating__
    - typings.awsSdk.awsSdkStrings.associated__
    - typings.awsSdk.awsSdkStrings.disassociating__
    - typings.awsSdk.awsSdkStrings.disassociated_
    - typings.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type RouteTableAssociationStateCode = typings.awsSdk.ec2Mod._RouteTableAssociationStateCode | java.lang.String
  type RouteTableId = java.lang.String
  type RouteTableIdStringList = js.Array[typings.awsSdk.ec2Mod.RouteTableId]
  type RouteTableList = js.Array[typings.awsSdk.ec2Mod.RouteTable]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.allow__
    - typings.awsSdk.awsSdkStrings.deny__
    - java.lang.String
  */
  type RuleAction = typings.awsSdk.ec2Mod._RuleAction | java.lang.String
  type ScheduledInstanceAvailabilitySet = js.Array[typings.awsSdk.ec2Mod.ScheduledInstanceAvailability]
  type ScheduledInstanceId = java.lang.String
  type ScheduledInstanceIdRequestSet = js.Array[typings.awsSdk.ec2Mod.ScheduledInstanceId]
  type ScheduledInstanceSet = js.Array[typings.awsSdk.ec2Mod.ScheduledInstance]
  type ScheduledInstancesBlockDeviceMappingSet = js.Array[typings.awsSdk.ec2Mod.ScheduledInstancesBlockDeviceMapping]
  type ScheduledInstancesIpv6AddressList = js.Array[typings.awsSdk.ec2Mod.ScheduledInstancesIpv6Address]
  type ScheduledInstancesNetworkInterfaceSet = js.Array[typings.awsSdk.ec2Mod.ScheduledInstancesNetworkInterface]
  type ScheduledInstancesSecurityGroupIdSet = js.Array[typings.awsSdk.ec2Mod.SecurityGroupId]
  type SecurityGroupId = java.lang.String
  type SecurityGroupIdStringList = js.Array[typings.awsSdk.ec2Mod.SecurityGroupId]
  type SecurityGroupList = js.Array[typings.awsSdk.ec2Mod.SecurityGroup]
  type SecurityGroupName = java.lang.String
  type SecurityGroupReferences = js.Array[typings.awsSdk.ec2Mod.SecurityGroupReference]
  type SecurityGroupStringList = js.Array[typings.awsSdk.ec2Mod.SecurityGroupName]
  type SensitiveUserData = java.lang.String
  type ServiceConfigurationSet = js.Array[typings.awsSdk.ec2Mod.ServiceConfiguration]
  type ServiceDetailSet = js.Array[typings.awsSdk.ec2Mod.ServiceDetail]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.Available_
    - typings.awsSdk.awsSdkStrings.Deleting_
    - typings.awsSdk.awsSdkStrings.Deleted_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type ServiceState = typings.awsSdk.ec2Mod._ServiceState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Interface
    - typings.awsSdk.awsSdkStrings.Gateway
    - java.lang.String
  */
  type ServiceType = typings.awsSdk.ec2Mod._ServiceType | java.lang.String
  type ServiceTypeDetailSet = js.Array[typings.awsSdk.ec2Mod.ServiceTypeDetail]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.stop
    - typings.awsSdk.awsSdkStrings.terminate_
    - java.lang.String
  */
  type ShutdownBehavior = typings.awsSdk.ec2Mod._ShutdownBehavior | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.productCodes
    - typings.awsSdk.awsSdkStrings.createVolumePermission
    - java.lang.String
  */
  type SnapshotAttributeName = typings.awsSdk.ec2Mod._SnapshotAttributeName | java.lang.String
  type SnapshotDetailList = js.Array[typings.awsSdk.ec2Mod.SnapshotDetail]
  type SnapshotId = java.lang.String
  type SnapshotIdStringList = js.Array[typings.awsSdk.ec2Mod.SnapshotId]
  type SnapshotList = js.Array[typings.awsSdk.ec2Mod.Snapshot]
  type SnapshotSet = js.Array[typings.awsSdk.ec2Mod.SnapshotInfo]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.completed__
    - typings.awsSdk.awsSdkStrings.error__
    - java.lang.String
  */
  type SnapshotState = typings.awsSdk.ec2Mod._SnapshotState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`lowest-price`
    - typings.awsSdk.awsSdkStrings.diversified
    - typings.awsSdk.awsSdkStrings.`capacity-optimized`
    - java.lang.String
  */
  type SpotAllocationStrategy = typings.awsSdk.ec2Mod._SpotAllocationStrategy | java.lang.String
  type SpotFleetRequestConfigSet = js.Array[typings.awsSdk.ec2Mod.SpotFleetRequestConfig]
  type SpotFleetRequestId = java.lang.String
  type SpotFleetRequestIdList = js.Array[typings.awsSdk.ec2Mod.SpotFleetRequestId]
  type SpotFleetTagSpecificationList = js.Array[typings.awsSdk.ec2Mod.SpotFleetTagSpecification]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.hibernate
    - typings.awsSdk.awsSdkStrings.stop
    - typings.awsSdk.awsSdkStrings.terminate_
    - java.lang.String
  */
  type SpotInstanceInterruptionBehavior = typings.awsSdk.ec2Mod._SpotInstanceInterruptionBehavior | java.lang.String
  type SpotInstanceRequestId = java.lang.String
  type SpotInstanceRequestIdList = js.Array[typings.awsSdk.ec2Mod.SpotInstanceRequestId]
  type SpotInstanceRequestList = js.Array[typings.awsSdk.ec2Mod.SpotInstanceRequest]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.open__
    - typings.awsSdk.awsSdkStrings.active__
    - typings.awsSdk.awsSdkStrings.closed__
    - typings.awsSdk.awsSdkStrings.cancelled__
    - typings.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type SpotInstanceState = typings.awsSdk.ec2Mod._SpotInstanceState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`one-time`
    - typings.awsSdk.awsSdkStrings.persistent
    - java.lang.String
  */
  type SpotInstanceType = typings.awsSdk.ec2Mod._SpotInstanceType | java.lang.String
  type SpotPriceHistoryList = js.Array[typings.awsSdk.ec2Mod.SpotPrice]
  type StaleIpPermissionSet = js.Array[typings.awsSdk.ec2Mod.StaleIpPermission]
  type StaleSecurityGroupSet = js.Array[typings.awsSdk.ec2Mod.StaleSecurityGroup]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PendingAcceptance
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.Available_
    - typings.awsSdk.awsSdkStrings.Deleting_
    - typings.awsSdk.awsSdkStrings.Deleted_
    - typings.awsSdk.awsSdkStrings.Rejected_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Expired_
    - java.lang.String
  */
  type State = typings.awsSdk.ec2Mod._State | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MoveInProgress
    - typings.awsSdk.awsSdkStrings.InVpc
    - typings.awsSdk.awsSdkStrings.InClassic
    - java.lang.String
  */
  type Status = typings.awsSdk.ec2Mod._Status | java.lang.String
  type StatusName = typings.awsSdk.awsSdkStrings.reachability | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.passed_
    - typings.awsSdk.awsSdkStrings.failed__
    - typings.awsSdk.awsSdkStrings.`insufficient-data`
    - typings.awsSdk.awsSdkStrings.initializing__
    - java.lang.String
  */
  type StatusType = typings.awsSdk.ec2Mod._StatusType | java.lang.String
  type String = java.lang.String
  type SubnetAssociationList = js.Array[typings.awsSdk.ec2Mod.SubnetAssociation]
  type SubnetCidrAssociationId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.associating__
    - typings.awsSdk.awsSdkStrings.associated__
    - typings.awsSdk.awsSdkStrings.disassociating__
    - typings.awsSdk.awsSdkStrings.disassociated_
    - typings.awsSdk.awsSdkStrings.failing__
    - typings.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type SubnetCidrBlockStateCode = typings.awsSdk.ec2Mod._SubnetCidrBlockStateCode | java.lang.String
  type SubnetId = java.lang.String
  type SubnetIdStringList = js.Array[typings.awsSdk.ec2Mod.SubnetId]
  type SubnetIpv6CidrBlockAssociationSet = js.Array[typings.awsSdk.ec2Mod.SubnetIpv6CidrBlockAssociation]
  type SubnetList = js.Array[typings.awsSdk.ec2Mod.Subnet]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.available__
    - java.lang.String
  */
  type SubnetState = typings.awsSdk.ec2Mod._SubnetState | java.lang.String
  type SuccessfulInstanceCreditSpecificationSet = js.Array[typings.awsSdk.ec2Mod.SuccessfulInstanceCreditSpecificationItem]
  type SuccessfulQueuedPurchaseDeletionSet = js.Array[typings.awsSdk.ec2Mod.SuccessfulQueuedPurchaseDeletion]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ok__
    - typings.awsSdk.awsSdkStrings.impaired__
    - typings.awsSdk.awsSdkStrings.`insufficient-data`
    - typings.awsSdk.awsSdkStrings.`not-applicable`
    - typings.awsSdk.awsSdkStrings.initializing__
    - java.lang.String
  */
  type SummaryStatus = typings.awsSdk.ec2Mod._SummaryStatus | java.lang.String
  type TagDescriptionList = js.Array[typings.awsSdk.ec2Mod.TagDescription]
  type TagList = js.Array[typings.awsSdk.ec2Mod.Tag]
  type TagSpecificationList = js.Array[typings.awsSdk.ec2Mod.TagSpecification]
  type TaggableResourceId = java.lang.String
  type TargetConfigurationRequestSet = js.Array[typings.awsSdk.ec2Mod.TargetConfigurationRequest]
  type TargetGroups = js.Array[typings.awsSdk.ec2Mod.TargetGroup]
  type TargetNetworkSet = js.Array[typings.awsSdk.ec2Mod.TargetNetwork]
  type TargetReservationValueSet = js.Array[typings.awsSdk.ec2Mod.TargetReservationValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.UP
    - typings.awsSdk.awsSdkStrings.DOWN
    - java.lang.String
  */
  type TelemetryStatus = typings.awsSdk.ec2Mod._TelemetryStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.default__
    - typings.awsSdk.awsSdkStrings.dedicated_
    - typings.awsSdk.awsSdkStrings.host_
    - java.lang.String
  */
  type Tenancy = typings.awsSdk.ec2Mod._Tenancy | java.lang.String
  type TerminateConnectionStatusSet = js.Array[typings.awsSdk.ec2Mod.TerminateConnectionStatus]
  type ThreadsPerCore = scala.Double
  type ThreadsPerCoreList = js.Array[typings.awsSdk.ec2Mod.ThreadsPerCore]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ingress
    - typings.awsSdk.awsSdkStrings.egress
    - java.lang.String
  */
  type TrafficDirection = typings.awsSdk.ec2Mod._TrafficDirection | java.lang.String
  type TrafficMirrorFilterId = java.lang.String
  type TrafficMirrorFilterIdList = js.Array[typings.awsSdk.ec2Mod.TrafficMirrorFilterId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`destination-port-range`
    - typings.awsSdk.awsSdkStrings.`source-port-range`
    - typings.awsSdk.awsSdkStrings.protocol
    - typings.awsSdk.awsSdkStrings.description
    - java.lang.String
  */
  type TrafficMirrorFilterRuleField = typings.awsSdk.ec2Mod._TrafficMirrorFilterRuleField | java.lang.String
  type TrafficMirrorFilterRuleFieldList = js.Array[typings.awsSdk.ec2Mod.TrafficMirrorFilterRuleField]
  type TrafficMirrorFilterRuleId = java.lang.String
  type TrafficMirrorFilterRuleList = js.Array[typings.awsSdk.ec2Mod.TrafficMirrorFilterRule]
  type TrafficMirrorFilterSet = js.Array[typings.awsSdk.ec2Mod.TrafficMirrorFilter]
  type TrafficMirrorNetworkService = typings.awsSdk.awsSdkStrings.`amazon-dns` | java.lang.String
  type TrafficMirrorNetworkServiceList = js.Array[typings.awsSdk.ec2Mod.TrafficMirrorNetworkService]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.accept__
    - typings.awsSdk.awsSdkStrings.reject__
    - java.lang.String
  */
  type TrafficMirrorRuleAction = typings.awsSdk.ec2Mod._TrafficMirrorRuleAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`packet-length`
    - typings.awsSdk.awsSdkStrings.description
    - typings.awsSdk.awsSdkStrings.`virtual-network-id`
    - java.lang.String
  */
  type TrafficMirrorSessionField = typings.awsSdk.ec2Mod._TrafficMirrorSessionField | java.lang.String
  type TrafficMirrorSessionFieldList = js.Array[typings.awsSdk.ec2Mod.TrafficMirrorSessionField]
  type TrafficMirrorSessionId = java.lang.String
  type TrafficMirrorSessionIdList = js.Array[typings.awsSdk.ec2Mod.TrafficMirrorSessionId]
  type TrafficMirrorSessionSet = js.Array[typings.awsSdk.ec2Mod.TrafficMirrorSession]
  type TrafficMirrorTargetId = java.lang.String
  type TrafficMirrorTargetIdList = js.Array[typings.awsSdk.ec2Mod.TrafficMirrorTargetId]
  type TrafficMirrorTargetSet = js.Array[typings.awsSdk.ec2Mod.TrafficMirrorTarget]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`network-interface`
    - typings.awsSdk.awsSdkStrings.`network-load-balancer`
    - java.lang.String
  */
  type TrafficMirrorTargetType = typings.awsSdk.ec2Mod._TrafficMirrorTargetType | java.lang.String
  type TrafficMirroringMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACCEPT
    - typings.awsSdk.awsSdkStrings.REJECT
    - typings.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type TrafficType = typings.awsSdk.ec2Mod._TrafficType | java.lang.String
  type TransitAssociationGatewayId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.associating__
    - typings.awsSdk.awsSdkStrings.associated__
    - typings.awsSdk.awsSdkStrings.disassociating__
    - typings.awsSdk.awsSdkStrings.disassociated_
    - java.lang.String
  */
  type TransitGatewayAssociationState = typings.awsSdk.ec2Mod._TransitGatewayAssociationState | java.lang.String
  type TransitGatewayAttachmentId = java.lang.String
  type TransitGatewayAttachmentIdStringList = js.Array[typings.awsSdk.ec2Mod.TransitGatewayAttachmentId]
  type TransitGatewayAttachmentList = js.Array[typings.awsSdk.ec2Mod.TransitGatewayAttachment]
  type TransitGatewayAttachmentPropagationList = js.Array[typings.awsSdk.ec2Mod.TransitGatewayAttachmentPropagation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.vpc_
    - typings.awsSdk.awsSdkStrings.vpn
    - typings.awsSdk.awsSdkStrings.`direct-connect-gateway`
    - typings.awsSdk.awsSdkStrings.`tgw-peering`
    - java.lang.String
  */
  type TransitGatewayAttachmentResourceType = typings.awsSdk.ec2Mod._TransitGatewayAttachmentResourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.initiating
    - typings.awsSdk.awsSdkStrings.pendingAcceptance_
    - typings.awsSdk.awsSdkStrings.rollingBack_
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.modifying_
    - typings.awsSdk.awsSdkStrings.deleting__
    - typings.awsSdk.awsSdkStrings.deleted__
    - typings.awsSdk.awsSdkStrings.failed__
    - typings.awsSdk.awsSdkStrings.rejected__
    - typings.awsSdk.awsSdkStrings.rejecting__
    - typings.awsSdk.awsSdkStrings.failing__
    - java.lang.String
  */
  type TransitGatewayAttachmentState = typings.awsSdk.ec2Mod._TransitGatewayAttachmentState | java.lang.String
  type TransitGatewayId = java.lang.String
  type TransitGatewayIdStringList = js.Array[typings.awsSdk.ec2Mod.TransitGatewayId]
  type TransitGatewayList = js.Array[typings.awsSdk.ec2Mod.TransitGateway]
  type TransitGatewayMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.associating__
    - typings.awsSdk.awsSdkStrings.associated__
    - typings.awsSdk.awsSdkStrings.disassociating__
    - typings.awsSdk.awsSdkStrings.disassociated_
    - java.lang.String
  */
  type TransitGatewayMulitcastDomainAssociationState = typings.awsSdk.ec2Mod._TransitGatewayMulitcastDomainAssociationState | java.lang.String
  type TransitGatewayMulticastDomainAssociationList = js.Array[typings.awsSdk.ec2Mod.TransitGatewayMulticastDomainAssociation]
  type TransitGatewayMulticastDomainId = java.lang.String
  type TransitGatewayMulticastDomainIdStringList = js.Array[typings.awsSdk.ec2Mod.TransitGatewayMulticastDomainId]
  type TransitGatewayMulticastDomainList = js.Array[typings.awsSdk.ec2Mod.TransitGatewayMulticastDomain]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.deleting__
    - typings.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type TransitGatewayMulticastDomainState = typings.awsSdk.ec2Mod._TransitGatewayMulticastDomainState | java.lang.String
  type TransitGatewayMulticastGroupList = js.Array[typings.awsSdk.ec2Mod.TransitGatewayMulticastGroup]
  type TransitGatewayNetworkInterfaceIdList = js.Array[typings.awsSdk.ec2Mod.NetworkInterfaceId]
  type TransitGatewayPeeringAttachmentList = js.Array[typings.awsSdk.ec2Mod.TransitGatewayPeeringAttachment]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.enabling__
    - typings.awsSdk.awsSdkStrings.enabled__
    - typings.awsSdk.awsSdkStrings.disabling_
    - typings.awsSdk.awsSdkStrings.disabled__
    - java.lang.String
  */
  type TransitGatewayPropagationState = typings.awsSdk.ec2Mod._TransitGatewayPropagationState | java.lang.String
  type TransitGatewayRouteAttachmentList = js.Array[typings.awsSdk.ec2Mod.TransitGatewayRouteAttachment]
  type TransitGatewayRouteList = js.Array[typings.awsSdk.ec2Mod.TransitGatewayRoute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.active__
    - typings.awsSdk.awsSdkStrings.blackhole
    - typings.awsSdk.awsSdkStrings.deleting__
    - typings.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type TransitGatewayRouteState = typings.awsSdk.ec2Mod._TransitGatewayRouteState | java.lang.String
  type TransitGatewayRouteTableAssociationList = js.Array[typings.awsSdk.ec2Mod.TransitGatewayRouteTableAssociation]
  type TransitGatewayRouteTableId = java.lang.String
  type TransitGatewayRouteTableIdStringList = js.Array[typings.awsSdk.ec2Mod.TransitGatewayRouteTableId]
  type TransitGatewayRouteTableList = js.Array[typings.awsSdk.ec2Mod.TransitGatewayRouteTable]
  type TransitGatewayRouteTablePropagationList = js.Array[typings.awsSdk.ec2Mod.TransitGatewayRouteTablePropagation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.deleting__
    - typings.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type TransitGatewayRouteTableState = typings.awsSdk.ec2Mod._TransitGatewayRouteTableState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.static__
    - typings.awsSdk.awsSdkStrings.propagated
    - java.lang.String
  */
  type TransitGatewayRouteType = typings.awsSdk.ec2Mod._TransitGatewayRouteType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.modifying_
    - typings.awsSdk.awsSdkStrings.deleting__
    - typings.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type TransitGatewayState = typings.awsSdk.ec2Mod._TransitGatewayState | java.lang.String
  type TransitGatewaySubnetIdList = js.Array[typings.awsSdk.ec2Mod.SubnetId]
  type TransitGatewayVpcAttachmentList = js.Array[typings.awsSdk.ec2Mod.TransitGatewayVpcAttachment]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.tcp_
    - typings.awsSdk.awsSdkStrings.udp_
    - java.lang.String
  */
  type TransportProtocol = typings.awsSdk.ec2Mod._TransportProtocol | java.lang.String
  type TunnelOptionsList = js.Array[typings.awsSdk.ec2Mod.TunnelOption]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.t2
    - typings.awsSdk.awsSdkStrings.t3
    - typings.awsSdk.awsSdkStrings.t3a
    - java.lang.String
  */
  type UnlimitedSupportedInstanceFamily = typings.awsSdk.ec2Mod._UnlimitedSupportedInstanceFamily | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InvalidInstanceIDDotMalformed
    - typings.awsSdk.awsSdkStrings.InvalidInstanceIDDotNotFound
    - typings.awsSdk.awsSdkStrings.IncorrectInstanceState
    - typings.awsSdk.awsSdkStrings.InstanceCreditSpecificationDotNotSupported
    - java.lang.String
  */
  type UnsuccessfulInstanceCreditSpecificationErrorCode = typings.awsSdk.ec2Mod._UnsuccessfulInstanceCreditSpecificationErrorCode | java.lang.String
  type UnsuccessfulInstanceCreditSpecificationSet = js.Array[typings.awsSdk.ec2Mod.UnsuccessfulInstanceCreditSpecificationItem]
  type UnsuccessfulItemList = js.Array[typings.awsSdk.ec2Mod.UnsuccessfulItem]
  type UnsuccessfulItemSet = js.Array[typings.awsSdk.ec2Mod.UnsuccessfulItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.spot_
    - typings.awsSdk.awsSdkStrings.`on-demand`
    - java.lang.String
  */
  type UsageClassType = typings.awsSdk.ec2Mod._UsageClassType | java.lang.String
  type UsageClassTypeList = js.Array[typings.awsSdk.ec2Mod.UsageClassType]
  type UserGroupStringList = js.Array[typings.awsSdk.ec2Mod.String]
  type UserIdGroupPairList = js.Array[typings.awsSdk.ec2Mod.UserIdGroupPair]
  type UserIdGroupPairSet = js.Array[typings.awsSdk.ec2Mod.UserIdGroupPair]
  type UserIdStringList = js.Array[typings.awsSdk.ec2Mod.String]
  type VCpuCount = scala.Double
  type ValueStringList = js.Array[typings.awsSdk.ec2Mod.String]
  type VersionDescription = java.lang.String
  type VersionStringList = js.Array[typings.awsSdk.ec2Mod.String]
  type VgwTelemetryList = js.Array[typings.awsSdk.ec2Mod.VgwTelemetry]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.hvm
    - typings.awsSdk.awsSdkStrings.paravirtual
    - java.lang.String
  */
  type VirtualizationType = typings.awsSdk.ec2Mod._VirtualizationType | java.lang.String
  type VirtualizationTypeList = js.Array[typings.awsSdk.ec2Mod.VirtualizationType]
  type VolumeAttachmentList = js.Array[typings.awsSdk.ec2Mod.VolumeAttachment]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.attaching_
    - typings.awsSdk.awsSdkStrings.attached_
    - typings.awsSdk.awsSdkStrings.detaching__
    - typings.awsSdk.awsSdkStrings.detached__
    - typings.awsSdk.awsSdkStrings.busy_
    - java.lang.String
  */
  type VolumeAttachmentState = typings.awsSdk.ec2Mod._VolumeAttachmentState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.autoEnableIO
    - typings.awsSdk.awsSdkStrings.productCodes
    - java.lang.String
  */
  type VolumeAttributeName = typings.awsSdk.ec2Mod._VolumeAttributeName | java.lang.String
  type VolumeId = java.lang.String
  type VolumeIdStringList = js.Array[typings.awsSdk.ec2Mod.VolumeId]
  type VolumeList = js.Array[typings.awsSdk.ec2Mod.Volume]
  type VolumeModificationList = js.Array[typings.awsSdk.ec2Mod.VolumeModification]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.modifying_
    - typings.awsSdk.awsSdkStrings.optimizing
    - typings.awsSdk.awsSdkStrings.completed__
    - typings.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type VolumeModificationState = typings.awsSdk.ec2Mod._VolumeModificationState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.creating__
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.`in-use`
    - typings.awsSdk.awsSdkStrings.deleting__
    - typings.awsSdk.awsSdkStrings.deleted__
    - typings.awsSdk.awsSdkStrings.error__
    - java.lang.String
  */
  type VolumeState = typings.awsSdk.ec2Mod._VolumeState | java.lang.String
  type VolumeStatusActionsList = js.Array[typings.awsSdk.ec2Mod.VolumeStatusAction]
  type VolumeStatusAttachmentStatusList = js.Array[typings.awsSdk.ec2Mod.VolumeStatusAttachmentStatus]
  type VolumeStatusDetailsList = js.Array[typings.awsSdk.ec2Mod.VolumeStatusDetails]
  type VolumeStatusEventsList = js.Array[typings.awsSdk.ec2Mod.VolumeStatusEvent]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ok__
    - typings.awsSdk.awsSdkStrings.impaired__
    - typings.awsSdk.awsSdkStrings.`insufficient-data`
    - java.lang.String
  */
  type VolumeStatusInfoStatus = typings.awsSdk.ec2Mod._VolumeStatusInfoStatus | java.lang.String
  type VolumeStatusList = js.Array[typings.awsSdk.ec2Mod.VolumeStatusItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`io-enabled`
    - typings.awsSdk.awsSdkStrings.`io-performance`
    - java.lang.String
  */
  type VolumeStatusName = typings.awsSdk.ec2Mod._VolumeStatusName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.standard__
    - typings.awsSdk.awsSdkStrings.io1
    - typings.awsSdk.awsSdkStrings.gp2
    - typings.awsSdk.awsSdkStrings.sc1
    - typings.awsSdk.awsSdkStrings.st1
    - java.lang.String
  */
  type VolumeType = typings.awsSdk.ec2Mod._VolumeType | java.lang.String
  type VpcAttachmentList = js.Array[typings.awsSdk.ec2Mod.VpcAttachment]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.enableDnsSupport
    - typings.awsSdk.awsSdkStrings.enableDnsHostnames
    - java.lang.String
  */
  type VpcAttributeName = typings.awsSdk.ec2Mod._VpcAttributeName | java.lang.String
  type VpcCidrAssociationId = java.lang.String
  type VpcCidrBlockAssociationSet = js.Array[typings.awsSdk.ec2Mod.VpcCidrBlockAssociation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.associating__
    - typings.awsSdk.awsSdkStrings.associated__
    - typings.awsSdk.awsSdkStrings.disassociating__
    - typings.awsSdk.awsSdkStrings.disassociated_
    - typings.awsSdk.awsSdkStrings.failing__
    - typings.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type VpcCidrBlockStateCode = typings.awsSdk.ec2Mod._VpcCidrBlockStateCode | java.lang.String
  type VpcClassicLinkIdList = js.Array[typings.awsSdk.ec2Mod.VpcId]
  type VpcClassicLinkList = js.Array[typings.awsSdk.ec2Mod.VpcClassicLink]
  type VpcEndpointConnectionSet = js.Array[typings.awsSdk.ec2Mod.VpcEndpointConnection]
  type VpcEndpointId = java.lang.String
  type VpcEndpointIdList = js.Array[typings.awsSdk.ec2Mod.VpcEndpointId]
  type VpcEndpointRouteTableIdList = js.Array[typings.awsSdk.ec2Mod.RouteTableId]
  type VpcEndpointSecurityGroupIdList = js.Array[typings.awsSdk.ec2Mod.SecurityGroupId]
  type VpcEndpointServiceId = java.lang.String
  type VpcEndpointServiceIdList = js.Array[typings.awsSdk.ec2Mod.VpcEndpointServiceId]
  type VpcEndpointSet = js.Array[typings.awsSdk.ec2Mod.VpcEndpoint]
  type VpcEndpointSubnetIdList = js.Array[typings.awsSdk.ec2Mod.SubnetId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Interface
    - typings.awsSdk.awsSdkStrings.Gateway
    - java.lang.String
  */
  type VpcEndpointType = typings.awsSdk.ec2Mod._VpcEndpointType | java.lang.String
  type VpcFlowLogId = java.lang.String
  type VpcId = java.lang.String
  type VpcIdStringList = js.Array[typings.awsSdk.ec2Mod.VpcId]
  type VpcIpv6CidrBlockAssociationSet = js.Array[typings.awsSdk.ec2Mod.VpcIpv6CidrBlockAssociation]
  type VpcList = js.Array[typings.awsSdk.ec2Mod.Vpc]
  type VpcPeeringConnectionId = java.lang.String
  type VpcPeeringConnectionIdList = js.Array[typings.awsSdk.ec2Mod.VpcPeeringConnectionId]
  type VpcPeeringConnectionList = js.Array[typings.awsSdk.ec2Mod.VpcPeeringConnection]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`initiating-request`
    - typings.awsSdk.awsSdkStrings.`pending-acceptance`
    - typings.awsSdk.awsSdkStrings.active__
    - typings.awsSdk.awsSdkStrings.deleted__
    - typings.awsSdk.awsSdkStrings.rejected__
    - typings.awsSdk.awsSdkStrings.failed__
    - typings.awsSdk.awsSdkStrings.expired__
    - typings.awsSdk.awsSdkStrings.provisioning_
    - typings.awsSdk.awsSdkStrings.deleting__
    - java.lang.String
  */
  type VpcPeeringConnectionStateReasonCode = typings.awsSdk.ec2Mod._VpcPeeringConnectionStateReasonCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.available__
    - java.lang.String
  */
  type VpcState = typings.awsSdk.ec2Mod._VpcState | java.lang.String
  type VpcTenancy = typings.awsSdk.awsSdkStrings.default__ | java.lang.String
  type VpnConnectionId = java.lang.String
  type VpnConnectionIdStringList = js.Array[typings.awsSdk.ec2Mod.VpnConnectionId]
  type VpnConnectionList = js.Array[typings.awsSdk.ec2Mod.VpnConnection]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.enable_
    - typings.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type VpnEcmpSupportValue = typings.awsSdk.ec2Mod._VpnEcmpSupportValue | java.lang.String
  type VpnGatewayId = java.lang.String
  type VpnGatewayIdStringList = js.Array[typings.awsSdk.ec2Mod.VpnGatewayId]
  type VpnGatewayList = js.Array[typings.awsSdk.ec2Mod.VpnGateway]
  type VpnProtocol = typings.awsSdk.awsSdkStrings.openvpn | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.deleting__
    - typings.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type VpnState = typings.awsSdk.ec2Mod._VpnState | java.lang.String
  type VpnStaticRouteList = js.Array[typings.awsSdk.ec2Mod.VpnStaticRoute]
  type VpnStaticRouteSource = typings.awsSdk.awsSdkStrings.Static_ | java.lang.String
  type VpnTunnelOptionsSpecificationsList = js.Array[typings.awsSdk.ec2Mod.VpnTunnelOptionsSpecification]
  type ZoneIdStringList = js.Array[typings.awsSdk.ec2Mod.String]
  type ZoneNameStringList = js.Array[typings.awsSdk.ec2Mod.String]
  type _Blob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.ec2Mod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2013-06-15`
    - typings.awsSdk.awsSdkStrings.`2013-10-15`
    - typings.awsSdk.awsSdkStrings.`2014-02-01`
    - typings.awsSdk.awsSdkStrings.`2014-05-01`
    - typings.awsSdk.awsSdkStrings.`2014-06-15`
    - typings.awsSdk.awsSdkStrings.`2014-09-01`
    - typings.awsSdk.awsSdkStrings.`2014-10-01`
    - typings.awsSdk.awsSdkStrings.`2015-03-01`
    - typings.awsSdk.awsSdkStrings.`2015-04-15`
    - typings.awsSdk.awsSdkStrings.`2015-10-01`
    - typings.awsSdk.awsSdkStrings.`2016-04-01`
    - typings.awsSdk.awsSdkStrings.`2016-09-15`
    - typings.awsSdk.awsSdkStrings.`2016-11-15`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.ec2Mod._apiVersion | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`Availability Zone`
    - typings.awsSdk.awsSdkStrings.Region_
    - java.lang.String
  */
  type scope = typings.awsSdk.ec2Mod._scope | java.lang.String
  type totalFpgaMemory = scala.Double
  type totalGpuMemory = scala.Double
}
