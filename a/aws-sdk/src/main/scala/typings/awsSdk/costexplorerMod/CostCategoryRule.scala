package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CostCategoryRule extends StObject {
  
  /**
    * An Expression object used to categorize costs. This supports dimensions, tags, and nested expressions. Currently the only dimensions supported are LINKED_ACCOUNT, SERVICE_CODE, RECORD_TYPE, and LINKED_ACCOUNT_NAME. Root level OR is not supported. We recommend that you create a separate rule instead.  RECORD_TYPE is a dimension used for Cost Explorer APIs, and is also supported for Cost Category expressions. This dimension uses different terms, depending on whether you're using the console or API/JSON editor. For a detailed comparison, see Term Comparisons in the AWS Billing and Cost Management User Guide.
    */
  var Rule: Expression
  
  var Value: CostCategoryValue
}
object CostCategoryRule {
  
  @scala.inline
  def apply(Rule: Expression, Value: CostCategoryValue): CostCategoryRule = {
    val __obj = js.Dynamic.literal(Rule = Rule.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CostCategoryRule]
  }
  
  @scala.inline
  implicit class CostCategoryRuleMutableBuilder[Self <: CostCategoryRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRule(value: Expression): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: CostCategoryValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
