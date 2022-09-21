package typings.awsSdk.globalacceleratorMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalAccelerator extends Service {
  
  /**
    * Associate a virtual private cloud (VPC) subnet endpoint with your custom routing accelerator. The listener port range must be large enough to support the number of IP addresses that can be specified in your subnet. The number of ports required is: subnet size times the number of ports per destination EC2 instances. For example, a subnet defined as /24 requires a listener port range of at least 255 ports.  Note: You must have enough remaining listener ports available to map to the subnet ports, or the call will fail with a LimitExceededException. By default, all destinations in a subnet in a custom routing accelerator cannot receive traffic. To enable all destinations to receive traffic, or to specify individual port mappings that can receive traffic, see the  AllowCustomRoutingTraffic operation.
    */
  def addCustomRoutingEndpoints(): Request[AddCustomRoutingEndpointsResponse, AWSError] = js.native
  def addCustomRoutingEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ AddCustomRoutingEndpointsResponse, Unit]): Request[AddCustomRoutingEndpointsResponse, AWSError] = js.native
  /**
    * Associate a virtual private cloud (VPC) subnet endpoint with your custom routing accelerator. The listener port range must be large enough to support the number of IP addresses that can be specified in your subnet. The number of ports required is: subnet size times the number of ports per destination EC2 instances. For example, a subnet defined as /24 requires a listener port range of at least 255 ports.  Note: You must have enough remaining listener ports available to map to the subnet ports, or the call will fail with a LimitExceededException. By default, all destinations in a subnet in a custom routing accelerator cannot receive traffic. To enable all destinations to receive traffic, or to specify individual port mappings that can receive traffic, see the  AllowCustomRoutingTraffic operation.
    */
  def addCustomRoutingEndpoints(params: AddCustomRoutingEndpointsRequest): Request[AddCustomRoutingEndpointsResponse, AWSError] = js.native
  def addCustomRoutingEndpoints(
    params: AddCustomRoutingEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddCustomRoutingEndpointsResponse, Unit]
  ): Request[AddCustomRoutingEndpointsResponse, AWSError] = js.native
  
  /**
    * Advertises an IPv4 address range that is provisioned for use with your Amazon Web Services resources through bring your own IP addresses (BYOIP). It can take a few minutes before traffic to the specified addresses starts routing to Amazon Web Services because of propagation delays.  To stop advertising the BYOIP address range, use  WithdrawByoipCidr. For more information, see Bring your own IP addresses (BYOIP) in the Global Accelerator Developer Guide.
    */
  def advertiseByoipCidr(): Request[AdvertiseByoipCidrResponse, AWSError] = js.native
  def advertiseByoipCidr(callback: js.Function2[/* err */ AWSError, /* data */ AdvertiseByoipCidrResponse, Unit]): Request[AdvertiseByoipCidrResponse, AWSError] = js.native
  /**
    * Advertises an IPv4 address range that is provisioned for use with your Amazon Web Services resources through bring your own IP addresses (BYOIP). It can take a few minutes before traffic to the specified addresses starts routing to Amazon Web Services because of propagation delays.  To stop advertising the BYOIP address range, use  WithdrawByoipCidr. For more information, see Bring your own IP addresses (BYOIP) in the Global Accelerator Developer Guide.
    */
  def advertiseByoipCidr(params: AdvertiseByoipCidrRequest): Request[AdvertiseByoipCidrResponse, AWSError] = js.native
  def advertiseByoipCidr(
    params: AdvertiseByoipCidrRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdvertiseByoipCidrResponse, Unit]
  ): Request[AdvertiseByoipCidrResponse, AWSError] = js.native
  
  /**
    * Specify the Amazon EC2 instance (destination) IP addresses and ports for a VPC subnet endpoint that can receive traffic for a custom routing accelerator. You can allow traffic to all destinations in the subnet endpoint, or allow traffic to a specified list of destination IP addresses and ports in the subnet. Note that you cannot specify IP addresses or ports outside of the range that you configured for the endpoint group. After you make changes, you can verify that the updates are complete by checking the status of your accelerator: the status changes from IN_PROGRESS to DEPLOYED.
    */
  def allowCustomRoutingTraffic(): Request[js.Object, AWSError] = js.native
  def allowCustomRoutingTraffic(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Specify the Amazon EC2 instance (destination) IP addresses and ports for a VPC subnet endpoint that can receive traffic for a custom routing accelerator. You can allow traffic to all destinations in the subnet endpoint, or allow traffic to a specified list of destination IP addresses and ports in the subnet. Note that you cannot specify IP addresses or ports outside of the range that you configured for the endpoint group. After you make changes, you can verify that the updates are complete by checking the status of your accelerator: the status changes from IN_PROGRESS to DEPLOYED.
    */
  def allowCustomRoutingTraffic(params: AllowCustomRoutingTrafficRequest): Request[js.Object, AWSError] = js.native
  def allowCustomRoutingTraffic(
    params: AllowCustomRoutingTrafficRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  @JSName("config")
  var config_GlobalAccelerator: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers.   Global Accelerator is a global service that supports endpoints in multiple Amazon Web Services Regions but you must specify the US West (Oregon) Region to create, update, or otherwise work with accelerators. That is, for example, specify --region us-west-2 on AWS CLI commands. 
    */
  def createAccelerator(): Request[CreateAcceleratorResponse, AWSError] = js.native
  def createAccelerator(callback: js.Function2[/* err */ AWSError, /* data */ CreateAcceleratorResponse, Unit]): Request[CreateAcceleratorResponse, AWSError] = js.native
  /**
    * Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers.   Global Accelerator is a global service that supports endpoints in multiple Amazon Web Services Regions but you must specify the US West (Oregon) Region to create, update, or otherwise work with accelerators. That is, for example, specify --region us-west-2 on AWS CLI commands. 
    */
  def createAccelerator(params: CreateAcceleratorRequest): Request[CreateAcceleratorResponse, AWSError] = js.native
  def createAccelerator(
    params: CreateAcceleratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAcceleratorResponse, Unit]
  ): Request[CreateAcceleratorResponse, AWSError] = js.native
  
  /**
    * Create a custom routing accelerator. A custom routing accelerator directs traffic to one of possibly thousands of Amazon EC2 instance destinations running in a single or multiple virtual private clouds (VPC) subnet endpoints. Be aware that, by default, all destination EC2 instances in a VPC subnet endpoint cannot receive traffic. To enable all destinations to receive traffic, or to specify individual port mappings that can receive traffic, see the  AllowCustomRoutingTraffic operation.  Global Accelerator is a global service that supports endpoints in multiple Amazon Web Services Regions but you must specify the US West (Oregon) Region to create, update, or otherwise work with accelerators. That is, for example, specify --region us-west-2 on AWS CLI commands. 
    */
  def createCustomRoutingAccelerator(): Request[CreateCustomRoutingAcceleratorResponse, AWSError] = js.native
  def createCustomRoutingAccelerator(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomRoutingAcceleratorResponse, Unit]
  ): Request[CreateCustomRoutingAcceleratorResponse, AWSError] = js.native
  /**
    * Create a custom routing accelerator. A custom routing accelerator directs traffic to one of possibly thousands of Amazon EC2 instance destinations running in a single or multiple virtual private clouds (VPC) subnet endpoints. Be aware that, by default, all destination EC2 instances in a VPC subnet endpoint cannot receive traffic. To enable all destinations to receive traffic, or to specify individual port mappings that can receive traffic, see the  AllowCustomRoutingTraffic operation.  Global Accelerator is a global service that supports endpoints in multiple Amazon Web Services Regions but you must specify the US West (Oregon) Region to create, update, or otherwise work with accelerators. That is, for example, specify --region us-west-2 on AWS CLI commands. 
    */
  def createCustomRoutingAccelerator(params: CreateCustomRoutingAcceleratorRequest): Request[CreateCustomRoutingAcceleratorResponse, AWSError] = js.native
  def createCustomRoutingAccelerator(
    params: CreateCustomRoutingAcceleratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomRoutingAcceleratorResponse, Unit]
  ): Request[CreateCustomRoutingAcceleratorResponse, AWSError] = js.native
  
  /**
    * Create an endpoint group for the specified listener for a custom routing accelerator. An endpoint group is a collection of endpoints in one Amazon Web Services Region. 
    */
  def createCustomRoutingEndpointGroup(): Request[CreateCustomRoutingEndpointGroupResponse, AWSError] = js.native
  def createCustomRoutingEndpointGroup(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomRoutingEndpointGroupResponse, Unit]
  ): Request[CreateCustomRoutingEndpointGroupResponse, AWSError] = js.native
  /**
    * Create an endpoint group for the specified listener for a custom routing accelerator. An endpoint group is a collection of endpoints in one Amazon Web Services Region. 
    */
  def createCustomRoutingEndpointGroup(params: CreateCustomRoutingEndpointGroupRequest): Request[CreateCustomRoutingEndpointGroupResponse, AWSError] = js.native
  def createCustomRoutingEndpointGroup(
    params: CreateCustomRoutingEndpointGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomRoutingEndpointGroupResponse, Unit]
  ): Request[CreateCustomRoutingEndpointGroupResponse, AWSError] = js.native
  
  /**
    * Create a listener to process inbound connections from clients to a custom routing accelerator. Connections arrive to assigned static IP addresses on the port range that you specify. 
    */
  def createCustomRoutingListener(): Request[CreateCustomRoutingListenerResponse, AWSError] = js.native
  def createCustomRoutingListener(callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomRoutingListenerResponse, Unit]): Request[CreateCustomRoutingListenerResponse, AWSError] = js.native
  /**
    * Create a listener to process inbound connections from clients to a custom routing accelerator. Connections arrive to assigned static IP addresses on the port range that you specify. 
    */
  def createCustomRoutingListener(params: CreateCustomRoutingListenerRequest): Request[CreateCustomRoutingListenerResponse, AWSError] = js.native
  def createCustomRoutingListener(
    params: CreateCustomRoutingListenerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomRoutingListenerResponse, Unit]
  ): Request[CreateCustomRoutingListenerResponse, AWSError] = js.native
  
  /**
    * Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one Amazon Web Services Region. A resource must be valid and active when you add it as an endpoint.
    */
  def createEndpointGroup(): Request[CreateEndpointGroupResponse, AWSError] = js.native
  def createEndpointGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointGroupResponse, Unit]): Request[CreateEndpointGroupResponse, AWSError] = js.native
  /**
    * Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one Amazon Web Services Region. A resource must be valid and active when you add it as an endpoint.
    */
  def createEndpointGroup(params: CreateEndpointGroupRequest): Request[CreateEndpointGroupResponse, AWSError] = js.native
  def createEndpointGroup(
    params: CreateEndpointGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointGroupResponse, Unit]
  ): Request[CreateEndpointGroupResponse, AWSError] = js.native
  
  /**
    * Create a listener to process inbound connections from clients to an accelerator. Connections arrive to assigned static IP addresses on a port, port range, or list of port ranges that you specify. 
    */
  def createListener(): Request[CreateListenerResponse, AWSError] = js.native
  def createListener(callback: js.Function2[/* err */ AWSError, /* data */ CreateListenerResponse, Unit]): Request[CreateListenerResponse, AWSError] = js.native
  /**
    * Create a listener to process inbound connections from clients to an accelerator. Connections arrive to assigned static IP addresses on a port, port range, or list of port ranges that you specify. 
    */
  def createListener(params: CreateListenerRequest): Request[CreateListenerResponse, AWSError] = js.native
  def createListener(
    params: CreateListenerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateListenerResponse, Unit]
  ): Request[CreateListenerResponse, AWSError] = js.native
  
  /**
    * Delete an accelerator. Before you can delete an accelerator, you must disable it and remove all dependent resources (listeners and endpoint groups). To disable the accelerator, update the accelerator to set Enabled to false.  When you create an accelerator, by default, Global Accelerator provides you with a set of two static IP addresses. Alternatively, you can bring your own IP address ranges to Global Accelerator and assign IP addresses from those ranges.  The IP addresses are assigned to your accelerator for as long as it exists, even if you disable the accelerator and it no longer accepts or routes traffic. However, when you delete an accelerator, you lose the static IP addresses that are assigned to the accelerator, so you can no longer route traffic by using them. As a best practice, ensure that you have permissions in place to avoid inadvertently deleting accelerators. You can use IAM policies with Global Accelerator to limit the users who have permissions to delete an accelerator. For more information, see Identity and access management in the Global Accelerator Developer Guide. 
    */
  def deleteAccelerator(): Request[js.Object, AWSError] = js.native
  def deleteAccelerator(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete an accelerator. Before you can delete an accelerator, you must disable it and remove all dependent resources (listeners and endpoint groups). To disable the accelerator, update the accelerator to set Enabled to false.  When you create an accelerator, by default, Global Accelerator provides you with a set of two static IP addresses. Alternatively, you can bring your own IP address ranges to Global Accelerator and assign IP addresses from those ranges.  The IP addresses are assigned to your accelerator for as long as it exists, even if you disable the accelerator and it no longer accepts or routes traffic. However, when you delete an accelerator, you lose the static IP addresses that are assigned to the accelerator, so you can no longer route traffic by using them. As a best practice, ensure that you have permissions in place to avoid inadvertently deleting accelerators. You can use IAM policies with Global Accelerator to limit the users who have permissions to delete an accelerator. For more information, see Identity and access management in the Global Accelerator Developer Guide. 
    */
  def deleteAccelerator(params: DeleteAcceleratorRequest): Request[js.Object, AWSError] = js.native
  def deleteAccelerator(
    params: DeleteAcceleratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Delete a custom routing accelerator. Before you can delete an accelerator, you must disable it and remove all dependent resources (listeners and endpoint groups). To disable the accelerator, update the accelerator to set Enabled to false.  When you create a custom routing accelerator, by default, Global Accelerator provides you with a set of two static IP addresses.  The IP addresses are assigned to your accelerator for as long as it exists, even if you disable the accelerator and it no longer accepts or routes traffic. However, when you delete an accelerator, you lose the static IP addresses that are assigned to the accelerator, so you can no longer route traffic by using them. As a best practice, ensure that you have permissions in place to avoid inadvertently deleting accelerators. You can use IAM policies with Global Accelerator to limit the users who have permissions to delete an accelerator. For more information, see Identity and access management in the Global Accelerator Developer Guide. 
    */
  def deleteCustomRoutingAccelerator(): Request[js.Object, AWSError] = js.native
  def deleteCustomRoutingAccelerator(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete a custom routing accelerator. Before you can delete an accelerator, you must disable it and remove all dependent resources (listeners and endpoint groups). To disable the accelerator, update the accelerator to set Enabled to false.  When you create a custom routing accelerator, by default, Global Accelerator provides you with a set of two static IP addresses.  The IP addresses are assigned to your accelerator for as long as it exists, even if you disable the accelerator and it no longer accepts or routes traffic. However, when you delete an accelerator, you lose the static IP addresses that are assigned to the accelerator, so you can no longer route traffic by using them. As a best practice, ensure that you have permissions in place to avoid inadvertently deleting accelerators. You can use IAM policies with Global Accelerator to limit the users who have permissions to delete an accelerator. For more information, see Identity and access management in the Global Accelerator Developer Guide. 
    */
  def deleteCustomRoutingAccelerator(params: DeleteCustomRoutingAcceleratorRequest): Request[js.Object, AWSError] = js.native
  def deleteCustomRoutingAccelerator(
    params: DeleteCustomRoutingAcceleratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Delete an endpoint group from a listener for a custom routing accelerator.
    */
  def deleteCustomRoutingEndpointGroup(): Request[js.Object, AWSError] = js.native
  def deleteCustomRoutingEndpointGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete an endpoint group from a listener for a custom routing accelerator.
    */
  def deleteCustomRoutingEndpointGroup(params: DeleteCustomRoutingEndpointGroupRequest): Request[js.Object, AWSError] = js.native
  def deleteCustomRoutingEndpointGroup(
    params: DeleteCustomRoutingEndpointGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Delete a listener for a custom routing accelerator.
    */
  def deleteCustomRoutingListener(): Request[js.Object, AWSError] = js.native
  def deleteCustomRoutingListener(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete a listener for a custom routing accelerator.
    */
  def deleteCustomRoutingListener(params: DeleteCustomRoutingListenerRequest): Request[js.Object, AWSError] = js.native
  def deleteCustomRoutingListener(
    params: DeleteCustomRoutingListenerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Delete an endpoint group from a listener.
    */
  def deleteEndpointGroup(): Request[js.Object, AWSError] = js.native
  def deleteEndpointGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete an endpoint group from a listener.
    */
  def deleteEndpointGroup(params: DeleteEndpointGroupRequest): Request[js.Object, AWSError] = js.native
  def deleteEndpointGroup(
    params: DeleteEndpointGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Delete a listener from an accelerator.
    */
  def deleteListener(): Request[js.Object, AWSError] = js.native
  def deleteListener(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete a listener from an accelerator.
    */
  def deleteListener(params: DeleteListenerRequest): Request[js.Object, AWSError] = js.native
  def deleteListener(
    params: DeleteListenerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Specify the Amazon EC2 instance (destination) IP addresses and ports for a VPC subnet endpoint that cannot receive traffic for a custom routing accelerator. You can deny traffic to all destinations in the VPC endpoint, or deny traffic to a specified list of destination IP addresses and ports. Note that you cannot specify IP addresses or ports outside of the range that you configured for the endpoint group. After you make changes, you can verify that the updates are complete by checking the status of your accelerator: the status changes from IN_PROGRESS to DEPLOYED.
    */
  def denyCustomRoutingTraffic(): Request[js.Object, AWSError] = js.native
  def denyCustomRoutingTraffic(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Specify the Amazon EC2 instance (destination) IP addresses and ports for a VPC subnet endpoint that cannot receive traffic for a custom routing accelerator. You can deny traffic to all destinations in the VPC endpoint, or deny traffic to a specified list of destination IP addresses and ports. Note that you cannot specify IP addresses or ports outside of the range that you configured for the endpoint group. After you make changes, you can verify that the updates are complete by checking the status of your accelerator: the status changes from IN_PROGRESS to DEPLOYED.
    */
  def denyCustomRoutingTraffic(params: DenyCustomRoutingTrafficRequest): Request[js.Object, AWSError] = js.native
  def denyCustomRoutingTraffic(
    params: DenyCustomRoutingTrafficRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Releases the specified address range that you provisioned to use with your Amazon Web Services resources through bring your own IP addresses (BYOIP) and deletes the corresponding address pool.  Before you can release an address range, you must stop advertising it by using WithdrawByoipCidr and you must not have any accelerators that are using static IP addresses allocated from its address range.  For more information, see Bring your own IP addresses (BYOIP) in the Global Accelerator Developer Guide.
    */
  def deprovisionByoipCidr(): Request[DeprovisionByoipCidrResponse, AWSError] = js.native
  def deprovisionByoipCidr(callback: js.Function2[/* err */ AWSError, /* data */ DeprovisionByoipCidrResponse, Unit]): Request[DeprovisionByoipCidrResponse, AWSError] = js.native
  /**
    * Releases the specified address range that you provisioned to use with your Amazon Web Services resources through bring your own IP addresses (BYOIP) and deletes the corresponding address pool.  Before you can release an address range, you must stop advertising it by using WithdrawByoipCidr and you must not have any accelerators that are using static IP addresses allocated from its address range.  For more information, see Bring your own IP addresses (BYOIP) in the Global Accelerator Developer Guide.
    */
  def deprovisionByoipCidr(params: DeprovisionByoipCidrRequest): Request[DeprovisionByoipCidrResponse, AWSError] = js.native
  def deprovisionByoipCidr(
    params: DeprovisionByoipCidrRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeprovisionByoipCidrResponse, Unit]
  ): Request[DeprovisionByoipCidrResponse, AWSError] = js.native
  
  /**
    * Describe an accelerator. 
    */
  def describeAccelerator(): Request[DescribeAcceleratorResponse, AWSError] = js.native
  def describeAccelerator(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorResponse, Unit]): Request[DescribeAcceleratorResponse, AWSError] = js.native
  /**
    * Describe an accelerator. 
    */
  def describeAccelerator(params: DescribeAcceleratorRequest): Request[DescribeAcceleratorResponse, AWSError] = js.native
  def describeAccelerator(
    params: DescribeAcceleratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorResponse, Unit]
  ): Request[DescribeAcceleratorResponse, AWSError] = js.native
  
  /**
    * Describe the attributes of an accelerator. 
    */
  def describeAcceleratorAttributes(): Request[DescribeAcceleratorAttributesResponse, AWSError] = js.native
  def describeAcceleratorAttributes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorAttributesResponse, Unit]): Request[DescribeAcceleratorAttributesResponse, AWSError] = js.native
  /**
    * Describe the attributes of an accelerator. 
    */
  def describeAcceleratorAttributes(params: DescribeAcceleratorAttributesRequest): Request[DescribeAcceleratorAttributesResponse, AWSError] = js.native
  def describeAcceleratorAttributes(
    params: DescribeAcceleratorAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorAttributesResponse, Unit]
  ): Request[DescribeAcceleratorAttributesResponse, AWSError] = js.native
  
  /**
    * Describe a custom routing accelerator. 
    */
  def describeCustomRoutingAccelerator(): Request[DescribeCustomRoutingAcceleratorResponse, AWSError] = js.native
  def describeCustomRoutingAccelerator(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCustomRoutingAcceleratorResponse, Unit]
  ): Request[DescribeCustomRoutingAcceleratorResponse, AWSError] = js.native
  /**
    * Describe a custom routing accelerator. 
    */
  def describeCustomRoutingAccelerator(params: DescribeCustomRoutingAcceleratorRequest): Request[DescribeCustomRoutingAcceleratorResponse, AWSError] = js.native
  def describeCustomRoutingAccelerator(
    params: DescribeCustomRoutingAcceleratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCustomRoutingAcceleratorResponse, Unit]
  ): Request[DescribeCustomRoutingAcceleratorResponse, AWSError] = js.native
  
  /**
    * Describe the attributes of a custom routing accelerator. 
    */
  def describeCustomRoutingAcceleratorAttributes(): Request[DescribeCustomRoutingAcceleratorAttributesResponse, AWSError] = js.native
  def describeCustomRoutingAcceleratorAttributes(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeCustomRoutingAcceleratorAttributesResponse, 
      Unit
    ]
  ): Request[DescribeCustomRoutingAcceleratorAttributesResponse, AWSError] = js.native
  /**
    * Describe the attributes of a custom routing accelerator. 
    */
  def describeCustomRoutingAcceleratorAttributes(params: DescribeCustomRoutingAcceleratorAttributesRequest): Request[DescribeCustomRoutingAcceleratorAttributesResponse, AWSError] = js.native
  def describeCustomRoutingAcceleratorAttributes(
    params: DescribeCustomRoutingAcceleratorAttributesRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeCustomRoutingAcceleratorAttributesResponse, 
      Unit
    ]
  ): Request[DescribeCustomRoutingAcceleratorAttributesResponse, AWSError] = js.native
  
  /**
    * Describe an endpoint group for a custom routing accelerator. 
    */
  def describeCustomRoutingEndpointGroup(): Request[DescribeCustomRoutingEndpointGroupResponse, AWSError] = js.native
  def describeCustomRoutingEndpointGroup(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCustomRoutingEndpointGroupResponse, Unit]
  ): Request[DescribeCustomRoutingEndpointGroupResponse, AWSError] = js.native
  /**
    * Describe an endpoint group for a custom routing accelerator. 
    */
  def describeCustomRoutingEndpointGroup(params: DescribeCustomRoutingEndpointGroupRequest): Request[DescribeCustomRoutingEndpointGroupResponse, AWSError] = js.native
  def describeCustomRoutingEndpointGroup(
    params: DescribeCustomRoutingEndpointGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCustomRoutingEndpointGroupResponse, Unit]
  ): Request[DescribeCustomRoutingEndpointGroupResponse, AWSError] = js.native
  
  /**
    * The description of a listener for a custom routing accelerator.
    */
  def describeCustomRoutingListener(): Request[DescribeCustomRoutingListenerResponse, AWSError] = js.native
  def describeCustomRoutingListener(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCustomRoutingListenerResponse, Unit]): Request[DescribeCustomRoutingListenerResponse, AWSError] = js.native
  /**
    * The description of a listener for a custom routing accelerator.
    */
  def describeCustomRoutingListener(params: DescribeCustomRoutingListenerRequest): Request[DescribeCustomRoutingListenerResponse, AWSError] = js.native
  def describeCustomRoutingListener(
    params: DescribeCustomRoutingListenerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCustomRoutingListenerResponse, Unit]
  ): Request[DescribeCustomRoutingListenerResponse, AWSError] = js.native
  
  /**
    * Describe an endpoint group. 
    */
  def describeEndpointGroup(): Request[DescribeEndpointGroupResponse, AWSError] = js.native
  def describeEndpointGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointGroupResponse, Unit]): Request[DescribeEndpointGroupResponse, AWSError] = js.native
  /**
    * Describe an endpoint group. 
    */
  def describeEndpointGroup(params: DescribeEndpointGroupRequest): Request[DescribeEndpointGroupResponse, AWSError] = js.native
  def describeEndpointGroup(
    params: DescribeEndpointGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointGroupResponse, Unit]
  ): Request[DescribeEndpointGroupResponse, AWSError] = js.native
  
  /**
    * Describe a listener. 
    */
  def describeListener(): Request[DescribeListenerResponse, AWSError] = js.native
  def describeListener(callback: js.Function2[/* err */ AWSError, /* data */ DescribeListenerResponse, Unit]): Request[DescribeListenerResponse, AWSError] = js.native
  /**
    * Describe a listener. 
    */
  def describeListener(params: DescribeListenerRequest): Request[DescribeListenerResponse, AWSError] = js.native
  def describeListener(
    params: DescribeListenerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeListenerResponse, Unit]
  ): Request[DescribeListenerResponse, AWSError] = js.native
  
  /**
    * List the accelerators for an Amazon Web Services account. 
    */
  def listAccelerators(): Request[ListAcceleratorsResponse, AWSError] = js.native
  def listAccelerators(callback: js.Function2[/* err */ AWSError, /* data */ ListAcceleratorsResponse, Unit]): Request[ListAcceleratorsResponse, AWSError] = js.native
  /**
    * List the accelerators for an Amazon Web Services account. 
    */
  def listAccelerators(params: ListAcceleratorsRequest): Request[ListAcceleratorsResponse, AWSError] = js.native
  def listAccelerators(
    params: ListAcceleratorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAcceleratorsResponse, Unit]
  ): Request[ListAcceleratorsResponse, AWSError] = js.native
  
  /**
    * Lists the IP address ranges that were specified in calls to ProvisionByoipCidr, including the current state and a history of state changes.
    */
  def listByoipCidrs(): Request[ListByoipCidrsResponse, AWSError] = js.native
  def listByoipCidrs(callback: js.Function2[/* err */ AWSError, /* data */ ListByoipCidrsResponse, Unit]): Request[ListByoipCidrsResponse, AWSError] = js.native
  /**
    * Lists the IP address ranges that were specified in calls to ProvisionByoipCidr, including the current state and a history of state changes.
    */
  def listByoipCidrs(params: ListByoipCidrsRequest): Request[ListByoipCidrsResponse, AWSError] = js.native
  def listByoipCidrs(
    params: ListByoipCidrsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListByoipCidrsResponse, Unit]
  ): Request[ListByoipCidrsResponse, AWSError] = js.native
  
  /**
    * List the custom routing accelerators for an Amazon Web Services account. 
    */
  def listCustomRoutingAccelerators(): Request[ListCustomRoutingAcceleratorsResponse, AWSError] = js.native
  def listCustomRoutingAccelerators(callback: js.Function2[/* err */ AWSError, /* data */ ListCustomRoutingAcceleratorsResponse, Unit]): Request[ListCustomRoutingAcceleratorsResponse, AWSError] = js.native
  /**
    * List the custom routing accelerators for an Amazon Web Services account. 
    */
  def listCustomRoutingAccelerators(params: ListCustomRoutingAcceleratorsRequest): Request[ListCustomRoutingAcceleratorsResponse, AWSError] = js.native
  def listCustomRoutingAccelerators(
    params: ListCustomRoutingAcceleratorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCustomRoutingAcceleratorsResponse, Unit]
  ): Request[ListCustomRoutingAcceleratorsResponse, AWSError] = js.native
  
  /**
    * List the endpoint groups that are associated with a listener for a custom routing accelerator. 
    */
  def listCustomRoutingEndpointGroups(): Request[ListCustomRoutingEndpointGroupsResponse, AWSError] = js.native
  def listCustomRoutingEndpointGroups(
    callback: js.Function2[/* err */ AWSError, /* data */ ListCustomRoutingEndpointGroupsResponse, Unit]
  ): Request[ListCustomRoutingEndpointGroupsResponse, AWSError] = js.native
  /**
    * List the endpoint groups that are associated with a listener for a custom routing accelerator. 
    */
  def listCustomRoutingEndpointGroups(params: ListCustomRoutingEndpointGroupsRequest): Request[ListCustomRoutingEndpointGroupsResponse, AWSError] = js.native
  def listCustomRoutingEndpointGroups(
    params: ListCustomRoutingEndpointGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCustomRoutingEndpointGroupsResponse, Unit]
  ): Request[ListCustomRoutingEndpointGroupsResponse, AWSError] = js.native
  
  /**
    * List the listeners for a custom routing accelerator. 
    */
  def listCustomRoutingListeners(): Request[ListCustomRoutingListenersResponse, AWSError] = js.native
  def listCustomRoutingListeners(callback: js.Function2[/* err */ AWSError, /* data */ ListCustomRoutingListenersResponse, Unit]): Request[ListCustomRoutingListenersResponse, AWSError] = js.native
  /**
    * List the listeners for a custom routing accelerator. 
    */
  def listCustomRoutingListeners(params: ListCustomRoutingListenersRequest): Request[ListCustomRoutingListenersResponse, AWSError] = js.native
  def listCustomRoutingListeners(
    params: ListCustomRoutingListenersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCustomRoutingListenersResponse, Unit]
  ): Request[ListCustomRoutingListenersResponse, AWSError] = js.native
  
  /**
    * Provides a complete mapping from the public accelerator IP address and port to destination EC2 instance IP addresses and ports in the virtual public cloud (VPC) subnet endpoint for a custom routing accelerator. For each subnet endpoint that you add, Global Accelerator creates a new static port mapping for the accelerator. The port mappings don't change after Global Accelerator generates them, so you can retrieve and cache the full mapping on your servers.  If you remove a subnet from your accelerator, Global Accelerator removes (reclaims) the port mappings. If you add a subnet to your accelerator, Global Accelerator creates new port mappings (the existing ones don't change). If you add or remove EC2 instances in your subnet, the port mappings don't change, because the mappings are created when you add the subnet to Global Accelerator. The mappings also include a flag for each destination denoting which destination IP addresses and ports are allowed or denied traffic.
    */
  def listCustomRoutingPortMappings(): Request[ListCustomRoutingPortMappingsResponse, AWSError] = js.native
  def listCustomRoutingPortMappings(callback: js.Function2[/* err */ AWSError, /* data */ ListCustomRoutingPortMappingsResponse, Unit]): Request[ListCustomRoutingPortMappingsResponse, AWSError] = js.native
  /**
    * Provides a complete mapping from the public accelerator IP address and port to destination EC2 instance IP addresses and ports in the virtual public cloud (VPC) subnet endpoint for a custom routing accelerator. For each subnet endpoint that you add, Global Accelerator creates a new static port mapping for the accelerator. The port mappings don't change after Global Accelerator generates them, so you can retrieve and cache the full mapping on your servers.  If you remove a subnet from your accelerator, Global Accelerator removes (reclaims) the port mappings. If you add a subnet to your accelerator, Global Accelerator creates new port mappings (the existing ones don't change). If you add or remove EC2 instances in your subnet, the port mappings don't change, because the mappings are created when you add the subnet to Global Accelerator. The mappings also include a flag for each destination denoting which destination IP addresses and ports are allowed or denied traffic.
    */
  def listCustomRoutingPortMappings(params: ListCustomRoutingPortMappingsRequest): Request[ListCustomRoutingPortMappingsResponse, AWSError] = js.native
  def listCustomRoutingPortMappings(
    params: ListCustomRoutingPortMappingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCustomRoutingPortMappingsResponse, Unit]
  ): Request[ListCustomRoutingPortMappingsResponse, AWSError] = js.native
  
  /**
    * List the port mappings for a specific EC2 instance (destination) in a VPC subnet endpoint. The response is the mappings for one destination IP address. This is useful when your subnet endpoint has mappings that span multiple custom routing accelerators in your account, or for scenarios where you only want to list the port mappings for a specific destination instance.
    */
  def listCustomRoutingPortMappingsByDestination(): Request[ListCustomRoutingPortMappingsByDestinationResponse, AWSError] = js.native
  def listCustomRoutingPortMappingsByDestination(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListCustomRoutingPortMappingsByDestinationResponse, 
      Unit
    ]
  ): Request[ListCustomRoutingPortMappingsByDestinationResponse, AWSError] = js.native
  /**
    * List the port mappings for a specific EC2 instance (destination) in a VPC subnet endpoint. The response is the mappings for one destination IP address. This is useful when your subnet endpoint has mappings that span multiple custom routing accelerators in your account, or for scenarios where you only want to list the port mappings for a specific destination instance.
    */
  def listCustomRoutingPortMappingsByDestination(params: ListCustomRoutingPortMappingsByDestinationRequest): Request[ListCustomRoutingPortMappingsByDestinationResponse, AWSError] = js.native
  def listCustomRoutingPortMappingsByDestination(
    params: ListCustomRoutingPortMappingsByDestinationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListCustomRoutingPortMappingsByDestinationResponse, 
      Unit
    ]
  ): Request[ListCustomRoutingPortMappingsByDestinationResponse, AWSError] = js.native
  
  /**
    * List the endpoint groups that are associated with a listener. 
    */
  def listEndpointGroups(): Request[ListEndpointGroupsResponse, AWSError] = js.native
  def listEndpointGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointGroupsResponse, Unit]): Request[ListEndpointGroupsResponse, AWSError] = js.native
  /**
    * List the endpoint groups that are associated with a listener. 
    */
  def listEndpointGroups(params: ListEndpointGroupsRequest): Request[ListEndpointGroupsResponse, AWSError] = js.native
  def listEndpointGroups(
    params: ListEndpointGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointGroupsResponse, Unit]
  ): Request[ListEndpointGroupsResponse, AWSError] = js.native
  
  /**
    * List the listeners for an accelerator. 
    */
  def listListeners(): Request[ListListenersResponse, AWSError] = js.native
  def listListeners(callback: js.Function2[/* err */ AWSError, /* data */ ListListenersResponse, Unit]): Request[ListListenersResponse, AWSError] = js.native
  /**
    * List the listeners for an accelerator. 
    */
  def listListeners(params: ListListenersRequest): Request[ListListenersResponse, AWSError] = js.native
  def listListeners(
    params: ListListenersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListListenersResponse, Unit]
  ): Request[ListListenersResponse, AWSError] = js.native
  
  /**
    * List all tags for an accelerator.  For more information, see Tagging in Global Accelerator in the Global Accelerator Developer Guide. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * List all tags for an accelerator.  For more information, see Tagging in Global Accelerator in the Global Accelerator Developer Guide. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Provisions an IP address range to use with your Amazon Web Services resources through bring your own IP addresses (BYOIP) and creates a corresponding address pool. After the address range is provisioned, it is ready to be advertised using  AdvertiseByoipCidr. For more information, see Bring your own IP addresses (BYOIP) in the Global Accelerator Developer Guide.
    */
  def provisionByoipCidr(): Request[ProvisionByoipCidrResponse, AWSError] = js.native
  def provisionByoipCidr(callback: js.Function2[/* err */ AWSError, /* data */ ProvisionByoipCidrResponse, Unit]): Request[ProvisionByoipCidrResponse, AWSError] = js.native
  /**
    * Provisions an IP address range to use with your Amazon Web Services resources through bring your own IP addresses (BYOIP) and creates a corresponding address pool. After the address range is provisioned, it is ready to be advertised using  AdvertiseByoipCidr. For more information, see Bring your own IP addresses (BYOIP) in the Global Accelerator Developer Guide.
    */
  def provisionByoipCidr(params: ProvisionByoipCidrRequest): Request[ProvisionByoipCidrResponse, AWSError] = js.native
  def provisionByoipCidr(
    params: ProvisionByoipCidrRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ProvisionByoipCidrResponse, Unit]
  ): Request[ProvisionByoipCidrResponse, AWSError] = js.native
  
  /**
    * Remove endpoints from a custom routing accelerator.
    */
  def removeCustomRoutingEndpoints(): Request[js.Object, AWSError] = js.native
  def removeCustomRoutingEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Remove endpoints from a custom routing accelerator.
    */
  def removeCustomRoutingEndpoints(params: RemoveCustomRoutingEndpointsRequest): Request[js.Object, AWSError] = js.native
  def removeCustomRoutingEndpoints(
    params: RemoveCustomRoutingEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Add tags to an accelerator resource.  For more information, see Tagging in Global Accelerator in the Global Accelerator Developer Guide. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Add tags to an accelerator resource.  For more information, see Tagging in Global Accelerator in the Global Accelerator Developer Guide. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Remove tags from a Global Accelerator resource. When you specify a tag key, the action removes both that key and its associated value. The operation succeeds even if you attempt to remove tags from an accelerator that was already removed. For more information, see Tagging in Global Accelerator in the Global Accelerator Developer Guide.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Remove tags from a Global Accelerator resource. When you specify a tag key, the action removes both that key and its associated value. The operation succeeds even if you attempt to remove tags from an accelerator that was already removed. For more information, see Tagging in Global Accelerator in the Global Accelerator Developer Guide.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Update an accelerator.   Global Accelerator is a global service that supports endpoints in multiple Amazon Web Services Regions but you must specify the US West (Oregon) Region to create, update, or otherwise work with accelerators. That is, for example, specify --region us-west-2 on AWS CLI commands. 
    */
  def updateAccelerator(): Request[UpdateAcceleratorResponse, AWSError] = js.native
  def updateAccelerator(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAcceleratorResponse, Unit]): Request[UpdateAcceleratorResponse, AWSError] = js.native
  /**
    * Update an accelerator.   Global Accelerator is a global service that supports endpoints in multiple Amazon Web Services Regions but you must specify the US West (Oregon) Region to create, update, or otherwise work with accelerators. That is, for example, specify --region us-west-2 on AWS CLI commands. 
    */
  def updateAccelerator(params: UpdateAcceleratorRequest): Request[UpdateAcceleratorResponse, AWSError] = js.native
  def updateAccelerator(
    params: UpdateAcceleratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAcceleratorResponse, Unit]
  ): Request[UpdateAcceleratorResponse, AWSError] = js.native
  
  /**
    * Update the attributes for an accelerator. 
    */
  def updateAcceleratorAttributes(): Request[UpdateAcceleratorAttributesResponse, AWSError] = js.native
  def updateAcceleratorAttributes(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAcceleratorAttributesResponse, Unit]): Request[UpdateAcceleratorAttributesResponse, AWSError] = js.native
  /**
    * Update the attributes for an accelerator. 
    */
  def updateAcceleratorAttributes(params: UpdateAcceleratorAttributesRequest): Request[UpdateAcceleratorAttributesResponse, AWSError] = js.native
  def updateAcceleratorAttributes(
    params: UpdateAcceleratorAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAcceleratorAttributesResponse, Unit]
  ): Request[UpdateAcceleratorAttributesResponse, AWSError] = js.native
  
  /**
    * Update a custom routing accelerator. 
    */
  def updateCustomRoutingAccelerator(): Request[UpdateCustomRoutingAcceleratorResponse, AWSError] = js.native
  def updateCustomRoutingAccelerator(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCustomRoutingAcceleratorResponse, Unit]
  ): Request[UpdateCustomRoutingAcceleratorResponse, AWSError] = js.native
  /**
    * Update a custom routing accelerator. 
    */
  def updateCustomRoutingAccelerator(params: UpdateCustomRoutingAcceleratorRequest): Request[UpdateCustomRoutingAcceleratorResponse, AWSError] = js.native
  def updateCustomRoutingAccelerator(
    params: UpdateCustomRoutingAcceleratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCustomRoutingAcceleratorResponse, Unit]
  ): Request[UpdateCustomRoutingAcceleratorResponse, AWSError] = js.native
  
  /**
    * Update the attributes for a custom routing accelerator. 
    */
  def updateCustomRoutingAcceleratorAttributes(): Request[UpdateCustomRoutingAcceleratorAttributesResponse, AWSError] = js.native
  def updateCustomRoutingAcceleratorAttributes(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ UpdateCustomRoutingAcceleratorAttributesResponse, 
      Unit
    ]
  ): Request[UpdateCustomRoutingAcceleratorAttributesResponse, AWSError] = js.native
  /**
    * Update the attributes for a custom routing accelerator. 
    */
  def updateCustomRoutingAcceleratorAttributes(params: UpdateCustomRoutingAcceleratorAttributesRequest): Request[UpdateCustomRoutingAcceleratorAttributesResponse, AWSError] = js.native
  def updateCustomRoutingAcceleratorAttributes(
    params: UpdateCustomRoutingAcceleratorAttributesRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ UpdateCustomRoutingAcceleratorAttributesResponse, 
      Unit
    ]
  ): Request[UpdateCustomRoutingAcceleratorAttributesResponse, AWSError] = js.native
  
  /**
    * Update a listener for a custom routing accelerator. 
    */
  def updateCustomRoutingListener(): Request[UpdateCustomRoutingListenerResponse, AWSError] = js.native
  def updateCustomRoutingListener(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCustomRoutingListenerResponse, Unit]): Request[UpdateCustomRoutingListenerResponse, AWSError] = js.native
  /**
    * Update a listener for a custom routing accelerator. 
    */
  def updateCustomRoutingListener(params: UpdateCustomRoutingListenerRequest): Request[UpdateCustomRoutingListenerResponse, AWSError] = js.native
  def updateCustomRoutingListener(
    params: UpdateCustomRoutingListenerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCustomRoutingListenerResponse, Unit]
  ): Request[UpdateCustomRoutingListenerResponse, AWSError] = js.native
  
  /**
    * Update an endpoint group. A resource must be valid and active when you add it as an endpoint.
    */
  def updateEndpointGroup(): Request[UpdateEndpointGroupResponse, AWSError] = js.native
  def updateEndpointGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointGroupResponse, Unit]): Request[UpdateEndpointGroupResponse, AWSError] = js.native
  /**
    * Update an endpoint group. A resource must be valid and active when you add it as an endpoint.
    */
  def updateEndpointGroup(params: UpdateEndpointGroupRequest): Request[UpdateEndpointGroupResponse, AWSError] = js.native
  def updateEndpointGroup(
    params: UpdateEndpointGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointGroupResponse, Unit]
  ): Request[UpdateEndpointGroupResponse, AWSError] = js.native
  
  /**
    * Update a listener. 
    */
  def updateListener(): Request[UpdateListenerResponse, AWSError] = js.native
  def updateListener(callback: js.Function2[/* err */ AWSError, /* data */ UpdateListenerResponse, Unit]): Request[UpdateListenerResponse, AWSError] = js.native
  /**
    * Update a listener. 
    */
  def updateListener(params: UpdateListenerRequest): Request[UpdateListenerResponse, AWSError] = js.native
  def updateListener(
    params: UpdateListenerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateListenerResponse, Unit]
  ): Request[UpdateListenerResponse, AWSError] = js.native
  
  /**
    * Stops advertising an address range that is provisioned as an address pool. You can perform this operation at most once every 10 seconds, even if you specify different address ranges each time. It can take a few minutes before traffic to the specified addresses stops routing to Amazon Web Services because of propagation delays. For more information, see Bring your own IP addresses (BYOIP) in the Global Accelerator Developer Guide.
    */
  def withdrawByoipCidr(): Request[WithdrawByoipCidrResponse, AWSError] = js.native
  def withdrawByoipCidr(callback: js.Function2[/* err */ AWSError, /* data */ WithdrawByoipCidrResponse, Unit]): Request[WithdrawByoipCidrResponse, AWSError] = js.native
  /**
    * Stops advertising an address range that is provisioned as an address pool. You can perform this operation at most once every 10 seconds, even if you specify different address ranges each time. It can take a few minutes before traffic to the specified addresses stops routing to Amazon Web Services because of propagation delays. For more information, see Bring your own IP addresses (BYOIP) in the Global Accelerator Developer Guide.
    */
  def withdrawByoipCidr(params: WithdrawByoipCidrRequest): Request[WithdrawByoipCidrResponse, AWSError] = js.native
  def withdrawByoipCidr(
    params: WithdrawByoipCidrRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ WithdrawByoipCidrResponse, Unit]
  ): Request[WithdrawByoipCidrResponse, AWSError] = js.native
}
