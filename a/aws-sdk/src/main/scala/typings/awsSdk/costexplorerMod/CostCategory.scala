package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CostCategory extends StObject {
  
  /**
    *  The unique identifier for your Cost Category. 
    */
  var CostCategoryArn: Arn
  
  /**
    *  The Cost Category's effective end date.
    */
  var EffectiveEnd: js.UndefOr[ZonedDateTime] = js.undefined
  
  /**
    *  The Cost Category's effective start date.
    */
  var EffectiveStart: ZonedDateTime
  
  var Name: CostCategoryName
  
  /**
    *  The list of processing statuses for Cost Management products for a specific cost category. 
    */
  var ProcessingStatus: js.UndefOr[CostCategoryProcessingStatusList] = js.undefined
  
  var RuleVersion: CostCategoryRuleVersion
  
  /**
    *  Rules are processed in order. If there are multiple rules that match the line item, then the first rule to match is used to determine that Cost Category value. 
    */
  var Rules: CostCategoryRulesList
}
object CostCategory {
  
  @scala.inline
  def apply(
    CostCategoryArn: Arn,
    EffectiveStart: ZonedDateTime,
    Name: CostCategoryName,
    RuleVersion: CostCategoryRuleVersion,
    Rules: CostCategoryRulesList
  ): CostCategory = {
    val __obj = js.Dynamic.literal(CostCategoryArn = CostCategoryArn.asInstanceOf[js.Any], EffectiveStart = EffectiveStart.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RuleVersion = RuleVersion.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CostCategory]
  }
  
  @scala.inline
  implicit class CostCategoryMutableBuilder[Self <: CostCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCostCategoryArn(value: Arn): Self = StObject.set(x, "CostCategoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveEnd(value: ZonedDateTime): Self = StObject.set(x, "EffectiveEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveEndUndefined: Self = StObject.set(x, "EffectiveEnd", js.undefined)
    
    @scala.inline
    def setEffectiveStart(value: ZonedDateTime): Self = StObject.set(x, "EffectiveStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: CostCategoryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingStatus(value: CostCategoryProcessingStatusList): Self = StObject.set(x, "ProcessingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingStatusUndefined: Self = StObject.set(x, "ProcessingStatus", js.undefined)
    
    @scala.inline
    def setProcessingStatusVarargs(value: CostCategoryProcessingStatus*): Self = StObject.set(x, "ProcessingStatus", js.Array(value :_*))
    
    @scala.inline
    def setRuleVersion(value: CostCategoryRuleVersion): Self = StObject.set(x, "RuleVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRules(value: CostCategoryRulesList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: CostCategoryRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
