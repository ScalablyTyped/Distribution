package typings.awsSdk.clientsWafv2Mod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WAFV2 extends Service {
  
  /**
    * Associates a web ACL with a regional application resource, to protect the resource. A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, an Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified Access instance.  For Amazon CloudFront, don't use this call. Instead, use your CloudFront distribution configuration. To associate a web ACL, in the CloudFront call UpdateDistribution, set the web ACL ID to the Amazon Resource Name (ARN) of the web ACL. For information, see UpdateDistribution in the Amazon CloudFront Developer Guide.  When you make changes to web ACLs or web ACL components, like rules and rule groups, WAF propagates the changes everywhere that the web ACL and its components are stored and used. Your changes are applied within seconds, but there might be a brief period of inconsistency when the changes have arrived in some places and not in others. So, for example, if you change a rule action setting, the action might be the old action in one area and the new action in another area. Or if you add an IP address to an IP set used in a blocking rule, the new address might briefly be blocked in one area while still allowed in another. This temporary inconsistency can occur when you first associate a web ACL with an Amazon Web Services resource and when you change a web ACL that is already associated with a resource. Generally, any inconsistencies of this type last only a few seconds.
    */
  def associateWebACL(): Request[AssociateWebACLResponse, AWSError] = js.native
  def associateWebACL(callback: js.Function2[/* err */ AWSError, /* data */ AssociateWebACLResponse, Unit]): Request[AssociateWebACLResponse, AWSError] = js.native
  /**
    * Associates a web ACL with a regional application resource, to protect the resource. A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, an Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified Access instance.  For Amazon CloudFront, don't use this call. Instead, use your CloudFront distribution configuration. To associate a web ACL, in the CloudFront call UpdateDistribution, set the web ACL ID to the Amazon Resource Name (ARN) of the web ACL. For information, see UpdateDistribution in the Amazon CloudFront Developer Guide.  When you make changes to web ACLs or web ACL components, like rules and rule groups, WAF propagates the changes everywhere that the web ACL and its components are stored and used. Your changes are applied within seconds, but there might be a brief period of inconsistency when the changes have arrived in some places and not in others. So, for example, if you change a rule action setting, the action might be the old action in one area and the new action in another area. Or if you add an IP address to an IP set used in a blocking rule, the new address might briefly be blocked in one area while still allowed in another. This temporary inconsistency can occur when you first associate a web ACL with an Amazon Web Services resource and when you change a web ACL that is already associated with a resource. Generally, any inconsistencies of this type last only a few seconds.
    */
  def associateWebACL(params: AssociateWebACLRequest): Request[AssociateWebACLResponse, AWSError] = js.native
  def associateWebACL(
    params: AssociateWebACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateWebACLResponse, Unit]
  ): Request[AssociateWebACLResponse, AWSError] = js.native
  
  /**
    * Returns the web ACL capacity unit (WCU) requirements for a specified scope and set of rules. You can use this to check the capacity requirements for the rules you want to use in a RuleGroup or WebACL.  WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative cost of each rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power. Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule group. For more information, see WAF web ACL capacity units (WCU) in the WAF Developer Guide. 
    */
  def checkCapacity(): Request[CheckCapacityResponse, AWSError] = js.native
  def checkCapacity(callback: js.Function2[/* err */ AWSError, /* data */ CheckCapacityResponse, Unit]): Request[CheckCapacityResponse, AWSError] = js.native
  /**
    * Returns the web ACL capacity unit (WCU) requirements for a specified scope and set of rules. You can use this to check the capacity requirements for the rules you want to use in a RuleGroup or WebACL.  WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative cost of each rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power. Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule group. For more information, see WAF web ACL capacity units (WCU) in the WAF Developer Guide. 
    */
  def checkCapacity(params: CheckCapacityRequest): Request[CheckCapacityResponse, AWSError] = js.native
  def checkCapacity(
    params: CheckCapacityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CheckCapacityResponse, Unit]
  ): Request[CheckCapacityResponse, AWSError] = js.native
  
  @JSName("config")
  var config_WAFV2: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an API key that contains a set of token domains. API keys are required for the integration of the CAPTCHA API in your JavaScript client applications. The API lets you customize the placement and characteristics of the CAPTCHA puzzle for your end users. For more information about the CAPTCHA JavaScript integration, see WAF client application integration in the WAF Developer Guide. You can use a single key for up to 5 domains. After you generate a key, you can copy it for use in your JavaScript integration. 
    */
  def createAPIKey(): Request[CreateAPIKeyResponse, AWSError] = js.native
  def createAPIKey(callback: js.Function2[/* err */ AWSError, /* data */ CreateAPIKeyResponse, Unit]): Request[CreateAPIKeyResponse, AWSError] = js.native
  /**
    * Creates an API key that contains a set of token domains. API keys are required for the integration of the CAPTCHA API in your JavaScript client applications. The API lets you customize the placement and characteristics of the CAPTCHA puzzle for your end users. For more information about the CAPTCHA JavaScript integration, see WAF client application integration in the WAF Developer Guide. You can use a single key for up to 5 domains. After you generate a key, you can copy it for use in your JavaScript integration. 
    */
  def createAPIKey(params: CreateAPIKeyRequest): Request[CreateAPIKeyResponse, AWSError] = js.native
  def createAPIKey(
    params: CreateAPIKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAPIKeyResponse, Unit]
  ): Request[CreateAPIKeyResponse, AWSError] = js.native
  
  /**
    * Creates an IPSet, which you use to identify web requests that originate from specific IP addresses or ranges of IP addresses. For example, if you're receiving a lot of requests from a ranges of IP addresses, you can configure WAF to block them using an IPSet that lists those IP addresses. 
    */
  def createIPSet(): Request[CreateIPSetResponse, AWSError] = js.native
  def createIPSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateIPSetResponse, Unit]): Request[CreateIPSetResponse, AWSError] = js.native
  /**
    * Creates an IPSet, which you use to identify web requests that originate from specific IP addresses or ranges of IP addresses. For example, if you're receiving a lot of requests from a ranges of IP addresses, you can configure WAF to block them using an IPSet that lists those IP addresses. 
    */
  def createIPSet(params: CreateIPSetRequest): Request[CreateIPSetResponse, AWSError] = js.native
  def createIPSet(
    params: CreateIPSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIPSetResponse, Unit]
  ): Request[CreateIPSetResponse, AWSError] = js.native
  
  /**
    * Creates a RegexPatternSet, which you reference in a RegexPatternSetReferenceStatement, to have WAF inspect a web request component for the specified patterns.
    */
  def createRegexPatternSet(): Request[CreateRegexPatternSetResponse, AWSError] = js.native
  def createRegexPatternSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateRegexPatternSetResponse, Unit]): Request[CreateRegexPatternSetResponse, AWSError] = js.native
  /**
    * Creates a RegexPatternSet, which you reference in a RegexPatternSetReferenceStatement, to have WAF inspect a web request component for the specified patterns.
    */
  def createRegexPatternSet(params: CreateRegexPatternSetRequest): Request[CreateRegexPatternSetResponse, AWSError] = js.native
  def createRegexPatternSet(
    params: CreateRegexPatternSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRegexPatternSetResponse, Unit]
  ): Request[CreateRegexPatternSetResponse, AWSError] = js.native
  
  /**
    * Creates a RuleGroup per the specifications provided.   A rule group defines a collection of rules to inspect and control web requests that you can use in a WebACL. When you create a rule group, you define an immutable capacity limit. If you update a rule group, you must stay within the capacity. This allows others to reuse the rule group with confidence in its capacity requirements. 
    */
  def createRuleGroup(): Request[CreateRuleGroupResponse, AWSError] = js.native
  def createRuleGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleGroupResponse, Unit]): Request[CreateRuleGroupResponse, AWSError] = js.native
  /**
    * Creates a RuleGroup per the specifications provided.   A rule group defines a collection of rules to inspect and control web requests that you can use in a WebACL. When you create a rule group, you define an immutable capacity limit. If you update a rule group, you must stay within the capacity. This allows others to reuse the rule group with confidence in its capacity requirements. 
    */
  def createRuleGroup(params: CreateRuleGroupRequest): Request[CreateRuleGroupResponse, AWSError] = js.native
  def createRuleGroup(
    params: CreateRuleGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleGroupResponse, Unit]
  ): Request[CreateRuleGroupResponse, AWSError] = js.native
  
  /**
    * Creates a WebACL per the specifications provided.  A web ACL defines a collection of rules to use to inspect and control web requests. Each rule has an action defined (allow, block, or count) for requests that match the statement of the rule. In the web ACL, you assign a default action to take (allow, block) for any request that does not match any of the rules. The rules in a web ACL can be a combination of the types Rule, RuleGroup, and managed rule group. You can associate a web ACL with one or more Amazon Web Services resources to protect. The resources can be an Amazon CloudFront distribution, an Amazon API Gateway REST API, an Application Load Balancer, an AppSync GraphQL API, an Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified Access instance. 
    */
  def createWebACL(): Request[CreateWebACLResponse, AWSError] = js.native
  def createWebACL(callback: js.Function2[/* err */ AWSError, /* data */ CreateWebACLResponse, Unit]): Request[CreateWebACLResponse, AWSError] = js.native
  /**
    * Creates a WebACL per the specifications provided.  A web ACL defines a collection of rules to use to inspect and control web requests. Each rule has an action defined (allow, block, or count) for requests that match the statement of the rule. In the web ACL, you assign a default action to take (allow, block) for any request that does not match any of the rules. The rules in a web ACL can be a combination of the types Rule, RuleGroup, and managed rule group. You can associate a web ACL with one or more Amazon Web Services resources to protect. The resources can be an Amazon CloudFront distribution, an Amazon API Gateway REST API, an Application Load Balancer, an AppSync GraphQL API, an Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified Access instance. 
    */
  def createWebACL(params: CreateWebACLRequest): Request[CreateWebACLResponse, AWSError] = js.native
  def createWebACL(
    params: CreateWebACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWebACLResponse, Unit]
  ): Request[CreateWebACLResponse, AWSError] = js.native
  
  /**
    * Deletes all rule groups that are managed by Firewall Manager for the specified web ACL.  You can only use this if ManagedByFirewallManager is false in the specified WebACL. 
    */
  def deleteFirewallManagerRuleGroups(): Request[DeleteFirewallManagerRuleGroupsResponse, AWSError] = js.native
  def deleteFirewallManagerRuleGroups(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFirewallManagerRuleGroupsResponse, Unit]
  ): Request[DeleteFirewallManagerRuleGroupsResponse, AWSError] = js.native
  /**
    * Deletes all rule groups that are managed by Firewall Manager for the specified web ACL.  You can only use this if ManagedByFirewallManager is false in the specified WebACL. 
    */
  def deleteFirewallManagerRuleGroups(params: DeleteFirewallManagerRuleGroupsRequest): Request[DeleteFirewallManagerRuleGroupsResponse, AWSError] = js.native
  def deleteFirewallManagerRuleGroups(
    params: DeleteFirewallManagerRuleGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFirewallManagerRuleGroupsResponse, Unit]
  ): Request[DeleteFirewallManagerRuleGroupsResponse, AWSError] = js.native
  
  /**
    * Deletes the specified IPSet. 
    */
  def deleteIPSet(): Request[DeleteIPSetResponse, AWSError] = js.native
  def deleteIPSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteIPSetResponse, Unit]): Request[DeleteIPSetResponse, AWSError] = js.native
  /**
    * Deletes the specified IPSet. 
    */
  def deleteIPSet(params: DeleteIPSetRequest): Request[DeleteIPSetResponse, AWSError] = js.native
  def deleteIPSet(
    params: DeleteIPSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteIPSetResponse, Unit]
  ): Request[DeleteIPSetResponse, AWSError] = js.native
  
  /**
    * Deletes the LoggingConfiguration from the specified web ACL.
    */
  def deleteLoggingConfiguration(): Request[DeleteLoggingConfigurationResponse, AWSError] = js.native
  def deleteLoggingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLoggingConfigurationResponse, Unit]): Request[DeleteLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Deletes the LoggingConfiguration from the specified web ACL.
    */
  def deleteLoggingConfiguration(params: DeleteLoggingConfigurationRequest): Request[DeleteLoggingConfigurationResponse, AWSError] = js.native
  def deleteLoggingConfiguration(
    params: DeleteLoggingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLoggingConfigurationResponse, Unit]
  ): Request[DeleteLoggingConfigurationResponse, AWSError] = js.native
  
  /**
    * Permanently deletes an IAM policy from the specified rule group. You must be the owner of the rule group to perform this operation.
    */
  def deletePermissionPolicy(): Request[DeletePermissionPolicyResponse, AWSError] = js.native
  def deletePermissionPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeletePermissionPolicyResponse, Unit]): Request[DeletePermissionPolicyResponse, AWSError] = js.native
  /**
    * Permanently deletes an IAM policy from the specified rule group. You must be the owner of the rule group to perform this operation.
    */
  def deletePermissionPolicy(params: DeletePermissionPolicyRequest): Request[DeletePermissionPolicyResponse, AWSError] = js.native
  def deletePermissionPolicy(
    params: DeletePermissionPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePermissionPolicyResponse, Unit]
  ): Request[DeletePermissionPolicyResponse, AWSError] = js.native
  
  /**
    * Deletes the specified RegexPatternSet.
    */
  def deleteRegexPatternSet(): Request[DeleteRegexPatternSetResponse, AWSError] = js.native
  def deleteRegexPatternSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRegexPatternSetResponse, Unit]): Request[DeleteRegexPatternSetResponse, AWSError] = js.native
  /**
    * Deletes the specified RegexPatternSet.
    */
  def deleteRegexPatternSet(params: DeleteRegexPatternSetRequest): Request[DeleteRegexPatternSetResponse, AWSError] = js.native
  def deleteRegexPatternSet(
    params: DeleteRegexPatternSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRegexPatternSetResponse, Unit]
  ): Request[DeleteRegexPatternSetResponse, AWSError] = js.native
  
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
    * Deletes the specified WebACL.  You can only use this if ManagedByFirewallManager is false in the specified WebACL.   Before deleting any web ACL, first disassociate it from all resources.   To retrieve a list of the resources that are associated with a web ACL, use the following calls:   For regional resources, call ListResourcesForWebACL.   For Amazon CloudFront distributions, use the CloudFront call ListDistributionsByWebACLId. For information, see ListDistributionsByWebACLId in the Amazon CloudFront API Reference.      To disassociate a resource from a web ACL, use the following calls:   For regional resources, call DisassociateWebACL.   For Amazon CloudFront distributions, provide an empty web ACL ID in the CloudFront call UpdateDistribution. For information, see UpdateDistribution in the Amazon CloudFront API Reference.      
    */
  def deleteWebACL(): Request[DeleteWebACLResponse, AWSError] = js.native
  def deleteWebACL(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWebACLResponse, Unit]): Request[DeleteWebACLResponse, AWSError] = js.native
  /**
    * Deletes the specified WebACL.  You can only use this if ManagedByFirewallManager is false in the specified WebACL.   Before deleting any web ACL, first disassociate it from all resources.   To retrieve a list of the resources that are associated with a web ACL, use the following calls:   For regional resources, call ListResourcesForWebACL.   For Amazon CloudFront distributions, use the CloudFront call ListDistributionsByWebACLId. For information, see ListDistributionsByWebACLId in the Amazon CloudFront API Reference.      To disassociate a resource from a web ACL, use the following calls:   For regional resources, call DisassociateWebACL.   For Amazon CloudFront distributions, provide an empty web ACL ID in the CloudFront call UpdateDistribution. For information, see UpdateDistribution in the Amazon CloudFront API Reference.      
    */
  def deleteWebACL(params: DeleteWebACLRequest): Request[DeleteWebACLResponse, AWSError] = js.native
  def deleteWebACL(
    params: DeleteWebACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWebACLResponse, Unit]
  ): Request[DeleteWebACLResponse, AWSError] = js.native
  
  /**
    * Provides high-level information for a managed rule group, including descriptions of the rules. 
    */
  def describeManagedRuleGroup(): Request[DescribeManagedRuleGroupResponse, AWSError] = js.native
  def describeManagedRuleGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeManagedRuleGroupResponse, Unit]): Request[DescribeManagedRuleGroupResponse, AWSError] = js.native
  /**
    * Provides high-level information for a managed rule group, including descriptions of the rules. 
    */
  def describeManagedRuleGroup(params: DescribeManagedRuleGroupRequest): Request[DescribeManagedRuleGroupResponse, AWSError] = js.native
  def describeManagedRuleGroup(
    params: DescribeManagedRuleGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeManagedRuleGroupResponse, Unit]
  ): Request[DescribeManagedRuleGroupResponse, AWSError] = js.native
  
  /**
    * Disassociates the specified regional application resource from any existing web ACL association. A resource can have at most one web ACL association. A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, an Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified Access instance.  For Amazon CloudFront, don't use this call. Instead, use your CloudFront distribution configuration. To disassociate a web ACL, provide an empty web ACL ID in the CloudFront call UpdateDistribution. For information, see UpdateDistribution in the Amazon CloudFront API Reference. 
    */
  def disassociateWebACL(): Request[DisassociateWebACLResponse, AWSError] = js.native
  def disassociateWebACL(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateWebACLResponse, Unit]): Request[DisassociateWebACLResponse, AWSError] = js.native
  /**
    * Disassociates the specified regional application resource from any existing web ACL association. A resource can have at most one web ACL association. A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, an Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified Access instance.  For Amazon CloudFront, don't use this call. Instead, use your CloudFront distribution configuration. To disassociate a web ACL, provide an empty web ACL ID in the CloudFront call UpdateDistribution. For information, see UpdateDistribution in the Amazon CloudFront API Reference. 
    */
  def disassociateWebACL(params: DisassociateWebACLRequest): Request[DisassociateWebACLResponse, AWSError] = js.native
  def disassociateWebACL(
    params: DisassociateWebACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateWebACLResponse, Unit]
  ): Request[DisassociateWebACLResponse, AWSError] = js.native
  
  /**
    * Generates a presigned download URL for the specified release of the mobile SDK. The mobile SDK is not generally available. Customers who have access to the mobile SDK can use it to establish and manage WAF tokens for use in HTTP(S) requests from a mobile device to WAF. For more information, see WAF client application integration in the WAF Developer Guide.
    */
  def generateMobileSdkReleaseUrl(): Request[GenerateMobileSdkReleaseUrlResponse, AWSError] = js.native
  def generateMobileSdkReleaseUrl(callback: js.Function2[/* err */ AWSError, /* data */ GenerateMobileSdkReleaseUrlResponse, Unit]): Request[GenerateMobileSdkReleaseUrlResponse, AWSError] = js.native
  /**
    * Generates a presigned download URL for the specified release of the mobile SDK. The mobile SDK is not generally available. Customers who have access to the mobile SDK can use it to establish and manage WAF tokens for use in HTTP(S) requests from a mobile device to WAF. For more information, see WAF client application integration in the WAF Developer Guide.
    */
  def generateMobileSdkReleaseUrl(params: GenerateMobileSdkReleaseUrlRequest): Request[GenerateMobileSdkReleaseUrlResponse, AWSError] = js.native
  def generateMobileSdkReleaseUrl(
    params: GenerateMobileSdkReleaseUrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GenerateMobileSdkReleaseUrlResponse, Unit]
  ): Request[GenerateMobileSdkReleaseUrlResponse, AWSError] = js.native
  
  /**
    * Returns your API key in decrypted form. Use this to check the token domains that you have defined for the key.  API keys are required for the integration of the CAPTCHA API in your JavaScript client applications. The API lets you customize the placement and characteristics of the CAPTCHA puzzle for your end users. For more information about the CAPTCHA JavaScript integration, see WAF client application integration in the WAF Developer Guide.
    */
  def getDecryptedAPIKey(): Request[GetDecryptedAPIKeyResponse, AWSError] = js.native
  def getDecryptedAPIKey(callback: js.Function2[/* err */ AWSError, /* data */ GetDecryptedAPIKeyResponse, Unit]): Request[GetDecryptedAPIKeyResponse, AWSError] = js.native
  /**
    * Returns your API key in decrypted form. Use this to check the token domains that you have defined for the key.  API keys are required for the integration of the CAPTCHA API in your JavaScript client applications. The API lets you customize the placement and characteristics of the CAPTCHA puzzle for your end users. For more information about the CAPTCHA JavaScript integration, see WAF client application integration in the WAF Developer Guide.
    */
  def getDecryptedAPIKey(params: GetDecryptedAPIKeyRequest): Request[GetDecryptedAPIKeyResponse, AWSError] = js.native
  def getDecryptedAPIKey(
    params: GetDecryptedAPIKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDecryptedAPIKeyResponse, Unit]
  ): Request[GetDecryptedAPIKeyResponse, AWSError] = js.native
  
  /**
    * Retrieves the specified IPSet.
    */
  def getIPSet(): Request[GetIPSetResponse, AWSError] = js.native
  def getIPSet(callback: js.Function2[/* err */ AWSError, /* data */ GetIPSetResponse, Unit]): Request[GetIPSetResponse, AWSError] = js.native
  /**
    * Retrieves the specified IPSet.
    */
  def getIPSet(params: GetIPSetRequest): Request[GetIPSetResponse, AWSError] = js.native
  def getIPSet(
    params: GetIPSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIPSetResponse, Unit]
  ): Request[GetIPSetResponse, AWSError] = js.native
  
  /**
    * Returns the LoggingConfiguration for the specified web ACL.
    */
  def getLoggingConfiguration(): Request[GetLoggingConfigurationResponse, AWSError] = js.native
  def getLoggingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetLoggingConfigurationResponse, Unit]): Request[GetLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Returns the LoggingConfiguration for the specified web ACL.
    */
  def getLoggingConfiguration(params: GetLoggingConfigurationRequest): Request[GetLoggingConfigurationResponse, AWSError] = js.native
  def getLoggingConfiguration(
    params: GetLoggingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLoggingConfigurationResponse, Unit]
  ): Request[GetLoggingConfigurationResponse, AWSError] = js.native
  
  /**
    * Retrieves the specified managed rule set.   This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web Services Marketplace sellers.  Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group offerings for your customers. The APIs are ListManagedRuleSets, GetManagedRuleSet, PutManagedRuleSetVersions, and UpdateManagedRuleSetVersionExpiryDate. 
    */
  def getManagedRuleSet(): Request[GetManagedRuleSetResponse, AWSError] = js.native
  def getManagedRuleSet(callback: js.Function2[/* err */ AWSError, /* data */ GetManagedRuleSetResponse, Unit]): Request[GetManagedRuleSetResponse, AWSError] = js.native
  /**
    * Retrieves the specified managed rule set.   This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web Services Marketplace sellers.  Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group offerings for your customers. The APIs are ListManagedRuleSets, GetManagedRuleSet, PutManagedRuleSetVersions, and UpdateManagedRuleSetVersionExpiryDate. 
    */
  def getManagedRuleSet(params: GetManagedRuleSetRequest): Request[GetManagedRuleSetResponse, AWSError] = js.native
  def getManagedRuleSet(
    params: GetManagedRuleSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetManagedRuleSetResponse, Unit]
  ): Request[GetManagedRuleSetResponse, AWSError] = js.native
  
  /**
    * Retrieves information for the specified mobile SDK release, including release notes and tags. The mobile SDK is not generally available. Customers who have access to the mobile SDK can use it to establish and manage WAF tokens for use in HTTP(S) requests from a mobile device to WAF. For more information, see WAF client application integration in the WAF Developer Guide.
    */
  def getMobileSdkRelease(): Request[GetMobileSdkReleaseResponse, AWSError] = js.native
  def getMobileSdkRelease(callback: js.Function2[/* err */ AWSError, /* data */ GetMobileSdkReleaseResponse, Unit]): Request[GetMobileSdkReleaseResponse, AWSError] = js.native
  /**
    * Retrieves information for the specified mobile SDK release, including release notes and tags. The mobile SDK is not generally available. Customers who have access to the mobile SDK can use it to establish and manage WAF tokens for use in HTTP(S) requests from a mobile device to WAF. For more information, see WAF client application integration in the WAF Developer Guide.
    */
  def getMobileSdkRelease(params: GetMobileSdkReleaseRequest): Request[GetMobileSdkReleaseResponse, AWSError] = js.native
  def getMobileSdkRelease(
    params: GetMobileSdkReleaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMobileSdkReleaseResponse, Unit]
  ): Request[GetMobileSdkReleaseResponse, AWSError] = js.native
  
  /**
    * Returns the IAM policy that is attached to the specified rule group. You must be the owner of the rule group to perform this operation.
    */
  def getPermissionPolicy(): Request[GetPermissionPolicyResponse, AWSError] = js.native
  def getPermissionPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetPermissionPolicyResponse, Unit]): Request[GetPermissionPolicyResponse, AWSError] = js.native
  /**
    * Returns the IAM policy that is attached to the specified rule group. You must be the owner of the rule group to perform this operation.
    */
  def getPermissionPolicy(params: GetPermissionPolicyRequest): Request[GetPermissionPolicyResponse, AWSError] = js.native
  def getPermissionPolicy(
    params: GetPermissionPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPermissionPolicyResponse, Unit]
  ): Request[GetPermissionPolicyResponse, AWSError] = js.native
  
  /**
    * Retrieves the keys that are currently blocked by a rate-based rule instance. The maximum number of managed keys that can be blocked for a single rate-based rule instance is 10,000. If more than 10,000 addresses exceed the rate limit, those with the highest rates are blocked. For a rate-based rule that you've defined inside a rule group, provide the name of the rule group reference statement in your request, in addition to the rate-based rule name and the web ACL name.  WAF monitors web requests and manages keys independently for each unique combination of web ACL, optional rule group, and rate-based rule. For example, if you define a rate-based rule inside a rule group, and then use the rule group in a web ACL, WAF monitors web requests and manages keys for that web ACL, rule group reference statement, and rate-based rule instance. If you use the same rule group in a second web ACL, WAF monitors web requests and manages keys for this second usage completely independent of your first. 
    */
  def getRateBasedStatementManagedKeys(): Request[GetRateBasedStatementManagedKeysResponse, AWSError] = js.native
  def getRateBasedStatementManagedKeys(
    callback: js.Function2[/* err */ AWSError, /* data */ GetRateBasedStatementManagedKeysResponse, Unit]
  ): Request[GetRateBasedStatementManagedKeysResponse, AWSError] = js.native
  /**
    * Retrieves the keys that are currently blocked by a rate-based rule instance. The maximum number of managed keys that can be blocked for a single rate-based rule instance is 10,000. If more than 10,000 addresses exceed the rate limit, those with the highest rates are blocked. For a rate-based rule that you've defined inside a rule group, provide the name of the rule group reference statement in your request, in addition to the rate-based rule name and the web ACL name.  WAF monitors web requests and manages keys independently for each unique combination of web ACL, optional rule group, and rate-based rule. For example, if you define a rate-based rule inside a rule group, and then use the rule group in a web ACL, WAF monitors web requests and manages keys for that web ACL, rule group reference statement, and rate-based rule instance. If you use the same rule group in a second web ACL, WAF monitors web requests and manages keys for this second usage completely independent of your first. 
    */
  def getRateBasedStatementManagedKeys(params: GetRateBasedStatementManagedKeysRequest): Request[GetRateBasedStatementManagedKeysResponse, AWSError] = js.native
  def getRateBasedStatementManagedKeys(
    params: GetRateBasedStatementManagedKeysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRateBasedStatementManagedKeysResponse, Unit]
  ): Request[GetRateBasedStatementManagedKeysResponse, AWSError] = js.native
  
  /**
    * Retrieves the specified RegexPatternSet.
    */
  def getRegexPatternSet(): Request[GetRegexPatternSetResponse, AWSError] = js.native
  def getRegexPatternSet(callback: js.Function2[/* err */ AWSError, /* data */ GetRegexPatternSetResponse, Unit]): Request[GetRegexPatternSetResponse, AWSError] = js.native
  /**
    * Retrieves the specified RegexPatternSet.
    */
  def getRegexPatternSet(params: GetRegexPatternSetRequest): Request[GetRegexPatternSetResponse, AWSError] = js.native
  def getRegexPatternSet(
    params: GetRegexPatternSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRegexPatternSetResponse, Unit]
  ): Request[GetRegexPatternSetResponse, AWSError] = js.native
  
  /**
    * Retrieves the specified RuleGroup.
    */
  def getRuleGroup(): Request[GetRuleGroupResponse, AWSError] = js.native
  def getRuleGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetRuleGroupResponse, Unit]): Request[GetRuleGroupResponse, AWSError] = js.native
  /**
    * Retrieves the specified RuleGroup.
    */
  def getRuleGroup(params: GetRuleGroupRequest): Request[GetRuleGroupResponse, AWSError] = js.native
  def getRuleGroup(
    params: GetRuleGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRuleGroupResponse, Unit]
  ): Request[GetRuleGroupResponse, AWSError] = js.native
  
  /**
    * Gets detailed information about a specified number of requests--a sample--that WAF randomly selects from among the first 5,000 requests that your Amazon Web Services resource received during a time range that you choose. You can specify a sample size of up to 500 requests, and you can specify any time range in the previous three hours.  GetSampledRequests returns a time range, which is usually the time range that you specified. However, if your resource (such as a CloudFront distribution) received 5,000 requests before the specified time range elapsed, GetSampledRequests returns an updated time range. This new time range indicates the actual period during which WAF selected the requests in the sample.
    */
  def getSampledRequests(): Request[GetSampledRequestsResponse, AWSError] = js.native
  def getSampledRequests(callback: js.Function2[/* err */ AWSError, /* data */ GetSampledRequestsResponse, Unit]): Request[GetSampledRequestsResponse, AWSError] = js.native
  /**
    * Gets detailed information about a specified number of requests--a sample--that WAF randomly selects from among the first 5,000 requests that your Amazon Web Services resource received during a time range that you choose. You can specify a sample size of up to 500 requests, and you can specify any time range in the previous three hours.  GetSampledRequests returns a time range, which is usually the time range that you specified. However, if your resource (such as a CloudFront distribution) received 5,000 requests before the specified time range elapsed, GetSampledRequests returns an updated time range. This new time range indicates the actual period during which WAF selected the requests in the sample.
    */
  def getSampledRequests(params: GetSampledRequestsRequest): Request[GetSampledRequestsResponse, AWSError] = js.native
  def getSampledRequests(
    params: GetSampledRequestsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSampledRequestsResponse, Unit]
  ): Request[GetSampledRequestsResponse, AWSError] = js.native
  
  /**
    * Retrieves the specified WebACL.
    */
  def getWebACL(): Request[GetWebACLResponse, AWSError] = js.native
  def getWebACL(callback: js.Function2[/* err */ AWSError, /* data */ GetWebACLResponse, Unit]): Request[GetWebACLResponse, AWSError] = js.native
  /**
    * Retrieves the specified WebACL.
    */
  def getWebACL(params: GetWebACLRequest): Request[GetWebACLResponse, AWSError] = js.native
  def getWebACL(
    params: GetWebACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWebACLResponse, Unit]
  ): Request[GetWebACLResponse, AWSError] = js.native
  
  /**
    * Retrieves the WebACL for the specified resource. 
    */
  def getWebACLForResource(): Request[GetWebACLForResourceResponse, AWSError] = js.native
  def getWebACLForResource(callback: js.Function2[/* err */ AWSError, /* data */ GetWebACLForResourceResponse, Unit]): Request[GetWebACLForResourceResponse, AWSError] = js.native
  /**
    * Retrieves the WebACL for the specified resource. 
    */
  def getWebACLForResource(params: GetWebACLForResourceRequest): Request[GetWebACLForResourceResponse, AWSError] = js.native
  def getWebACLForResource(
    params: GetWebACLForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWebACLForResourceResponse, Unit]
  ): Request[GetWebACLForResourceResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of the API keys that you've defined for the specified scope.  API keys are required for the integration of the CAPTCHA API in your JavaScript client applications. The API lets you customize the placement and characteristics of the CAPTCHA puzzle for your end users. For more information about the CAPTCHA JavaScript integration, see WAF client application integration in the WAF Developer Guide.
    */
  def listAPIKeys(): Request[ListAPIKeysResponse, AWSError] = js.native
  def listAPIKeys(callback: js.Function2[/* err */ AWSError, /* data */ ListAPIKeysResponse, Unit]): Request[ListAPIKeysResponse, AWSError] = js.native
  /**
    * Retrieves a list of the API keys that you've defined for the specified scope.  API keys are required for the integration of the CAPTCHA API in your JavaScript client applications. The API lets you customize the placement and characteristics of the CAPTCHA puzzle for your end users. For more information about the CAPTCHA JavaScript integration, see WAF client application integration in the WAF Developer Guide.
    */
  def listAPIKeys(params: ListAPIKeysRequest): Request[ListAPIKeysResponse, AWSError] = js.native
  def listAPIKeys(
    params: ListAPIKeysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAPIKeysResponse, Unit]
  ): Request[ListAPIKeysResponse, AWSError] = js.native
  
  /**
    * Returns a list of the available versions for the specified managed rule group. 
    */
  def listAvailableManagedRuleGroupVersions(): Request[ListAvailableManagedRuleGroupVersionsResponse, AWSError] = js.native
  def listAvailableManagedRuleGroupVersions(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAvailableManagedRuleGroupVersionsResponse, Unit]
  ): Request[ListAvailableManagedRuleGroupVersionsResponse, AWSError] = js.native
  /**
    * Returns a list of the available versions for the specified managed rule group. 
    */
  def listAvailableManagedRuleGroupVersions(params: ListAvailableManagedRuleGroupVersionsRequest): Request[ListAvailableManagedRuleGroupVersionsResponse, AWSError] = js.native
  def listAvailableManagedRuleGroupVersions(
    params: ListAvailableManagedRuleGroupVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAvailableManagedRuleGroupVersionsResponse, Unit]
  ): Request[ListAvailableManagedRuleGroupVersionsResponse, AWSError] = js.native
  
  /**
    * Retrieves an array of managed rule groups that are available for you to use. This list includes all Amazon Web Services Managed Rules rule groups and all of the Amazon Web Services Marketplace managed rule groups that you're subscribed to.
    */
  def listAvailableManagedRuleGroups(): Request[ListAvailableManagedRuleGroupsResponse, AWSError] = js.native
  def listAvailableManagedRuleGroups(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAvailableManagedRuleGroupsResponse, Unit]
  ): Request[ListAvailableManagedRuleGroupsResponse, AWSError] = js.native
  /**
    * Retrieves an array of managed rule groups that are available for you to use. This list includes all Amazon Web Services Managed Rules rule groups and all of the Amazon Web Services Marketplace managed rule groups that you're subscribed to.
    */
  def listAvailableManagedRuleGroups(params: ListAvailableManagedRuleGroupsRequest): Request[ListAvailableManagedRuleGroupsResponse, AWSError] = js.native
  def listAvailableManagedRuleGroups(
    params: ListAvailableManagedRuleGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAvailableManagedRuleGroupsResponse, Unit]
  ): Request[ListAvailableManagedRuleGroupsResponse, AWSError] = js.native
  
  /**
    * Retrieves an array of IPSetSummary objects for the IP sets that you manage.
    */
  def listIPSets(): Request[ListIPSetsResponse, AWSError] = js.native
  def listIPSets(callback: js.Function2[/* err */ AWSError, /* data */ ListIPSetsResponse, Unit]): Request[ListIPSetsResponse, AWSError] = js.native
  /**
    * Retrieves an array of IPSetSummary objects for the IP sets that you manage.
    */
  def listIPSets(params: ListIPSetsRequest): Request[ListIPSetsResponse, AWSError] = js.native
  def listIPSets(
    params: ListIPSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIPSetsResponse, Unit]
  ): Request[ListIPSetsResponse, AWSError] = js.native
  
  /**
    * Retrieves an array of your LoggingConfiguration objects.
    */
  def listLoggingConfigurations(): Request[ListLoggingConfigurationsResponse, AWSError] = js.native
  def listLoggingConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ListLoggingConfigurationsResponse, Unit]): Request[ListLoggingConfigurationsResponse, AWSError] = js.native
  /**
    * Retrieves an array of your LoggingConfiguration objects.
    */
  def listLoggingConfigurations(params: ListLoggingConfigurationsRequest): Request[ListLoggingConfigurationsResponse, AWSError] = js.native
  def listLoggingConfigurations(
    params: ListLoggingConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLoggingConfigurationsResponse, Unit]
  ): Request[ListLoggingConfigurationsResponse, AWSError] = js.native
  
  /**
    * Retrieves the managed rule sets that you own.   This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web Services Marketplace sellers.  Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group offerings for your customers. The APIs are ListManagedRuleSets, GetManagedRuleSet, PutManagedRuleSetVersions, and UpdateManagedRuleSetVersionExpiryDate. 
    */
  def listManagedRuleSets(): Request[ListManagedRuleSetsResponse, AWSError] = js.native
  def listManagedRuleSets(callback: js.Function2[/* err */ AWSError, /* data */ ListManagedRuleSetsResponse, Unit]): Request[ListManagedRuleSetsResponse, AWSError] = js.native
  /**
    * Retrieves the managed rule sets that you own.   This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web Services Marketplace sellers.  Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group offerings for your customers. The APIs are ListManagedRuleSets, GetManagedRuleSet, PutManagedRuleSetVersions, and UpdateManagedRuleSetVersionExpiryDate. 
    */
  def listManagedRuleSets(params: ListManagedRuleSetsRequest): Request[ListManagedRuleSetsResponse, AWSError] = js.native
  def listManagedRuleSets(
    params: ListManagedRuleSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListManagedRuleSetsResponse, Unit]
  ): Request[ListManagedRuleSetsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of the available releases for the mobile SDK and the specified device platform.  The mobile SDK is not generally available. Customers who have access to the mobile SDK can use it to establish and manage WAF tokens for use in HTTP(S) requests from a mobile device to WAF. For more information, see WAF client application integration in the WAF Developer Guide.
    */
  def listMobileSdkReleases(): Request[ListMobileSdkReleasesResponse, AWSError] = js.native
  def listMobileSdkReleases(callback: js.Function2[/* err */ AWSError, /* data */ ListMobileSdkReleasesResponse, Unit]): Request[ListMobileSdkReleasesResponse, AWSError] = js.native
  /**
    * Retrieves a list of the available releases for the mobile SDK and the specified device platform.  The mobile SDK is not generally available. Customers who have access to the mobile SDK can use it to establish and manage WAF tokens for use in HTTP(S) requests from a mobile device to WAF. For more information, see WAF client application integration in the WAF Developer Guide.
    */
  def listMobileSdkReleases(params: ListMobileSdkReleasesRequest): Request[ListMobileSdkReleasesResponse, AWSError] = js.native
  def listMobileSdkReleases(
    params: ListMobileSdkReleasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMobileSdkReleasesResponse, Unit]
  ): Request[ListMobileSdkReleasesResponse, AWSError] = js.native
  
  /**
    * Retrieves an array of RegexPatternSetSummary objects for the regex pattern sets that you manage.
    */
  def listRegexPatternSets(): Request[ListRegexPatternSetsResponse, AWSError] = js.native
  def listRegexPatternSets(callback: js.Function2[/* err */ AWSError, /* data */ ListRegexPatternSetsResponse, Unit]): Request[ListRegexPatternSetsResponse, AWSError] = js.native
  /**
    * Retrieves an array of RegexPatternSetSummary objects for the regex pattern sets that you manage.
    */
  def listRegexPatternSets(params: ListRegexPatternSetsRequest): Request[ListRegexPatternSetsResponse, AWSError] = js.native
  def listRegexPatternSets(
    params: ListRegexPatternSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRegexPatternSetsResponse, Unit]
  ): Request[ListRegexPatternSetsResponse, AWSError] = js.native
  
  /**
    * Retrieves an array of the Amazon Resource Names (ARNs) for the regional resources that are associated with the specified web ACL. If you want the list of Amazon CloudFront resources, use the CloudFront call ListDistributionsByWebACLId. 
    */
  def listResourcesForWebACL(): Request[ListResourcesForWebACLResponse, AWSError] = js.native
  def listResourcesForWebACL(callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesForWebACLResponse, Unit]): Request[ListResourcesForWebACLResponse, AWSError] = js.native
  /**
    * Retrieves an array of the Amazon Resource Names (ARNs) for the regional resources that are associated with the specified web ACL. If you want the list of Amazon CloudFront resources, use the CloudFront call ListDistributionsByWebACLId. 
    */
  def listResourcesForWebACL(params: ListResourcesForWebACLRequest): Request[ListResourcesForWebACLResponse, AWSError] = js.native
  def listResourcesForWebACL(
    params: ListResourcesForWebACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesForWebACLResponse, Unit]
  ): Request[ListResourcesForWebACLResponse, AWSError] = js.native
  
  /**
    * Retrieves an array of RuleGroupSummary objects for the rule groups that you manage. 
    */
  def listRuleGroups(): Request[ListRuleGroupsResponse, AWSError] = js.native
  def listRuleGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListRuleGroupsResponse, Unit]): Request[ListRuleGroupsResponse, AWSError] = js.native
  /**
    * Retrieves an array of RuleGroupSummary objects for the rule groups that you manage. 
    */
  def listRuleGroups(params: ListRuleGroupsRequest): Request[ListRuleGroupsResponse, AWSError] = js.native
  def listRuleGroups(
    params: ListRuleGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRuleGroupsResponse, Unit]
  ): Request[ListRuleGroupsResponse, AWSError] = js.native
  
  /**
    * Retrieves the TagInfoForResource for the specified resource. Tags are key:value pairs that you can use to categorize and manage your resources, for purposes like billing. For example, you might set the tag key to "customer" and the value to the customer name or ID. You can specify one or more tags to add to each Amazon Web Services resource, up to 50 tags for a resource. You can tag the Amazon Web Services resources that you manage through WAF: web ACLs, rule groups, IP sets, and regex pattern sets. You can't manage or view tags through the WAF console. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Retrieves the TagInfoForResource for the specified resource. Tags are key:value pairs that you can use to categorize and manage your resources, for purposes like billing. For example, you might set the tag key to "customer" and the value to the customer name or ID. You can specify one or more tags to add to each Amazon Web Services resource, up to 50 tags for a resource. You can tag the Amazon Web Services resources that you manage through WAF: web ACLs, rule groups, IP sets, and regex pattern sets. You can't manage or view tags through the WAF console. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Retrieves an array of WebACLSummary objects for the web ACLs that you manage.
    */
  def listWebACLs(): Request[ListWebACLsResponse, AWSError] = js.native
  def listWebACLs(callback: js.Function2[/* err */ AWSError, /* data */ ListWebACLsResponse, Unit]): Request[ListWebACLsResponse, AWSError] = js.native
  /**
    * Retrieves an array of WebACLSummary objects for the web ACLs that you manage.
    */
  def listWebACLs(params: ListWebACLsRequest): Request[ListWebACLsResponse, AWSError] = js.native
  def listWebACLs(
    params: ListWebACLsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWebACLsResponse, Unit]
  ): Request[ListWebACLsResponse, AWSError] = js.native
  
  /**
    * Enables the specified LoggingConfiguration, to start logging from a web ACL, according to the configuration provided.   This operation completely replaces any mutable specifications that you already have for a logging configuration with the ones that you provide to this call.  To modify an existing logging configuration, do the following:    Retrieve it by calling GetLoggingConfiguration    Update its settings as needed   Provide the complete logging configuration specification to this call     You can define one logging destination per web ACL.  You can access information about the traffic that WAF inspects using the following steps:   Create your logging destination. You can use an Amazon CloudWatch Logs log group, an Amazon Simple Storage Service (Amazon S3) bucket, or an Amazon Kinesis Data Firehose.  The name that you give the destination must start with aws-waf-logs-. Depending on the type of destination, you might need to configure additional settings or permissions.  For configuration requirements and pricing information for each destination type, see Logging web ACL traffic in the WAF Developer Guide.   Associate your logging destination to your web ACL using a PutLoggingConfiguration request.   When you successfully enable logging using a PutLoggingConfiguration request, WAF creates an additional role or policy that is required to write logs to the logging destination. For an Amazon CloudWatch Logs log group, WAF creates a resource policy on the log group. For an Amazon S3 bucket, WAF creates a bucket policy. For an Amazon Kinesis Data Firehose, WAF creates a service-linked role. For additional information about web ACL logging, see Logging web ACL traffic information in the WAF Developer Guide.
    */
  def putLoggingConfiguration(): Request[PutLoggingConfigurationResponse, AWSError] = js.native
  def putLoggingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ PutLoggingConfigurationResponse, Unit]): Request[PutLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Enables the specified LoggingConfiguration, to start logging from a web ACL, according to the configuration provided.   This operation completely replaces any mutable specifications that you already have for a logging configuration with the ones that you provide to this call.  To modify an existing logging configuration, do the following:    Retrieve it by calling GetLoggingConfiguration    Update its settings as needed   Provide the complete logging configuration specification to this call     You can define one logging destination per web ACL.  You can access information about the traffic that WAF inspects using the following steps:   Create your logging destination. You can use an Amazon CloudWatch Logs log group, an Amazon Simple Storage Service (Amazon S3) bucket, or an Amazon Kinesis Data Firehose.  The name that you give the destination must start with aws-waf-logs-. Depending on the type of destination, you might need to configure additional settings or permissions.  For configuration requirements and pricing information for each destination type, see Logging web ACL traffic in the WAF Developer Guide.   Associate your logging destination to your web ACL using a PutLoggingConfiguration request.   When you successfully enable logging using a PutLoggingConfiguration request, WAF creates an additional role or policy that is required to write logs to the logging destination. For an Amazon CloudWatch Logs log group, WAF creates a resource policy on the log group. For an Amazon S3 bucket, WAF creates a bucket policy. For an Amazon Kinesis Data Firehose, WAF creates a service-linked role. For additional information about web ACL logging, see Logging web ACL traffic information in the WAF Developer Guide.
    */
  def putLoggingConfiguration(params: PutLoggingConfigurationRequest): Request[PutLoggingConfigurationResponse, AWSError] = js.native
  def putLoggingConfiguration(
    params: PutLoggingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutLoggingConfigurationResponse, Unit]
  ): Request[PutLoggingConfigurationResponse, AWSError] = js.native
  
  /**
    * Defines the versions of your managed rule set that you are offering to the customers. Customers see your offerings as managed rule groups with versioning.  This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web Services Marketplace sellers.  Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group offerings for your customers. The APIs are ListManagedRuleSets, GetManagedRuleSet, PutManagedRuleSetVersions, and UpdateManagedRuleSetVersionExpiryDate.  Customers retrieve their managed rule group list by calling ListAvailableManagedRuleGroups. The name that you provide here for your managed rule set is the name the customer sees for the corresponding managed rule group. Customers can retrieve the available versions for a managed rule group by calling ListAvailableManagedRuleGroupVersions. You provide a rule group specification for each version. For each managed rule set, you must specify a version that you recommend using.  To initiate the expiration of a managed rule group version, use UpdateManagedRuleSetVersionExpiryDate.
    */
  def putManagedRuleSetVersions(): Request[PutManagedRuleSetVersionsResponse, AWSError] = js.native
  def putManagedRuleSetVersions(callback: js.Function2[/* err */ AWSError, /* data */ PutManagedRuleSetVersionsResponse, Unit]): Request[PutManagedRuleSetVersionsResponse, AWSError] = js.native
  /**
    * Defines the versions of your managed rule set that you are offering to the customers. Customers see your offerings as managed rule groups with versioning.  This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web Services Marketplace sellers.  Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group offerings for your customers. The APIs are ListManagedRuleSets, GetManagedRuleSet, PutManagedRuleSetVersions, and UpdateManagedRuleSetVersionExpiryDate.  Customers retrieve their managed rule group list by calling ListAvailableManagedRuleGroups. The name that you provide here for your managed rule set is the name the customer sees for the corresponding managed rule group. Customers can retrieve the available versions for a managed rule group by calling ListAvailableManagedRuleGroupVersions. You provide a rule group specification for each version. For each managed rule set, you must specify a version that you recommend using.  To initiate the expiration of a managed rule group version, use UpdateManagedRuleSetVersionExpiryDate.
    */
  def putManagedRuleSetVersions(params: PutManagedRuleSetVersionsRequest): Request[PutManagedRuleSetVersionsResponse, AWSError] = js.native
  def putManagedRuleSetVersions(
    params: PutManagedRuleSetVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutManagedRuleSetVersionsResponse, Unit]
  ): Request[PutManagedRuleSetVersionsResponse, AWSError] = js.native
  
  /**
    * Attaches an IAM policy to the specified resource. Use this to share a rule group across accounts. You must be the owner of the rule group to perform this operation. This action is subject to the following restrictions:   You can attach only one policy with each PutPermissionPolicy request.   The ARN in the request must be a valid WAF RuleGroup ARN and the rule group must exist in the same Region.   The user making the request must be the owner of the rule group.  
    */
  def putPermissionPolicy(): Request[PutPermissionPolicyResponse, AWSError] = js.native
  def putPermissionPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutPermissionPolicyResponse, Unit]): Request[PutPermissionPolicyResponse, AWSError] = js.native
  /**
    * Attaches an IAM policy to the specified resource. Use this to share a rule group across accounts. You must be the owner of the rule group to perform this operation. This action is subject to the following restrictions:   You can attach only one policy with each PutPermissionPolicy request.   The ARN in the request must be a valid WAF RuleGroup ARN and the rule group must exist in the same Region.   The user making the request must be the owner of the rule group.  
    */
  def putPermissionPolicy(params: PutPermissionPolicyRequest): Request[PutPermissionPolicyResponse, AWSError] = js.native
  def putPermissionPolicy(
    params: PutPermissionPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutPermissionPolicyResponse, Unit]
  ): Request[PutPermissionPolicyResponse, AWSError] = js.native
  
  /**
    * Associates tags with the specified Amazon Web Services resource. Tags are key:value pairs that you can use to categorize and manage your resources, for purposes like billing. For example, you might set the tag key to "customer" and the value to the customer name or ID. You can specify one or more tags to add to each Amazon Web Services resource, up to 50 tags for a resource. You can tag the Amazon Web Services resources that you manage through WAF: web ACLs, rule groups, IP sets, and regex pattern sets. You can't manage or view tags through the WAF console. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Associates tags with the specified Amazon Web Services resource. Tags are key:value pairs that you can use to categorize and manage your resources, for purposes like billing. For example, you might set the tag key to "customer" and the value to the customer name or ID. You can specify one or more tags to add to each Amazon Web Services resource, up to 50 tags for a resource. You can tag the Amazon Web Services resources that you manage through WAF: web ACLs, rule groups, IP sets, and regex pattern sets. You can't manage or view tags through the WAF console. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Disassociates tags from an Amazon Web Services resource. Tags are key:value pairs that you can associate with Amazon Web Services resources. For example, the tag key might be "customer" and the tag value might be "companyA." You can specify one or more tags to add to each container. You can add up to 50 tags to each Amazon Web Services resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Disassociates tags from an Amazon Web Services resource. Tags are key:value pairs that you can associate with Amazon Web Services resources. For example, the tag key might be "customer" and the tag value might be "companyA." You can specify one or more tags to add to each container. You can add up to 50 tags to each Amazon Web Services resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the specified IPSet.   This operation completely replaces the mutable specifications that you already have for the IP set with the ones that you provide to this call.  To modify an IP set, do the following:    Retrieve it by calling GetIPSet    Update its settings as needed   Provide the complete IP set specification to this call    When you make changes to web ACLs or web ACL components, like rules and rule groups, WAF propagates the changes everywhere that the web ACL and its components are stored and used. Your changes are applied within seconds, but there might be a brief period of inconsistency when the changes have arrived in some places and not in others. So, for example, if you change a rule action setting, the action might be the old action in one area and the new action in another area. Or if you add an IP address to an IP set used in a blocking rule, the new address might briefly be blocked in one area while still allowed in another. This temporary inconsistency can occur when you first associate a web ACL with an Amazon Web Services resource and when you change a web ACL that is already associated with a resource. Generally, any inconsistencies of this type last only a few seconds.
    */
  def updateIPSet(): Request[UpdateIPSetResponse, AWSError] = js.native
  def updateIPSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateIPSetResponse, Unit]): Request[UpdateIPSetResponse, AWSError] = js.native
  /**
    * Updates the specified IPSet.   This operation completely replaces the mutable specifications that you already have for the IP set with the ones that you provide to this call.  To modify an IP set, do the following:    Retrieve it by calling GetIPSet    Update its settings as needed   Provide the complete IP set specification to this call    When you make changes to web ACLs or web ACL components, like rules and rule groups, WAF propagates the changes everywhere that the web ACL and its components are stored and used. Your changes are applied within seconds, but there might be a brief period of inconsistency when the changes have arrived in some places and not in others. So, for example, if you change a rule action setting, the action might be the old action in one area and the new action in another area. Or if you add an IP address to an IP set used in a blocking rule, the new address might briefly be blocked in one area while still allowed in another. This temporary inconsistency can occur when you first associate a web ACL with an Amazon Web Services resource and when you change a web ACL that is already associated with a resource. Generally, any inconsistencies of this type last only a few seconds.
    */
  def updateIPSet(params: UpdateIPSetRequest): Request[UpdateIPSetResponse, AWSError] = js.native
  def updateIPSet(
    params: UpdateIPSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateIPSetResponse, Unit]
  ): Request[UpdateIPSetResponse, AWSError] = js.native
  
  /**
    * Updates the expiration information for your managed rule set. Use this to initiate the expiration of a managed rule group version. After you initiate expiration for a version, WAF excludes it from the response to ListAvailableManagedRuleGroupVersions for the managed rule group.   This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web Services Marketplace sellers.  Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group offerings for your customers. The APIs are ListManagedRuleSets, GetManagedRuleSet, PutManagedRuleSetVersions, and UpdateManagedRuleSetVersionExpiryDate. 
    */
  def updateManagedRuleSetVersionExpiryDate(): Request[UpdateManagedRuleSetVersionExpiryDateResponse, AWSError] = js.native
  def updateManagedRuleSetVersionExpiryDate(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateManagedRuleSetVersionExpiryDateResponse, Unit]
  ): Request[UpdateManagedRuleSetVersionExpiryDateResponse, AWSError] = js.native
  /**
    * Updates the expiration information for your managed rule set. Use this to initiate the expiration of a managed rule group version. After you initiate expiration for a version, WAF excludes it from the response to ListAvailableManagedRuleGroupVersions for the managed rule group.   This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web Services Marketplace sellers.  Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group offerings for your customers. The APIs are ListManagedRuleSets, GetManagedRuleSet, PutManagedRuleSetVersions, and UpdateManagedRuleSetVersionExpiryDate. 
    */
  def updateManagedRuleSetVersionExpiryDate(params: UpdateManagedRuleSetVersionExpiryDateRequest): Request[UpdateManagedRuleSetVersionExpiryDateResponse, AWSError] = js.native
  def updateManagedRuleSetVersionExpiryDate(
    params: UpdateManagedRuleSetVersionExpiryDateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateManagedRuleSetVersionExpiryDateResponse, Unit]
  ): Request[UpdateManagedRuleSetVersionExpiryDateResponse, AWSError] = js.native
  
  /**
    * Updates the specified RegexPatternSet.  This operation completely replaces the mutable specifications that you already have for the regex pattern set with the ones that you provide to this call.  To modify a regex pattern set, do the following:    Retrieve it by calling GetRegexPatternSet    Update its settings as needed   Provide the complete regex pattern set specification to this call    When you make changes to web ACLs or web ACL components, like rules and rule groups, WAF propagates the changes everywhere that the web ACL and its components are stored and used. Your changes are applied within seconds, but there might be a brief period of inconsistency when the changes have arrived in some places and not in others. So, for example, if you change a rule action setting, the action might be the old action in one area and the new action in another area. Or if you add an IP address to an IP set used in a blocking rule, the new address might briefly be blocked in one area while still allowed in another. This temporary inconsistency can occur when you first associate a web ACL with an Amazon Web Services resource and when you change a web ACL that is already associated with a resource. Generally, any inconsistencies of this type last only a few seconds.
    */
  def updateRegexPatternSet(): Request[UpdateRegexPatternSetResponse, AWSError] = js.native
  def updateRegexPatternSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRegexPatternSetResponse, Unit]): Request[UpdateRegexPatternSetResponse, AWSError] = js.native
  /**
    * Updates the specified RegexPatternSet.  This operation completely replaces the mutable specifications that you already have for the regex pattern set with the ones that you provide to this call.  To modify a regex pattern set, do the following:    Retrieve it by calling GetRegexPatternSet    Update its settings as needed   Provide the complete regex pattern set specification to this call    When you make changes to web ACLs or web ACL components, like rules and rule groups, WAF propagates the changes everywhere that the web ACL and its components are stored and used. Your changes are applied within seconds, but there might be a brief period of inconsistency when the changes have arrived in some places and not in others. So, for example, if you change a rule action setting, the action might be the old action in one area and the new action in another area. Or if you add an IP address to an IP set used in a blocking rule, the new address might briefly be blocked in one area while still allowed in another. This temporary inconsistency can occur when you first associate a web ACL with an Amazon Web Services resource and when you change a web ACL that is already associated with a resource. Generally, any inconsistencies of this type last only a few seconds.
    */
  def updateRegexPatternSet(params: UpdateRegexPatternSetRequest): Request[UpdateRegexPatternSetResponse, AWSError] = js.native
  def updateRegexPatternSet(
    params: UpdateRegexPatternSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRegexPatternSetResponse, Unit]
  ): Request[UpdateRegexPatternSetResponse, AWSError] = js.native
  
  /**
    * Updates the specified RuleGroup.  This operation completely replaces the mutable specifications that you already have for the rule group with the ones that you provide to this call.  To modify a rule group, do the following:    Retrieve it by calling GetRuleGroup    Update its settings as needed   Provide the complete rule group specification to this call    When you make changes to web ACLs or web ACL components, like rules and rule groups, WAF propagates the changes everywhere that the web ACL and its components are stored and used. Your changes are applied within seconds, but there might be a brief period of inconsistency when the changes have arrived in some places and not in others. So, for example, if you change a rule action setting, the action might be the old action in one area and the new action in another area. Or if you add an IP address to an IP set used in a blocking rule, the new address might briefly be blocked in one area while still allowed in another. This temporary inconsistency can occur when you first associate a web ACL with an Amazon Web Services resource and when you change a web ACL that is already associated with a resource. Generally, any inconsistencies of this type last only a few seconds.  A rule group defines a collection of rules to inspect and control web requests that you can use in a WebACL. When you create a rule group, you define an immutable capacity limit. If you update a rule group, you must stay within the capacity. This allows others to reuse the rule group with confidence in its capacity requirements. 
    */
  def updateRuleGroup(): Request[UpdateRuleGroupResponse, AWSError] = js.native
  def updateRuleGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRuleGroupResponse, Unit]): Request[UpdateRuleGroupResponse, AWSError] = js.native
  /**
    * Updates the specified RuleGroup.  This operation completely replaces the mutable specifications that you already have for the rule group with the ones that you provide to this call.  To modify a rule group, do the following:    Retrieve it by calling GetRuleGroup    Update its settings as needed   Provide the complete rule group specification to this call    When you make changes to web ACLs or web ACL components, like rules and rule groups, WAF propagates the changes everywhere that the web ACL and its components are stored and used. Your changes are applied within seconds, but there might be a brief period of inconsistency when the changes have arrived in some places and not in others. So, for example, if you change a rule action setting, the action might be the old action in one area and the new action in another area. Or if you add an IP address to an IP set used in a blocking rule, the new address might briefly be blocked in one area while still allowed in another. This temporary inconsistency can occur when you first associate a web ACL with an Amazon Web Services resource and when you change a web ACL that is already associated with a resource. Generally, any inconsistencies of this type last only a few seconds.  A rule group defines a collection of rules to inspect and control web requests that you can use in a WebACL. When you create a rule group, you define an immutable capacity limit. If you update a rule group, you must stay within the capacity. This allows others to reuse the rule group with confidence in its capacity requirements. 
    */
  def updateRuleGroup(params: UpdateRuleGroupRequest): Request[UpdateRuleGroupResponse, AWSError] = js.native
  def updateRuleGroup(
    params: UpdateRuleGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRuleGroupResponse, Unit]
  ): Request[UpdateRuleGroupResponse, AWSError] = js.native
  
  /**
    * Updates the specified WebACL. While updating a web ACL, WAF provides continuous coverage to the resources that you have associated with the web ACL.   This operation completely replaces the mutable specifications that you already have for the web ACL with the ones that you provide to this call.  To modify a web ACL, do the following:    Retrieve it by calling GetWebACL    Update its settings as needed   Provide the complete web ACL specification to this call    When you make changes to web ACLs or web ACL components, like rules and rule groups, WAF propagates the changes everywhere that the web ACL and its components are stored and used. Your changes are applied within seconds, but there might be a brief period of inconsistency when the changes have arrived in some places and not in others. So, for example, if you change a rule action setting, the action might be the old action in one area and the new action in another area. Or if you add an IP address to an IP set used in a blocking rule, the new address might briefly be blocked in one area while still allowed in another. This temporary inconsistency can occur when you first associate a web ACL with an Amazon Web Services resource and when you change a web ACL that is already associated with a resource. Generally, any inconsistencies of this type last only a few seconds.  A web ACL defines a collection of rules to use to inspect and control web requests. Each rule has an action defined (allow, block, or count) for requests that match the statement of the rule. In the web ACL, you assign a default action to take (allow, block) for any request that does not match any of the rules. The rules in a web ACL can be a combination of the types Rule, RuleGroup, and managed rule group. You can associate a web ACL with one or more Amazon Web Services resources to protect. The resources can be an Amazon CloudFront distribution, an Amazon API Gateway REST API, an Application Load Balancer, an AppSync GraphQL API, an Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified Access instance. 
    */
  def updateWebACL(): Request[UpdateWebACLResponse, AWSError] = js.native
  def updateWebACL(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWebACLResponse, Unit]): Request[UpdateWebACLResponse, AWSError] = js.native
  /**
    * Updates the specified WebACL. While updating a web ACL, WAF provides continuous coverage to the resources that you have associated with the web ACL.   This operation completely replaces the mutable specifications that you already have for the web ACL with the ones that you provide to this call.  To modify a web ACL, do the following:    Retrieve it by calling GetWebACL    Update its settings as needed   Provide the complete web ACL specification to this call    When you make changes to web ACLs or web ACL components, like rules and rule groups, WAF propagates the changes everywhere that the web ACL and its components are stored and used. Your changes are applied within seconds, but there might be a brief period of inconsistency when the changes have arrived in some places and not in others. So, for example, if you change a rule action setting, the action might be the old action in one area and the new action in another area. Or if you add an IP address to an IP set used in a blocking rule, the new address might briefly be blocked in one area while still allowed in another. This temporary inconsistency can occur when you first associate a web ACL with an Amazon Web Services resource and when you change a web ACL that is already associated with a resource. Generally, any inconsistencies of this type last only a few seconds.  A web ACL defines a collection of rules to use to inspect and control web requests. Each rule has an action defined (allow, block, or count) for requests that match the statement of the rule. In the web ACL, you assign a default action to take (allow, block) for any request that does not match any of the rules. The rules in a web ACL can be a combination of the types Rule, RuleGroup, and managed rule group. You can associate a web ACL with one or more Amazon Web Services resources to protect. The resources can be an Amazon CloudFront distribution, an Amazon API Gateway REST API, an Application Load Balancer, an AppSync GraphQL API, an Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified Access instance. 
    */
  def updateWebACL(params: UpdateWebACLRequest): Request[UpdateWebACLResponse, AWSError] = js.native
  def updateWebACL(
    params: UpdateWebACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWebACLResponse, Unit]
  ): Request[UpdateWebACLResponse, AWSError] = js.native
}
