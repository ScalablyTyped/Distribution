package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

