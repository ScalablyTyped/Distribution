package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRuleGroupRequest extends js.Object {
  
  /**
    * The maximum operating resources that this rule group can use. Rule group capacity is fixed at creation. When you update a rule group, you are limited to this capacity. When you reference a rule group from a firewall policy, Network Firewall reserves this capacity for the rule group.  You can retrieve the capacity that would be required for a rule group before you create the rule group by calling CreateRuleGroup with DryRun set to TRUE.   You can't change or exceed this capacity when you update the rule group, so leave room for your rule group to grow.    Capacity for a stateless rule group  For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules that you expect to have in the rule group.  To calculate the capacity requirement of a single rule, multiply the capacity requirement values of each of the rule's match settings:   A match setting with no criteria specified has a value of 1.    A match setting with Any specified has a value of 1.    All other match settings have a value equal to the number of elements provided in the setting. For example, a protocol setting ["UDP"] and a source setting ["10.0.0.0/24"] each have a value of 1. A protocol setting ["UDP","TCP"] has a value of 2. A source setting ["10.0.0.0/24","10.0.0.1/24","10.0.0.2/24"] has a value of 3.    A rule with no criteria specified in any of its match settings has a capacity requirement of 1. A rule with protocol setting ["UDP","TCP"], source setting ["10.0.0.0/24","10.0.0.1/24","10.0.0.2/24"], and a single specification or no specification for each of the other match settings has a capacity requirement of 6.   Capacity for a stateful rule group  For a stateful rule group, the minimum capacity required is the number of individual rules that you expect to have in the rule group. 
    */
  var Capacity: RuleCapacity = js.native
  
  /**
    * A description of the rule group. 
    */
  var Description: js.UndefOr[typings.awsSdk.networkfirewallMod.Description] = js.native
  
  /**
    * Indicates whether you want Network Firewall to just check the validity of the request, rather than run the request.  If set to TRUE, Network Firewall checks whether the request can run successfully, but doesn't actually make the requested changes. The call returns the value that the request would return if you ran it with dry run set to FALSE, but doesn't make additions or changes to your resources. This option allows you to make sure that you have the required permissions to run the request and that your request parameters are valid.  If set to FALSE, Network Firewall makes the requested changes to your resources. 
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * An object that defines the rule group rules.   You must provide either this rule group setting or a Rules setting, but not both.  
    */
  var RuleGroup: js.UndefOr[typings.awsSdk.networkfirewallMod.RuleGroup] = js.native
  
  /**
    * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
    */
  var RuleGroupName: ResourceName = js.native
  
  /**
    * The name of a file containing stateful rule group rules specifications in Suricata flat format, with one rule per line. Use this to import your existing Suricata compatible rule groups.   You must provide either this rules setting or a populated RuleGroup setting, but not both.   You can provide your rule group specification in a file through this setting when you create or update your rule group. The call response returns a RuleGroup object that Network Firewall has populated from your file. Network Firewall uses the file contents to populate the rule group rules, but does not maintain a reference to the file or use the file in any way after performing the create or update. If you call DescribeRuleGroup to retrieve the rule group, Network Firewall returns rules settings inside a RuleGroup object. 
    */
  var Rules: js.UndefOr[RulesString] = js.native
  
  /**
    * The key:value pairs to associate with the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless rules. If it is stateful, it contains stateful rules. 
    */
  var Type: RuleGroupType = js.native
}
object CreateRuleGroupRequest {
  
  @scala.inline
  def apply(Capacity: RuleCapacity, RuleGroupName: ResourceName, Type: RuleGroupType): CreateRuleGroupRequest = {
    val __obj = js.Dynamic.literal(Capacity = Capacity.asInstanceOf[js.Any], RuleGroupName = RuleGroupName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRuleGroupRequest]
  }
  
  @scala.inline
  implicit class CreateRuleGroupRequestOps[Self <: CreateRuleGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setCapacity(value: RuleCapacity): Self = this.set("Capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleGroupName(value: ResourceName): Self = this.set("RuleGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: RuleGroupType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setRuleGroup(value: RuleGroup): Self = this.set("RuleGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleGroup: Self = this.set("RuleGroup", js.undefined)
    
    @scala.inline
    def setRules(value: RulesString): Self = this.set("Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("Rules", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
