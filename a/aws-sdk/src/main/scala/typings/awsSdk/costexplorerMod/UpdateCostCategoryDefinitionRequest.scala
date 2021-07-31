package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCostCategoryDefinitionRequest extends StObject {
  
  /**
    * The unique identifier for your Cost Category.
    */
  var CostCategoryArn: Arn
  
  var RuleVersion: CostCategoryRuleVersion
  
  /**
    * The Expression object used to categorize costs. For more information, see CostCategoryRule . 
    */
  var Rules: CostCategoryRulesList
}
object UpdateCostCategoryDefinitionRequest {
  
  @scala.inline
  def apply(CostCategoryArn: Arn, RuleVersion: CostCategoryRuleVersion, Rules: CostCategoryRulesList): UpdateCostCategoryDefinitionRequest = {
    val __obj = js.Dynamic.literal(CostCategoryArn = CostCategoryArn.asInstanceOf[js.Any], RuleVersion = RuleVersion.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCostCategoryDefinitionRequest]
  }
  
  @scala.inline
  implicit class UpdateCostCategoryDefinitionRequestMutableBuilder[Self <: UpdateCostCategoryDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCostCategoryArn(value: Arn): Self = StObject.set(x, "CostCategoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleVersion(value: CostCategoryRuleVersion): Self = StObject.set(x, "RuleVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRules(value: CostCategoryRulesList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: CostCategoryRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
