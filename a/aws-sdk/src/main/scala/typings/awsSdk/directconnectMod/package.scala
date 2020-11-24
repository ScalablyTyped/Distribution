package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object directconnectMod {
  
  type ASN = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ipv4_
    - typings.awsSdk.awsSdkStrings.ipv6_
    - java.lang.String
  */
  type AddressFamily = typings.awsSdk.directconnectMod._AddressFamily | java.lang.String
  
  type AmazonAddress = java.lang.String
  
  type AssociatedGatewayId = java.lang.String
  
  type AvailablePortSpeeds = js.Array[typings.awsSdk.directconnectMod.PortSpeed]
  
  type AwsDevice = java.lang.String
  
  type AwsDeviceV2 = java.lang.String
  
  type BGPAuthKey = java.lang.String
  
  type BGPPeerId = java.lang.String
  
  type BGPPeerIdList = js.Array[typings.awsSdk.directconnectMod.BGPPeerId]
  
  type BGPPeerList = js.Array[typings.awsSdk.directconnectMod.BGPPeer]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.verifying__
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.deleting__
    - typings.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type BGPPeerState = typings.awsSdk.directconnectMod._BGPPeerState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.up_
    - typings.awsSdk.awsSdkStrings.down_
    - typings.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type BGPStatus = typings.awsSdk.directconnectMod._BGPStatus | java.lang.String
  
  type Bandwidth = java.lang.String
  
  type BooleanFlag = scala.Boolean
  
  type CIDR = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.directconnectMod.ClientApiVersions
  
  type ConnectionId = java.lang.String
  
  type ConnectionList = js.Array[typings.awsSdk.directconnectMod.Connection]
  
  type ConnectionName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ordering
    - typings.awsSdk.awsSdkStrings.requested__
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.down_
    - typings.awsSdk.awsSdkStrings.deleting__
    - typings.awsSdk.awsSdkStrings.deleted__
    - typings.awsSdk.awsSdkStrings.rejected__
    - typings.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type ConnectionState = typings.awsSdk.directconnectMod._ConnectionState | java.lang.String
  
  type Count = scala.Double
  
  type CustomerAddress = java.lang.String
  
  type DirectConnectGatewayAssociationId = java.lang.String
  
  type DirectConnectGatewayAssociationList = js.Array[typings.awsSdk.directconnectMod.DirectConnectGatewayAssociation]
  
  type DirectConnectGatewayAssociationProposalId = java.lang.String
  
  type DirectConnectGatewayAssociationProposalList = js.Array[typings.awsSdk.directconnectMod.DirectConnectGatewayAssociationProposal]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.requested__
    - typings.awsSdk.awsSdkStrings.accepted__
    - typings.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type DirectConnectGatewayAssociationProposalState = typings.awsSdk.directconnectMod._DirectConnectGatewayAssociationProposalState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.associating__
    - typings.awsSdk.awsSdkStrings.associated__
    - typings.awsSdk.awsSdkStrings.disassociating__
    - typings.awsSdk.awsSdkStrings.disassociated__
    - typings.awsSdk.awsSdkStrings.updating__
    - java.lang.String
  */
  type DirectConnectGatewayAssociationState = typings.awsSdk.directconnectMod._DirectConnectGatewayAssociationState | java.lang.String
  
  type DirectConnectGatewayAttachmentList = js.Array[typings.awsSdk.directconnectMod.DirectConnectGatewayAttachment]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.attaching_
    - typings.awsSdk.awsSdkStrings.attached_
    - typings.awsSdk.awsSdkStrings.detaching__
    - typings.awsSdk.awsSdkStrings.detached__
    - java.lang.String
  */
  type DirectConnectGatewayAttachmentState = typings.awsSdk.directconnectMod._DirectConnectGatewayAttachmentState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TransitVirtualInterface
    - typings.awsSdk.awsSdkStrings.PrivateVirtualInterface
    - java.lang.String
  */
  type DirectConnectGatewayAttachmentType = typings.awsSdk.directconnectMod._DirectConnectGatewayAttachmentType | java.lang.String
  
  type DirectConnectGatewayId = java.lang.String
  
  type DirectConnectGatewayList = js.Array[typings.awsSdk.directconnectMod.DirectConnectGateway]
  
  type DirectConnectGatewayName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.deleting__
    - typings.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type DirectConnectGatewayState = typings.awsSdk.directconnectMod._DirectConnectGatewayState | java.lang.String
  
  type EndTime = typings.std.Date
  
  type FailureTestHistoryStatus = java.lang.String
  
  type GatewayIdToAssociate = java.lang.String
  
  type GatewayIdentifier = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.virtualPrivateGateway
    - typings.awsSdk.awsSdkStrings.transitGateway
    - java.lang.String
  */
  type GatewayType = typings.awsSdk.directconnectMod._GatewayType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.unknown__
    - typings.awsSdk.awsSdkStrings.yes_
    - typings.awsSdk.awsSdkStrings.no_
    - java.lang.String
  */
  type HasLogicalRedundancy = typings.awsSdk.directconnectMod._HasLogicalRedundancy | java.lang.String
  
  type InterconnectId = java.lang.String
  
  type InterconnectList = js.Array[typings.awsSdk.directconnectMod.Interconnect]
  
  type InterconnectName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.requested__
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.down_
    - typings.awsSdk.awsSdkStrings.deleting__
    - typings.awsSdk.awsSdkStrings.deleted__
    - typings.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type InterconnectState = typings.awsSdk.directconnectMod._InterconnectState | java.lang.String
  
  type JumboFrameCapable = scala.Boolean
  
  type LagId = java.lang.String
  
  type LagList = js.Array[typings.awsSdk.directconnectMod.Lag]
  
  type LagName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.requested__
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.down_
    - typings.awsSdk.awsSdkStrings.deleting__
    - typings.awsSdk.awsSdkStrings.deleted__
    - typings.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type LagState = typings.awsSdk.directconnectMod._LagState | java.lang.String
  
  type LoaContent = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.directconnectMod.Blob | java.lang.String
  
  type LoaContentType = typings.awsSdk.awsSdkStrings.applicationSlashpdf | java.lang.String
  
  type LoaIssueTime = typings.std.Date
  
  type LocationCode = java.lang.String
  
  type LocationList = js.Array[typings.awsSdk.directconnectMod.Location]
  
  type LocationName = java.lang.String
  
  type LongAsn = scala.Double
  
  type MTU = scala.Double
  
  type MaxResultSetSize = scala.Double
  
  type OwnerAccount = java.lang.String
  
  type PaginationToken = java.lang.String
  
  type PartnerName = java.lang.String
  
  type PortSpeed = java.lang.String
  
  type ProviderList = js.Array[typings.awsSdk.directconnectMod.ProviderName]
  
  type ProviderName = java.lang.String
  
  type Region = java.lang.String
  
  type ResourceArn = java.lang.String
  
  type ResourceArnList = js.Array[typings.awsSdk.directconnectMod.ResourceArn]
  
  type ResourceTagList = js.Array[typings.awsSdk.directconnectMod.ResourceTag]
  
  type RouteFilterPrefixList = js.Array[typings.awsSdk.directconnectMod.RouteFilterPrefix]
  
  type RouterConfig = java.lang.String
  
  type StartTime = typings.std.Date
  
  type StateChangeError = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.directconnectMod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.directconnectMod.Tag]
  
  type TagValue = java.lang.String
  
  type TestDuration = scala.Double
  
  type TestId = java.lang.String
  
  type VLAN = scala.Double
  
  type VirtualGatewayId = java.lang.String
  
  type VirtualGatewayList = js.Array[typings.awsSdk.directconnectMod.VirtualGateway]
  
  type VirtualGatewayRegion = java.lang.String
  
  type VirtualGatewayState = java.lang.String
  
  type VirtualInterfaceId = java.lang.String
  
  type VirtualInterfaceList = js.Array[typings.awsSdk.directconnectMod.VirtualInterface]
  
  type VirtualInterfaceName = java.lang.String
  
  type VirtualInterfaceRegion = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.confirming
    - typings.awsSdk.awsSdkStrings.verifying__
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.down_
    - typings.awsSdk.awsSdkStrings.deleting__
    - typings.awsSdk.awsSdkStrings.deleted__
    - typings.awsSdk.awsSdkStrings.rejected__
    - typings.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type VirtualInterfaceState = typings.awsSdk.directconnectMod._VirtualInterfaceState | java.lang.String
  
  type VirtualInterfaceTestHistoryList = js.Array[typings.awsSdk.directconnectMod.VirtualInterfaceTestHistory]
  
  type VirtualInterfaceType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2012-10-25`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.directconnectMod._apiVersion | java.lang.String
}
