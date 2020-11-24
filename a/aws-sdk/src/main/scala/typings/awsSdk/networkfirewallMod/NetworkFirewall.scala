package typings.awsSdk.networkfirewallMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkFirewall extends Service {
  
  /**
    * Associates a FirewallPolicy to a Firewall.  A firewall policy defines how to monitor and manage your VPC network traffic, using a collection of inspection rule groups and other settings. Each firewall requires one firewall policy association, and you can use the same firewall policy for multiple firewalls. 
    */
  def associateFirewallPolicy(): Request[AssociateFirewallPolicyResponse, AWSError] = js.native
  def associateFirewallPolicy(callback: js.Function2[/* err */ AWSError, /* data */ AssociateFirewallPolicyResponse, Unit]): Request[AssociateFirewallPolicyResponse, AWSError] = js.native
  /**
    * Associates a FirewallPolicy to a Firewall.  A firewall policy defines how to monitor and manage your VPC network traffic, using a collection of inspection rule groups and other settings. Each firewall requires one firewall policy association, and you can use the same firewall policy for multiple firewalls. 
    */
  def associateFirewallPolicy(params: AssociateFirewallPolicyRequest): Request[AssociateFirewallPolicyResponse, AWSError] = js.native
  def associateFirewallPolicy(
    params: AssociateFirewallPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateFirewallPolicyResponse, Unit]
  ): Request[AssociateFirewallPolicyResponse, AWSError] = js.native
  
  /**
    * Associates the specified subnets in the Amazon VPC to the firewall. You can specify one subnet for each of the Availability Zones that the VPC spans.  This request creates an AWS Network Firewall firewall endpoint in each of the subnets. To enable the firewall's protections, you must also modify the VPC's route tables for each subnet's Availability Zone, to redirect the traffic that's coming into and going out of the zone through the firewall endpoint. 
    */
  def associateSubnets(): Request[AssociateSubnetsResponse, AWSError] = js.native
  def associateSubnets(callback: js.Function2[/* err */ AWSError, /* data */ AssociateSubnetsResponse, Unit]): Request[AssociateSubnetsResponse, AWSError] = js.native
  /**
    * Associates the specified subnets in the Amazon VPC to the firewall. You can specify one subnet for each of the Availability Zones that the VPC spans.  This request creates an AWS Network Firewall firewall endpoint in each of the subnets. To enable the firewall's protections, you must also modify the VPC's route tables for each subnet's Availability Zone, to redirect the traffic that's coming into and going out of the zone through the firewall endpoint. 
    */
  def associateSubnets(params: AssociateSubnetsRequest): Request[AssociateSubnetsResponse, AWSError] = js.native
  def associateSubnets(
    params: AssociateSubnetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateSubnetsResponse, Unit]
  ): Request[AssociateSubnetsResponse, AWSError] = js.native
  
  @JSName("config")
  var config_NetworkFirewall: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates an AWS Network Firewall Firewall and accompanying FirewallStatus for a VPC.  The firewall defines the configuration settings for an AWS Network Firewall firewall. The settings that you can define at creation include the firewall policy, the subnets in your VPC to use for the firewall endpoints, and any tags that are attached to the firewall AWS resource.  After you create a firewall, you can provide additional settings, like the logging configuration.  To update the settings for a firewall, you use the operations that apply to the settings themselves, for example UpdateLoggingConfiguration, AssociateSubnets, and UpdateFirewallDeleteProtection.  To manage a firewall's tags, use the standard AWS resource tagging operations, ListTagsForResource, TagResource, and UntagResource. To retrieve information about firewalls, use ListFirewalls and DescribeFirewall.
    */
  def createFirewall(): Request[CreateFirewallResponse, AWSError] = js.native
  def createFirewall(callback: js.Function2[/* err */ AWSError, /* data */ CreateFirewallResponse, Unit]): Request[CreateFirewallResponse, AWSError] = js.native
  /**
    * Creates an AWS Network Firewall Firewall and accompanying FirewallStatus for a VPC.  The firewall defines the configuration settings for an AWS Network Firewall firewall. The settings that you can define at creation include the firewall policy, the subnets in your VPC to use for the firewall endpoints, and any tags that are attached to the firewall AWS resource.  After you create a firewall, you can provide additional settings, like the logging configuration.  To update the settings for a firewall, you use the operations that apply to the settings themselves, for example UpdateLoggingConfiguration, AssociateSubnets, and UpdateFirewallDeleteProtection.  To manage a firewall's tags, use the standard AWS resource tagging operations, ListTagsForResource, TagResource, and UntagResource. To retrieve information about firewalls, use ListFirewalls and DescribeFirewall.
    */
  def createFirewall(params: CreateFirewallRequest): Request[CreateFirewallResponse, AWSError] = js.native
  def createFirewall(
    params: CreateFirewallRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFirewallResponse, Unit]
  ): Request[CreateFirewallResponse, AWSError] = js.native
  
  /**
    * Creates the firewall policy for the firewall according to the specifications.  An AWS Network Firewall firewall policy defines the behavior of a firewall, in a collection of stateless and stateful rule groups and other settings. You can use one firewall policy for multiple firewalls. 
    */
  def createFirewallPolicy(): Request[CreateFirewallPolicyResponse, AWSError] = js.native
  def createFirewallPolicy(callback: js.Function2[/* err */ AWSError, /* data */ CreateFirewallPolicyResponse, Unit]): Request[CreateFirewallPolicyResponse, AWSError] = js.native
  /**
    * Creates the firewall policy for the firewall according to the specifications.  An AWS Network Firewall firewall policy defines the behavior of a firewall, in a collection of stateless and stateful rule groups and other settings. You can use one firewall policy for multiple firewalls. 
    */
  def createFirewallPolicy(params: CreateFirewallPolicyRequest): Request[CreateFirewallPolicyResponse, AWSError] = js.native
  def createFirewallPolicy(
    params: CreateFirewallPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFirewallPolicyResponse, Unit]
  ): Request[CreateFirewallPolicyResponse, AWSError] = js.native
  
  /**
    * Creates the specified stateless or stateful rule group, which includes the rules for network traffic inspection, a capacity setting, and tags.  You provide your rule group specification in your request using either RuleGroup or Rules.
    */
  def createRuleGroup(): Request[CreateRuleGroupResponse, AWSError] = js.native
  def createRuleGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleGroupResponse, Unit]): Request[CreateRuleGroupResponse, AWSError] = js.native
  /**
    * Creates the specified stateless or stateful rule group, which includes the rules for network traffic inspection, a capacity setting, and tags.  You provide your rule group specification in your request using either RuleGroup or Rules.
    */
  def createRuleGroup(params: CreateRuleGroupRequest): Request[CreateRuleGroupResponse, AWSError] = js.native
  def createRuleGroup(
    params: CreateRuleGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleGroupResponse, Unit]
  ): Request[CreateRuleGroupResponse, AWSError] = js.native
  
  /**
    * Deletes the specified Firewall and its FirewallStatus. This operation requires the firewall's DeleteProtection flag to be FALSE. You can't revert this operation.  You can check whether a firewall is in use by reviewing the route tables for the Availability Zones where you have firewall subnet mappings. Retrieve the subnet mappings by calling DescribeFirewall. You define and update the route tables through Amazon VPC. As needed, update the route tables for the zones to remove the firewall endpoints. When the route tables no longer use the firewall endpoints, you can remove the firewall safely. To delete a firewall, remove the delete protection if you need to using UpdateFirewallDeleteProtection, then delete the firewall by calling DeleteFirewall. 
    */
  def deleteFirewall(): Request[DeleteFirewallResponse, AWSError] = js.native
  def deleteFirewall(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFirewallResponse, Unit]): Request[DeleteFirewallResponse, AWSError] = js.native
  /**
    * Deletes the specified Firewall and its FirewallStatus. This operation requires the firewall's DeleteProtection flag to be FALSE. You can't revert this operation.  You can check whether a firewall is in use by reviewing the route tables for the Availability Zones where you have firewall subnet mappings. Retrieve the subnet mappings by calling DescribeFirewall. You define and update the route tables through Amazon VPC. As needed, update the route tables for the zones to remove the firewall endpoints. When the route tables no longer use the firewall endpoints, you can remove the firewall safely. To delete a firewall, remove the delete protection if you need to using UpdateFirewallDeleteProtection, then delete the firewall by calling DeleteFirewall. 
    */
  def deleteFirewall(params: DeleteFirewallRequest): Request[DeleteFirewallResponse, AWSError] = js.native
  def deleteFirewall(
    params: DeleteFirewallRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFirewallResponse, Unit]
  ): Request[DeleteFirewallResponse, AWSError] = js.native
  
  /**
    * Deletes the specified FirewallPolicy. 
    */
  def deleteFirewallPolicy(): Request[DeleteFirewallPolicyResponse, AWSError] = js.native
  def deleteFirewallPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFirewallPolicyResponse, Unit]): Request[DeleteFirewallPolicyResponse, AWSError] = js.native
  /**
    * Deletes the specified FirewallPolicy. 
    */
  def deleteFirewallPolicy(params: DeleteFirewallPolicyRequest): Request[DeleteFirewallPolicyResponse, AWSError] = js.native
  def deleteFirewallPolicy(
    params: DeleteFirewallPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFirewallPolicyResponse, Unit]
  ): Request[DeleteFirewallPolicyResponse, AWSError] = js.native
  
  /**
    * Deletes a resource policy that you created in a PutResourcePolicy request. 
    */
  def deleteResourcePolicy(): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  def deleteResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyResponse, Unit]): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  /**
    * Deletes a resource policy that you created in a PutResourcePolicy request. 
    */
  def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  def deleteResourcePolicy(
    params: DeleteResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyResponse, Unit]
  ): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Deletes the specified RuleGroup. 
    */
  def deleteRuleGroup(): Request[DeleteRuleGroupResponse, AWSError] = js.native
  def deleteRuleGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRuleGroupResponse, Unit]): Request[DeleteRuleGroupResponse, AWSError] = js.native
  /**
    * Deletes the specified RuleGroup. 
    */
  def deleteRuleGroup(params: DeleteRuleGroupRequest): Request[DeleteRuleGroupResponse, AWSError] = js.native
  def deleteRuleGroup(
    params: DeleteRuleGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRuleGroupResponse, Unit]
  ): Request[DeleteRuleGroupResponse, AWSError] = js.native
  
  /**
    * Returns the data objects for the specified firewall. 
    */
  def describeFirewall(): Request[DescribeFirewallResponse, AWSError] = js.native
  def describeFirewall(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFirewallResponse, Unit]): Request[DescribeFirewallResponse, AWSError] = js.native
  /**
    * Returns the data objects for the specified firewall. 
    */
  def describeFirewall(params: DescribeFirewallRequest): Request[DescribeFirewallResponse, AWSError] = js.native
  def describeFirewall(
    params: DescribeFirewallRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFirewallResponse, Unit]
  ): Request[DescribeFirewallResponse, AWSError] = js.native
  
  /**
    * Returns the data objects for the specified firewall policy. 
    */
  def describeFirewallPolicy(): Request[DescribeFirewallPolicyResponse, AWSError] = js.native
  def describeFirewallPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFirewallPolicyResponse, Unit]): Request[DescribeFirewallPolicyResponse, AWSError] = js.native
  /**
    * Returns the data objects for the specified firewall policy. 
    */
  def describeFirewallPolicy(params: DescribeFirewallPolicyRequest): Request[DescribeFirewallPolicyResponse, AWSError] = js.native
  def describeFirewallPolicy(
    params: DescribeFirewallPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFirewallPolicyResponse, Unit]
  ): Request[DescribeFirewallPolicyResponse, AWSError] = js.native
  
  /**
    * Returns the logging configuration for the specified firewall. 
    */
  def describeLoggingConfiguration(): Request[DescribeLoggingConfigurationResponse, AWSError] = js.native
  def describeLoggingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoggingConfigurationResponse, Unit]): Request[DescribeLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Returns the logging configuration for the specified firewall. 
    */
  def describeLoggingConfiguration(params: DescribeLoggingConfigurationRequest): Request[DescribeLoggingConfigurationResponse, AWSError] = js.native
  def describeLoggingConfiguration(
    params: DescribeLoggingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoggingConfigurationResponse, Unit]
  ): Request[DescribeLoggingConfigurationResponse, AWSError] = js.native
  
  /**
    * Retrieves a resource policy that you created in a PutResourcePolicy request. 
    */
  def describeResourcePolicy(): Request[DescribeResourcePolicyResponse, AWSError] = js.native
  def describeResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourcePolicyResponse, Unit]): Request[DescribeResourcePolicyResponse, AWSError] = js.native
  /**
    * Retrieves a resource policy that you created in a PutResourcePolicy request. 
    */
  def describeResourcePolicy(params: DescribeResourcePolicyRequest): Request[DescribeResourcePolicyResponse, AWSError] = js.native
  def describeResourcePolicy(
    params: DescribeResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourcePolicyResponse, Unit]
  ): Request[DescribeResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Returns the data objects for the specified rule group. 
    */
  def describeRuleGroup(): Request[DescribeRuleGroupResponse, AWSError] = js.native
  def describeRuleGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRuleGroupResponse, Unit]): Request[DescribeRuleGroupResponse, AWSError] = js.native
  /**
    * Returns the data objects for the specified rule group. 
    */
  def describeRuleGroup(params: DescribeRuleGroupRequest): Request[DescribeRuleGroupResponse, AWSError] = js.native
  def describeRuleGroup(
    params: DescribeRuleGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRuleGroupResponse, Unit]
  ): Request[DescribeRuleGroupResponse, AWSError] = js.native
  
  /**
    * Removes the specified subnet associations from the firewall. This removes the firewall endpoints from the subnets and removes any network filtering protections that the endpoints were providing. 
    */
  def disassociateSubnets(): Request[DisassociateSubnetsResponse, AWSError] = js.native
  def disassociateSubnets(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateSubnetsResponse, Unit]): Request[DisassociateSubnetsResponse, AWSError] = js.native
  /**
    * Removes the specified subnet associations from the firewall. This removes the firewall endpoints from the subnets and removes any network filtering protections that the endpoints were providing. 
    */
  def disassociateSubnets(params: DisassociateSubnetsRequest): Request[DisassociateSubnetsResponse, AWSError] = js.native
  def disassociateSubnets(
    params: DisassociateSubnetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateSubnetsResponse, Unit]
  ): Request[DisassociateSubnetsResponse, AWSError] = js.native
  
  /**
    * Retrieves the metadata for the firewall policies that you have defined. Depending on your setting for max results and the number of firewall policies, a single call might not return the full list. 
    */
  def listFirewallPolicies(): Request[ListFirewallPoliciesResponse, AWSError] = js.native
  def listFirewallPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListFirewallPoliciesResponse, Unit]): Request[ListFirewallPoliciesResponse, AWSError] = js.native
  /**
    * Retrieves the metadata for the firewall policies that you have defined. Depending on your setting for max results and the number of firewall policies, a single call might not return the full list. 
    */
  def listFirewallPolicies(params: ListFirewallPoliciesRequest): Request[ListFirewallPoliciesResponse, AWSError] = js.native
  def listFirewallPolicies(
    params: ListFirewallPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFirewallPoliciesResponse, Unit]
  ): Request[ListFirewallPoliciesResponse, AWSError] = js.native
  
  /**
    * Retrieves the metadata for the firewalls that you have defined. If you provide VPC identifiers in your request, this returns only the firewalls for those VPCs. Depending on your setting for max results and the number of firewalls, a single call might not return the full list. 
    */
  def listFirewalls(): Request[ListFirewallsResponse, AWSError] = js.native
  def listFirewalls(callback: js.Function2[/* err */ AWSError, /* data */ ListFirewallsResponse, Unit]): Request[ListFirewallsResponse, AWSError] = js.native
  /**
    * Retrieves the metadata for the firewalls that you have defined. If you provide VPC identifiers in your request, this returns only the firewalls for those VPCs. Depending on your setting for max results and the number of firewalls, a single call might not return the full list. 
    */
  def listFirewalls(params: ListFirewallsRequest): Request[ListFirewallsResponse, AWSError] = js.native
  def listFirewalls(
    params: ListFirewallsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFirewallsResponse, Unit]
  ): Request[ListFirewallsResponse, AWSError] = js.native
  
  /**
    * Retrieves the metadata for the rule groups that you have defined. Depending on your setting for max results and the number of rule groups, a single call might not return the full list. 
    */
  def listRuleGroups(): Request[ListRuleGroupsResponse, AWSError] = js.native
  def listRuleGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListRuleGroupsResponse, Unit]): Request[ListRuleGroupsResponse, AWSError] = js.native
  /**
    * Retrieves the metadata for the rule groups that you have defined. Depending on your setting for max results and the number of rule groups, a single call might not return the full list. 
    */
  def listRuleGroups(params: ListRuleGroupsRequest): Request[ListRuleGroupsResponse, AWSError] = js.native
  def listRuleGroups(
    params: ListRuleGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRuleGroupsResponse, Unit]
  ): Request[ListRuleGroupsResponse, AWSError] = js.native
  
  /**
    * Retrieves the tags associated with the specified resource. Tags are key:value pairs that you can use to categorize and manage your resources, for purposes like billing. For example, you might set the tag key to "customer" and the value to the customer name or ID. You can specify one or more tags to add to each AWS resource, up to 50 tags for a resource. You can tag the AWS resources that you manage through AWS Network Firewall: firewalls, firewall policies, and rule groups. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Retrieves the tags associated with the specified resource. Tags are key:value pairs that you can use to categorize and manage your resources, for purposes like billing. For example, you might set the tag key to "customer" and the value to the customer name or ID. You can specify one or more tags to add to each AWS resource, up to 50 tags for a resource. You can tag the AWS resources that you manage through AWS Network Firewall: firewalls, firewall policies, and rule groups. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Creates or updates an AWS Identity and Access Management policy for your rule group or firewall policy. Use this to share rule groups and firewall policies between accounts. This operation works in conjunction with the AWS Resource Access Manager (RAM) service to manage resource sharing for Network Firewall.  Use this operation to create or update a resource policy for your rule group or firewall policy. In the policy, you specify the accounts that you want to share the resource with and the operations that you want the accounts to be able to perform.  When you add an account in the resource policy, you then run the following Resource Access Manager (RAM) operations to access and accept the shared rule group or firewall policy.     GetResourceShareInvitations - Returns the Amazon Resource Names (ARNs) of the resource share invitations.     AcceptResourceShareInvitation - Accepts the share invitation for a specified resource share.    For additional information about resource sharing using RAM, see AWS Resource Access Manager User Guide.
    */
  def putResourcePolicy(): Request[PutResourcePolicyResponse, AWSError] = js.native
  def putResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePolicyResponse, Unit]): Request[PutResourcePolicyResponse, AWSError] = js.native
  /**
    * Creates or updates an AWS Identity and Access Management policy for your rule group or firewall policy. Use this to share rule groups and firewall policies between accounts. This operation works in conjunction with the AWS Resource Access Manager (RAM) service to manage resource sharing for Network Firewall.  Use this operation to create or update a resource policy for your rule group or firewall policy. In the policy, you specify the accounts that you want to share the resource with and the operations that you want the accounts to be able to perform.  When you add an account in the resource policy, you then run the following Resource Access Manager (RAM) operations to access and accept the shared rule group or firewall policy.     GetResourceShareInvitations - Returns the Amazon Resource Names (ARNs) of the resource share invitations.     AcceptResourceShareInvitation - Accepts the share invitation for a specified resource share.    For additional information about resource sharing using RAM, see AWS Resource Access Manager User Guide.
    */
  def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse, AWSError] = js.native
  def putResourcePolicy(
    params: PutResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePolicyResponse, Unit]
  ): Request[PutResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Adds the specified tags to the specified resource. Tags are key:value pairs that you can use to categorize and manage your resources, for purposes like billing. For example, you might set the tag key to "customer" and the value to the customer name or ID. You can specify one or more tags to add to each AWS resource, up to 50 tags for a resource. You can tag the AWS resources that you manage through AWS Network Firewall: firewalls, firewall policies, and rule groups. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds the specified tags to the specified resource. Tags are key:value pairs that you can use to categorize and manage your resources, for purposes like billing. For example, you might set the tag key to "customer" and the value to the customer name or ID. You can specify one or more tags to add to each AWS resource, up to 50 tags for a resource. You can tag the AWS resources that you manage through AWS Network Firewall: firewalls, firewall policies, and rule groups. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes the tags with the specified keys from the specified resource. Tags are key:value pairs that you can use to categorize and manage your resources, for purposes like billing. For example, you might set the tag key to "customer" and the value to the customer name or ID. You can specify one or more tags to add to each AWS resource, up to 50 tags for a resource. You can manage tags for the AWS resources that you manage through AWS Network Firewall: firewalls, firewall policies, and rule groups. 
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the tags with the specified keys from the specified resource. Tags are key:value pairs that you can use to categorize and manage your resources, for purposes like billing. For example, you might set the tag key to "customer" and the value to the customer name or ID. You can specify one or more tags to add to each AWS resource, up to 50 tags for a resource. You can manage tags for the AWS resources that you manage through AWS Network Firewall: firewalls, firewall policies, and rule groups. 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Modifies the flag, DeleteProtection, which indicates whether it is possible to delete the firewall. If the flag is set to TRUE, the firewall is protected against deletion. This setting helps protect against accidentally deleting a firewall that's in use. 
    */
  def updateFirewallDeleteProtection(): Request[UpdateFirewallDeleteProtectionResponse, AWSError] = js.native
  def updateFirewallDeleteProtection(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFirewallDeleteProtectionResponse, Unit]
  ): Request[UpdateFirewallDeleteProtectionResponse, AWSError] = js.native
  /**
    * Modifies the flag, DeleteProtection, which indicates whether it is possible to delete the firewall. If the flag is set to TRUE, the firewall is protected against deletion. This setting helps protect against accidentally deleting a firewall that's in use. 
    */
  def updateFirewallDeleteProtection(params: UpdateFirewallDeleteProtectionRequest): Request[UpdateFirewallDeleteProtectionResponse, AWSError] = js.native
  def updateFirewallDeleteProtection(
    params: UpdateFirewallDeleteProtectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFirewallDeleteProtectionResponse, Unit]
  ): Request[UpdateFirewallDeleteProtectionResponse, AWSError] = js.native
  
  /**
    * Modifies the description for the specified firewall. Use the description to help you identify the firewall when you're working with it. 
    */
  def updateFirewallDescription(): Request[UpdateFirewallDescriptionResponse, AWSError] = js.native
  def updateFirewallDescription(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFirewallDescriptionResponse, Unit]): Request[UpdateFirewallDescriptionResponse, AWSError] = js.native
  /**
    * Modifies the description for the specified firewall. Use the description to help you identify the firewall when you're working with it. 
    */
  def updateFirewallDescription(params: UpdateFirewallDescriptionRequest): Request[UpdateFirewallDescriptionResponse, AWSError] = js.native
  def updateFirewallDescription(
    params: UpdateFirewallDescriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFirewallDescriptionResponse, Unit]
  ): Request[UpdateFirewallDescriptionResponse, AWSError] = js.native
  
  /**
    * Updates the properties of the specified firewall policy.
    */
  def updateFirewallPolicy(): Request[UpdateFirewallPolicyResponse, AWSError] = js.native
  def updateFirewallPolicy(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFirewallPolicyResponse, Unit]): Request[UpdateFirewallPolicyResponse, AWSError] = js.native
  /**
    * Updates the properties of the specified firewall policy.
    */
  def updateFirewallPolicy(params: UpdateFirewallPolicyRequest): Request[UpdateFirewallPolicyResponse, AWSError] = js.native
  def updateFirewallPolicy(
    params: UpdateFirewallPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFirewallPolicyResponse, Unit]
  ): Request[UpdateFirewallPolicyResponse, AWSError] = js.native
  
  /**
    * 
    */
  def updateFirewallPolicyChangeProtection(): Request[UpdateFirewallPolicyChangeProtectionResponse, AWSError] = js.native
  def updateFirewallPolicyChangeProtection(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFirewallPolicyChangeProtectionResponse, Unit]
  ): Request[UpdateFirewallPolicyChangeProtectionResponse, AWSError] = js.native
  /**
    * 
    */
  def updateFirewallPolicyChangeProtection(params: UpdateFirewallPolicyChangeProtectionRequest): Request[UpdateFirewallPolicyChangeProtectionResponse, AWSError] = js.native
  def updateFirewallPolicyChangeProtection(
    params: UpdateFirewallPolicyChangeProtectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFirewallPolicyChangeProtectionResponse, Unit]
  ): Request[UpdateFirewallPolicyChangeProtectionResponse, AWSError] = js.native
  
  /**
    * Sets the logging configuration for the specified firewall.  To change the logging configuration, retrieve the LoggingConfiguration by calling DescribeLoggingConfiguration, then change it and provide the modified object to this update call. You must change the logging configuration one LogDestinationConfig at a time inside the retrieved LoggingConfiguration object.  You can perform only one of the following actions in any call to UpdateLoggingConfiguration:    Create a new log destination object by adding a single LogDestinationConfig array element to LogDestinationConfigs.   Delete a log destination object by removing a single LogDestinationConfig array element from LogDestinationConfigs.   Change the LogDestination setting in a single LogDestinationConfig array element.   You can't change the LogDestinationType or LogType in a LogDestinationConfig. To change these settings, delete the existing LogDestinationConfig object and create a new one, using two separate calls to this update operation.
    */
  def updateLoggingConfiguration(): Request[UpdateLoggingConfigurationResponse, AWSError] = js.native
  def updateLoggingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLoggingConfigurationResponse, Unit]): Request[UpdateLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Sets the logging configuration for the specified firewall.  To change the logging configuration, retrieve the LoggingConfiguration by calling DescribeLoggingConfiguration, then change it and provide the modified object to this update call. You must change the logging configuration one LogDestinationConfig at a time inside the retrieved LoggingConfiguration object.  You can perform only one of the following actions in any call to UpdateLoggingConfiguration:    Create a new log destination object by adding a single LogDestinationConfig array element to LogDestinationConfigs.   Delete a log destination object by removing a single LogDestinationConfig array element from LogDestinationConfigs.   Change the LogDestination setting in a single LogDestinationConfig array element.   You can't change the LogDestinationType or LogType in a LogDestinationConfig. To change these settings, delete the existing LogDestinationConfig object and create a new one, using two separate calls to this update operation.
    */
  def updateLoggingConfiguration(params: UpdateLoggingConfigurationRequest): Request[UpdateLoggingConfigurationResponse, AWSError] = js.native
  def updateLoggingConfiguration(
    params: UpdateLoggingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLoggingConfigurationResponse, Unit]
  ): Request[UpdateLoggingConfigurationResponse, AWSError] = js.native
  
  /**
    * Updates the rule settings for the specified rule group. You use a rule group by reference in one or more firewall policies. When you modify a rule group, you modify all firewall policies that use the rule group.  To update a rule group, first call DescribeRuleGroup to retrieve the current RuleGroup object, update the object as needed, and then provide the updated object to this call. 
    */
  def updateRuleGroup(): Request[UpdateRuleGroupResponse, AWSError] = js.native
  def updateRuleGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRuleGroupResponse, Unit]): Request[UpdateRuleGroupResponse, AWSError] = js.native
  /**
    * Updates the rule settings for the specified rule group. You use a rule group by reference in one or more firewall policies. When you modify a rule group, you modify all firewall policies that use the rule group.  To update a rule group, first call DescribeRuleGroup to retrieve the current RuleGroup object, update the object as needed, and then provide the updated object to this call. 
    */
  def updateRuleGroup(params: UpdateRuleGroupRequest): Request[UpdateRuleGroupResponse, AWSError] = js.native
  def updateRuleGroup(
    params: UpdateRuleGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRuleGroupResponse, Unit]
  ): Request[UpdateRuleGroupResponse, AWSError] = js.native
  
  /**
    * 
    */
  def updateSubnetChangeProtection(): Request[UpdateSubnetChangeProtectionResponse, AWSError] = js.native
  def updateSubnetChangeProtection(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSubnetChangeProtectionResponse, Unit]): Request[UpdateSubnetChangeProtectionResponse, AWSError] = js.native
  /**
    * 
    */
  def updateSubnetChangeProtection(params: UpdateSubnetChangeProtectionRequest): Request[UpdateSubnetChangeProtectionResponse, AWSError] = js.native
  def updateSubnetChangeProtection(
    params: UpdateSubnetChangeProtectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSubnetChangeProtectionResponse, Unit]
  ): Request[UpdateSubnetChangeProtectionResponse, AWSError] = js.native
}
