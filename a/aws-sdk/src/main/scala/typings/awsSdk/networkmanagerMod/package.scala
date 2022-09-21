package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.GRE
import typings.awsSdk.awsSdkStrings.TRANSIT_GATEWAY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AWSAccountId = String

type AccountId = String

type AccountStatusList = js.Array[AccountStatus]

type Action = String

type AttachmentId = String

type AttachmentList = js.Array[Attachment]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REJECTED
  - typings.awsSdk.awsSdkStrings.PENDING_ATTACHMENT_ACCEPTANCE
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.PENDING_NETWORK_UPDATE
  - typings.awsSdk.awsSdkStrings.PENDING_TAG_ACCEPTANCE
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type AttachmentState = _AttachmentState | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONNECT
  - typings.awsSdk.awsSdkStrings.SITE_TO_SITE_VPN
  - typings.awsSdk.awsSdkStrings.VPC
  - typings.awsSdk.awsSdkStrings.TRANSIT_GATEWAY_ROUTE_TABLE
  - java.lang.String
*/
type AttachmentType = _AttachmentType | String

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ADD
  - typings.awsSdk.awsSdkStrings.MODIFY
  - typings.awsSdk.awsSdkStrings.REMOVE
  - java.lang.String
*/
type ChangeAction = _ChangeAction | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_GENERATION
  - typings.awsSdk.awsSdkStrings.FAILED_GENERATION
  - typings.awsSdk.awsSdkStrings.READY_TO_EXECUTE
  - typings.awsSdk.awsSdkStrings.EXECUTING
  - typings.awsSdk.awsSdkStrings.EXECUTION_SUCCEEDED
  - typings.awsSdk.awsSdkStrings.OUT_OF_DATE
  - java.lang.String
*/
type ChangeSetState = _ChangeSetState | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_STARTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETE
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ChangeStatus = _ChangeStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CORE_NETWORK_SEGMENT
  - typings.awsSdk.awsSdkStrings.CORE_NETWORK_EDGE
  - typings.awsSdk.awsSdkStrings.ATTACHMENT_MAPPING
  - typings.awsSdk.awsSdkStrings.ATTACHMENT_ROUTE_PROPAGATION
  - typings.awsSdk.awsSdkStrings.ATTACHMENT_ROUTE_STATIC
  - typings.awsSdk.awsSdkStrings.CORE_NETWORK_CONFIGURATION
  - typings.awsSdk.awsSdkStrings.SEGMENTS_CONFIGURATION
  - typings.awsSdk.awsSdkStrings.SEGMENT_ACTIONS_CONFIGURATION
  - typings.awsSdk.awsSdkStrings.ATTACHMENT_POLICIES_CONFIGURATION
  - java.lang.String
*/
type ChangeType = _ChangeType | String

type ClientToken = String

type ConnectPeerAssociationList = js.Array[ConnectPeerAssociation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type ConnectPeerAssociationState = _ConnectPeerAssociationState | String

type ConnectPeerBgpConfigurationList = js.Array[ConnectPeerBgpConfiguration]

type ConnectPeerId = String

type ConnectPeerIdList = js.Array[ConnectPeerId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type ConnectPeerState = _ConnectPeerState | String

type ConnectPeerSummaryList = js.Array[ConnectPeerSummary]

type ConnectionArn = String

type ConnectionId = String

type ConnectionIdList = js.Array[ConnectionId]

type ConnectionList = js.Array[Connection]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type ConnectionState = _ConnectionState | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UP
  - typings.awsSdk.awsSdkStrings.DOWN
  - java.lang.String
*/
type ConnectionStatus = _ConnectionStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BGP
  - typings.awsSdk.awsSdkStrings.IPSEC
  - java.lang.String
*/
type ConnectionType = _ConnectionType | String

type ConstrainedString = String

type ConstrainedStringList = js.Array[ConstrainedString]

type CoreNetworkArn = String

type CoreNetworkChangeEventList = js.Array[CoreNetworkChangeEvent]

type CoreNetworkChangeList = js.Array[CoreNetworkChange]

type CoreNetworkEdgeList = js.Array[CoreNetworkEdge]

type CoreNetworkId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LIVE
  - typings.awsSdk.awsSdkStrings.LATEST
  - java.lang.String
*/
type CoreNetworkPolicyAlias = _CoreNetworkPolicyAlias | String

type CoreNetworkPolicyDocument = String

type CoreNetworkPolicyErrorList = js.Array[CoreNetworkPolicyError]

type CoreNetworkPolicyVersionList = js.Array[CoreNetworkPolicyVersion]

type CoreNetworkSegmentList = js.Array[CoreNetworkSegment]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type CoreNetworkState = _CoreNetworkState | String

type CoreNetworkSummaryList = js.Array[CoreNetworkSummary]

type CustomerGatewayArn = String

type CustomerGatewayArnList = js.Array[CustomerGatewayArn]

type CustomerGatewayAssociationList = js.Array[CustomerGatewayAssociation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type CustomerGatewayAssociationState = _CustomerGatewayAssociationState | String

type DateTime = js.Date

type DeviceArn = String

type DeviceId = String

type DeviceIdList = js.Array[DeviceId]

type DeviceList = js.Array[Device]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type DeviceState = _DeviceState | String

type ExternalRegionCode = String

type ExternalRegionCodeList = js.Array[ExternalRegionCode]

type FilterMap = StringDictionary[FilterValues]

type FilterName = String

type FilterValue = String

type FilterValues = js.Array[FilterValue]

type GlobalNetworkArn = String

type GlobalNetworkId = String

type GlobalNetworkIdList = js.Array[GlobalNetworkId]

type GlobalNetworkList = js.Array[GlobalNetwork]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type GlobalNetworkState = _GlobalNetworkState | String

type IPAddress = String

type Integer = Double

type LinkArn = String

type LinkAssociationList = js.Array[LinkAssociation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type LinkAssociationState = _LinkAssociationState | String

type LinkId = String

type LinkIdList = js.Array[LinkId]

type LinkList = js.Array[Link]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type LinkState = _LinkState | String

type Long = Double

type MaxResults = Double

type NetworkResourceCountList = js.Array[NetworkResourceCount]

type NetworkResourceList = js.Array[NetworkResource]

type NetworkResourceMetadataMap = StringDictionary[ConstrainedString]

type NetworkRouteDestinationList = js.Array[NetworkRouteDestination]

type NetworkRouteList = js.Array[NetworkRoute]

type NetworkTelemetryList = js.Array[NetworkTelemetry]

type NextToken = String

type OrganizationAwsServiceAccessStatus = String

type OrganizationId = String

type PathComponentList = js.Array[PathComponent]

type PeeringId = String

type PeeringList = js.Array[Peering]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type PeeringState = _PeeringState | String

type PeeringType = TRANSIT_GATEWAY | String

type ReasonContextKey = String

type ReasonContextMap = StringDictionary[ReasonContextValue]

type ReasonContextValue = String

type RelationshipList = js.Array[Relationship]

type ResourceArn = String

type ResourcePolicyDocument = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRANSIT_GATEWAY_ATTACHMENT_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.TRANSIT_GATEWAY_ATTACHMENT_NOT_IN_TRANSIT_GATEWAY
  - typings.awsSdk.awsSdkStrings.CYCLIC_PATH_DETECTED
  - typings.awsSdk.awsSdkStrings.TRANSIT_GATEWAY_ATTACHMENT_STABLE_ROUTE_TABLE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.ROUTE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.BLACKHOLE_ROUTE_FOR_DESTINATION_FOUND
  - typings.awsSdk.awsSdkStrings.INACTIVE_ROUTE_FOR_DESTINATION_FOUND
  - typings.awsSdk.awsSdkStrings.TRANSIT_GATEWAY_ATTACHMENT_ATTACH_ARN_NO_MATCH
  - typings.awsSdk.awsSdkStrings.MAX_HOPS_EXCEEDED
  - typings.awsSdk.awsSdkStrings.POSSIBLE_MIDDLEBOX
  - typings.awsSdk.awsSdkStrings.NO_DESTINATION_ARN_PROVIDED
  - java.lang.String
*/
type RouteAnalysisCompletionReasonCode = _RouteAnalysisCompletionReasonCode | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONNECTED
  - typings.awsSdk.awsSdkStrings.NOT_CONNECTED
  - java.lang.String
*/
type RouteAnalysisCompletionResultCode = _RouteAnalysisCompletionResultCode | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type RouteAnalysisStatus = _RouteAnalysisStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.BLACKHOLE
  - java.lang.String
*/
type RouteState = _RouteState | String

type RouteStateList = js.Array[RouteState]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRANSIT_GATEWAY_ROUTE_TABLE
  - typings.awsSdk.awsSdkStrings.CORE_NETWORK_SEGMENT
  - java.lang.String
*/
type RouteTableType = _RouteTableType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROPAGATED
  - typings.awsSdk.awsSdkStrings.STATIC
  - java.lang.String
*/
type RouteType = _RouteType | String

type RouteTypeList = js.Array[RouteType]

type SLRDeploymentStatus = String

type ServerSideString = String

type SiteArn = String

type SiteId = String

type SiteIdList = js.Array[SiteId]

type SiteList = js.Array[Site]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type SiteState = _SiteState | String

type SubnetArn = String

type SubnetArnList = js.Array[SubnetArn]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TransitGatewayArn = String

type TransitGatewayArnList = js.Array[TransitGatewayArn]

type TransitGatewayAttachmentArn = String

type TransitGatewayAttachmentId = String

type TransitGatewayConnectPeerArn = String

type TransitGatewayConnectPeerArnList = js.Array[TransitGatewayConnectPeerArn]

type TransitGatewayConnectPeerAssociationList = js.Array[TransitGatewayConnectPeerAssociation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type TransitGatewayConnectPeerAssociationState = _TransitGatewayConnectPeerAssociationState | String

type TransitGatewayPeeringAttachmentId = String

type TransitGatewayRegistrationList = js.Array[TransitGatewayRegistration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type TransitGatewayRegistrationState = _TransitGatewayRegistrationState | String

type TransitGatewayRouteTableArn = String

type TunnelProtocol = GRE | String

type VpcArn = String

type VpnConnectionArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2019-07-05`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
