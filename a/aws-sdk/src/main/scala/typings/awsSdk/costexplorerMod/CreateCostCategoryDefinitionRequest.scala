package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCostCategoryDefinitionRequest extends js.Object {
  var Name: CostCategoryName = js.native
  var RuleVersion: CostCategoryRuleVersion = js.native
  /**
    * The Cost Category rules used to categorize costs. For more information, see CostCategoryRule.
    */
  var Rules: CostCategoryRulesList = js.native
}

object CreateCostCategoryDefinitionRequest {
  @scala.inline
  def apply(Name: CostCategoryName, RuleVersion: CostCategoryRuleVersion, Rules: CostCategoryRulesList): CreateCostCategoryDefinitionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RuleVersion = RuleVersion.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCostCategoryDefinitionRequest]
  }
  @scala.inline
  implicit class CreateCostCategoryDefinitionRequestOps[Self <: CreateCostCategoryDefinitionRequest] (val x: Self) extends AnyVal {
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
    def setName(value: CostCategoryName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleVersion(value: CostCategoryRuleVersion): Self = this.set("RuleVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setRulesVarargs(value: CostCategoryRule*): Self = this.set("Rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: CostCategoryRulesList): Self = this.set("Rules", value.asInstanceOf[js.Any])
  }
  
}

