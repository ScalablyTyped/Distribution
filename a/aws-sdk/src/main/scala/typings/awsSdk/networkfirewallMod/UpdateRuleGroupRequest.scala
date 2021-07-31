package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRuleGroupRequest extends StObject {
  
  /**
    * A description of the rule group. 
    */
  var Description: js.UndefOr[typings.awsSdk.networkfirewallMod.Description] = js.undefined
  
  /**
    * Indicates whether you want Network Firewall to just check the validity of the request, rather than run the request.  If set to TRUE, Network Firewall checks whether the request can run successfully, but doesn't actually make the requested changes. The call returns the value that the request would return if you ran it with dry run set to FALSE, but doesn't make additions or changes to your resources. This option allows you to make sure that you have the required permissions to run the request and that your request parameters are valid.  If set to FALSE, Network Firewall makes the requested changes to your resources. 
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object that defines the rule group rules.   You must provide either this rule group setting or a Rules setting, but not both.  
    */
  var RuleGroup: js.UndefOr[typings.awsSdk.networkfirewallMod.RuleGroup] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the rule group. You must specify the ARN or the name, and you can specify both. 
    */
  var RuleGroupArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The descriptive name of the rule group. You can't change the name of a rule group after you create it. You must specify the ARN or the name, and you can specify both. 
    */
  var RuleGroupName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The name of a file containing stateful rule group rules specifications in Suricata flat format, with one rule per line. Use this to import your existing Suricata compatible rule groups.   You must provide either this rules setting or a populated RuleGroup setting, but not both.   You can provide your rule group specification in a file through this setting when you create or update your rule group. The call response returns a RuleGroup object that Network Firewall has populated from your file. Network Firewall uses the file contents to populate the rule group rules, but does not maintain a reference to the file or use the file in any way after performing the create or update. If you call DescribeRuleGroup to retrieve the rule group, Network Firewall returns rules settings inside a RuleGroup object. 
    */
  var Rules: js.UndefOr[RulesString] = js.undefined
  
  /**
    * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless rules. If it is stateful, it contains stateful rules.   This setting is required for requests that do not include the RuleGroupARN. 
    */
  var Type: js.UndefOr[RuleGroupType] = js.undefined
  
  /**
    * A token used for optimistic locking. Network Firewall returns a token to your requests that access the rule group. The token marks the state of the rule group resource at the time of the request.  To make changes to the rule group, you provide the token in your request. Network Firewall uses the token to ensure that the rule group hasn't changed since you last retrieved it. If it has changed, the operation fails with an InvalidTokenException. If this happens, retrieve the rule group again to get a current copy of it with a current token. Reapply your changes as needed, then try the operation again using the new token. 
    */
  var UpdateToken: typings.awsSdk.networkfirewallMod.UpdateToken
}
object UpdateRuleGroupRequest {
  
  @scala.inline
  def apply(UpdateToken: UpdateToken): UpdateRuleGroupRequest = {
    val __obj = js.Dynamic.literal(UpdateToken = UpdateToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRuleGroupRequest]
  }
  
  @scala.inline
  implicit class UpdateRuleGroupRequestMutableBuilder[Self <: UpdateRuleGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setRuleGroup(value: RuleGroup): Self = StObject.set(x, "RuleGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleGroupArn(value: ResourceArn): Self = StObject.set(x, "RuleGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleGroupArnUndefined: Self = StObject.set(x, "RuleGroupArn", js.undefined)
    
    @scala.inline
    def setRuleGroupName(value: ResourceName): Self = StObject.set(x, "RuleGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleGroupNameUndefined: Self = StObject.set(x, "RuleGroupName", js.undefined)
    
    @scala.inline
    def setRuleGroupUndefined: Self = StObject.set(x, "RuleGroup", js.undefined)
    
    @scala.inline
    def setRules(value: RulesString): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    @scala.inline
    def setType(value: RuleGroupType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setUpdateToken(value: UpdateToken): Self = StObject.set(x, "UpdateToken", value.asInstanceOf[js.Any])
  }
}
