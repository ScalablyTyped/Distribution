package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CostCategoryRule extends js.Object {
  
  /**
    * An Expression object used to categorize costs. This supports dimensions, tags, and nested expressions. Currently the only dimensions supported are LINKED_ACCOUNT, SERVICE_CODE, RECORD_TYPE, and LINKED_ACCOUNT_NAME. Root level OR is not supported. We recommend that you create a separate rule instead.  RECORD_TYPE is a dimension used for Cost Explorer APIs, and is also supported for Cost Category expressions. This dimension uses different terms, depending on whether you're using the console or API/JSON editor. For a detailed comparison, see Term Comparisons in the AWS Billing and Cost Management User Guide.
    */
  var Rule: Expression = js.native
  
  var Value: CostCategoryValue = js.native
}
object CostCategoryRule {
  
  @scala.inline
  def apply(Rule: Expression, Value: CostCategoryValue): CostCategoryRule = {
    val __obj = js.Dynamic.literal(Rule = Rule.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CostCategoryRule]
  }
  
  @scala.inline
  implicit class CostCategoryRuleOps[Self <: CostCategoryRule] (val x: Self) extends AnyVal {
    
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
    def setRule(value: Expression): Self = this.set("Rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: CostCategoryValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
