package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCostCategoryDefinitionRequest extends StObject {
  
  /**
    * The unique identifier for your Cost Category.
    */
  var CostCategoryArn: Arn
  
  var DefaultValue: js.UndefOr[CostCategoryValue] = js.undefined
  
  /**
    * The Cost Category's effective start date. It can only be a billing start date (first day of the month). If the date isn't provided, it's the first day of the current month. Dates can't be before the previous twelve months, or in the future.
    */
  var EffectiveStart: js.UndefOr[ZonedDateTime] = js.undefined
  
  var RuleVersion: CostCategoryRuleVersion
  
  /**
    * The Expression object used to categorize costs. For more information, see CostCategoryRule . 
    */
  var Rules: CostCategoryRulesList
  
  /**
    *  The split charge rules used to allocate your charges between your Cost Category values. 
    */
  var SplitChargeRules: js.UndefOr[CostCategorySplitChargeRulesList] = js.undefined
}
object UpdateCostCategoryDefinitionRequest {
  
  inline def apply(CostCategoryArn: Arn, RuleVersion: CostCategoryRuleVersion, Rules: CostCategoryRulesList): UpdateCostCategoryDefinitionRequest = {
    val __obj = js.Dynamic.literal(CostCategoryArn = CostCategoryArn.asInstanceOf[js.Any], RuleVersion = RuleVersion.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCostCategoryDefinitionRequest]
  }
  
  extension [Self <: UpdateCostCategoryDefinitionRequest](x: Self) {
    
    inline def setCostCategoryArn(value: Arn): Self = StObject.set(x, "CostCategoryArn", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: CostCategoryValue): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    inline def setEffectiveStart(value: ZonedDateTime): Self = StObject.set(x, "EffectiveStart", value.asInstanceOf[js.Any])
    
    inline def setEffectiveStartUndefined: Self = StObject.set(x, "EffectiveStart", js.undefined)
    
    inline def setRuleVersion(value: CostCategoryRuleVersion): Self = StObject.set(x, "RuleVersion", value.asInstanceOf[js.Any])
    
    inline def setRules(value: CostCategoryRulesList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: CostCategoryRule*): Self = StObject.set(x, "Rules", js.Array(value*))
    
    inline def setSplitChargeRules(value: CostCategorySplitChargeRulesList): Self = StObject.set(x, "SplitChargeRules", value.asInstanceOf[js.Any])
    
    inline def setSplitChargeRulesUndefined: Self = StObject.set(x, "SplitChargeRules", js.undefined)
    
    inline def setSplitChargeRulesVarargs(value: CostCategorySplitChargeRule*): Self = StObject.set(x, "SplitChargeRules", js.Array(value*))
  }
}
