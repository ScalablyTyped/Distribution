package typings.awsSdk.networkmanagerMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkManager extends Service {
  
  /**
    * Accepts a core network attachment request.  Once the attachment request is accepted by a core network owner, the attachment is created and connected to a core network.
    */
  def acceptAttachment(): Request[AcceptAttachmentResponse, AWSError] = js.native
  def acceptAttachment(callback: js.Function2[/* err */ AWSError, /* data */ AcceptAttachmentResponse, Unit]): Request[AcceptAttachmentResponse, AWSError] = js.native
  /**
    * Accepts a core network attachment request.  Once the attachment request is accepted by a core network owner, the attachment is created and connected to a core network.
    */
  def acceptAttachment(params: AcceptAttachmentRequest): Request[AcceptAttachmentResponse, AWSError] = js.native
  def acceptAttachment(
    params: AcceptAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptAttachmentResponse, Unit]
  ): Request[AcceptAttachmentResponse, AWSError] = js.native
  
  /**
    * Associates a core network Connect peer with a device and optionally, with a link.  If you specify a link, it must be associated with the specified device. You can only associate core network Connect peers that have been created on a core network Connect attachment on a core network. 
    */
  def associateConnectPeer(): Request[AssociateConnectPeerResponse, AWSError] = js.native
  def associateConnectPeer(callback: js.Function2[/* err */ AWSError, /* data */ AssociateConnectPeerResponse, Unit]): Request[AssociateConnectPeerResponse, AWSError] = js.native
  /**
    * Associates a core network Connect peer with a device and optionally, with a link.  If you specify a link, it must be associated with the specified device. You can only associate core network Connect peers that have been created on a core network Connect attachment on a core network. 
    */
  def associateConnectPeer(params: AssociateConnectPeerRequest): Request[AssociateConnectPeerResponse, AWSError] = js.native
  def associateConnectPeer(
    params: AssociateConnectPeerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateConnectPeerResponse, Unit]
  ): Request[AssociateConnectPeerResponse, AWSError] = js.native
  
  /**
    * Associates a customer gateway with a device and optionally, with a link. If you specify a link, it must be associated with the specified device.  You can only associate customer gateways that are connected to a VPN attachment on a transit gateway or core network registered in your global network. When you register a transit gateway or core network, customer gateways that are connected to the transit gateway are automatically included in the global network. To list customer gateways that are connected to a transit gateway, use the DescribeVpnConnections EC2 API and filter by transit-gateway-id. You cannot associate a customer gateway with more than one device and link. 
    */
  def associateCustomerGateway(): Request[AssociateCustomerGatewayResponse, AWSError] = js.native
  def associateCustomerGateway(callback: js.Function2[/* err */ AWSError, /* data */ AssociateCustomerGatewayResponse, Unit]): Request[AssociateCustomerGatewayResponse, AWSError] = js.native
  /**
    * Associates a customer gateway with a device and optionally, with a link. If you specify a link, it must be associated with the specified device.  You can only associate customer gateways that are connected to a VPN attachment on a transit gateway or core network registered in your global network. When you register a transit gateway or core network, customer gateways that are connected to the transit gateway are automatically included in the global network. To list customer gateways that are connected to a transit gateway, use the DescribeVpnConnections EC2 API and filter by transit-gateway-id. You cannot associate a customer gateway with more than one device and link. 
    */
  def associateCustomerGateway(params: AssociateCustomerGatewayRequest): Request[AssociateCustomerGatewayResponse, AWSError] = js.native
  def associateCustomerGateway(
    params: AssociateCustomerGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateCustomerGatewayResponse, Unit]
  ): Request[AssociateCustomerGatewayResponse, AWSError] = js.native
  
  /**
    * Associates a link to a device. A device can be associated to multiple links and a link can be associated to multiple devices. The device and link must be in the same global network and the same site.
    */
  def associateLink(): Request[AssociateLinkResponse, AWSError] = js.native
  def associateLink(callback: js.Function2[/* err */ AWSError, /* data */ AssociateLinkResponse, Unit]): Request[AssociateLinkResponse, AWSError] = js.native
  /**
    * Associates a link to a device. A device can be associated to multiple links and a link can be associated to multiple devices. The device and link must be in the same global network and the same site.
    */
  def associateLink(params: AssociateLinkRequest): Request[AssociateLinkResponse, AWSError] = js.native
  def associateLink(
    params: AssociateLinkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateLinkResponse, Unit]
  ): Request[AssociateLinkResponse, AWSError] = js.native
  
  /**
    * Associates a transit gateway Connect peer with a device, and optionally, with a link. If you specify a link, it must be associated with the specified device.  You can only associate transit gateway Connect peers that have been created on a transit gateway that's registered in your global network. You cannot associate a transit gateway Connect peer with more than one device and link. 
    */
  def associateTransitGatewayConnectPeer(): Request[AssociateTransitGatewayConnectPeerResponse, AWSError] = js.native
  def associateTransitGatewayConnectPeer(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateTransitGatewayConnectPeerResponse, Unit]
  ): Request[AssociateTransitGatewayConnectPeerResponse, AWSError] = js.native
  /**
    * Associates a transit gateway Connect peer with a device, and optionally, with a link. If you specify a link, it must be associated with the specified device.  You can only associate transit gateway Connect peers that have been created on a transit gateway that's registered in your global network. You cannot associate a transit gateway Connect peer with more than one device and link. 
    */
  def associateTransitGatewayConnectPeer(params: AssociateTransitGatewayConnectPeerRequest): Request[AssociateTransitGatewayConnectPeerResponse, AWSError] = js.native
  def associateTransitGatewayConnectPeer(
    params: AssociateTransitGatewayConnectPeerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateTransitGatewayConnectPeerResponse, Unit]
  ): Request[AssociateTransitGatewayConnectPeerResponse, AWSError] = js.native
  
  @JSName("config")
  var config_NetworkManager: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a core network Connect attachment from a specified core network attachment.  A core network Connect attachment is a GRE-based tunnel attachment that you can use to establish a connection between a core network and an appliance. A core network Connect attachment uses an existing VPC attachment as the underlying transport mechanism.
    */
  def createConnectAttachment(): Request[CreateConnectAttachmentResponse, AWSError] = js.native
  def createConnectAttachment(callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectAttachmentResponse, Unit]): Request[CreateConnectAttachmentResponse, AWSError] = js.native
  /**
    * Creates a core network Connect attachment from a specified core network attachment.  A core network Connect attachment is a GRE-based tunnel attachment that you can use to establish a connection between a core network and an appliance. A core network Connect attachment uses an existing VPC attachment as the underlying transport mechanism.
    */
  def createConnectAttachment(params: CreateConnectAttachmentRequest): Request[CreateConnectAttachmentResponse, AWSError] = js.native
  def createConnectAttachment(
    params: CreateConnectAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectAttachmentResponse, Unit]
  ): Request[CreateConnectAttachmentResponse, AWSError] = js.native
  
  /**
    * Creates a core network Connect peer for a specified core network connect attachment between a core network and an appliance. The peer address and transit gateway address must be the same IP address family (IPv4 or IPv6).
    */
  def createConnectPeer(): Request[CreateConnectPeerResponse, AWSError] = js.native
  def createConnectPeer(callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectPeerResponse, Unit]): Request[CreateConnectPeerResponse, AWSError] = js.native
  /**
    * Creates a core network Connect peer for a specified core network connect attachment between a core network and an appliance. The peer address and transit gateway address must be the same IP address family (IPv4 or IPv6).
    */
  def createConnectPeer(params: CreateConnectPeerRequest): Request[CreateConnectPeerResponse, AWSError] = js.native
  def createConnectPeer(
    params: CreateConnectPeerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectPeerResponse, Unit]
  ): Request[CreateConnectPeerResponse, AWSError] = js.native
  
  /**
    * Creates a connection between two devices. The devices can be a physical or virtual appliance that connects to a third-party appliance in a VPC, or a physical appliance that connects to another physical appliance in an on-premises network.
    */
  def createConnection(): Request[CreateConnectionResponse, AWSError] = js.native
  def createConnection(callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectionResponse, Unit]): Request[CreateConnectionResponse, AWSError] = js.native
  /**
    * Creates a connection between two devices. The devices can be a physical or virtual appliance that connects to a third-party appliance in a VPC, or a physical appliance that connects to another physical appliance in an on-premises network.
    */
  def createConnection(params: CreateConnectionRequest): Request[CreateConnectionResponse, AWSError] = js.native
  def createConnection(
    params: CreateConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectionResponse, Unit]
  ): Request[CreateConnectionResponse, AWSError] = js.native
  
  /**
    * Creates a core network as part of your global network, and optionally, with a core network policy.
    */
  def createCoreNetwork(): Request[CreateCoreNetworkResponse, AWSError] = js.native
  def createCoreNetwork(callback: js.Function2[/* err */ AWSError, /* data */ CreateCoreNetworkResponse, Unit]): Request[CreateCoreNetworkResponse, AWSError] = js.native
  /**
    * Creates a core network as part of your global network, and optionally, with a core network policy.
    */
  def createCoreNetwork(params: CreateCoreNetworkRequest): Request[CreateCoreNetworkResponse, AWSError] = js.native
  def createCoreNetwork(
    params: CreateCoreNetworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCoreNetworkResponse, Unit]
  ): Request[CreateCoreNetworkResponse, AWSError] = js.native
  
  /**
    * Creates a new device in a global network. If you specify both a site ID and a location, the location of the site is used for visualization in the Network Manager console.
    */
  def createDevice(): Request[CreateDeviceResponse, AWSError] = js.native
  def createDevice(callback: js.Function2[/* err */ AWSError, /* data */ CreateDeviceResponse, Unit]): Request[CreateDeviceResponse, AWSError] = js.native
  /**
    * Creates a new device in a global network. If you specify both a site ID and a location, the location of the site is used for visualization in the Network Manager console.
    */
  def createDevice(params: CreateDeviceRequest): Request[CreateDeviceResponse, AWSError] = js.native
  def createDevice(
    params: CreateDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDeviceResponse, Unit]
  ): Request[CreateDeviceResponse, AWSError] = js.native
  
  /**
    * Creates a new, empty global network.
    */
  def createGlobalNetwork(): Request[CreateGlobalNetworkResponse, AWSError] = js.native
  def createGlobalNetwork(callback: js.Function2[/* err */ AWSError, /* data */ CreateGlobalNetworkResponse, Unit]): Request[CreateGlobalNetworkResponse, AWSError] = js.native
  /**
    * Creates a new, empty global network.
    */
  def createGlobalNetwork(params: CreateGlobalNetworkRequest): Request[CreateGlobalNetworkResponse, AWSError] = js.native
  def createGlobalNetwork(
    params: CreateGlobalNetworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGlobalNetworkResponse, Unit]
  ): Request[CreateGlobalNetworkResponse, AWSError] = js.native
  
  /**
    * Creates a new link for a specified site.
    */
  def createLink(): Request[CreateLinkResponse, AWSError] = js.native
  def createLink(callback: js.Function2[/* err */ AWSError, /* data */ CreateLinkResponse, Unit]): Request[CreateLinkResponse, AWSError] = js.native
  /**
    * Creates a new link for a specified site.
    */
  def createLink(params: CreateLinkRequest): Request[CreateLinkResponse, AWSError] = js.native
  def createLink(
    params: CreateLinkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLinkResponse, Unit]
  ): Request[CreateLinkResponse, AWSError] = js.native
  
  /**
    * Creates a new site in a global network.
    */
  def createSite(): Request[CreateSiteResponse, AWSError] = js.native
  def createSite(callback: js.Function2[/* err */ AWSError, /* data */ CreateSiteResponse, Unit]): Request[CreateSiteResponse, AWSError] = js.native
  /**
    * Creates a new site in a global network.
    */
  def createSite(params: CreateSiteRequest): Request[CreateSiteResponse, AWSError] = js.native
  def createSite(
    params: CreateSiteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSiteResponse, Unit]
  ): Request[CreateSiteResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon Web Services site-to-site VPN attachment on an edge location of a core network.
    */
  def createSiteToSiteVpnAttachment(): Request[CreateSiteToSiteVpnAttachmentResponse, AWSError] = js.native
  def createSiteToSiteVpnAttachment(callback: js.Function2[/* err */ AWSError, /* data */ CreateSiteToSiteVpnAttachmentResponse, Unit]): Request[CreateSiteToSiteVpnAttachmentResponse, AWSError] = js.native
  /**
    * Creates an Amazon Web Services site-to-site VPN attachment on an edge location of a core network.
    */
  def createSiteToSiteVpnAttachment(params: CreateSiteToSiteVpnAttachmentRequest): Request[CreateSiteToSiteVpnAttachmentResponse, AWSError] = js.native
  def createSiteToSiteVpnAttachment(
    params: CreateSiteToSiteVpnAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSiteToSiteVpnAttachmentResponse, Unit]
  ): Request[CreateSiteToSiteVpnAttachmentResponse, AWSError] = js.native
  
  /**
    * Creates a transit gateway peering connection.
    */
  def createTransitGatewayPeering(): Request[CreateTransitGatewayPeeringResponse, AWSError] = js.native
  def createTransitGatewayPeering(callback: js.Function2[/* err */ AWSError, /* data */ CreateTransitGatewayPeeringResponse, Unit]): Request[CreateTransitGatewayPeeringResponse, AWSError] = js.native
  /**
    * Creates a transit gateway peering connection.
    */
  def createTransitGatewayPeering(params: CreateTransitGatewayPeeringRequest): Request[CreateTransitGatewayPeeringResponse, AWSError] = js.native
  def createTransitGatewayPeering(
    params: CreateTransitGatewayPeeringRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTransitGatewayPeeringResponse, Unit]
  ): Request[CreateTransitGatewayPeeringResponse, AWSError] = js.native
  
  /**
    * Creates a transit gateway route table attachment.
    */
  def createTransitGatewayRouteTableAttachment(): Request[CreateTransitGatewayRouteTableAttachmentResponse, AWSError] = js.native
  def createTransitGatewayRouteTableAttachment(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ CreateTransitGatewayRouteTableAttachmentResponse, 
      Unit
    ]
  ): Request[CreateTransitGatewayRouteTableAttachmentResponse, AWSError] = js.native
  /**
    * Creates a transit gateway route table attachment.
    */
  def createTransitGatewayRouteTableAttachment(params: CreateTransitGatewayRouteTableAttachmentRequest): Request[CreateTransitGatewayRouteTableAttachmentResponse, AWSError] = js.native
  def createTransitGatewayRouteTableAttachment(
    params: CreateTransitGatewayRouteTableAttachmentRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ CreateTransitGatewayRouteTableAttachmentResponse, 
      Unit
    ]
  ): Request[CreateTransitGatewayRouteTableAttachmentResponse, AWSError] = js.native
  
  /**
    * Creates a VPC attachment on an edge location of a core network.
    */
  def createVpcAttachment(): Request[CreateVpcAttachmentResponse, AWSError] = js.native
  def createVpcAttachment(callback: js.Function2[/* err */ AWSError, /* data */ CreateVpcAttachmentResponse, Unit]): Request[CreateVpcAttachmentResponse, AWSError] = js.native
  /**
    * Creates a VPC attachment on an edge location of a core network.
    */
  def createVpcAttachment(params: CreateVpcAttachmentRequest): Request[CreateVpcAttachmentResponse, AWSError] = js.native
  def createVpcAttachment(
    params: CreateVpcAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVpcAttachmentResponse, Unit]
  ): Request[CreateVpcAttachmentResponse, AWSError] = js.native
  
  /**
    * Deletes an attachment. Supports all attachment types.
    */
  def deleteAttachment(): Request[DeleteAttachmentResponse, AWSError] = js.native
  def deleteAttachment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAttachmentResponse, Unit]): Request[DeleteAttachmentResponse, AWSError] = js.native
  /**
    * Deletes an attachment. Supports all attachment types.
    */
  def deleteAttachment(params: DeleteAttachmentRequest): Request[DeleteAttachmentResponse, AWSError] = js.native
  def deleteAttachment(
    params: DeleteAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAttachmentResponse, Unit]
  ): Request[DeleteAttachmentResponse, AWSError] = js.native
  
  /**
    * Deletes a Connect peer.
    */
  def deleteConnectPeer(): Request[DeleteConnectPeerResponse, AWSError] = js.native
  def deleteConnectPeer(callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectPeerResponse, Unit]): Request[DeleteConnectPeerResponse, AWSError] = js.native
  /**
    * Deletes a Connect peer.
    */
  def deleteConnectPeer(params: DeleteConnectPeerRequest): Request[DeleteConnectPeerResponse, AWSError] = js.native
  def deleteConnectPeer(
    params: DeleteConnectPeerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectPeerResponse, Unit]
  ): Request[DeleteConnectPeerResponse, AWSError] = js.native
  
  /**
    * Deletes the specified connection in your global network.
    */
  def deleteConnection(): Request[DeleteConnectionResponse, AWSError] = js.native
  def deleteConnection(callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectionResponse, Unit]): Request[DeleteConnectionResponse, AWSError] = js.native
  /**
    * Deletes the specified connection in your global network.
    */
  def deleteConnection(params: DeleteConnectionRequest): Request[DeleteConnectionResponse, AWSError] = js.native
  def deleteConnection(
    params: DeleteConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectionResponse, Unit]
  ): Request[DeleteConnectionResponse, AWSError] = js.native
  
  /**
    * Deletes a core network along with all core network policies. This can only be done if there are no attachments on a core network.
    */
  def deleteCoreNetwork(): Request[DeleteCoreNetworkResponse, AWSError] = js.native
  def deleteCoreNetwork(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCoreNetworkResponse, Unit]): Request[DeleteCoreNetworkResponse, AWSError] = js.native
  /**
    * Deletes a core network along with all core network policies. This can only be done if there are no attachments on a core network.
    */
  def deleteCoreNetwork(params: DeleteCoreNetworkRequest): Request[DeleteCoreNetworkResponse, AWSError] = js.native
  def deleteCoreNetwork(
    params: DeleteCoreNetworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCoreNetworkResponse, Unit]
  ): Request[DeleteCoreNetworkResponse, AWSError] = js.native
  
  /**
    * Deletes a policy version from a core network. You can't delete the current LIVE policy.
    */
  def deleteCoreNetworkPolicyVersion(): Request[DeleteCoreNetworkPolicyVersionResponse, AWSError] = js.native
  def deleteCoreNetworkPolicyVersion(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCoreNetworkPolicyVersionResponse, Unit]
  ): Request[DeleteCoreNetworkPolicyVersionResponse, AWSError] = js.native
  /**
    * Deletes a policy version from a core network. You can't delete the current LIVE policy.
    */
  def deleteCoreNetworkPolicyVersion(params: DeleteCoreNetworkPolicyVersionRequest): Request[DeleteCoreNetworkPolicyVersionResponse, AWSError] = js.native
  def deleteCoreNetworkPolicyVersion(
    params: DeleteCoreNetworkPolicyVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCoreNetworkPolicyVersionResponse, Unit]
  ): Request[DeleteCoreNetworkPolicyVersionResponse, AWSError] = js.native
  
  /**
    * Deletes an existing device. You must first disassociate the device from any links and customer gateways.
    */
  def deleteDevice(): Request[DeleteDeviceResponse, AWSError] = js.native
  def deleteDevice(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDeviceResponse, Unit]): Request[DeleteDeviceResponse, AWSError] = js.native
  /**
    * Deletes an existing device. You must first disassociate the device from any links and customer gateways.
    */
  def deleteDevice(params: DeleteDeviceRequest): Request[DeleteDeviceResponse, AWSError] = js.native
  def deleteDevice(
    params: DeleteDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDeviceResponse, Unit]
  ): Request[DeleteDeviceResponse, AWSError] = js.native
  
  /**
    * Deletes an existing global network. You must first delete all global network objects (devices, links, and sites), deregister all transit gateways, and delete any core networks.
    */
  def deleteGlobalNetwork(): Request[DeleteGlobalNetworkResponse, AWSError] = js.native
  def deleteGlobalNetwork(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGlobalNetworkResponse, Unit]): Request[DeleteGlobalNetworkResponse, AWSError] = js.native
  /**
    * Deletes an existing global network. You must first delete all global network objects (devices, links, and sites), deregister all transit gateways, and delete any core networks.
    */
  def deleteGlobalNetwork(params: DeleteGlobalNetworkRequest): Request[DeleteGlobalNetworkResponse, AWSError] = js.native
  def deleteGlobalNetwork(
    params: DeleteGlobalNetworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGlobalNetworkResponse, Unit]
  ): Request[DeleteGlobalNetworkResponse, AWSError] = js.native
  
  /**
    * Deletes an existing link. You must first disassociate the link from any devices and customer gateways.
    */
  def deleteLink(): Request[DeleteLinkResponse, AWSError] = js.native
  def deleteLink(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLinkResponse, Unit]): Request[DeleteLinkResponse, AWSError] = js.native
  /**
    * Deletes an existing link. You must first disassociate the link from any devices and customer gateways.
    */
  def deleteLink(params: DeleteLinkRequest): Request[DeleteLinkResponse, AWSError] = js.native
  def deleteLink(
    params: DeleteLinkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLinkResponse, Unit]
  ): Request[DeleteLinkResponse, AWSError] = js.native
  
  /**
    * Deletes an existing peering connection.
    */
  def deletePeering(): Request[DeletePeeringResponse, AWSError] = js.native
  def deletePeering(callback: js.Function2[/* err */ AWSError, /* data */ DeletePeeringResponse, Unit]): Request[DeletePeeringResponse, AWSError] = js.native
  /**
    * Deletes an existing peering connection.
    */
  def deletePeering(params: DeletePeeringRequest): Request[DeletePeeringResponse, AWSError] = js.native
  def deletePeering(
    params: DeletePeeringRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePeeringResponse, Unit]
  ): Request[DeletePeeringResponse, AWSError] = js.native
  
  /**
    * Deletes a resource policy for the specified resource. This revokes the access of the principals specified in the resource policy.
    */
  def deleteResourcePolicy(): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  def deleteResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyResponse, Unit]): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  /**
    * Deletes a resource policy for the specified resource. This revokes the access of the principals specified in the resource policy.
    */
  def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  def deleteResourcePolicy(
    params: DeleteResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyResponse, Unit]
  ): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Deletes an existing site. The site cannot be associated with any device or link.
    */
  def deleteSite(): Request[DeleteSiteResponse, AWSError] = js.native
  def deleteSite(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSiteResponse, Unit]): Request[DeleteSiteResponse, AWSError] = js.native
  /**
    * Deletes an existing site. The site cannot be associated with any device or link.
    */
  def deleteSite(params: DeleteSiteRequest): Request[DeleteSiteResponse, AWSError] = js.native
  def deleteSite(
    params: DeleteSiteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSiteResponse, Unit]
  ): Request[DeleteSiteResponse, AWSError] = js.native
  
  /**
    * Deregisters a transit gateway from your global network. This action does not delete your transit gateway, or modify any of its attachments. This action removes any customer gateway associations.
    */
  def deregisterTransitGateway(): Request[DeregisterTransitGatewayResponse, AWSError] = js.native
  def deregisterTransitGateway(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterTransitGatewayResponse, Unit]): Request[DeregisterTransitGatewayResponse, AWSError] = js.native
  /**
    * Deregisters a transit gateway from your global network. This action does not delete your transit gateway, or modify any of its attachments. This action removes any customer gateway associations.
    */
  def deregisterTransitGateway(params: DeregisterTransitGatewayRequest): Request[DeregisterTransitGatewayResponse, AWSError] = js.native
  def deregisterTransitGateway(
    params: DeregisterTransitGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterTransitGatewayResponse, Unit]
  ): Request[DeregisterTransitGatewayResponse, AWSError] = js.native
  
  /**
    * Describes one or more global networks. By default, all global networks are described. To describe the objects in your global network, you must use the appropriate Get* action. For example, to list the transit gateways in your global network, use GetTransitGatewayRegistrations.
    */
  def describeGlobalNetworks(): Request[DescribeGlobalNetworksResponse, AWSError] = js.native
  def describeGlobalNetworks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeGlobalNetworksResponse, Unit]): Request[DescribeGlobalNetworksResponse, AWSError] = js.native
  /**
    * Describes one or more global networks. By default, all global networks are described. To describe the objects in your global network, you must use the appropriate Get* action. For example, to list the transit gateways in your global network, use GetTransitGatewayRegistrations.
    */
  def describeGlobalNetworks(params: DescribeGlobalNetworksRequest): Request[DescribeGlobalNetworksResponse, AWSError] = js.native
  def describeGlobalNetworks(
    params: DescribeGlobalNetworksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGlobalNetworksResponse, Unit]
  ): Request[DescribeGlobalNetworksResponse, AWSError] = js.native
  
  /**
    * Disassociates a core network Connect peer from a device and a link. 
    */
  def disassociateConnectPeer(): Request[DisassociateConnectPeerResponse, AWSError] = js.native
  def disassociateConnectPeer(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateConnectPeerResponse, Unit]): Request[DisassociateConnectPeerResponse, AWSError] = js.native
  /**
    * Disassociates a core network Connect peer from a device and a link. 
    */
  def disassociateConnectPeer(params: DisassociateConnectPeerRequest): Request[DisassociateConnectPeerResponse, AWSError] = js.native
  def disassociateConnectPeer(
    params: DisassociateConnectPeerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateConnectPeerResponse, Unit]
  ): Request[DisassociateConnectPeerResponse, AWSError] = js.native
  
  /**
    * Disassociates a customer gateway from a device and a link.
    */
  def disassociateCustomerGateway(): Request[DisassociateCustomerGatewayResponse, AWSError] = js.native
  def disassociateCustomerGateway(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateCustomerGatewayResponse, Unit]): Request[DisassociateCustomerGatewayResponse, AWSError] = js.native
  /**
    * Disassociates a customer gateway from a device and a link.
    */
  def disassociateCustomerGateway(params: DisassociateCustomerGatewayRequest): Request[DisassociateCustomerGatewayResponse, AWSError] = js.native
  def disassociateCustomerGateway(
    params: DisassociateCustomerGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateCustomerGatewayResponse, Unit]
  ): Request[DisassociateCustomerGatewayResponse, AWSError] = js.native
  
  /**
    * Disassociates an existing device from a link. You must first disassociate any customer gateways that are associated with the link.
    */
  def disassociateLink(): Request[DisassociateLinkResponse, AWSError] = js.native
  def disassociateLink(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateLinkResponse, Unit]): Request[DisassociateLinkResponse, AWSError] = js.native
  /**
    * Disassociates an existing device from a link. You must first disassociate any customer gateways that are associated with the link.
    */
  def disassociateLink(params: DisassociateLinkRequest): Request[DisassociateLinkResponse, AWSError] = js.native
  def disassociateLink(
    params: DisassociateLinkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateLinkResponse, Unit]
  ): Request[DisassociateLinkResponse, AWSError] = js.native
  
  /**
    * Disassociates a transit gateway Connect peer from a device and link.
    */
  def disassociateTransitGatewayConnectPeer(): Request[DisassociateTransitGatewayConnectPeerResponse, AWSError] = js.native
  def disassociateTransitGatewayConnectPeer(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateTransitGatewayConnectPeerResponse, Unit]
  ): Request[DisassociateTransitGatewayConnectPeerResponse, AWSError] = js.native
  /**
    * Disassociates a transit gateway Connect peer from a device and link.
    */
  def disassociateTransitGatewayConnectPeer(params: DisassociateTransitGatewayConnectPeerRequest): Request[DisassociateTransitGatewayConnectPeerResponse, AWSError] = js.native
  def disassociateTransitGatewayConnectPeer(
    params: DisassociateTransitGatewayConnectPeerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateTransitGatewayConnectPeerResponse, Unit]
  ): Request[DisassociateTransitGatewayConnectPeerResponse, AWSError] = js.native
  
  /**
    * Executes a change set on your core network. Deploys changes globally based on the policy submitted..
    */
  def executeCoreNetworkChangeSet(): Request[ExecuteCoreNetworkChangeSetResponse, AWSError] = js.native
  def executeCoreNetworkChangeSet(callback: js.Function2[/* err */ AWSError, /* data */ ExecuteCoreNetworkChangeSetResponse, Unit]): Request[ExecuteCoreNetworkChangeSetResponse, AWSError] = js.native
  /**
    * Executes a change set on your core network. Deploys changes globally based on the policy submitted..
    */
  def executeCoreNetworkChangeSet(params: ExecuteCoreNetworkChangeSetRequest): Request[ExecuteCoreNetworkChangeSetResponse, AWSError] = js.native
  def executeCoreNetworkChangeSet(
    params: ExecuteCoreNetworkChangeSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExecuteCoreNetworkChangeSetResponse, Unit]
  ): Request[ExecuteCoreNetworkChangeSetResponse, AWSError] = js.native
  
  /**
    * Returns information about a core network Connect attachment.
    */
  def getConnectAttachment(): Request[GetConnectAttachmentResponse, AWSError] = js.native
  def getConnectAttachment(callback: js.Function2[/* err */ AWSError, /* data */ GetConnectAttachmentResponse, Unit]): Request[GetConnectAttachmentResponse, AWSError] = js.native
  /**
    * Returns information about a core network Connect attachment.
    */
  def getConnectAttachment(params: GetConnectAttachmentRequest): Request[GetConnectAttachmentResponse, AWSError] = js.native
  def getConnectAttachment(
    params: GetConnectAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConnectAttachmentResponse, Unit]
  ): Request[GetConnectAttachmentResponse, AWSError] = js.native
  
  /**
    * Returns information about a core network Connect peer.
    */
  def getConnectPeer(): Request[GetConnectPeerResponse, AWSError] = js.native
  def getConnectPeer(callback: js.Function2[/* err */ AWSError, /* data */ GetConnectPeerResponse, Unit]): Request[GetConnectPeerResponse, AWSError] = js.native
  /**
    * Returns information about a core network Connect peer.
    */
  def getConnectPeer(params: GetConnectPeerRequest): Request[GetConnectPeerResponse, AWSError] = js.native
  def getConnectPeer(
    params: GetConnectPeerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConnectPeerResponse, Unit]
  ): Request[GetConnectPeerResponse, AWSError] = js.native
  
  /**
    * Returns information about a core network Connect peer associations.
    */
  def getConnectPeerAssociations(): Request[GetConnectPeerAssociationsResponse, AWSError] = js.native
  def getConnectPeerAssociations(callback: js.Function2[/* err */ AWSError, /* data */ GetConnectPeerAssociationsResponse, Unit]): Request[GetConnectPeerAssociationsResponse, AWSError] = js.native
  /**
    * Returns information about a core network Connect peer associations.
    */
  def getConnectPeerAssociations(params: GetConnectPeerAssociationsRequest): Request[GetConnectPeerAssociationsResponse, AWSError] = js.native
  def getConnectPeerAssociations(
    params: GetConnectPeerAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConnectPeerAssociationsResponse, Unit]
  ): Request[GetConnectPeerAssociationsResponse, AWSError] = js.native
  
  /**
    * Gets information about one or more of your connections in a global network.
    */
  def getConnections(): Request[GetConnectionsResponse, AWSError] = js.native
  def getConnections(callback: js.Function2[/* err */ AWSError, /* data */ GetConnectionsResponse, Unit]): Request[GetConnectionsResponse, AWSError] = js.native
  /**
    * Gets information about one or more of your connections in a global network.
    */
  def getConnections(params: GetConnectionsRequest): Request[GetConnectionsResponse, AWSError] = js.native
  def getConnections(
    params: GetConnectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConnectionsResponse, Unit]
  ): Request[GetConnectionsResponse, AWSError] = js.native
  
  /**
    * Returns information about the LIVE policy for a core network.
    */
  def getCoreNetwork(): Request[GetCoreNetworkResponse, AWSError] = js.native
  def getCoreNetwork(callback: js.Function2[/* err */ AWSError, /* data */ GetCoreNetworkResponse, Unit]): Request[GetCoreNetworkResponse, AWSError] = js.native
  /**
    * Returns information about the LIVE policy for a core network.
    */
  def getCoreNetwork(params: GetCoreNetworkRequest): Request[GetCoreNetworkResponse, AWSError] = js.native
  def getCoreNetwork(
    params: GetCoreNetworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCoreNetworkResponse, Unit]
  ): Request[GetCoreNetworkResponse, AWSError] = js.native
  
  /**
    * Returns information about a core network change event.
    */
  def getCoreNetworkChangeEvents(): Request[GetCoreNetworkChangeEventsResponse, AWSError] = js.native
  def getCoreNetworkChangeEvents(callback: js.Function2[/* err */ AWSError, /* data */ GetCoreNetworkChangeEventsResponse, Unit]): Request[GetCoreNetworkChangeEventsResponse, AWSError] = js.native
  /**
    * Returns information about a core network change event.
    */
  def getCoreNetworkChangeEvents(params: GetCoreNetworkChangeEventsRequest): Request[GetCoreNetworkChangeEventsResponse, AWSError] = js.native
  def getCoreNetworkChangeEvents(
    params: GetCoreNetworkChangeEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCoreNetworkChangeEventsResponse, Unit]
  ): Request[GetCoreNetworkChangeEventsResponse, AWSError] = js.native
  
  /**
    * Returns a change set between the LIVE core network policy and a submitted policy.
    */
  def getCoreNetworkChangeSet(): Request[GetCoreNetworkChangeSetResponse, AWSError] = js.native
  def getCoreNetworkChangeSet(callback: js.Function2[/* err */ AWSError, /* data */ GetCoreNetworkChangeSetResponse, Unit]): Request[GetCoreNetworkChangeSetResponse, AWSError] = js.native
  /**
    * Returns a change set between the LIVE core network policy and a submitted policy.
    */
  def getCoreNetworkChangeSet(params: GetCoreNetworkChangeSetRequest): Request[GetCoreNetworkChangeSetResponse, AWSError] = js.native
  def getCoreNetworkChangeSet(
    params: GetCoreNetworkChangeSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCoreNetworkChangeSetResponse, Unit]
  ): Request[GetCoreNetworkChangeSetResponse, AWSError] = js.native
  
  /**
    * Returns details about a core network policy. You can get details about your current live policy or any previous policy version.
    */
  def getCoreNetworkPolicy(): Request[GetCoreNetworkPolicyResponse, AWSError] = js.native
  def getCoreNetworkPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetCoreNetworkPolicyResponse, Unit]): Request[GetCoreNetworkPolicyResponse, AWSError] = js.native
  /**
    * Returns details about a core network policy. You can get details about your current live policy or any previous policy version.
    */
  def getCoreNetworkPolicy(params: GetCoreNetworkPolicyRequest): Request[GetCoreNetworkPolicyResponse, AWSError] = js.native
  def getCoreNetworkPolicy(
    params: GetCoreNetworkPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCoreNetworkPolicyResponse, Unit]
  ): Request[GetCoreNetworkPolicyResponse, AWSError] = js.native
  
  /**
    * Gets the association information for customer gateways that are associated with devices and links in your global network.
    */
  def getCustomerGatewayAssociations(): Request[GetCustomerGatewayAssociationsResponse, AWSError] = js.native
  def getCustomerGatewayAssociations(
    callback: js.Function2[/* err */ AWSError, /* data */ GetCustomerGatewayAssociationsResponse, Unit]
  ): Request[GetCustomerGatewayAssociationsResponse, AWSError] = js.native
  /**
    * Gets the association information for customer gateways that are associated with devices and links in your global network.
    */
  def getCustomerGatewayAssociations(params: GetCustomerGatewayAssociationsRequest): Request[GetCustomerGatewayAssociationsResponse, AWSError] = js.native
  def getCustomerGatewayAssociations(
    params: GetCustomerGatewayAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCustomerGatewayAssociationsResponse, Unit]
  ): Request[GetCustomerGatewayAssociationsResponse, AWSError] = js.native
  
  /**
    * Gets information about one or more of your devices in a global network.
    */
  def getDevices(): Request[GetDevicesResponse, AWSError] = js.native
  def getDevices(callback: js.Function2[/* err */ AWSError, /* data */ GetDevicesResponse, Unit]): Request[GetDevicesResponse, AWSError] = js.native
  /**
    * Gets information about one or more of your devices in a global network.
    */
  def getDevices(params: GetDevicesRequest): Request[GetDevicesResponse, AWSError] = js.native
  def getDevices(
    params: GetDevicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDevicesResponse, Unit]
  ): Request[GetDevicesResponse, AWSError] = js.native
  
  /**
    * Gets the link associations for a device or a link. Either the device ID or the link ID must be specified.
    */
  def getLinkAssociations(): Request[GetLinkAssociationsResponse, AWSError] = js.native
  def getLinkAssociations(callback: js.Function2[/* err */ AWSError, /* data */ GetLinkAssociationsResponse, Unit]): Request[GetLinkAssociationsResponse, AWSError] = js.native
  /**
    * Gets the link associations for a device or a link. Either the device ID or the link ID must be specified.
    */
  def getLinkAssociations(params: GetLinkAssociationsRequest): Request[GetLinkAssociationsResponse, AWSError] = js.native
  def getLinkAssociations(
    params: GetLinkAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLinkAssociationsResponse, Unit]
  ): Request[GetLinkAssociationsResponse, AWSError] = js.native
  
  /**
    * Gets information about one or more links in a specified global network. If you specify the site ID, you cannot specify the type or provider in the same request. You can specify the type and provider in the same request.
    */
  def getLinks(): Request[GetLinksResponse, AWSError] = js.native
  def getLinks(callback: js.Function2[/* err */ AWSError, /* data */ GetLinksResponse, Unit]): Request[GetLinksResponse, AWSError] = js.native
  /**
    * Gets information about one or more links in a specified global network. If you specify the site ID, you cannot specify the type or provider in the same request. You can specify the type and provider in the same request.
    */
  def getLinks(params: GetLinksRequest): Request[GetLinksResponse, AWSError] = js.native
  def getLinks(
    params: GetLinksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLinksResponse, Unit]
  ): Request[GetLinksResponse, AWSError] = js.native
  
  /**
    * Gets the count of network resources, by resource type, for the specified global network.
    */
  def getNetworkResourceCounts(): Request[GetNetworkResourceCountsResponse, AWSError] = js.native
  def getNetworkResourceCounts(callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkResourceCountsResponse, Unit]): Request[GetNetworkResourceCountsResponse, AWSError] = js.native
  /**
    * Gets the count of network resources, by resource type, for the specified global network.
    */
  def getNetworkResourceCounts(params: GetNetworkResourceCountsRequest): Request[GetNetworkResourceCountsResponse, AWSError] = js.native
  def getNetworkResourceCounts(
    params: GetNetworkResourceCountsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkResourceCountsResponse, Unit]
  ): Request[GetNetworkResourceCountsResponse, AWSError] = js.native
  
  /**
    * Gets the network resource relationships for the specified global network.
    */
  def getNetworkResourceRelationships(): Request[GetNetworkResourceRelationshipsResponse, AWSError] = js.native
  def getNetworkResourceRelationships(
    callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkResourceRelationshipsResponse, Unit]
  ): Request[GetNetworkResourceRelationshipsResponse, AWSError] = js.native
  /**
    * Gets the network resource relationships for the specified global network.
    */
  def getNetworkResourceRelationships(params: GetNetworkResourceRelationshipsRequest): Request[GetNetworkResourceRelationshipsResponse, AWSError] = js.native
  def getNetworkResourceRelationships(
    params: GetNetworkResourceRelationshipsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkResourceRelationshipsResponse, Unit]
  ): Request[GetNetworkResourceRelationshipsResponse, AWSError] = js.native
  
  /**
    * Describes the network resources for the specified global network. The results include information from the corresponding Describe call for the resource, minus any sensitive information such as pre-shared keys.
    */
  def getNetworkResources(): Request[GetNetworkResourcesResponse, AWSError] = js.native
  def getNetworkResources(callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkResourcesResponse, Unit]): Request[GetNetworkResourcesResponse, AWSError] = js.native
  /**
    * Describes the network resources for the specified global network. The results include information from the corresponding Describe call for the resource, minus any sensitive information such as pre-shared keys.
    */
  def getNetworkResources(params: GetNetworkResourcesRequest): Request[GetNetworkResourcesResponse, AWSError] = js.native
  def getNetworkResources(
    params: GetNetworkResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkResourcesResponse, Unit]
  ): Request[GetNetworkResourcesResponse, AWSError] = js.native
  
  /**
    * Gets the network routes of the specified global network.
    */
  def getNetworkRoutes(): Request[GetNetworkRoutesResponse, AWSError] = js.native
  def getNetworkRoutes(callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkRoutesResponse, Unit]): Request[GetNetworkRoutesResponse, AWSError] = js.native
  /**
    * Gets the network routes of the specified global network.
    */
  def getNetworkRoutes(params: GetNetworkRoutesRequest): Request[GetNetworkRoutesResponse, AWSError] = js.native
  def getNetworkRoutes(
    params: GetNetworkRoutesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkRoutesResponse, Unit]
  ): Request[GetNetworkRoutesResponse, AWSError] = js.native
  
  /**
    * Gets the network telemetry of the specified global network.
    */
  def getNetworkTelemetry(): Request[GetNetworkTelemetryResponse, AWSError] = js.native
  def getNetworkTelemetry(callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkTelemetryResponse, Unit]): Request[GetNetworkTelemetryResponse, AWSError] = js.native
  /**
    * Gets the network telemetry of the specified global network.
    */
  def getNetworkTelemetry(params: GetNetworkTelemetryRequest): Request[GetNetworkTelemetryResponse, AWSError] = js.native
  def getNetworkTelemetry(
    params: GetNetworkTelemetryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkTelemetryResponse, Unit]
  ): Request[GetNetworkTelemetryResponse, AWSError] = js.native
  
  /**
    * Returns information about a resource policy.
    */
  def getResourcePolicy(): Request[GetResourcePolicyResponse, AWSError] = js.native
  def getResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePolicyResponse, Unit]): Request[GetResourcePolicyResponse, AWSError] = js.native
  /**
    * Returns information about a resource policy.
    */
  def getResourcePolicy(params: GetResourcePolicyRequest): Request[GetResourcePolicyResponse, AWSError] = js.native
  def getResourcePolicy(
    params: GetResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePolicyResponse, Unit]
  ): Request[GetResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Gets information about the specified route analysis.
    */
  def getRouteAnalysis(): Request[GetRouteAnalysisResponse, AWSError] = js.native
  def getRouteAnalysis(callback: js.Function2[/* err */ AWSError, /* data */ GetRouteAnalysisResponse, Unit]): Request[GetRouteAnalysisResponse, AWSError] = js.native
  /**
    * Gets information about the specified route analysis.
    */
  def getRouteAnalysis(params: GetRouteAnalysisRequest): Request[GetRouteAnalysisResponse, AWSError] = js.native
  def getRouteAnalysis(
    params: GetRouteAnalysisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRouteAnalysisResponse, Unit]
  ): Request[GetRouteAnalysisResponse, AWSError] = js.native
  
  /**
    * Returns information about a site-to-site VPN attachment.
    */
  def getSiteToSiteVpnAttachment(): Request[GetSiteToSiteVpnAttachmentResponse, AWSError] = js.native
  def getSiteToSiteVpnAttachment(callback: js.Function2[/* err */ AWSError, /* data */ GetSiteToSiteVpnAttachmentResponse, Unit]): Request[GetSiteToSiteVpnAttachmentResponse, AWSError] = js.native
  /**
    * Returns information about a site-to-site VPN attachment.
    */
  def getSiteToSiteVpnAttachment(params: GetSiteToSiteVpnAttachmentRequest): Request[GetSiteToSiteVpnAttachmentResponse, AWSError] = js.native
  def getSiteToSiteVpnAttachment(
    params: GetSiteToSiteVpnAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSiteToSiteVpnAttachmentResponse, Unit]
  ): Request[GetSiteToSiteVpnAttachmentResponse, AWSError] = js.native
  
  /**
    * Gets information about one or more of your sites in a global network.
    */
  def getSites(): Request[GetSitesResponse, AWSError] = js.native
  def getSites(callback: js.Function2[/* err */ AWSError, /* data */ GetSitesResponse, Unit]): Request[GetSitesResponse, AWSError] = js.native
  /**
    * Gets information about one or more of your sites in a global network.
    */
  def getSites(params: GetSitesRequest): Request[GetSitesResponse, AWSError] = js.native
  def getSites(
    params: GetSitesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSitesResponse, Unit]
  ): Request[GetSitesResponse, AWSError] = js.native
  
  /**
    * Gets information about one or more of your transit gateway Connect peer associations in a global network.
    */
  def getTransitGatewayConnectPeerAssociations(): Request[GetTransitGatewayConnectPeerAssociationsResponse, AWSError] = js.native
  def getTransitGatewayConnectPeerAssociations(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetTransitGatewayConnectPeerAssociationsResponse, 
      Unit
    ]
  ): Request[GetTransitGatewayConnectPeerAssociationsResponse, AWSError] = js.native
  /**
    * Gets information about one or more of your transit gateway Connect peer associations in a global network.
    */
  def getTransitGatewayConnectPeerAssociations(params: GetTransitGatewayConnectPeerAssociationsRequest): Request[GetTransitGatewayConnectPeerAssociationsResponse, AWSError] = js.native
  def getTransitGatewayConnectPeerAssociations(
    params: GetTransitGatewayConnectPeerAssociationsRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetTransitGatewayConnectPeerAssociationsResponse, 
      Unit
    ]
  ): Request[GetTransitGatewayConnectPeerAssociationsResponse, AWSError] = js.native
  
  /**
    * Returns information about a transit gateway peer.
    */
  def getTransitGatewayPeering(): Request[GetTransitGatewayPeeringResponse, AWSError] = js.native
  def getTransitGatewayPeering(callback: js.Function2[/* err */ AWSError, /* data */ GetTransitGatewayPeeringResponse, Unit]): Request[GetTransitGatewayPeeringResponse, AWSError] = js.native
  /**
    * Returns information about a transit gateway peer.
    */
  def getTransitGatewayPeering(params: GetTransitGatewayPeeringRequest): Request[GetTransitGatewayPeeringResponse, AWSError] = js.native
  def getTransitGatewayPeering(
    params: GetTransitGatewayPeeringRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTransitGatewayPeeringResponse, Unit]
  ): Request[GetTransitGatewayPeeringResponse, AWSError] = js.native
  
  /**
    * Gets information about the transit gateway registrations in a specified global network.
    */
  def getTransitGatewayRegistrations(): Request[GetTransitGatewayRegistrationsResponse, AWSError] = js.native
  def getTransitGatewayRegistrations(
    callback: js.Function2[/* err */ AWSError, /* data */ GetTransitGatewayRegistrationsResponse, Unit]
  ): Request[GetTransitGatewayRegistrationsResponse, AWSError] = js.native
  /**
    * Gets information about the transit gateway registrations in a specified global network.
    */
  def getTransitGatewayRegistrations(params: GetTransitGatewayRegistrationsRequest): Request[GetTransitGatewayRegistrationsResponse, AWSError] = js.native
  def getTransitGatewayRegistrations(
    params: GetTransitGatewayRegistrationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTransitGatewayRegistrationsResponse, Unit]
  ): Request[GetTransitGatewayRegistrationsResponse, AWSError] = js.native
  
  /**
    * Returns information about a transit gateway route table attachment.
    */
  def getTransitGatewayRouteTableAttachment(): Request[GetTransitGatewayRouteTableAttachmentResponse, AWSError] = js.native
  def getTransitGatewayRouteTableAttachment(
    callback: js.Function2[/* err */ AWSError, /* data */ GetTransitGatewayRouteTableAttachmentResponse, Unit]
  ): Request[GetTransitGatewayRouteTableAttachmentResponse, AWSError] = js.native
  /**
    * Returns information about a transit gateway route table attachment.
    */
  def getTransitGatewayRouteTableAttachment(params: GetTransitGatewayRouteTableAttachmentRequest): Request[GetTransitGatewayRouteTableAttachmentResponse, AWSError] = js.native
  def getTransitGatewayRouteTableAttachment(
    params: GetTransitGatewayRouteTableAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTransitGatewayRouteTableAttachmentResponse, Unit]
  ): Request[GetTransitGatewayRouteTableAttachmentResponse, AWSError] = js.native
  
  /**
    * Returns information about a VPC attachment.
    */
  def getVpcAttachment(): Request[GetVpcAttachmentResponse, AWSError] = js.native
  def getVpcAttachment(callback: js.Function2[/* err */ AWSError, /* data */ GetVpcAttachmentResponse, Unit]): Request[GetVpcAttachmentResponse, AWSError] = js.native
  /**
    * Returns information about a VPC attachment.
    */
  def getVpcAttachment(params: GetVpcAttachmentRequest): Request[GetVpcAttachmentResponse, AWSError] = js.native
  def getVpcAttachment(
    params: GetVpcAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVpcAttachmentResponse, Unit]
  ): Request[GetVpcAttachmentResponse, AWSError] = js.native
  
  /**
    * Returns a list of core network attachments.
    */
  def listAttachments(): Request[ListAttachmentsResponse, AWSError] = js.native
  def listAttachments(callback: js.Function2[/* err */ AWSError, /* data */ ListAttachmentsResponse, Unit]): Request[ListAttachmentsResponse, AWSError] = js.native
  /**
    * Returns a list of core network attachments.
    */
  def listAttachments(params: ListAttachmentsRequest): Request[ListAttachmentsResponse, AWSError] = js.native
  def listAttachments(
    params: ListAttachmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAttachmentsResponse, Unit]
  ): Request[ListAttachmentsResponse, AWSError] = js.native
  
  /**
    * Returns a list of core network Connect peers.
    */
  def listConnectPeers(): Request[ListConnectPeersResponse, AWSError] = js.native
  def listConnectPeers(callback: js.Function2[/* err */ AWSError, /* data */ ListConnectPeersResponse, Unit]): Request[ListConnectPeersResponse, AWSError] = js.native
  /**
    * Returns a list of core network Connect peers.
    */
  def listConnectPeers(params: ListConnectPeersRequest): Request[ListConnectPeersResponse, AWSError] = js.native
  def listConnectPeers(
    params: ListConnectPeersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConnectPeersResponse, Unit]
  ): Request[ListConnectPeersResponse, AWSError] = js.native
  
  /**
    * Returns a list of core network policy versions.
    */
  def listCoreNetworkPolicyVersions(): Request[ListCoreNetworkPolicyVersionsResponse, AWSError] = js.native
  def listCoreNetworkPolicyVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListCoreNetworkPolicyVersionsResponse, Unit]): Request[ListCoreNetworkPolicyVersionsResponse, AWSError] = js.native
  /**
    * Returns a list of core network policy versions.
    */
  def listCoreNetworkPolicyVersions(params: ListCoreNetworkPolicyVersionsRequest): Request[ListCoreNetworkPolicyVersionsResponse, AWSError] = js.native
  def listCoreNetworkPolicyVersions(
    params: ListCoreNetworkPolicyVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCoreNetworkPolicyVersionsResponse, Unit]
  ): Request[ListCoreNetworkPolicyVersionsResponse, AWSError] = js.native
  
  /**
    * Returns a list of owned and shared core networks.
    */
  def listCoreNetworks(): Request[ListCoreNetworksResponse, AWSError] = js.native
  def listCoreNetworks(callback: js.Function2[/* err */ AWSError, /* data */ ListCoreNetworksResponse, Unit]): Request[ListCoreNetworksResponse, AWSError] = js.native
  /**
    * Returns a list of owned and shared core networks.
    */
  def listCoreNetworks(params: ListCoreNetworksRequest): Request[ListCoreNetworksResponse, AWSError] = js.native
  def listCoreNetworks(
    params: ListCoreNetworksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCoreNetworksResponse, Unit]
  ): Request[ListCoreNetworksResponse, AWSError] = js.native
  
  /**
    * Gets the status of the Service Linked Role (SLR) deployment for the accounts in a given Amazon Web Services Organization.
    */
  def listOrganizationServiceAccessStatus(): Request[ListOrganizationServiceAccessStatusResponse, AWSError] = js.native
  def listOrganizationServiceAccessStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ ListOrganizationServiceAccessStatusResponse, Unit]
  ): Request[ListOrganizationServiceAccessStatusResponse, AWSError] = js.native
  /**
    * Gets the status of the Service Linked Role (SLR) deployment for the accounts in a given Amazon Web Services Organization.
    */
  def listOrganizationServiceAccessStatus(params: ListOrganizationServiceAccessStatusRequest): Request[ListOrganizationServiceAccessStatusResponse, AWSError] = js.native
  def listOrganizationServiceAccessStatus(
    params: ListOrganizationServiceAccessStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOrganizationServiceAccessStatusResponse, Unit]
  ): Request[ListOrganizationServiceAccessStatusResponse, AWSError] = js.native
  
  /**
    * Lists the peerings for a core network.
    */
  def listPeerings(): Request[ListPeeringsResponse, AWSError] = js.native
  def listPeerings(callback: js.Function2[/* err */ AWSError, /* data */ ListPeeringsResponse, Unit]): Request[ListPeeringsResponse, AWSError] = js.native
  /**
    * Lists the peerings for a core network.
    */
  def listPeerings(params: ListPeeringsRequest): Request[ListPeeringsResponse, AWSError] = js.native
  def listPeerings(
    params: ListPeeringsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPeeringsResponse, Unit]
  ): Request[ListPeeringsResponse, AWSError] = js.native
  
  /**
    * Lists the tags for a specified resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags for a specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Creates a new, immutable version of a core network policy. A subsequent change set is created showing the differences between the LIVE policy and the submitted policy.
    */
  def putCoreNetworkPolicy(): Request[PutCoreNetworkPolicyResponse, AWSError] = js.native
  def putCoreNetworkPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutCoreNetworkPolicyResponse, Unit]): Request[PutCoreNetworkPolicyResponse, AWSError] = js.native
  /**
    * Creates a new, immutable version of a core network policy. A subsequent change set is created showing the differences between the LIVE policy and the submitted policy.
    */
  def putCoreNetworkPolicy(params: PutCoreNetworkPolicyRequest): Request[PutCoreNetworkPolicyResponse, AWSError] = js.native
  def putCoreNetworkPolicy(
    params: PutCoreNetworkPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutCoreNetworkPolicyResponse, Unit]
  ): Request[PutCoreNetworkPolicyResponse, AWSError] = js.native
  
  /**
    * Creates or updates a resource policy.
    */
  def putResourcePolicy(): Request[PutResourcePolicyResponse, AWSError] = js.native
  def putResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePolicyResponse, Unit]): Request[PutResourcePolicyResponse, AWSError] = js.native
  /**
    * Creates or updates a resource policy.
    */
  def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse, AWSError] = js.native
  def putResourcePolicy(
    params: PutResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePolicyResponse, Unit]
  ): Request[PutResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Registers a transit gateway in your global network. The transit gateway can be in any Amazon Web Services Region, but it must be owned by the same Amazon Web Services account that owns the global network. You cannot register a transit gateway in more than one global network.
    */
  def registerTransitGateway(): Request[RegisterTransitGatewayResponse, AWSError] = js.native
  def registerTransitGateway(callback: js.Function2[/* err */ AWSError, /* data */ RegisterTransitGatewayResponse, Unit]): Request[RegisterTransitGatewayResponse, AWSError] = js.native
  /**
    * Registers a transit gateway in your global network. The transit gateway can be in any Amazon Web Services Region, but it must be owned by the same Amazon Web Services account that owns the global network. You cannot register a transit gateway in more than one global network.
    */
  def registerTransitGateway(params: RegisterTransitGatewayRequest): Request[RegisterTransitGatewayResponse, AWSError] = js.native
  def registerTransitGateway(
    params: RegisterTransitGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterTransitGatewayResponse, Unit]
  ): Request[RegisterTransitGatewayResponse, AWSError] = js.native
  
  /**
    * Rejects a core network attachment request.
    */
  def rejectAttachment(): Request[RejectAttachmentResponse, AWSError] = js.native
  def rejectAttachment(callback: js.Function2[/* err */ AWSError, /* data */ RejectAttachmentResponse, Unit]): Request[RejectAttachmentResponse, AWSError] = js.native
  /**
    * Rejects a core network attachment request.
    */
  def rejectAttachment(params: RejectAttachmentRequest): Request[RejectAttachmentResponse, AWSError] = js.native
  def rejectAttachment(
    params: RejectAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RejectAttachmentResponse, Unit]
  ): Request[RejectAttachmentResponse, AWSError] = js.native
  
  /**
    * Restores a previous policy version as a new, immutable version of a core network policy. A subsequent change set is created showing the differences between the LIVE policy and restored policy.
    */
  def restoreCoreNetworkPolicyVersion(): Request[RestoreCoreNetworkPolicyVersionResponse, AWSError] = js.native
  def restoreCoreNetworkPolicyVersion(
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreCoreNetworkPolicyVersionResponse, Unit]
  ): Request[RestoreCoreNetworkPolicyVersionResponse, AWSError] = js.native
  /**
    * Restores a previous policy version as a new, immutable version of a core network policy. A subsequent change set is created showing the differences between the LIVE policy and restored policy.
    */
  def restoreCoreNetworkPolicyVersion(params: RestoreCoreNetworkPolicyVersionRequest): Request[RestoreCoreNetworkPolicyVersionResponse, AWSError] = js.native
  def restoreCoreNetworkPolicyVersion(
    params: RestoreCoreNetworkPolicyVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreCoreNetworkPolicyVersionResponse, Unit]
  ): Request[RestoreCoreNetworkPolicyVersionResponse, AWSError] = js.native
  
  /**
    * Enables for the Network Manager service for an Amazon Web Services Organization. This can only be called by a management account within the organization. 
    */
  def startOrganizationServiceAccessUpdate(): Request[StartOrganizationServiceAccessUpdateResponse, AWSError] = js.native
  def startOrganizationServiceAccessUpdate(
    callback: js.Function2[/* err */ AWSError, /* data */ StartOrganizationServiceAccessUpdateResponse, Unit]
  ): Request[StartOrganizationServiceAccessUpdateResponse, AWSError] = js.native
  /**
    * Enables for the Network Manager service for an Amazon Web Services Organization. This can only be called by a management account within the organization. 
    */
  def startOrganizationServiceAccessUpdate(params: StartOrganizationServiceAccessUpdateRequest): Request[StartOrganizationServiceAccessUpdateResponse, AWSError] = js.native
  def startOrganizationServiceAccessUpdate(
    params: StartOrganizationServiceAccessUpdateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartOrganizationServiceAccessUpdateResponse, Unit]
  ): Request[StartOrganizationServiceAccessUpdateResponse, AWSError] = js.native
  
  /**
    * Starts analyzing the routing path between the specified source and destination. For more information, see Route Analyzer.
    */
  def startRouteAnalysis(): Request[StartRouteAnalysisResponse, AWSError] = js.native
  def startRouteAnalysis(callback: js.Function2[/* err */ AWSError, /* data */ StartRouteAnalysisResponse, Unit]): Request[StartRouteAnalysisResponse, AWSError] = js.native
  /**
    * Starts analyzing the routing path between the specified source and destination. For more information, see Route Analyzer.
    */
  def startRouteAnalysis(params: StartRouteAnalysisRequest): Request[StartRouteAnalysisResponse, AWSError] = js.native
  def startRouteAnalysis(
    params: StartRouteAnalysisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartRouteAnalysisResponse, Unit]
  ): Request[StartRouteAnalysisResponse, AWSError] = js.native
  
  /**
    * Tags a specified resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Tags a specified resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from a specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from a specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the information for an existing connection. To remove information for any of the parameters, specify an empty string.
    */
  def updateConnection(): Request[UpdateConnectionResponse, AWSError] = js.native
  def updateConnection(callback: js.Function2[/* err */ AWSError, /* data */ UpdateConnectionResponse, Unit]): Request[UpdateConnectionResponse, AWSError] = js.native
  /**
    * Updates the information for an existing connection. To remove information for any of the parameters, specify an empty string.
    */
  def updateConnection(params: UpdateConnectionRequest): Request[UpdateConnectionResponse, AWSError] = js.native
  def updateConnection(
    params: UpdateConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConnectionResponse, Unit]
  ): Request[UpdateConnectionResponse, AWSError] = js.native
  
  /**
    * Updates the description of a core network.
    */
  def updateCoreNetwork(): Request[UpdateCoreNetworkResponse, AWSError] = js.native
  def updateCoreNetwork(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCoreNetworkResponse, Unit]): Request[UpdateCoreNetworkResponse, AWSError] = js.native
  /**
    * Updates the description of a core network.
    */
  def updateCoreNetwork(params: UpdateCoreNetworkRequest): Request[UpdateCoreNetworkResponse, AWSError] = js.native
  def updateCoreNetwork(
    params: UpdateCoreNetworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCoreNetworkResponse, Unit]
  ): Request[UpdateCoreNetworkResponse, AWSError] = js.native
  
  /**
    * Updates the details for an existing device. To remove information for any of the parameters, specify an empty string.
    */
  def updateDevice(): Request[UpdateDeviceResponse, AWSError] = js.native
  def updateDevice(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeviceResponse, Unit]): Request[UpdateDeviceResponse, AWSError] = js.native
  /**
    * Updates the details for an existing device. To remove information for any of the parameters, specify an empty string.
    */
  def updateDevice(params: UpdateDeviceRequest): Request[UpdateDeviceResponse, AWSError] = js.native
  def updateDevice(
    params: UpdateDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeviceResponse, Unit]
  ): Request[UpdateDeviceResponse, AWSError] = js.native
  
  /**
    * Updates an existing global network. To remove information for any of the parameters, specify an empty string.
    */
  def updateGlobalNetwork(): Request[UpdateGlobalNetworkResponse, AWSError] = js.native
  def updateGlobalNetwork(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGlobalNetworkResponse, Unit]): Request[UpdateGlobalNetworkResponse, AWSError] = js.native
  /**
    * Updates an existing global network. To remove information for any of the parameters, specify an empty string.
    */
  def updateGlobalNetwork(params: UpdateGlobalNetworkRequest): Request[UpdateGlobalNetworkResponse, AWSError] = js.native
  def updateGlobalNetwork(
    params: UpdateGlobalNetworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGlobalNetworkResponse, Unit]
  ): Request[UpdateGlobalNetworkResponse, AWSError] = js.native
  
  /**
    * Updates the details for an existing link. To remove information for any of the parameters, specify an empty string.
    */
  def updateLink(): Request[UpdateLinkResponse, AWSError] = js.native
  def updateLink(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLinkResponse, Unit]): Request[UpdateLinkResponse, AWSError] = js.native
  /**
    * Updates the details for an existing link. To remove information for any of the parameters, specify an empty string.
    */
  def updateLink(params: UpdateLinkRequest): Request[UpdateLinkResponse, AWSError] = js.native
  def updateLink(
    params: UpdateLinkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLinkResponse, Unit]
  ): Request[UpdateLinkResponse, AWSError] = js.native
  
  /**
    * Updates the resource metadata for the specified global network.
    */
  def updateNetworkResourceMetadata(): Request[UpdateNetworkResourceMetadataResponse, AWSError] = js.native
  def updateNetworkResourceMetadata(callback: js.Function2[/* err */ AWSError, /* data */ UpdateNetworkResourceMetadataResponse, Unit]): Request[UpdateNetworkResourceMetadataResponse, AWSError] = js.native
  /**
    * Updates the resource metadata for the specified global network.
    */
  def updateNetworkResourceMetadata(params: UpdateNetworkResourceMetadataRequest): Request[UpdateNetworkResourceMetadataResponse, AWSError] = js.native
  def updateNetworkResourceMetadata(
    params: UpdateNetworkResourceMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNetworkResourceMetadataResponse, Unit]
  ): Request[UpdateNetworkResourceMetadataResponse, AWSError] = js.native
  
  /**
    * Updates the information for an existing site. To remove information for any of the parameters, specify an empty string.
    */
  def updateSite(): Request[UpdateSiteResponse, AWSError] = js.native
  def updateSite(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSiteResponse, Unit]): Request[UpdateSiteResponse, AWSError] = js.native
  /**
    * Updates the information for an existing site. To remove information for any of the parameters, specify an empty string.
    */
  def updateSite(params: UpdateSiteRequest): Request[UpdateSiteResponse, AWSError] = js.native
  def updateSite(
    params: UpdateSiteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSiteResponse, Unit]
  ): Request[UpdateSiteResponse, AWSError] = js.native
  
  /**
    * Updates a VPC attachment.
    */
  def updateVpcAttachment(): Request[UpdateVpcAttachmentResponse, AWSError] = js.native
  def updateVpcAttachment(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVpcAttachmentResponse, Unit]): Request[UpdateVpcAttachmentResponse, AWSError] = js.native
  /**
    * Updates a VPC attachment.
    */
  def updateVpcAttachment(params: UpdateVpcAttachmentRequest): Request[UpdateVpcAttachmentResponse, AWSError] = js.native
  def updateVpcAttachment(
    params: UpdateVpcAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVpcAttachmentResponse, Unit]
  ): Request[UpdateVpcAttachmentResponse, AWSError] = js.native
}
