package typings.awsSdk.route53resolverMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Route53Resolver extends Service {
  
  /**
    * Adds IP addresses to an inbound or an outbound Resolver endpoint. If you want to add more than one IP address, submit one AssociateResolverEndpointIpAddress request for each IP address. To remove an IP address from an endpoint, see DisassociateResolverEndpointIpAddress. 
    */
  def associateResolverEndpointIpAddress(): Request[AssociateResolverEndpointIpAddressResponse, AWSError] = js.native
  def associateResolverEndpointIpAddress(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateResolverEndpointIpAddressResponse, Unit]
  ): Request[AssociateResolverEndpointIpAddressResponse, AWSError] = js.native
  /**
    * Adds IP addresses to an inbound or an outbound Resolver endpoint. If you want to add more than one IP address, submit one AssociateResolverEndpointIpAddress request for each IP address. To remove an IP address from an endpoint, see DisassociateResolverEndpointIpAddress. 
    */
  def associateResolverEndpointIpAddress(params: AssociateResolverEndpointIpAddressRequest): Request[AssociateResolverEndpointIpAddressResponse, AWSError] = js.native
  def associateResolverEndpointIpAddress(
    params: AssociateResolverEndpointIpAddressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateResolverEndpointIpAddressResponse, Unit]
  ): Request[AssociateResolverEndpointIpAddressResponse, AWSError] = js.native
  
  /**
    * Associates an Amazon VPC with a specified query logging configuration. Route 53 Resolver logs DNS queries that originate in all of the Amazon VPCs that are associated with a specified query logging configuration. To associate more than one VPC with a configuration, submit one AssociateResolverQueryLogConfig request for each VPC.  The VPCs that you associate with a query logging configuration must be in the same Region as the configuration.  To remove a VPC from a query logging configuration, see DisassociateResolverQueryLogConfig. 
    */
  def associateResolverQueryLogConfig(): Request[AssociateResolverQueryLogConfigResponse, AWSError] = js.native
  def associateResolverQueryLogConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateResolverQueryLogConfigResponse, Unit]
  ): Request[AssociateResolverQueryLogConfigResponse, AWSError] = js.native
  /**
    * Associates an Amazon VPC with a specified query logging configuration. Route 53 Resolver logs DNS queries that originate in all of the Amazon VPCs that are associated with a specified query logging configuration. To associate more than one VPC with a configuration, submit one AssociateResolverQueryLogConfig request for each VPC.  The VPCs that you associate with a query logging configuration must be in the same Region as the configuration.  To remove a VPC from a query logging configuration, see DisassociateResolverQueryLogConfig. 
    */
  def associateResolverQueryLogConfig(params: AssociateResolverQueryLogConfigRequest): Request[AssociateResolverQueryLogConfigResponse, AWSError] = js.native
  def associateResolverQueryLogConfig(
    params: AssociateResolverQueryLogConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateResolverQueryLogConfigResponse, Unit]
  ): Request[AssociateResolverQueryLogConfigResponse, AWSError] = js.native
  
  /**
    * Associates a Resolver rule with a VPC. When you associate a rule with a VPC, Resolver forwards all DNS queries for the domain name that is specified in the rule and that originate in the VPC. The queries are forwarded to the IP addresses for the DNS resolvers that are specified in the rule. For more information about rules, see CreateResolverRule. 
    */
  def associateResolverRule(): Request[AssociateResolverRuleResponse, AWSError] = js.native
  def associateResolverRule(callback: js.Function2[/* err */ AWSError, /* data */ AssociateResolverRuleResponse, Unit]): Request[AssociateResolverRuleResponse, AWSError] = js.native
  /**
    * Associates a Resolver rule with a VPC. When you associate a rule with a VPC, Resolver forwards all DNS queries for the domain name that is specified in the rule and that originate in the VPC. The queries are forwarded to the IP addresses for the DNS resolvers that are specified in the rule. For more information about rules, see CreateResolverRule. 
    */
  def associateResolverRule(params: AssociateResolverRuleRequest): Request[AssociateResolverRuleResponse, AWSError] = js.native
  def associateResolverRule(
    params: AssociateResolverRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateResolverRuleResponse, Unit]
  ): Request[AssociateResolverRuleResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Route53Resolver: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates a Resolver endpoint. There are two types of Resolver endpoints, inbound and outbound:   An inbound Resolver endpoint forwards DNS queries to the DNS service for a VPC from your network.   An outbound Resolver endpoint forwards DNS queries from the DNS service for a VPC to your network.  
    */
  def createResolverEndpoint(): Request[CreateResolverEndpointResponse, AWSError] = js.native
  def createResolverEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateResolverEndpointResponse, Unit]): Request[CreateResolverEndpointResponse, AWSError] = js.native
  /**
    * Creates a Resolver endpoint. There are two types of Resolver endpoints, inbound and outbound:   An inbound Resolver endpoint forwards DNS queries to the DNS service for a VPC from your network.   An outbound Resolver endpoint forwards DNS queries from the DNS service for a VPC to your network.  
    */
  def createResolverEndpoint(params: CreateResolverEndpointRequest): Request[CreateResolverEndpointResponse, AWSError] = js.native
  def createResolverEndpoint(
    params: CreateResolverEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResolverEndpointResponse, Unit]
  ): Request[CreateResolverEndpointResponse, AWSError] = js.native
  
  /**
    * Creates a Resolver query logging configuration, which defines where you want Resolver to save DNS query logs that originate in your VPCs. Resolver can log queries only for VPCs that are in the same Region as the query logging configuration. To specify which VPCs you want to log queries for, you use AssociateResolverQueryLogConfig. For more information, see AssociateResolverQueryLogConfig.  You can optionally use AWS Resource Access Manager (AWS RAM) to share a query logging configuration with other AWS accounts. The other accounts can then associate VPCs with the configuration. The query logs that Resolver creates for a configuration include all DNS queries that originate in all VPCs that are associated with the configuration.
    */
  def createResolverQueryLogConfig(): Request[CreateResolverQueryLogConfigResponse, AWSError] = js.native
  def createResolverQueryLogConfig(callback: js.Function2[/* err */ AWSError, /* data */ CreateResolverQueryLogConfigResponse, Unit]): Request[CreateResolverQueryLogConfigResponse, AWSError] = js.native
  /**
    * Creates a Resolver query logging configuration, which defines where you want Resolver to save DNS query logs that originate in your VPCs. Resolver can log queries only for VPCs that are in the same Region as the query logging configuration. To specify which VPCs you want to log queries for, you use AssociateResolverQueryLogConfig. For more information, see AssociateResolverQueryLogConfig.  You can optionally use AWS Resource Access Manager (AWS RAM) to share a query logging configuration with other AWS accounts. The other accounts can then associate VPCs with the configuration. The query logs that Resolver creates for a configuration include all DNS queries that originate in all VPCs that are associated with the configuration.
    */
  def createResolverQueryLogConfig(params: CreateResolverQueryLogConfigRequest): Request[CreateResolverQueryLogConfigResponse, AWSError] = js.native
  def createResolverQueryLogConfig(
    params: CreateResolverQueryLogConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResolverQueryLogConfigResponse, Unit]
  ): Request[CreateResolverQueryLogConfigResponse, AWSError] = js.native
  
  /**
    * For DNS queries that originate in your VPCs, specifies which Resolver endpoint the queries pass through, one domain name that you want to forward to your network, and the IP addresses of the DNS resolvers in your network.
    */
  def createResolverRule(): Request[CreateResolverRuleResponse, AWSError] = js.native
  def createResolverRule(callback: js.Function2[/* err */ AWSError, /* data */ CreateResolverRuleResponse, Unit]): Request[CreateResolverRuleResponse, AWSError] = js.native
  /**
    * For DNS queries that originate in your VPCs, specifies which Resolver endpoint the queries pass through, one domain name that you want to forward to your network, and the IP addresses of the DNS resolvers in your network.
    */
  def createResolverRule(params: CreateResolverRuleRequest): Request[CreateResolverRuleResponse, AWSError] = js.native
  def createResolverRule(
    params: CreateResolverRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResolverRuleResponse, Unit]
  ): Request[CreateResolverRuleResponse, AWSError] = js.native
  
  /**
    * Deletes a Resolver endpoint. The effect of deleting a Resolver endpoint depends on whether it's an inbound or an outbound Resolver endpoint:    Inbound: DNS queries from your network are no longer routed to the DNS service for the specified VPC.    Outbound: DNS queries from a VPC are no longer routed to your network.  
    */
  def deleteResolverEndpoint(): Request[DeleteResolverEndpointResponse, AWSError] = js.native
  def deleteResolverEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResolverEndpointResponse, Unit]): Request[DeleteResolverEndpointResponse, AWSError] = js.native
  /**
    * Deletes a Resolver endpoint. The effect of deleting a Resolver endpoint depends on whether it's an inbound or an outbound Resolver endpoint:    Inbound: DNS queries from your network are no longer routed to the DNS service for the specified VPC.    Outbound: DNS queries from a VPC are no longer routed to your network.  
    */
  def deleteResolverEndpoint(params: DeleteResolverEndpointRequest): Request[DeleteResolverEndpointResponse, AWSError] = js.native
  def deleteResolverEndpoint(
    params: DeleteResolverEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResolverEndpointResponse, Unit]
  ): Request[DeleteResolverEndpointResponse, AWSError] = js.native
  
  /**
    * Deletes a query logging configuration. When you delete a configuration, Resolver stops logging DNS queries for all of the Amazon VPCs that are associated with the configuration. This also applies if the query logging configuration is shared with other AWS accounts, and the other accounts have associated VPCs with the shared configuration. Before you can delete a query logging configuration, you must first disassociate all VPCs from the configuration. See DisassociateResolverQueryLogConfig. If you used Resource Access Manager (RAM) to share a query logging configuration with other accounts, you must stop sharing the configuration before you can delete a configuration. The accounts that you shared the configuration with can first disassociate VPCs that they associated with the configuration, but that's not necessary. If you stop sharing the configuration, those VPCs are automatically disassociated from the configuration.
    */
  def deleteResolverQueryLogConfig(): Request[DeleteResolverQueryLogConfigResponse, AWSError] = js.native
  def deleteResolverQueryLogConfig(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResolverQueryLogConfigResponse, Unit]): Request[DeleteResolverQueryLogConfigResponse, AWSError] = js.native
  /**
    * Deletes a query logging configuration. When you delete a configuration, Resolver stops logging DNS queries for all of the Amazon VPCs that are associated with the configuration. This also applies if the query logging configuration is shared with other AWS accounts, and the other accounts have associated VPCs with the shared configuration. Before you can delete a query logging configuration, you must first disassociate all VPCs from the configuration. See DisassociateResolverQueryLogConfig. If you used Resource Access Manager (RAM) to share a query logging configuration with other accounts, you must stop sharing the configuration before you can delete a configuration. The accounts that you shared the configuration with can first disassociate VPCs that they associated with the configuration, but that's not necessary. If you stop sharing the configuration, those VPCs are automatically disassociated from the configuration.
    */
  def deleteResolverQueryLogConfig(params: DeleteResolverQueryLogConfigRequest): Request[DeleteResolverQueryLogConfigResponse, AWSError] = js.native
  def deleteResolverQueryLogConfig(
    params: DeleteResolverQueryLogConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResolverQueryLogConfigResponse, Unit]
  ): Request[DeleteResolverQueryLogConfigResponse, AWSError] = js.native
  
  /**
    * Deletes a Resolver rule. Before you can delete a Resolver rule, you must disassociate it from all the VPCs that you associated the Resolver rule with. For more information, see DisassociateResolverRule.
    */
  def deleteResolverRule(): Request[DeleteResolverRuleResponse, AWSError] = js.native
  def deleteResolverRule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResolverRuleResponse, Unit]): Request[DeleteResolverRuleResponse, AWSError] = js.native
  /**
    * Deletes a Resolver rule. Before you can delete a Resolver rule, you must disassociate it from all the VPCs that you associated the Resolver rule with. For more information, see DisassociateResolverRule.
    */
  def deleteResolverRule(params: DeleteResolverRuleRequest): Request[DeleteResolverRuleResponse, AWSError] = js.native
  def deleteResolverRule(
    params: DeleteResolverRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResolverRuleResponse, Unit]
  ): Request[DeleteResolverRuleResponse, AWSError] = js.native
  
  /**
    * Removes IP addresses from an inbound or an outbound Resolver endpoint. If you want to remove more than one IP address, submit one DisassociateResolverEndpointIpAddress request for each IP address. To add an IP address to an endpoint, see AssociateResolverEndpointIpAddress. 
    */
  def disassociateResolverEndpointIpAddress(): Request[DisassociateResolverEndpointIpAddressResponse, AWSError] = js.native
  def disassociateResolverEndpointIpAddress(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResolverEndpointIpAddressResponse, Unit]
  ): Request[DisassociateResolverEndpointIpAddressResponse, AWSError] = js.native
  /**
    * Removes IP addresses from an inbound or an outbound Resolver endpoint. If you want to remove more than one IP address, submit one DisassociateResolverEndpointIpAddress request for each IP address. To add an IP address to an endpoint, see AssociateResolverEndpointIpAddress. 
    */
  def disassociateResolverEndpointIpAddress(params: DisassociateResolverEndpointIpAddressRequest): Request[DisassociateResolverEndpointIpAddressResponse, AWSError] = js.native
  def disassociateResolverEndpointIpAddress(
    params: DisassociateResolverEndpointIpAddressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResolverEndpointIpAddressResponse, Unit]
  ): Request[DisassociateResolverEndpointIpAddressResponse, AWSError] = js.native
  
  /**
    * Disassociates a VPC from a query logging configuration.  Before you can delete a query logging configuration, you must first disassociate all VPCs from the configuration. If you used Resource Access Manager (RAM) to share a query logging configuration with other accounts, VPCs can be disassociated from the configuration in the following ways:   The accounts that you shared the configuration with can disassociate VPCs from the configuration.   You can stop sharing the configuration.   
    */
  def disassociateResolverQueryLogConfig(): Request[DisassociateResolverQueryLogConfigResponse, AWSError] = js.native
  def disassociateResolverQueryLogConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResolverQueryLogConfigResponse, Unit]
  ): Request[DisassociateResolverQueryLogConfigResponse, AWSError] = js.native
  /**
    * Disassociates a VPC from a query logging configuration.  Before you can delete a query logging configuration, you must first disassociate all VPCs from the configuration. If you used Resource Access Manager (RAM) to share a query logging configuration with other accounts, VPCs can be disassociated from the configuration in the following ways:   The accounts that you shared the configuration with can disassociate VPCs from the configuration.   You can stop sharing the configuration.   
    */
  def disassociateResolverQueryLogConfig(params: DisassociateResolverQueryLogConfigRequest): Request[DisassociateResolverQueryLogConfigResponse, AWSError] = js.native
  def disassociateResolverQueryLogConfig(
    params: DisassociateResolverQueryLogConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResolverQueryLogConfigResponse, Unit]
  ): Request[DisassociateResolverQueryLogConfigResponse, AWSError] = js.native
  
  /**
    * Removes the association between a specified Resolver rule and a specified VPC.  If you disassociate a Resolver rule from a VPC, Resolver stops forwarding DNS queries for the domain name that you specified in the Resolver rule.  
    */
  def disassociateResolverRule(): Request[DisassociateResolverRuleResponse, AWSError] = js.native
  def disassociateResolverRule(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResolverRuleResponse, Unit]): Request[DisassociateResolverRuleResponse, AWSError] = js.native
  /**
    * Removes the association between a specified Resolver rule and a specified VPC.  If you disassociate a Resolver rule from a VPC, Resolver stops forwarding DNS queries for the domain name that you specified in the Resolver rule.  
    */
  def disassociateResolverRule(params: DisassociateResolverRuleRequest): Request[DisassociateResolverRuleResponse, AWSError] = js.native
  def disassociateResolverRule(
    params: DisassociateResolverRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResolverRuleResponse, Unit]
  ): Request[DisassociateResolverRuleResponse, AWSError] = js.native
  
  /**
    * Gets information about a specified Resolver endpoint, such as whether it's an inbound or an outbound Resolver endpoint, and the current status of the endpoint.
    */
  def getResolverEndpoint(): Request[GetResolverEndpointResponse, AWSError] = js.native
  def getResolverEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ GetResolverEndpointResponse, Unit]): Request[GetResolverEndpointResponse, AWSError] = js.native
  /**
    * Gets information about a specified Resolver endpoint, such as whether it's an inbound or an outbound Resolver endpoint, and the current status of the endpoint.
    */
  def getResolverEndpoint(params: GetResolverEndpointRequest): Request[GetResolverEndpointResponse, AWSError] = js.native
  def getResolverEndpoint(
    params: GetResolverEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResolverEndpointResponse, Unit]
  ): Request[GetResolverEndpointResponse, AWSError] = js.native
  
  /**
    * Gets information about a specified Resolver query logging configuration, such as the number of VPCs that the configuration is logging queries for and the location that logs are sent to. 
    */
  def getResolverQueryLogConfig(): Request[GetResolverQueryLogConfigResponse, AWSError] = js.native
  def getResolverQueryLogConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetResolverQueryLogConfigResponse, Unit]): Request[GetResolverQueryLogConfigResponse, AWSError] = js.native
  /**
    * Gets information about a specified Resolver query logging configuration, such as the number of VPCs that the configuration is logging queries for and the location that logs are sent to. 
    */
  def getResolverQueryLogConfig(params: GetResolverQueryLogConfigRequest): Request[GetResolverQueryLogConfigResponse, AWSError] = js.native
  def getResolverQueryLogConfig(
    params: GetResolverQueryLogConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResolverQueryLogConfigResponse, Unit]
  ): Request[GetResolverQueryLogConfigResponse, AWSError] = js.native
  
  /**
    * Gets information about a specified association between a Resolver query logging configuration and an Amazon VPC. When you associate a VPC with a query logging configuration, Resolver logs DNS queries that originate in that VPC.
    */
  def getResolverQueryLogConfigAssociation(): Request[GetResolverQueryLogConfigAssociationResponse, AWSError] = js.native
  def getResolverQueryLogConfigAssociation(
    callback: js.Function2[/* err */ AWSError, /* data */ GetResolverQueryLogConfigAssociationResponse, Unit]
  ): Request[GetResolverQueryLogConfigAssociationResponse, AWSError] = js.native
  /**
    * Gets information about a specified association between a Resolver query logging configuration and an Amazon VPC. When you associate a VPC with a query logging configuration, Resolver logs DNS queries that originate in that VPC.
    */
  def getResolverQueryLogConfigAssociation(params: GetResolverQueryLogConfigAssociationRequest): Request[GetResolverQueryLogConfigAssociationResponse, AWSError] = js.native
  def getResolverQueryLogConfigAssociation(
    params: GetResolverQueryLogConfigAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResolverQueryLogConfigAssociationResponse, Unit]
  ): Request[GetResolverQueryLogConfigAssociationResponse, AWSError] = js.native
  
  /**
    * Gets information about a query logging policy. A query logging policy specifies the Resolver query logging operations and resources that you want to allow another AWS account to be able to use.
    */
  def getResolverQueryLogConfigPolicy(): Request[GetResolverQueryLogConfigPolicyResponse, AWSError] = js.native
  def getResolverQueryLogConfigPolicy(
    callback: js.Function2[/* err */ AWSError, /* data */ GetResolverQueryLogConfigPolicyResponse, Unit]
  ): Request[GetResolverQueryLogConfigPolicyResponse, AWSError] = js.native
  /**
    * Gets information about a query logging policy. A query logging policy specifies the Resolver query logging operations and resources that you want to allow another AWS account to be able to use.
    */
  def getResolverQueryLogConfigPolicy(params: GetResolverQueryLogConfigPolicyRequest): Request[GetResolverQueryLogConfigPolicyResponse, AWSError] = js.native
  def getResolverQueryLogConfigPolicy(
    params: GetResolverQueryLogConfigPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResolverQueryLogConfigPolicyResponse, Unit]
  ): Request[GetResolverQueryLogConfigPolicyResponse, AWSError] = js.native
  
  /**
    * Gets information about a specified Resolver rule, such as the domain name that the rule forwards DNS queries for and the ID of the outbound Resolver endpoint that the rule is associated with.
    */
  def getResolverRule(): Request[GetResolverRuleResponse, AWSError] = js.native
  def getResolverRule(callback: js.Function2[/* err */ AWSError, /* data */ GetResolverRuleResponse, Unit]): Request[GetResolverRuleResponse, AWSError] = js.native
  /**
    * Gets information about a specified Resolver rule, such as the domain name that the rule forwards DNS queries for and the ID of the outbound Resolver endpoint that the rule is associated with.
    */
  def getResolverRule(params: GetResolverRuleRequest): Request[GetResolverRuleResponse, AWSError] = js.native
  def getResolverRule(
    params: GetResolverRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResolverRuleResponse, Unit]
  ): Request[GetResolverRuleResponse, AWSError] = js.native
  
  /**
    * Gets information about an association between a specified Resolver rule and a VPC. You associate a Resolver rule and a VPC using AssociateResolverRule. 
    */
  def getResolverRuleAssociation(): Request[GetResolverRuleAssociationResponse, AWSError] = js.native
  def getResolverRuleAssociation(callback: js.Function2[/* err */ AWSError, /* data */ GetResolverRuleAssociationResponse, Unit]): Request[GetResolverRuleAssociationResponse, AWSError] = js.native
  /**
    * Gets information about an association between a specified Resolver rule and a VPC. You associate a Resolver rule and a VPC using AssociateResolverRule. 
    */
  def getResolverRuleAssociation(params: GetResolverRuleAssociationRequest): Request[GetResolverRuleAssociationResponse, AWSError] = js.native
  def getResolverRuleAssociation(
    params: GetResolverRuleAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResolverRuleAssociationResponse, Unit]
  ): Request[GetResolverRuleAssociationResponse, AWSError] = js.native
  
  /**
    * Gets information about a Resolver rule policy. A Resolver rule policy specifies the Resolver operations and resources that you want to allow another AWS account to be able to use. 
    */
  def getResolverRulePolicy(): Request[GetResolverRulePolicyResponse, AWSError] = js.native
  def getResolverRulePolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetResolverRulePolicyResponse, Unit]): Request[GetResolverRulePolicyResponse, AWSError] = js.native
  /**
    * Gets information about a Resolver rule policy. A Resolver rule policy specifies the Resolver operations and resources that you want to allow another AWS account to be able to use. 
    */
  def getResolverRulePolicy(params: GetResolverRulePolicyRequest): Request[GetResolverRulePolicyResponse, AWSError] = js.native
  def getResolverRulePolicy(
    params: GetResolverRulePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResolverRulePolicyResponse, Unit]
  ): Request[GetResolverRulePolicyResponse, AWSError] = js.native
  
  /**
    * Gets the IP addresses for a specified Resolver endpoint.
    */
  def listResolverEndpointIpAddresses(): Request[ListResolverEndpointIpAddressesResponse, AWSError] = js.native
  def listResolverEndpointIpAddresses(
    callback: js.Function2[/* err */ AWSError, /* data */ ListResolverEndpointIpAddressesResponse, Unit]
  ): Request[ListResolverEndpointIpAddressesResponse, AWSError] = js.native
  /**
    * Gets the IP addresses for a specified Resolver endpoint.
    */
  def listResolverEndpointIpAddresses(params: ListResolverEndpointIpAddressesRequest): Request[ListResolverEndpointIpAddressesResponse, AWSError] = js.native
  def listResolverEndpointIpAddresses(
    params: ListResolverEndpointIpAddressesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResolverEndpointIpAddressesResponse, Unit]
  ): Request[ListResolverEndpointIpAddressesResponse, AWSError] = js.native
  
  /**
    * Lists all the Resolver endpoints that were created using the current AWS account.
    */
  def listResolverEndpoints(): Request[ListResolverEndpointsResponse, AWSError] = js.native
  def listResolverEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ ListResolverEndpointsResponse, Unit]): Request[ListResolverEndpointsResponse, AWSError] = js.native
  /**
    * Lists all the Resolver endpoints that were created using the current AWS account.
    */
  def listResolverEndpoints(params: ListResolverEndpointsRequest): Request[ListResolverEndpointsResponse, AWSError] = js.native
  def listResolverEndpoints(
    params: ListResolverEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResolverEndpointsResponse, Unit]
  ): Request[ListResolverEndpointsResponse, AWSError] = js.native
  
  /**
    * Lists information about associations between Amazon VPCs and query logging configurations.
    */
  def listResolverQueryLogConfigAssociations(): Request[ListResolverQueryLogConfigAssociationsResponse, AWSError] = js.native
  def listResolverQueryLogConfigAssociations(
    callback: js.Function2[/* err */ AWSError, /* data */ ListResolverQueryLogConfigAssociationsResponse, Unit]
  ): Request[ListResolverQueryLogConfigAssociationsResponse, AWSError] = js.native
  /**
    * Lists information about associations between Amazon VPCs and query logging configurations.
    */
  def listResolverQueryLogConfigAssociations(params: ListResolverQueryLogConfigAssociationsRequest): Request[ListResolverQueryLogConfigAssociationsResponse, AWSError] = js.native
  def listResolverQueryLogConfigAssociations(
    params: ListResolverQueryLogConfigAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResolverQueryLogConfigAssociationsResponse, Unit]
  ): Request[ListResolverQueryLogConfigAssociationsResponse, AWSError] = js.native
  
  /**
    * Lists information about the specified query logging configurations. Each configuration defines where you want Resolver to save DNS query logs and specifies the VPCs that you want to log queries for.
    */
  def listResolverQueryLogConfigs(): Request[ListResolverQueryLogConfigsResponse, AWSError] = js.native
  def listResolverQueryLogConfigs(callback: js.Function2[/* err */ AWSError, /* data */ ListResolverQueryLogConfigsResponse, Unit]): Request[ListResolverQueryLogConfigsResponse, AWSError] = js.native
  /**
    * Lists information about the specified query logging configurations. Each configuration defines where you want Resolver to save DNS query logs and specifies the VPCs that you want to log queries for.
    */
  def listResolverQueryLogConfigs(params: ListResolverQueryLogConfigsRequest): Request[ListResolverQueryLogConfigsResponse, AWSError] = js.native
  def listResolverQueryLogConfigs(
    params: ListResolverQueryLogConfigsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResolverQueryLogConfigsResponse, Unit]
  ): Request[ListResolverQueryLogConfigsResponse, AWSError] = js.native
  
  /**
    * Lists the associations that were created between Resolver rules and VPCs using the current AWS account.
    */
  def listResolverRuleAssociations(): Request[ListResolverRuleAssociationsResponse, AWSError] = js.native
  def listResolverRuleAssociations(callback: js.Function2[/* err */ AWSError, /* data */ ListResolverRuleAssociationsResponse, Unit]): Request[ListResolverRuleAssociationsResponse, AWSError] = js.native
  /**
    * Lists the associations that were created between Resolver rules and VPCs using the current AWS account.
    */
  def listResolverRuleAssociations(params: ListResolverRuleAssociationsRequest): Request[ListResolverRuleAssociationsResponse, AWSError] = js.native
  def listResolverRuleAssociations(
    params: ListResolverRuleAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResolverRuleAssociationsResponse, Unit]
  ): Request[ListResolverRuleAssociationsResponse, AWSError] = js.native
  
  /**
    * Lists the Resolver rules that were created using the current AWS account.
    */
  def listResolverRules(): Request[ListResolverRulesResponse, AWSError] = js.native
  def listResolverRules(callback: js.Function2[/* err */ AWSError, /* data */ ListResolverRulesResponse, Unit]): Request[ListResolverRulesResponse, AWSError] = js.native
  /**
    * Lists the Resolver rules that were created using the current AWS account.
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
    * Specifies an AWS account that you want to share a query logging configuration with, the query logging configuration that you want to share, and the operations that you want the account to be able to perform on the configuration.
    */
  def putResolverQueryLogConfigPolicy(): Request[PutResolverQueryLogConfigPolicyResponse, AWSError] = js.native
  def putResolverQueryLogConfigPolicy(
    callback: js.Function2[/* err */ AWSError, /* data */ PutResolverQueryLogConfigPolicyResponse, Unit]
  ): Request[PutResolverQueryLogConfigPolicyResponse, AWSError] = js.native
  /**
    * Specifies an AWS account that you want to share a query logging configuration with, the query logging configuration that you want to share, and the operations that you want the account to be able to perform on the configuration.
    */
  def putResolverQueryLogConfigPolicy(params: PutResolverQueryLogConfigPolicyRequest): Request[PutResolverQueryLogConfigPolicyResponse, AWSError] = js.native
  def putResolverQueryLogConfigPolicy(
    params: PutResolverQueryLogConfigPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutResolverQueryLogConfigPolicyResponse, Unit]
  ): Request[PutResolverQueryLogConfigPolicyResponse, AWSError] = js.native
  
  /**
    * Specifies an AWS account that you want to share rules with, the Resolver rules that you want to share, and the operations that you want the account to be able to perform on those rules.
    */
  def putResolverRulePolicy(): Request[PutResolverRulePolicyResponse, AWSError] = js.native
  def putResolverRulePolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutResolverRulePolicyResponse, Unit]): Request[PutResolverRulePolicyResponse, AWSError] = js.native
  /**
    * Specifies an AWS account that you want to share rules with, the Resolver rules that you want to share, and the operations that you want the account to be able to perform on those rules.
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
    * Updates the name of an inbound or an outbound Resolver endpoint. 
    */
  def updateResolverEndpoint(): Request[UpdateResolverEndpointResponse, AWSError] = js.native
  def updateResolverEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResolverEndpointResponse, Unit]): Request[UpdateResolverEndpointResponse, AWSError] = js.native
  /**
    * Updates the name of an inbound or an outbound Resolver endpoint. 
    */
  def updateResolverEndpoint(params: UpdateResolverEndpointRequest): Request[UpdateResolverEndpointResponse, AWSError] = js.native
  def updateResolverEndpoint(
    params: UpdateResolverEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResolverEndpointResponse, Unit]
  ): Request[UpdateResolverEndpointResponse, AWSError] = js.native
  
  /**
    * Updates settings for a specified Resolver rule. ResolverRuleId is required, and all other parameters are optional. If you don't specify a parameter, it retains its current value.
    */
  def updateResolverRule(): Request[UpdateResolverRuleResponse, AWSError] = js.native
  def updateResolverRule(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResolverRuleResponse, Unit]): Request[UpdateResolverRuleResponse, AWSError] = js.native
  /**
    * Updates settings for a specified Resolver rule. ResolverRuleId is required, and all other parameters are optional. If you don't specify a parameter, it retains its current value.
    */
  def updateResolverRule(params: UpdateResolverRuleRequest): Request[UpdateResolverRuleResponse, AWSError] = js.native
  def updateResolverRule(
    params: UpdateResolverRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResolverRuleResponse, Unit]
  ): Request[UpdateResolverRuleResponse, AWSError] = js.native
}
