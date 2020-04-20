package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCostCategoryDefinitionRequest extends js.Object {
  var Name: CostCategoryName = js.native
  var RuleVersion: CostCategoryRuleVersion = js.native
  /**
    *  CreateCostCategoryDefinition supports dimensions, Tags, and nested expressions. Currently the only dimensions supported is LINKED_ACCOUNT. Root level OR is not supported. We recommend you create a separate rule instead. Rules are processed in order. If there are multiple rules that match the line item, then the first rule to match is used to determine that Cost Category value. 
    */
  var Rules: CostCategoryRulesList = js.native
}

object CreateCostCategoryDefinitionRequest {
  @scala.inline
  def apply(Name: CostCategoryName, RuleVersion: CostCategoryRuleVersion, Rules: CostCategoryRulesList): CreateCostCategoryDefinitionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RuleVersion = RuleVersion.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCostCategoryDefinitionRequest]
  }
}

