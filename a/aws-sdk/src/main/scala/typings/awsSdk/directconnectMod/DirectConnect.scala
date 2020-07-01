package typings.awsSdk.directconnectMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectConnect extends Service {
  @JSName("config")
  var config_DirectConnect: ConfigBase with ClientConfiguration = js.native
  /**
    * Accepts a proposal request to attach a virtual private gateway or transit gateway to a Direct Connect gateway.
    */
  def acceptDirectConnectGatewayAssociationProposal(): Request[AcceptDirectConnectGatewayAssociationProposalResult, AWSError] = js.native
  def acceptDirectConnectGatewayAssociationProposal(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AcceptDirectConnectGatewayAssociationProposalResult, 
      Unit
    ]
  ): Request[AcceptDirectConnectGatewayAssociationProposalResult, AWSError] = js.native
  /**
    * Accepts a proposal request to attach a virtual private gateway or transit gateway to a Direct Connect gateway.
    */
  def acceptDirectConnectGatewayAssociationProposal(params: AcceptDirectConnectGatewayAssociationProposalRequest): Request[AcceptDirectConnectGatewayAssociationProposalResult, AWSError] = js.native
  def acceptDirectConnectGatewayAssociationProposal(
    params: AcceptDirectConnectGatewayAssociationProposalRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AcceptDirectConnectGatewayAssociationProposalResult, 
      Unit
    ]
  ): Request[AcceptDirectConnectGatewayAssociationProposalResult, AWSError] = js.native
  /**
    * Deprecated. Use AllocateHostedConnection instead. Creates a hosted connection on an interconnect. Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified interconnect.  Intended for use by AWS Direct Connect Partners only. 
    */
  def allocateConnectionOnInterconnect(): Request[Connection, AWSError] = js.native
  def allocateConnectionOnInterconnect(callback: js.Function2[/* err */ AWSError, /* data */ Connection, Unit]): Request[Connection, AWSError] = js.native
  /**
    * Deprecated. Use AllocateHostedConnection instead. Creates a hosted connection on an interconnect. Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified interconnect.  Intended for use by AWS Direct Connect Partners only. 
    */
  def allocateConnectionOnInterconnect(params: AllocateConnectionOnInterconnectRequest): Request[Connection, AWSError] = js.native
  def allocateConnectionOnInterconnect(
    params: AllocateConnectionOnInterconnectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Connection, Unit]
  ): Request[Connection, AWSError] = js.native
  /**
    * Creates a hosted connection on the specified interconnect or a link aggregation group (LAG) of interconnects. Allocates a VLAN number and a specified amount of capacity (bandwidth) for use by a hosted connection on the specified interconnect or LAG of interconnects. AWS polices the hosted connection for the specified capacity and the AWS Direct Connect Partner must also police the hosted connection for the specified capacity.  Intended for use by AWS Direct Connect Partners only. 
    */
  def allocateHostedConnection(): Request[Connection, AWSError] = js.native
  def allocateHostedConnection(callback: js.Function2[/* err */ AWSError, /* data */ Connection, Unit]): Request[Connection, AWSError] = js.native
  /**
    * Creates a hosted connection on the specified interconnect or a link aggregation group (LAG) of interconnects. Allocates a VLAN number and a specified amount of capacity (bandwidth) for use by a hosted connection on the specified interconnect or LAG of interconnects. AWS polices the hosted connection for the specified capacity and the AWS Direct Connect Partner must also police the hosted connection for the specified capacity.  Intended for use by AWS Direct Connect Partners only. 
    */
  def allocateHostedConnection(params: AllocateHostedConnectionRequest): Request[Connection, AWSError] = js.native
  def allocateHostedConnection(
    params: AllocateHostedConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Connection, Unit]
  ): Request[Connection, AWSError] = js.native
  /**
    * Provisions a private virtual interface to be owned by the specified AWS account. Virtual interfaces created using this action must be confirmed by the owner using ConfirmPrivateVirtualInterface. Until then, the virtual interface is in the Confirming state and is not available to handle traffic.
    */
  def allocatePrivateVirtualInterface(): Request[VirtualInterface, AWSError] = js.native
  def allocatePrivateVirtualInterface(callback: js.Function2[/* err */ AWSError, /* data */ VirtualInterface, Unit]): Request[VirtualInterface, AWSError] = js.native
  /**
    * Provisions a private virtual interface to be owned by the specified AWS account. Virtual interfaces created using this action must be confirmed by the owner using ConfirmPrivateVirtualInterface. Until then, the virtual interface is in the Confirming state and is not available to handle traffic.
    */
  def allocatePrivateVirtualInterface(params: AllocatePrivateVirtualInterfaceRequest): Request[VirtualInterface, AWSError] = js.native
  def allocatePrivateVirtualInterface(
    params: AllocatePrivateVirtualInterfaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ VirtualInterface, Unit]
  ): Request[VirtualInterface, AWSError] = js.native
  /**
    * Provisions a public virtual interface to be owned by the specified AWS account. The owner of a connection calls this function to provision a public virtual interface to be owned by the specified AWS account. Virtual interfaces created using this function must be confirmed by the owner using ConfirmPublicVirtualInterface. Until this step has been completed, the virtual interface is in the confirming state and is not available to handle traffic. When creating an IPv6 public virtual interface, omit the Amazon address and customer address. IPv6 addresses are automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
    */
  def allocatePublicVirtualInterface(): Request[VirtualInterface, AWSError] = js.native
  def allocatePublicVirtualInterface(callback: js.Function2[/* err */ AWSError, /* data */ VirtualInterface, Unit]): Request[VirtualInterface, AWSError] = js.native
  /**
    * Provisions a public virtual interface to be owned by the specified AWS account. The owner of a connection calls this function to provision a public virtual interface to be owned by the specified AWS account. Virtual interfaces created using this function must be confirmed by the owner using ConfirmPublicVirtualInterface. Until this step has been completed, the virtual interface is in the confirming state and is not available to handle traffic. When creating an IPv6 public virtual interface, omit the Amazon address and customer address. IPv6 addresses are automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
    */
  def allocatePublicVirtualInterface(params: AllocatePublicVirtualInterfaceRequest): Request[VirtualInterface, AWSError] = js.native
  def allocatePublicVirtualInterface(
    params: AllocatePublicVirtualInterfaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ VirtualInterface, Unit]
  ): Request[VirtualInterface, AWSError] = js.native
  /**
    * Provisions a transit virtual interface to be owned by the specified AWS account. Use this type of interface to connect a transit gateway to your Direct Connect gateway. The owner of a connection provisions a transit virtual interface to be owned by the specified AWS account. After you create a transit virtual interface, it must be confirmed by the owner using ConfirmTransitVirtualInterface. Until this step has been completed, the transit virtual interface is in the requested state and is not available to handle traffic.
    */
  def allocateTransitVirtualInterface(): Request[AllocateTransitVirtualInterfaceResult, AWSError] = js.native
  def allocateTransitVirtualInterface(callback: js.Function2[/* err */ AWSError, /* data */ AllocateTransitVirtualInterfaceResult, Unit]): Request[AllocateTransitVirtualInterfaceResult, AWSError] = js.native
  /**
    * Provisions a transit virtual interface to be owned by the specified AWS account. Use this type of interface to connect a transit gateway to your Direct Connect gateway. The owner of a connection provisions a transit virtual interface to be owned by the specified AWS account. After you create a transit virtual interface, it must be confirmed by the owner using ConfirmTransitVirtualInterface. Until this step has been completed, the transit virtual interface is in the requested state and is not available to handle traffic.
    */
  def allocateTransitVirtualInterface(params: AllocateTransitVirtualInterfaceRequest): Request[AllocateTransitVirtualInterfaceResult, AWSError] = js.native
  def allocateTransitVirtualInterface(
    params: AllocateTransitVirtualInterfaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AllocateTransitVirtualInterfaceResult, Unit]
  ): Request[AllocateTransitVirtualInterfaceResult, AWSError] = js.native
  /**
    * Associates an existing connection with a link aggregation group (LAG). The connection is interrupted and re-established as a member of the LAG (connectivity to AWS is interrupted). The connection must be hosted on the same AWS Direct Connect endpoint as the LAG, and its bandwidth must match the bandwidth for the LAG. You can re-associate a connection that's currently associated with a different LAG; however, if removing the connection would cause the original LAG to fall below its setting for minimum number of operational connections, the request fails. Any virtual interfaces that are directly associated with the connection are automatically re-associated with the LAG. If the connection was originally associated with a different LAG, the virtual interfaces remain associated with the original LAG. For interconnects, any hosted connections are automatically re-associated with the LAG. If the interconnect was originally associated with a different LAG, the hosted connections remain associated with the original LAG.
    */
  def associateConnectionWithLag(): Request[Connection, AWSError] = js.native
  def associateConnectionWithLag(callback: js.Function2[/* err */ AWSError, /* data */ Connection, Unit]): Request[Connection, AWSError] = js.native
  /**
    * Associates an existing connection with a link aggregation group (LAG). The connection is interrupted and re-established as a member of the LAG (connectivity to AWS is interrupted). The connection must be hosted on the same AWS Direct Connect endpoint as the LAG, and its bandwidth must match the bandwidth for the LAG. You can re-associate a connection that's currently associated with a different LAG; however, if removing the connection would cause the original LAG to fall below its setting for minimum number of operational connections, the request fails. Any virtual interfaces that are directly associated with the connection are automatically re-associated with the LAG. If the connection was originally associated with a different LAG, the virtual interfaces remain associated with the original LAG. For interconnects, any hosted connections are automatically re-associated with the LAG. If the interconnect was originally associated with a different LAG, the hosted connections remain associated with the original LAG.
    */
  def associateConnectionWithLag(params: AssociateConnectionWithLagRequest): Request[Connection, AWSError] = js.native
  def associateConnectionWithLag(
    params: AssociateConnectionWithLagRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Connection, Unit]
  ): Request[Connection, AWSError] = js.native
  /**
    * Associates a hosted connection and its virtual interfaces with a link aggregation group (LAG) or interconnect. If the target interconnect or LAG has an existing hosted connection with a conflicting VLAN number or IP address, the operation fails. This action temporarily interrupts the hosted connection's connectivity to AWS as it is being migrated.  Intended for use by AWS Direct Connect Partners only. 
    */
  def associateHostedConnection(): Request[Connection, AWSError] = js.native
  def associateHostedConnection(callback: js.Function2[/* err */ AWSError, /* data */ Connection, Unit]): Request[Connection, AWSError] = js.native
  /**
    * Associates a hosted connection and its virtual interfaces with a link aggregation group (LAG) or interconnect. If the target interconnect or LAG has an existing hosted connection with a conflicting VLAN number or IP address, the operation fails. This action temporarily interrupts the hosted connection's connectivity to AWS as it is being migrated.  Intended for use by AWS Direct Connect Partners only. 
    */
  def associateHostedConnection(params: AssociateHostedConnectionRequest): Request[Connection, AWSError] = js.native
  def associateHostedConnection(
    params: AssociateHostedConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Connection, Unit]
  ): Request[Connection, AWSError] = js.native
  /**
    * Associates a virtual interface with a specified link aggregation group (LAG) or connection. Connectivity to AWS is temporarily interrupted as the virtual interface is being migrated. If the target connection or LAG has an associated virtual interface with a conflicting VLAN number or a conflicting IP address, the operation fails. Virtual interfaces associated with a hosted connection cannot be associated with a LAG; hosted connections must be migrated along with their virtual interfaces using AssociateHostedConnection. To reassociate a virtual interface to a new connection or LAG, the requester must own either the virtual interface itself or the connection to which the virtual interface is currently associated. Additionally, the requester must own the connection or LAG for the association.
    */
  def associateVirtualInterface(): Request[VirtualInterface, AWSError] = js.native
  def associateVirtualInterface(callback: js.Function2[/* err */ AWSError, /* data */ VirtualInterface, Unit]): Request[VirtualInterface, AWSError] = js.native
  /**
    * Associates a virtual interface with a specified link aggregation group (LAG) or connection. Connectivity to AWS is temporarily interrupted as the virtual interface is being migrated. If the target connection or LAG has an associated virtual interface with a conflicting VLAN number or a conflicting IP address, the operation fails. Virtual interfaces associated with a hosted connection cannot be associated with a LAG; hosted connections must be migrated along with their virtual interfaces using AssociateHostedConnection. To reassociate a virtual interface to a new connection or LAG, the requester must own either the virtual interface itself or the connection to which the virtual interface is currently associated. Additionally, the requester must own the connection or LAG for the association.
    */
  def associateVirtualInterface(params: AssociateVirtualInterfaceRequest): Request[VirtualInterface, AWSError] = js.native
  def associateVirtualInterface(
    params: AssociateVirtualInterfaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ VirtualInterface, Unit]
  ): Request[VirtualInterface, AWSError] = js.native
  /**
    * Confirms the creation of the specified hosted connection on an interconnect. Upon creation, the hosted connection is initially in the Ordering state, and remains in this state until the owner confirms creation of the hosted connection.
    */
  def confirmConnection(): Request[ConfirmConnectionResponse, AWSError] = js.native
  def confirmConnection(callback: js.Function2[/* err */ AWSError, /* data */ ConfirmConnectionResponse, Unit]): Request[ConfirmConnectionResponse, AWSError] = js.native
  /**
    * Confirms the creation of the specified hosted connection on an interconnect. Upon creation, the hosted connection is initially in the Ordering state, and remains in this state until the owner confirms creation of the hosted connection.
    */
  def confirmConnection(params: ConfirmConnectionRequest): Request[ConfirmConnectionResponse, AWSError] = js.native
  def confirmConnection(
    params: ConfirmConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfirmConnectionResponse, Unit]
  ): Request[ConfirmConnectionResponse, AWSError] = js.native
  /**
    * Accepts ownership of a private virtual interface created by another AWS account. After the virtual interface owner makes this call, the virtual interface is created and attached to the specified virtual private gateway or Direct Connect gateway, and is made available to handle traffic.
    */
  def confirmPrivateVirtualInterface(): Request[ConfirmPrivateVirtualInterfaceResponse, AWSError] = js.native
  def confirmPrivateVirtualInterface(
    callback: js.Function2[/* err */ AWSError, /* data */ ConfirmPrivateVirtualInterfaceResponse, Unit]
  ): Request[ConfirmPrivateVirtualInterfaceResponse, AWSError] = js.native
  /**
    * Accepts ownership of a private virtual interface created by another AWS account. After the virtual interface owner makes this call, the virtual interface is created and attached to the specified virtual private gateway or Direct Connect gateway, and is made available to handle traffic.
    */
  def confirmPrivateVirtualInterface(params: ConfirmPrivateVirtualInterfaceRequest): Request[ConfirmPrivateVirtualInterfaceResponse, AWSError] = js.native
  def confirmPrivateVirtualInterface(
    params: ConfirmPrivateVirtualInterfaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfirmPrivateVirtualInterfaceResponse, Unit]
  ): Request[ConfirmPrivateVirtualInterfaceResponse, AWSError] = js.native
  /**
    * Accepts ownership of a public virtual interface created by another AWS account. After the virtual interface owner makes this call, the specified virtual interface is created and made available to handle traffic.
    */
  def confirmPublicVirtualInterface(): Request[ConfirmPublicVirtualInterfaceResponse, AWSError] = js.native
  def confirmPublicVirtualInterface(callback: js.Function2[/* err */ AWSError, /* data */ ConfirmPublicVirtualInterfaceResponse, Unit]): Request[ConfirmPublicVirtualInterfaceResponse, AWSError] = js.native
  /**
    * Accepts ownership of a public virtual interface created by another AWS account. After the virtual interface owner makes this call, the specified virtual interface is created and made available to handle traffic.
    */
  def confirmPublicVirtualInterface(params: ConfirmPublicVirtualInterfaceRequest): Request[ConfirmPublicVirtualInterfaceResponse, AWSError] = js.native
  def confirmPublicVirtualInterface(
    params: ConfirmPublicVirtualInterfaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfirmPublicVirtualInterfaceResponse, Unit]
  ): Request[ConfirmPublicVirtualInterfaceResponse, AWSError] = js.native
  /**
    * Accepts ownership of a transit virtual interface created by another AWS account.  After the owner of the transit virtual interface makes this call, the specified transit virtual interface is created and made available to handle traffic.
    */
  def confirmTransitVirtualInterface(): Request[ConfirmTransitVirtualInterfaceResponse, AWSError] = js.native
  def confirmTransitVirtualInterface(
    callback: js.Function2[/* err */ AWSError, /* data */ ConfirmTransitVirtualInterfaceResponse, Unit]
  ): Request[ConfirmTransitVirtualInterfaceResponse, AWSError] = js.native
  /**
    * Accepts ownership of a transit virtual interface created by another AWS account.  After the owner of the transit virtual interface makes this call, the specified transit virtual interface is created and made available to handle traffic.
    */
  def confirmTransitVirtualInterface(params: ConfirmTransitVirtualInterfaceRequest): Request[ConfirmTransitVirtualInterfaceResponse, AWSError] = js.native
  def confirmTransitVirtualInterface(
    params: ConfirmTransitVirtualInterfaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfirmTransitVirtualInterfaceResponse, Unit]
  ): Request[ConfirmTransitVirtualInterfaceResponse, AWSError] = js.native
  /**
    * Creates a BGP peer on the specified virtual interface. You must create a BGP peer for the corresponding address family (IPv4/IPv6) in order to access AWS resources that also use that address family. If logical redundancy is not supported by the connection, interconnect, or LAG, the BGP peer cannot be in the same address family as an existing BGP peer on the virtual interface. When creating a IPv6 BGP peer, omit the Amazon address and customer address. IPv6 addresses are automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses. For a public virtual interface, the Autonomous System Number (ASN) must be private or already whitelisted for the virtual interface.
    */
  def createBGPPeer(): Request[CreateBGPPeerResponse, AWSError] = js.native
  def createBGPPeer(callback: js.Function2[/* err */ AWSError, /* data */ CreateBGPPeerResponse, Unit]): Request[CreateBGPPeerResponse, AWSError] = js.native
  /**
    * Creates a BGP peer on the specified virtual interface. You must create a BGP peer for the corresponding address family (IPv4/IPv6) in order to access AWS resources that also use that address family. If logical redundancy is not supported by the connection, interconnect, or LAG, the BGP peer cannot be in the same address family as an existing BGP peer on the virtual interface. When creating a IPv6 BGP peer, omit the Amazon address and customer address. IPv6 addresses are automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses. For a public virtual interface, the Autonomous System Number (ASN) must be private or already whitelisted for the virtual interface.
    */
  def createBGPPeer(params: CreateBGPPeerRequest): Request[CreateBGPPeerResponse, AWSError] = js.native
  def createBGPPeer(
    params: CreateBGPPeerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBGPPeerResponse, Unit]
  ): Request[CreateBGPPeerResponse, AWSError] = js.native
  /**
    * Creates a connection between a customer network and a specific AWS Direct Connect location. A connection links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router. To find the locations for your Region, use DescribeLocations. You can automatically add the new connection to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new connection is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no connection is created.
    */
  def createConnection(): Request[Connection, AWSError] = js.native
  def createConnection(callback: js.Function2[/* err */ AWSError, /* data */ Connection, Unit]): Request[Connection, AWSError] = js.native
  /**
    * Creates a connection between a customer network and a specific AWS Direct Connect location. A connection links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router. To find the locations for your Region, use DescribeLocations. You can automatically add the new connection to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new connection is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no connection is created.
    */
  def createConnection(params: CreateConnectionRequest): Request[Connection, AWSError] = js.native
  def createConnection(
    params: CreateConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Connection, Unit]
  ): Request[Connection, AWSError] = js.native
  /**
    * Creates a Direct Connect gateway, which is an intermediate object that enables you to connect a set of virtual interfaces and virtual private gateways. A Direct Connect gateway is global and visible in any AWS Region after it is created. The virtual interfaces and virtual private gateways that are connected through a Direct Connect gateway can be in different AWS Regions. This enables you to connect to a VPC in any Region, regardless of the Region in which the virtual interfaces are located, and pass traffic between them.
    */
  def createDirectConnectGateway(): Request[CreateDirectConnectGatewayResult, AWSError] = js.native
  def createDirectConnectGateway(callback: js.Function2[/* err */ AWSError, /* data */ CreateDirectConnectGatewayResult, Unit]): Request[CreateDirectConnectGatewayResult, AWSError] = js.native
  /**
    * Creates a Direct Connect gateway, which is an intermediate object that enables you to connect a set of virtual interfaces and virtual private gateways. A Direct Connect gateway is global and visible in any AWS Region after it is created. The virtual interfaces and virtual private gateways that are connected through a Direct Connect gateway can be in different AWS Regions. This enables you to connect to a VPC in any Region, regardless of the Region in which the virtual interfaces are located, and pass traffic between them.
    */
  def createDirectConnectGateway(params: CreateDirectConnectGatewayRequest): Request[CreateDirectConnectGatewayResult, AWSError] = js.native
  def createDirectConnectGateway(
    params: CreateDirectConnectGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDirectConnectGatewayResult, Unit]
  ): Request[CreateDirectConnectGatewayResult, AWSError] = js.native
  /**
    * Creates an association between a Direct Connect gateway and a virtual private gateway. The virtual private gateway must be attached to a VPC and must not be associated with another Direct Connect gateway.
    */
  def createDirectConnectGatewayAssociation(): Request[CreateDirectConnectGatewayAssociationResult, AWSError] = js.native
  def createDirectConnectGatewayAssociation(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDirectConnectGatewayAssociationResult, Unit]
  ): Request[CreateDirectConnectGatewayAssociationResult, AWSError] = js.native
  /**
    * Creates an association between a Direct Connect gateway and a virtual private gateway. The virtual private gateway must be attached to a VPC and must not be associated with another Direct Connect gateway.
    */
  def createDirectConnectGatewayAssociation(params: CreateDirectConnectGatewayAssociationRequest): Request[CreateDirectConnectGatewayAssociationResult, AWSError] = js.native
  def createDirectConnectGatewayAssociation(
    params: CreateDirectConnectGatewayAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDirectConnectGatewayAssociationResult, Unit]
  ): Request[CreateDirectConnectGatewayAssociationResult, AWSError] = js.native
  /**
    * Creates a proposal to associate the specified virtual private gateway or transit gateway with the specified Direct Connect gateway. You can only associate a Direct Connect gateway and virtual private gateway or transit gateway when the account that owns the Direct Connect gateway and the account that owns the virtual private gateway or transit gateway have the same AWS Payer ID.
    */
  def createDirectConnectGatewayAssociationProposal(): Request[CreateDirectConnectGatewayAssociationProposalResult, AWSError] = js.native
  def createDirectConnectGatewayAssociationProposal(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ CreateDirectConnectGatewayAssociationProposalResult, 
      Unit
    ]
  ): Request[CreateDirectConnectGatewayAssociationProposalResult, AWSError] = js.native
  /**
    * Creates a proposal to associate the specified virtual private gateway or transit gateway with the specified Direct Connect gateway. You can only associate a Direct Connect gateway and virtual private gateway or transit gateway when the account that owns the Direct Connect gateway and the account that owns the virtual private gateway or transit gateway have the same AWS Payer ID.
    */
  def createDirectConnectGatewayAssociationProposal(params: CreateDirectConnectGatewayAssociationProposalRequest): Request[CreateDirectConnectGatewayAssociationProposalResult, AWSError] = js.native
  def createDirectConnectGatewayAssociationProposal(
    params: CreateDirectConnectGatewayAssociationProposalRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ CreateDirectConnectGatewayAssociationProposalResult, 
      Unit
    ]
  ): Request[CreateDirectConnectGatewayAssociationProposalResult, AWSError] = js.native
  /**
    * Creates an interconnect between an AWS Direct Connect Partner's network and a specific AWS Direct Connect location. An interconnect is a connection that is capable of hosting other connections. The AWS Direct Connect partner can use an interconnect to provide AWS Direct Connect hosted connections to customers through their own network services. Like a standard connection, an interconnect links the partner's network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end is connected to the partner's router, the other to an AWS Direct Connect router. You can automatically add the new interconnect to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new interconnect is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no interconnect is created. For each end customer, the AWS Direct Connect Partner provisions a connection on their interconnect by calling AllocateHostedConnection. The end customer can then connect to AWS resources by creating a virtual interface on their connection, using the VLAN assigned to them by the AWS Direct Connect Partner.  Intended for use by AWS Direct Connect Partners only. 
    */
  def createInterconnect(): Request[Interconnect, AWSError] = js.native
  def createInterconnect(callback: js.Function2[/* err */ AWSError, /* data */ Interconnect, Unit]): Request[Interconnect, AWSError] = js.native
  /**
    * Creates an interconnect between an AWS Direct Connect Partner's network and a specific AWS Direct Connect location. An interconnect is a connection that is capable of hosting other connections. The AWS Direct Connect partner can use an interconnect to provide AWS Direct Connect hosted connections to customers through their own network services. Like a standard connection, an interconnect links the partner's network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end is connected to the partner's router, the other to an AWS Direct Connect router. You can automatically add the new interconnect to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new interconnect is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no interconnect is created. For each end customer, the AWS Direct Connect Partner provisions a connection on their interconnect by calling AllocateHostedConnection. The end customer can then connect to AWS resources by creating a virtual interface on their connection, using the VLAN assigned to them by the AWS Direct Connect Partner.  Intended for use by AWS Direct Connect Partners only. 
    */
  def createInterconnect(params: CreateInterconnectRequest): Request[Interconnect, AWSError] = js.native
  def createInterconnect(
    params: CreateInterconnectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Interconnect, Unit]
  ): Request[Interconnect, AWSError] = js.native
  /**
    * Creates a link aggregation group (LAG) with the specified number of bundled physical connections between the customer network and a specific AWS Direct Connect location. A LAG is a logical interface that uses the Link Aggregation Control Protocol (LACP) to aggregate multiple interfaces, enabling you to treat them as a single interface. All connections in a LAG must use the same bandwidth and must terminate at the same AWS Direct Connect endpoint. You can have up to 10 connections per LAG. Regardless of this limit, if you request more connections for the LAG than AWS Direct Connect can allocate on a single endpoint, no LAG is created. You can specify an existing physical connection or interconnect to include in the LAG (which counts towards the total number of connections). Doing so interrupts the current physical connection or hosted connections, and re-establishes them as a member of the LAG. The LAG will be created on the same AWS Direct Connect endpoint to which the connection terminates. Any virtual interfaces associated with the connection are automatically disassociated and re-associated with the LAG. The connection ID does not change. If the AWS account used to create a LAG is a registered AWS Direct Connect Partner, the LAG is automatically enabled to host sub-connections. For a LAG owned by a partner, any associated virtual interfaces cannot be directly configured.
    */
  def createLag(): Request[Lag, AWSError] = js.native
  def createLag(callback: js.Function2[/* err */ AWSError, /* data */ Lag, Unit]): Request[Lag, AWSError] = js.native
  /**
    * Creates a link aggregation group (LAG) with the specified number of bundled physical connections between the customer network and a specific AWS Direct Connect location. A LAG is a logical interface that uses the Link Aggregation Control Protocol (LACP) to aggregate multiple interfaces, enabling you to treat them as a single interface. All connections in a LAG must use the same bandwidth and must terminate at the same AWS Direct Connect endpoint. You can have up to 10 connections per LAG. Regardless of this limit, if you request more connections for the LAG than AWS Direct Connect can allocate on a single endpoint, no LAG is created. You can specify an existing physical connection or interconnect to include in the LAG (which counts towards the total number of connections). Doing so interrupts the current physical connection or hosted connections, and re-establishes them as a member of the LAG. The LAG will be created on the same AWS Direct Connect endpoint to which the connection terminates. Any virtual interfaces associated with the connection are automatically disassociated and re-associated with the LAG. The connection ID does not change. If the AWS account used to create a LAG is a registered AWS Direct Connect Partner, the LAG is automatically enabled to host sub-connections. For a LAG owned by a partner, any associated virtual interfaces cannot be directly configured.
    */
  def createLag(params: CreateLagRequest): Request[Lag, AWSError] = js.native
  def createLag(params: CreateLagRequest, callback: js.Function2[/* err */ AWSError, /* data */ Lag, Unit]): Request[Lag, AWSError] = js.native
  /**
    * Creates a private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A private virtual interface can be connected to either a Direct Connect gateway or a Virtual Private Gateway (VGW). Connecting the private virtual interface to a Direct Connect gateway enables the possibility for connecting to multiple VPCs, including VPCs in different AWS Regions. Connecting the private virtual interface to a VGW only provides access to a single VPC within the same Region. Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an update to the underlying physical connection if it wasn't updated to support jumbo frames. Updating the connection disrupts network connectivity for all virtual interfaces associated with the connection for up to 30 seconds. To check whether your connection supports jumbo frames, call DescribeConnections. To check whether your virtual interface supports jumbo frames, call DescribeVirtualInterfaces.
    */
  def createPrivateVirtualInterface(): Request[VirtualInterface, AWSError] = js.native
  def createPrivateVirtualInterface(callback: js.Function2[/* err */ AWSError, /* data */ VirtualInterface, Unit]): Request[VirtualInterface, AWSError] = js.native
  /**
    * Creates a private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A private virtual interface can be connected to either a Direct Connect gateway or a Virtual Private Gateway (VGW). Connecting the private virtual interface to a Direct Connect gateway enables the possibility for connecting to multiple VPCs, including VPCs in different AWS Regions. Connecting the private virtual interface to a VGW only provides access to a single VPC within the same Region. Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an update to the underlying physical connection if it wasn't updated to support jumbo frames. Updating the connection disrupts network connectivity for all virtual interfaces associated with the connection for up to 30 seconds. To check whether your connection supports jumbo frames, call DescribeConnections. To check whether your virtual interface supports jumbo frames, call DescribeVirtualInterfaces.
    */
  def createPrivateVirtualInterface(params: CreatePrivateVirtualInterfaceRequest): Request[VirtualInterface, AWSError] = js.native
  def createPrivateVirtualInterface(
    params: CreatePrivateVirtualInterfaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ VirtualInterface, Unit]
  ): Request[VirtualInterface, AWSError] = js.native
  /**
    * Creates a public virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A public virtual interface supports sending traffic to public services of AWS such as Amazon S3. When creating an IPv6 public virtual interface (addressFamily is ipv6), leave the customer and amazon address fields blank to use auto-assigned IPv6 space. Custom IPv6 addresses are not supported.
    */
  def createPublicVirtualInterface(): Request[VirtualInterface, AWSError] = js.native
  def createPublicVirtualInterface(callback: js.Function2[/* err */ AWSError, /* data */ VirtualInterface, Unit]): Request[VirtualInterface, AWSError] = js.native
  /**
    * Creates a public virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A public virtual interface supports sending traffic to public services of AWS such as Amazon S3. When creating an IPv6 public virtual interface (addressFamily is ipv6), leave the customer and amazon address fields blank to use auto-assigned IPv6 space. Custom IPv6 addresses are not supported.
    */
  def createPublicVirtualInterface(params: CreatePublicVirtualInterfaceRequest): Request[VirtualInterface, AWSError] = js.native
  def createPublicVirtualInterface(
    params: CreatePublicVirtualInterfaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ VirtualInterface, Unit]
  ): Request[VirtualInterface, AWSError] = js.native
  /**
    * Creates a transit virtual interface. A transit virtual interface should be used to access one or more transit gateways associated with Direct Connect gateways. A transit virtual interface enables the connection of multiple VPCs attached to a transit gateway to a Direct Connect gateway.  If you associate your transit gateway with one or more Direct Connect gateways, the Autonomous System Number (ASN) used by the transit gateway and the Direct Connect gateway must be different. For example, if you use the default ASN 64512 for both your the transit gateway and Direct Connect gateway, the association request fails.  Setting the MTU of a virtual interface to 8500 (jumbo frames) can cause an update to the underlying physical connection if it wasn't updated to support jumbo frames. Updating the connection disrupts network connectivity for all virtual interfaces associated with the connection for up to 30 seconds. To check whether your connection supports jumbo frames, call DescribeConnections. To check whether your virtual interface supports jumbo frames, call DescribeVirtualInterfaces.
    */
  def createTransitVirtualInterface(): Request[CreateTransitVirtualInterfaceResult, AWSError] = js.native
  def createTransitVirtualInterface(callback: js.Function2[/* err */ AWSError, /* data */ CreateTransitVirtualInterfaceResult, Unit]): Request[CreateTransitVirtualInterfaceResult, AWSError] = js.native
  /**
    * Creates a transit virtual interface. A transit virtual interface should be used to access one or more transit gateways associated with Direct Connect gateways. A transit virtual interface enables the connection of multiple VPCs attached to a transit gateway to a Direct Connect gateway.  If you associate your transit gateway with one or more Direct Connect gateways, the Autonomous System Number (ASN) used by the transit gateway and the Direct Connect gateway must be different. For example, if you use the default ASN 64512 for both your the transit gateway and Direct Connect gateway, the association request fails.  Setting the MTU of a virtual interface to 8500 (jumbo frames) can cause an update to the underlying physical connection if it wasn't updated to support jumbo frames. Updating the connection disrupts network connectivity for all virtual interfaces associated with the connection for up to 30 seconds. To check whether your connection supports jumbo frames, call DescribeConnections. To check whether your virtual interface supports jumbo frames, call DescribeVirtualInterfaces.
    */
  def createTransitVirtualInterface(params: CreateTransitVirtualInterfaceRequest): Request[CreateTransitVirtualInterfaceResult, AWSError] = js.native
  def createTransitVirtualInterface(
    params: CreateTransitVirtualInterfaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTransitVirtualInterfaceResult, Unit]
  ): Request[CreateTransitVirtualInterfaceResult, AWSError] = js.native
  /**
    * Deletes the specified BGP peer on the specified virtual interface with the specified customer address and ASN. You cannot delete the last BGP peer from a virtual interface.
    */
  def deleteBGPPeer(): Request[DeleteBGPPeerResponse, AWSError] = js.native
  def deleteBGPPeer(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBGPPeerResponse, Unit]): Request[DeleteBGPPeerResponse, AWSError] = js.native
  /**
    * Deletes the specified BGP peer on the specified virtual interface with the specified customer address and ASN. You cannot delete the last BGP peer from a virtual interface.
    */
  def deleteBGPPeer(params: DeleteBGPPeerRequest): Request[DeleteBGPPeerResponse, AWSError] = js.native
  def deleteBGPPeer(
    params: DeleteBGPPeerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBGPPeerResponse, Unit]
  ): Request[DeleteBGPPeerResponse, AWSError] = js.native
  /**
    * Deletes the specified connection. Deleting a connection only stops the AWS Direct Connect port hour and data transfer charges. If you are partnering with any third parties to connect with the AWS Direct Connect location, you must cancel your service with them separately.
    */
  def deleteConnection(): Request[Connection, AWSError] = js.native
  def deleteConnection(callback: js.Function2[/* err */ AWSError, /* data */ Connection, Unit]): Request[Connection, AWSError] = js.native
  /**
    * Deletes the specified connection. Deleting a connection only stops the AWS Direct Connect port hour and data transfer charges. If you are partnering with any third parties to connect with the AWS Direct Connect location, you must cancel your service with them separately.
    */
  def deleteConnection(params: DeleteConnectionRequest): Request[Connection, AWSError] = js.native
  def deleteConnection(
    params: DeleteConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Connection, Unit]
  ): Request[Connection, AWSError] = js.native
  /**
    * Deletes the specified Direct Connect gateway. You must first delete all virtual interfaces that are attached to the Direct Connect gateway and disassociate all virtual private gateways associated with the Direct Connect gateway.
    */
  def deleteDirectConnectGateway(): Request[DeleteDirectConnectGatewayResult, AWSError] = js.native
  def deleteDirectConnectGateway(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDirectConnectGatewayResult, Unit]): Request[DeleteDirectConnectGatewayResult, AWSError] = js.native
  /**
    * Deletes the specified Direct Connect gateway. You must first delete all virtual interfaces that are attached to the Direct Connect gateway and disassociate all virtual private gateways associated with the Direct Connect gateway.
    */
  def deleteDirectConnectGateway(params: DeleteDirectConnectGatewayRequest): Request[DeleteDirectConnectGatewayResult, AWSError] = js.native
  def deleteDirectConnectGateway(
    params: DeleteDirectConnectGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDirectConnectGatewayResult, Unit]
  ): Request[DeleteDirectConnectGatewayResult, AWSError] = js.native
  /**
    * Deletes the association between the specified Direct Connect gateway and virtual private gateway. We recommend that you specify the associationID to delete the association. Alternatively, if you own virtual gateway and a Direct Connect gateway association, you can specify the virtualGatewayId and directConnectGatewayId to delete an association.
    */
  def deleteDirectConnectGatewayAssociation(): Request[DeleteDirectConnectGatewayAssociationResult, AWSError] = js.native
  def deleteDirectConnectGatewayAssociation(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDirectConnectGatewayAssociationResult, Unit]
  ): Request[DeleteDirectConnectGatewayAssociationResult, AWSError] = js.native
  /**
    * Deletes the association between the specified Direct Connect gateway and virtual private gateway. We recommend that you specify the associationID to delete the association. Alternatively, if you own virtual gateway and a Direct Connect gateway association, you can specify the virtualGatewayId and directConnectGatewayId to delete an association.
    */
  def deleteDirectConnectGatewayAssociation(params: DeleteDirectConnectGatewayAssociationRequest): Request[DeleteDirectConnectGatewayAssociationResult, AWSError] = js.native
  def deleteDirectConnectGatewayAssociation(
    params: DeleteDirectConnectGatewayAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDirectConnectGatewayAssociationResult, Unit]
  ): Request[DeleteDirectConnectGatewayAssociationResult, AWSError] = js.native
  /**
    * Deletes the association proposal request between the specified Direct Connect gateway and virtual private gateway or transit gateway.
    */
  def deleteDirectConnectGatewayAssociationProposal(): Request[DeleteDirectConnectGatewayAssociationProposalResult, AWSError] = js.native
  def deleteDirectConnectGatewayAssociationProposal(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeleteDirectConnectGatewayAssociationProposalResult, 
      Unit
    ]
  ): Request[DeleteDirectConnectGatewayAssociationProposalResult, AWSError] = js.native
  /**
    * Deletes the association proposal request between the specified Direct Connect gateway and virtual private gateway or transit gateway.
    */
  def deleteDirectConnectGatewayAssociationProposal(params: DeleteDirectConnectGatewayAssociationProposalRequest): Request[DeleteDirectConnectGatewayAssociationProposalResult, AWSError] = js.native
  def deleteDirectConnectGatewayAssociationProposal(
    params: DeleteDirectConnectGatewayAssociationProposalRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeleteDirectConnectGatewayAssociationProposalResult, 
      Unit
    ]
  ): Request[DeleteDirectConnectGatewayAssociationProposalResult, AWSError] = js.native
  /**
    * Deletes the specified interconnect.  Intended for use by AWS Direct Connect Partners only. 
    */
  def deleteInterconnect(): Request[DeleteInterconnectResponse, AWSError] = js.native
  def deleteInterconnect(callback: js.Function2[/* err */ AWSError, /* data */ DeleteInterconnectResponse, Unit]): Request[DeleteInterconnectResponse, AWSError] = js.native
  /**
    * Deletes the specified interconnect.  Intended for use by AWS Direct Connect Partners only. 
    */
  def deleteInterconnect(params: DeleteInterconnectRequest): Request[DeleteInterconnectResponse, AWSError] = js.native
  def deleteInterconnect(
    params: DeleteInterconnectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInterconnectResponse, Unit]
  ): Request[DeleteInterconnectResponse, AWSError] = js.native
  /**
    * Deletes the specified link aggregation group (LAG). You cannot delete a LAG if it has active virtual interfaces or hosted connections.
    */
  def deleteLag(): Request[Lag, AWSError] = js.native
  def deleteLag(callback: js.Function2[/* err */ AWSError, /* data */ Lag, Unit]): Request[Lag, AWSError] = js.native
  /**
    * Deletes the specified link aggregation group (LAG). You cannot delete a LAG if it has active virtual interfaces or hosted connections.
    */
  def deleteLag(params: DeleteLagRequest): Request[Lag, AWSError] = js.native
  def deleteLag(params: DeleteLagRequest, callback: js.Function2[/* err */ AWSError, /* data */ Lag, Unit]): Request[Lag, AWSError] = js.native
  /**
    * Deletes a virtual interface.
    */
  def deleteVirtualInterface(): Request[DeleteVirtualInterfaceResponse, AWSError] = js.native
  def deleteVirtualInterface(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVirtualInterfaceResponse, Unit]): Request[DeleteVirtualInterfaceResponse, AWSError] = js.native
  /**
    * Deletes a virtual interface.
    */
  def deleteVirtualInterface(params: DeleteVirtualInterfaceRequest): Request[DeleteVirtualInterfaceResponse, AWSError] = js.native
  def deleteVirtualInterface(
    params: DeleteVirtualInterfaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVirtualInterfaceResponse, Unit]
  ): Request[DeleteVirtualInterfaceResponse, AWSError] = js.native
  /**
    * Deprecated. Use DescribeLoa instead. Gets the LOA-CFA for a connection. The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that your APN partner or service provider uses when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
    */
  def describeConnectionLoa(): Request[DescribeConnectionLoaResponse, AWSError] = js.native
  def describeConnectionLoa(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectionLoaResponse, Unit]): Request[DescribeConnectionLoaResponse, AWSError] = js.native
  /**
    * Deprecated. Use DescribeLoa instead. Gets the LOA-CFA for a connection. The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that your APN partner or service provider uses when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
    */
  def describeConnectionLoa(params: DescribeConnectionLoaRequest): Request[DescribeConnectionLoaResponse, AWSError] = js.native
  def describeConnectionLoa(
    params: DescribeConnectionLoaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectionLoaResponse, Unit]
  ): Request[DescribeConnectionLoaResponse, AWSError] = js.native
  /**
    * Displays the specified connection or all connections in this Region.
    */
  def describeConnections(): Request[Connections, AWSError] = js.native
  def describeConnections(callback: js.Function2[/* err */ AWSError, /* data */ Connections, Unit]): Request[Connections, AWSError] = js.native
  /**
    * Displays the specified connection or all connections in this Region.
    */
  def describeConnections(params: DescribeConnectionsRequest): Request[Connections, AWSError] = js.native
  def describeConnections(
    params: DescribeConnectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Connections, Unit]
  ): Request[Connections, AWSError] = js.native
  /**
    * Deprecated. Use DescribeHostedConnections instead. Lists the connections that have been provisioned on the specified interconnect.  Intended for use by AWS Direct Connect Partners only. 
    */
  def describeConnectionsOnInterconnect(): Request[Connections, AWSError] = js.native
  def describeConnectionsOnInterconnect(callback: js.Function2[/* err */ AWSError, /* data */ Connections, Unit]): Request[Connections, AWSError] = js.native
  /**
    * Deprecated. Use DescribeHostedConnections instead. Lists the connections that have been provisioned on the specified interconnect.  Intended for use by AWS Direct Connect Partners only. 
    */
  def describeConnectionsOnInterconnect(params: DescribeConnectionsOnInterconnectRequest): Request[Connections, AWSError] = js.native
  def describeConnectionsOnInterconnect(
    params: DescribeConnectionsOnInterconnectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Connections, Unit]
  ): Request[Connections, AWSError] = js.native
  /**
    * Describes one or more association proposals for connection between a virtual private gateway or transit gateway and a Direct Connect gateway. 
    */
  def describeDirectConnectGatewayAssociationProposals(): Request[DescribeDirectConnectGatewayAssociationProposalsResult, AWSError] = js.native
  def describeDirectConnectGatewayAssociationProposals(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeDirectConnectGatewayAssociationProposalsResult, 
      Unit
    ]
  ): Request[DescribeDirectConnectGatewayAssociationProposalsResult, AWSError] = js.native
  /**
    * Describes one or more association proposals for connection between a virtual private gateway or transit gateway and a Direct Connect gateway. 
    */
  def describeDirectConnectGatewayAssociationProposals(params: DescribeDirectConnectGatewayAssociationProposalsRequest): Request[DescribeDirectConnectGatewayAssociationProposalsResult, AWSError] = js.native
  def describeDirectConnectGatewayAssociationProposals(
    params: DescribeDirectConnectGatewayAssociationProposalsRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeDirectConnectGatewayAssociationProposalsResult, 
      Unit
    ]
  ): Request[DescribeDirectConnectGatewayAssociationProposalsResult, AWSError] = js.native
  /**
    * Lists the associations between your Direct Connect gateways and virtual private gateways. You must specify a Direct Connect gateway, a virtual private gateway, or both. If you specify a Direct Connect gateway, the response contains all virtual private gateways associated with the Direct Connect gateway. If you specify a virtual private gateway, the response contains all Direct Connect gateways associated with the virtual private gateway. If you specify both, the response contains the association between the Direct Connect gateway and the virtual private gateway.
    */
  def describeDirectConnectGatewayAssociations(): Request[DescribeDirectConnectGatewayAssociationsResult, AWSError] = js.native
  def describeDirectConnectGatewayAssociations(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDirectConnectGatewayAssociationsResult, Unit]
  ): Request[DescribeDirectConnectGatewayAssociationsResult, AWSError] = js.native
  /**
    * Lists the associations between your Direct Connect gateways and virtual private gateways. You must specify a Direct Connect gateway, a virtual private gateway, or both. If you specify a Direct Connect gateway, the response contains all virtual private gateways associated with the Direct Connect gateway. If you specify a virtual private gateway, the response contains all Direct Connect gateways associated with the virtual private gateway. If you specify both, the response contains the association between the Direct Connect gateway and the virtual private gateway.
    */
  def describeDirectConnectGatewayAssociations(params: DescribeDirectConnectGatewayAssociationsRequest): Request[DescribeDirectConnectGatewayAssociationsResult, AWSError] = js.native
  def describeDirectConnectGatewayAssociations(
    params: DescribeDirectConnectGatewayAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDirectConnectGatewayAssociationsResult, Unit]
  ): Request[DescribeDirectConnectGatewayAssociationsResult, AWSError] = js.native
  /**
    * Lists the attachments between your Direct Connect gateways and virtual interfaces. You must specify a Direct Connect gateway, a virtual interface, or both. If you specify a Direct Connect gateway, the response contains all virtual interfaces attached to the Direct Connect gateway. If you specify a virtual interface, the response contains all Direct Connect gateways attached to the virtual interface. If you specify both, the response contains the attachment between the Direct Connect gateway and the virtual interface.
    */
  def describeDirectConnectGatewayAttachments(): Request[DescribeDirectConnectGatewayAttachmentsResult, AWSError] = js.native
  def describeDirectConnectGatewayAttachments(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDirectConnectGatewayAttachmentsResult, Unit]
  ): Request[DescribeDirectConnectGatewayAttachmentsResult, AWSError] = js.native
  /**
    * Lists the attachments between your Direct Connect gateways and virtual interfaces. You must specify a Direct Connect gateway, a virtual interface, or both. If you specify a Direct Connect gateway, the response contains all virtual interfaces attached to the Direct Connect gateway. If you specify a virtual interface, the response contains all Direct Connect gateways attached to the virtual interface. If you specify both, the response contains the attachment between the Direct Connect gateway and the virtual interface.
    */
  def describeDirectConnectGatewayAttachments(params: DescribeDirectConnectGatewayAttachmentsRequest): Request[DescribeDirectConnectGatewayAttachmentsResult, AWSError] = js.native
  def describeDirectConnectGatewayAttachments(
    params: DescribeDirectConnectGatewayAttachmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDirectConnectGatewayAttachmentsResult, Unit]
  ): Request[DescribeDirectConnectGatewayAttachmentsResult, AWSError] = js.native
  /**
    * Lists all your Direct Connect gateways or only the specified Direct Connect gateway. Deleted Direct Connect gateways are not returned.
    */
  def describeDirectConnectGateways(): Request[DescribeDirectConnectGatewaysResult, AWSError] = js.native
  def describeDirectConnectGateways(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDirectConnectGatewaysResult, Unit]): Request[DescribeDirectConnectGatewaysResult, AWSError] = js.native
  /**
    * Lists all your Direct Connect gateways or only the specified Direct Connect gateway. Deleted Direct Connect gateways are not returned.
    */
  def describeDirectConnectGateways(params: DescribeDirectConnectGatewaysRequest): Request[DescribeDirectConnectGatewaysResult, AWSError] = js.native
  def describeDirectConnectGateways(
    params: DescribeDirectConnectGatewaysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDirectConnectGatewaysResult, Unit]
  ): Request[DescribeDirectConnectGatewaysResult, AWSError] = js.native
  /**
    * Lists the hosted connections that have been provisioned on the specified interconnect or link aggregation group (LAG).  Intended for use by AWS Direct Connect Partners only. 
    */
  def describeHostedConnections(): Request[Connections, AWSError] = js.native
  def describeHostedConnections(callback: js.Function2[/* err */ AWSError, /* data */ Connections, Unit]): Request[Connections, AWSError] = js.native
  /**
    * Lists the hosted connections that have been provisioned on the specified interconnect or link aggregation group (LAG).  Intended for use by AWS Direct Connect Partners only. 
    */
  def describeHostedConnections(params: DescribeHostedConnectionsRequest): Request[Connections, AWSError] = js.native
  def describeHostedConnections(
    params: DescribeHostedConnectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Connections, Unit]
  ): Request[Connections, AWSError] = js.native
  /**
    * Deprecated. Use DescribeLoa instead. Gets the LOA-CFA for the specified interconnect. The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
    */
  def describeInterconnectLoa(): Request[DescribeInterconnectLoaResponse, AWSError] = js.native
  def describeInterconnectLoa(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInterconnectLoaResponse, Unit]): Request[DescribeInterconnectLoaResponse, AWSError] = js.native
  /**
    * Deprecated. Use DescribeLoa instead. Gets the LOA-CFA for the specified interconnect. The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
    */
  def describeInterconnectLoa(params: DescribeInterconnectLoaRequest): Request[DescribeInterconnectLoaResponse, AWSError] = js.native
  def describeInterconnectLoa(
    params: DescribeInterconnectLoaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInterconnectLoaResponse, Unit]
  ): Request[DescribeInterconnectLoaResponse, AWSError] = js.native
  /**
    * Lists the interconnects owned by the AWS account or only the specified interconnect.
    */
  def describeInterconnects(): Request[Interconnects, AWSError] = js.native
  def describeInterconnects(callback: js.Function2[/* err */ AWSError, /* data */ Interconnects, Unit]): Request[Interconnects, AWSError] = js.native
  /**
    * Lists the interconnects owned by the AWS account or only the specified interconnect.
    */
  def describeInterconnects(params: DescribeInterconnectsRequest): Request[Interconnects, AWSError] = js.native
  def describeInterconnects(
    params: DescribeInterconnectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Interconnects, Unit]
  ): Request[Interconnects, AWSError] = js.native
  /**
    * Describes all your link aggregation groups (LAG) or the specified LAG.
    */
  def describeLags(): Request[Lags, AWSError] = js.native
  def describeLags(callback: js.Function2[/* err */ AWSError, /* data */ Lags, Unit]): Request[Lags, AWSError] = js.native
  /**
    * Describes all your link aggregation groups (LAG) or the specified LAG.
    */
  def describeLags(params: DescribeLagsRequest): Request[Lags, AWSError] = js.native
  def describeLags(params: DescribeLagsRequest, callback: js.Function2[/* err */ AWSError, /* data */ Lags, Unit]): Request[Lags, AWSError] = js.native
  /**
    * Gets the LOA-CFA for a connection, interconnect, or link aggregation group (LAG). The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
    */
  def describeLoa(): Request[Loa, AWSError] = js.native
  def describeLoa(callback: js.Function2[/* err */ AWSError, /* data */ Loa, Unit]): Request[Loa, AWSError] = js.native
  /**
    * Gets the LOA-CFA for a connection, interconnect, or link aggregation group (LAG). The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
    */
  def describeLoa(params: DescribeLoaRequest): Request[Loa, AWSError] = js.native
  def describeLoa(params: DescribeLoaRequest, callback: js.Function2[/* err */ AWSError, /* data */ Loa, Unit]): Request[Loa, AWSError] = js.native
  /**
    * Lists the AWS Direct Connect locations in the current AWS Region. These are the locations that can be selected when calling CreateConnection or CreateInterconnect.
    */
  def describeLocations(): Request[Locations, AWSError] = js.native
  def describeLocations(callback: js.Function2[/* err */ AWSError, /* data */ Locations, Unit]): Request[Locations, AWSError] = js.native
  /**
    * Describes the tags associated with the specified AWS Direct Connect resources.
    */
  def describeTags(): Request[DescribeTagsResponse, AWSError] = js.native
  def describeTags(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTagsResponse, Unit]): Request[DescribeTagsResponse, AWSError] = js.native
  /**
    * Describes the tags associated with the specified AWS Direct Connect resources.
    */
  def describeTags(params: DescribeTagsRequest): Request[DescribeTagsResponse, AWSError] = js.native
  def describeTags(
    params: DescribeTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTagsResponse, Unit]
  ): Request[DescribeTagsResponse, AWSError] = js.native
  /**
    * Lists the virtual private gateways owned by the AWS account. You can create one or more AWS Direct Connect private virtual interfaces linked to a virtual private gateway.
    */
  def describeVirtualGateways(): Request[VirtualGateways, AWSError] = js.native
  def describeVirtualGateways(callback: js.Function2[/* err */ AWSError, /* data */ VirtualGateways, Unit]): Request[VirtualGateways, AWSError] = js.native
  /**
    * Displays all virtual interfaces for an AWS account. Virtual interfaces deleted fewer than 15 minutes before you make the request are also returned. If you specify a connection ID, only the virtual interfaces associated with the connection are returned. If you specify a virtual interface ID, then only a single virtual interface is returned. A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer network.
    */
  def describeVirtualInterfaces(): Request[VirtualInterfaces, AWSError] = js.native
  def describeVirtualInterfaces(callback: js.Function2[/* err */ AWSError, /* data */ VirtualInterfaces, Unit]): Request[VirtualInterfaces, AWSError] = js.native
  /**
    * Displays all virtual interfaces for an AWS account. Virtual interfaces deleted fewer than 15 minutes before you make the request are also returned. If you specify a connection ID, only the virtual interfaces associated with the connection are returned. If you specify a virtual interface ID, then only a single virtual interface is returned. A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer network.
    */
  def describeVirtualInterfaces(params: DescribeVirtualInterfacesRequest): Request[VirtualInterfaces, AWSError] = js.native
  def describeVirtualInterfaces(
    params: DescribeVirtualInterfacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ VirtualInterfaces, Unit]
  ): Request[VirtualInterfaces, AWSError] = js.native
  /**
    * Disassociates a connection from a link aggregation group (LAG). The connection is interrupted and re-established as a standalone connection (the connection is not deleted; to delete the connection, use the DeleteConnection request). If the LAG has associated virtual interfaces or hosted connections, they remain associated with the LAG. A disassociated connection owned by an AWS Direct Connect Partner is automatically converted to an interconnect. If disassociating the connection would cause the LAG to fall below its setting for minimum number of operational connections, the request fails, except when it's the last member of the LAG. If all connections are disassociated, the LAG continues to exist as an empty LAG with no physical connections. 
    */
  def disassociateConnectionFromLag(): Request[Connection, AWSError] = js.native
  def disassociateConnectionFromLag(callback: js.Function2[/* err */ AWSError, /* data */ Connection, Unit]): Request[Connection, AWSError] = js.native
  /**
    * Disassociates a connection from a link aggregation group (LAG). The connection is interrupted and re-established as a standalone connection (the connection is not deleted; to delete the connection, use the DeleteConnection request). If the LAG has associated virtual interfaces or hosted connections, they remain associated with the LAG. A disassociated connection owned by an AWS Direct Connect Partner is automatically converted to an interconnect. If disassociating the connection would cause the LAG to fall below its setting for minimum number of operational connections, the request fails, except when it's the last member of the LAG. If all connections are disassociated, the LAG continues to exist as an empty LAG with no physical connections. 
    */
  def disassociateConnectionFromLag(params: DisassociateConnectionFromLagRequest): Request[Connection, AWSError] = js.native
  def disassociateConnectionFromLag(
    params: DisassociateConnectionFromLagRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ Connection, Unit]
  ): Request[Connection, AWSError] = js.native
  /**
    * Lists the virtual interface failover test history.
    */
  def listVirtualInterfaceTestHistory(): Request[ListVirtualInterfaceTestHistoryResponse, AWSError] = js.native
  def listVirtualInterfaceTestHistory(
    callback: js.Function2[/* err */ AWSError, /* data */ ListVirtualInterfaceTestHistoryResponse, Unit]
  ): Request[ListVirtualInterfaceTestHistoryResponse, AWSError] = js.native
  /**
    * Lists the virtual interface failover test history.
    */
  def listVirtualInterfaceTestHistory(params: ListVirtualInterfaceTestHistoryRequest): Request[ListVirtualInterfaceTestHistoryResponse, AWSError] = js.native
  def listVirtualInterfaceTestHistory(
    params: ListVirtualInterfaceTestHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVirtualInterfaceTestHistoryResponse, Unit]
  ): Request[ListVirtualInterfaceTestHistoryResponse, AWSError] = js.native
  /**
    * Starts the virtual interface failover test that verifies your configuration meets your resiliency requirements by placing the BGP peering session in the DOWN state. You can then send traffic to verify that there are no outages. You can run the test on public, private, transit, and hosted virtual interfaces. You can use ListVirtualInterfaceTestHistory to view the virtual interface test history. If you need to stop the test before the test interval completes, use StopBgpFailoverTest.
    */
  def startBgpFailoverTest(): Request[StartBgpFailoverTestResponse, AWSError] = js.native
  def startBgpFailoverTest(callback: js.Function2[/* err */ AWSError, /* data */ StartBgpFailoverTestResponse, Unit]): Request[StartBgpFailoverTestResponse, AWSError] = js.native
  /**
    * Starts the virtual interface failover test that verifies your configuration meets your resiliency requirements by placing the BGP peering session in the DOWN state. You can then send traffic to verify that there are no outages. You can run the test on public, private, transit, and hosted virtual interfaces. You can use ListVirtualInterfaceTestHistory to view the virtual interface test history. If you need to stop the test before the test interval completes, use StopBgpFailoverTest.
    */
  def startBgpFailoverTest(params: StartBgpFailoverTestRequest): Request[StartBgpFailoverTestResponse, AWSError] = js.native
  def startBgpFailoverTest(
    params: StartBgpFailoverTestRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartBgpFailoverTestResponse, Unit]
  ): Request[StartBgpFailoverTestResponse, AWSError] = js.native
  /**
    * Stops the virtual interface failover test.
    */
  def stopBgpFailoverTest(): Request[StopBgpFailoverTestResponse, AWSError] = js.native
  def stopBgpFailoverTest(callback: js.Function2[/* err */ AWSError, /* data */ StopBgpFailoverTestResponse, Unit]): Request[StopBgpFailoverTestResponse, AWSError] = js.native
  /**
    * Stops the virtual interface failover test.
    */
  def stopBgpFailoverTest(params: StopBgpFailoverTestRequest): Request[StopBgpFailoverTestResponse, AWSError] = js.native
  def stopBgpFailoverTest(
    params: StopBgpFailoverTestRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopBgpFailoverTestResponse, Unit]
  ): Request[StopBgpFailoverTestResponse, AWSError] = js.native
  /**
    * Adds the specified tags to the specified AWS Direct Connect resource. Each resource can have a maximum of 50 tags. Each tag consists of a key and an optional value. If a tag with the same key is already associated with the resource, this action updates its value.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds the specified tags to the specified AWS Direct Connect resource. Each resource can have a maximum of 50 tags. Each tag consists of a key and an optional value. If a tag with the same key is already associated with the resource, this action updates its value.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from the specified AWS Direct Connect resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from the specified AWS Direct Connect resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Updates the specified attributes of the Direct Connect gateway association. Add or remove prefixes from the association.
    */
  def updateDirectConnectGatewayAssociation(): Request[UpdateDirectConnectGatewayAssociationResult, AWSError] = js.native
  def updateDirectConnectGatewayAssociation(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDirectConnectGatewayAssociationResult, Unit]
  ): Request[UpdateDirectConnectGatewayAssociationResult, AWSError] = js.native
  /**
    * Updates the specified attributes of the Direct Connect gateway association. Add or remove prefixes from the association.
    */
  def updateDirectConnectGatewayAssociation(params: UpdateDirectConnectGatewayAssociationRequest): Request[UpdateDirectConnectGatewayAssociationResult, AWSError] = js.native
  def updateDirectConnectGatewayAssociation(
    params: UpdateDirectConnectGatewayAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDirectConnectGatewayAssociationResult, Unit]
  ): Request[UpdateDirectConnectGatewayAssociationResult, AWSError] = js.native
  /**
    * Updates the attributes of the specified link aggregation group (LAG). You can update the following attributes:   The name of the LAG.   The value for the minimum number of connections that must be operational for the LAG itself to be operational.    When you create a LAG, the default value for the minimum number of operational connections is zero (0). If you update this value and the number of operational connections falls below the specified value, the LAG automatically goes down to avoid over-utilization of the remaining connections. Adjust this value with care, as it could force the LAG down if it is set higher than the current number of operational connections.
    */
  def updateLag(): Request[Lag, AWSError] = js.native
  def updateLag(callback: js.Function2[/* err */ AWSError, /* data */ Lag, Unit]): Request[Lag, AWSError] = js.native
  /**
    * Updates the attributes of the specified link aggregation group (LAG). You can update the following attributes:   The name of the LAG.   The value for the minimum number of connections that must be operational for the LAG itself to be operational.    When you create a LAG, the default value for the minimum number of operational connections is zero (0). If you update this value and the number of operational connections falls below the specified value, the LAG automatically goes down to avoid over-utilization of the remaining connections. Adjust this value with care, as it could force the LAG down if it is set higher than the current number of operational connections.
    */
  def updateLag(params: UpdateLagRequest): Request[Lag, AWSError] = js.native
  def updateLag(params: UpdateLagRequest, callback: js.Function2[/* err */ AWSError, /* data */ Lag, Unit]): Request[Lag, AWSError] = js.native
  /**
    * Updates the specified attributes of the specified virtual private interface. Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an update to the underlying physical connection if it wasn't updated to support jumbo frames. Updating the connection disrupts network connectivity for all virtual interfaces associated with the connection for up to 30 seconds. To check whether your connection supports jumbo frames, call DescribeConnections. To check whether your virtual q interface supports jumbo frames, call DescribeVirtualInterfaces.
    */
  def updateVirtualInterfaceAttributes(): Request[VirtualInterface, AWSError] = js.native
  def updateVirtualInterfaceAttributes(callback: js.Function2[/* err */ AWSError, /* data */ VirtualInterface, Unit]): Request[VirtualInterface, AWSError] = js.native
  /**
    * Updates the specified attributes of the specified virtual private interface. Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an update to the underlying physical connection if it wasn't updated to support jumbo frames. Updating the connection disrupts network connectivity for all virtual interfaces associated with the connection for up to 30 seconds. To check whether your connection supports jumbo frames, call DescribeConnections. To check whether your virtual q interface supports jumbo frames, call DescribeVirtualInterfaces.
    */
  def updateVirtualInterfaceAttributes(params: UpdateVirtualInterfaceAttributesRequest): Request[VirtualInterface, AWSError] = js.native
  def updateVirtualInterfaceAttributes(
    params: UpdateVirtualInterfaceAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ VirtualInterface, Unit]
  ): Request[VirtualInterface, AWSError] = js.native
}

