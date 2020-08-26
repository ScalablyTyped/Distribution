package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityServicePolicyData extends js.Object {
  /**
    * Details about the service that are specific to the service type, in JSON format. For service type SHIELD_ADVANCED, this is an empty string.   Example: WAFV2   "ManagedServiceData": "{\"type\":\"WAFV2\",\"defaultAction\":{\"type\":\"ALLOW\"},\"preProcessRuleGroups\":[{\"managedRuleGroupIdentifier\":null,\"ruleGroupArn\":\"rulegrouparn\",\"overrideAction\":{\"type\":\"COUNT\"},\"excludeRules\":[{\"name\":\"EntityName\"}],\"ruleGroupType\":\"RuleGroup\"}],\"postProcessRuleGroups\":[{\"managedRuleGroupIdentifier\":{\"managedRuleGroupName\":\"AWSManagedRulesAdminProtectionRuleSet\",\"vendorName\":\"AWS\"},\"ruleGroupArn\":\"rulegrouparn\",\"overrideAction\":{\"type\":\"NONE\"},\"excludeRules\":[],\"ruleGroupType\":\"ManagedRuleGroup\"}],\"overrideCustomerWebACLAssociation\":false}"    Example: WAF Classic   "ManagedServiceData": "{\"type\": \"WAF\", \"ruleGroups\": [{\"id\": \"12345678-1bcd-9012-efga-0987654321ab\", \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}    Example: SECURITY_GROUPS_COMMON   "SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_COMMON","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false, \"applyToAllEC2InstanceENIs\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"},"RemediationEnabled":false,"ResourceType":"AWS::EC2::NetworkInterface"}    Example: SECURITY_GROUPS_CONTENT_AUDIT   "SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_CONTENT_AUDIT","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd \"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"},"RemediationEnabled":false,"ResourceType":"AWS::EC2::NetworkInterface"}  The security group action for content audit can be ALLOW or DENY. For ALLOW, all in-scope security group rules must be within the allowed range of the policy's security group rules. For DENY, all in-scope security group rules must not contain a value or a range that matches a rule value or range in the policy security group.   Example: SECURITY_GROUPS_USAGE_AUDIT   "SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_USAGE_AUDIT","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"},"RemediationEnabled":false,"Resou rceType":"AWS::EC2::SecurityGroup"}   
    */
  var ManagedServiceData: js.UndefOr[typings.awsSdk.fmsMod.ManagedServiceData] = js.native
  /**
    * The service that the policy is using to protect the resources. This specifies the type of policy that is created, either an AWS WAF policy, a Shield Advanced policy, or a security group policy. For security group policies, Firewall Manager supports one security group for each common policy and for each content audit policy. This is an adjustable limit that you can increase by contacting AWS Support.
    */
  var Type: SecurityServiceType = js.native
}

object SecurityServicePolicyData {
  @scala.inline
  def apply(Type: SecurityServiceType): SecurityServicePolicyData = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityServicePolicyData]
  }
  @scala.inline
  implicit class SecurityServicePolicyDataOps[Self <: SecurityServicePolicyData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: SecurityServiceType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setManagedServiceData(value: ManagedServiceData): Self = this.set("ManagedServiceData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedServiceData: Self = this.set("ManagedServiceData", js.undefined)
  }
  
}

