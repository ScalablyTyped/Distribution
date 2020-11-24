package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCostCategoryDefinitionRequest extends js.Object {
  
  /**
    * The unique identifier for your Cost Category.
    */
  var CostCategoryArn: Arn = js.native
  
  var RuleVersion: CostCategoryRuleVersion = js.native
  
  /**
    * The Expression object used to categorize costs. For more information, see CostCategoryRule . 
    */
  var Rules: CostCategoryRulesList = js.native
}
object UpdateCostCategoryDefinitionRequest {
  
  @scala.inline
  def apply(CostCategoryArn: Arn, RuleVersion: CostCategoryRuleVersion, Rules: CostCategoryRulesList): UpdateCostCategoryDefinitionRequest = {
    val __obj = js.Dynamic.literal(CostCategoryArn = CostCategoryArn.asInstanceOf[js.Any], RuleVersion = RuleVersion.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCostCategoryDefinitionRequest]
  }
  
  @scala.inline
  implicit class UpdateCostCategoryDefinitionRequestOps[Self <: UpdateCostCategoryDefinitionRequest] (val x: Self) extends AnyVal {
    
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
    def setCostCategoryArn(value: Arn): Self = this.set("CostCategoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleVersion(value: CostCategoryRuleVersion): Self = this.set("RuleVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: CostCategoryRule*): Self = this.set("Rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: CostCategoryRulesList): Self = this.set("Rules", value.asInstanceOf[js.Any])
  }
}
