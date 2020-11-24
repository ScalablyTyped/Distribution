package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindingFilter extends js.Object {
  
  /**
    * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the agentId property of the Finding data type.
    */
  var agentIds: js.UndefOr[AgentIdList] = js.native
  
  /**
    * For a record to match a filter, the list of values that are specified for this data type property must be contained in the list of values of the attributes property of the Finding data type.
    */
  var attributes: js.UndefOr[AttributeList] = js.native
  
  /**
    * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the autoScalingGroup property of the Finding data type.
    */
  var autoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.native
  
  /**
    * The time range during which the finding is generated.
    */
  var creationTimeRange: js.UndefOr[TimestampRange] = js.native
  
  /**
    * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the ruleName property of the Finding data type.
    */
  var ruleNames: js.UndefOr[RuleNameList] = js.native
  
  /**
    * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the rulesPackageArn property of the Finding data type.
    */
  var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.native
  
  /**
    * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the severity property of the Finding data type.
    */
  var severities: js.UndefOr[SeverityList] = js.native
  
  /**
    * For a record to match a filter, the value that is specified for this data type property must be contained in the list of values of the userAttributes property of the Finding data type.
    */
  var userAttributes: js.UndefOr[AttributeList] = js.native
}
object FindingFilter {
  
  @scala.inline
  def apply(): FindingFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingFilter]
  }
  
  @scala.inline
  implicit class FindingFilterOps[Self <: FindingFilter] (val x: Self) extends AnyVal {
    
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
    def setAgentIdsVarargs(value: AgentId*): Self = this.set("agentIds", js.Array(value :_*))
    
    @scala.inline
    def setAgentIds(value: AgentIdList): Self = this.set("agentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentIds: Self = this.set("agentIds", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: Attribute*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: AttributeList): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setAutoScalingGroupsVarargs(value: AutoScalingGroup*): Self = this.set("autoScalingGroups", js.Array(value :_*))
    
    @scala.inline
    def setAutoScalingGroups(value: AutoScalingGroupList): Self = this.set("autoScalingGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScalingGroups: Self = this.set("autoScalingGroups", js.undefined)
    
    @scala.inline
    def setCreationTimeRange(value: TimestampRange): Self = this.set("creationTimeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimeRange: Self = this.set("creationTimeRange", js.undefined)
    
    @scala.inline
    def setRuleNamesVarargs(value: RuleName*): Self = this.set("ruleNames", js.Array(value :_*))
    
    @scala.inline
    def setRuleNames(value: RuleNameList): Self = this.set("ruleNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleNames: Self = this.set("ruleNames", js.undefined)
    
    @scala.inline
    def setRulesPackageArnsVarargs(value: Arn*): Self = this.set("rulesPackageArns", js.Array(value :_*))
    
    @scala.inline
    def setRulesPackageArns(value: FilterRulesPackageArnList): Self = this.set("rulesPackageArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRulesPackageArns: Self = this.set("rulesPackageArns", js.undefined)
    
    @scala.inline
    def setSeveritiesVarargs(value: Severity*): Self = this.set("severities", js.Array(value :_*))
    
    @scala.inline
    def setSeverities(value: SeverityList): Self = this.set("severities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverities: Self = this.set("severities", js.undefined)
    
    @scala.inline
    def setUserAttributesVarargs(value: Attribute*): Self = this.set("userAttributes", js.Array(value :_*))
    
    @scala.inline
    def setUserAttributes(value: AttributeList): Self = this.set("userAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAttributes: Self = this.set("userAttributes", js.undefined)
  }
}
