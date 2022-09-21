package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CostCategorySplitChargeRule extends StObject {
  
  /**
    * The method that's used to define how to split your source costs across your targets.   Proportional - Allocates charges across your targets based on the proportional weighted cost of each target.  Fixed - Allocates charges across your targets based on your defined allocation percentage. &gt;Even - Allocates costs evenly across all targets.
    */
  var Method: CostCategorySplitChargeMethod
  
  /**
    * The parameters for a split charge method. This is only required for the FIXED method. 
    */
  var Parameters: js.UndefOr[CostCategorySplitChargeRuleParametersList] = js.undefined
  
  /**
    * The Cost Category value that you want to split. That value can't be used as a source or a target in other split charge rules. To indicate uncategorized costs, you can use an empty string as the source.
    */
  var Source: GenericString
  
  /**
    * The Cost Category values that you want to split costs across. These values can't be used as a source in other split charge rules. 
    */
  var Targets: CostCategorySplitChargeRuleTargetsList
}
object CostCategorySplitChargeRule {
  
  inline def apply(
    Method: CostCategorySplitChargeMethod,
    Source: GenericString,
    Targets: CostCategorySplitChargeRuleTargetsList
  ): CostCategorySplitChargeRule = {
    val __obj = js.Dynamic.literal(Method = Method.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CostCategorySplitChargeRule]
  }
  
  extension [Self <: CostCategorySplitChargeRule](x: Self) {
    
    inline def setMethod(value: CostCategorySplitChargeMethod): Self = StObject.set(x, "Method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: CostCategorySplitChargeRuleParametersList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: CostCategorySplitChargeRuleParameter*): Self = StObject.set(x, "Parameters", js.Array(value*))
    
    inline def setSource(value: GenericString): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setTargets(value: CostCategorySplitChargeRuleTargetsList): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: GenericString*): Self = StObject.set(x, "Targets", js.Array(value*))
  }
}
