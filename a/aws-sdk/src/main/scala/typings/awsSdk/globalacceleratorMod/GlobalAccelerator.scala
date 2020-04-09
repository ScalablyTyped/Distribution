package typings.awsSdk.globalacceleratorMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalAccelerator extends Service {
  @JSName("config")
  var config_GlobalAccelerator: ConfigBase with ClientConfiguration = js.native
  /**
    * Advertises an IPv4 address range that is provisioned for use with your AWS resources through bring your own IP addresses (BYOIP). It can take a few minutes before traffic to the specified addresses starts routing to AWS because of propagation delays. To see an AWS CLI example of advertising an address range, scroll down to Example. To stop advertising the BYOIP address range, use  WithdrawByoipCidr. For more information, see Bring Your Own IP Addresses (BYOIP) in the AWS Global Accelerator Developer Guide.
    */
  def advertiseByoipCidr(): Request[AdvertiseByoipCidrResponse, AWSError] = js.native
  def advertiseByoipCidr(callback: js.Function2[/* err */ AWSError, /* data */ AdvertiseByoipCidrResponse, Unit]): Request[AdvertiseByoipCidrResponse, AWSError] = js.native
  /**
    * Advertises an IPv4 address range that is provisioned for use with your AWS resources through bring your own IP addresses (BYOIP). It can take a few minutes before traffic to the specified addresses starts routing to AWS because of propagation delays. To see an AWS CLI example of advertising an address range, scroll down to Example. To stop advertising the BYOIP address range, use  WithdrawByoipCidr. For more information, see Bring Your Own IP Addresses (BYOIP) in the AWS Global Accelerator Developer Guide.
    */
  def advertiseByoipCidr(params: AdvertiseByoipCidrRequest): Request[AdvertiseByoipCidrResponse, AWSError] = js.native
  def advertiseByoipCidr(
    params: AdvertiseByoipCidrRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AdvertiseByoipCidrResponse, Unit]
  ): Request[AdvertiseByoipCidrResponse, AWSError] = js.native
  /**
    * Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers. To see an AWS CLI example of creating an accelerator, scroll down to Example. If you bring your own IP address ranges to AWS Global Accelerator (BYOIP), you can assign IP addresses from your own pool to your accelerator as the static IP address entry points. Only one IP address from each of your IP address ranges can be used for each accelerator.  You must specify the US West (Oregon) Region to create or update accelerators. 
    */
  def createAccelerator(): Request[CreateAcceleratorResponse, AWSError] = js.native
  def createAccelerator(callback: js.Function2[/* err */ AWSError, /* data */ CreateAcceleratorResponse, Unit]): Request[CreateAcceleratorResponse, AWSError] = js.native
  /**
    * Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers. To see an AWS CLI example of creating an accelerator, scroll down to Example. If you bring your own IP address ranges to AWS Global Accelerator (BYOIP), you can assign IP addresses from your own pool to your accelerator as the static IP address entry points. Only one IP address from each of your IP address ranges can be used for each accelerator.  You must specify the US West (Oregon) Region to create or update accelerators. 
    */
  def createAccelerator(params: CreateAcceleratorRequest): Request[CreateAcceleratorResponse, AWSError] = js.native
  def createAccelerator(
    params: CreateAcceleratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAcceleratorResponse, Unit]
  ): Request[CreateAcceleratorResponse, AWSError] = js.native
  /**
    * Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one AWS Region. To see an AWS CLI example of creating an endpoint group, scroll down to Example.
    */
  def createEndpointGroup(): Request[CreateEndpointGroupResponse, AWSError] = js.native
  def createEndpointGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointGroupResponse, Unit]): Request[CreateEndpointGroupResponse, AWSError] = js.native
  /**
    * Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one AWS Region. To see an AWS CLI example of creating an endpoint group, scroll down to Example.
    */
  def createEndpointGroup(params: CreateEndpointGroupRequest): Request[CreateEndpointGroupResponse, AWSError] = js.native
  def createEndpointGroup(
    params: CreateEndpointGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointGroupResponse, Unit]
  ): Request[CreateEndpointGroupResponse, AWSError] = js.native
  /**
    * Create a listener to process inbound connections from clients to an accelerator. Connections arrive to assigned static IP addresses on a port, port range, or list of port ranges that you specify. To see an AWS CLI example of creating a listener, scroll down to Example.
    */
  def createListener(): Request[CreateListenerResponse, AWSError] = js.native
  def createListener(callback: js.Function2[/* err */ AWSError, /* data */ CreateListenerResponse, Unit]): Request[CreateListenerResponse, AWSError] = js.native
  /**
    * Create a listener to process inbound connections from clients to an accelerator. Connections arrive to assigned static IP addresses on a port, port range, or list of port ranges that you specify. To see an AWS CLI example of creating a listener, scroll down to Example.
    */
  def createListener(params: CreateListenerRequest): Request[CreateListenerResponse, AWSError] = js.native
  def createListener(
    params: CreateListenerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateListenerResponse, Unit]
  ): Request[CreateListenerResponse, AWSError] = js.native
  /**
    * Delete an accelerator. Before you can delete an accelerator, you must disable it and remove all dependent resources (listeners and endpoint groups). To disable the accelerator, update the accelerator to set Enabled to false.  When you create an accelerator, by default, Global Accelerator provides you with a set of two static IP addresses. Alternatively, you can bring your own IP address ranges to Global Accelerator and assign IP addresses from those ranges.  The IP addresses are assigned to your accelerator for as long as it exists, even if you disable the accelerator and it no longer accepts or routes traffic. However, when you delete an accelerator, you lose the static IP addresses that are assigned to the accelerator, so you can no longer route traffic by using them. As a best practice, ensure that you have permissions in place to avoid inadvertently deleting accelerators. You can use IAM policies with Global Accelerator to limit the users who have permissions to delete an accelerator. For more information, see Authentication and Access Control in the AWS Global Accelerator Developer Guide. 
    */
  def deleteAccelerator(): Request[js.Object, AWSError] = js.native
  def deleteAccelerator(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete an accelerator. Before you can delete an accelerator, you must disable it and remove all dependent resources (listeners and endpoint groups). To disable the accelerator, update the accelerator to set Enabled to false.  When you create an accelerator, by default, Global Accelerator provides you with a set of two static IP addresses. Alternatively, you can bring your own IP address ranges to Global Accelerator and assign IP addresses from those ranges.  The IP addresses are assigned to your accelerator for as long as it exists, even if you disable the accelerator and it no longer accepts or routes traffic. However, when you delete an accelerator, you lose the static IP addresses that are assigned to the accelerator, so you can no longer route traffic by using them. As a best practice, ensure that you have permissions in place to avoid inadvertently deleting accelerators. You can use IAM policies with Global Accelerator to limit the users who have permissions to delete an accelerator. For more information, see Authentication and Access Control in the AWS Global Accelerator Developer Guide. 
    */
  def deleteAccelerator(params: DeleteAcceleratorRequest): Request[js.Object, AWSError] = js.native
  def deleteAccelerator(
    params: DeleteAcceleratorRequest,
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
    * Releases the specified address range that you provisioned to use with your AWS resources through bring your own IP addresses (BYOIP) and deletes the corresponding address pool. To see an AWS CLI example of deprovisioning an address range, scroll down to Example. Before you can release an address range, you must stop advertising it by using WithdrawByoipCidr and you must not have any accelerators that are using static IP addresses allocated from its address range.  For more information, see Bring Your Own IP Addresses (BYOIP) in the AWS Global Accelerator Developer Guide.
    */
  def deprovisionByoipCidr(): Request[DeprovisionByoipCidrResponse, AWSError] = js.native
  def deprovisionByoipCidr(callback: js.Function2[/* err */ AWSError, /* data */ DeprovisionByoipCidrResponse, Unit]): Request[DeprovisionByoipCidrResponse, AWSError] = js.native
  /**
    * Releases the specified address range that you provisioned to use with your AWS resources through bring your own IP addresses (BYOIP) and deletes the corresponding address pool. To see an AWS CLI example of deprovisioning an address range, scroll down to Example. Before you can release an address range, you must stop advertising it by using WithdrawByoipCidr and you must not have any accelerators that are using static IP addresses allocated from its address range.  For more information, see Bring Your Own IP Addresses (BYOIP) in the AWS Global Accelerator Developer Guide.
    */
  def deprovisionByoipCidr(params: DeprovisionByoipCidrRequest): Request[DeprovisionByoipCidrResponse, AWSError] = js.native
  def deprovisionByoipCidr(
    params: DeprovisionByoipCidrRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeprovisionByoipCidrResponse, Unit]
  ): Request[DeprovisionByoipCidrResponse, AWSError] = js.native
  /**
    * Describe an accelerator. To see an AWS CLI example of describing an accelerator, scroll down to Example.
    */
  def describeAccelerator(): Request[DescribeAcceleratorResponse, AWSError] = js.native
  def describeAccelerator(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorResponse, Unit]): Request[DescribeAcceleratorResponse, AWSError] = js.native
  /**
    * Describe an accelerator. To see an AWS CLI example of describing an accelerator, scroll down to Example.
    */
  def describeAccelerator(params: DescribeAcceleratorRequest): Request[DescribeAcceleratorResponse, AWSError] = js.native
  def describeAccelerator(
    params: DescribeAcceleratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorResponse, Unit]
  ): Request[DescribeAcceleratorResponse, AWSError] = js.native
  /**
    * Describe the attributes of an accelerator. To see an AWS CLI example of describing the attributes of an accelerator, scroll down to Example.
    */
  def describeAcceleratorAttributes(): Request[DescribeAcceleratorAttributesResponse, AWSError] = js.native
  def describeAcceleratorAttributes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorAttributesResponse, Unit]): Request[DescribeAcceleratorAttributesResponse, AWSError] = js.native
  /**
    * Describe the attributes of an accelerator. To see an AWS CLI example of describing the attributes of an accelerator, scroll down to Example.
    */
  def describeAcceleratorAttributes(params: DescribeAcceleratorAttributesRequest): Request[DescribeAcceleratorAttributesResponse, AWSError] = js.native
  def describeAcceleratorAttributes(
    params: DescribeAcceleratorAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorAttributesResponse, Unit]
  ): Request[DescribeAcceleratorAttributesResponse, AWSError] = js.native
  /**
    * Describe an endpoint group. To see an AWS CLI example of describing an endpoint group, scroll down to Example.
    */
  def describeEndpointGroup(): Request[DescribeEndpointGroupResponse, AWSError] = js.native
  def describeEndpointGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointGroupResponse, Unit]): Request[DescribeEndpointGroupResponse, AWSError] = js.native
  /**
    * Describe an endpoint group. To see an AWS CLI example of describing an endpoint group, scroll down to Example.
    */
  def describeEndpointGroup(params: DescribeEndpointGroupRequest): Request[DescribeEndpointGroupResponse, AWSError] = js.native
  def describeEndpointGroup(
    params: DescribeEndpointGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointGroupResponse, Unit]
  ): Request[DescribeEndpointGroupResponse, AWSError] = js.native
  /**
    * Describe a listener. To see an AWS CLI example of describing a listener, scroll down to Example.
    */
  def describeListener(): Request[DescribeListenerResponse, AWSError] = js.native
  def describeListener(callback: js.Function2[/* err */ AWSError, /* data */ DescribeListenerResponse, Unit]): Request[DescribeListenerResponse, AWSError] = js.native
  /**
    * Describe a listener. To see an AWS CLI example of describing a listener, scroll down to Example.
    */
  def describeListener(params: DescribeListenerRequest): Request[DescribeListenerResponse, AWSError] = js.native
  def describeListener(
    params: DescribeListenerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeListenerResponse, Unit]
  ): Request[DescribeListenerResponse, AWSError] = js.native
  /**
    * List the accelerators for an AWS account. To see an AWS CLI example of listing the accelerators for an AWS account, scroll down to Example.
    */
  def listAccelerators(): Request[ListAcceleratorsResponse, AWSError] = js.native
  def listAccelerators(callback: js.Function2[/* err */ AWSError, /* data */ ListAcceleratorsResponse, Unit]): Request[ListAcceleratorsResponse, AWSError] = js.native
  /**
    * List the accelerators for an AWS account. To see an AWS CLI example of listing the accelerators for an AWS account, scroll down to Example.
    */
  def listAccelerators(params: ListAcceleratorsRequest): Request[ListAcceleratorsResponse, AWSError] = js.native
  def listAccelerators(
    params: ListAcceleratorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAcceleratorsResponse, Unit]
  ): Request[ListAcceleratorsResponse, AWSError] = js.native
  /**
    * Lists the IP address ranges that were specified in calls to ProvisionByoipCidr, including the current state and a history of state changes. To see an AWS CLI example of listing BYOIP CIDR addresses, scroll down to Example.
    */
  def listByoipCidrs(): Request[ListByoipCidrsResponse, AWSError] = js.native
  def listByoipCidrs(callback: js.Function2[/* err */ AWSError, /* data */ ListByoipCidrsResponse, Unit]): Request[ListByoipCidrsResponse, AWSError] = js.native
  /**
    * Lists the IP address ranges that were specified in calls to ProvisionByoipCidr, including the current state and a history of state changes. To see an AWS CLI example of listing BYOIP CIDR addresses, scroll down to Example.
    */
  def listByoipCidrs(params: ListByoipCidrsRequest): Request[ListByoipCidrsResponse, AWSError] = js.native
  def listByoipCidrs(
    params: ListByoipCidrsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListByoipCidrsResponse, Unit]
  ): Request[ListByoipCidrsResponse, AWSError] = js.native
  /**
    * List the endpoint groups that are associated with a listener. To see an AWS CLI example of listing the endpoint groups for listener, scroll down to Example.
    */
  def listEndpointGroups(): Request[ListEndpointGroupsResponse, AWSError] = js.native
  def listEndpointGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointGroupsResponse, Unit]): Request[ListEndpointGroupsResponse, AWSError] = js.native
  /**
    * List the endpoint groups that are associated with a listener. To see an AWS CLI example of listing the endpoint groups for listener, scroll down to Example.
    */
  def listEndpointGroups(params: ListEndpointGroupsRequest): Request[ListEndpointGroupsResponse, AWSError] = js.native
  def listEndpointGroups(
    params: ListEndpointGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointGroupsResponse, Unit]
  ): Request[ListEndpointGroupsResponse, AWSError] = js.native
  /**
    * List the listeners for an accelerator. To see an AWS CLI example of listing the listeners for an accelerator, scroll down to Example.
    */
  def listListeners(): Request[ListListenersResponse, AWSError] = js.native
  def listListeners(callback: js.Function2[/* err */ AWSError, /* data */ ListListenersResponse, Unit]): Request[ListListenersResponse, AWSError] = js.native
  /**
    * List the listeners for an accelerator. To see an AWS CLI example of listing the listeners for an accelerator, scroll down to Example.
    */
  def listListeners(params: ListListenersRequest): Request[ListListenersResponse, AWSError] = js.native
  def listListeners(
    params: ListListenersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListListenersResponse, Unit]
  ): Request[ListListenersResponse, AWSError] = js.native
  /**
    * List all tags for an accelerator. To see an AWS CLI example of listing tags for an accelerator, scroll down to Example. For more information, see Tagging in AWS Global Accelerator in the AWS Global Accelerator Developer Guide. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * List all tags for an accelerator. To see an AWS CLI example of listing tags for an accelerator, scroll down to Example. For more information, see Tagging in AWS Global Accelerator in the AWS Global Accelerator Developer Guide. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Provisions an IP address range to use with your AWS resources through bring your own IP addresses (BYOIP) and creates a corresponding address pool. After the address range is provisioned, it is ready to be advertised using  AdvertiseByoipCidr. To see an AWS CLI example of provisioning an address range for BYOIP, scroll down to Example. For more information, see Bring Your Own IP Addresses (BYOIP) in the AWS Global Accelerator Developer Guide.
    */
  def provisionByoipCidr(): Request[ProvisionByoipCidrResponse, AWSError] = js.native
  def provisionByoipCidr(callback: js.Function2[/* err */ AWSError, /* data */ ProvisionByoipCidrResponse, Unit]): Request[ProvisionByoipCidrResponse, AWSError] = js.native
  /**
    * Provisions an IP address range to use with your AWS resources through bring your own IP addresses (BYOIP) and creates a corresponding address pool. After the address range is provisioned, it is ready to be advertised using  AdvertiseByoipCidr. To see an AWS CLI example of provisioning an address range for BYOIP, scroll down to Example. For more information, see Bring Your Own IP Addresses (BYOIP) in the AWS Global Accelerator Developer Guide.
    */
  def provisionByoipCidr(params: ProvisionByoipCidrRequest): Request[ProvisionByoipCidrResponse, AWSError] = js.native
  def provisionByoipCidr(
    params: ProvisionByoipCidrRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ProvisionByoipCidrResponse, Unit]
  ): Request[ProvisionByoipCidrResponse, AWSError] = js.native
  /**
    * Add tags to an accelerator resource. To see an AWS CLI example of adding tags to an accelerator, scroll down to Example. For more information, see Tagging in AWS Global Accelerator in the AWS Global Accelerator Developer Guide. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Add tags to an accelerator resource. To see an AWS CLI example of adding tags to an accelerator, scroll down to Example. For more information, see Tagging in AWS Global Accelerator in the AWS Global Accelerator Developer Guide. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Remove tags from a Global Accelerator resource. When you specify a tag key, the action removes both that key and its associated value. To see an AWS CLI example of removing tags from an accelerator, scroll down to Example. The operation succeeds even if you attempt to remove tags from an accelerator that was already removed. For more information, see Tagging in AWS Global Accelerator in the AWS Global Accelerator Developer Guide.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Remove tags from a Global Accelerator resource. When you specify a tag key, the action removes both that key and its associated value. To see an AWS CLI example of removing tags from an accelerator, scroll down to Example. The operation succeeds even if you attempt to remove tags from an accelerator that was already removed. For more information, see Tagging in AWS Global Accelerator in the AWS Global Accelerator Developer Guide.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Update an accelerator. To see an AWS CLI example of updating an accelerator, scroll down to Example.  You must specify the US West (Oregon) Region to create or update accelerators. 
    */
  def updateAccelerator(): Request[UpdateAcceleratorResponse, AWSError] = js.native
  def updateAccelerator(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAcceleratorResponse, Unit]): Request[UpdateAcceleratorResponse, AWSError] = js.native
  /**
    * Update an accelerator. To see an AWS CLI example of updating an accelerator, scroll down to Example.  You must specify the US West (Oregon) Region to create or update accelerators. 
    */
  def updateAccelerator(params: UpdateAcceleratorRequest): Request[UpdateAcceleratorResponse, AWSError] = js.native
  def updateAccelerator(
    params: UpdateAcceleratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAcceleratorResponse, Unit]
  ): Request[UpdateAcceleratorResponse, AWSError] = js.native
  /**
    * Update the attributes for an accelerator. To see an AWS CLI example of updating an accelerator to enable flow logs, scroll down to Example.
    */
  def updateAcceleratorAttributes(): Request[UpdateAcceleratorAttributesResponse, AWSError] = js.native
  def updateAcceleratorAttributes(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAcceleratorAttributesResponse, Unit]): Request[UpdateAcceleratorAttributesResponse, AWSError] = js.native
  /**
    * Update the attributes for an accelerator. To see an AWS CLI example of updating an accelerator to enable flow logs, scroll down to Example.
    */
  def updateAcceleratorAttributes(params: UpdateAcceleratorAttributesRequest): Request[UpdateAcceleratorAttributesResponse, AWSError] = js.native
  def updateAcceleratorAttributes(
    params: UpdateAcceleratorAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAcceleratorAttributesResponse, Unit]
  ): Request[UpdateAcceleratorAttributesResponse, AWSError] = js.native
  /**
    * Update an endpoint group. To see an AWS CLI example of updating an endpoint group, scroll down to Example.
    */
  def updateEndpointGroup(): Request[UpdateEndpointGroupResponse, AWSError] = js.native
  def updateEndpointGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointGroupResponse, Unit]): Request[UpdateEndpointGroupResponse, AWSError] = js.native
  /**
    * Update an endpoint group. To see an AWS CLI example of updating an endpoint group, scroll down to Example.
    */
  def updateEndpointGroup(params: UpdateEndpointGroupRequest): Request[UpdateEndpointGroupResponse, AWSError] = js.native
  def updateEndpointGroup(
    params: UpdateEndpointGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointGroupResponse, Unit]
  ): Request[UpdateEndpointGroupResponse, AWSError] = js.native
  /**
    * Update a listener. To see an AWS CLI example of updating listener, scroll down to Example.
    */
  def updateListener(): Request[UpdateListenerResponse, AWSError] = js.native
  def updateListener(callback: js.Function2[/* err */ AWSError, /* data */ UpdateListenerResponse, Unit]): Request[UpdateListenerResponse, AWSError] = js.native
  /**
    * Update a listener. To see an AWS CLI example of updating listener, scroll down to Example.
    */
  def updateListener(params: UpdateListenerRequest): Request[UpdateListenerResponse, AWSError] = js.native
  def updateListener(
    params: UpdateListenerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateListenerResponse, Unit]
  ): Request[UpdateListenerResponse, AWSError] = js.native
  /**
    * Stops advertising an address range that is provisioned as an address pool. You can perform this operation at most once every 10 seconds, even if you specify different address ranges each time. To see an AWS CLI example of withdrawing an address range for BYOIP so it will no longer be advertised by AWS, scroll down to Example. It can take a few minutes before traffic to the specified addresses stops routing to AWS because of propagation delays. For more information, see Bring Your Own IP Addresses (BYOIP) in the AWS Global Accelerator Developer Guide.
    */
  def withdrawByoipCidr(): Request[WithdrawByoipCidrResponse, AWSError] = js.native
  def withdrawByoipCidr(callback: js.Function2[/* err */ AWSError, /* data */ WithdrawByoipCidrResponse, Unit]): Request[WithdrawByoipCidrResponse, AWSError] = js.native
  /**
    * Stops advertising an address range that is provisioned as an address pool. You can perform this operation at most once every 10 seconds, even if you specify different address ranges each time. To see an AWS CLI example of withdrawing an address range for BYOIP so it will no longer be advertised by AWS, scroll down to Example. It can take a few minutes before traffic to the specified addresses stops routing to AWS because of propagation delays. For more information, see Bring Your Own IP Addresses (BYOIP) in the AWS Global Accelerator Developer Guide.
    */
  def withdrawByoipCidr(params: WithdrawByoipCidrRequest): Request[WithdrawByoipCidrResponse, AWSError] = js.native
  def withdrawByoipCidr(
    params: WithdrawByoipCidrRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ WithdrawByoipCidrResponse, Unit]
  ): Request[WithdrawByoipCidrResponse, AWSError] = js.native
}

