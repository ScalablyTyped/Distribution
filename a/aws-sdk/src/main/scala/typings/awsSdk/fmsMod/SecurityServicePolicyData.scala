package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityServicePolicyData extends StObject {
  
  /**
    * Details about the service that are specific to the service type, in JSON format. For service type SHIELD_ADVANCED, this is an empty string.   Example: NETWORK_FIREWALL   "{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-west-1:1234567891011:stateless-rulegroup/rulegroup2\",\"priority\":10}],\"networkFirewallStatelessDefaultActions\":[\"aws:pass\",\"custom1\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"custom2\",\"aws:pass\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"custom1\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"dimension1\"}]}}},{\"actionName\":\"custom2\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"dimension2\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-west-1:1234567891011:stateful-rulegroup/rulegroup1\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":true,\"allowedIPV4CidrList\":[\"10.24.34.0/28\"]} }"    Example: WAFV2   "{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAmazonIpReputationList\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"  In the loggingConfiguration, you can specify one logDestinationConfigs, you can optionally provide up to 20 redactedFields, and the RedactedFieldType must be one of URI, QUERY_STRING, HEADER, or METHOD.   Example: WAF Classic   "{\"type\": \"WAF\", \"ruleGroups\": [{\"id\":\"12345678-1bcd-9012-efga-0987654321ab\", \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}"    Example: SECURITY_GROUPS_COMMON   "{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false, \"applyToAllEC2InstanceENIs\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"    Example: SECURITY_GROUPS_CONTENT_AUDIT   "{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"  The security group action for content audit can be ALLOW or DENY. For ALLOW, all in-scope security group rules must be within the allowed range of the policy's security group rules. For DENY, all in-scope security group rules must not contain a value or a range that matches a rule value or range in the policy security group.   Example: SECURITY_GROUPS_USAGE_AUDIT   "{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"   
    */
  var ManagedServiceData: js.UndefOr[typings.awsSdk.fmsMod.ManagedServiceData] = js.undefined
  
  /**
    * The service that the policy is using to protect the resources. This specifies the type of policy that is created, either an AWS WAF policy, a Shield Advanced policy, or a security group policy. For security group policies, Firewall Manager supports one security group for each common policy and for each content audit policy. This is an adjustable limit that you can increase by contacting AWS Support.
    */
  var Type: SecurityServiceType
}
object SecurityServicePolicyData {
  
  @scala.inline
  def apply(Type: SecurityServiceType): SecurityServicePolicyData = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityServicePolicyData]
  }
  
  @scala.inline
  implicit class SecurityServicePolicyDataMutableBuilder[Self <: SecurityServicePolicyData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagedServiceData(value: ManagedServiceData): Self = StObject.set(x, "ManagedServiceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedServiceDataUndefined: Self = StObject.set(x, "ManagedServiceData", js.undefined)
    
    @scala.inline
    def setType(value: SecurityServiceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
