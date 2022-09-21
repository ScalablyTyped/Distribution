package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CostCategoryRule extends StObject {
  
  /**
    * The value the line item is categorized as if the line item contains the matched dimension.
    */
  var InheritedValue: js.UndefOr[CostCategoryInheritedValueDimension] = js.undefined
  
  /**
    * An Expression object used to categorize costs. This supports dimensions, tags, and nested expressions. Currently the only dimensions supported are LINKED_ACCOUNT, SERVICE_CODE, RECORD_TYPE, and LINKED_ACCOUNT_NAME. Root level OR isn't supported. We recommend that you create a separate rule instead.  RECORD_TYPE is a dimension used for Cost Explorer APIs, and is also supported for Cost Category expressions. This dimension uses different terms, depending on whether you're using the console or API/JSON editor. For a detailed comparison, see Term Comparisons in the Billing and Cost Management User Guide.
    */
  var Rule: js.UndefOr[Expression] = js.undefined
  
  /**
    * You can define the CostCategoryRule rule type as either REGULAR or INHERITED_VALUE. The INHERITED_VALUE rule type adds the flexibility to define a rule that dynamically inherits the cost category value. This value is from the dimension value that's defined by CostCategoryInheritedValueDimension. For example, suppose that you want to costs to be dynamically grouped based on the value of a specific tag key. First, choose an inherited value rule type, and then choose the tag dimension and specify the tag key to use.
    */
  var Type: js.UndefOr[CostCategoryRuleType] = js.undefined
  
  var Value: js.UndefOr[CostCategoryValue] = js.undefined
}
object CostCategoryRule {
  
  inline def apply(): CostCategoryRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CostCategoryRule]
  }
  
  extension [Self <: CostCategoryRule](x: Self) {
    
    inline def setInheritedValue(value: CostCategoryInheritedValueDimension): Self = StObject.set(x, "InheritedValue", value.asInstanceOf[js.Any])
    
    inline def setInheritedValueUndefined: Self = StObject.set(x, "InheritedValue", js.undefined)
    
    inline def setRule(value: Expression): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "Rule", js.undefined)
    
    inline def setType(value: CostCategoryRuleType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValue(value: CostCategoryValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
