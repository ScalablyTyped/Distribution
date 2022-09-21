package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CostCategory extends StObject {
  
  /**
    * The unique identifier for your Cost Category. 
    */
  var CostCategoryArn: Arn
  
  var DefaultValue: js.UndefOr[CostCategoryValue] = js.undefined
  
  /**
    * The effective end data of your Cost Category.
    */
  var EffectiveEnd: js.UndefOr[ZonedDateTime] = js.undefined
  
  /**
    * The effective state data of your Cost Category.
    */
  var EffectiveStart: ZonedDateTime
  
  var Name: CostCategoryName
  
  /**
    * The list of processing statuses for Cost Management products for a specific cost category. 
    */
  var ProcessingStatus: js.UndefOr[CostCategoryProcessingStatusList] = js.undefined
  
  var RuleVersion: CostCategoryRuleVersion
  
  /**
    * The rules are processed in order. If there are multiple rules that match the line item, then the first rule to match is used to determine that Cost Category value. 
    */
  var Rules: CostCategoryRulesList
  
  /**
    *  The split charge rules that are used to allocate your charges between your Cost Category values. 
    */
  var SplitChargeRules: js.UndefOr[CostCategorySplitChargeRulesList] = js.undefined
}
object CostCategory {
  
  inline def apply(
    CostCategoryArn: Arn,
    EffectiveStart: ZonedDateTime,
    Name: CostCategoryName,
    RuleVersion: CostCategoryRuleVersion,
    Rules: CostCategoryRulesList
  ): CostCategory = {
    val __obj = js.Dynamic.literal(CostCategoryArn = CostCategoryArn.asInstanceOf[js.Any], EffectiveStart = EffectiveStart.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RuleVersion = RuleVersion.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CostCategory]
  }
  
  extension [Self <: CostCategory](x: Self) {
    
    inline def setCostCategoryArn(value: Arn): Self = StObject.set(x, "CostCategoryArn", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: CostCategoryValue): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    inline def setEffectiveEnd(value: ZonedDateTime): Self = StObject.set(x, "EffectiveEnd", value.asInstanceOf[js.Any])
    
    inline def setEffectiveEndUndefined: Self = StObject.set(x, "EffectiveEnd", js.undefined)
    
    inline def setEffectiveStart(value: ZonedDateTime): Self = StObject.set(x, "EffectiveStart", value.asInstanceOf[js.Any])
    
    inline def setName(value: CostCategoryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setProcessingStatus(value: CostCategoryProcessingStatusList): Self = StObject.set(x, "ProcessingStatus", value.asInstanceOf[js.Any])
    
    inline def setProcessingStatusUndefined: Self = StObject.set(x, "ProcessingStatus", js.undefined)
    
    inline def setProcessingStatusVarargs(value: CostCategoryProcessingStatus*): Self = StObject.set(x, "ProcessingStatus", js.Array(value*))
    
    inline def setRuleVersion(value: CostCategoryRuleVersion): Self = StObject.set(x, "RuleVersion", value.asInstanceOf[js.Any])
    
    inline def setRules(value: CostCategoryRulesList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: CostCategoryRule*): Self = StObject.set(x, "Rules", js.Array(value*))
    
    inline def setSplitChargeRules(value: CostCategorySplitChargeRulesList): Self = StObject.set(x, "SplitChargeRules", value.asInstanceOf[js.Any])
    
    inline def setSplitChargeRulesUndefined: Self = StObject.set(x, "SplitChargeRules", js.undefined)
    
    inline def setSplitChargeRulesVarargs(value: CostCategorySplitChargeRule*): Self = StObject.set(x, "SplitChargeRules", js.Array(value*))
  }
}
