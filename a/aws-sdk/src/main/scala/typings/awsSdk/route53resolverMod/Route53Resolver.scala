package typings.awsSdk.route53resolverMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route53Resolver extends Service {
  @JSName("config")
  var config_Route53Resolver: ConfigBase with ClientConfiguration = js.native
  /**
    * Adds IP addresses to an inbound or an outbound resolver endpoint. If you want to adding more than one IP address, submit one AssociateResolverEndpointIpAddress request for each IP address. To remove an IP address from an endpoint, see DisassociateResolverEndpointIpAddress.
    */
  def associateResolverEndpointIpAddress(): Request[AssociateResolverEndpointIpAddressResponse, AWSError] = js.native
  def associateResolverEndpointIpAddress(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateResolverEndpointIpAddressResponse, Unit]
  ): Request[AssociateResolverEndpointIpAddressResponse, AWSError] = js.native
  /**
    * Adds IP addresses to an inbound or an outbound resolver endpoint. If you want to adding more than one IP address, submit one AssociateResolverEndpointIpAddress request for each IP address. To remove an IP address from an endpoint, see DisassociateResolverEndpointIpAddress.
    */
  def associateResolverEndpointIpAddress(params: AssociateResolverEndpointIpAddressRequest): Request[AssociateResolverEndpointIpAddressResponse, AWSError] = js.native
  def associateResolverEndpointIpAddress(
    params: AssociateResolverEndpointIpAddressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateResolverEndpointIpAddressResponse, Unit]
  ): Request[AssociateResolverEndpointIpAddressResponse, AWSError] = js.native
  /**
    * Associates a resolver rule with a VPC. When you associate a rule with a VPC, Resolver forwards all DNS queries for the domain name that is specified in the rule and that originate in the VPC. The queries are forwarded to the IP addresses for the DNS resolvers that are specified in the rule. For more information about rules, see CreateResolverRule. 
    */
  def associateResolverRule(): Request[AssociateResolverRuleResponse, AWSError] = js.native
  def associateResolverRule(callback: js.Function2[/* err */ AWSError, /* data */ AssociateResolverRuleResponse, Unit]): Request[AssociateResolverRuleResponse, AWSError] = js.native
  /**
    * Associates a resolver rule with a VPC. When you associate a rule with a VPC, Resolver forwards all DNS queries for the domain name that is specified in the rule and that originate in the VPC. The queries are forwarded to the IP addresses for the DNS resolvers that are specified in the rule. For more information about rules, see CreateResolverRule. 
    */
  def associateResolverRule(params: AssociateResolverRuleRequest): Request[AssociateResolverRuleResponse, AWSError] = js.native
  def associateResolverRule(
    params: AssociateResolverRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateResolverRuleResponse, Unit]
  ): Request[AssociateResolverRuleResponse, AWSError] = js.native
  /**
    * Creates a resolver endpoint. There are two types of resolver endpoints, inbound and outbound:   An inbound resolver endpoint forwards DNS queries to the DNS service for a VPC from your network or another VPC.   An outbound resolver endpoint forwards DNS queries from the DNS service for a VPC to your network or another VPC.  
    */
  def createResolverEndpoint(): Request[CreateResolverEndpointResponse, AWSError] = js.native
  def createResolverEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateResolverEndpointResponse, Unit]): Request[CreateResolverEndpointResponse, AWSError] = js.native
  /**
    * Creates a resolver endpoint. There are two types of resolver endpoints, inbound and outbound:   An inbound resolver endpoint forwards DNS queries to the DNS service for a VPC from your network or another VPC.   An outbound resolver endpoint forwards DNS queries from the DNS service for a VPC to your network or another VPC.  
    */
  def createResolverEndpoint(params: CreateResolverEndpointRequest): Request[CreateResolverEndpointResponse, AWSError] = js.native
  def createResolverEndpoint(
    params: CreateResolverEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResolverEndpointResponse, Unit]
  ): Request[CreateResolverEndpointResponse, AWSError] = js.native
  /**
    * For DNS queries that originate in your VPCs, specifies which resolver endpoint the queries pass through, one domain name that you want to forward to your network, and the IP addresses of the DNS resolvers in your network.
    */
  def createResolverRule(): Request[CreateResolverRuleResponse, AWSError] = js.native
  def createResolverRule(callback: js.Function2[/* err */ AWSError, /* data */ CreateResolverRuleResponse, Unit]): Request[CreateResolverRuleResponse, AWSError] = js.native
  /**
    * For DNS queries that originate in your VPCs, specifies which resolver endpoint the queries pass through, one domain name that you want to forward to your network, and the IP addresses of the DNS resolvers in your network.
    */
  def createResolverRule(params: CreateResolverRuleRequest): Request[CreateResolverRuleResponse, AWSError] = js.native
  def createResolverRule(
    params: CreateResolverRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResolverRuleResponse, Unit]
  ): Request[CreateResolverRuleResponse, AWSError] = js.native
  /**
    * Deletes a resolver endpoint. The effect of deleting a resolver endpoint depends on whether it's an inbound or an outbound resolver endpoint:    Inbound: DNS queries from your network or another VPC are no longer routed to the DNS service for the specified VPC.    Outbound: DNS queries from a VPC are no longer routed to your network or to another VPC.  
    */
  def deleteResolverEndpoint(): Request[DeleteResolverEndpointResponse, AWSError] = js.native
  def deleteResolverEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResolverEndpointResponse, Unit]): Request[DeleteResolverEndpointResponse, AWSError] = js.native
  /**
    * Deletes a resolver endpoint. The effect of deleting a resolver endpoint depends on whether it's an inbound or an outbound resolver endpoint:    Inbound: DNS queries from your network or another VPC are no longer routed to the DNS service for the specified VPC.    Outbound: DNS queries from a VPC are no longer routed to your network or to another VPC.  
    */
  def deleteResolverEndpoint(params: DeleteResolverEndpointRequest): Request[DeleteResolverEndpointResponse, AWSError] = js.native
  def deleteResolverEndpoint(
    params: DeleteResolverEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResolverEndpointResponse, Unit]
  ): Request[DeleteResolverEndpointResponse, AWSError] = js.native
  /**
    * Deletes a resolver rule. Before you can delete a resolver rule, you must disassociate it from all the VPCs that you associated the resolver rule with. For more infomation, see DisassociateResolverRule.
    */
  def deleteResolverRule(): Request[DeleteResolverRuleResponse, AWSError] = js.native
  def deleteResolverRule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResolverRuleResponse, Unit]): Request[DeleteResolverRuleResponse, AWSError] = js.native
  /**
    * Deletes a resolver rule. Before you can delete a resolver rule, you must disassociate it from all the VPCs that you associated the resolver rule with. For more infomation, see DisassociateResolverRule.
    */
  def deleteResolverRule(params: DeleteResolverRuleRequest): Request[DeleteResolverRuleResponse, AWSError] = js.native
  def deleteResolverRule(
    params: DeleteResolverRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResolverRuleResponse, Unit]
  ): Request[DeleteResolverRuleResponse, AWSError] = js.native
  /**
    * Removes IP addresses from an inbound or an outbound resolver endpoint. If you want to remove more than one IP address, submit one DisassociateResolverEndpointIpAddress request for each IP address. To add an IP address to an endpoint, see AssociateResolverEndpointIpAddress.
    */
  def disassociateResolverEndpointIpAddress(): Request[DisassociateResolverEndpointIpAddressResponse, AWSError] = js.native
  def disassociateResolverEndpointIpAddress(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResolverEndpointIpAddressResponse, Unit]
  ): Request[DisassociateResolverEndpointIpAddressResponse, AWSError] = js.native
  /**
    * Removes IP addresses from an inbound or an outbound resolver endpoint. If you want to remove more than one IP address, submit one DisassociateResolverEndpointIpAddress request for each IP address. To add an IP address to an endpoint, see AssociateResolverEndpointIpAddress.
    */
  def disassociateResolverEndpointIpAddress(params: DisassociateResolverEndpointIpAddressRequest): Request[DisassociateResolverEndpointIpAddressResponse, AWSError] = js.native
  def disassociateResolverEndpointIpAddress(
    params: DisassociateResolverEndpointIpAddressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResolverEndpointIpAddressResponse, Unit]
  ): Request[DisassociateResolverEndpointIpAddressResponse, AWSError] = js.native
  /**
    * Removes the association between a specified resolver rule and a specified VPC.  If you disassociate a resolver rule from a VPC, Resolver stops forwarding DNS queries for the domain name that you specified in the resolver rule.  
    */
  def disassociateResolverRule(): Request[DisassociateResolverRuleResponse, AWSError] = js.native
  def disassociateResolverRule(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResolverRuleResponse, Unit]): Request[DisassociateResolverRuleResponse, AWSError] = js.native
  /**
    * Removes the association between a specified resolver rule and a specified VPC.  If you disassociate a resolver rule from a VPC, Resolver stops forwarding DNS queries for the domain name that you specified in the resolver rule.  
    */
  def disassociateResolverRule(params: DisassociateResolverRuleRequest): Request[DisassociateResolverRuleResponse, AWSError] = js.native
  def disassociateResolverRule(
    params: DisassociateResolverRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResolverRuleResponse, Unit]
  ): Request[DisassociateResolverRuleResponse, AWSError] = js.native
  /**
    * Gets information about a specified resolver endpoint, such as whether it's an inbound or an outbound resolver endpoint, and the current status of the endpoint.
    */
  def getResolverEndpoint(): Request[GetResolverEndpointResponse, AWSError] = js.native
  def getResolverEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ GetResolverEndpointResponse, Unit]): Request[GetResolverEndpointResponse, AWSError] = js.native
  /**
    * Gets information about a specified resolver endpoint, such as whether it's an inbound or an outbound resolver endpoint, and the current status of the endpoint.
    */
  def getResolverEndpoint(params: GetResolverEndpointRequest): Request[GetResolverEndpointResponse, AWSError] = js.native
  def getResolverEndpoint(
    params: GetResolverEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResolverEndpointResponse, Unit]
  ): Request[GetResolverEndpointResponse, AWSError] = js.native
  /**
    * Gets information about a specified resolver rule, such as the domain name that the rule forwards DNS queries for and the ID of the outbound resolver endpoint that the rule is associated with.
    */
  def getResolverRule(): Request[GetResolverRuleResponse, AWSError] = js.native
  def getResolverRule(callback: js.Function2[/* err */ AWSError, /* data */ GetResolverRuleResponse, Unit]): Request[GetResolverRuleResponse, AWSError] = js.native
  /**
    * Gets information about a specified resolver rule, such as the domain name that the rule forwards DNS queries for and the ID of the outbound resolver endpoint that the rule is associated with.
    */
  def getResolverRule(params: GetResolverRuleRequest): Request[GetResolverRuleResponse, AWSError] = js.native
  def getResolverRule(
    params: GetResolverRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResolverRuleResponse, Unit]
  ): Request[GetResolverRuleResponse, AWSError] = js.native
  /**
    * Gets information about an association between a specified resolver rule and a VPC. You associate a resolver rule and a VPC using AssociateResolverRule. 
    */
  def getResolverRuleAssociation(): Request[GetResolverRuleAssociationResponse, AWSError] = js.native
  def getResolverRuleAssociation(callback: js.Function2[/* err */ AWSError, /* data */ GetResolverRuleAssociationResponse, Unit]): Request[GetResolverRuleAssociationResponse, AWSError] = js.native
  /**
    * Gets information about an association between a specified resolver rule and a VPC. You associate a resolver rule and a VPC using AssociateResolverRule. 
    */
  def getResolverRuleAssociation(params: GetResolverRuleAssociationRequest): Request[GetResolverRuleAssociationResponse, AWSError] = js.native
  def getResolverRuleAssociation(
    params: GetResolverRuleAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResolverRuleAssociationResponse, Unit]
  ): Request[GetResolverRuleAssociationResponse, AWSError] = js.native
  /**
    * Gets information about a resolver rule policy. A resolver rule policy specifies the Resolver operations and resources that you want to allow another AWS account to be able to use. 
    */
  def getResolverRulePolicy(): Request[GetResolverRulePolicyResponse, AWSError] = js.native
  def getResolverRulePolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetResolverRulePolicyResponse, Unit]): Request[GetResolverRulePolicyResponse, AWSError] = js.native
  /**
    * Gets information about a resolver rule policy. A resolver rule policy specifies the Resolver operations and resources that you want to allow another AWS account to be able to use. 
    */
  def getResolverRulePolicy(params: GetResolverRulePolicyRequest): Request[GetResolverRulePolicyResponse, AWSError] = js.native
  def getResolverRulePolicy(
    params: GetResolverRulePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResolverRulePolicyResponse, Unit]
  ): Request[GetResolverRulePolicyResponse, AWSError] = js.native
  /**
    * Gets the IP addresses for a specified resolver endpoint.
    */
  def listResolverEndpointIpAddresses(): Request[ListResolverEndpointIpAddressesResponse, AWSError] = js.native
  def listResolverEndpointIpAddresses(
    callback: js.Function2[/* err */ AWSError, /* data */ ListResolverEndpointIpAddressesResponse, Unit]
  ): Request[ListResolverEndpointIpAddressesResponse, AWSError] = js.native
  /**
    * Gets the IP addresses for a specified resolver endpoint.
    */
  def listResolverEndpointIpAddresses(params: ListResolverEndpointIpAddressesRequest): Request[ListResolverEndpointIpAddressesResponse, AWSError] = js.native
  def listResolverEndpointIpAddresses(
    params: ListResolverEndpointIpAddressesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResolverEndpointIpAddressesResponse, Unit]
  ): Request[ListResolverEndpointIpAddressesResponse, AWSError] = js.native
  /**
    * Lists all the resolver endpoints that were created using the current AWS account.
    */
  def listResolverEndpoints(): Request[ListResolverEndpointsResponse, AWSError] = js.native
  def listResolverEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ ListResolverEndpointsResponse, Unit]): Request[ListResolverEndpointsResponse, AWSError] = js.native
  /**
    * Lists all the resolver endpoints that were created using the current AWS account.
    */
  def listResolverEndpoints(params: ListResolverEndpointsRequest): Request[ListResolverEndpointsResponse, AWSError] = js.native
  def listResolverEndpoints(
    params: ListResolverEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResolverEndpointsResponse, Unit]
  ): Request[ListResolverEndpointsResponse, AWSError] = js.native
  /**
    * Lists the associations that were created between resolver rules and VPCs using the current AWS account.
    */
  def listResolverRuleAssociations(): Request[ListResolverRuleAssociationsResponse, AWSError] = js.native
  def listResolverRuleAssociations(callback: js.Function2[/* err */ AWSError, /* data */ ListResolverRuleAssociationsResponse, Unit]): Request[ListResolverRuleAssociationsResponse, AWSError] = js.native
  /**
    * Lists the associations that were created between resolver rules and VPCs using the current AWS account.
    */
  def listResolverRuleAssociations(params: ListResolverRuleAssociationsRequest): Request[ListResolverRuleAssociationsResponse, AWSError] = js.native
  def listResolverRuleAssociations(
    params: ListResolverRuleAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResolverRuleAssociationsResponse, Unit]
  ): Request[ListResolverRuleAssociationsResponse, AWSError] = js.native
  /**
    * Lists the resolver rules that were created using the current AWS account.
    */
  def listResolverRules(): Request[ListResolverRulesResponse, AWSError] = js.native
  def listResolverRules(callback: js.Function2[/* err */ AWSError, /* data */ ListResolverRulesResponse, Unit]): Request[ListResolverRulesResponse, AWSError] = js.native
  /**
    * Lists the resolver rules that were created using the current AWS account.
    */
  def listResolverRules(params: ListResolverRulesRequest): Request[ListResolverRulesResponse, AWSError] = js.native
  def listResolverRules(
    params: ListResolverRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResolverRulesResponse, Unit]
  ): Request[ListResolverRulesResponse, AWSError] = js.native
  /**
    * Lists the tags that you associated with the specified resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags that you associated with the specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Specifies the Resolver operations and resources that you want to allow another AWS account to be able to use.
    */
  def putResolverRulePolicy(): Request[PutResolverRulePolicyResponse, AWSError] = js.native
  def putResolverRulePolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutResolverRulePolicyResponse, Unit]): Request[PutResolverRulePolicyResponse, AWSError] = js.native
  /**
    * Specifies the Resolver operations and resources that you want to allow another AWS account to be able to use.
    */
  def putResolverRulePolicy(params: PutResolverRulePolicyRequest): Request[PutResolverRulePolicyResponse, AWSError] = js.native
  def putResolverRulePolicy(
    params: PutResolverRulePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutResolverRulePolicyResponse, Unit]
  ): Request[PutResolverRulePolicyResponse, AWSError] = js.native
  /**
    * Adds one or more tags to a specified resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds one or more tags to a specified resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from a specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from a specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Updates the name of an inbound or an outbound resolver endpoint. 
    */
  def updateResolverEndpoint(): Request[UpdateResolverEndpointResponse, AWSError] = js.native
  def updateResolverEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResolverEndpointResponse, Unit]): Request[UpdateResolverEndpointResponse, AWSError] = js.native
  /**
    * Updates the name of an inbound or an outbound resolver endpoint. 
    */
  def updateResolverEndpoint(params: UpdateResolverEndpointRequest): Request[UpdateResolverEndpointResponse, AWSError] = js.native
  def updateResolverEndpoint(
    params: UpdateResolverEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResolverEndpointResponse, Unit]
  ): Request[UpdateResolverEndpointResponse, AWSError] = js.native
  /**
    * Updates settings for a specified resolver rule. ResolverRuleId is required, and all other parameters are optional. If you don't specify a parameter, it retains its current value.
    */
  def updateResolverRule(): Request[UpdateResolverRuleResponse, AWSError] = js.native
  def updateResolverRule(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResolverRuleResponse, Unit]): Request[UpdateResolverRuleResponse, AWSError] = js.native
  /**
    * Updates settings for a specified resolver rule. ResolverRuleId is required, and all other parameters are optional. If you don't specify a parameter, it retains its current value.
    */
  def updateResolverRule(params: UpdateResolverRuleRequest): Request[UpdateResolverRuleResponse, AWSError] = js.native
  def updateResolverRule(
    params: UpdateResolverRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResolverRuleResponse, Unit]
  ): Request[UpdateResolverRuleResponse, AWSError] = js.native
}

